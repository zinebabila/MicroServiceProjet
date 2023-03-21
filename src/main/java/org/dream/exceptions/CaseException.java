package org.dream.exceptions;

public class CaseException extends RuntimeException{
    public CaseException(String message){super(message);}
    public CaseException(String message,Throwable cause){super(message,cause);}
}
