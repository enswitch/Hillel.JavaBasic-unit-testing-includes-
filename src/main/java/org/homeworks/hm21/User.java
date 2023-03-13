package org.homeworks.hm21;

import java.util.Scanner;

public class User {
    private String login;
    private String password;


    public User() {

    }

    public User(String login, String password, String confirmPassword) {
        this.login = createLogin(login);
        this.password = createPassword(password);
        confirmPassword(confirmPassword);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void clearLogin() {
        this.login = null;
    }

    public void clearPassword() {
        this.password = null;
    }

    public String createLogin(String userInput) {
        if (userInput == null) {
            throw new WrongLoginException("Login can`t be null");
        }

        int inputLength = userInput.length();
        char userSymbol;
        int inputLettersCount = 0;

        if (inputLength < 6 || inputLength > 20) {
            throw new WrongLoginException("Invalid length of login, must be 6-20 symbols");
        }
        for (int i = 0; i < inputLength; i++) {
            userSymbol = userInput.charAt(i);
            if (userSymbol >= 'A' && userSymbol <= 'Z' || userSymbol >= 'a' && userSymbol <= 'z') {
                inputLettersCount++;
            } else {
                throw new WrongLoginException("Invalid symbols in login, must be Latin A-Z, a-z letters only!");
            }
        }
        if (inputLettersCount >= 6) {
            login = userInput;
        }
        return login;
    }


    public String createPassword(String inputPassword) {
        if (inputPassword == null) {
            throw new WrongPasswordException("Password can`t be null");
        }

        int passwordLength = inputPassword.length();
        char passwordSymbol;
        int passwordLettersCount = 0;
        int passwordNumbersCount = 0;

        if (passwordLength < 6 || passwordLength > 25) {
            throw new WrongPasswordException("Invalid length of password, must be 6-25 symbols");
        }
        for (int i = 0; i < passwordLength; i++) {
            passwordSymbol = inputPassword.charAt(i);
            if (passwordSymbol >= 'A' && passwordSymbol <= 'Z' || passwordSymbol >= 'a' && passwordSymbol <= 'z') {
                passwordLettersCount++;
            } else if (passwordSymbol >= '0' && passwordSymbol <= '9') {
                passwordNumbersCount++;
            } else {
                throw new WrongPasswordException("Invalid symbols in password, must be A-Z, a-z, 0-9 symbols only!");
            }
        }
        if (passwordLettersCount >= 1 && passwordNumbersCount >= 1) {
            password = inputPassword;
        } else {
            throw new WrongPasswordException("Password must contain at least one letter and number!");
        }
        return password;
    }


    public boolean confirmPassword(String inputConfirmPassword) throws WrongPasswordException {
        if (inputConfirmPassword == null) {
            throw new WrongPasswordException("You created password was not null");
        }
        if (inputConfirmPassword.equals(password)) {
            System.out.println("You successfully confirmed password");
            return true;
        } else {
            throw new WrongPasswordException("You failed to confirm password!");
        }
    }
}


