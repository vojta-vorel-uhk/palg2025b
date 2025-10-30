package palg.Cviko06;

public class RouteListNode
{
    private Location location;
    private RouteListNode next;

    public RouteListNode(Location location, RouteListNode next) {
        this.location = location;
        this.next = next;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public RouteListNode getNext() {
        return next;
    }

    public void setNext(RouteListNode next) {
        this.next = next;
    }
}
