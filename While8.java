class While8 {
  public static void main(String[] args) {
    try {
    FileReader fr = new FileReader(new File("test.txt"));

    int ch = fr.read(); // 1文字読み込み
    while (ch != -1) { //読み込んだ文字があれば
        System.out.println((char)ch);
        ch = fr.read(); // 次の文字を読み込み
  }
        } catch (Exception e) {
            System.out.println(e);
        }
}
