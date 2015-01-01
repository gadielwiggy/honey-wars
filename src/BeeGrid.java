
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.*;

public class BeeGrid extends JFrame{
	
	JFrame frame=new JFrame("Honey Wars");
	private JPanel panelGrid =new JPanel();
	private JPanel panelMenu =new JPanel();
	private Squares[][] grid;
	private Squares[] menu;
	private int randomBuffer;
	Random rn= new Random();

	
	
	public BeeGrid(int width,int length){
		//width==height
		panelGrid.setLayout(new GridLayout(width,length));
		grid=new Squares[width][length];
		
		for (int x=0;x<width;x++){
			for(int y=0;y<length;y++){
				
				grid[x][y]=new Squares ();

				if((y==0||y==length-1)&&(2*x==width-1)){
					grid[x][y].setMainHive();
					
				}

				panelGrid.add(grid[x][y]);
			}
		}
		int size=5;
		panelMenu.setLayout(new GridLayout(1,size));
		menu=new Squares[size];
		for (int z=0;z<size;z++){
			rn=new Random();
			randomBuffer=rn.nextInt(3);
			menu[z]=new Squares (randomBuffer);
			menu[z].changeTheIcon(menu[z].getDirection());
			panelMenu.add(menu[z]);
		}
		BorderLayout manager=new BorderLayout();
		setLayout(manager);
		
		
		frame.add(panelMenu,BorderLayout.NORTH);
		frame.add(panelGrid,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600,600);
	}
	
	
	}
