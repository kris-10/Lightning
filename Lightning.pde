int startX=0;
int startY=150;
int endX=0;
int endY=150;
void setup()
{
  size(300,300);
  strokeWeight(2);
  background(0);
  noLoop();
}
void draw()
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
void mousePressed()
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

