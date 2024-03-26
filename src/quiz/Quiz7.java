package quiz;

/* 
 * <형변환>
 * 다음 코드를 보고 주석에 예상결과를 작성하세요.
 * 값을 출력하지 말고 작성해보세요.
 * */
public class Quiz7 {
	public static void main(String[] args) {
		double d = 1.2;
		float f = 0.9f;

		int i = (int) d; // 1
		int i2 = (int) f; // 0
		int i3 = (int) d + (int) f; // 1
		int i4 = (int) (d + f); // 2

		System.out.println(i); 
		System.out.println(i2); 
		System.out.println(i3); 
		System.out.println(i4); 

	}
}
