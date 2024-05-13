package observer.padrao.projeto;

public interface EstacaoMeteorologica {
    void registrarObserver(Observer o);
    void removerObserver(Observer o);
    void notifyObserver();
}
