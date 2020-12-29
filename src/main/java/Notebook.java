public class Notebook implements Seguravel {

    private double valorMercado;
    private int anoFabricacao;

    public Notebook(double valorMercado, int anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }


    public double CalcularApolice() {
        double valorApolice = this.valorMercado * 1.25;
        if(anoFabricacao > 2018){
            valorApolice = valorApolice * 2;
        }

        return valorApolice;
    }

    public String ObterDescricao() {
        return "Notebook ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
    }
}
