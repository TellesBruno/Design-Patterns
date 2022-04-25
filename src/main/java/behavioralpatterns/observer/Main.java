package behavioralpatterns.observer;

import behavioralpatterns.observer.clients.ContentCreator;
import behavioralpatterns.observer.clients.Viewer;
import behavioralpatterns.observer.plataform.VODplataform;

public class Main {
    static VODplataform myTube = new VODplataform();
    static Viewer viewer1 = new Viewer("Joao", "joao@email.com");
    static Viewer viewer2 = new Viewer("maria", "maria@email.com");
    static Viewer viewer3 = new Viewer("Jose", "jose@email.com");
    static ContentCreator contentCreator = new ContentCreator("Carlos");


    public static void main(String[] args) {
        myTube.subscribe(viewer1);
        myTube.subscribe(viewer2);
        //myTube.subscribe(viewer3);

        contentCreator.sendNewVideo("Hello World!", "/d5A61Cz", myTube);
        contentCreator.sendNewVideo("Hello World!2", "/d5A62Cz", myTube);
    }
}
