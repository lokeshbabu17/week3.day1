package week3.day1;

public class BankInfo {
	public  void saving() {
		System.out.println("savings is 66%");

	}
	public void fixed() {
		System.out.println("fiixed is 77%");

	}
public void deposit() {
	System.out.println("deposite is 10% ");

}
public static void main(String[] args) {
	BankInfo bank=new BankInfo();
	bank.deposit();
	bank.fixed();
	bank.saving(); 
}
}


