public int totalNQueens(int n) {
        return nqueen(new boolean[n][n],0);
    }
    public static int nqueen(boolean board[][],int i){
        if(i==board.length){
            return 1;
        }
            int a=0;
            for(int j=0;j<board[i].length;j++){
                if(issafe(board,i,j)){
                    board[i][j]=true;
                    a=a+nqueen(board,i+1);
                    board[i][j]=false;
                }
            }
        return a;
        
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
