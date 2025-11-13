package palg.Cviko08.Uloha01;

public class PalgMap
{
    PalgMapNode root = null;
    public Person get(long key)
    {
        var current = root;
        while (true) {
            if(current == null)
                return null;
            if(current.getKey() == key)
                return current.getValue();
            if(key < current.getKey())
                current = current.getLeft();
            else
                current = current.getRight();
        }
    }

    public void put(long key, Person value)
    {
        var newNode = new PalgMapNode(key,value,null,null);
        if(root == null){
            root = newNode;
            return;
        }
        var current = root;
        while(true){
            if(key < current.getKey()) {
                if(current.getLeft() == null){
                    current.setLeft(newNode);
                    return;
                }
                current = current.getLeft();
            }
            else {
                if(current.getRight() == null){
                    current.setRight(newNode);
                    return;
                }
                current = current.getRight();
            }
        }
    }
}
