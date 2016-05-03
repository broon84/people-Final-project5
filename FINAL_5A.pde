//// People Final Project 5 //// Narada Brooks CST 112

float horizon;
float birdX=0, birdY=0;
float cloudX=0, cloudY=100;
int cloudN=7;

///
String author= "Narada Brooks"
String title= "Final Project #5"


float walkway= height-150;

/////person a,b;
int many=12;
person{} people= new person{many};


//// SETUP
void setup() {
  size(600,800);
  walkway= height-150;
  
  reset();
}

void reset(){
  
  
a = new person( random (30,60)  random(50,100 ) );
b = new person( random (30,60)  random(50,100 ) );

}

//// next frame....

void draw() {
  background( 122,243,252);
  scene();
  
  
  ////////
  float x=100, y=walkway
  a.show( x, y)
  
  
}

void scene() {
  no stroke();
  fill(214,216,216);
  rectMosde(CORNERS);
  rect(0,walkway,width,height);
}

void messages()
fill(0);textSize(24);
text(title, width/3,30);
textSize(16);
text( author, 20, height-20);

}


//// keys and clicks
void keypressed() {
  if (key == 'q') exit();
 if(key =='r') reset();
 

///CLASS Definition////

class Person {
  float w,h;
  float r,g,b;
  String name="";
  
  //// CONSTRUCTORS////
  
  Person( ){
    w=random(30,60);
    h=random(50,100);
////random.......
