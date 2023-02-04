//예외 처리 기법1 try catch
//상황 : 문자열을 정수로 변환할때 그 문자열이 정수이면 문제가 없다. 
// 하지만 변환했을때 글자가 있으면 정수타입이 아니므로 에러가 발생하면서
// 프로그램이 멈추게 된다.
// 이로인해 프로그램이 강제로 멈추는 것을 막기위해 여러 예외 처리 기법중
// 하나인 try_catch방법을 사용해보는 상황이다.

import java.util.Scanner;

public class try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String a = sc.nextLine();
			int b = 0;
			
			try {	//try안에서 작업이 진행될때 예외가 발생하지 않으면 catch 작동x
				b = Integer.parseInt(a);	//예외 발생 x
				System.out.printf("정수로 변환 완료 -> %d\n", b);
				
			}catch(NumberFormatException e){	//try에서 예외 발생 시 작동
				System.out.printf("글자가 포함되어 있습니다.\n->%s\n", a);
			}
		}
		
	}
}
