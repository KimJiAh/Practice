import java.util.*;

public class ResourceBundleTest {
	public static void main(String[] args) {
		String resourceName="Hello";
		ResourceBundle rb;
		
		rb=ResourceBundle.getBundle(resourceName);
		
	    rb = ResourceBundle.getBundle(resourceName, Locale.KOREA);
	    System.out.println("한국" + rb.getString("hi"));
	    System.out.println("한국" + rb.getString("bye"));
	    
	    rb = ResourceBundle.getBundle(resourceName, Locale.US); 
	    System.out.println("미국" + rb.getString("hi"));
	    System.out.println("미국" + rb.getString("bye"));
	}
}
