package all.L2409;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        LocalDate of1 = LocalDate.of(2001, Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3)));
        LocalDate of2 = LocalDate.of(2001, Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3)));
        LocalDate of3 = LocalDate.of(2001, Integer.parseInt(arriveBob.substring(0, 2)), Integer.parseInt(arriveBob.substring(3)));
        LocalDate of4 = LocalDate.of(2001, Integer.parseInt(leaveBob.substring(0, 2)), Integer.parseInt(leaveBob.substring(3)));

        LocalDate of6 = of1.until(of3,ChronoUnit.DAYS)<0?of1:of3;
        LocalDate of7 = of2.until(of4,ChronoUnit.DAYS)>0?of2:of4;

        return of6.until(of7,ChronoUnit.DAYS)>=0? (int) (of6.until(of7, ChronoUnit.DAYS) + 1) :0;
//        return of6.until(of7).getDays()>0?of6.until(of7).getDays()+1:0;
    }

    public static void main(String[] args) {




        String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-16";
//        String arriveAlice = "09-01", leaveAlice = "10-19", arriveBob = "06-19", leaveBob = "10-20";
//        String arriveAlice = "10-20", leaveAlice = "12-22", arriveBob = "06-21", leaveBob = "07-05";
//        String arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31";
        System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
}

//-------   --          ----      -----     -----
//  --     -------      ----    ----              -----
