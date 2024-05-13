package observer.padrao.projeto;

public class Main {
    public static void main(String[]args){
        DadosClimaticos dadosClimaticos = new DadosClimaticos();
        CondicoesClimaticasAtuais condicoesClimaticasAtuais = new CondicoesClimaticasAtuais();

        dadosClimaticos.registrarObserver(condicoesClimaticasAtuais);

        dadosClimaticos.setMedidas(28.2, 65, 1013.1);
        dadosClimaticos.setMedidas(22.9, 70, 1012.0);
    }
}
