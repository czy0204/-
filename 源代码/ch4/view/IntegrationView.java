package ch4.view;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import ch4.data.Login;
public class IntegrationView extends JFrame{
    JTabbedPane tabbedPane;
    RegisterView  regisView;
    LoginView loginView;
    AddAdvertisementView addAdvertisementView;
    DelAdvertisementView delAdvertisementView;
    QueryAllUserADView  queryAllUserADView;
    QueryOneUserADView queryOneUserADView;
    Login login;
    public IntegrationView(){
        regisView = new RegisterView();
        login = new Login();
        loginView = new LoginView();
        addAdvertisementView = new AddAdvertisementView();
        delAdvertisementView = new DelAdvertisementView();
        queryAllUserADView = new QueryAllUserADView();
        queryOneUserADView = new QueryOneUserADView();
        loginView.setLogin(login);
        addAdvertisementView.setLogin(login);
        delAdvertisementView.setLogin(login);
        queryAllUserADView.setLogin(login);
        queryOneUserADView.setLogin(login);
        tabbedPane=
        new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.add("��¼",loginView); 
        tabbedPane.add("ע��",regisView);  
        tabbedPane.add("��ӹ��",addAdvertisementView);
        tabbedPane.add("ɾ�����",delAdvertisementView); 
        tabbedPane.add("���ȫ���û����",queryAllUserADView);
        tabbedPane.add("���ĳ���û����",queryOneUserADView);
        tabbedPane.validate();
        add(tabbedPane,BorderLayout.CENTER); 
        setBounds(100,100,1200,560);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}