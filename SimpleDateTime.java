package temonshop;

/**
 * This class extends the AbstractDateTime class. You need to override the
 * toString() method. You are allowed to define new attributes or to write other
 * new methods.
 * 
 * The toString() method has to return a String object containing the year,
 * month, date, hour, minute, and second with a dash separator (-).
 * 
 * @author 12S19011 Kevin Manurung
 
 */

public class SimpleDateTime extends AbstractDateTime {
     /**
     * The object contructor.
     */
    public SimpleDateTime(int _year, int _month, int _date, int _hour, int _minute, int _second) {
        super(_year, _month, _date, _hour, _minute, _second);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String separator = "-";

        builder.append(this.year);
        builder.append(separator);
        builder.append(this.month);
        builder.append(separator);
        builder.append(this.date);
        builder.append(separator);
        builder.append(this.hour);
        builder.append(separator);
        builder.append(this.minunte);
        builder.append(separator);
        builder.append(this.second);

        return builder.toString();
    }
}
