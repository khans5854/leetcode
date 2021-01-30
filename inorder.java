public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        while(true){
            if(root!=null){
                s.push(root);
                root=root.left;
            }
            else{
                if(s.isEmpty()){
                    break;
                }
                root=s.pop();
                list.add(root.val);
                root=root.right;
            }
        }
        return list;
    }
