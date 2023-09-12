import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		while(true) { // "그만"이 입력될 때까지 반복
			System.out.print("나라 이름, 인구 >> ");
			
			String nationName = scanner.next(); //나라이름
			int population = scanner.nextInt(); //인구
			
			nations.put(nationName, population); // 나라이름, 인구 입력받은것을 HashMap에 추가
			
			if(nationName == "그만") {
				break;
			}
			
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			
		}
		
//		scanner.close();
	}

}
