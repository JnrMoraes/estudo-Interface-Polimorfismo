public class Barco implements Seguravel{

    private double valorMercado;
    private int anoFabricacao;

    public Barco(double valorMercado, int anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }


    public double CalcularApolice() {
        double valorApolice = this.valorMercado * 0.10;
        if(anoFabricacao < 2000 )
            valorApolice = valorApolice * 0.70;

        return valorApolice;
    }

    public String ObterDescricao() {
        return "Barco ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
    }
}
