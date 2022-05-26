import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Draw extends Applet implements ActionListener, MouseListener { 

	Button btnRed = new Button("Red");
	Button btnOrange = new Button("Orange");
	Button btnYellow = new Button("Yellow");
	Button btnGreen = new Button("Green");
	Button btnBlue = new Button("Blue");
	Button btnMagenta = new Button("Magenta");
	Button btnPink = new Button("Pink");
	Button btnWhite = new Button("White");
	Button btnBlack = new Button("Black");
	Panel colorPanel = new Panel();
	Panel drawingPanel = new Panel();
	Color currentColor = Color.WHITE;
	int x,y;
	Graphics globalGraphics = null;

	public void init() {
		setBackground(currentColor);

		colorPanel.add(btnRed);
		colorPanel.add(btnOrange);
		colorPanel.add(btnYellow);
		colorPanel.add(btnGreen);
		colorPanel.add(btnBlue);
		colorPanel.add(btnMagenta);
		colorPanel.add(btnPink);
		colorPanel.add(btnWhite);
		colorPanel.add(btnBlack);

		btnRed.addActionListener(this);
		btnOrange.addActionListener(this);
		btnYellow.addActionListener(this);
		btnGreen.addActionListener(this);
		btnBlue.addActionListener(this);
		btnMagenta.addActionListener(this);
		btnPink.addActionListener(this);
		btnWhite.addActionListener(this);
		btnBlack.addActionListener(this);

		this.addMouseListener(this);

		add(colorPanel,BorderLayout.NORTH);
		add(drawingPanel, BorderLayout.CENTER);
	 }

	 public void paint(Graphics g)
	 {
		 if(globalGraphics == null) globalGraphics = g.create();
	 }

	 public void mouseClicked(MouseEvent e)
	 {
		 x = e.getX();
		 y = e.getY();
		 globalGraphics.setColor(currentColor);
		 globalGraphics.fillRect(x,y,10,10);
	 }


	 public void actionPerformed(ActionEvent event) {  
			if(event.getSource() == btnRed) currentColor = Color.RED;
			if(event.getSource() == btnOrange) currentColor = Color.ORANGE;
			if(event.getSource() == btnYellow) currentColor = Color.YELLOW;
			if(event.getSource() == btnGreen) currentColor = Color.GREEN;
			if(event.getSource() == btnBlue) currentColor = Color.BLUE;
			if(event.getSource() == btnMagenta) currentColor = Color.MAGENTA;
			if(event.getSource() == btnPink) currentColor = Color.PINK;
			if(event.getSource() == btnWhite) currentColor = Color.WHITE;
			if(event.getSource() == btnBlack) currentColor = Color.BLACK;
      }


	 public void mousePressed(MouseEvent e)
	 {
	 }
 	 public void mouseEntered(MouseEvent e)
	 {
	 }
	 public void mouseExited(MouseEvent e)
	 {
	 }
	 public void mouseReleased(MouseEvent e)
	 {
	 }

}
