class RecoverTree {
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;
    
    public void recoverTree(TreeNode root) {
        inorder(root);   
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    
    public void inorder(TreeNode curr){
        if(curr==null){
            return;
        }
        inorder(curr.left);
        if(prev!=null && prev.val > curr.val){
            if(first==null){
                first = prev;
            }
                second = curr;
        }
        prev = curr;
        inorder(curr.right);
    }
}
