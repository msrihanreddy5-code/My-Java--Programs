class MatrixEncrypt {
    public static void main(String[] args) {
        int[][] key = {{1,2},{3,4}};
        int[] msg = {5,7};
        System.out.println(key[0][0]*msg[0] + key[0][1]*msg[1]);
    }
}
