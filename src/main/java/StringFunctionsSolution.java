public class StringFunctionsSolution {
    /**
     * 1. task
     * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
     * Example
     * time = 12:01:00PM
     * Return '12:01:00'.
     * <p>
     * time = 12:01:00AM
     * Return '00:01:00'.
     *
     * @param time in 12h format
     * @return time in 24h format
     */
    String convertTimeTo24Format(final String time) {
        String timeWithoutAMPM = time.substring(0, time.length() - 2);

        int hour = Integer.parseInt(timeWithoutAMPM.split(":")[0]);
        int minutes = Integer.parseInt(timeWithoutAMPM.split(":")[1]);
        int seconds = Integer.parseInt(timeWithoutAMPM.split(":")[2]);
        if (time.contains("AM")) {
            if (hour >= 12) {
                hour -= 12;
            }
        } else {
            if (hour < 12) {
                hour += 12;
            }
        }
        return convertToStringValue(hour) + ":" + convertToStringValue(minutes) + ":" + convertToStringValue(seconds);
    }

    private String convertToStringValue(int value) {
        if (value < 9) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
}
