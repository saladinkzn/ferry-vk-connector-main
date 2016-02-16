package dto.wall;

/**
 * Created by sala on 16.12.15.
 */
public class Link {
    String url;
    String title;
    String caption;
    String description;
    Photo photo;
    int is_external;
    Object product;
    Object rating;
    Object application;
    Object button;
    Object preview_page;
    Object preview_url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public int getIs_external() {
        return is_external;
    }

    public void setIs_external(int is_external) {
        this.is_external = is_external;
    }

    public Object getProduct() {
        return product;
    }

    public void setProduct(Object product) {
        this.product = product;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Object getApplication() {
        return application;
    }

    public void setApplication(Object application) {
        this.application = application;
    }

    public Object getButton() {
        return button;
    }

    public void setButton(Object button) {
        this.button = button;
    }

    public Object getPreview_page() {
        return preview_page;
    }

    public void setPreview_page(Object preview_page) {
        this.preview_page = preview_page;
    }

    public Object getPreview_url() {
        return preview_url;
    }

    public void setPreview_url(Object preview_url) {
        this.preview_url = preview_url;
    }
}
