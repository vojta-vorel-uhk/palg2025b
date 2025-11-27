package palg.Cviko10;

import palg.Messages.Message;

public class SelectionSorter extends Sorter
{
    @Override
    public void sort(Message[] messages)
    {
        for(int h=0; h<messages.length; h++){
            var min = minIndex(messages,h);// Najdi min index m v rozsahu od h dál
            swap(messages,min,h); // Prohoď obsah h a m
        }
    }
    private int minIndex(Message[] m, int from){
        int min = from;
        for(int i=from+1; i<m.length;i++){
            if(m[i].compareTo(m[min]) < 0)
                min = i;
        }
        return min;
    }
}
