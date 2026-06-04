package Java_trin;

interface PaymentMethed{
	 void MakePayment();
}
 
   
  class Phonpay implements PaymentMethed{
	@Override
	public void MakePayment() {
		System.out.println("MakePayment Phonpay ");
	}	
}
  class GooglePay implements PaymentMethed{
	public void MakePayment() {
		System.out.println("MakePayment Googlpay");
		
	}	
}
  class Paytem implements PaymentMethed{
	public void MakePayment() {
		System.out.println("MakePayment Paytem");
		
	}	
}
class payment{

	public static void main(String []args) {
		Paytem ph=new Paytem();
		GooglePay go=new GooglePay();
		Phonpay pa=new Phonpay();
		ph.MakePayment();
		go.MakePayment();
		pa.MakePayment();


	}

}
