package behavioralpatterns.observer.plataform;

import behavioralpatterns.observer.clients.ContentCreator;
import behavioralpatterns.observer.product.Video;
import behavioralpatterns.observer.clients.Viewer;
import behavioralpatterns.observer.interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

public class VODplataform implements Publisher {
    List<Viewer> viewers = new ArrayList<>();

    @Override
    public void notifySubscribers(Video video, ContentCreator contentCreator) {
        for(Viewer viewer : viewers){
            System.out.println("Notifying " + viewer.getName() + " about new video "
                    + video.getName() + " from " + contentCreator.getName());
        }
    }

    @Override
    public void uploadVideo(Video video, ContentCreator contentCreator) {
        notifySubscribers(video, contentCreator);
    }

    @Override
    public void subscribe(Viewer subscriber) {
        viewers.add(subscriber);
    }

    @Override
    public void unsubscribe(Viewer subscriber) {
        viewers.remove(subscriber);
    }
}
