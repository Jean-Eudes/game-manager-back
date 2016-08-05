package com.jeaneudes.domain;

import javax.persistence.*;
import java.io.Serializable;

import static com.jeaneudes.domain.GameProgression.TO_DO;

@Entity
@Table(name = "GAME")
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "progression")
    private GameProgression progression = TO_DO;

    @Column(name = "dematerialized")
    private boolean dematerialized = false;

    public Game() {
        progression = TO_DO;
    }

    public Game(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GameProgression getProgression() {
        return progression;
    }

    public void setProgression(GameProgression progression) {
        this.progression = progression;
    }

    public boolean isDematerialized() {
        return dematerialized;
    }

    public void setDematerialized(boolean dematerialized) {
        this.dematerialized = dematerialized;
    }

    public void toogleDematerialized() {
        this.dematerialized = !this.dematerialized;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Game{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", progression=").append(progression);
        sb.append(", dematerialized=").append(dematerialized);
        sb.append('}');
        return sb.toString();
    }
}
