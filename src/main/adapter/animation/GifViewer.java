package main.adapter.animation;

public class GifViewer implements AnimatedImageViewer {

    @Override
    public void watchGif(String name){
        System.out.println("Watching " + name + ".gif");
    }
}
