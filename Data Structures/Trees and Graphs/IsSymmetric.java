class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){return true;}
        return checkTree(root.left, root.right);
    }
    
    public boolean checkTree(TreeNode left, TreeNode right) {
        if(left == null && right == null){return true;}
        
        if(left == null || right == null){return false;}
        
        if(left.val != right.val){return false;}
        
        return checkTree(left.left, right.right) && checkTree(left.right, right.left);
    }
}
