package org.homeworks.hm21;

public class Login {


    public static void main(String[] args) {

        User user1 = new User("Hillel", "hillel911", null);

        System.out.println("Login: " + user1.getLogin());
        System.out.println("Password: " + user1.getPassword());
    }
}
