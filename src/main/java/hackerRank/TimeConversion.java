package hackerRank;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "07:05:45am";

        System.out.println(convertTime(time));
    }

    public static String convertTime(String s){
        int hour = Integer.parseInt(s.substring(0, 2)) % 12;
        if (s.endsWith("PM"))
            hour += 12;
        return String.format("%02d", hour) + s.substring(2, 8);
    }
}
