public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int a=0;
        int b=0;
        if(root.left!=null)
            a=maxDepth(root.left);
        if(root.right!=null)
            b=maxDepth(root.right);
        int max=((a>b)?a:b);
        return max+1;
    }
