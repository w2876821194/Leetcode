package sword_offer.L20;

public class jz33 {
}

class Solution {
    int[] postorder;
    boolean flag = true;

    public boolean verifyPostorder(int[] postorder) {
        this.postorder = postorder;
        divideAndConquer(postorder.length - 1, 0);
        return flag;
    }

    public void divideAndConquer(int root, int l) {
        if (l > root) {
            return;
        }
        int num = postorder[root];
        int index = l;
        while (postorder[index] < num) {
            index++;
        }
        int r = index;
        while (index < root) {
            if (postorder[index] < num) {
                flag = false;
                return;
            }
            index++;
        }
        divideAndConquer(r - 1, l);
        divideAndConquer(root - 1, r);
    }
}
