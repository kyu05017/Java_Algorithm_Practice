package src.main._1강;

public class _002_DataType_PrimitiveType {

	public static void main(String[] args){

		// 데이터 타입의 지역 변수와 전역변수
		class PrimitiveType {

			// 전역변수
			int a = 1;

			//생성자
			public PrimitiveType() {

			}

			public void solution01(){
				System.out.println("a 를 출력 :" + a);
				adder(a);
				System.out.println("adder 함수 결과물 출력 : " + a);
			}

			public void solution02(){
				int _a = 1;
				System.out.println("_a 를 출력 : " + _a);
				adder(_a);
				System.out.println("adder 함수 결과물 출력 : " + _a);
			}

			private void adder(int x){
				x++;
			}
		}
		// 중첩 클래스의 생성자를 type 이라는 변수명에 새로운 인스턴스 삽입.
		PrimitiveType type = new PrimitiveType();

		// 전역변수를 반환(return) 받지 않고 adder 시켰을 때,
		type.solution01();
		// 지역변수를 반환(return) 받지 않고 adder 시켰을 때,
		type.solution02();

		// 두함수 모두다 지역/전역 상관 없이 반환 값을 사용하지 않기 때문에, 선언된 값이 변하지 않음
	}
}
