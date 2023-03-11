package org.homeworks.hm21;

import java.util.Scanner;

public class User {
    private String login;
    private String password;


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

    private void clearLogin(String login) {
        this.login = null;
    }

    private void clearPassword(String password) {
        this.password = null;
    }

    public String createLogin(String userInput) throws NullPointerException {
        String userLogin = null;
        int inputLength = userInput.length();
        char userSymbol;
        int inputLettersCount = 0;

        while (userLogin == null) {
            if (inputLength >= 6 && inputLength <= 20) {
            } else {
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
                userLogin = userInput;
            }
        }
        return userLogin;
    }


    public String createPassword(String inputPassword) throws NullPointerException {
        String userPassword = null;
        int passwordLength = inputPassword.length();
        char passwordSymbol;
        int passwordLettersCount = 0;
        int passwordNumbersCount = 0;

        while (userPassword == null) {
            if (passwordLength >= 6 && passwordLength <= 25) {
            } else {
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
                userPassword = inputPassword;
            } else {
                throw new WrongPasswordException("Password must contain at least one letter and number!");
            }
        }
        return userPassword;
    }


    public boolean confirmPassword(String inputConfirmPassword) throws NullPointerException {
        boolean confirmed = false;
        int tries = 3;

        if (inputConfirmPassword.equals(password)) {
            confirmed = true;
        }
        while (tries > 0 && !confirmed) {
            Scanner input = new Scanner(System.in);
            System.out.println("You failed to confirm password. Tries left " + tries);
            System.out.print("Confirm created password: ");
            if (input.hasNextLine()) {
                inputConfirmPassword = input.nextLine();
                if (inputConfirmPassword.equals(password)) {
                    confirmed = true;
                    System.out.println("Confirmed Successfully!" + '\n');
                } else {
                    tries--;
                }
            }
        }
        try {
            if (tries == 0) {
                clearLogin(login);
                clearPassword(password);
                throw new WrongPasswordException('\n' + "You failed to confirm password! Your data was not saved!");
            }
        } catch (WrongPasswordException exc) {
            System.out.println(exc.getMessage());
        } finally {
            System.out.println("Дякую, що скористались нашим сервісом" + '\n');
        }
        return confirmed;
    }
}


