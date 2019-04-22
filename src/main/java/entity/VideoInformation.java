package entity;

public class VideoInformation {
    private String day;
    private String id;
    private String titile;
    private String view;

    public VideoInformation() {
    }

    public VideoInformation(String day, String id, String titile, String view) {
        this.day = day;
        this.id = id;
        this.titile = titile;
        this.view = view;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
