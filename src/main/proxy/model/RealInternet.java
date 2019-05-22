package main.proxy.model;

import main.proxy.service.InternetService;

public class RealInternet implements InternetService {

    @Override
    public void connectTo(String url) {
        System.out.println("Connecting to " + url);
    }
}


