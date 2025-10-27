
public abstract class BookingHandlerChain {
    protected BookingHandlerChain next;

    public BookingHandlerChain setNext(BookingHandlerChain next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(Flight flight, String username);
}
