package nestedclass;

public class ApplyPaymentSystem {

	public static void main(String[] args) {
		PaymentSystem pay = new PaymentSystem(PaymentType.CreditCard);
		pay.with();

	}

}
