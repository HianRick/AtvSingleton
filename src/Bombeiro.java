import java.util.List;

public class Bombeiro {

    private CentralDeAlertas central = CentralDeAlertas.getInstancia();

    public void enviarAlerta(String mensagem) {
        central.enviarAlerta("Bombeiros", mensagem);
    }

    public void listarAlertas() {
        List<String> alertas = central.getAlertas();
        for (String alerta : alertas) {
            System.out.println(alerta);
        }
    }
}