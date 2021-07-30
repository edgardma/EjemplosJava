package pe.com.dyd.patrones.ejemplos.adapter;

import pe.com.dyd.patrones.ejemplos.adapter.impl.BankCreditRequest;
import pe.com.dyd.patrones.ejemplos.adapter.impl.BankCreditResponse;
import pe.com.dyd.patrones.ejemplos.adapter.impl.IBankAdapter;
import pe.com.dyd.patrones.ejemplos.adapter.impl.XBankCreditAdapter;
import pe.com.dyd.patrones.ejemplos.adapter.impl.YBankCreditAdapter;

public class AdapterMain {

	public static void main(String[] args) {
		BankCreditRequest request = new BankCreditRequest();
		request.setCustomer("Edgard Marquez");
		request.setAmount(1000);
		
		IBankAdapter xBank = new XBankCreditAdapter();
		BankCreditResponse xresponse = xBank.sendCreditRequest(request);
		System.out.println("XBank approved -> " + xresponse.isApproved() + "\n");
		
		IBankAdapter yBank = new YBankCreditAdapter();
		BankCreditResponse yresponse = yBank.sendCreditRequest(request);
		System.out.println("YBank approved -> " + yresponse.isApproved() + "\n");
		
		if(xresponse.isApproved()) {
			System.out.println("XBank aprobó su credito, felicitaciones!!!");
		} else if(yresponse.isApproved()) {
			System.out.println("YBank aprobó su credito, felicitaciones!!!");
		} else {
			System.out.println("Lo sentimos su credito no ha sido aprobado");
		}
	}

}
