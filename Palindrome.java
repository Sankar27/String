
public class Palindrome {

	public static void main(String[] args) {
		
		String str = "varoon";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String data = sb.toString();
		
		if(str.equals(data)){
			System.out.println("Given String Is Palindrome");
		}else{
			System.out.println("Given String Is Not Palindrome");
		}

	}

}
