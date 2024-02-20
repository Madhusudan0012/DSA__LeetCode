public class Word_Search {
    public static void main(String[] args){
        char[][] board{
            {'A' , 'B' , 'C' , 'E'},
            {'S' , 'F' , 'C' , 'S'},
            {'A' , 'D' , 'E' , 'E'},
        };
        String Word =  "ABCCED";
        Search(board,word, 0, 0, 0);

        //
    }
    public static void Search(char[][] board , String word  , int row , int col , int idx ){
        if(col< 0|| row <0 || col>board[0].length || row>board.length || board[row][col]!=word.c );
        return;
    }

       
    

    }
    
}
