class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelp(root, targetSum, 0);
    }
    
    public boolean hasPathSumHelp(TreeNode cur, int targetSum, int curSum) {
        if(cur == null){ return false;}
        
        if(cur.left == null && cur.right == null){
            return targetSum == curSum + cur.val;
        }
        
        if(cur.left == null && cur.right != null){
            return hasPathSumHelp(cur.right, targetSum, cur.val + curSum);
        }
        
        if(cur.left != null && cur.right == null){
            return hasPathSumHelp(cur.left, targetSum, cur.val + curSum);
        }

        return hasPathSumHelp(cur.left, targetSum, cur.val + curSum) ||
            hasPathSumHelp(cur.right, targetSum, cur.val + curSum);
    }
}
