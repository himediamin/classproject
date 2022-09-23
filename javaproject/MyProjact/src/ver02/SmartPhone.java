package ver02;

import java.util.Scanner;

import javax.naming.BinaryRefAddr;

public class SmartPhone {

//	기능 클래스 : 속성을 가지지 않고 메소드들로만 정의된 클래스
//	여러개의 인스턴스가 생성될 필요가 없다. => 싱글톤 패턴을 사용할 수 있었다!
//	1. private 생성자
//	2. 클래스 내부에서 인스턴스 생성 static, private
//	3. 내부에서 생성한 참조값을 반환 해주는 메소드 static public

//	요구사항
//	이 클래스는 연락처 정보를 관리하는 클래스입니다. 
//	① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
//	  => 10개 정보를 저장할수 있다. => 배열 인스턴스 생성 Contact[]
//	     Contact 클래스 기반의 인스턴스를 최대 10개까지 만들어서 배열에 참조값을 저장

	private Contact[] contacts;
	private int numOfContact; //입력된 정보의 개수, 배열의 index 값으로 사용

	private SmartPhone(int size) {
		contacts = new Contact[size];
		numOfContact = 0;
		
	}

	private static SmartPhone sp = new SmartPhone(10);

	public static SmartPhone getInstance() {
		if (sp == null) {
			sp = new SmartPhone(10);
		}
		return sp;
	
//		② 기능
//		  배열에 인스턴스를 저장하고, 
//		                수정하고, 
//		                삭제, 
//		                검색 후 결과 출력, 
//		                저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
	
	

	}
	
	void insertContact() {
		
//		  배열에 인스턴스를 저장하고,
//		1. 데이터 받고,
//		2. 인스턴스 생성
//		3.배열에 인스턴스의 참조값을 지정
		
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String brithday = null;
		String group = null;
		
//		1. 데이터 받고,
		
		System.out.println("입력을 시작합니다.");
		System.out.print("이름 > ");
		name = sc.nextLine();
		
		System.out.print("전화번호 > ");
		phoneNumber = sc.nextLine();
		
		System.out.print("이메일 > ");
		email = sc.nextLine();
		
		System.out.print("주소 > ");
		address = sc.nextLine();
		
		System.out.print("생일 > ");
		brithday = sc.nextLine();
		
		System.out.print("그룹 > ");
		group = sc.nextLine();
		
//		2. 인스턴스 생성
		Contact contact = new Contact(name, phoneNumber, email, address, numOfContact, group);
			
			contacts[numOfContact++] = contact;
			
//			numOfContact++;
			
		
		
		
	}



}