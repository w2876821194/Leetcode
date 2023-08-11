package all.L2446;

import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date date1 = sdf.parse(event1[0]);
            Date date2 = sdf.parse(event1[1]);
            Date date3 = sdf.parse(event2[0]);
            Date date4 = sdf.parse(event2[1]);
            //如果2在3之后或者两个不相等,则true
            // 如果4在1之后
//            if ((date2.after(date3) || date2.getTime() == date3.getTime()) && (date1.after(date4) && date1.getTime() != date4.getTime())) {
            if (date4.after(date1)) {
                if (date2.after(date3)||date2.getTime() == date3.getTime()) {
                    return true;
                }
                return false;
            }

            if (date3.after(date2)) {
                if (date1.after(date4)||date1.getTime() == date4.getTime()) {
                    return true;
                }
                return false;
            }



        } catch (Exception ignored) {

        }
        return true;
    }

    public static void main(String[] args) {
        String[] str1 = {"01:15", "02:00"};
        String[] str2 = {"02:00", "03:00"};
        new Solution().haveConflict(str1, str2);
    }
}
