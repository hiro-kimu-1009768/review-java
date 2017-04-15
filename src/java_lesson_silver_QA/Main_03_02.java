package java_lesson_silver_QA;

public class Main_03_02 {

	public static void main(String[] args) {
		Main_03_01 s = new Main_03_01(10);
		modify(s.num);
		System.out.println("基本型のstaticによる値渡しのnum: " + s.num);
		s.num = s.modify(s.num);
		System.out.println("基本型のstaticによる値渡しのnum: " + s.num);
		modify(s);
		System.out.println("参照型の非staticによる参照渡しのnum: " + s.num);
		s.num = s.modify(s);
		System.out.println("参照型の非staticによる参照渡しのnum: " + s.num);
		}

	private static void modify(int num){
		System.out.println("static 到達");
		num *= 2;
	}
	private static void modify(Main_03_01 s){
		System.out.println("staticのobj 到達");
		s.num *= 2;
	}



}
