package org.homeworks.hm21;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String messsage) {
        super(messsage);
    }
}
