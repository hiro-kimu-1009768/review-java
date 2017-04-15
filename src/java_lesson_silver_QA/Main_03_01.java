package java_lesson_silver_QA;
//参照渡しと値渡し　staticと非static
public class Main_03_01 {
	int num;
	public Main_03_01(int num){
		this.num = num;
	}
	protected int modify(int num){
		System.out.println("非static 到達");
		num *= 2;
		return num;
	}
	protected int modify(Main_03_01 s){
		System.out.println("非staticのobj 到達");
		s.num *= 2;
		return s.num;
	}

}
