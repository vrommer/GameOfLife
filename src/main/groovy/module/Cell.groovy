package module

class Cell {
    boolean state
    int generation
    List neighbours

    Cell() {
        state = false
        generation = 0
        neighbours = null
    }

    void setState( boolean state ) {
        this.state = state
    }

    int getGeneration() {
        return generation
    }

    void setGeneration( int generation ) {
        this.generation = generation
    }

    List getNeighbours() {
        return neighbours
    }

    void setNeighbours( List neighbours ) {
        this.neighbours = neighbours
    }
}
