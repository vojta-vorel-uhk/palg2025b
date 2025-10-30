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
    public void addLast(Location loc){}
    public Location get(int index)
    { return null;}

}
