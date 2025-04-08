package Lista3.Exercicio1;

public class main {
    public static void main(String[] args) {
        oficina o = new oficina();
        Veiculo v;
        for(int i=0;i<4;++i){
            v=o.proximo(i);
            o.manutencao(v);
        }
    }
}
