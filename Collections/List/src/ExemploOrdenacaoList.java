import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Dadas as seguintes informações sobre os clientes, crie uma lista e ordene esta lista exibindo:
//nome-cpf-cep
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>(){{
           add(new Cliente("Will", 0000000, 52121200));
           add(new Cliente("Lucas", 0000000, 444444));
           add(new Cliente("Pedro", 0000000, 44444));
        }};

        System.out.println("Ordem de Inserção: ");
        System.out.println(clientes);

        System.out.println("Ordem Aleatoria: ");
        Collections.shuffle(clientes);

        System.out.println("Ordem Natural (nome): ");
        Collections.sort(clientes);
    }
}

class Cliente implements Comparable<Cliente>{
    private String nome;
    private int cpf;
    private int cep;

    public Cliente(String nome, int cpf, int cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", cep=" + cep +
                '}';
    }

    //CompareTo retorna um int que vai ser organizado na ordem
    @Override
    public int compareTo(Cliente cliente) {
        //quando o retorno der 0 quer dizer que o cliente que eu estou comparando com o proximo cliente dentro da lista
        //Se der 0 é porque esses clientes tem os nomes iguais, se der 1 o cliente que eu to comparando tem que ficar
        //depois, ou seja, é maior do que o cliente que eu estou comparando, se o retorno der -1 quer dizer que o
        //Cliente que estou comparando é menor do que está sendo comparado
        return this.getNome().compareTo(cliente.getNome());
    }
}
