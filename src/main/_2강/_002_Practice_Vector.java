package src.main._2강;

import java.util.List;
import java.util.Vector;

public class _002_Practice_Vector {

	public static void main(String[] args){

		// 인터페이스로 인스턴스를 주입 받으면 해당 인터페이스를 Implement 하고 있는 클래스들은 모두 사용이 가능하다.
		// 다향성이 가능
		List<MyData> list = new Vector<>();

		list.add(MyData.create(1));
		list.add(MyData.create(3));
		list.add(MyData.create(5));

		method1(list);
	}

	static void method1(List<?> list){
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}
}
