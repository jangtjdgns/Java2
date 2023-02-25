import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//예제 문제 풀어보기
//입력
//빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
//예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.

//출력
//만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
//줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		
		int count = 0;
		
		for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
			for (int j = 0; j < Integer.parseInt(arr[1]); j++) {
				for (int k = 0; k < Integer.parseInt(arr[2]); k++) {
					bw.write(i + " " + j + " " + k + "\n");
					count++;
				}
			}
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}

//BufferedReader 관련
//예외처리를 편하게 하기위해 throws IOException를 사용한다.
//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));				// 입력 선언
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));			// 출력 선언

//String str = bf.readLine();										// 라인단위로 입력받기(Enter를 경계로)
//String[] arr = str.split(" ");								// 데이터 가공 방법1 (split 사용)			다른 방법은 StringTokenizer
//int a = Integer.parseInt(bf.readLine());			// 정수형 입력시 형변환

//bw.write(str);	// 출력
//bw.newLine();		// 개행
//bw.flush();			// 남아있는 데이터 모두 출력
//bw.close();			// 스트림 닫기

//많은 양의 데이터를 사용할때 버퍼리더를 사용하는 것이
//스캐너를 사용하는 것보다 속도가 빠름
