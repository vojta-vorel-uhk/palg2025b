package palg.Cviko06;

import java.util.Iterator;
import java.util.List;

public class RouteList implements Iterable<Location>
{
    private RouteListNode first;

    public void addFirst(Location loc) {
        var newNode = new RouteListNode(
                loc,
                first);
        first = newNode;
    }
    public void addLast(Location loc) {
        var newNode = new RouteListNode(loc, null);
        if(first == null)
        {
            first = newNode;
            return;
        }
        var lastNode = first;
        while (lastNode.getNext() != null)
        {
            lastNode = lastNode.getNext();
        }
        lastNode.setNext(newNode);
    }
    public Location get(int index)
    {
        if(first == null || index < 0)
            throw new IndexOutOfBoundsException();

        var current = first;
        for (int i=0; i<index; i++)
        {
            if(current.getNext() == null)
                throw new IndexOutOfBoundsException();
            current = current.getNext();
        }
        return current.getLocation();
    }

    @Override
    public Iterator<Location> iterator()
    {
        return null;
        // return new Iterator<Location>(first);

        // Přidat třídu RouteListIterator
        // která bude obalem nad RouteListNode
        // a bude implementovat rozhraní
        // Iterator<Location>
    }
}
