

import java.util.Scanner;

public class SellingTickets{
    public static void main(String[] args){
    	System.out.println("本次售票模拟共包含三个售票窗口，请您输入要出售的总票数：");
    	Scanner sc = new Scanner(System.in);
    	int i = sc.nextInt();
    	sc.close();
    	Trim.max_Length = String.valueOf(i).length();
    	Window.setTotal(i);
        Thread t1 = new Thread(new Window());
        Thread t2 = new Thread(new Window());
        Thread t3 = new Thread(new Window());
        t1.start();
        t2.start();
        t3.start();
        try {
        	t1.join();
        	t2.join();
        	t3.join();
        }catch(InterruptedException e) {
        	e.printStackTrace();
        }
        System.out.println("本次售票结束，再见！");
    }
}




