package main.proxy;

public class Launch {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("site.com");
            internet.connectTo("bannedSite.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


