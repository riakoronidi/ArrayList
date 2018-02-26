import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayTest {

//    private ArrayExample arrayExample;
    private ArrayListExample arrayListExample;

//    @Before
//    public void before(){
//        arrayExample = new ArrayExample();
//    }
//
//    @Test
//    public void canAddItem(){
//        arrayExample.add("Hello");
//        assertEquals(1,arrayExample.getWordCount());
//    }


    @Before
    public void before(){
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        arrayListExample = new ArrayListExample(myNumbers);
//        arrayListExample = new ArrayListExample();

    }

    @Test
    public void canAddItem(){
        arrayListExample.add("Hello");
        assertEquals(1,arrayListExample.getWordCount());
    }

    @Test
    public void canTotalNumbers(){
        assertEquals(10, arrayListExample.getTotal());
    }

    @Test
    public void canGetRandomNumber(){
        ArrayList results = arrayListExample.getNumbers();
        int randomNumber = arrayListExample.getRandomNumber();
        assertTrue(results.contains(randomNumber));
    }

}
