import java.util.Scanner;


public class MaxBlockCheck {
	public static void maxBlock(){
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Input the string");
		String input = scan.nextLine();*/
		
		String input = "ASAACCCCA";
		int count; int oldcount=0;int maxcount=0;
		for(int i=0; i<input.length(); i++) {
			char x = input.charAt(i);
			count=1;
			for(int j=i+1;j<input.length(); j++){
				char y = input.charAt(j);
				if(x==y){
					count++;
				}
				oldcount=count;
			}
			if(oldcount > maxcount){
				maxcount=oldcount;
			}
		}
		System.out.println(maxcount);
	}

}
