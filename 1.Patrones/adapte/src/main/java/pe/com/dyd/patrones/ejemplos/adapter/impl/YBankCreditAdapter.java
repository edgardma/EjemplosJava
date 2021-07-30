package pe.com.dyd.patrones.ejemplos.adapter.impl;

import pe.com.dyd.patrones.ejemplos.adapter.creditapi.banky.YBankCreditApprove;
import pe.com.dyd.patrones.ejemplos.adapter.creditapi.banky.YBankCreditApproveResult;
import pe.com.dyd.patrones.ejemplos.adapter.creditapi.banky.YBankCreditSender;
import pe.com.dyd.patrones.ejemplos.adapter.creditapi.banky.YBankCreditSenderListener;

public class YBankCreditAdapter implements IBankAdapter, YBankCreditSenderListener {
	private YBankCreditApproveResult yresponse;

	@Override
	public void notifyCreditResult(YBankCreditApproveResult result) {
		this.yresponse = result;
	}

	@Override
	public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
		YBankCreditApprove yrequest = new YBankCreditApprove();
		yrequest.setCredit((float)request.getAmount());
		yrequest.setName(request.getCustomer());
		
		YBankCreditSender sender = new YBankCreditSender();
		sender.sendCreditForValidate(yrequest, this);
		
		do {
			try {
				Thread.sleep(10000);
				System.out.println("YBank peticion en espera...");
			} catch(Exception e) {
				e.printStackTrace();
			}
		} while(yresponse == null);
		
		BankCreditResponse response = new BankCreditResponse();
		response.setApproved(yresponse.getApproved() == "Y" ? true : false);
		
		return response;
	}
	
}
