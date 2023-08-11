package all.interview;

public class Solution3 {

    public static int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int j=0;
        int max=0,min=0; // 最大利润,最小次数
        int money = 0,sum = 0;
        boolean flag = false;
        int num = 0;
        for (int i = 0; i < customers.length; i++) {
            if (i == customers.length - 1) { // 到最后
                if (flag == false) {
                    sum += customers[i];
                    i--;
                    flag = true;
                } else if (sum != 0&&flag == true) { // 人未满
                    i--;
                }else { // 人满
                    break;
                }
            } else { // 未到最后
                sum += customers[i];
            }



            if (sum < 4) {
                money = money +(boardingCost*sum -runningCost);
                sum = 0;

            }else {
                money = money +(boardingCost*4 - runningCost);
                sum-=4;
            }
            j++;
            if (money>max) {
                max=money;
                min = j;
            }

        }

        if (max==0) {
            return -1;
        }else {
            return min;
        }
    }
//    public static int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
//        int money=0;
//        int i = 0;
//        int num = 0;
//        while (true) {
//            // 判断大于次数
//            if (i > customers.length-1) {
//                if (num)
//            }
//
//
//        }
//    }

    public static void main(String[] args) {
        int[] customers = {3,4,0,5,1};
        int bookingCost = 1;
        int runningCost = 92;
        System.out.println(minOperationsMaxProfit(customers, bookingCost, runningCost));
    }
}
