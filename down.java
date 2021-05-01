class Down{
  public static void main(String[] args){
    int num = 6;

    do{
      System.out.println("num = " + num);
      num -= 2;

      if (num < 0){
        break;
      }
    }while (true);
  }
}
