package devices;

import com.zadanka.Human;
import com.zadanka.salleable;

import java.net.URL;
import java.util.List;

public class Phone extends Device implements salleable
{
    public static final String serveradress = "poczta.wsb.gov.pl";
    public static final String serverprotocol = "https";
    public static final String serverversion = "v1.0";

    @Override
    public String toString() {
        return "Phone{} model: " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon robi brrr");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this || buyer.cash < price) {
            System.out.println("Transakcja nie może zostać przeprowadzona");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Transakcja przeprowadzona pomyślnie");
        }
    }

    public void installAnnApp(String appName) {
        System.out.println("Zainstalowano " + appName);
    }

    public void installAnnApp(String appName, String version) {
        System.out.println("Zainstalowano " + appName + " wersja " + version);
    }

    public void installAnnApp(String appName, String version, String adress) {
        System.out.println("Zainstalowano " + appName + " wersja " + version + " z serwera " + adress);
    }

    public void installAnnApp(List<String> appNames) {
        for (String name : appNames) {
            System.out.println("Zainstalowano " + name);
        }

    }
        public void installAnnApp (URL url)
        {
            System.out.println("Zainstalowano aplikację z  " + url);
        }

    }
