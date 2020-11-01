package learnJava5.abstractClass;

public class MainClass {

	public static void main(String[] args) {
		Bank myBank = new MyBank("최우석", 500, 1500);
		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.canclelation();
		
		

	}

}
