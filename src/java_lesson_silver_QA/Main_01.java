package java_lesson_silver_QA;
//多次元配列の要素を抽出したい。git変更確認
public class Main_01 {

	public static void main(String[] args) {
		int[][] array = { {1,2,3} , {4,5,6,7}};
		for (int[] a : array) {
		//	System.out.println("二次元目a： " + a);
		}
		for (int[] b : array) {
		//	System.out.println("二次元目b： " + b[0]);
		}
		for (int i=0; i<2;i++) {
			//System.out.print("二次元目： ");
			for (int j=0;j<3;j++){
		//		System.out.print(array[i][j]);
			}
		}
		//System.out.println();
		//下記のやり方で抽出可能(1次元目と2次元目の各要素数が違っても大丈夫)
		for (int[] b : array) {
		//	System.out.println("1次元目：" + b);
		//上記bは1次元目の要素つまり参照アドレスになる。
			//for(int c :b) {
			for (int c=b.length -1 ; c>=0; c--)	{
		//上記cは2次元目の要素つまり2次元目の値となる。
				System.out.print(b[c]);
			}
		}
	}

}
