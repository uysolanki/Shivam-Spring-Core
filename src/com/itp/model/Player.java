package com.itp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Player {

	private int jno;
	private String playerName;
	private int mp;
	private int rs;
	private String teams[];
	private ArrayList<String> trophies;
	private Map<String,Integer> centuries;
	
	public Player() {
		System.out.println("Player No Args Constructor Called");
	}
	public Player(int jno, String playerName, int mp, int rs) {
		this.jno = jno;
		this.playerName = playerName;
		this.mp = mp;
		this.rs = rs;
	}
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
	
	
	public String[] getTeams() {
		return teams;
	}
	public void setTeams(String[] teams) {
		this.teams = teams;
	}
	
	
	
	public ArrayList<String> getTrophies() {
		return trophies;
	}
	public void setTrophies(ArrayList<String> trophies) {
		this.trophies = trophies;
	}
	
	
	public Map<String, Integer> getCenturies() {
		return centuries;
	}
	public void setCenturies(Map<String, Integer> centuries) {
		this.centuries = centuries;
	}
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", playerName=" + playerName + ", mp=" + mp + ", rs=" + rs + ", teams="
				+ Arrays.toString(teams) + ", trophies=" + trophies + ", centuries=" + centuries + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
