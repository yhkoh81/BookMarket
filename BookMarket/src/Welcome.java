import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까?");
		String userName = input.next();
		
		System.out.println("연락처를 입력하세요.");
		int useMobile = input.nextInt();
		
		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";
		
		System.out.println("*****************************************");
		System.out.println(" 1. 고객 정보 확인하기 \t 4 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t 5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t 6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t 8. 종료");
		System.out.println("*****************************************");
		System.out.print("메뉴 번호를 선택해주세요.");
		int n = input.nextInt();
//		System.out.println(n + "번을 선택했습니다.");
		
		if (n < 1 || n > 8) {
			System.out.println("1부터 8까지의 숫자 중 하나를 입력하세요.");
		}
		else {
			switch(n) {
			case 1:
				System.out.println("현재 고객 정보: ");
				break;
			case 2:
				System.out.println("장바구니 상품 목록 보기 :");
				break;
			case 3:
				System.out.println("장바구니 비우");
				break;
			case 4:
				System.out.println("장바구니에 항목 추가하기 :");
				break;
			case 5:
				System.out.println("5. 장바구니의 항목 수량 줄이");
				break;
			case 6:
				System.out.println("6. 장바구니의 항목 삭제하");
				break;
			case 7:
				System.out.println("7. 영수증 표시하");
				break;
			case 8:
				System.out.println("8. 종료");
				break;
			}
		}
	}
}