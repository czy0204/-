package ch4.view;
import java.awt.event.*;
import javax.swing.JOptionPane;
import ch4.data.*;
public class HandleDelAdvertisement implements ActionListener {
   DelAdvertisementView view ;          
   DelAdvertisement  delAdvertisement;  
   public HandleDelAdvertisement(){
      delAdvertisement = new DelAdvertisement();
   }
   public void actionPerformed(ActionEvent e) {
      delAdvertisement.setLogin(view.login);
      if(view.login.getLoginSuccess() == false){
        JOptionPane.showMessageDialog
        (null,"���ȵ�¼","��Ϣ�Ի���", JOptionPane.WARNING_MESSAGE);
         return;
      }
      String number = view.inputSerialNumber.getText().trim();
      boolean boo = delAdvertisement.delAdvertisement(number);
      if(boo)
         view.hintMess.setText("ɾ���ɹ�");
      else
         view.hintMess.setText("ɾ��ʧ�ܣ�û�иù��");
   }
   public void setView(DelAdvertisementView view) {
      this.view = view;
   }
}