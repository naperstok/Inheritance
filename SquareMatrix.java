package Inheritance;

public class SquareMatrix extends Matrix {

     /*public SquareMatrix(int n) {
        this.row = n;
        this.column = n;
        matrix = new int [n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == j) matrix[i][j] = 1;
                else matrix[i][j] = 0;
            }
        }
    }*/

    public SquareMatrix(int n) {
        super(n, n);
        for (int i = 0; i < super.matrix.length; i++)
            super.matrix[i][i] = 1;
    }

    public SquareMatrix() {
        super();
    }

    public SquareMatrix sum (Matrix a) {

        if (this.getRow() != a.getRow()) {
            MatrixException e = new MatrixException ( "Matrix sizes are different" );
            throw e ;
        }

        SquareMatrix res = new SquareMatrix (this.row);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.row; j++)
                res.matrix[i][j] = this.matrix[i][j] + a.matrix[i][j];
        }
        return res;
    }

    public SquareMatrix product (Matrix a) {

        if (this.getRow() != a.getRow()) {
            MatrixException e = new MatrixException ( "Matrices can't be multiplied!" );
            throw e ;
        }

        SquareMatrix res = new SquareMatrix (this.row);
        int i = 0, j = 0;
        while ((i < this.row) && (j < this.row)) {
            res.matrix[i][j] -= 1;
            i++; j++;
        }

        for (i = 0; i < this.row; i++) {
            for (j = 0; j < a.column; j++) {
                for (int t = 0; t < this.column; t++)
                    res.matrix[i][j] += (this.matrix[i][t] * a.matrix[t][j]);
            }
        }
        return res;
    }

}
