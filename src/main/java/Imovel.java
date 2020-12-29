public class Imovel implements Seguravel {

    private double valorMercado;
    private int areaConstruida;

    public Imovel(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double CalcularApolice() {
        double valorApolice = this.valorMercado * 0.03;
        valorApolice = valorApolice + (areaConstruida * 0.5);

        return valorApolice;
    }

    public String ObterDescricao() {
        return "Imovel com área construida de " + this.areaConstruida + " m2 e valor de mercado " + this.valorMercado;
    }
}
