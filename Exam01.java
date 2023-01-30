//생성자 사용x

class Exam1 {
	public static void main(String[] args) {
		사람 a김철수 = new 사람();
		a김철수.이름 = "김철수";
		a김철수.전화번호 = "010-1234-1234";
		a김철수.a좋아하는_음식점 = new 영화반점();
		a김철수.선호하는_음식의_매운정도 = "매운";
		a김철수.선호하는_음식 = "짬뽕";

		사람 a김영희 = new 사람();
		a김영희.이름 = "김영희";
		a김영희.전화번호 = "010-4321-4321";
		a김영희.a좋아하는_음식점 = new 북경반점();
		a김영희.선호하는_음식의_매운정도 = "안매운";
		a김영희.선호하는_음식 = "짬뽕";

		a김철수.배달_음식_주문하다();
		// 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.

		a김영희.배달_음식_주문하다();
		// 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.

		a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점;
		a김영희.선호하는_음식의_매운정도 = "아주 매운";
		a김영희.선호하는_음식 = "짜장";

		a김영희.배달_음식_주문하다();
		// 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다.
	}
}

class 사람 {
	String 이름;
	String 전화번호;
	음식점 a좋아하는_음식점;
	String 선호하는_음식의_매운정도;
	String 선호하는_음식;

	void 배달_음식_주문하다() {
		a좋아하는_음식점.가게(this.이름, this.전화번호, this.선호하는_음식의_매운정도, this.선호하는_음식);
	}
}

class 음식점 {
	void 가게(String b, String c, String d, String e) {

	}
}

class 영화반점 extends 음식점 {
	void 가게(String a, String b, String c, String d) {
		System.out.printf("영화반점에서 %s(%s)에게 %s %s(을)를 배달합니다.\n", a, b, c, d);
	}
}

class 북경반점 extends 음식점{
	void 가게(String a, String b, String c, String d) {
		System.out.printf("북경반점에서 %s(%s)에게 %s %s(을)를 배달합니다.\n", a, b, c, d);
	}
}