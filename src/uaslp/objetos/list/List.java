package uaslp.objetos.list;

public interface List <T>{

    void addAtTail(T data);

    void addAtFront(T data);

    void remove(int index);

    void removeAll();

    void setAt(int index, T data);

    T getAt(int index);

    Iterator<T> getIterator();

    int getSize();
}