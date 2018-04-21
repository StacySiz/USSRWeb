package ru.itis.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "game",schema = "public")
public class Game {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @NotNull
    @Size(min = 1,max = 50)
    private String gameTitle;

    @NotNull
    @Size(min = 1,max = 50)
    private String genre;

    @NotNull
    private String releaseDate;

    @NotNull
    @Size(min = 1,max = 50)
    private String company;

    @OneToMany(mappedBy = "game", fetch = FetchType.EAGER)
    private List<Review> reviews;

    @NotNull
    @ManyToMany(mappedBy = "games")
    private List<Platform> platform;

    private String pic;

    public List<Platform> getPlatform() {
        return platform;
    }

    public void setPlatform(List<Platform> platform) {
        this.platform = platform;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        String game = gameTitle + " " + genre + " " + releaseDate + " " + company + " " + platform;
        return game;
    }
}
