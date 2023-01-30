//인터페이스
//추상클래스 100% == 인터페이스
//필수가 아님
//인터페이스는 다중상속이 가능하다

class 인터페이스 {
	public static void main(String[] args) {
		칼 a무기1 = new 칼();
		활 a무기2 = new 활();
		총 a무기3 = new 총();
		
		//무기타입의 무기들 배열을 선언하고, 새로운 무기배열객체를 만들어 연결한다. (길이는 3) 
		무기[] 무기들 = new 무기[3];
		무기들[0] = a무기1;		//무기들[0]에 a무기1(칼 객체) 저장
		무기들[1] = a무기2;		//무기들[1]에 a무기1(활 객체) 저장
		무기들[2] = a무기3;		//무기들[2]에 a무기1(총 객체) 저장
		
		//for문을 사용하여 무기들배열 길이까지 반복한다.
		for (int i = 0; i < 무기들.length; i++) {
			무기 a무기 = 무기들[i];	//무기 타입의 a무기변수에 무기들 배열에 각각 저장된 객체를 저장한다.
			a무기.작동();						//바로 a무기변수를 통해 무기 객체 안에있는 작동메소드를 실행시킨다.
			a무기.수리();
		}
	}
}

//인터페이스는 100% 추상클래스
//추상메소드는 오버라이드 필수
interface 무기 {
	void 작동();
	void 수리();
}
interface 무기2 {
	void 작동();
	void 수리();
}

//다중 상속이 가능하다
//인터페이스의 메소드를 상속받으면 오버라이드하기 위해서 public을 붙여주어야한다.
class 칼 implements 무기, 무기2 {
	public void 작동() {
		System.out.println("칼 공격");
	}
	public void 수리() {
		System.out.println("칼 수리");
	}
}

class 활 implements 무기, 무기2 {
	public void 작동() {
		System.out.println("활 공격");
	}
	public void 수리() {
		System.out.println("활 수리");
	}
}

class 총 implements 무기, 무기2 {
	public void 작동() {
		System.out.println("총 공격");
	}
	public void 수리() {
		System.out.println("총 수리");
	}
}