public class Main {
    public static void main(String[] args) {
     CorretoraSeguros corretoraSeguros = new CorretoraSeguros();

     Carro meuCarro = new Carro(45000d, 2012);
     Imovel meuImovel = new Imovel(92000, 320);
     Barco meuBarco = new Barco(1250000, 1998);
     Notebook meuNotebook = new Notebook(2500, 2018);


     corretoraSeguros.fazerPropostaSeguro(meuCarro);
     corretoraSeguros.fazerPropostaSeguro(meuImovel);
     corretoraSeguros.fazerPropostaSeguro(meuBarco);
     corretoraSeguros.fazerPropostaSeguro(meuNotebook);

    }
}
