package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Friend f1 = new Friend();
		Friend f2 = new Friend();
		Friend f3 = new Friend();
		Friend[] friendArray = new Friend[3];
		friendArray[0] = f1;
		friendArray[1] = f2;
		friendArray[2] = f3;
		
		
		System.out.println("친구를 3명 등록해 주세요");
		for(int i =0; i<friendArray.length; i++) {
			friendArray[i].setName(sc.nextLine());
			friendArray[i].setHp(sc.nextLine());
			friendArray[i].setSchool(sc.nextLine());
		}
		
		
		for(int i =0; i<friendArray.length; i++) {
			friendArray[i].showInfo();
		}
		
		
		
		
		
		
		sc.close();
		
		
	}

}
