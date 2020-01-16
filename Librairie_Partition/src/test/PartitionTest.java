import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionTest {

    @Test
    public final void partition() {
        Partition part = new Partition();
        //TEST 1 AVEC TAILLE 2
        //Générer les arguments pour la méthode
        ArrayList listEntr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int taille = 2;
        //Générer le résultat
        List listRes = new ArrayList<ArrayList>();
        listRes.add(Arrays.asList(1,2));
        listRes.add(Arrays.asList(3,4));
        listRes.add(Arrays.asList(5));
        //Tester la méthode
        assertIterableEquals(part.PartitionList(listEntr,taille), listRes);
        //TEST 2 AVEC TAILLE 3
        //Générer les arguments pour la méthode
        taille = 3;
        //Générer le résultat
        listRes = new ArrayList<ArrayList>();
        listRes.add(Arrays.asList(1,2,3));
        listRes.add(Arrays.asList(4,5));
        //Tester la méthode
        assertIterableEquals(part.PartitionList(listEntr,taille), listRes);
        //TEST 3 AVEC TAILLE 1
        taille = 1;
        //Générer le résultat
        listRes = new ArrayList<ArrayList>();
        listRes.add(Arrays.asList(1));
        listRes.add(Arrays.asList(2));
        listRes.add(Arrays.asList(3));
        listRes.add(Arrays.asList(4));
        listRes.add(Arrays.asList(5));
        //Tester la méthode
        assertIterableEquals(part.PartitionList(listEntr,taille), listRes);

        //TEST 4 AVEC TAILLE 0
        taille = 0;
        //Tester la méthode
        assertIterableEquals(part.PartitionList(listEntr,taille), listEntr);
    }
}