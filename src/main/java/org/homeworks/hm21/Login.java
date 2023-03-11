package org.homeworks.hm21;

public class Login {


    public static void main(String[] args) {

        try {
            User user1 = new User("Hillel", "Hillel911", "hillel119");

            System.out.println("Login: " + user1.getLogin());
            System.out.println("Password: " + user1.getPassword());
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
