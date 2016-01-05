package e1s.example.testing;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class VariationsOfCollectionsTest {
    @Test
    public void add() throws Exception {
        // Arrange
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Act
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addAll(list1);
        //list2.remove(1);

        // Assert
        assertThat(list2, containsInAnyOrder(1,2,3));
    }
    @Test
    public void add2(){
    	Assert.assertFalse("1 nie powinno być równe 2", 1 != 2);
    }
    
    @Test
    public void add3(){
    	List<Integer> list = new ArrayList<>(Arrays.asList(2, 4));
    	list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
    	
    	assertThat(list, contains(1,2,3,4,5));
    }
    
    @Test
    public void add4(){
    	List<Integer> list1 = new ArrayList<>();
    	Set<Integer> setList = new HashSet<>();
    	list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3); 
        setList.addAll(list1);
        
        Assert.assertEquals(setList.size(), 3);
        
    	
    }


}