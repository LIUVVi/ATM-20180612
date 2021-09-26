package Atm;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * ��¼����
 * @author ����ѧϰС��
 * @version 1.0
 */
public class LoginInterface extends JFrame implements ActionListener{
	/**
	 * ����
	 */
	int accountNum = 123456;								//�����˺�Ϊ123456
	/**
	 * ����
	 */
	static  int passWord=123456;							//��������Ϊ123456
	/**
	 * ��¼����
	 */
	static JFrame frameLogin = new JFrame();				//������¼����
	/**
	 * ��¼��ť����
	 */
	ImageIcon iconLogin=new ImageIcon("images/btnlogin1.png");
	/**
	 * ��¼���
	 */
	JPanel panelLogin = new JPanel()						//������¼��岢��д����
	{
		@Override    
        protected void paintComponent(Graphics g) 
		{    
            ImageIcon icon = new ImageIcon("images/bg5.png");    
            Image img = icon.getImage();    
            g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());
		}  
	};
	/**
	 * ��¼��ǩ
	 */
	JLabel labelWel = new JLabel("ATM����ȡ���");				//������¼��ǩ
	/**
	 * ���ű�ǩ
	 */
	JLabel labelId = new JLabel("���ţ�");					//�������ű�ǩ
	/**
	 * �����ǩ
	 */
	JLabel labelPwd = new JLabel("���룺");					//���������ǩ
	/**
	 * ���������
	 */
	JTextField textId = new JTextField("",16);				//�������������
	/**
	 * ���������
	 */
	JPasswordField textPwd = new JPasswordField ("",16); 	//�������������
	/**
	 * ��¼��ť
	 */
	JButton loginBtn = new JButton();				//������¼��ť
	/**
	 * ����ѡ������ʵ��������
	 */
	static SelectionInterface sface = new SelectionInterface();
	/**
	 * ������¼������Ĺ��췽������������ɵ�¼��������
	 */
	public LoginInterface()
	{

		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ô��ڹر�
		frameLogin.setTitle("ATM��¼");						//���ô��ڱ���
		frameLogin.setSize(600, 600);						//���ô��ڴ�С
		frameLogin.setLayout(null);							//���ô��ڲ���
		frameLogin.setLocationRelativeTo(null);				//���ô��ھ���
		frameLogin.setResizable(false);						//�̶����ڴ�С			
		frameLogin.getContentPane().add(panelLogin);
		
		//���õ�¼������λ�ü���С
		panelLogin.setBounds(0, 0, 600, 600);				//���õ�¼���λ�ô�С
		panelLogin.setLayout(null);							//���õ�¼��岼��
		
		labelWel.setBounds(195, 50, 230,50);				
		labelWel.setForeground(Color.WHITE);
		labelWel.setFont(new Font("", 1, 30));				//���û�ӭ��¼��ǩ�����С
		
		labelId.setBounds(110, 150, 80, 50);
		labelId.setForeground(Color.WHITE);
		labelId.setFont(new Font("", 1, 25));				//���ÿ��ű�ǩ�����С
		
		labelPwd.setBounds(110, 230, 80, 50);
		labelPwd.setForeground(Color.WHITE);
		labelPwd.setFont(new Font("", 1, 25));				//���������ǩ�����С
		
		textId.setOpaque(false);
		textId.setBounds(190, 150, 300, 50);
		textId.setForeground(Color.BLACK);
		textId.setFont(new Font("", 1, 25));
		
		textPwd.setOpaque(false);
		textPwd.setBounds(190, 230, 300, 50);
		textPwd.setForeground(Color.BLACK);
		textPwd.setFont(new Font("", 1, 25));
	
		loginBtn.setBounds(220, 340, 160, 50);
		loginBtn.setFont(new Font("", 1, 18));				//���õ�¼��ť�����С
		loginBtn.setIcon(iconLogin);
		
		//��ӵ�¼�������
		panelLogin.add(labelWel);							
		panelLogin.add(labelId);
		panelLogin.add(textId);
		panelLogin.add(labelPwd);
		panelLogin.add(textPwd);
		panelLogin.add(loginBtn);
		loginBtn.addActionListener(this);
		frameLogin.setVisible(true);
	}
	/**
	 * �������
	 * @param args
	 */
	public static void main(String[] args) 
	{

		new LoginInterface();
		
	}
	
		
		/**
		 * ��¼���水ť�¼�
		 */
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				if(e.getSource() == loginBtn)
				{
					if( Integer.parseInt(textId.getText())==accountNum && Integer.parseInt(textPwd.getText())==passWord)
					{
						JOptionPane.showMessageDialog(null, "��¼�ɹ�!","��ʾ",JOptionPane.INFORMATION_MESSAGE);
						frameLogin.setVisible(false);			//���ؽ���
						sface.frameSelection.setVisible(true);	//Ҫ��ʾ�Ľ���
					}else{
						JOptionPane.showMessageDialog(null, "�˺Ż��������!","����",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "�������˺�����!","����",JOptionPane.WARNING_MESSAGE);
			}
		}	
}

