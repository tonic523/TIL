package learnJava5.abstractClass;

public abstract class Bank {
	public String name;
	public int amount;
	public int total_amount;
	
	public Bank() {
		System.out.println("----bank constructor");
	}
	public Bank(String name, int amount, int total_amount) {
		System.out.println("----bank constructor");
		this.name = name;
		this.amount = amount;
		this.total_amount = total_amount;
	}
	public void deposit() {
		System.out.println("----deposit----");
	}
	public void withdraw() {
		System.out.println("---withdraw---");
	}
	public abstract void installmentSavings();
	public abstract void canclelation();
}
