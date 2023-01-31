
public class Exam2 {
	public static void main(String[] args) {
		Article[] articles = new Article[10];
		// 프로그램을 실행하자마자 lastId에 0을 저장한다.
		// Article타입의 articles배열에 새로운 Article객체가 연결될 방 10개를 생성하고 연결한다.

		// 반복
		// articles배열 1번방에 새로운 Article객체를 생성하고 연결한다.
		// 새로운 객체가 생성되는 동시에 Article클래스의 생성자가 실행된다
		// 인자가 없으므로 매개변수가 없는 생성자가 실행된다.
		// 매개변수가 없는 생성자는 this.(lastId + 1, 문자열) 생성자
		// 즉 생성자에 인자를 추가하여 매개변수가 있는 생성자를 실행한다.
		// 매개변수가 있는 생성자는 본인 객체의 id변수에 인자의 값(lastId+1 == 1)의 값을 저장하고,
		// regDate에는 매개변수가 있는 생성자를 실행시킬때 지정했던 문자열대이터의 값이 저장된다.
		// 그후 작업이 끝나면 다시 매개변수가 없는 생성자로 리턴되어 lastId++가 실행되면서 1증가한다.
		// 반복

		articles[0] = new Article();
		articles[1] = new Article();
		articles[2] = new Article();

		System.out.println(articles[0].id);
		System.out.println(articles[1].id);
		System.out.println(articles[2].id);
	}
}

class Article {
	static int lastId;
	int id;
	String regDate;

	// static 전용생성자
	static {
		lastId = 0;
	}

	Article() {
		this(lastId + 1, "2023-12-12 12:12:12");
		lastId++;
	}

	Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}