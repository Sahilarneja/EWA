import java.util.HashSet;

public class hashSet{
    public static void main(String[] args) {
        HashSet<String>hash=new HashSet<>();
        hash.add("Creta");
        hash.add("Lembo");
        hash.add("BMW");
        hash.add("Audi");

        System.out.println("Set of cars: "+hash);

        HashSet<String> hash2=new HashSet<>();
        hash2.add("Ducati");
        hash2.add("BMW");
        hash2.add("Suzuki");
        hash2.add("Harley Davidson");

        System.out.println("set of Bikes: "+hash2);
        System.out.println(hash.retainAll(hash2));
        hash.addAll(hash2);

        System.out.println(hash.retainAll(hash2));
        hash.removeAll(hash2);
        System.out.println("Difference of two sets: "+hash);

    }
}