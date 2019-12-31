package ch4.view;
import javax.swing.*;
import java.awt.event.*;
import ch4.data.*;
public class LoginView extends JPanel implements ActionListener {
   Login login;
   JTextField inputID;
   JPasswordField inputPassword;
   JButton buttonLogin; 
   JButton buttonExit;  
   public void setLogin(Login login){
      this.login = login;
   }
   LoginView() {
      inputID = new JTextField(12);
      inputPassword = new JPasswordField(12);
      buttonLogin = new JButton("��¼");
      buttonExit = new JButton("�˳���¼");
      add(new JLabel("ID:"));
      add(inputID);
      add(new JLabel("�˳���¼:"));
      add(inputPassword);
      add(buttonLogin);
      add(buttonExit);  
      buttonExit.addActionListener(new ActionListener(){
                           public void actionPerformed(ActionEvent e){
                             login.setLoginSuccess(false); 
                           }});
      buttonLogin.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e) {
      login.setID(inputID.getText());
      char [] pw =inputPassword.getPassword();
      login.setPassword(new String(pw));
      HandleLogin handleLogin = new HandleLogin();
      login = handleLogin.handleLogin(login);
      if(login.getLoginSuccess() == true) {
        JOptionPane.showMessageDialog
         (null,"��¼�ɹ�","��Ϣ�Ի��ɹ���", JOptionPane.WARNING_MESSAGE);
      }
      else {
        JOptionPane.showMessageDialog
         (null,"��¼ʧ��","��Ϣ�Ի��ɹ���", JOptionPane.WARNING_MESSAGE);
      }
  }
}
