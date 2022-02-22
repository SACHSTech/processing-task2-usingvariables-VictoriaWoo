import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// size call (ratio is 1.5:1)
    size(900, 600);
  }

  /** 
   * initial set up (background)
   */
  public void setup() {
    background(196, 212, 201);
  }

  /**
   * Drawn to the screen
   */
  public void draw() {
	  
    // Rainbow
    fill(239, 115, 113);
    ellipse(width/2, height * 7/8, width * 2/3, height);
    fill(248, 181, 129);
    ellipse(width/2, height * 15/16, width * 3/5, height);
    fill(253, 230, 151);
    ellipse(width/2, height, width * 8/15, height);
    fill(151, 186, 129);
    ellipse(width/2, height * 17/16, width * 7/15, height);
    fill(132, 146, 184);
    ellipse(width/2, height * 9/8, width * 2/5, height);
    fill(168, 148, 186, 255);
    ellipse(width/2, height * 19/16, width * 1/3, height);
    fill(196, 212, 201);
    ellipse(width/2, height * 5/4, width * 4/15, height);

  	// Grass
    fill(60, 171, 86);
    rect(0, height * 7/8, width, height * 1/8);

    // Sun
    fill(255, 245, 130);
    circle(width, 0, width/4);
    line(width * 5/6, height * 1/20, width * 23/30, height * 1/10);
    line(width * 7/8, height * 1/8, width * 49/60, height * 3/16);
    line(width * 11/12, height * 3/16, width * 7/8, height * 1/4);
    line(width * 29/30, height * 9/40, width * 19/20, height * 3/10);

    // Path
    fill(155, 118, 83);
    quad(width * 29/60, height * 7/8, width * 31/60, height * 7/8, width * 3/5, height, width * 2/5, height);

  }
  
}