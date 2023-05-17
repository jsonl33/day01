package day01;

public class TestClass01 {
	public static void main(String[] args) {
		int hong, go, kim;
		hong = 20000;
		go = 30000; 
		kim = 50000;
		int sum1 = hong + go + kim;
		
		System.out.println("========================================");
		System.out.println("이름\t나이\t전화번호\t\t회비");
		System.out.println("========================================");
		System.out.println("홍길동\t\""+15+"\"\t"+3672+"-"+1234+"\t\\"+hong);
		System.out.println("고길동\t\""+15+"\"\t"+2238+"-"+1234+"\t\\"+go);
		System.out.println("김말이\t\""+15+"\"\t"+1234+"-"+1234+"\t\\"+kim);
		System.out.println("----------------------------------------");
		System.out.println("총합계\t\t\t\t\\"+sum1);
		System.out.println("----------------------------------------");
	}
}
