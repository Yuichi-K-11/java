import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        new Thread(new Runnable() { // ココ
            public void run(){
                System.out.print("Runnable.run");
            }
        }).start();
    }
}
