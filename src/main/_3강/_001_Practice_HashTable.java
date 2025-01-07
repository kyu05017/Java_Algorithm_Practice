package src.main._3강;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

class MyData{
	int v;

	public MyData(int v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "["+v+"]";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		MyData myData = (MyData) o;
		return v == myData.v;
	}
	// 해쉬 값으로 새로운 인스턴스라도 값을 찾는다.
	@Override
	public int hashCode() {
		return Objects.hashCode(v);
	}
}

public class _001_Practice_HashTable {

	public static void main(String[] args){

		// 1. 생성
		Map<String,Integer> map = new Hashtable<>();
		Map<String,Integer> map2 = new HashMap<>();
		Map<String,Integer> map3 = new ConcurrentHashMap<>();

		method01(map);
		method01(map2);
		method01(map3);

		// 2. 커스텀 클래스을 키값으로
		Map<MyData,Integer> map4 = new ConcurrentHashMap<>();

		map4.put(new MyData(1),1);
		map4.put(new MyData(2),2);
		map4.put(new MyData(3),3);

		System.out.println(map4);
	}

	static void method01(Map<String,Integer> map){

		// 2-1. 단순출력
		// result : {}
		System.out.println(map);

		// 3. 삽입 : put(key,value)
		map.put("A",1);
		map.put("B",2);

		// 2-2. 단순출력
		// result : {A=1,B=2}
		System.out.println(map);

		// 3. 꺼내오기 get(key) : 1
		System.out.println(map.get("A"));

		// 3-1. 없는 값 꺼내오기 get(key) : null
		System.out.println(map.get("C"));

		// 3-2. 없는 값 꺼내오기 getOrDefault(key,value): null
		System.out.println(map.getOrDefault("C",-1));

		// 4. 삽입 putIfAbsent(key,value)
		map.putIfAbsent("A",2);
		System.out.println(map.get("A"));

		// 5. 삭제 remove(key)
		map.remove("A");
		System.out.println(map);

		// 5-1. 삭제2 remove(key,value)
		System.out.println("삭제되었나요 ? : "+map.remove("C",1));

		// 6. 수정 replace(key,value)
		map.replace("B",5);
		System.out.println(map);

		// 6-1. 수정2 replace(key,oldValue,newValue)
		System.out.println("수정되었나요 ? : "+map.replace("B",1,5));

		// 7. 값만 뽑기
		System.out.println(map.values());

		// 8. 키 만뽑기
		System.out.println(map.keySet());

		// 9. 비어있는지 유무
		System.out.println("비어있나요 ? : "+map.isEmpty());

		// 10. 크기 알아보기
		System.out.println(map.size());

		// 11. 포함되어 있는지 체크 하기
		System.out.println("D키가 포함 되었나요 ? : "+map.containsKey("D"));
		System.out.println("1값이 포함 되었나요 ? : "+map.containsValue(1));
	}
}
