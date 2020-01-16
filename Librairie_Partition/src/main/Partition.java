
import java.util.ArrayList;
import java.util.List;

public class Partition {

    private int taille;
    private ArrayList list;

    public List PartitionList(ArrayList list, int taille){
        ArrayList newList = new ArrayList<List>();
        if(taille == 0)
            return list;
        int i = 0;
        while( i < list.size()){
            ArrayList l = new ArrayList<Integer>();
            int j = 0;
            while(j < taille && i < list.size()){
                l.add(list.get(i));
                i++;
                j++;
            }
            newList.add(l);
        }
        return newList;
    }
}
