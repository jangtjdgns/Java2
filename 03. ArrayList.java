//ArrayList 선언, 값 추가, 값 변경, 
//생성자

import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		exam();
	}

	static void exam() {
		System.out.println("== 예제 4 ==");
		// Article객체로 선언
		ArrayList<Article> articles = new ArrayList<>();
		// add 값 추가
		// .add(새로운 Article 객체를 생성하자마자 생성자 실행)
		System.out.println("값 추가");
		articles.add(new Article()); // 0
		articles.add(new Article()); // 1
		articles.add(new Article()); // 2
		articles.add(new Article()); // 3

		// articles.size() -> articles의 크기
		for (int i = 0; i < articles.size(); i++) {
			// articles.get(0) -> 값 출력
			Article article = articles.get(i);
			System.out.println(article.id);
		}

		// set 값 변경
		System.out.println("\n값 변경");
		articles.set(1, new Article()); // 2번(1)에 저장되어있는 2의 값을 4로 변경
		for (int j = 0; j < articles.size(); j++) {
			Article article = articles.get(j);
			System.out.println(article.id);
		}

		// remove 값 삭제
		System.out.println("\n값 삭제");
		articles.remove(1); // 2번(1) 삭제
		for (int s = 0; s < articles.size(); s++) {
			Article article = articles.get(s);
			System.out.println(article.id);
		}

		// contains -> 값이 있는지의 여부만 파악
		// article.contains(0); -> 값이 있으면 true, 없으면 false
		// indexOf -> 값의 위치 index를 찾아줌, 값이 없으면 -1출력
		// article.indexOf(0) - > 값이 있으면 1, 없으면 -1
	}
}

class Article {
	static int lastId; // 0
	int id;
	String regDate;

	static {
		lastId = 0;
	}

	Article() {
		this(lastId + 1, "2020-12-12 12:12:12");
		lastId++;
	}

	Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}