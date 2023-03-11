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
        User user1 = new User("myname", "hillel1", "hillel1");
        Assertions.assertEquals("myname", user1.getLogin());

        User user2 = new User("MYNAME", "hillel1", "hillel1");
        Assertions.assertEquals("MYNAME", user2.getLogin());

        User user3 = new User("MYNAMEmynameMYNAMEmy", "hillel1", "hillel1"); //20
        Assertions.assertEquals("MYNAMEmynameMYNAMEmy", user3.getLogin());
    }

    @Test
    void createLoginNullTest() {
        User user = new User("hillel", "hillel1", "hillel1");
        Assertions.assertThrows(NullPointerException.class, () -> user.createLogin(null));
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
        User user1 = new User("myname", "hillel1", "hillel1");
        Assertions.assertEquals("hillel1", user1.getPassword());

        User user2 = new User("myname", "HILLEL1", "HILLEL1");
        Assertions.assertEquals("HILLEL1", user2.getPassword());

        User user3 = new User("myname", "12345H", "12345H");
        Assertions.assertEquals("12345H", user3.getPassword());
    }

    @Test
    void createPasswordNullTest() {
        User user = new User("hillel", "hillel1", "hillel1");
        Assertions.assertThrows(NullPointerException.class, () -> user.createPassword(null));
    }

    @Test
    void confirmPasswordTest() {
        User user = new User("hillel", "Hillel1", "Hillel1"); // Play Login class to test full functional of method.
        boolean result1 = user.confirmPassword("Hillel1");
        Assertions.assertTrue(result1);
    }

    @Test
    void confirmPasswordNullTest() {
        User user = new User("hillel", "Hillel1", "Hillel1");
        Assertions.assertThrows(NullPointerException.class, () -> user.confirmPassword(null));
    }
}
