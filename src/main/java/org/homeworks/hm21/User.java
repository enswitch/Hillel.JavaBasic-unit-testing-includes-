package org.homeworks.hm21;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public User() {
        this.login = createLogin();
        this.password = createPassword();
        confirmPassword();
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    private void clearLogin(String login) {
        this.login = null;
    }

    private void clearPassword(String password) {
        this.password = null;
    }

    public String createLogin() {
        String userInput;
        String userLogin = null;
        int inputLength;
        char userSymbols;
        Scanner input = new Scanner(System.in);
        System.out.println("Create user name (from 6 to not more than 20 symbols and Latin letters only!)");
        try {
            if (input.hasNextLine()) {
                userInput = input.nextLine();
                inputLength = userInput.length();
                if (inputLength <= 20 && inputLength >= 6) {
                    for (int i = 0; i < inputLength; i++) {
                        userSymbols = userInput.charAt(i);
                        if (userSymbols >= 'A' && userSymbols <= 'Z' || userSymbols >= 'a' && userSymbols <= 'z') {
                            userLogin = userInput;
                        } else {
                            throw new WrongLoginException("Invalid symbols to create user name, check condition and try again");
                        }
                    }
                } else {
                    throw new WrongLoginException("Invalid length to create user name, check condition and try again");
                }
            }
        } catch (WrongLoginException exc) {
            System.out.println(exc.getMessage());
            createLogin();
        }
        return userLogin;
    }


    public String createPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Create password (Latin letters and numbers, 6-25 symbols, at least 1 letter and 1 number)");
        String userInput;
        String userPassword = null;
        int passwordLength;
        char passwordSymbol;
        int passwordLettersCount = 0;
        int passwordNumbersCount = 0;

        try {
            if (input.hasNextLine()) {
                userInput = input.nextLine();
                passwordLength = userInput.length();
                if (passwordLength >= 6 && passwordLength <= 25) {
                    for (int i = 0; i < passwordLength; i++) {
                        passwordSymbol = userInput.charAt(i);
                        if (passwordSymbol >= 'A' && passwordSymbol <= 'Z' || passwordSymbol >= 'a' && passwordSymbol <= 'z') {
                            passwordLettersCount++;
                        } else if (passwordSymbol >= '0' && passwordSymbol <= '9') {
                            passwordNumbersCount++;
                        } else {
                            throw new WrongPasswordException("Invalid symbols in password, check conditions and try again");
                        }
                    }
                    if (passwordLettersCount >= 1 && passwordNumbersCount >= 1) {
                        userPassword = userInput;
                    } else {
                        throw new WrongPasswordException("Not used  at least one letter or number, check conditions and try again");
                    }
                } else {
                    throw new WrongPasswordException("Invalid length of password, check conditions and try again");
                }
            }
        } catch (WrongPasswordException exc) {
            System.out.println(exc.getMessage());
            createPassword();
        }
        return userPassword;
    }


    public boolean confirmPassword() {
        boolean confirmed = false;
        int tries = 3;
        String inputConfirm;
        Scanner input = new Scanner(System.in);
        try {
            while (tries > 0 && !confirmed) {
                System.out.println("Tries left " + tries);
                System.out.print("Confirm created password: ");
                if (input.hasNextLine()) {
                    inputConfirm = input.nextLine();
                    if (inputConfirm.equals(password)) {
                        confirmed = true;
                        System.out.println("Confirmed Successfully!" + '\n');
                    } else {
                        tries--;
                    }
                }
                if (tries == 0) {
                    clearLogin(login);
                    clearPassword(password);
                    throw new WrongPasswordException("You failed to confirm password!");
                }
            }
        } catch (WrongPasswordException exc) {
            System.out.println(exc.getMessage());
        } finally {
            System.out.println("Дякую, що скористались нашим сервісом");
        }
        return confirmed;
    }
}
