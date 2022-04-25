package behavioralpatterns.observer.clients;

import behavioralpatterns.observer.interfaces.Publisher;
import behavioralpatterns.observer.product.Video;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ContentCreator {
    String name;

    public void sendNewVideo(String videoName, String videoUrl, Publisher publisher) {
        Video video = new Video(videoName, videoUrl);
        publisher.uploadVideo(video, this);
    }
}
