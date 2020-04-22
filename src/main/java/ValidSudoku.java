import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            if(!validate(board[i])) return false;
        }
        for(int i = 0; i < 9; i++) {
            char[] cols = new char[9];
            for(int j = 0; j < 9; j++) {
                cols[j] = board[j][i];
            }
            if(!validate(cols)) return false;
        }
        for(int i = 0; i < 9; i+=3) {
            for(int j = 0; j < 9; j+=3) {
                char[] box = new char[9];
                box[0] = board[i][j];
                box[1] = board[i+1][j];
                box[2] = board[i+2][j];
                box[3] = board[i][j+1];
                box[4] = board[i+1][j+1];
                box[5] = board[i+2][j+1];
                box[6] = board[i][j+2];
                box[7] = board[i+1][j+2];
                box[8] = board[i+2][j+2];
                if(!validate(box)) return false;
            }
        }
        return true;
    }
    
    private boolean validate(char[] array) {
        Set<Character> set = new HashSet<Character>();
        for(char c : array) {
            if(set.contains(c)) return false;
            if(c != '.') set.add(c);
        }
        return true;
    }
}