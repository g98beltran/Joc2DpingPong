import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class teclat extends JPanel {
	
	public teclat() {
		KeyListener listener = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				//aquest simplement espera a que apretes
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
				//este el q fa es si apretes dirteu quina tecla es
				//el get..Code agafa el codic de el sistema op 
				//el get ..text el que fa es imprimir el nom asociat a ixe codic
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
				//este el q fa es si asoltes dirteu quina tecla es
				//el get..Code agafa el codic de el sistema op 
				//el get ..text el que fa es imprimir el nom asociat a ixe codic
			}
		};
		addKeyListener(listener);//registrem el objecte
		setFocusable(true);//per al JPanel
	}
	//finestra
	public static void main(String[] args) {
		JFrame finestra = new JFrame("Mini Tennis");
		teclat teclatExemple = new teclat();
		finestra.add(teclatExemple);
		finestra.setSize(200, 200);
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}