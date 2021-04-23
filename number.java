import java.util.Scanner;

class number {

  public static void main(String[] args){
      System.out.println("Q2?");
      Scanner scanner = new Scanner(System.in);
      System.out.println("数字を入力してください");
      int num = scanner.nextInt();
      scanner.close();
      //入力された数字から1ずつ減らす
      for (int i = 0; i < num; num--) {
          System.out.println(num);
      }
  }
}
