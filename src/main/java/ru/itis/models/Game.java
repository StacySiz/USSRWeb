package ru.itis.models;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY)
    private List<Review> reviews;

    @OneToOne
    private Image image;

    public String description;

    @Override
    public String toString() {
        String game = gameTitle + " " + genre + " " + releaseDate + " " + company + " ";
        return game;
    }
}
