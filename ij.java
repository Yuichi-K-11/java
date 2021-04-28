public class ij{
  public static void main(String[] args){
    boolean b0, b1, b2, b3;
    int i=1, j=10;
    double di=2.5, dj=5.0;
    // 3 は 5 より小さいので false
    b0 = (5 < 3);
    // j は i より大きいので true
    b1 = (i<j);
    // dj*2 と j は等しいので true
    b2 = (j==(dj*2));
    // dj と di は等しくないので true、その true と false は等しくないので false
    b3 = ((di!=dj)==false);

    System.out.println("b0=" + b0 + ", b1=" + b1 + ", b2=" + b2 + ", b3=" + b3);
  }
}
