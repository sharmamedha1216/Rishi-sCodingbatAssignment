import java.util.Scanner;


public class MirrorEndsCheck {
	
	public static void mirrorEnds(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the string");
		String input = scan.nextLine();
		
		//String input = "ASDBCDSA";
		//System.out.println(input.length());
		int count=0;
		String xstring = "";
		String temp = "";
		String ystring = "";
		for(int m=0; m<input.length(); m++){
			for(int i=xstring.length(); i<input.length()-1; i++ ){
				char x = input.charAt(i);
				xstring = xstring + x;
				break;
			}
			
			for(int j = input.length()-(1+ystring.length()); j>0; j--){
				char y = input.charAt(j);
				ystring = ystring+y;
				break;
			}
			if(xstring.equals(ystring)){
				//System.out.println(xstring);
				temp = xstring;
				count++;
			}
			else{
				break;
			}
		}
		
		System.out.println(temp +" is mirror end string with count "+count);
	}

}
