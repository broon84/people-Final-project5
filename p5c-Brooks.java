//// Project 5      CST112 Narada Brooks......///////


String title=  "My Neighborhood";
String author=  "Narada Brooks, CST112";
String help= "Press the first letter of a function ( or 'Q' to Quit)";

Button[] buttons;
String buttonNames[]=  { "Bird", "Tall", "Short", "Order", "Reset", "Quit" };
int numButtons=  buttonNames.length;

float walkway;

float birdX=0, birdY=0;
float cloudX=0, cloudY=100;
int cloudN=40;

float wave;
float cloudDX;


String[] names={  "Tammy", "Bammy", "Gammy", "Jammy",
  "Sammy", "Pammy", "Dammy", "Rammy",
  "Nammy", "Kammy", "Lammy", "Mammy" };

//--  Person a, b;
int many=8;
Person[] dude=  new Person[many];

//// SETUP.
void setup() {
  size(800, 600);
  walkway=  height-150;

  reset();
  makebuttons();
}
void makebuttons() {
    buttons=  new Button[numButtons];
    float x=150, y=50;
    for (int j=0; j<numButtons; j++ ) {
      buttons[j]=  new Button( x, y, buttonNames[j] );
      y += 50;
    }
    
}


void reset() {
 
  for (int j=0; j<many; j++ ) {
    dude[j]=  new Person( names[j] );
  }
}
////draw bird
void fly( float x, float y) {
  birdX += (x-birdX) / 30;
  birdY += (y-birdY) / 30;
  
  fill(255,255,0);
  
  ellipse( birdX,birdY, 30,20);
  fill(250,50,0);
  ellipse( birdX+20,birdY, 10,10);
  
  float top=  birdX%30<10?-30:30;
  triangle( birdX-10,birdY, birdX+10,birdY, birdX,birdY-top );
}


//// NEXT FRAME
void draw() {
  background(200, 243, 252);
  scene();
  showAll();    
  messages();
  clouds();
  grass();
  buttons();
  
  if (birdX>0) fly( 400, walkway-width/8 );
}

void clouds() {
  fill( 250,250,250, 100 );
  noStroke();
  
  float xx=cloudX, yy=cloudY, ww=80, hh=30;
  for (int j=0; j<cloudN; j++) {
    ellipse( xx,yy, ww,hh );
    xx -= ww;
    yy+=  hh/2;
    ww *= 0.9;
    hh *= 0.9;
  }
  
  cloudX++;
  if (cloudX>width+400) {
    cloudX=0;
    cloudY=  random(height/2);
    cloudN=  int( random( 1,7.5 ) );
  }
}
///Buttons///
void buttons() {
  for (int j=0; j<buttonNames.length; j++) {
    buttons[j].show();
  }
}
///scene 
void scene() {
  noStroke();
  fill(214, 216, 216);
  rectMode(CORNERS);
  rect(0, walkway, width, height);
}

// Display all objects in array.
void showAll() {
  float x=50, y=walkway;
  

  for (int j=0; j<many; j++ ) {
    dude[j].show( x, y );
    x=  x + 100;
  }
}  

void messages() {
  fill(0);
  textSize(24);
  text( title, width/3, 30 );
  textSize(16);
  text( author, 20, height-20 );
  text( help, width/4, 50 );
  text( "Keys:  Order, Bird, Shortest, Quit, Random, Tallest", width/4, 65 );
}

void shorty( Person[] p, int m ) {
  int k;
  k=  whereShort( p, m );
  swap( p, k, m-1 );
}
//////Button function///

void mousePressed() {
  
  if ( buttons[0].click(mouseX,mouseY) ) { shorty( dude, many   ); return; }
  if ( buttons[1].click(mouseX,mouseY) ) { tall( dude, many  ); return; }
  //--  if ( buttons[2].click(mouseX,mouseY) ) { bird(); return; }
  if ( buttons[3].click(mouseX,mouseY) ) { order( dude, many  ); return; }
  if ( buttons[4].click(mouseX,mouseY) ) { reset(); return; }
  if ( buttons[5].click(mouseX,mouseY) ) { exit(); return; }

  //rupeesX=  mouseX;
  //rupeesY=  mouseY;
 
  //grizzX=0;
  //grizzY= random(15, height-30);
}
//// EVENTS:  keys, clicks
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
  if (key == 'b') birdX=birdY=1;
  if (key == 's') shorty( dude, many );
  if (key == 't') tall( dude, many );
  if (key == 'o') order( dude, many );
}
// Move tallest (or shortest) to end
void tall( Person[] p, int m ) {
   println( "tall "+ m );                     ///trying to fiure tis out.....  
  int k;
  k=  whereTall( p, m );
  println( "swap "+ k +","+ (m-1) );        ///trying to fiure tis out.....
  swap( p, k, m-1 );
}
// Find the index of tallest (or shortest).
int whereTall( Person[] p, int m ) {
  int iTallest=0;
  for (int j=1; j<many; j++ ) {
    if ( p[j].h > p[iTallest].h ) iTallest=j;
  }
  return iTallest;
}
int whereShort( Person[] p, int m ) {
  int iShortest=0;
  for (int j=1; j<many; j++ ) {
    if ( p[j].h < p[iShortest].h ) iShortest=j;
  }
  return iShortest;
}
// Swap 2 elements of array.
void swap( Person[] p, int a, int b ) {
  Person tmp;
  tmp=  p[a];
  p[a]=  p[b];
  p[b]=  tmp;
}


// Sort entire array. //
void order( Person q[], int m ) {
  for (int k=m; k>1; k--) {
    println( "*** k="+k );         ///trying to figure tis out.....
    tall( q, k );
  }
}


//// CLASS DEFINITIONS ////
class Person {
  float w, h;
  float r, g, b;
  String name="?";
  //// CONSTRUCTORS ////
  Person( String me ) {
    w=  random( 30, 60 );
    h=  random( 50, 100 );
    // Random colors.
    r=  random(200);
    g=  random(200);
    b=  random(200);
    name=  me;
  }

  //// METHODS:  move & show ////

  void show( float x, float y ) {
    fill( r, g, b );
    rectMode( CENTER );
    rect( x, y-h/2, w, h );
    float shoulder=  y-h;
    float hh=  h/3;        // Head height.
    ellipse( x, shoulder-hh/2, hh, hh );
    eye( x-6, shoulder-6-hh/2 );
    eye( x+6, shoulder-6-hh/2 );
    //
    text( name, x-20, y+20 );
    text( w, x-20, y+32 );
    text( h, x-20, y+44 );
  }
  void eye( float x, float y ) {
    fill(255);
    ellipse( x, y, 8, 8 );
    fill(0, 0, 255);
    ellipse( x, y, 4, 4 );
  }
}

// Draw blades of grass, waving in the wind.

void grass() {
  float wave=  cloudDX>2 ? 10 : -10;
  
  stroke(355,255,0);
  strokeWeight(6);
  for (float x=100; x<width; x+=10) {
    line( x,height, x+wave,height-40 );
  }
    strokeWeight(1);
}

//// OBJECTS ////
class Button {
  float x,y;
  float w=80, h=30;
  String name;
  float r=255, g=255, b=0;
  // CONSTRUCTOR //
  Button( float x, float y, String s ) {
    this.x=x;
    this.y=y;
    this.name=  s;
  }
  // METHODS //// Draw the button.
  
  
  
  void show() {
    stroke(0);
    fill(r,g,b);
    rect( x,y, w,h );
    fill(0);
    text( name,  x+5, y+h*2/3 );
  }
  
  
  // Return true if inside button rect.
  boolean click( float xx, float yy ) {
    if (xx < x)   return false;
    if (xx > x+w) return false;
    if (yy < y)   return false;
    if (yy > y+h) return false;
    return true;
  }
    
  
}
