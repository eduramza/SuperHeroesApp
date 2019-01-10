package eduramza2019.mobile.codelab.com.superherosapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Appearance {
    @SerializedName("gender")
    private String gender;
    @SerializedName("race")
    private String race;
    @SerializedName("height")
    private List<Integer> height = new ArrayList<>();
    @SerializedName("weight")
    private List<Integer> weight = new ArrayList<>();
    @SerializedName("eye-color")
    private String eyeColor;
    @SerializedName("hair-color")
    private String hairColor;

    public Appearance(String gender, String race, List<Integer> height, List<Integer> weight,
                      String eyeColor, String hairColor){
        this.gender = gender;
        this.race = race;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public List<Integer> getHeight() {
        return height;
    }

    public void setHeight(List<Integer> height) {
        this.height = height;
    }

    public List<Integer> getWeight() {
        return weight;
    }

    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
