package eduramza2019.mobile.codelab.com.superherosapp.model;

import com.google.gson.annotations.SerializedName;

public class HeroImage {
    @SerializedName("url")
    private String urlImage;

    public HeroImage(String url){
        this.urlImage = url;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
