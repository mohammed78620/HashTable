public class HashMap {
    private Node[] table;
    public HashMap(int size){
        table = new Node[size];
    }
    public int hash(int key){
        return key%table.length;
    }
    public void insert(int key){
    }
    public boolean search(int key){
    }
    public void delete(int key){
    }

}
