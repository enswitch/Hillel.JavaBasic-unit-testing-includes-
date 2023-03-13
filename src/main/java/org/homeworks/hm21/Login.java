package org.homeworks.hm21;

import java.util.Scanner;

public class Login {


    public static void main(String[] args) {

        User user = new User();
        try {
            user.createLogin("Hillel");
            user.createPassword("hillel009");
            user.confirmPassword(" ");
        } catch (WrongPasswordException exc) {
            System.out.println(exc.getMessage());

            int tries = 3;
            String inputPassword;
            while (tries > 0) {
                System.out.println("Try again to confirm password. Tries left: " + tries);
                Scanner input = new Scanner(System.in);
                inputPassword = input.nextLine();
                try {
                    user.confirmPassword(inputPassword);
                    break;
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                }
                tries--;
                if (tries == 0) {
                    user.clearLogin();
                    user.clearPassword();
                    System.out.println("You waste all 3 tries and your data lost!");
                }
            }
        } finally {
            System.out.println("Login: " + user.getLogin());
            System.out.println("Password: " + user.getPassword());
            System.out.println("Дякую, що скористались нашим сервісом!");
        }


    }
}
