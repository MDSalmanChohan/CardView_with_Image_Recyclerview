public class DataModel {
    private String title;
    private String subtitle;
    private int imageResource;

    public DataModel(String title, String subtitle, int imageResource) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getImageResource() {
        return imageResource;
    }
}
