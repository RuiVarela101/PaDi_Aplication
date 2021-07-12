import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;
import app.*;
import ui.*;
import javax.swing.JFrame;

public class AppClasse{

    private static Passes passes = new Passes();
    private static Scanner key = new Scanner(System.in);

    public static void main(String[] args){
        String escolha;
        Home home = new Home(passes);
        home.startApp();
        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||||||||| PaDi Aplication |||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||\n\n");
        while(true){
            System.out.println("Insira o seu comando: ");
            escolha = key.nextLine();
            switch (escolha) {
                case "novoPasse" -> novoPasse();
                case "carregarPasse" -> carregarPasse();
                case "validarPasse" -> validarPasse();
                case "pagarViagem" -> pagarViagem();
                case "alterarPasse" -> alterarPasse();
                case "passarSaldo" -> passarSaldo();
                case "help" -> {
                    showHelp();
                    System.out.println("Pressione qualquer tecla para voltar.");
                    key.nextLine();
                }
                case "sair" -> System.out.println("Adeus e obrigado!");
                default -> System.out.println("Erro: Comando invalido. Digite o comando 'help' para obter ajuda.");
            }
        }

    } //ja esta

    static void showHelp(){
        String[] comandos = { "-> novoPasse: Criar um novo passe",
                              "-> carregarPasse: Carregar um passe existente",
                              "-> validarPasse: Verifica a existencia de um passe",
                              "-> pagarViagem: Pagar uma viagem",
                              "-> alterarPasse: Alterar dados de um passe",
                              "-> passarSaldo: Transferir uma quantia de saldo, de um passe para outro",
                              "-> help: Mostra os comandos disponibilizados pela aplicaçao",
                              "-> sair: Termina a execuçao do programa"
                            };
        System.out.println("Comandos disponiveis: ");
        for (String comando: comandos) {
            System.out.println("\t"+comando);
        }
    } //ja esta

    private static void novoPasse(){
        printSeparatingLine();
        String alternativas = """
                                 [1] -> Standard-Student
                                 [2] -> Standard-Jovem
                                 [3] -> Standard-Funcionario
                                 [4] -> Standard-Terceira Idade
                                 [5] -> Sazonal-Turista
                                 [6] -> Sazonal-Fest
                                 [7] -> Sair
                                 
                                 Que tipo de passe desejas criar? 
                                """;
        System.out.println(alternativas);
        boolean cont = true;
        int escolha;
        while (cont){
            escolha = key.nextInt();
            key.nextLine();
            switch (escolha){
                case (1): {criarPasseStudent(); cont = false; break;}
                case (2): {criarPasseJovem(); cont = false; break;}
                case (3): {criarPasseFuncionario(); cont = false; break;}
                case (4): {criarPasseTeridade(); cont = false; break;}
                case (5): {criarPasseTurista(); cont = false; break;}
                case (6): {criarPasseFest(); cont = false; break;}
                case (7): {cont = false; break;}
                default: {System.out.println("Erro: Escolha incorreta. Tente novamente!\n");
                          System.out.println(alternativas);}
            }
        }
        printSeparatingLine();
    } // ja esta

    private static void carregarPasse(){
        boolean codeiswrong = false;
        long codigo;
        do {
            if (codeiswrong){
                System.out.println("Erro: Codigo Invalido!");
            }
            System.out.println("Insira o codigo do passe que deseja carregar: ");
            codigo = key.nextLong();
            codeiswrong = true;
        }while (Passes.validarPasse(codigo)); // apanhar o segundo codigo
        double saldo;
        codeiswrong = false; // reutilizaçao para o proximo input
        do {
            System.out.println("Insira a quantidade que deseja transferir: ");
            saldo = key.nextDouble();
            if (codeiswrong)
                System.out.println("Erro: A quantidade deve ser maior que Zero");
            codeiswrong = true;
        }while(saldo <= 0);
        passes.carregarPasse(codigo, saldo);
    } //ja esta

    private static void validarPasse(){
        printSeparatingLine();
        System.out.println("Insira o codigo do passe que deseja validar: ");
        if (passes.validarPasse(key.nextLong()))
            System.out.println("Passe Valido!");
        else
            System.out.println("Passe Invalido!");
        printSeparatingLine();
    } // ja esta

    private static void pagarViagem(){
        boolean codeiswrong = false;
        long codigo;
        do {
            if (codeiswrong){
                System.out.println("Erro: Codigo Inexistente!");
            }
            System.out.println("Insira o codigo do passe: ");
            codigo = key.nextLong();
            codeiswrong = true;
        }while (Passes.validarPasse(codigo)); // apanhar o primeiro codigo
        passes.pagarViagem(codigo);
    } //ja esta

    private static void alterarPasse(){
        System.out.println("Insira o codigo do passe que deseja alterar: ");
        passes.alterarPasse(key.nextLong());
    } // ja esta

    private static void passarSaldo(){
        long codigo1, codigo2;
        boolean codeiswrong = false;
        printSeparatingLine();
        do {
            if (codeiswrong){
                System.out.println("Erro: Codigo Invalido!");
            }
            System.out.println("Insira o codigo do passe onde será retirado o saldo: ");
            codigo1 = key.nextLong();
            codeiswrong = true;
        }while (Passes.validarPasse(codigo1)); // apanhar o primeiro codigo
        codeiswrong = false;
        do {
            if (codeiswrong){
                System.out.println("Erro: Codigo Invalido!");
            }
            System.out.println("Insira o codigo do passe onde será transferido o saldo: ");
            codigo2 = key.nextLong();
            codeiswrong = true;
        }while (Passes.validarPasse(codigo2)); // apanhar o segundo codigo
        double saldodisponivel;
        double saldo;
        codeiswrong = false; // reutilizaçao para o proximo input
        System.out.println("Insira a quantidade que deseja transferir: ");
        do {
            saldo = key.nextDouble();
            saldodisponivel = passes.getSaldo(codigo1);
            if (codeiswrong)
                System.out.println("Erro: O passe emissor nao possui saldo suficiente para realizar a tranferencia");
            codeiswrong = true;
        }while(saldo > saldodisponivel);
        passes.transferirSaldo(codigo1, codigo2, saldo);
        printSeparatingLine();
    } //ja esta

    static void criarPasseStudent(){
        Titular titular = criarTitular();
        int ano;
        boolean wrong = false;
        do {
            if (wrong)
                System.out.println("Erro: O ano deve estar no intervalo de 1 à 12");
            System.out.println("Insira o ano de escolaridade do Titular: ");
            ano = key.nextInt();
            wrong = true;
        }while( 0 < ano && ano < 12 ); //receber ano de escolaridade
        System.out.println("Introduza o nome da Escola: ");
        String escola = key.nextLine();
        EpassStudent passe = new EpassStudent(titular, escola, ano);
        passes.adicionarPasse(passe);
        System.out.println("Novo passe Student criado com sucesso!");
    } //ja esta

    static void criarPasseJovem(){
        Titular titular = criarTitular();
        EpassJovem passe = new EpassJovem(titular);
        passes.adicionarPasse(passe);
        System.out.println("Novo passe Jovem criado com sucesso");
    } //ja esta

    static void criarPasseFuncionario(){
        Titular titular = criarTitular();
        EpassFuncionario passe = new EpassFuncionario(titular);
        passes.adicionarPasse(passe);
        System.out.println("Novo passe Funcionario criado com sucesso");
    } //ja esta

    static void criarPasseTeridade(){
        Titular titular = criarTitular();
        EpassTeridade passe = new EpassTeridade(titular);
        passes.adicionarPasse(passe);
        System.out.println("Novo passe Terceira Idade criado com sucesso");
    } //ja esta

    static void criarPasseTurista(){
        String menu = "Escolha a duraçao do passe:\n    1->1 dia\n    2->3 dias\n    3->7 dias\n //:";
        int escolha;
        Duracao duracao= Duracao.Um;
        do{System.out.print(menu);
            escolha = key.nextInt();
            key.nextLine(); // limpar buffer
        }while(escolha > 3 || escolha < 1);
        switch (escolha){ // nao é preciso fazer nada em Case 1 porque ja tem aquele valor
            case 2-> duracao = Duracao.Tres;
            case 3-> duracao = Duracao.Sete;
        }
        passes.adicionarPasse(new EpassTurista(duracao));
        System.out.println("Novo passe Turista criado com sucesso!");
    }

    static void criarPasseFest(){
        String evento;
        double saldo;
        do{
            System.out.println("Introduza o saldo do passe (>500): ");
            saldo = key.nextDouble();
            key.nextLine(); // limpar buffer
        }while(saldo < 500);
        System.out.println("Introduza o nome do Evento: ");
        evento = key.nextLine();
        passes.adicionarPasse(new EpassFestival(saldo, evento));
        System.out.println("Novo passe Festival criado com sucesso!");
    }

    static Titular criarTitular(){
        String codigoDoc, email, nome;
        int escolha, dia, mes, ano;
        TipoDocumento tipoDoc = null;
        LocalDate ddn = null;
        do {
            System.out.println("Insira o nome do titular.\n  Deve conter 2 ou mais elementos com um minimo de 5 leteras cada: ");
            nome = key.nextLine();
        }while(nome.split(" ").length < 2 &&
                nome.split(" ")[0].length() < 5 &&
                nome.split(" ")[nome.split(" ").length-1].length() < 5);
        System.out.println("Insira o email do Titular: ");
        email = key.nextLine();
        System.out.println("Insira o codigo do Documento do Titular: ");
        codigoDoc = key.nextLine();
        boolean go = true;
        while(go) {
            go = false;
            System.out.println("Tipos de Documentos:\n [1] -> BI\n [2] -> CUC\n [3] -> PASSAPORTE \n [4] -> TER\n  Escolha o tipo de documento: ");
            escolha = key.nextInt();
            switch (escolha) {
                case 1 -> tipoDoc = TipoDocumento.BI;
                case 2 -> tipoDoc = TipoDocumento.CUC;
                case 3 -> tipoDoc = TipoDocumento.PASSPORT;
                case 4 ->tipoDoc = TipoDocumento.TER;
                default -> {System.out.println("Erro: Escolha invalida!"); go = true;}
            }
        }  // tomar o tipo do documento
        go = true;
        while(go){
            System.out.println("Insira o dia do nascimento do Titular: ");
            dia = key.nextInt();
            System.out.println("Insira o mes do nascimento do Titular: ");
            mes = key.nextInt();
            System.out.println("Insira o ano do nascimento do Titular: ");
            ano = key.nextInt();
            try{
                go = false;
                ddn = LocalDate.of(ano, mes, dia);

            } catch (DateTimeException e){
                System.out.println("Erro: Data invalida!");
                go = true;
            }
        }
        return new Titular(codigoDoc, tipoDoc, nome, ddn, email);
    }

    static void printSeparatingLine(){
        System.out.println("\n-------------------------------------------------------\n");
    } // ja esta

}
