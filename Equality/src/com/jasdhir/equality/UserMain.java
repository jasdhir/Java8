package com.jasdhir.equality;

public class UserMain {
public static void main(String[] args) {
	User user1=new User("Jasdhir",42,"ABC123");
	User user2=new User("Jasdhir",42,"ABC123");
	System.out.println(user1.equals(user2));

}
}
