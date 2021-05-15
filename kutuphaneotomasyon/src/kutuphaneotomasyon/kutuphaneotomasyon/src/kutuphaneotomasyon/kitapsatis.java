package kutuphaneotomasyon;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class kitapsatis {
	   private JTable tablo;
	   private DefaultTableModel tmodel;
	   private Object[][] nesne;
	   private String[] baþlýk;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  
	public void Show() {
		 	Frame satis = new Frame();
		    satis.setTitle("Kitap Satýþ Sayfasý");
		    satis.setSize(400,500);
		    
		    TextField t1,t2,t4,t5,t6; 
		    
	        Label id = new Label("ID giriniz:");
	        id.setBounds(60,35,150,35);
	        satis.add(id);
	        
	        t1=new TextField("");  
	        t1.setBounds(210,35,100,30);
	        satis.add(t1);
	        
	        Label st = new Label("Kitap Satýþ Tarihini giriniz:");
	        st.setBounds(60, 70, 150, 35);
	        satis.add(st);
	        
	        t2=new TextField("");  
	        t2.setBounds(210,70, 100,30);  
	        satis.add(t2);
		    
	        
	        Label kitap = new Label("Kitap ID giriniz:");
	        kitap.setBounds(60, 105, 150, 35);
	        satis.add(kitap);
	        
	        t4=new TextField("");  
	        t4.setBounds(210,105, 100,30);
	        satis.add(t4);
	        
	        Label uid = new Label("Üye ID giriniz:");
	        uid.setBounds(60, 140, 150, 35);
	        satis.add(uid);
	        
	        t5=new TextField("");  
	        t5.setBounds(210,140, 100,30); 
	        satis.add(t5);
	        
	        Label kid = new Label("Kütüphane ID giriniz:");
	        kid.setBounds(60, 175, 150, 35);
	        satis.add(kid);
	        
	        t6=new TextField("");  
	        t6.setBounds(210,175, 100,30);  
	        satis.add(t6);
	        
	        Button kaydet = new Button("Kaydet");
	        kaydet.setBounds(120,240, 50, 20);
	        satis.add(kaydet);
	        baþlýk = new String[] {"ID", "Satýþ Tarihi","Kitap Ýd ","Üye Ýd","Kütüphane Ýd",};
	        tmodel = new DefaultTableModel(nesne, baþlýk);
	        tablo = new JTable(tmodel);
	        tablo.setBounds(10,320, 400, 400);
	        satis.add(tablo);
	        tablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
	        
	        kaydet.addActionListener(new ActionListener()
        	{
        		public void actionPerformed(ActionEvent e){  
        			
        			JOptionPane.showMessageDialog(null, "Satýþ Ýþlemi Gerçekleþtiriliyor");
        			tmodel.addRow(new String [] {t1.getText(),t2.getText(),t4.getText(),t5.getText(),t6.getText()});
        	        
        	        
        	}  
        		

        	});
	        
	        Button temizle = new Button("Temizle");
	        temizle.setBounds(190,240, 50, 20);
	        satis.add(temizle);
	        temizle.addActionListener(new ActionListener()
        	{
        		public void actionPerformed(ActionEvent e){  
        	           t1.setText(" ");  
        	           t2.setText(" "); 
        	           t4.setText(" "); 
        	           t5.setText(" "); 
        	           t6.setText(" "); 
        	}  

        	});
	        
		    satis.setLayout(null);
		    satis.setLocationRelativeTo(null);
		    satis.setVisible(true);
		    
		    
			 satis.addWindowListener((WindowListener) new WindowAdapter() {
			        
			     	
					public void windowClosing(WindowEvent e) {
						        super.windowClosing(e);
						        satis.dispose();
						    }

						});
	}

	

}

