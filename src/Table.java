import javax.xml.crypto.Data;
import java.security.Key;

public interface Table {
    // Set the value associated with the key
    void store(Key key, Data value);
    // Search for the key, returning true if found
    boolean search(Key key);
    // If the key exists, return the value
// associated with it
    int getValue(Key key);
    // Delete the key-value, if present
    void delete(Key key);
}
