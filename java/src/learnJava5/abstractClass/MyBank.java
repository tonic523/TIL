package learnJava5.abstractClass;

public class MyBank extends Bank {
	public MyBank() {
		System.out.println("---mybank constructor---");
		
	}
	public MyBank(String name, int amount,int total_amount) {
		super(name,amount,total_amount);
		
	}
	@Override
	public void installmentSavings() {
		System.out.println("---installment Savings start----");
	}
	
	@Override
	public void canclelation() {
		System.out.println("---canclelation start----");
	}
}
