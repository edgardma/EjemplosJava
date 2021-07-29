package pe.com.dyd.patrones.ejemplos.adapter.creditapi.bankx;

public class XBankCreditApi {
	public XBankCreditResponse sendCreditRequest(XBankCreditRequest request) {
		XBankCreditResponse response = new XBankCreditResponse();
		
		if(request.getRequestAmount() <= 5000) {
			response.setAproval(true);
		} else {
			response.setAproval(false);
		}
		
		return response;
	}
}
