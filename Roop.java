class Roop{

  public static void main(String args[]) {

  int i=0;
  // 前置判定
  while(i < 10) {
    // ループ回数により、出力されないこともある
    System.out.println( "前ループ" + i );
    i++;
  }
  int j=0;
  // 後置判定
  do {
     // ループ回数に関係なく、最低1回は出力される
     System.out.println( "後ループ" + j );
     j++;
  }while(j < 10);
  }

}
