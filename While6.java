class While6 {
  public static void main(String[] args) {
    int a[] = {10, 3, -1, 5, 20};
    int i = 0;
    while (i < 5) {
        if (a[i] < 0) {
            System.out.println("i=" + i + " の処理を中断 a[" + i + "]: " + a[i]);
            ++i;
            continue;
        }
        System.out.println("i=" + i + " の処理");
        ++i;
    }
  }
}
