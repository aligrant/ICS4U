/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandra
 */
public class NewClass {
public Pawn(int xPos, int yPos, boolean isA) {
x = xPos;
y = yPos;
isAlive = isA;
}

public void move(){
if(y>1) 
    
y--;

}

 
/*
In the Pawn Test File:

Pawn pawn7 = new Pawn(2, 7, true);

@Test
public void testMove() {

System.out.println("move");
pawn7.move();
assertEquals(6, pawn7.getY());

}**/
}
