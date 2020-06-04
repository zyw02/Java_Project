

public class Window implements Runnable{
	private static int originalID = 1;
    private static Integer total = 0;
    private int name = originalID++;
    
    public static void setTotal(int i) {
    	total = i;
    }
    public void run() {
    	while(total>0) {
            try{
                Thread.sleep((int)(Math.random()*1000));
            }catch(InterruptedException e){
                 e.printStackTrace();
            }
            synchronized(total) {
            	if(total > 0) {
            		System.out.println(name + "ºÅ´°¿ÚÂô³ö" + Trim.format(total) + "ºÅÆ±");
            		total--;
            	}
            }       
    	}
    } 
}
