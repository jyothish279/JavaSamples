package com.interfaces.exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show(){
        var account = new Account();

        try{
            account.withDraw(10);
        } catch (AccountException e){
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
