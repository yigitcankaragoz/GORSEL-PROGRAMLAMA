package kutuphaneotomasyon;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class kitapalis {
	   private JTable tablo;
	   private DefaultTableModel tmodel;
	   private Object[][] nesne;
	   private String[] baþlýk;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public void Show() {
		
		
		
	 	Frame alis = new Frame();
	    alis.setTitle("Kitap Alým Sayfasý");
	    alis.setSize(400,500);
	    
	    TextField t1,t2,t3,t4,t5,t6; 
	    
        Label id = new Label("ID giriniz:");
        id.setBounds(60,35,150,35);
        alis.add(id);
    
        t1=new TextField("");  
        t1.setBounds(210,35,100,30);
        alis.add(t1);
        
        Label st = new Label("Kitap Satýþ Tarihini giriniz:");
        st.setBounds(60, 70, 150, 35);
        alis.add(st);
        
        t2=new TextField("");  
        t2.setBounds(210,70, 100,30);  
        alis.add(t2);
	    
        Label at = new Label(" Kitap Alým Tarihini giriniz:");
        at.setBounds(60, 105, 150, 35);
        alis.add(at);
        
        t3=new TextField("");  
        t3.setBounds(210,105, 100,30);
        alis.add(t3);
        
        Label kitap = new Label("Kitap ID giriniz:");
        kitap.setBounds(60, 140, 150, 35);
        alis.add(kitap);
        
        t4=new TextField("");  
        t4.setBounds(210,140, 100,30);
        alis.add(t4);
        
        Label uid = new Label("Üye ID giriniz:");
        uid.setBounds(60, 175, 150, 35);
        alis.add(uid);
        
        t5=new TextField("");  
        t5.setBounds(210,175, 100,30); 
        alis.add(t5);
        
        Label kid = new Label("Kütüphane ID giriniz:");
        kid.setBounds(60, 210, 150, 35);
        alis.add(kid);
        
        t6=new TextField("");  
        t6.setBounds(210,210, 100,30);  
        alis.add(t6);
       
        baþlýk = new String[] {"ID", "Alým Tarihi","Kitap Ýd ","Üye Ýd","Kütüphane Ýd",};
        tmodel = new DefaultTableModel(nesne, baþlýk);
        tablo = new JTable(tmodel);
        tablo.setBounds(10,320, 400, 400);
        alis.add(tablo);
        tablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Button kaydet = new Button("Kaydet");
        kaydet.setBounds(120,260, 50, 20);
        alis.add(kaydet);
        kaydet.addActionListener(e ->
    	{
    		JOptionPane.showMessageDialog(null, "Alým Ýþlemi Gerçekleþtiriliyor");
    		tmodel.addRow(new String [] {t1.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText()});

    	});
        
        Button temizle = new Button("Temizle");
        temizle.setBounds(190,260, 50, 20);
        alis.add(temizle);
        temizle.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e){  
    	           t1.setText(" ");  
    	           t2.setText(" "); 
    	           t3.setText(" "); 
    	           t4.setText(" "); 
    	           t5.setText(" "); 
    	           t6.setText(" "); 
    	}  

    	});
       
    
	    alis.setLayout(null);
	    alis.setLocationRelativeTo(null);
	    alis.setVisible(true);
	    
		 alis.addWindowListener((WindowListener) new WindowAdapter() {
		        
		     	
				public void windowClosing(WindowEvent e) {
					        super.windowClosing(e);
					        alis.dispose();
					    }

					});
		  
	}


}
