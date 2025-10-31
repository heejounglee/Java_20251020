package ex07;

public class ShopServiceTest {

	public static void main(String[] args) {
		
	ShopService obj1 = ShopService.getInstance();
	ShopService obj2 = ShopService.getInstance();
	
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	
	}
	

}

class ShopService  {

	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static ShopService single = new ShopService(); 
	
	//private 접근 권한을 갖는 생성자
	private ShopService() {}
	
	//public 접근 권한을 갖는 정적 메서드 선언
	public static ShopService getInstance() {
		return single;
	}

}