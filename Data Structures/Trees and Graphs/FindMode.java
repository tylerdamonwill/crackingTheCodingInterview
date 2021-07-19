public class Solution {
    int curCount = 1;
    int maxCount = 0;
    TreeNode prev;
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }
    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        if (prev != null) {
            if (root.val == prev.val) curCount++;
            else curCount = 1;
        }
        prev = new TreeNode(root.val);
        if (curCount > maxCount) {
            maxCount = curCount;
            list.clear();
            list.add(root.val);
        } else if (curCount == maxCount) list.add(root.val);
        inorder(root.right, list);
    }
}
