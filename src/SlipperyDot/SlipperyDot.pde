// 4. create three integer variables to  
//    represent the x, y, and the size of the ellipse
int x = 250;
int y = 250;
int es = 20;
void setup() {
  //1. set the size of your sketch
  size(500, 500);
}

void draw() {
  //2. set the background color of your sketch
  background(#8F13A0);
  //3. draw an ellipse. Make sure it fits in the window.
  ellipse(x, y, es, es);
  //5. use the variables created in step 4 in place of the numbers
  //   in your ellipse
}

void mousePressed() {
  //6a. create an integer variable called distance
  int d;
  //6b. use the getDistance method to initialize your varible
  //    use the mouse's x and y and the x and y of your ellipse 
  d = getDistance(mouseX, mouseY, x, y);
  //7. print the distance variable
  println(d);

  //8a. make an if statement to check if the distance variable
  //   is within the size of the ellipse
  if (d<10) {

    //8b.  set the x and y of the ellipse to a random location on the window
    x = (int) random(500);
    y = (int) random(500);
  }
}
int getDistance(int x1, int y1, int x2, int y2) {
  return (int)Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
}