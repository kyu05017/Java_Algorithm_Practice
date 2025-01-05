package src.main._2강;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

class MyData{
	int value;

	public MyData(int value){
		this.value = value;
	}

	static MyData create(int v){
		return new MyData(v);
	}

	@Override
	public String toString(){
		return String.valueOf(value);
	}

	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		MyData myData = (MyData)o;
		return value == myData.value;
	}

	@Override
	public int hashCode(){
		return Objects.hash(value);
	}
}

@SuppressWarnings("all")
public class _001_Practice_LinkedList {

	public static void main(String[] args){

		// 1. 선언하기
		List<Integer> list = new LinkedList<>();

		// 2. 삽입하기
		//  가장 마지막에 새로운 요소를 연결한다.
		list.add(1);
		list.add(2);
		list.add(3);

		// 3. 중간에 값 삽입하기
		// index 자리에, element 를 추가
		list.add(1,5);

		// 4. 삭제하기
		list.remove(2);

		// 5. 가져오기
		list.get(2);

		// 6.Linked List 는 출력시 ToString()이 선언 되어있기 때문에 요소가 출력된다.
		System.out.println("1번 리스트 전체 출력 : "+list);

		// 7. contains 값이 있는지 찾아보기
		// 인자로는 (Object e) Reference 타입을 받지만
		// Primitive 원시을 사용할 경우
		// 자동으로 박싱해서 Reference 타입으로 사용된다
		// 반환 값은 boolean
		System.out.println("1번 리스트에 [5]가 포함되어 있는지 ? :"+list.contains(5) + "\n");

		// 생성한 객체를 제네릭으로 가지는 LinkedList

		// 1. 선언하기 new
		List<MyData> list_2 = new LinkedList<>();

		// 2. 삽입하기 add
		list_2.add(MyData.create(1));
		list_2.add(MyData.create(2));
		list_2.add(MyData.create(3));

		// 3. 출력 toString
		// 각 객체가 가지는 레퍼런스 주소 값이 나온다.
		// 각 객체가 가지는 값을 출력하려면
		// Object 클래스의 toString 메서드를 Override 해서 재구현 하면 된다.
		System.out.println(list_2);

		// 5. 찾아보기
		// contains 메서드를 사용하면 찾고자 하는 요소가 리스트의 다른 오브젝트로 지정이 되어있기 때문에
		// 같은 값이 있는 것을 알더라도 결과값은 false 거짓으로 나오게 된다.
		// Object 클래스의 equals 메서드를 Override 재구현 해서 사용하면 된다.
		System.out.println(
				list_2.contains(
					MyData.create(2) // 직접 구현한 객체는 Reference 타입으로 박싱이 안됨으로 객체를 생성 후 삽입
				)
		);

		// 6. element()
		// 잘사용되지는 않지만 첫번째 요소를 가져온다.
		System.out.println(((LinkedList<MyData>) list_2).element());

		// 7. 요소의 인덱스 찾기 indexOf()
		// 리스트의 시작부터 해당 요소가 있는곳 까지 찾아간다.
		System.out.println(
				list_2.indexOf(
						MyData.create(2)
				)
		);

		// 8. 뒤에서 부터 인자 찾기 lastIndexOf()
		// 리스트의 가장 마지막 부터 인자로 받은 요소를 순차적으로 찾아간다.
		System.out.println(
				list_2.lastIndexOf(
						MyData.create(5)
				)
		);

		// 9. 순회하기 listIterator
		// listIterator 로 반환하여 순회 할수 있음.
		ListIterator<MyData> listIterator = list_2.listIterator();
		String outPrint = "listIterator : [ ";
		while(listIterator.hasNext()){
			outPrint += listIterator.next() + ", ";
		}
		outPrint += " ]";
		System.out.println(outPrint);

		// 10 순회하기 listIterator(int idx)
		// 위와 같지만 인덱스 까지만 순회 한다.
		ListIterator<Integer> listIterator2 = list.listIterator(3);
		String outPrint2 = "listIterator2 : [ ";
		while(listIterator2.hasNext()){
			outPrint2 += listIterator2.next() + ", ";
		}
		outPrint2 += " ]";
		System.out.println(outPrint2);
	}
}
