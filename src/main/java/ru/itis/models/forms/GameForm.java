package ru.itis.models.forms;

import ru.itis.models.Platform;

import java.util.List;

public class GameForm {
    private String gameTitle;
    private String genre;
    private String releaseDate;
    private String company;
    private List<Platform> platform;

//    public GameForm(String gameTitle, String genre, String releaseDate, String company, String platform) {
//        this.gameTitle = gameTitle;
//        this.genre = genre;
//        this.releaseDate = releaseDate;
//        this.company = company;
//        this.platform = platform;
//    }

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

    public List<Platform> getPlatform() {
        return platform;
    }

    public void setPlatform(List<Platform> platform) {
        this.platform = platform;
    }
}
