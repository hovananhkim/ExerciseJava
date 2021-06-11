public class Exercise10 {
    public String getDay(int day, int month, int year){
        if (isDay(day,month,year)){
            int JMD=(day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
                    (365 * (year + 4800 - ((14 - month) / 12))) +
                    ((year + 4800 - ((14 - month) / 12)) / 4) -
                    ((year + 4800 - ((14 - month) / 12)) / 100) +
                    ((year + 4800 - ((14 - month) / 12)) / 400)  - 32045) % 7;
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday" ,"Friday", "Saturday", "Sunday"};
            return days[JMD];

        }
        return "";


    }
    public boolean isYear(int year){
        if (year>=0) return true;
        else return false;
    }
    public boolean isLeapYear(int year){
        if (year%4==0 && year%100!=0)
            return true;
        else if (year%400==0)
            return true;
        else return false;
    }
    public boolean isMonth(int month){
        if (month>0 && month<=12)
            return true;
        else return false;
    }
    public boolean isDay(int day,int month, int year){
        if (isYear(year) && isMonth(month)){
            if (month==2){
                if (isLeapYear(year) && day<30 && day>0)
                    return true;
                else if (day<29 && day>0)
                    return true;
                else return false;
            }
            else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                if (day>0 && day<32) return true;
                else return false;
            }
            else {
                if (day>0 && day < 31)
                    return true;
                else return false;
            }
        }
        else return false;
    }
}
