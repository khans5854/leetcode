public List<List<String>> solveNQueens(int n) {
        boolean board[][]=new boolean [n][n];
        List<List<String>> ans=new ArrayList<List<String>>();
        nqueen(board,ans,0);
        return ans;
    }
    public static void nqueen(boolean board[][],List<List<String>> ans,int i){
        if(i==board.length){
            List<String> a=new ArrayList<String>();
            String s=new String();
            for(int m=0;m<board.length;m++){
                for(int n=0;n<board[m].length;n++){
                    if(board[m][n])
                        s+="Q";
                    else
                        s+=".";
                }
                a.add(s);
                s="";
            }
            // a.add(s);
            ans.add(a);
            return;
        }

            for(int j=0;j<board[i].length;j++){
                if(issafe(board,i,j)){
                    board[i][j]=true;
                    nqueen(board,ans,i+1);
                    board[i][j]=false;
                }
            }
        
    }
    public static boolean issafe(boolean board[][],int i,int j){
        for(int k=i;k>=0;k--){
            if(board[k][j])
                return false;
        }
        for(int k=i,l=j;k>=0&&l>=0;k--,l--){
            if(board[k][l])
                return false;
        }
        for(int k=i,l=j;k>=0&&l<board.length;k--,l++){
            if(board[k][l])
                return false;
        }
        return true;
    }
