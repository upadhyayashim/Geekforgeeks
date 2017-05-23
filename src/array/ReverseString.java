package array;

public class ReverseString {

	public String revers(String str){
		for(int i=0;i<str.length();i++){
			str=str.substring(1, str.length()-i)+str.charAt(0)+str.substring(str.length()-i);
			System.out.println(str); 
		}
		return str;
	}
	public static void main(String args[]) {
		
		ReverseString rs=new ReverseString();
		String s="ashim";
		String s1=rs.revers(s);
		System.out.println(s1);
	}
	
}
