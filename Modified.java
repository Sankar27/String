
public class Modified {

	public static void main(String[] args) {
		
		String str = "Gowrisankar";
		System.out.println("Original :" + str);
		
		StringBuffer sb = new StringBuffer(str);
		sb.append(" " + ".C");
		System.out.println("Modified :" + sb + " " + "G" );
		
		

	}

}
