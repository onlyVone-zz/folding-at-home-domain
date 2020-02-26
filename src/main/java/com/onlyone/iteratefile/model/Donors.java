package com.onlyone.iteratefile.model;

public class Donors implements java.io.Serializable {

    private static final long serialVersionUID = -7408593130850995529L;
    private String name;
    private Long score;
    private Long wu;
    private Long team_id;
    private Long rank;

    public Donors(String name, Long score, Long wu, Long team_id, Long rank) {
        this.name = name;
        this.score = score;
        this.wu = wu;
        this.team_id = team_id;
        this.rank = rank;
    }
    public Donors() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getWu() {
        return wu;
    }

    public void setWu(Long wu) {
        this.wu = wu;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    @Override
    public String toString() {
        return "Donors{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", wu=" + wu +
                ", team_id=" + team_id +
                ", rank=" + rank +
                '}';
    }
}

