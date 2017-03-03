package week_1.My_ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.*;
import java.util.function.UnaryOperator;


/**
 * Created by Алексей on 03.03.2017.
 */
public class ArrayList<T>{
    private final int INIT_SIZE = 8;
    private int last_item = 0;
    private int CUT_RATE = 2;
    private Object[] array = new Object[INIT_SIZE];

    public void add(T item){
        add(last_item, item);
    }
    public void add(int index,T item){
        if(index > last_item)
            return;
        if(last_item == array.length - 1)
            resize(array.length * 2);
        for(int i = last_item - 1;i>index;i--){
                array[i] = array[i-1];
        }
        array[index] = item;
    }
    public T get(int index){
        return (T)array[index];
    }
    public int size(){
        return last_item;
    }
    public void clear(){
        array = new Object[INIT_SIZE];
    }
    public  void remove(int index){
        remove(index,(T)array[index]);
    }
    public void remove(int index, T item){
        if(index > last_item)
            return;
        if(equals((T)array[index],item)){
            for(int i=index;i<last_item;i++){
                array[i] = array[i+1];
            }
            last_item--;
            array[last_item] = null;
        }
        if(array.length > INIT_SIZE && last_item < array.length / CUT_RATE)
            resize(array.length / 2);
    }
    public void set(int index, T item){
        if(index > last_item)
            return;
        array[index] = item;
    }
    public boolean contains(T item){
        for(int i=0;i<last_item;i++){
            if(equals((T)array[i],item))
                return true;
        }
        return false;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, last_item);
        array = newArray;
    }
    private boolean equals(T item_1, T item_2){
        if(item_1 == item_2)
            return true;
        if(item_1 == null || item_2 == null)
            return false;
        if(item_1.getClass() != item_2.getClass())
            return false;
        if(item_1.hashCode() != item_2.hashCode())
            return false;
        return true;
    }
}
