class SnakeLogic {
    public static void main(String[] args) {
        int[][] board = new int[10][10];
        int x = 5, y = 5;
        board[x][y] = 1;
        System.out.println("Snake at position: "+x+","+y);
    }
}
