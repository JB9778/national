import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		String stop = "�׸�";
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		while(true) { // "�׸�"�� �Էµ� ������ �ݺ�
			if(nations.containsKey("�׸�")) {
				break;
			}
			System.out.print("���� �̸�, �α� >> ");
			
			
			String nationName = scanner.next(); //�����̸�
			int population = scanner.nextInt(); //�α�
			
			nations.put(nationName, population); // �����̸�, �α� �Է¹������� HashMap�� �߰�
			
			
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			
			String nationName = scanner.next();
			if(nationName == "�׸�") {
				break;
			}
			
			if(nations.containsKey(nationName)) {
				System.out.println(nationName + "�� �α����� "+nations.get(nationName)+"�� �Դϴ�.");
			}else {
				System.out.println(nationName + "�̶�� ����� ������� �ʽ��ϴ�. ");
			}
			
			
		}
		
		scanner.close();
	}

}
