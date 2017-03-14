package week_1.My_ArrayList;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* Custom ArrayList realisation
* INIT_SIZE - starting size of array
* lastItem - index of last element
* CUT_RATE - used for resizing, if number of items CUT_RATE times less, then array size
* array - static array of Object items
* <T> - template of collection items type, can be replaced with any Object based type
* no constructor used
* */
public class ArrayList<T>{
    private final int INIT_SIZE = 8;
    private int lastItem = 0;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[INIT_SIZE];
    /*
    * adding new item to the end of the array
    * */
    public void add(T item){
        add(lastItem, item);
    }
    /*
    * adding item in index position
    * all elements to the right has to be shifted
    * lastItem index increases
    * array doubles it's length, if end reached
    * */
    public void add(int index,T item){
        if(index > lastItem)
            return;
        if(lastItem == array.length - 1)
            resize(array.length * 2);
        for(int i = lastItem - 1;i>index;i--){
                array[i] = array[i-1];
        }
        array[index] = item;
        lastItem++;
    }
    /*
    * getter
    * returns element of array with index given
    * */
    public T get(int index){
        return (T)array[index];
    }
    /*
    * returns lastItem + 1,
    * cause lastItem is index, so it counts from 0
    * */
    public int size(){
        return lastItem;
    }
    /*
    * clears collection
    * simply crates new array and replace an old one with it
    * */
    public void clear(){
        array = new Object[INIT_SIZE];
    }
    /*
    * delete object in given position in array
    * without comparing check
    * */
    public  void remove(int index){
        remove(index,(T)array[index]);
    }
    /*
    * main method for deleting
    * compares needed item in array with object given as parameter
    * deletes array item, if they are equal
    * left shift is also performed
    * */
    public void remove(int index, T item){
        if(index > lastItem)
            return;
        if(equals((T)array[index],item)){
            for(int i=index;i<lastItem;i++){
                array[i] = array[i+1];
            }
            lastItem--;
            array[lastItem] = null;
        }
        if(array.length > INIT_SIZE && lastItem < array.length / CUT_RATE)
            resize(array.length / 2);
    }
    /*
    * simply replaces needed element of an array with given one
    * */
    public void set(int index, T item){
        if(index > lastItem)
            return;
        array[index] = item;
    }

    /*
    * checks
    * doe's an array contains item given
    * */
    public boolean contains(T item){
        for(int i=0;i<lastItem;i++){
            if(equals((T)array[i],item))
                return true;
        }
        return false;
    }
    /*
    * creates new, bigger array
    * copies contains of the old array to the new one
    * allocate old one with new
    * */
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, lastItem);
        array = newArray;
    }
    /*
    * simple function for equality checking
    * address,null,class,hashcode matching test performed
    * */
    private boolean equals(T item1, T item2){
        if(item1 == item2)
            return true;
        if(item1 == null || item2 == null)
            return false;
        if(item1.getClass() != item2.getClass())
            return false;
        if(item1.hashCode() != item2.hashCode())
            return false;
        return true;
    }
}
