package palg.Cviko10;


import palg.Messages.Message;

public class InsertionSorter extends Sorter
{
    @Override
    public void sort(Message[] messages)
    {
        for(int h=0; h<messages.length; h++)
        {
            int p=h;
            while(p>=1 && messages[p].compareTo(messages[p-1])<0 )
            {
                swap(messages,p,p-1);
                p--;
            }
        }
    }
}
