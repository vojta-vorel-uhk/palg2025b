package palg.Cviko09;

import palg.Messages.Message;

public class Heap
{
    private Message[] data;
    private int count;

    public Heap(int capacity)
    {
        this.data = new Message[capacity];
        count = 0;
    }
    public Message extractMin(){
        var result = data[0];
        data[0] = data[count-1];
        data[count-1] = null;
        count--;
        var current = 0;
        while (true){
            var child = lowerChildIndex(current);
            if(child == -1) break;
            if(data[child].compareTo(data[current]) < 0) {
                swap(current, child);
                current = child;
            }
            else {
                break;
            }
        }
        return result;
    }
    private int lowerChildIndex(int current){
        var leftChild = leftChild(current);
        var rightChild = rightChild(current);
        if(leftChild>=count) // pokud nemám potomky, vrátím -1
            return -1;
        if(rightChild>=count) // pokud mám jen levého, vrátím jeho index
            return leftChild;
        if(data[rightChild].compareTo(data[leftChild]) > 0)  // pokud mám oba, vrátím index toho, který má nižší klíč
            return leftChild;
        return  rightChild;
    }
    public void add(Message m)
    {
        data[count] = m;
        repair(count);
        count++;
    }
    private void repair(int index)
    {
        if(index == 0) return;
        var parent = parent(index);
        if(!isOk(index, parent)) {
            swap(index,parent);
            repair(parent);
        }
    }
    private boolean isOk(int child, int parent)
    {
        return data[child].compareTo(data[parent]) > 0;
    }
    private void swap(int a, int b){
        var temp = data[b];
        data[b] = data[a];
        data[a] = temp;
    }
    private static int leftChild(int index){
        return 2*index+1;
    }
    private static int rightChild(int index){
        return 2*index+2;
    }
    private static int parent(int index){
        return (index-1)/2;
    }
}
