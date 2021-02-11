import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private String description;
    private List<String> languages= new ArrayList<String>();
    private List<String> imageNames= new ArrayList<String>();
    private String repoLink;

    public Project(String name, String description, List<String> languages, List<String> imageNames, String repoLink) {
        this.name = name;
        this.description = description;
        this.languages = languages;
        this.imageNames = imageNames;
        this.repoLink = repoLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getImageNames() {
        return imageNames;
    }

    public void setImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
    }

    public String getRepoLink() {
        return repoLink;
    }

    public void setRepoLink(String repoLink) {
        this.repoLink = repoLink;
    }
}
