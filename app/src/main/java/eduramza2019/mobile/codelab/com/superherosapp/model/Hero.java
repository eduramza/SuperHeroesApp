package eduramza2019.mobile.codelab.com.superherosapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("powerstats")
    private List<Powerstats> powerstats= new ArrayList<>();
    @SerializedName("biography")
    private List<Biography> biographies = new ArrayList<>();
    @SerializedName("appearence")
    private List<Appearance> appearances = new ArrayList<>();
    @SerializedName("work")
    private List<Work> works = new ArrayList<>();
    @SerializedName("connections")
    private List<Connections> connections = new ArrayList<>();
    @SerializedName("image")
    private String urlImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Powerstats> getPowerstats() {
        return powerstats;
    }

    public void setPowerstats(List<Powerstats> powerstats) {
        this.powerstats = powerstats;
    }

    public List<Biography> getBiographies() {
        return biographies;
    }

    public void setBiographies(List<Biography> biographies) {
        this.biographies = biographies;
    }

    public List<Appearance> getAppearances() {
        return appearances;
    }

    public void setAppearances(List<Appearance> appearances) {
        this.appearances = appearances;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    public List<Connections> getConnections() {
        return connections;
    }

    public void setConnections(List<Connections> connections) {
        this.connections = connections;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
