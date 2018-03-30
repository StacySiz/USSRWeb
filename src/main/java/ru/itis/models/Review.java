package ru.itis.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Size(min = 1,max = 120)
    private String authorEmail;

    @NotNull
    @Size(min = 1,max = 50)
    private String gameTile;

    @NotNull
    @Size(min = 1,max = 10)
    private String score;

    @NotNull
    private String reviewDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getGameTile() {
        return gameTile;
    }

    public void setGameTile(String gameTile) {
        this.gameTile = gameTile;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }
}
