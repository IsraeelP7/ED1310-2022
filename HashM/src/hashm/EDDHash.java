package hashm;
 

public class EDDHash<K, T> {
    K key;
    T valor;
      final int hashCode;
 

    EDDHash<K, T> next;
 

    public EDDHash(K key, T valor, int hashCode)
    {
        this.key = key;
        this.valor = valor;
          this.hashCode = hashCode;
    }
}
 



