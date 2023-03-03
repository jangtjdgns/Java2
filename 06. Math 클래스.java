//Java math 클래스 사용해보기

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = 0;

			System.out.println("1. 두 개의 숫자 중 큰 값"); // Math.max(a, b);
			System.out.println("2. 두 개의 숫자 중 작은 값"); // Math.min(a, b);
			System.out.println("3. a의 b승 값 (a^b)"); // Math.pow(a, b);
			System.out.println("4. z의 제곱근"); // Math.sqrt(z);
			System.out.println("5. z의 절대값"); // Math.abs(z);
			System.out.println("6. 0 ~ a 사이의 난수생성"); // (int) (Math.random() * a + 1)
			System.out.println("7. 소수점 올림"); // Math.ceil(z);
			System.out.println("8. 소수점 내림"); // Math.floor(z);
			System.out.println("9. 소수점 반올림"); // Math.round(z);
			System.out.println("종료 : 0");

			num = sc.nextInt();
			number.num(num, sc);

			if (num == 0) {
				break;
			}
		}
		System.out.println("종료");
	}
}

class number {
	static void num(int num, Scanner sc) {
		int x = 0;
		int y = 0;
		double z = 0.0;

		switch (num) {
		case 1:
			System.out.println("x, y 중 더 큰 값을 반환");
			System.out.printf("x : ");
			x = sc.nextInt();
			System.out.printf("y : ");
			y = sc.nextInt();
			System.out.printf("큰 수 : %d\n", Math.max(x, y));
			break;
		case 2:
			System.out.println("x, y 중 더 작은 값을 반환");
			System.out.printf("x : ");
			x = sc.nextInt();
			System.out.printf("y : ");
			y = sc.nextInt();
			System.out.printf("작은 수 : %d\n", Math.min(x, y));
			break;
		case 3:
			System.out.println("a의 b승값 반환 (a^b)");
			System.out.printf("a : ");
			x = sc.nextInt();
			System.out.printf("b : ");
			y = sc.nextInt();
			System.out.printf("a^b : %d\n", (int) Math.pow(x, y));
			break;
		case 4:
			System.out.println("z의 제곱근을 반환");
			System.out.printf("z : ");
			z = sc.nextDouble();
			System.out.printf("z의 제곱근 : %.4f\n", Math.sqrt(z));
			break;
		case 5:
			System.out.println("z의 절대값을 반환");
			System.out.printf("z : ");
			z = sc.nextDouble();
			System.out.printf("z의 절대값 : %.4f\n", Math.abs(z));
			break;
		case 6:
			System.out.println("0 ~ a 사이의 난수를 생성");
			System.out.println("범위 : 0 <= a");
			System.out.printf("a : ");
			int rNum = sc.nextInt();
			System.out.println("0 ~ " + rNum + "사이의 난수 생성");
			System.out.printf("난수 : %d\n", (int) (Math.random() * (rNum + 1)));
			break;
		case 7:
			System.out.println("소수점 올림, 일의 자리만 입력");
			System.out.printf("z : ");
			z = sc.nextDouble();
			System.out.printf("%.1f의 올림 값 : %.1f\n", z, Math.ceil(z));
			break;
		case 8:
			System.out.println("소수점 내림, 일의 자리만 입력");
			System.out.printf("z : ");
			z = sc.nextDouble();
			System.out.printf("%.1f의 내림 값 : %.1f\n", z, Math.floor(z));
			break;
		case 9:
			System.out.println("소수점 반올림, 일의 자리만 입력");
			System.out.printf("z : ");
			z = sc.nextDouble();
			System.out.printf("%.1f의 반올림 값 : %d\n", z, Math.round(z));
			break;
		}
		System.out.println();
		System.out.println("========================================================");
		System.out.println();
	}
}