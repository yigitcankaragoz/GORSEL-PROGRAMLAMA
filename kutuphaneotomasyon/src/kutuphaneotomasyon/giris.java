package kutuphaneotomasyon;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class giris {

	public static void main(String[] args) {
	
		        Frame yigit = new Frame();
		        yigit.setTitle("A��l�� Sayfas�");
		        yigit.setSize(300,200);
		        yigit.setBackground(Color.blue);
		        Label ozlem = new Label("�zYi�it Kitap Evine Ho�geldiniz");
		        ozlem.setBounds(70, 35, 200, 15);
		        yigit.add(ozlem);

		        
		        Button yigitoz = new Button("Kitap ��lemleri");
		        yigitoz.setBounds(40,60, 90, 20);
		        yigit.add(yigitoz);
		        yigitoz.addActionListener(e ->
	        	{
	        		kullanicigiris kullaniciGiris = new kullanicigiris(); 
	        		kullaniciGiris.Show();
	        		
	        	        
	        	});
		        
		        Button kay�tol = new Button("Kullan�c� ��lemleri");
		        kay�tol.setBounds(150,60, 130, 20);
		        yigit.add(kay�tol);
		        kay�tol.addActionListener(e ->
	        	{
	        		uyeol uyeol = new uyeol(); 
	        		uyeol.Show();
	        	        

	        	});
		        
		      
		        yigit.setLayout(null);
		        yigit.setLocationRelativeTo(null);
		        yigit.setVisible(true);

		     

		        yigit.addWindowListener((WindowListener) new WindowAdapter() {
		        
		        	
	public void windowClosing(WindowEvent e) {
		        super.windowClosing(e);
		        yigit.dispose();
		    }

		});

	}
		
}



