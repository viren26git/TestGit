package summer.batch1.core;

public class StringImmutable {

	    public static void main(String[] args)
	    {
	        String s1 = new String("JAVA");
	 
	        System.out.println(s1);         //Output : JAVA
	 
	        s1.concat("J2EE");
	 
	        System.out.println(s1);         //Output : JAVA
	    }
}
