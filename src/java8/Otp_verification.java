package java8;
import java.util.function.*;
import java.util.*;
public class Otp_verification {
	public static void main(String[] args) {
		Supplier<String> otpsupplier = () ->{
			String otp = "";
			for(int i=0;i<6;i++) {
				otp +=(int)(Math.random()*10);
			}
			return otp;
		};
		
		String generated_otp = otpsupplier.get();

		
//		Function<String ,Integer> converter = s -> Integer.parseInt(s);
		
//		Predicate<Integer> checking_otp = i -> i == converter.apply(generated_otp);
		Predicate<String>  checking_otp = i -> i.equals(generated_otp);
		
		Consumer<Boolean> message = result->{
			if(result)  System.out.println(" OTP Verified Successfully!");
			else  System.out.println("wrong OTP");
		};
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("otp is " +generated_otp);
		System.out.println("enter your otp");
		String userinput =in.next();
		
		
		message.accept(checking_otp.test(userinput));
		
	
		

		
	}

}
