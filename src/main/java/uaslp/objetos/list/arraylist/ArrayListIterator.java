package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;

public class ArrayListIterator <T> implements Iterator <T>{

    private final ArrayList<T> arrayList;
    private int currentItem;

    public ArrayListIterator(ArrayList<T> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext(){
        return currentItem < arrayList.getSize();
    }

    @Override
    public T next(){
        T data = arrayList.getAt(currentItem);

        currentItem++;

        return data;
    }
}