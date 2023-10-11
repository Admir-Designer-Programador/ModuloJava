public class Main {
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            ArrayList<EnderecoLivraria> listapL = new ArrayList<EnderecoLivraria>();
            EnderecoLivraria metodospL = new EnderecoLivraria();


            System.out.println("Bem Vindo ao Sistema de Cadastro de Livros");

            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {

                System.out.println("Escolha uma opção: 1 - Cadastro / 0 - Sair");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        int opcao;

                        do {

                            System.out.println("Escolha uma opção: Cadastrar Pessoa Fisica / 2 - Lista Pessoa Fisica / 0 - Voltar ao menu anterio");
                            opcaoPf = scanner.nextInt();

                            switch (opcao) {

                                case 1:
                                    EnderecoLivraria novapl = new EnderecoLivraria();
                                    Livraria novoEndpL = new EnderecoLivraria();


                                    System.out.println("Digite o nome do Livro: ");
                                    novapf.nome = scanner.next();

                                    System.out.println("Digite o numero do livro: ");
                                    novapf.numero livro = scanner.next();

                                    System.out.println("Digite a retirada mensal (Digite Somente numero): ");
                                    novapf.retirada = scanner.nextInt();

                                    System.out.println("Digite a data de Lancamento (dd/MM/aaaa): ");
                                    LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                    Period periodo = Period.between(date, LocalDate.now());

                                    novapL.dataLancamento = date;

                                    if (periodo.getYears() >= 18) {
                                        System.out.println("A pessoa tem mais de 18 anos");
                                    } else {
                                        System.out.println("A pessoa tem menos de 18 anos. Retornando menu...");
                                        break;
                                    }

                                    System.out.println("Digite o Domo: ");
                                    novoEndpL.domo = scanner.next();

                                    System.out.println("Digite o número");
                                    novoEndpL.numero = scanner.next();

                                    System.out.println("Este endereço seu ou é trabalho? S/N: ");
                                    String endCom;
                                    endCom = scanner.next();

                                    if (endCom.equalsIgnoreCase("S")) {
                                        novoEndpL.endereco = true;
                                    } else {
                                        novoEndPf.enderecoTrabalho = false;
                                    }


                                    novapL.endereco = novoEndpL;

                                    listapL.add(novapL);

                                    System.out.println("Cadastro realizado com sucesso!");

                                    break;

                                case 2:

                                    if (listaPf.size()> 0){

                                        for (Livro cadapL: listapL) {
                                            System.out.println();
                                            System.out.println("Nome" + cadapL.nome);
                                            System.out.println("numero" + cadapL.cpf);
                                            System.out.println("Endereço" + cadapL.endereco.logradouro + "," + cadapL.endereco.numero);
                                            System.out.println("Data de Nascimento" + cadapL.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                                            System.out.println("Omposto a ser pago" + metodospL.CalcularEntrega(cadapL.retorno));
                                            System.out.println();
                                            System.out.println("Digite para continuar");
                                            scanner.nextInt();

                                            opcaoPf = scanner.nextInt();

                                        }
                                    }else {
                                        System.out.println("Lista vazia");
                                    }

                                    break;


                                case 0:
                                    System.out.println("Voltando ao menu anterior");
                                    break;
                                default:
                                    System.out.println("opcao invalida");
                                    break;

                            }

                        } while (opcaoPf != 0);

                        break;


                    case 0:
                        System.out.println("Obrigado por utilizar o nosso sistema! Forte Abraço! ");
                        break;
                    default:
                        System.out.println("Opçao invalida, por favor digite uma opcao valida");
                        break;
                }

            } while (opcao != 0);





        }

    }
}