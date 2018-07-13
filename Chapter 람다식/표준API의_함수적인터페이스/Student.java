package 표준API의_함수적인터페이스;

// 표준 API의 함수적 인터페이스
// Function 함수적 인터페이스
// Student 클래스

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() { return name; }
	public int getEnglishScore() { return englishScore; }
	public int getMathScore() { return mathScore; }
}


// 표준 API의 함수적 인터페이스
// PredicateExample 함수적 인터페이스
// Student 클래스

public class Student {
	private String name;
	private String sex;
	private int score;
	
	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	public String getSex() { return sex; }
	public int getScore( ) { return score; }
}