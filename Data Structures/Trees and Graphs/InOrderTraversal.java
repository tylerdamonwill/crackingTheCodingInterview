class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<Integer>();
        inorderTraversalHelp(lst, root);
        return lst;
    }
    
    public void inorderTraversalHelp(List<Integer> lst, TreeNode root) {
        if(root == null){return;}
        inorderTraversalHelp(lst, root.left);
        lst.add(root.val);
        inorderTraversalHelp(lst, root.right);
    }
}
