public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        return sum(root,false);
    }
    public int sum(TreeNode root,boolean isLeft){
        if(root.left==null&&root.right==null){
            if(isLeft)
            return root.val;
            else
                return 0;
        }
        int sum=0;
        if(root.left!=null){
            sum+=sum(root.left,true);
        }
        if(root.right!=null){
            sum+=sum(root.right,false);
        }
        return sum;
    }
