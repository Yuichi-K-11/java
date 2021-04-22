import java.util.Scanner;

class zero {
  public static void main(String[] args){
      System.out.println("Q?");
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
}
