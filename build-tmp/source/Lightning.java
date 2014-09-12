import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX=0;
int startY=150;
int endX=0;
int endY=150;
public void setup()
{
  size(300,300);
  strokeWeight(2);
  background(0);
  noLoop();
}
public void draw()
{
	while (endX<300)
	{	
		endX=startX+(int)(Math.random()*10);
		endY=startY+(int)((Math.random()*20)-10);
		stroke(random(0,256),random(0,256),random(0,256));
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}
}
public void mousePressed()
{
	startX=0;
	startY=(int)((Math.random()*290)+5);
	endX=0;
	endY=(int)((Math.random()*290)+5);
	if (startY<150)
	{
		fill (0);
		rect (0,0,300,300);
	}
	else 
	{
		fill(250);
		rect(0,0,300,300);
	}
	redraw();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
