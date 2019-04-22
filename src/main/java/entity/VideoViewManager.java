package entity;

public class VideoViewManager {
    private String id;
    private String title;
    private String view;

    public VideoViewManager() {
    }

    public VideoViewManager(String id, String title, String view) {
        this.id = id;
        this.title = title;
        this.view = view;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
