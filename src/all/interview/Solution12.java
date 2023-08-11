package all.interview;

class Solution12 {
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum = 0;    // 体力求和
        int[] sums = new int[energy.length];
        int flag = 0;

        for (int i = 0; i < energy.length; i++) {
            sum+=energy[i];
            if (i == 0) {
                sums[i] = initialExperience;
            }else {
                sums[i] = sums[i-1] +experience[i-1];
            }
            if (sums[i] < experience[i]) {
                flag = Math.max(experience[i]-sums[i]+1,flag);
            }else if (sums[i] == experience[i]) {
                flag = Math.max(1,flag);
            }
        }
        if(sum>initialEnergy) {
           sum = sum-initialEnergy+1;
        }else if(sum==initialEnergy){
            sum = 1;
        }else {
            sum = 0;
        }

        return flag+sum;
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

        System.out.println(minNumberOfHours(initialEnergy, initialExperience, energy, experience));
//        System.out.println(minNumberOfHours(initialEnergy1, initialExperience1, energy1, experience1));
        ;
    }
}


// 01 10     1000 0111
