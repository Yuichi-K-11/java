import java.io.*;
class Sample1
{
 public static void main(String[] args) throws IOException
 {
 // キーボード入力の準備
 BufferedReader br;
 br = new BufferedReader(new InputStreamReader(System.in));
 int i;
 System.out.println(“整数を入力してください。”);
 i=Integer.parseInt(br.readLine());
 // 入力された値を if 文で判断し、1 であればブロック内を処理する
 if(i==1)
{
 System.out.println(“１が入力されました。”);
 System.out.println(“１が選択されました。”);
}
System.out.println(“処理を終了します。”);
}
}
