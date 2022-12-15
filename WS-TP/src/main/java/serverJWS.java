import WS.BanqueService;
import jakarta.xml.ws.Endpoint;

public class serverJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0:9191/", new BanqueService());
        System.out.println("Web service deployé sur l'adresse http://0.0.0:9191/");
    }
}
