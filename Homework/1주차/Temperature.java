import java.util.Scanner;

public class Temperature {
	
	public static double Fahrenheit(double Celsius) {
		return Celsius*(5/9)+32;
	}
	
	public static double Kelvin(double Celsius) {
		return Celsius+273.15;
	}
	
	public static double Lancy(double Celsius) {
		return (Celsius+273.15)*(5/9);
	}
	
	public static double Drill(double Celsius) {
		return (100-Celsius)*(3/2);
	}
	
	public static double Newton(double Celsius) {
		return Celsius*(33/100);
	}
	
	public static double Heat(double Celsius) {
		return Celsius*(4/5);
	}
	
	public static double Romerdo(double Celsius) {
		return Celsius*(21/40)+7.5;
	}
	
	public static double FahCel(double Fah) {
		return (Fah-32)*(5/9);
	}
	
	public static double KelCel(double Kel) {
		return Kel-273.15;
	}
	
	public static double LanCel(double Lan) {
		return (Lan-491.67)*(5/9);
	}
	
	public static double DriCel(double De) {
		return 100-De*32;
	}
	
	public static double NewCel(double N) {
		return N*(100/33);
	}
	
	public static double HeCel(double Re) {
		return Re*(5/4);
	}
	
	public static double ReCel(double Ro) {
		return (Ro-7.5)*(40/21);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("º¯È¯ÇÒ ¿ÂµµÀÇ Á¾·ù¿Í ¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä:");
		String name1=scanner.next();
		String name2=scanner.next();
		double t=scanner.nextDouble();
		
		if(name1.equals("¼·¾¾")) {
			if(name2.equals("È­¾¾")) {
				System.out.println(Fahrenheit(t));
			}
			
			else if(name2.equals("ÄÌºó")) {
				System.out.println(Kelvin(t));
			}
			else if(name2.equals("¶õ¾¾")) {
				System.out.println(Lancy(t));
			}
			else if(name2.equals("µå¸±µµ")) {
				System.out.println(Drill(t));
			}
			else if(name2.equals("´ºÅÏµµ")) {
				System.out.println(Newton(t));
			}
			else if(name2.equals("¿­¾¾")) {
				System.out.println(Heat(t));
			}
			else if(name2.equals("·Ú¸Óµµ")) {
				System.out.println(Romerdo(t));
			}
			else if(name2.equals("¼·¾¾")) {
				System.out.println(t);
			}
		}
		
		else {
			if(name1.equals("È­¾¾")) {
				System.out.println(FahCel(t));
			}
			else if(name1.equals("ÄÌºó")) {
				System.out.println(KelCel(t));
			}
			else if(name1.equals("¶õ¾¾")) {
				System.out.println(LanCel(t));
			}
			else if(name1.equals("µå¸±µµ")) {
				System.out.println(DriCel(t));
			}
			else if(name1.equals("´ºÅÏµµ")) {
				System.out.println(NewCel(t));
			}
			else if(name1.equals("¿­¾¾")) {
				System.out.println(HeCel(t));
			}
			else if(name1.equals("·Ú¸Óµµ")) {
				System.out.println(ReCel(t));
			}
			
		}
		scanner.close();
	}

}
