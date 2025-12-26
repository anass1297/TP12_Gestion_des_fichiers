package com.example.tp;

import java.io.Serializable;

public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private double score;

    public Record(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Record{id=" + id + ", name='" + name + "', score=" + score + "}";
    }

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
