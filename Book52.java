
public class Book52 {
	String title;
	String author;
	
	void show() { System.out.println(title + "" + author);}
	
	public Book52() {
		this("", "");
		System.out.println("생성자 호출됨");
		
	}
	
	public Book52(String title) {
		this(title, " 작자미상");
	}
	
	public Book52(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		Book52 littlePrince = new Book52("어린왕자", "생택쥐페리");
		Book52 loveStory = new Book52("춘향전");
		Book52 emptyBook = new Book52();
		loveStory.show();
	}

}
