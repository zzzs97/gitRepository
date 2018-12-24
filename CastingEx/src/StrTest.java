
public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		concat
		
		//문자열 : 어떤 다른 내용들과 합쳐져도 영향을 주지 않아야 한다.
		//문자열 + any type -> 문자열 + 문자열 -> 문자열
		//any type + 문자열 -> 문자열 + 문자열 -> 문자열
		//기초값: null;		
		String str = "";
		String name = "";
		
		//문자형
		char ch = ' ';
		
		str = "Ja" + "va";
		name = str + 8.0;
		
		System.out.println("str : " + str);
		System.out.println("name : " + name);
		
		String string = "";
		
		String = 7 + " " + true;

	}

}
