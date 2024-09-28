//Raajih Roland
//Programming Project 4
//9/28/2024
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EukaryaTest {
    @Test
     public void testAnt()
     {
        //Ant Tests
        Ant testAnt = new Ant("antPhylum", "antClass", "antOrder", "antFamily", "antGenus", "antSpecies", "Anty the ant", false, "worker");
        assertEquals("antPhylum", testAnt.getPhylum());
        assertEquals("antClass", testAnt.getClassName());
        assertEquals("antOrder", testAnt.getOrder());
        assertEquals("antFamily", testAnt.getFamily());
        assertEquals("antGenus", testAnt.getGenus());
        assertEquals("antSpecies", testAnt.getSpecies());
        assertEquals("Anty the ant", testAnt.getOrganismName());
        assertEquals(false, testAnt.getIsExtinct());
        assertEquals("worker", testAnt.getJob());
     }
     @Test
     public void testAardvark()
     {
        //Aardvark tests.
        Aardvark testAardvark = new Aardvark("phylum", "class", "order", "family", "genus", "species", "Arty the aardvark", true, "Desert");
        //Ant to be eaten.
        Ant lunchAnt = new Ant("antPhylum", "antClass", "antOrder", "antFamily", "antGenus", "antSpecies", "deadAnt", false, "worker");

        
        assertEquals("Arty the aardvark", testAardvark.getOrganismName());
        assertEquals("Desert", testAardvark.getHabitat());
        assertEquals("Arty the aardvark is eating the ant named deadAnt.\nThe circle of life...\n", testAardvark.eatAnt(lunchAnt));

     }

     @Test
     public void testVenusFlyTrap()
     {
        //VenusFlyTrap test.
        VenusFlyTrap testVenus = new VenusFlyTrap("division", "class", "order", "family", "genus", "species", "Veny the venus", true, 4);
        //Ant to be eaten in eatAnt() method.
        Ant lunchAnt = new Ant("antPhylum", "antClass", "antOrder", "antFamily", "antGenus", "antSpecies", "deadAnt", false, "worker");

        assertEquals(4, testVenus.getAvgSize(), 1);
        assertEquals("Veny the venus is eating the ant named deadAnt.\nThe circle of life...\n", testVenus.eatAnt(lunchAnt));
     }
     
}
