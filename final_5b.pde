//// Project 5 beginnings.
//// WHO???

String title=  "Project 5";
String author=  "Narada Brooks";
float sidewalk;


String[] names={  "Alpha", "Beta", "Gamma", "Delta",
  "Epsilon", "Zeta", "Eta", "Theta",
  "Iota", "Kappa", "Lambda", "Mu" };

//--  Person a, b;
int many=8;
Person[] people=  new Person[many];

//// SETUP.
void setup() {
  size(800, 600);
  sidewalk=  height-150;

  reset();
}

void reset() {
  /*
  a=  new Person( );
   b=  new Person( );
   */
  for (int j=0; j<many; j++ ) {
    people[j]=  new Person( names[j] );
  }
}

//// NEXT FRAME
void draw() {
  background(200, 243, 252);
  scene();
  showAll();    
  messages();
}

void scene() {
  noStroke();
  fill(214, 216, 216);
  rectMode(CORNERS);
  rect(0, sidewalk, width, height);
}

// Display all objects in array.
void showAll() {
  float x=50, y=sidewalk;
  /*
      a.show( x, y );
   x=  x + 100;
   b.show( x, y );
   */

  for (int j=0; j<many; j++ ) {
    people[j].show( x, y );
    x=  x + 100;
  }
}  

void messages() {
  fill(0);
  textSize(24);
  text( title, width/3, 30 );
  textSize(16);
  text( author, 20, height-20 );
}

void shorty( Person[] p, int m ) {
  int k;
  k=  whereShort( p, m );
  swap( p, k, m-1 );
}

//// EVENTS:  keys, clicks
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
  if (key == 's') shorty( people, many );
  if (key == 't') tall( people, many );
  if (key == 'o') order( people, many );
}
// Move tallest (or shortest) to end
void tall( Person[] p, int m ) {
  int k;
  k=  whereTall( p, m );
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
    tall( q, k );
  }
}


//// CLASS DEFINITIONS ////
class Person {
  float w, h;
  float r, g, b;
  String name="?";
  //// CONSTRUCTORS ////
  Person( String who ) {
    w=  random( 30, 60 );
    h=  random( 50, 100 );
    // Random colors.
    r=  random(200);
    g=  random(200);
    b=  random(200);
    name=  who;
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
