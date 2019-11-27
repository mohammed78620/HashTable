import javax.xml.crypto.Data;
import java.security.Key;

public class HashMap implements Table{
    private Node[] table;
    public HashMap(int size){
        table = new Node[size];
    }
    public int hash(int key){
        return key%table.length;
    }
    public void insert(int key){
    }


    @Override
    public void store(Key key, Data value) {

    }

    @Override
    public boolean search(Key key) {
        return false;
    }

    @Override
    public int getValue(Key key) {
        return 0;
    }

    @Override
    public void delete(Key key) {

    }
}
