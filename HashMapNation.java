import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		while(true) { // "�׸�"�� �Էµ� ������ �ݺ�
			System.out.print("���� �̸�, �α� >> ");
			
			String nationName = scanner.next(); //�����̸�
			int population = scanner.nextInt(); //�α�
			
			nations.put(nationName, population); // �����̸�, �α� �Է¹������� HashMap�� �߰�
			
			if(nationName == "�׸�") {
				break;
			}
			
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			
		}
		
//		scanner.close();
	}

}
