package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main extends JFrame{
    JTextField jTextField ;//�����ı������
    JPasswordField jPasswordField;//������������
    JLabel jLabel1,jLabel2;
    JPanel jp1,jp2,jp3;
    JButton jb1,jb2; //������ť
    public void denglu(){
        jTextField = new JTextField(12);
        jPasswordField = new JPasswordField(13);
        jLabel1 = new JLabel("�û���");
        jLabel2 = new JLabel("����");
        jb1 = new JButton("ȷ��");
        jb2 = new JButton("ȡ��");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        
        //���ò���
        this.setLayout(new GridLayout(1,3));
        
        jp1.add(jLabel1); 
        jp1.add(jTextField);//��һ���������û������ı��� 
        
        jp2.add(jLabel2);
        jp2.add(jPasswordField);//�ڶ�����������������������
        
        jp3.add(jb1);
        jp3.add(jb2); //������������ȷ�Ϻ�ȡ��
        
        //        jp3.setLayout(new FlowLayout());  ����//��ΪJPanelĬ�ϲ��ַ�ʽΪFlowLayout�����Կ���ע����δ���.
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);  //�����������ӵ���½������
        //������ʾ
        this.setSize(1500, 1000);
        //this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("����Ⱥ������");
         
    }
//    public static void main(String[] args){
//        new Main().denglu();
//    }

}
