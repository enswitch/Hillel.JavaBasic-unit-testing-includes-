package org.homeworks.hm21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void createLoginLengthTest() {
        User user = new User("hillel", "hillel1", "hillel1");
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin("enter"));
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin(""));
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin("qwertyQWERTYqwertyQWE")); //21
    }

    @Test
    void createLoginSymbolsTest() {
        User user = new User("hillel", "hillel1", "hillel1");
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin("enter2"));
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin("enter "));
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin("привіт"));
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin("ENTER2"));
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin("en_ter"));
    }

    @Test
    void createLoginValidValueTest() {
       User user = new User();
       user.createLogin("Hillel");
        Assertions.assertEquals("Hillel", user.getLogin());
    }

    @Test
    void createLoginNullTest() {
        User user = new User("hillel", "hillel1", "hillel1");
        Assertions.assertThrows(WrongLoginException.class, () -> user.createLogin(null));
    }

    @Test
    void createPasswordLengthTest() {
        User user = new User("hillel", "hillel1", "hillel1");
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword("enter"));
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword("enterENTERenterENTERenterE")); //26
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword(""));
    }

    @Test
    void createPasswordSymbolTest() {
        User user = new User("hillel", "hillel1", "hillel1");
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword("123456"));
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword("welcome"));
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword("WELCOME"));
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword("       "));
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword("welcome1_"));
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword("123456 w"));
    }

    @Test
    void createPasswordValidValueTest() {
        User user = new User();
        user.createPassword("hille9");
        Assertions.assertEquals("hille9", user.getPassword());


    }

    @Test
    void createPasswordNullTest() {
        User user = new User("hillel", "hillel1", "hillel1");
        Assertions.assertThrows(WrongPasswordException.class, () -> user.createPassword(null));
    }

    @Test
    void confirmTruePasswordTest() {
            User user = new User();
            user.createPassword("Hillel9");
            Assertions.assertTrue(user.confirmPassword("Hillel9"));
    }

    @Test
    void confirmFalsePasswordTest() {
        User user = new User();
        user.createPassword("Hillel9");
        Assertions.assertThrows(WrongPasswordException.class, () -> user.confirmPassword("hillel0"));
    }

    @Test
    void confirmNullPasswordTest() {
        User user = new User();
        user.createPassword("Hillel9");
        Assertions.assertThrows(WrongPasswordException.class, () -> user.confirmPassword(null));
    }

    @Test
    void clearLoginTest() {
        User user = new User();
        user.createLogin("Hillel");
        user.clearLogin();
        Assertions.assertNull(user.getLogin());
    }

    @Test
    void clearPasswordTest() {
        User user = new User();
        user.createPassword("Hillel9");
        user.clearPassword();
        Assertions.assertNull(user.getPassword());
    }




}
