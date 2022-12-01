package hashm;

import java.util.ArrayList;
import java.util.Objects;

public class HashT<K, T> {

    private ArrayList<EDDHash<K, T>> array;
    private int num;
    private int size;

    public HashT() {
        array = new ArrayList<>();
        num = 10;
        size = 0;
        for (int i = 0; i < num; i++) {
            array.add(null);
        }
    }

    private final int hash(K key) {
        return Objects.hashCode(key);
    }

    private int Indice(K key) {
        int hash = hash(key);
        int index = hash % num;

        index = index < 0 ? index * -1 : index;
        return index;
    }
    
    public void add(K key, T value) {

        int indice = Indice(key);
        int hash = hash(key);
        EDDHash<K, T> head = array.get(indice);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hash) {
                head.valor = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = array.get(indice);
        EDDHash<K, T> newNodo = new EDDHash<K, T>(key, value, hash);
        newNodo.next = head;
        array.set(indice, newNodo);

        if ((1 * size) / num >= 0.7) {
            ArrayList<EDDHash<K, T>> temp = array;
            array = new ArrayList<>();
            num = 2 * num;
            size = 0;
            for (int i = 0; i < num; i++) {
                array.add(null);
            }

            for (EDDHash<K, T> headNodo : temp) {
                while (headNodo != null) {
                    add(headNodo.key, headNodo.valor);
                    headNodo = headNodo.next;
                }
            }
        }
    }

    public T valueOf(K key) {

        int indice = Indice(key);
        int hash = hash(key);

        EDDHash<K, T> head = array.get(Indice(key));

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hash) {
                return head.valor;
            }
            head = head.next;
        }

        return null;
    }

    public T remove(K key) {
        int indice = Indice(key);
        int hash = hash(key);

        EDDHash<K, T> head = array.get(indice);

        EDDHash<K, T> prev = null;
        while (head != null) {

            if (head.key.equals(key) && hash == head.hashCode) {
                break;
            }

            prev = head;
            head = head.next;
        }

        if (head == null) {
            return null;
        }
        size--;

        if (prev != null) {
            prev.next = head.next;
        } else {
            array.set(indice, head.next);
        }

        return head.valor;
    }
}
