package ch4.view;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import ch4.data.*;
public class QueryOneUserADView extends JPanel {
   public Login login; 
   public JTextField inputID;   
   JButton submit;             
   public AdvertisingBoardView  pCenter ;       
   HandleQueryOneUserAD  handleQueryOneUserAD;
   QueryOneUserADView() {
      initView();
      registerListener() ;
   }
   public void setLogin(Login login){
      this.login = login;
   }
   private void initView() {
      setLayout(new BorderLayout());
      JPanel pNorth = new JPanel();
      pCenter = new AdvertisingBoardView();
      inputID = new JTextField(12);
      submit = new JButton("�ύ");
      pNorth.add(new JLabel("����ĳ�û�ID����ѯ��ID���Ĺ��"));
      pNorth.add(inputID);
      pNorth.add(submit);
      add(pNorth,BorderLayout.NORTH);
      add(pCenter,BorderLayout.CENTER);
   }
   private void registerListener() {
      handleQueryOneUserAD = new HandleQueryOneUserAD();
      handleQueryOneUserAD.setView(this);
      submit.addActionListener(handleQueryOneUserAD);
   }
}