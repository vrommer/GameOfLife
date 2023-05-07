package module

class Matrix {
    int n, m
    Cell[][] data

    Matrix( int n, int m ) {
        this.n = n
        this.m = m
        this.data = [][]
    }

    public init() {
        for ( int i = 0; 0 < this.n; i++ ) {
            for ( int j = 0; 0 < this.m; j++ ) {
                this.data[i][j] = new Cell()
            }
        }
    }
}
