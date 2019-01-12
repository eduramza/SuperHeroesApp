package eduramza2019.mobile.codelab.com.superherosapp.model;

import android.graphics.Bitmap;
import android.net.Uri;

import com.google.gson.annotations.SerializedName;

public class Hero {
    @SerializedName("response")
    private String response;
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("powerstats")
    private Powerstats powerstats;
    @SerializedName("biography")
    private Biography biographies;
    @SerializedName("appearence")
    private Appearance appearances;
    @SerializedName("work")
    private Work works;
    @SerializedName("connections")
    private Connections connections;
    @SerializedName("image")
    private HeroImage image;

    public Hero(String response, String id, Powerstats powerstats, Biography biographies, Appearance appearances,
                Work works, Connections connections, HeroImage image){
        this.response = response;
        this.id = id;
        this.powerstats = powerstats;
        this.biographies = biographies;
        this.appearances = appearances;
        this.works = works;
        this.connections = connections;
        this.image = image;
    }


    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Powerstats getPowerstats() {
        return powerstats;
    }

    public void setPowerstats(Powerstats powerstats) {
        this.powerstats = powerstats;
    }

    public Biography getBiographies() {
        return biographies;
    }

    public void setBiographies(Biography biographies) {
        this.biographies = biographies;
    }

    public Appearance getAppearances() {
        return appearances;
    }

    public void setAppearances(Appearance appearances) {
        this.appearances = appearances;
    }

    public Work getWorks() {
        return works;
    }

    public void setWorks(Work works) {
        this.works = works;
    }

    public Connections getConnections() {
        return connections;
    }

    public void setConnections(Connections connections) {
        this.connections = connections;
    }

    public HeroImage getImage() {
        return image;
    }

    public void setImage(HeroImage image) {
        this.image = image;
    }
}
