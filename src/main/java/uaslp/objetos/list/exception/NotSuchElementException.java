package uaslp.objetos.list.exception;

public class NotSuchElementException extends RuntimeException{
    public NotSuchElementException(){
        super("Element is not such on Iterable");
    }
}
