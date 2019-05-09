package enums;

public enum SeatRowSymbol {
    A('A'), B('B'), C('C'), D('D'), E('E'), F('F');

    private char symbol;

    SeatRowSymbol(char symbol) {
        this.symbol = symbol;
    }
}
