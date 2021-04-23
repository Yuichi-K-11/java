import java.util.Scanner;

class zero {
  public static void main(String[] args){
      System.out.println("Q1?");
      Scanner scanner = new Scanner(System.in);
      System.out.println("数字を入力してください");
      int num = scanner.nextInt();
      scanner.close();
      if (num > 0) {
          System.out.println("positive");
      } else if (num < 0) {
          System.out.println("negative");
      } else {
          System.out.println("zero");
      }
  }

  private static void question2() {
       System.out.println("Q2?");
       Scanner scanner = new Scanner(System.in);
       System.out.println("数字を入力してください(絶対値）");
       int num = scanner.nextInt();
       scanner.close();
       num = Math.abs(num);
       System.out.println(num);
   }
}
