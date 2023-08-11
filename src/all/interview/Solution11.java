package all.interview;

class Solution11 {
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum = 0;    // 体力求和
        int max = 0;    // 经验最大值
        int min = 0;    // 经验最大值索引
        int[] number = new int[energy.length + 1];
        int flag = 0;
        for (int i = 0; i <= energy.length; i++) {
            // 0边界
            if (i == 0) {
                number[i] = initialExperience;
                max = experience[i];
                min = 0;
                sum = energy[i];
                flag = Math.min(number[i]-experience[i]-1,flag);
                continue;
            }
            number[i] =  number[i - 1] + experience[i - 1];
            // length边界
            if (i != energy.length) {
                sum += energy[i];
                if (experience[i] > max) {
                    max = experience[i];
                    min = i;
                }
                flag = Math.min(number[i]-experience[i],flag);
            }
//            flag = Math.min(experience[i]-number[i],flag);
        }
        // 27
        flag = -flag;
        if (sum > initialEnergy) {
            flag += sum - initialEnergy + 1;
        } else if (sum == initialEnergy) {
            flag += 1;
        }
//        if (max > initialExperience + number[min]) {
//            flag += max - initialExperience - number[min] + 1;
//        } else if (max == initialExperience + number[min]) {
//            flag += 1;
//        } else if (initialExperience <= experience[0]) {
//            flag += experience[0] - initialExperience +1;
//        }
        return flag;
    }

    public static void main(String[] args) {
        //4
        //39
        //[70,22,27,60,55,29,41,7,90,60,25,34,60,52,46]
        //[28,96,64,75,83,9,61,31,16,48,33,82,98,81,23]
        int initialEnergy = 4, initialExperience = 39;
        int[] energy = {70,22,27,60,55,29,41,7,90,60,25,34,60,52,46}, experience = {28,96,64,75,83,9,61,31,16,48,33,82,98,81,23};
        int initialEnergy1 = 2, initialExperience1 = 4;
        int[] energy1 = {1}, experience1 = {3};

//        System.out.println(minNumberOfHours(initialEnergy, initialExperience, energy, experience));
        System.out.println(minNumberOfHours(initialEnergy1, initialExperience1, energy1, experience1));
        ;
    }
}


// 01 10     1000 0111
