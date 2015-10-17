import java.util.Scanner;

public class FooCorporation {
	public static void main(String [] args){
	
	double basePay = 0;
	double extraPay = 0;
	double hours = 0;
	double payment;
	Scanner user_input = new Scanner(System.in);
	
	System.out.println("Ingresa salario base:");
	basePay = user_input.nextDouble();
	System.out.println("Ingresa las horas de trabajo:");
	hours = user_input.nextDouble();
	
	if(hours>=60 && basePay<=8){
		System.out.println("Error");
	
	}
	else {
		if(hours>40){
			payment = (40*basePay) + ((hours-40)*1.5);
			System.out.println("El pago final es:" + payment);
		}
		else{
			payment = (hours*basePay);
			System.out.println("El pago final es:" + payment);
		}
	}

	
	}
}