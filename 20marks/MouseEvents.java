// Slip no 4, 25 , 29
// Design a screen to handle the Mouse Events such as MOUSE_MOVED and
// MOUSE_CLICK and display the position of the Mouse_Click in a TextField.
// =>
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEvents extends JFrame implements MouseListener,
MouseMotionListener{
String str="";
JTextArea ta;
Container c;
int x,y;
MouseEvents(){
c=getContentPane();
c.setLayout(new FlowLayout());
ta=new JTextArea("Click the mouse or move it",5,20);
ta.setFont(new Font("Arial", Font.BOLD, 20));
c.add(ta);
ta.addMouseListener(this);
ta.addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me){
int i=me.getButton();
if(i==1)
str+="Clicked Button: Left";
else if(i==2)
str+="clicked Button:Middle";
else
if(i==3)
str+="Clicked Button:Right";
this.display();
}
public void mouseEntered(MouseEvent me){
str+="MouseEntered";
this.display();
}
public void mouseExited(MouseEvent me){
str+="Mouse Exited";
this.display();
}
public void mousePressed(MouseEvent me){
x=me.getX();
y=me.getY();
str+= "Mouse Pressed at:" +x+"\t"+y;
this.display();
}
public void mouseReleased(MouseEvent me){
x=me.getX();
y=me.getY();
str+= "Mouse Released at:" +x+"\t"+y;
this.display();
}
public void mouseDragged(MouseEvent me){
x=me.getX();
y=me.getY();
str+= "Mouse Dragged at:" +x+"\t"+y;
this.display();
}
public void mouseMoved(MouseEvent me){
x=me.getX();
y=me.getY();
str+= "Mouse Moved at:" +x+"\t"+y;
this.display();
}
public void display(){
ta.setText(str);
str="";
}
public static void main(String args[]){
MouseEvents m= new MouseEvents();
m.setSize(400,400);
m.setVisible(true);
m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}