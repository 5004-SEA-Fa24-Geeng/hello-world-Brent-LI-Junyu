package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * Constructor with only locality ID and name. Defaults greetings to "Hello".
     *
     * @param localityID    the ID of the locality
     * @param localityName  the name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = "Hello";
        this.unicodeGreeting = "Hello";
        this.formatStr = "%s, " + unicodeGreeting + "!";
    }

    /**
     * Constructor with locality ID, name, and ASCII greeting. Unicode greeting defaults to ASCII greeting.
     *
     * @param localityID     the ID of the locality
     * @param localityName   the name of the locality
     * @param asciiGreeting  the ASCII greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = asciiGreeting;
        this.formatStr = "%s, " + unicodeGreeting + "!";
    }

    /**
     * Constructor with locality ID, name, ASCII greeting, Unicode greeting, and format string.
     *
     * @param localityID     the ID of the locality
     * @param localityName   the name of the locality
     * @param asciiGreeting  the ASCII greeting
     * @param unicodeGreeting the Unicode greeting
     * @param formatStr      the format string
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr.replace("%%s", "%s").replace("%s", unicodeGreeting);
    }

    /**
     * Returns the locality ID.
     * @return locality ID
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the locality name.
     * @return locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the ASCII greeting.
     * @return ASCII greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the Unicode greeting.
     * @return Unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Returns the formatted greeting string.
     * @return formatted greeting
     */
    public String getFormatStr() {
        return formatStr;
    }

    /**
     * Overloaded method that allows selecting ASCII or Unicode greeting.
     * @param useAscii if true, use ASCII greeting format
     * @return formatted greeting string
     */
    public String getFormatStr(boolean useAscii) {
        return useAscii ? "%s, " + asciiGreeting + "!" : formatStr;
    }

    /**
     * Returns a string representation of the object.
     * @return formatted string
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
