package week3.day1;

public class Calculater {

	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}

	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
		
	}
	
	public void mul(int num1,int num2) {
		System.out.println(num1*num2);
	}
	
	public void mul(int num1,double num2) {
		System.out.println(num1*num2);
	}
	
	public void sub(int num1,int num2) {
		System.out.println(num1-num2);
	}
	
	public void sub(double num1,double num2) {
		System.out.println(num1-num2);
	}
	
	public static void main(String[] args) {
		
		Calculater calc=new Calculater();
		calc.add(6, 7);
		calc.add(10, 11, 11);
		calc.mul(3, 4);
		calc.mul(5, 6.666666);
		calc.sub(17, 16);
		calc.sub(2.1234567, 1.987456);
		
	}


}
