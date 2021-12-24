
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(700,400);
  /* Call the noFill() command so all the ellipses will be transparent */
noFill();
}
int s = 5;
     int x = 170;
    int y = 200;
         int x2 = 530;
void draw() {
background(#DCDCDC);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          

  for (int i=0; i<9; i++) {
     ellipse(x,y, i*30, i*30 );
 
  
}
        /*Make this set of rings move across the sketch to the right 
    Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */

    x+=s;    

        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
if (x>width) {
s= -s;
}    
        /*When the rings reach the left side of the sketch, reverse the direction again */
if (x<0) {
s = -s;
}    
    
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
  for (int i1=0; i1<9; i1++) {
     ellipse(x2,y, i1*30, i1*30 );
 
  
}
      x2-=s;  
      if (x2>width) {
s= -s;
}  
if (x<0) {
s = -s;
}    
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
  }
