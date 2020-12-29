public class CorretoraSeguros {

    public void fazerPropostaSeguro(Seguravel seguravel){
        System.out.println("-------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("-------------------------------");
        System.out.println(seguravel.ObterDescricao());
        System.out.println("Valor da apólice: " + seguravel.CalcularApolice());
        System.out.println("-------------------------------");
    }
}
