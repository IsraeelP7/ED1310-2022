package hashm;

public class HashM {
    public static void main(String[] args) {
        HashT<String, Integer> ls = new HashT<>();
        ls.add("Nancy", 5);
        ls.add("Mike", 2);
        ls.add("Jesus", 3);
        System.out.println("El indice borrado es " + ls.remove("Jesus"));
        
        ls.add("Pablo", 1);
        System.out.println("El indice es " + ls.valueOf("Nancy"));
        
        ls.add("Fer", 1);
        ls.add("Pablo", 3);
        System.out.println("El indice borrado es " + ls.remove("Mike"));
    }

}
