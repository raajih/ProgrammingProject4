public class EukaryaTest {
    public static void main(String[] args) {
        Eukarya testAnt = new Ant("phylum", "class", "order", "family", "genus", "species", "Anty the ant", false, "worker");
        
        Eukarya testAardvark = new Aardvark("phylum", "class", "order", "family", "genus", "species", "Arty the aardvark", true, "Dessert");

        Eukarya testVenus = new VenusFlyTrap("division", "class", "order", "family", "genus", "species", "Veny the venus", true, 4);

        System.out.print(testAnt.toString() + "\n\n" + testAardvark.toString() + "\n\n" + testVenus.toString());
    }
}
