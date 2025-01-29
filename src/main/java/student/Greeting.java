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
    private String greeting;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * Full constructor with all parameters.
     * @param localityID the locality id number
     * @param localityName the name of the locality
     * @param asciiGreeting the ASCII version of the greeting
     * @param unicodeGreeting the Unicode version of the greeting
     * @param formatStr the format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Constructor with locality ID, name, and a single greeting.
     * @param localityID the locality id number
     * @param localityName the name of the locality
     * @param greeting the greeting to use for both ASCII and Unicode
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Constructor with just locality ID and name.
     * @param localityID the locality id number
     * @param localityName the name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Returns the locality id number.
     * @return the locality id number
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the locality name.
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the ascii greeting. Just the greeting, no formatting.
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the unicode greeting. Just the greeting, no formatting.
     * @return the unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Gets the unicode format string. This string will have a %s, so that the name
     * can be inserted into the greeting in the correct location.
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        return String.format(formatStr, unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format. This string
     * will have a %s, so that the name can be inserted into the greeting in the correct location.
     * @param asciiOnly if true, only ascii characters will be used
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        return String.format(formatStr, asciiOnly ? asciiGreeting : unicodeGreeting);
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging purposes.
     * @return the string representation of the greeting
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}

