package cybil.myshopmium;

/**
 * Created by Cybil on 10/09/2015.
 */
public class DiscountItem {

    private int imageId;
    private String title;
    private String subtitle;

    public DiscountItem(int imageId, String title, String subtitle) {
        this.imageId = imageId;
        this.title = title;
        this.subtitle = subtitle;
    }

    public void setImageId(int newId) {
        this.imageId = newId;
    }
    public int getImageId() {
        return this.imageId;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public String getTitle() {
        return this.title;
    }

    public void setSubtitle(String newSubtitle) {
        this.subtitle = newSubtitle;
    }
    public String getSubtitle() {
        return this.subtitle;
    }
}
