void setup(){
  
size(600,600);  
  
  
  
  
}

void draw() {
  
  for(int i = 8; i > 0; i-- ) {
  
 if( i % 2 == 0) {
 fill( 255,0,0);  }
 else {
   fill(0,0,0);}
    
    ellipse( 300,300, i*50, i*50 ); 
  
  
  }
  
  
  
}
