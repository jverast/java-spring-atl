package sessions.session_07;

public record User (String name, int age, String role) {
    @Override
    public String name() {
        return name;
    }
}
