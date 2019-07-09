package task_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericTask {

    public <T> void addArrayElementsToCollection(T[] array, Collection<T> collection){
        Collections.addAll(collection, array);
    }

    public static void main(String[] args) {
        GenericTask genericTask = new GenericTask();
        String [] stringAray = {"a", "b", "c", "d"};
        genericTask.addArrayElementsToCollection(stringAray, new ArrayList<Object>());
    }
}
