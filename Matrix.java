package Inheritance;

public class Matrix {

    protected int [][] matrix;
    protected int row;
    protected int column;

    public Matrix(int m, int n) {
        this.row = m;
        this.column = n;
        matrix = new int [m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                matrix[i][j] = 0;
        }
    }

    public Matrix () {
        this(0, 0);
    }

    public int getRow () {
        return row;
    }

    public  int getColumn () {
        return column;
    }

    public Matrix sum (Matrix a) {

        if (this.getRow() != a.getRow() || this.getColumn() != a.getColumn()) {
            MatrixException e = new MatrixException ( "Matrix sizes are different" );
            throw e ;
        }

        Matrix res = new Matrix (this.getRow(), this.getColumn());
        for (int i = 0; i < this.getRow(); i++) {
            for (int j = 0; j < this.getColumn(); j++)
                res.setElement(i, j, this.getElement(i, j) + a.getElement(i, j));
        }
        return res;
    }

    public Matrix product (Matrix a) {

        if (this.getColumn() != a.getRow()) {
            MatrixException e = new MatrixException ( "Matrices can't be multiplied!" );
            throw e ;
        }

        Matrix res = new Matrix (this.getRow(), a.getColumn());
        for (int i = 0; i < this.getRow(); i++) {
            for (int j = 0; j < a.getColumn(); j++) {
                for (int t = 0; t < this.getColumn(); t++)
                    res.matrix[i][j] += (this.matrix[i][t] * a.matrix[t][j]);
            }
        }
        return res;
    }

    public void setElement (int row, int column, int value) {
        this.matrix[row][column] = value;
    }

    public int getElement (int row, int column) {
        return this.matrix[row][column];
    }

    /*public final boolean equals(Matrix a) {
        if (this.getRow() == a.getRow() && this.getColumn() == a.getColumn())
        return true;
        else        return false;
    }*/

    public boolean equals (Object a) {

        if(a == this)
            return true;

        if (a instanceof Matrix) {
            Matrix tmp = (Matrix) a;

            if(this.getRow() == tmp.getRow() && this.getColumn() == tmp.getColumn())
            {
                for(int i = 0; i < this.getRow(); i++){
                    for(int j = 0; j < this.getColumn(); j++){
                        if(this.getElement(i, j) != tmp.getElement(i, j))
                            return false;
                    }
                }
                return true;
            }
            else return false;
        }
        else return false;
    }

    public String toString() {

        String S = "Matrix (size " + this.getRow() + "x" + this.getColumn() + "):" ;

        for (int i = 0; i < this.getRow(); i++) {
            S += "\n";
            for (int j = 0; j < this.getColumn(); j++)
                S += "\t" + this.matrix[i][j];
        }
        S += "\n";
        return S;
    }
}
