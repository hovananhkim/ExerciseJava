public class Exercise10 {
    public String getDay(int day, int month, int year) {
        int JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
                (365 * (year + 4800 - ((14 - month) / 12))) +
                ((year + 4800 - ((14 - month) / 12)) / 4) -
                ((year + 4800 - ((14 - month) / 12)) / 100) +
                ((year + 4800 - ((14 - month) / 12)) / 400) - 32045) % 7;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[JMD];
    }
}
