package nestedclass;

public class PaymentSystem {
	
	public PaymentType paymentType;
	
	public PaymentSystem() {}
    public PaymentSystem(PaymentType paymentType) {
    	this.paymentType = paymentType;
    }
	public void with() {
		System.out.println("Processing payment.......");
		switch(paymentType) {
			case Cash:
				PayByCash.acceptPaymentWithCash();
				break;
			case CreditCard:
				PayByCreditCard.acceptPaymentWithCreditCard();
				break;
			case Crypto:
				PayByCrypto.acceptPaymentWithCrypto();
				break;		
			default:
				System.out.println("please pay by cash or credit card or crypto, no other payment method is available ");
			}
		
	}
	
	private static class PayByCash{
		
		private static void acceptPaymentWithCash() {
			System.out.println("Please process cash payment");
		}
	}
	
    private static class PayByCreditCard{
		
		private static void acceptPaymentWithCreditCard() {
			System.out.println("Please process credit card payment");
		}
		
	}
    
    private static class PayByCrypto{
		
		private static void acceptPaymentWithCrypto() {
			System.out.println("Please process Bitcoin payment");
		}
	}
	
}
