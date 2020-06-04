

public class Trim {
	public static int max_Length;
	public static String format(int k){
		int len = String.valueOf(k).length();
        String a = "";
        a = a + k;
        for(int i = 0; i < max_Length - len; i++) {
        	a = "0" + a; 
        }
        return a;
    }
}
