package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	
	String[] ArrayList = {"D", "E", "F", "G", "A", "B", "c", "d"};
	String[] Type = {"Crotchet", "Quaver"};
	int[] duration = {1, 2};
	
	public void loadScore() {
		
		for(int i = 0; i < ArrayList.length; i++) {
			
			textAlign(CENTER, CENTER);
			text(ArrayList[i]);
		}
		
	}
	
	public void drawLines {
		
		strokeWeight(3);
		line(10,75,400,75);
		strokeWeight(3);
		line(10,100,400,100);
		strokeWeight(3);
		line(10,125,400,125);
		strokeWeight(3);
		line(10,150,400,150);
		strokeWeight(3);
		line(10,175,400,175);
		
	}
	
	public void printScores() {
		
		for(int i = 0; i < ArrayList.length; i++) {
			
			println(ArrayList[i] + "\t" + duration[i]);
		}
		if (duration[] = 0) {
			println("\t" + Type[0]);
		}
		else {
			println("\t" + Type[1]);
		}
		
	}
	
	public void Note() {
		
		private char note;
		private int duration;
	}
	
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		
		public char charAt(int index);
		public static boolean isDigit(char ch);
		printScores();
	}

	public void draw()
	{
		background(255);
		drawLines();
		loadScore();
		
	}

	void drawNotes()
	{
	}
}
