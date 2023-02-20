import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cake c1=new Cake();
        c1.setName("Chocolate Brownie");
        c1.setPrice(250);

        Cake c2=new Cake();
        c2.setName("Chocolate Maple");
        c2.setPrice(300);

        List<Cake> cakes=new ArrayList();
        cakes.add(c1);
        cakes.add(c2);

        Pastry p1=new Pastry();
        p1.setName("Black Forest");
        p1.setPrice(35);

        Pastry p2=new Pastry();
        p2.setName("Choco Truffle");
        p2.setPrice(40);

        List<Pastry> pastries=new ArrayList();
        pastries.add(p1);
        pastries.add(p2);


        System.out.println("            Today's Special Menu");
        System.out.println("---------------------------------------------");
        System.out.println("Special Cakes");
        System.out.println("---------------------------------------------");
        for (Cake cake: cakes){
            cake.display();
        }
        System.out.println();
        System.out.println("Special Pastries");
        System.out.println("---------------------------------------------");
        for (Pastry pastry:pastries) {
            pastry.display();
        }
    }
}
