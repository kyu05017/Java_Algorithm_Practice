package src.main._1강;

public class _003_DataType_ReferenceType {

	public static void main(String[] args){

		class ReferenceType {
			class Data{
				// 필드
				int a = 0;
				// 생성자
				public Data(){}
			}
			// 전역으로 데이터 중첩 클래스를 선언
			final Data data = new Data();
			// final 을 선언해도 data 변수의 값이 변할 수 있는 이유는 주소 값이기 때문.

			// 생성자
			public ReferenceType() {}

			// 메소드
			public void solution01(){
				System.out.println("Data 객체의 정수형 a 변수를 출력 : "+ data.a);
				adder(data);
				System.out.println("adder 함수의 결과물 출력 : "+ data.a);
			}

			private void adder(Data data){
				data.a += 1;
			}
		}
		ReferenceType type = new ReferenceType();

		type.solution01();
	}
}
