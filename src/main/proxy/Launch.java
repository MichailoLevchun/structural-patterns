package main.proxy;

import main.proxy.model.ProxyInternet;
import main.proxy.service.InternetService;

public class Launch {

    public static void main(String[] args) {
        InternetService internet = new ProxyInternet();
        try{
            internet.connectTo("site.com");
            internet.connectTo("bannedSite.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


