import java.util.ArrayList;

public class ArrayList_Frame {
    public static void main(String[] args) {
        
        ArrayList ar = new ArrayList();
        // adding eveything as object
        ar.add(2);
        ar.add("Akash");
        ar.add('z');
        System.out.println(ar);

        ArrayList ar2 = new ArrayList();
        // adding eveything as object
        ar2.add(88);
        ar2.add("AAAAAAAAAA");
        ar2.add('Y');
        ar2.add(88);
        System.out.println(ar2);


        ar.addAll(ar2);
        System.out.println(ar);
        System.out.println(ar.add("chceck"));
        System.out.println(ar.contains(2));
        System.out.println(ar);
    }
    
}
