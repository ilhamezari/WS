package WS;
import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
import proxy.Listecomptes;

import java.awt.*;
import java.util.Date;
import java.util.List;

public class clientWS {
    public static void main(String[] args) {
        BanqueService Stub = new BanqueWS().getBanqueServicePort() ;
        {
            System.out.println(Stub.convert(7600));
            Compte cp= Stub.getcompte(5); //consulter le WS
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());
           // System.out.println(cp.getDateCreation());


            }
        }
    }


