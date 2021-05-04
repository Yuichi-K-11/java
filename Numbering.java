import java.util.Scanner;
/**
 * 数当てゲームです。
 */
public class Numbering {

	/**
	 * メインメソッド。
	 * @param args 引数
	 */
	public static void main(String[] args) {
		int answer;
		int input;
		int counter = 0;
		System.out.println("[数当てゲーム]");
		System.out.println("1～100の数を当てよう。");

		// 正答を決めます。
		answer = 1 + (int)(Math.random() * 100.0);
//		System.out.println("テスト用: 正答は " + answer);

		while(true) {
			counter ++;
			input = MySystem.in.getInt("数字を入力してください");

			if(input < answer) {
				System.out.println(input + "よりは大きい。");
			} else if(input > answer) {
				System.out.println(input + "よりは小さい。");
			} else {
				System.out.println("正解!");
				break;
			}
		}

		System.out.println("正解までに " + counter + "回かかりました。");
	}
}
