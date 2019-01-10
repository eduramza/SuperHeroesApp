package eduramza2019.mobile.codelab.com.superherosapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Biography {

    @SerializedName("full-name")
    private String fullName;
    @SerializedName("alter-egos")
    private String alterEgos;
    @SerializedName("aliases")
    private List<String> aliases;
    @SerializedName("place-of-birth")
    private String placeOfBirth;
    @SerializedName("first-appearence")
    private String firstAppearence;
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("alignment")
    private String alignment;

    public Biography(String fullName, String alterEgos, List<String> aliases, String placeOfBirth, String firstAppearence,
                     String publisher, String alignment){
        this.fullName = fullName;
        this.alterEgos = alterEgos;
        this.aliases = aliases;
        this.placeOfBirth = placeOfBirth;
        this.firstAppearence = firstAppearence;
        this.publisher = publisher;
        this.alignment = alignment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAlterEgos() {
        return alterEgos;
    }

    public void setAlterEgos(String alterEgos) {
        this.alterEgos = alterEgos;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getFirstAppearence() {
        return firstAppearence;
    }

    public void setFirstAppearence(String firstAppearence) {
        this.firstAppearence = firstAppearence;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
