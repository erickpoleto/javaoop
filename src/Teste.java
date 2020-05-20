import com.sun.source.doctree.SystemPropertyTree;

public class Teste {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Erick");
        gerente.setCpf("86592696087");
        gerente.setSalario(500.50);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacao());

    }
}
