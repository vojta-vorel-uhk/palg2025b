package palg.Cviko11;

import palg.Cviko10.Sorter;
import palg.Messages.Message;

public class BubbleSorter extends Sorter
{
    @Override
    public void sort(Message[] messages){
        var swapped = true;
        while (swapped){
            swapped = false;
            // TODO: uprav for cyklus aby skončil dřív
            // protože vpravo už je hotovo
            for (int b=0;b<messages.length-1;b++)
            {
                if(messages[b].compareTo(messages[b+1])>0){
                    swap(messages,b,b+1);
                    swapped=true;
                }
            }
        }
    }
}
