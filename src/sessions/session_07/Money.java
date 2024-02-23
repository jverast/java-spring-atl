package sessions.session_07;

public record Money(String type, int quantity) {
    @Override
    public String type() {
        return type;
    }

    @Override
    public int quantity() {
        return quantity;
    }
}
