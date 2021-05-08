class While3 {
  public static void main(String[] args) {
    int a[] = new int[10];
    int i = 0;
    while (i < 10) {
        a[i] = i * 10;
        ++i;
    }
    System.out.println("a[9]: " + a[9]);
  }
}
