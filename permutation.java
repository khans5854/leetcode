public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            List<List<Integer>> a= new ArrayList<List<Integer>>();
            a.add(new ArrayList<Integer>());
            return a; 
        }
        int ci=nums[0];
        int ros[]=new int[nums.length-1];
        for(int i=1;i<nums.length;i++){
            ros[i-1]=nums[i];
        }
        List<List<Integer>> mr=new ArrayList<List<Integer>>();
        List<List<Integer>> rr=permute(ros);
        for(int i=0;i<rr.size();i++){
            for(int k=0;k<=rr.get(i).size();k++){
                rr.get(i).add(k,ci);
                List<Integer> aa=new ArrayList<Integer>();
                for(int ar:rr.get(i)){
                    aa.add(ar);
                }
                rr.get(i).remove(k);
                mr.add(aa);
            }
        }
        return mr;
    }
