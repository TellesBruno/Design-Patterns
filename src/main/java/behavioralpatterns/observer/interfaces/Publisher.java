package behavioralpatterns.observer.interfaces;

import behavioralpatterns.observer.clients.ContentCreator;
import behavioralpatterns.observer.product.Video;
import behavioralpatterns.observer.clients.Viewer;

public interface Publisher {
    void notifySubscribers(Video video, ContentCreator contentCreator);
    void uploadVideo(Video video, ContentCreator contentCreator);
    void subscribe(Viewer subscriber);
    void unsubscribe(Viewer subscriber);
}
