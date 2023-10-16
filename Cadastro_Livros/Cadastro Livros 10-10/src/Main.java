import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sout = snipet para printar algo na tela
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
        System.out.println(" ");

        ArrayList<Livro> listaLivros = new ArrayList<>();

        // sout = snipet para printar algo na tela
        System.out.println("Bem vindo ao sistema de cadastro de Livros do Santo Sebo.");

        Scanner scannNumero = new Scanner(System.in);
        Scanner scannTxt = new Scanner(System.in);
        Scanner scannFloat = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:\n 1 = Cadastrar Livro(s).\n 2 = Listar Livro(s).\n 0 = Sair.");
            System.out.println();
            System.out.print("Opção: ");
            opcao = scannNumero.nextInt();


            switch (opcao){
                case 1:
                    Livro novoLivro = new Livro();
                    Autor novoAutor = new Autor();

                    System.out.println("Digite o Título do Livro: ");
                    novoLivro.titulo = scannTxt.nextLine();

                    System.out.println("Digite o nome do Autor do Livro: ");
                    novoAutor.nome = scannTxt.nextLine();

                    System.out.println("Digite o Local de Nascimento do Autor do Livro: ");
                    novoAutor.localNasc = scannTxt.nextLine();

                    novoLivro.autor = novoAutor;

                    System.out.println("Digite o Preço do Livro (formato: R$ xx,xx): ");
                    novoLivro.preco = scannFloat.nextFloat();

                    System.out.println("Digite a Data de Lançamento do livro (formato: dd/MM/yyyy): ");
                    LocalDate date = LocalDate.parse(scannTxt.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Period periodo = Period.between(date, LocalDate.now());

                    novoLivro.dataLancamento = date;

                    if (periodo.getYears() >= 5){
                        System.out.println();
                        System.out.println("==========================================================================");
                        System.out.println("==========================================================================");
                        System.out.println();
                        System.out.println("O livro TEM mais de 05 anos de lançamento e pôde ser cadastrado normalmente.\nCadastro realizado com sucesso!");
                        System.out.println();
                        System.out.println("==========================================================================");
                        System.out.println("==========================================================================");
                    }else {
                        System.out.println("==========================================================================");
                        System.out.println("==========================================================================");
                        System.out.println();
                        System.out.println("O livro NÃO TEM mais de 05 anos de lançamento, por este motivo o livro NÃO PODE SER CADASTRADO.");
                        System.out.println();
                        System.out.println("==========================================================================");
                        System.out.println("==========================================================================");
                        break;
                    }

                    listaLivros.add(novoLivro);

                    System.out.println();
                    System.out.println("Cadastro realizado com sucesso.");

                    break;

                case 2:
                    if (listaLivros.size() > 0){
                        for (Livro cadaLivro : listaLivros){
                            System.out.println("==========================================================================");
                            System.out.println("==========================================================================");
                            System.out.println();
                            System.out.println();
                            System.out.println("Título: " + cadaLivro.titulo);
                            System.out.println("Autor: " + cadaLivro.autor.nome);
                            System.out.println("Local de Nascimento do Autor: " + cadaLivro.autor.localNasc);

                            //Formatando para string, para formatar 2 casas decimais após a virgula e também mostra a vírgula ao invés de ponto
                            System.out.println("Preço do livro: " + String.format("%.2f", cadaLivro.preco));

                            //Tipo float, na saída/print, troca a vírgula por ponto e come o último zero (exemplo: 1,50 = 1.5)
                            //System.out.println("Preço: R$ " + cadaLivro.preco);
                            System.out.println("Data de Lançamento: " + cadaLivro.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                            System.out.println();
                            System.out.println("==========================================================================");
                            System.out.println("==========================================================================");

                        }

                    }else {
                        System.out.println("==========================================================================");
                        System.out.println("==========================================================================");
                        System.out.println();
                        System.out.println("Lista Vazia.");
                        System.out.println();
                        System.out.println("==========================================================================");
                        System.out.println("==========================================================================");
                    }

                    break;

                default:
                    System.out.println("==========================================================================");
                    System.out.println("==========================================================================");
                    System.out.println();
                    System.out.println("Você é burro ?!\nDigite uma opção válida.");
                    System.out.println();
                    System.out.println("==========================================================================");
                    System.out.println("==========================================================================");
                    break;
            }
        }while (opcao != 0);


    }
}