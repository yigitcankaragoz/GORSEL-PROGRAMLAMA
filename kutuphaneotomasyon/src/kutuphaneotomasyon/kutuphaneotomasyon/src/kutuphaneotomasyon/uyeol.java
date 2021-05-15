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

public class uyeol {
	   private JTable tablo;
	   private DefaultTableModel tmodel;
	   private Object[][] nesne;
	   private String[] baþlýk;
public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	public void Show() {
		Frame kayit = new Frame();
		kayit.setTitle("Kullanýcý Kayýt Ekle Sayfasý");
		kayit.setSize(400,500);
	    
	    TextField t1,t2,t3,t4,t5,t6,t7; 
	    
        Label id = new Label("ID giriniz:");
        id.setBounds(60,35,150,35);
        kayit.add(id);
        
        t1=new TextField("");  
        t1.setBounds(210,35,100,30);
        kayit.add(t1);
        
        Label ad = new Label("Ad giriniz:");
        ad.setBounds(60, 70, 150, 35);
        kayit.add(ad);
        
        t2=new TextField("");  
        t2.setBounds(210,70, 100,30);  
        kayit.add(t2);
	    
        Label sad = new Label("Soyad giriniz:");
        sad.setBounds(60, 105, 150, 35);
        kayit.add(sad);
        
        t3=new TextField("");  
        t3.setBounds(210,105, 100,30);
        kayit.add(t3);
        
        Label c = new Label("Cinsiyet giriniz:");
        c.setBounds(60, 140, 150, 35);
        kayit.add(c);
        
        t4=new TextField("");  
        t4.setBounds(210,140, 100,30);
        kayit.add(t4);
        
        Label tel = new Label("Telefon numaranýzý giriniz:");
        tel.setBounds(60, 175, 150, 35);
        kayit.add(tel);
        
        t5=new TextField("");  
        t5.setBounds(210,175, 100,30); 
        kayit.add(t5);
        
        Label ep = new Label("E posta adresinizi giriniz:");
        ep.setBounds(60, 210, 150, 35);
        kayit.add(ep);
        
        t6=new TextField("");  
        t6.setBounds(210,210, 100,30);  
        kayit.add(t6);
        
        Label adres = new Label("Adres giriniz:");
        adres.setBounds(60, 245, 150, 35);
        kayit.add(adres);
        
        t7=new TextField("");  
        t7.setBounds(210,245, 100,30);  
        kayit.add(t7);
        
       
        baþlýk = new String[] {"ID", "Ad","Soyad","Cinsiyet","Telefon No","E posta","Adres"};
        tmodel = new DefaultTableModel(nesne, baþlýk);
        tablo = new JTable(tmodel);
        tablo.setBounds(10,320, 400, 400);
        kayit.add(tablo);
        tablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
         
       
        
        Button kaydet = new Button("Kayýt Ol");
        kaydet.setBounds(60,280, 50, 20);
        kayit.add(kaydet);
        
        kaydet.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e){  
    			
    			 JOptionPane.showMessageDialog(null, "Kayýt Ýþlemi Tamamlanýyor");
    			 tmodel.addRow(new String [] {t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText(),t7.getText()});
    	                
    	}  
    	
    			
    	});
        
        Button sil = new Button("Kayýt Sil");
        sil.setBounds(120,280, 50, 20);
        kayit.add(sil);
        sil.addActionListener(new ActionListener()
    	{
        	@Override
    		public void actionPerformed(ActionEvent e){  
    			 if(tablo.getSelectedRow() != -1) {
    	              
    				 tmodel.removeRow(tablo.getSelectedRow());
    	               JOptionPane.showMessageDialog(null, "Kayýt Silindi");
    			 }
    			 else{
    				 JOptionPane.showMessageDialog(null, "Silmek Ýstediðiniz Kayýtý Seçiniz");
    			 }
    	   
    	}  
        	

    	});
    	    
        Button temizle = new Button("Temizle");
        temizle.setBounds(180,280, 50, 20);
        kayit.add(temizle);
        temizle.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e){  
    	           t1.setText(" ");  
    	           t2.setText(" "); 
    	           t3.setText(" "); 
    	           t4.setText(" "); 
    	           t5.setText(" "); 
    	           t6.setText(" "); 
    	           t7.setText(" "); 
    	}  

    	});
        
        Button güncel = new Button("Güncelle");
        güncel.setBounds(240,280, 50, 20);
        kayit.add(güncel);
        güncel.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e){  
    	
				 
    			 if(tablo.getSelectedRow() != -1) {
    				 
    				 String id =t1.getText();
    				 String ad =t2.getText();
    				 String soyad =t3.getText();
    				 String cinsiyet =t4.getText();
    				 String telefon =t5.getText();
    				 String eposta =t6.getText();
    				 String adres =t7.getText();
    				 
    		
    				 tmodel.setValueAt(id, tablo.getSelectedRow(),0);
    				 tmodel.setValueAt(ad, tablo.getSelectedRow(),1);
    				 tmodel.setValueAt(soyad, tablo.getSelectedRow(),2);
    				 tmodel.setValueAt(cinsiyet, tablo.getSelectedRow(),3);
    				 tmodel.setValueAt(telefon, tablo.getSelectedRow(),4);
    				 tmodel.setValueAt(eposta, tablo.getSelectedRow(),5);
    				 tmodel.setValueAt(adres, tablo.getSelectedRow(),6);
  	               JOptionPane.showMessageDialog(null, "Güncelleme Baþarýlý");
  			 }
  			 else{
  				 JOptionPane.showMessageDialog(null, "Güncelleme Ýstediðiniz Kayýtý Seçiniz Ve Alanlarý Doldurunuz");
  			 }
    			
    	}  

    	});
        
        
        kayit.setLayout(null);
        kayit.setLocationRelativeTo(null);
        kayit.setVisible(true);
	    
	    
        kayit.addWindowListener((WindowListener) new WindowAdapter() {
		        
		     	
				public void windowClosing(WindowEvent e) {
					        super.windowClosing(e);
					        kayit.dispose();
					    }

					});
}
		
	}


