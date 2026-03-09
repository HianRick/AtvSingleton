public class Main {

    public static void main(String[] args) {

        // Criando os órgãos
        Policia policia = new Policia();
        Bombeiro bombeiro = new Bombeiro();
        Samu samu = new Samu();

        // Enviando alertas
        policia.enviarAlerta("Roubo em andamento no centro.");
        bombeiro.enviarAlerta("Incêndio em prédio residencial.");
        samu.enviarAlerta("Acidente de trânsito com vítimas.");

        // Mostrando o hashCode da central para provar que é a mesma instância
        System.out.println("HashCode da Central (via Polícia): "
                + CentralDeAlertas.getInstancia().hashCode());

        System.out.println("HashCode da Central (via Bombeiro): "
                + CentralDeAlertas.getInstancia().hashCode());

        System.out.println("HashCode da Central (via SAMU): "
                + CentralDeAlertas.getInstancia().hashCode());

        // Listando alertas por órgãos diferentes
        System.out.println("\n=== ALERTAS VISTOS PELA POLÍCIA ===");
        policia.listarAlertas();

        System.out.println("\n=== ALERTAS VISTOS PELOS BOMBEIRO ===");
        bombeiro.listarAlertas();
    }
}


