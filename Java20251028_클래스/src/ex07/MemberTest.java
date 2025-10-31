package ex07;

public class MemberTest {

	public static void main(String[] args) {
		Member user1 = new Member("홍길동","hong");
		
		System.out.println("name : " +user1.getName() + " id : " + user1.getId());
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
	
}

class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public  int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class MemberService {
				
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345"))
			return true;
		else 
			return false;
	}
	
	public void logout (String id) {
		System.out.println(id + " 님이 로그아웃 되었습니다.");
	}

}
