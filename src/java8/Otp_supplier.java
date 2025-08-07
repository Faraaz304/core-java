package java8;
import java.util.function.*;
public class Otp_supplier {
	public static void main(String[] args) {
		Supplier<String> otpgenerator = () ->{
			String otp = "";
			for(int i=0;i<6;i++) {
				otp +=(int)(Math.random()*10);
			}
			return otp;
		};
		Consumer<Integer> formating = c ->{
			System.out.println("Your otp is ");
			System.out.println(otpgenerator.get());
		};
		
		formating.accept(8);
		
		
		
		
		
 	}
	
	

}
