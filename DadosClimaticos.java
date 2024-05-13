package observer.padrao.projeto;

import java.util.ArrayList;
import java.util.List;

public class DadosClimaticos implements EstacaoMeteorologica{

    List<Observer> observers;
    double temperatura;
    double umidade;
    double pressao;

    public DadosClimaticos(){
        observers = new ArrayList<>();
    }

    @Override
    public void registrarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.atualizar(temperatura, umidade, pressao);
        }
    }

    public void medidasMudaram(){
        notifyObserver();
    }

    public void setMedidas(double temperatura, double umidade, double pressao){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        medidasMudaram();
    }
}
