import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Notification EnvioMensagem;
        NotificationFactory Factorio = new NotificationFactory();
        int OpcaoSelecionada;

        do {
            System.out.println("Insira o que desejas fazer:");
            System.out.println("0 - Sair");
            System.out.println("1 - Enviar Email");
            System.out.println("2 - Enviar SMS");
            System.out.println("3 - Enviar Notificacao");
            OpcaoSelecionada = teclado.nextInt();

            switch (OpcaoSelecionada) {
                case 1:
                    EnvioMensagem = Factorio.createNotification("Email");
                    System.out.println(EnvioMensagem.sendNotification(EnviaMensagem()));
                    break;
                case 2:
                    EnvioMensagem = Factorio.createNotification("SMS");
                    System.out.println(EnvioMensagem.sendNotification(EnviaMensagem()));
                    break;
                case 3:
                    EnvioMensagem = Factorio.createNotification("PUSH");
                    System.out.println(EnvioMensagem.sendNotification(EnviaMensagem()));
                    break;
            }
        } while ( OpcaoSelecionada != 0 );

        System.out.println("Acabo!");
    }

    public static String EnviaMensagem() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a mensagem a ser enviada");
        return teclado.nextLine();
    }
}