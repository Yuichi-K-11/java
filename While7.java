class While7 {
  public static void main(String[] args) {
    int a[] = {10, 3, -1, 5, 20};
    int i = 0;
    do {
        if (a[i] < 0) {
            System.out.println("i=" + i + " の処理を中断 a[" + i + "]: " + a[i]);
            // この ++i を忘れると無限ループ
            ++i;
            continue;
        }
        // contiuneが走るとここはスキップされる
        System.out.println("i=" + i + " の処理");
        ++i;
    } while (i < 5);
  }
}
