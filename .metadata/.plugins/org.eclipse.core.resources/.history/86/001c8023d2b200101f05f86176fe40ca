package ex01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, money = 0;
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				System.out.print("예금액>");
				money += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.print("출금액>");
				money -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(money);
				break;
			case 4:
				break;
			default:
				System.out.println("1~4사이의 5정수만 입력해주세요");
				continue;
			}
			
			if (num == 4) break;
							
		}
		
		System.out.println("프로그램 종료");
	}

}
