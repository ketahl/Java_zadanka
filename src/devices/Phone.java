package devices;

import com.zadanka.Human;
import com.zadanka.salleable;

import java.net.URL;
import java.util.*;

public class Phone extends Device implements salleable
{
    public static final String serveradress = "poczta.wsb.gov.pl";
    public static final String serverprotocol = "https";
    public static final String serverversion = "v1.0";
    public Human owner;
    public HashSet<Application> applications;

    public Phone(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
        applications = new HashSet<Application>();
    }
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
    public void installAnApp(Application app)
    {
        if (owner.cash < app.price)
        {
            System.out.println("Właściciel nie ma wystarczającej liczby pieniędzy na zakup tej aplikacji");
            return;
        }
        else
        {
            applications.add(app);
            owner.cash -= app.price;
            System.out.println("Aplikacja " + app.name + " została zainstalowana na urządzeniu");
        }
    }

    public boolean isAppInstalled(Application app)
    {
        return applications.contains(app);
    }

    public boolean isAppInstalled(String appName)
    {
        boolean appAlreadyInstalled = false;
        Iterator<Application> applicationsIterator = applications.iterator();
        while (applicationsIterator.hasNext())
        {
            if (applicationsIterator.next().name == appName)
            {
                appAlreadyInstalled = true;
                break;
            }
        }
        return appAlreadyInstalled;
    }

    public void printAllFreeApps()
    {
        System.out.println("Darmowe aplikacje: ");
        Iterator<Application> applicationsIterator = applications.iterator();
        while (applicationsIterator.hasNext())
        {
            Application app = applicationsIterator.next();
            if(app.price == 0)
            {
                System.out.println(app.name);
            }
        }
    }

    public  Double appsCombinedValue()
{
    Double appsValue = 0.0;
    Iterator<Application> applicationsIterator = applications.iterator();
    while (applicationsIterator.hasNext())
    {
        Application app = applicationsIterator.next();
        appsValue += app.price;
    }
    return appsValue;
    }
    public void printAppsAlphabeticaly()
    {
        System.out.println("Posortowane alfabetycznie: ");
        int length = applications.size();
        Application[] applicationsArray = new Application [length];
        Iterator<Application> applicationsIterator = applications.iterator();
        int i = 0;
        while (applicationsIterator.hasNext())
        {
            Application app = applicationsIterator.next();
            applicationsArray[i] = app;
            i++;
        }
        Arrays.sort(applicationsArray,Comparator.comparing(Application::getName));
        for(int j = 0; j < length; j++)
        {
            System.out.println(applicationsArray[j].name);
        }
    }
    public void printAppsBasedOnValue()
    {
        System.out.println("Posortowane po cenie: ");
        int length = applications.size();
        Application[] applicationsArray = new Application [length];
        Iterator<Application> applicationsIterator = applications.iterator();
        int i = 0;
        while (applicationsIterator.hasNext())
        {
            Application app = applicationsIterator.next();
            applicationsArray[i] = app;
            i++;
        }
        Arrays.sort(applicationsArray,Comparator.comparing(Application::getPrice));
        for(int j = 0; j < length; j++)
        {
            System.out.println(applicationsArray[j].name);
        }
    }

    }

