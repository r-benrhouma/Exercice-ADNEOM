
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Partition part = new Partition();
        ArrayList list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(" *** Tester la partition de la liste  par 1 ***");
        List newList = part.PartitionList(list, 1);
        newList.forEach(System.out::println);
        System.out.println(" *** Tester la partition de la liste  par 2 ***");
        newList = part.PartitionList(list, 2);
        newList.forEach(System.out::println);
        System.out.println(" *** Tester la partition de la liste  par 3 ***");
        newList = part.PartitionList(list, 3);
        newList.forEach(System.out::println);
        System.out.println(" *** Tester la partition de la liste  par 4 *** ");
        newList = part.PartitionList(list, 4);
        newList.forEach(System.out::println);
        System.out.println(" *** Tester la partition de la liste  par 5 *** ");
        newList = part.PartitionList(list, 5);
        newList.forEach(System.out::println);


    }
}
