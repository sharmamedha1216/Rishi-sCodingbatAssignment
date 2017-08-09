import java.util.Scanner;


public class SumNumberinString {
	
	public static void sumNumbers(){
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Input the string");
		String input = scan.nextLine();*/
		
		String input = "A12B22D58L";
		String intgr = "";
		int num = 0;
		int sum = 0;
		
		for(int i=0; i<input.length(); i++){
			char x= input.charAt(i);
			if(Character.isDigit(x)){
				intgr = intgr + x;
			}
			else{
				if(!intgr.isEmpty())
				{
					num = Integer.parseInt(intgr);
					intgr="";
				}
			}
			sum=sum+num;
			num=0;
		}
		System.out.println(sum);
	}

}
