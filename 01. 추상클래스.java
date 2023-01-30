//추상클래스
//추상메소드를 상속받았으면 구상메소드는 필수가됨
//추상클래스, 추상메서드는 필수가 아님
//사용이유 : 표준이되는 클래스안의 메소드가 불필요하게 사용되는 것을 막기위함
class 추상클래스{
	public static void main(String[] args) {
		칼 a무기1 = new 칼();
		활 a무기2 = new 활();
		총 a무기3 = new 총();
		
		무기[] 무기들 = new 무기[3];
		무기들[0] = a무기1;
		무기들[1] = a무기2;
		무기들[2] = a무기3;
		
		for(int i = 0; i < 무기들.length; i++) {
			무기 a무기 = 무기들[i];
			a무기.작동();
		}
	}
}

//클래스 앞에 abstract(추상)이 붙으면, 메서드 앞에도 반드시 붙어야함
abstract class 무기{abstract void 작동();}		//추상클래스, 추상메소드

class 칼 extends 무기{void 작동() {System.out.println("칼 작동");}}	//구상메소드
class 활 extends 무기{void 작동() {System.out.println("활 작동");}}	//구상메소드
class 총 extends 무기{void 작동() {System.out.println("총 작동");}}	//구상메소드