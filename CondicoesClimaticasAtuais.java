package observer.padrao.projeto;

public class CondicoesClimaticasAtuais implements Observer {
    private double temperatura;
    private double umidade;

    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        display();
    }

    public void display(){
        System.out.println("Condições atuais: " + temperatura + " graus C e " + umidade + "% umidade");
    }
}
