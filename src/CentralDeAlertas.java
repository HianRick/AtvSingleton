import java.util.ArrayList;
import java.util.List;

public class CentralDeAlertas {

    private static CentralDeAlertas instancia;

    private List<String> mensagens = new ArrayList<>();

    //Construtor privado
    private CentralDeAlertas() {
    }


    public static CentralDeAlertas getInstancia() {
        if (instancia == null) {
            instancia = new CentralDeAlertas();
        }
        return instancia;
    }


    public void enviarAlerta(String orgao, String mensagem) {
        mensagens.add("[" + orgao + "] " + mensagem);
    }


    public List<String> getAlertas() {
        return mensagens;
    }
}