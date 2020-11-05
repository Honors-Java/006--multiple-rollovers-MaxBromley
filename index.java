void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	stroke(0);

  //start creating the lines
line(10, 10,250,10);
line(10,200,250,200);
line(10,10,10,200);
line(250,10,250,200);
 line(10,100,250,100);
  line(125,10,125,200);
  //Fill a black color

	if(mouseX < 125 && mouseY < 100){
rect(10,10,115,90);
  fill(0);

}
	if(mouseX < 125 && mouseY > 100){
rect(10,100,115,100);
  fill(0);
  }
	if(mouseX > 125 && mouseY < 100){
rect(125,10,125,90);
  fill(0);
  }
	if(mouseX > 125 && mouseY > 100){
rect(125,100,125,100);
  fill(0);
  }


}




  //Build your conditional statement 
	