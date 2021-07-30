package pe.com.dyd.patrones.ejemplos.adapter.impl;

import pe.com.dyd.patrones.ejemplos.adapter.creditapi.bankx.XBankCreditApi;
import pe.com.dyd.patrones.ejemplos.adapter.creditapi.bankx.XBankCreditRequest;
import pe.com.dyd.patrones.ejemplos.adapter.creditapi.bankx.XBankCreditResponse;

public class XBankCreditAdapter implements IBankAdapter {

	@Override
	public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
		XBankCreditRequest xrequest = new XBankCreditRequest();
		
		xrequest.setCustomerName(request.getCustomer());
		xrequest.setRequestAmount(request.getAmount());
		
		XBankCreditApi api = new XBankCreditApi();
		XBankCreditResponse xresponse = api.sendCreditRequest(xrequest);
		
		BankCreditResponse response = new BankCreditResponse();
		response.setApproved(xresponse.isAproval());
		
		return response;
	}

}
