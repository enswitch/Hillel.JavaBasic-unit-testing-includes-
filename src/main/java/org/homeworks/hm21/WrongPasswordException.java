package org.homeworks.hm21;

public class WrongPasswordException extends Throwable{
    public WrongPasswordException(String messsage) {
        super(messsage);
    }
}
