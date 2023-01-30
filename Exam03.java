//리턴(반환)타입

class Exam4 {
	public static void main(String[] args) {
		int i = 로봇.get정수();
		boolean b = 로봇.get논리();
		사람 a사람 = 로봇.get사람();
		사람 a사람2 = 로봇.get사람2();
		사람 a사람3 = 로봇.get사람3();
		사람 a사람4 = 로봇.get사람4();
		사람 a사람5 = 로봇.get사람5(123, false);
		로봇.get사람6(123, false);
	}
}

class 사람 {
	//사람5, 6에 사용
	int a;
	boolean b;
}

class 로봇 extends 사람 {
	// int i = 로봇.get정수();
	// 정수만 들어갈 수 있는 변수 i에 로봇클래스 내의 get정수 메소드의 값을 저장한다.
	// 새로운 객체를 만들어서 연결한 것이 아니기때문에 정적메소드(static)이다.
	static int get정수() { // 로봇클래스의 정수형 get정수 정적메소드이다.
		return 123; // 정수 123값을 반환하여 main메소드 안의 변수 i에 저장한다.
	}

	// boolean b = 로봇.get논리();
	// 참, 거짓 만 들어가는 변수 b에 로봇객체 내의 get논리 메소드 값을 저장한다.
	static boolean get논리() { // 로봇객체내의 불린형 get논리 정적메소드이다.
		return false; // 불린 거짓을 반환하여 main메소드 안의 변수 b에 저장한다.
	}

	// 사람 a사람 = 로봇.get사람();
	// 사람타입만 들어갈 수 있는 변수 a사람에 로봇객체 내의 get사람 메소드 값을 저장한다.
	static 사람 get사람() { // 로봇객체내의 사람형 get사람 정적메소드
		return null; // null을 반환한다.
	}

	// 사람 a사람2 = 로봇.get사람2();
	static 사람 get사람2() {
		사람 a사람 = null; // 사람타입의 a사람변수에 null값을 저장한다.
		return a사람; // 변수 a사람(null)을 반환한다.
	}
	
	// 사람 a사람3 = 로봇.get사람3();
	static 사람 get사람3() {
		return new 사람(); // 새로운 사람 객체를 생성하고 반환한다.
	}
	
	// 사람 a사람4 = 로봇.get사람4();
	static 사람 get사람4() {
		사람 a사람 = new 사람(); // 사람타입의 a사람변수에 새로운 사람객체를 만들어서 연결한다.
		return a사람; // 변수 a사람(객체)을 반환한다.
	}
	
	// 사람 a사람5 = 로봇.get사람5(123, false);
	// 사람타입의 변수 a사람5, 로봇객체 내의 get사람5(정수인자, 불린인자)
	static 사람 get사람5(int a, boolean b) {	//사람타입의 정적메소드 get사람5(매개변수a(정수), 매개변수b(불린)
		사람 a사람 = new 사람();	//사람타입만 들어가는 변수 a사람에 새로운 사람객체 생성하고 연결한다.
		a사람.a = a;	//a사람변수(리모콘)로 사람내의 정수형 변수a에 매개변수a의 값을 저장한다.
		a사람.b = b;	//a사람변수(리모콘)로 사람내의 불린형 변수b에 매개변수b의 값을 저장한다.
		return a사람; // 변수 a사람을 반환한다.
	}
	// 로봇.get사람6(123, false);
	// 값을 저장하기 위한 변수가 없으므로 void타입으로 생성, 리턴 x, 인자2개
	static void get사람6(int a, boolean b) {
		사람 a사람 = new 사람();
		a사람.a = a;
		a사람.b = b;
		//void타입이므로 메소드안의 작어비 끝나면 자동으로 종료, 리턴x
	}
}