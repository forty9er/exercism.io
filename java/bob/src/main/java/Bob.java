public class Bob {

    public String hey(String input) {
        if (input.equals(input.toUpperCase()) && !input.equals(input.toLowerCase())) {
            return "Whoa, chill out!";
        }
        if (input.endsWith("?")) {
            return "Sure.";
        }
        return "Whatever.";
    }

}
