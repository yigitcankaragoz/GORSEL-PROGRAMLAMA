package kutuphaneotomasyon;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class kullanicigiris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void Show() {
		    Frame kgiris = new Frame();
		    kgiris.setTitle("Kullanýcý Giriþ Sayfasý");
		    kgiris.setSize(300,200);
		    kgiris.setBackground(Color.blue);
	        
		   kgiris.setLayout(null);
		   kgiris.setLocationRelativeTo(null);
		   kgiris.setVisible(true);
		    
		    Button yigitoz = new Button("Kitap Alým");
	        yigitoz.setBounds(60,60, 100, 20);
	        kgiris.add(yigitoz);
	        yigitoz.addActionListener(e ->
        	{
        		kitapalis kitapaliss = new kitapalis(); 
        		kitapaliss.Show();
        		kgiris.dispose();
        		

        	});
	        Button ozyigit = new Button("Kitap Satýþ");
	        ozyigit.setBounds(170,60, 100, 20);
	        kgiris.add(ozyigit);
	        ozyigit.addActionListener(e ->
        	{
        		kitapsatis kitapsatis = new kitapsatis(); 
        		kitapsatis.Show();
        		kgiris.dispose();

        	});
	        

	        
		    kgiris.addWindowListener((WindowListener) new WindowAdapter() {
		        
	        	
	public void windowClosing(WindowEvent e) {
		        super.windowClosing(e);
		        kgiris.dispose();
		    }

		});
		
	}

}
