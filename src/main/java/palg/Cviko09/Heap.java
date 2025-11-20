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
