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
public class AL_Test {
    ArrayList<Integer> array_int;
    ArrayList<String> array_string;

    public AL_Test(){
        array_int = new ArrayList<Integer>();
        array_string = new ArrayList<String>();

        for(Integer i=0;i<10;i++){
            array_int.add(i);
            array_string.add(Integer.toString(i));
        }

        array_int.add(5,999);
        array_string.add(5,"Inserted");

        Integer item_1 = array_int.get(3);
        String item_2 = array_string.get(3);

        array_string.remove(0);
        array_int.remove(1,2);
        array_int.remove(1,1);

        if(array_int.size() == array_string.size())
            if(array_string.contains("Inserted") && array_int.contains(999)) {
                array_int.clear();
                array_string.clear();
            }
    }
}
