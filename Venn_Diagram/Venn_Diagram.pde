int x= 150;
int y= 150;
void setup(){
size(500,500); }
void draw( ){
fill(0,250,0, 50);
ellipse(300,300,x,y);
size(500,500);
fill(250,0,0, 50);
ellipse(200,300,x,y); 
size(500,500);
fill(0,0,250,25);
ellipse(250,225,x,y); 
if(mousePressed){
println(mouseX+"  "+mouseY );  
}
text("me",249,278);
text("Gamer", 316 ,324);
text("Homosapien", 238,201);
text("Male",179,308);
}