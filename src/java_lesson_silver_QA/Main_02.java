package java_lesson_silver_QA;
//git third commit 変更有
//continue と break
//break は直近の繰り返し処理そのものを抜ける。
//
//continue は以降の処理を繰り返しの処理をスキップする。
public class Main_02 {

	public static void main(String[] args) {
		int num = 0;
		while(num < 7) {
			if (num ==3) {
				for (int num2 = 0; num2 < 4; num2++) {
					if (num2 == 2) {
						System.out.println("num: " + num + "　num2が2: " + num2);
						continue;
					}
					//下記分はnum2が2の時は実行されない。
					System.out.println("num: " + num + "　num2が2以外: " + num2);
				}

			} else if (num == 5) {
				for (int num3 = 0; num3 < 6; num3++) {
					if (num3 == 2) {
						System.out.println("num: " + num + "　num3が2: " + num3);
						break;
						//上記breakにより、for文自体を抜ける。
					}
					System.out.println("num: " + num + "　num3が2以外: " + num3);
				}
			}
		System.out.println("到達確認2: " + num);
		num++;
	}
}
}
