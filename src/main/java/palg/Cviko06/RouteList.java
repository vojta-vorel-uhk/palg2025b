package palg.Cviko06;

public class RouteList
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
    { return null;}

}
