//// Nbrooks PROJECT #2

String title="Project #2 -- Rexpup chases Rex, Rex chases Monster, Monster chases Hero, Hero chases the gold";
String author="Narada Brooks";
String Score= "Score";



/// GLOBAL COORDINATES ///

float sunX, sunY; //variables for sun
float sunDX;

float x=100,y=100;        // Position of Blinky
  
float horizon;

float xGold=400, yGold=525;
int score=0;

float sparkyX=500;
float sparkyY=340;

float rexX=300;
float rexY=420;

float rexpupX=200;
float rexpupY=320;

void setup() 

{
  
  size( 1000, 500 );     //// screen size
  horizon= height/4;
  frameRate(30);         //// Frame rate slows everything down
  x=100;
  y=100;
  
  sunX=  width/10;   // Reset the sun position.
  sunY=  100;
  sunDX=  4;  
}

// NEXT FRAME ////

//// background sky and grass colors

void draw() 
{
  ///  BACKGROUND SCENE  ///
  
  background( 0, 175, 255);             //// background sky color
  fill(0, 200, 0);                     //green grass rectangle color
  ////rect(0, 600, 2000, 600);            //rectangle grass
  rectMode( CORNER );
  rect( 0,horizon, width,height-horizon);
  
  sun();
  
  
  house();
  Blinky();
  sparky();
  rex();
  rexpup();
  move();
  action();
  gold();
 
 //// SCREEN TEXT MESSAGES ////
 
  fill( 255, 250, 250 );                     ////  text color 
  textSize(26);
  text( "waah gwaan", x+50, y-50 );
  
  
  fill( 250, 0,0 );                                   //// red text color tittle
 
  textSize(20);                                     //// tittle text size tittle
  
  text ("Project#2: Blinky, Rex n Pup, Runs for Life ", 0, width/40);       //// Story Title 
  
  fill( 100, 0, 200 );                                  //// purple text color author's name
  
  textSize(22);                                     //// text size for author's name
  
  text("Narada, 61CST112 broon84", 0, width/20);  //// Author's name and class
  
  text("Score =" +score,  680, width/30);               /// score title location
}


void sun()

{
  
  /// YELLOW SUN AND COLOR ///
  
  fill( 255, 255, 0 );                     //// yellow sun color
  ellipse (sunX,sunY,75,80);    //// yellow ellipse sun
  ////ellipse (x-100,y=65,75,80);     ////makes sun and Blinky moves together
}


//// MOVE THE SUN  (by changing x,y)  ///

void move()

{
  if (sunX>width) {
    sunX=  50;
    sunY=  random( 20, height/4 );
  }
  sunX=  sunX + sunDX;
}


void house()
{
  
 //// FULL HOUSE AND COLOR  ///
 
  rectMode(CENTER);
  fill( 255, 0, 0 );       //// red house color 
  rect( 200, 225, 175, 150 );  //// rectangular red house body
  
  fill( 0, 0, 200 );    ////  house door color
  rect( 200, 250, 50, 100 );     //  house rectangular door
  
  
  
  fill( 255, 0, 0 );         //// red roof color
  triangle( 100, 150, 200, 50, 300, 150 );   //// red house roof
  
  
  fill( 255, 255, 255 );    //// white window 1 color  
  rectMode(CORNER);
  
  rect( 120, 160, 40, 40 );    //// window 1 left
  
  rect( 240, 160, 40, 40);    //// window 2  right
  
  
  //// BROWN AND GREEN TREE ////
  
  rectMode(CORNERS);
  fill( 204,102 ,0 );       //// big brown tree bark color 1
  rect( 560, 190, 600, 300 );    //// big tree body 1
  fill( 0, 250, 0 );            //// big green leaf tree  color 1
  ellipse( 580, 110, 150, 200 );    //// big tree top gree leaves 1
  
  //--  rectMode(CORNERS);
  fill( 204,102 ,0 );       //// big brown tree bark color 2
  rect( 730, 190, 710, 300 );    //// big tree body 2    
  fill( 0, 250, 0 );            //// big green leaf tree  color 2
  ellipse( 720, 110, 150, 200 );    //// big tree top gree leaves 2


  //// Row of small trees.
  
  rectMode(CORNERS);
  for( float tx=640; tx<840; tx += 30 )
  {
    fill( 204, 102 ,0 );           //// small brown color 1
    rect( tx, 200, tx-20, 300 );    /// small Tree brown 1
    fill( 130, 180, 0 );             //// small tree green leaf color 1
    ellipse( tx-10, 190, 50, 110 );    /// small tree 1
  }
  
  /*  
  // Small trees.
  
  fill( 204, 102 ,0 );           //// small brown color 1
  rect( 640, 200, 620, 300 );    /// small Tree brown 1
  fill( 130, 180, 0 );             //// small tree green leaf color 1
  ellipse( 630, 190, 50, 110 );    /// small tree 1
  
  fill( 204, 102 ,0 );           //// small brown color 2
  rect( 700, 200, 680, 300 );    /// small Tree brown 2
  fill( 130, 200, 0 );             //// small tree green leaf color 2
  ellipse( 690, 190, 50, 110 );    /// small tree 2
  
  fill( 204, 102 ,0 );           //// small brown color 3
  rect( 730, 200, 710, 300 );    /// small Tree brown 3
  fill( 130, 200, 0 );             //// small tree green leaf color 3
  ellipse( 720, 190, 50, 110 );    /// small tree 3
  
  fill( 204, 102 ,0 );           //// small brown color 4
  rect( 760, 200, 740, 300 );    /// small Tree brown 4
  
  fill( 130, 200, 0 );             //// small tree green leaf color 4
  ellipse( 750, 190, 50, 110 );    /// small tree 4
  */
}

void rex()
{
 
 /// draw Rex /// 

fill(8,74,250);   /// rex blue color
 
 rect(rexX+35,rexY-30, 40,20);     /// rex head
 
 fill(237,8,250); /// rex eye color
 ellipse(rexX+40,rexY-30,15,10);  /// rex eye
 
 rect(rexX,rexY, 80,40);   /// rex body
 fill( 240,222,17 );   //// rex yellow name 
  textSize(18);         /// size of rex name
  text(" REX ", rexX-35, rexY+10 );     // rex name 
 
 line(rexX-40,rexY-20, rexX-60,rexY-40);  //// rex tail 
 
 line(rexX-40,rexY+20, rexX-50,rexY+40); /// rex legs
 line(rexX-40,rexY+20, rexX-65,rexY+40);
 
 line(rexX+40,rexY+20, rexX+50,rexY+40);  /// rex legs
 line(rexX+40,rexY+20, rexX+65,rexY+40);

  // Move rex:  chase B
  rexX=  rexX + random(-3,+3) + (x-rexX) / 20;
  rexY=  rexY + random(-2,+2) + (y-rexY) / 20;
  
}


void rexpup()
{
 
 /// draw Rexpup /// 

 fill(8,250,102);   /// rexpup green color
 
 rect(rexpupX+35,rexpupY-30, 40,20);     /// rexpup head
 
 fill(210,8,250); /// rexpup eye color
 ellipse(rexpupX+40,rexpupY-30,15,10);  /// rexpup eye
 
 rect(rexpupX,rexpupY, 80,40);   /// rexpup body
 fill( 240,222,17 );   //// rexpup yellow name 
  textSize(18);         /// size of rexpup name
  text(" REXPUP ", rexpupX-35, rexpupY+10 );     // rexpup name 
 
 line(rexpupX-40,rexpupY-20, rexpupX-60,rexpupY-40);  //// rexpup tail 
 
 line(rexpupX-40,rexpupY+20, rexpupX-50,rexpupY+40); /// rexpup back legs
 line(rexpupX-40,rexpupY+20, rexpupX-65,rexpupY+40);
 
 line(rexpupX+40,rexpupY+20, rexpupX+50,rexpupY+40);  /// rexpup front legs
 line(rexpupX+40,rexpupY+20, rexpupX+65,rexpupY+40);

  rexpupX=  rexpupX + random(-8,+8) + (rexX-rexpupX) / 30;
  rexpupY=  rexpupY + random(-4,+4) + (rexY-rexpupY) / 30;
  
}


void sparky()
{
  // Draw Sparky///
  
 fill(250,250,250);
  ellipse(sparkyX,sparkyY-80,80,80);    ///Sparky white head
 
  fill(250,250,250);
  ellipse(sparkyX,sparkyY,100,100);  ///Sparky white body
  
  fill( 250,8,40 );   //// Sparky pink-red name 
  textSize(18);         /// size of Sparky name
  text(" Sparky ", sparkyX-35, sparkyY+10 );     // Sparky name 
  
  fill(250,8,40);                    ///sparky red eyes
  rect( sparkyX-20,sparkyY-90, 10,10);        /// sparky left eye
  rect( sparkyX+20,sparkyY-90, 10, 10);     /// sparky right eye
  
  rect(sparkyX,sparkyY-60, 20,5);   /// sparky mouth
  
  strokeWeight( 12 );
  line( sparkyX-10, sparkyY+50, sparkyX-40, sparkyY+110 );   // Sparky left leg
  line( sparkyX+10, sparkyY+50, sparkyX+40, sparkyY+110 );   // Sparky right leg
  
  line( sparkyX-35, sparkyY-30, sparkyX-80, sparkyY-20 );   // Sparky left hand
  line( sparkyX+35, sparkyY-30, sparkyX+80, sparkyY-20 );   // Sparky right hand
  stroke(  0 );  
  strokeWeight( 1 );
  
  //// Move sparky:  chase blinky
  sparkyX=  sparkyX + (x-sparkyX) / 60;
  sparkyY=  sparkyY + (y-sparkyY) / 60;
  
  
}



void Blinky()
{
  /// DRAW Blinky ///
  
  fill( 0, 0, 100 );
  rectMode(CENTER);
  
  // Blinky BODY & HEAD
  
  fill(0,0,0);
  rect( x,y, 40, 100 );            // Blinky body
  
  fill( 0 );             /// ?? color of Blinky
  stroke( 0 );           /// ?? color of Blinky 
  strokeWeight( 12 );
  line( x-20, y-10, x-80, y-20 );   // Blinky left hand
  line( x+20, y-10, x+80, y-20 );   // Blinky right hand
  stroke(  0 );  
  strokeWeight( 1 );
  
  
  fill( 240,222,17 );   ////yellow name and head
  textSize(14);         /// size of Blinky name
  text("Blinky", x-20, y+20 );     // Blinky Blinky name 
  
  ellipse( x, y-30, 60, 60 );      // Blinky head
  
  // Blinky EYES
  
  fill( 147, 13, 13 );
  ellipse( x-19, y-30, 16, 32 );     // Blinky left eye
 
  //--  ellipse(119, 70, 16, 32);   //// ORIGINAL MEASUREMENTS 
  ellipse( x+19, y-30, 16, 32 );     // Blinky right eye
  
  // Blinky LEGS
  
  fill( 0 );             /// ?? color of Blinky
  stroke( 0 );           /// ?? color of Blinky 
  strokeWeight( 12 );
  line( x-10, y+50, x-20, y+90 );   // Blinky left foot
  line( x+10, y+50, x+20, y+90 );   // Blinky right foot
  stroke(  0 );  
  strokeWeight( 1 );
}


//// MOVE Blinky  (by changing x,y)  ////

void action()
{
  if (x>width) {
    x=100;
    y=100;
  }
  x=  x + (xGold-x) / 30;
  y=  y + (yGold-y) / 30;
  
  // Check if Blinky found gold.
  if (  dist( x,y, xGold,yGold ) < 30 )  
  {
    score=score + 100;
    restart();
  }
  else{
    score=score - 1 ;  
  }
  
}
void restart() {
  // Move Blinky to left, Sparky to right
  x=  50;
  y=  random( horizon, height );
  sparkyX=  width-100;
  sparkyY=  random( height/2, height );

/*  
  x=  200;
  y=  horizon;
*/  
{
  xGold=random(0, width);          //// restart gold randomly
  yGold=random(horizon, height);    //// restart gold randomly 
  
}
  
}

void mousePressed()
{
  xGold=  mouseX;
  yGold=  mouseY;
  restart();
}

//// GOLD FUNCTION //
void gold()
{
  if( dist( x, y, xGold, yGold) < 30 ) {
    score = score + 100;
    xGold = random( width/2, width );
    yGold = random( horizon, height );
    // Move Blinky to left, Sparky to right.
    x= random(0, width/2 );
    y= random( horizon, height );
    sparkyY=  width-50;
    sparkyY=  height-50;
  }   
  
  
  noStroke();
  //// DRAW GOLD ////
  fill( random(200,255), 150, random(150) );
  //--  ellipse(400,525,320,380);    //// dimension for gold  
  ellipse( xGold, yGold, random( 50, 60), 40 );

  fill( random(150,255), 150, random(150) );
  //--  ellipse(400,525,320,380);    //// dimension for gold  
  ellipse( xGold, yGold, random( 40, 50), 30 );

  fill( random(200,255), 50, random(150) );
  //--  ellipse(400,525,320,380);    //// dimension for gold  
  ellipse( xGold, yGold, random( 30, 40), 20 );
  
  stroke(0);
}
