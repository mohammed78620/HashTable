public interface Set {
    // Add the key to the set
    void insert(int key);
    // Is the key in the set?
    boolean search(int key);
    // Delete the key from the set, if present
    void delete(int key);
}
