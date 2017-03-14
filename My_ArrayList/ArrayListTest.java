package week_1.My_ArrayList;

/**
 * Created by Алексей on 03.03.2017.
 */
/*
* Class for tests providing
* calls methods of custom ArrayList
* Integers collection and String collection is used
* all the tests provided in constructor:
* creating empty collection
* initialising
* filling in cycle, number of starting object is bigger then default number(10 to 8)
* adding objects in the accurate place in collection
* getter test
* removing objects on accurate indexes
* removing with matching test, false and true tries
* comparing sizes of both collections
* testing, do collections contains objects inserted in upper tests
* clearing both collections
* */
public class ArrayListTest {
    ArrayList<Integer> arrayInt;
    ArrayList<String> arrayString;

    public ArrayListTest(){
        arrayInt = new ArrayList<Integer>();
        arrayString = new ArrayList<String>();

        for(Integer i=0;i<10;i++){
            arrayInt.add(i);
            arrayString.add(Integer.toString(i));
        }

        arrayInt.add(5,999);
        arrayString.add(5,"Inserted");

        Integer item1 = arrayInt.get(3);
        String item2 = arrayString.get(3);

        arrayString.remove(0);
        arrayInt.remove(1,2);
        arrayInt.remove(1,1);

        if(arrayInt.size() == arrayString.size())
            if(arrayString.contains("Inserted") && arrayInt.contains(999)) {
                arrayInt.clear();
                arrayString.clear();
            }
    }
}
