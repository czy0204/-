package ch4.test;
import ch4.data.*;
public class AppTest3 {
   public static void main(String []args) {
      Login login = new Login();
      login.setID("gengxy");
      login.setPassword("123456");
      HandleLogin  handleLogin = new HandleLogin();
      login = handleLogin.handleLogin(login);
      if(login.getLoginSuccess()==false){
         System.out.println("��¼ʧ��");
         return;
      }
      else {
         System.out.println("��¼�ɹ����������ĳ��Ա���");
      }
      QueryOneUserAD  query = new QueryOneUserAD();
      query.setLogin(login);
      Advertisement [] ad = query.queryOneUser("����");
      for(int i=0;i<ad.length;i++){
          System.out.println("�������:"+ad[i].getContent());
          System.out.println("���ͼƬ:"+ad[i].getImage().toString());
      }
   }
}
