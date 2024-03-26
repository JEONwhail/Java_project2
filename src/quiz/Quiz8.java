package quiz;

/* 
 * <형변환>
 * 변수 두개를 선언해서 10과 2.0을 대입하고, 두 변수를 이용해서 사칙연산을 수행하세요.
 * 그리고 결과는 정수로 출력해주세요.
 * */
public class Quiz8 {
	public static void main(String[] args) {
		int i = 10;
		float f = 2.0f;
		
		int sum1 = ((int) (i + f));
		// 오른쪽에 있는 값은 int가 되어야 함.
		// 완쪽과 오른쪽을 값을 맞줘야함
		
		int sum3 = i + (int)f;		

	}
}
