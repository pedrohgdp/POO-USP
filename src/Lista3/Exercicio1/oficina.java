package Lista3.Exercicio1;

public class oficina {

    public Veiculo proximo(int contador){
        if(contador % 2 == 0){
            return new Bicicleta();
        }
        return new Automovel();
    }

    public void manutencao(Veiculo v){
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();
        if(v instanceof Automovel){
            ((Automovel) v).trocarOleo();
        }
    }
}
