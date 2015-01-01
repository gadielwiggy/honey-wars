import java.util.*;
import javax.swing.*;
import java.awt.*;

class Squares extends JButton{
	private ImageIcon grass = new ImageIcon("grass.png"), flower = new ImageIcon(), hive = new ImageIcon("hive.png"),
			up = new ImageIcon("upDirection.png"), left = new ImageIcon("leftDirection.png"),
			right = new ImageIcon("rightDirection.png"), down = new ImageIcon("downDirection.png");
		private boolean hasMiniHive, hasFlower, connected, mainHive;
		private int direction;
	
		
		public Squares(){
			mainHive=false;
			hasMiniHive=false;
			hasFlower=false;
			connected=false;
			direction=0;
			this.setIcon(grass);
			}
		
		public Squares(int direction){
			this.direction=direction;
		}
		
	
	public void changeTheIcon(int direction){
		switch(direction){
		case 0:
			this.setIcon(up);
			break;
		case 1:
			this.setIcon(down);
			break;
		case 2:
			this.setIcon(right);
			break;
		case 3:
			this.setIcon(left);
			break;
		}
	}
	public boolean isMainHive() {
			return mainHive;
		}



		public void setMainHive() {
			this.mainHive = true;
			this.setIcon(hive);
		}



	public boolean isHasMiniHive() {
			return hasMiniHive;
		}


		public void setHasMiniHive(boolean hasMiniHive) {
			this.hasMiniHive = hasMiniHive;
		}


		public boolean isHasFlower() {
			return hasFlower;
		}


		public void setHasFlower(boolean hasFlower) {
			this.hasFlower = hasFlower;
		}


		public boolean isConnected() {
			return connected;
		}


		public void setConnected(boolean connected) {
			this.connected = connected;
		}


		public int getDirection() {
			return direction;
		}


		public void setDirection(int direction) {
			this.direction = direction;
		}



	
}