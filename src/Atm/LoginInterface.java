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
 * 登录界面
 * @author 青龙学习小组
 * @version 1.0
 */
public class LoginInterface extends JFrame implements ActionListener{
	/**
	 * 卡号
	 */
	int accountNum = 123456;								//设置账号为123456
	/**
	 * 密码
	 */
	static  int passWord=123456;							//设置密码为123456
	/**
	 * 登录窗口
	 */
	static JFrame frameLogin = new JFrame();				//创建登录窗口
	/**
	 * 登录按钮背景
	 */
	ImageIcon iconLogin=new ImageIcon("images/btnlogin1.png");
	/**
	 * 登录面板
	 */
	JPanel panelLogin = new JPanel()						//创建登录面板并重写背景
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
	 * 登录标签
	 */
	JLabel labelWel = new JLabel("ATM自助取款机");				//创建登录标签
	/**
	 * 卡号标签
	 */
	JLabel labelId = new JLabel("卡号：");					//创建卡号标签
	/**
	 * 密码标签
	 */
	JLabel labelPwd = new JLabel("密码：");					//创建密码标签
	/**
	 * 卡号输入框
	 */
	JTextField textId = new JTextField("",16);				//创建卡号输入框
	/**
	 * 密码输入框
	 */
	JPasswordField textPwd = new JPasswordField ("",16); 	//创建密码输入框
	/**
	 * 登录按钮
	 */
	JButton loginBtn = new JButton();				//创建登录按钮
	/**
	 * 功能选择界面的实例化对象
	 */
	static SelectionInterface sface = new SelectionInterface();
	/**
	 * 创建登录界面类的构造方法并在其中完成登录界面的设计
	 */
	public LoginInterface()
	{

		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口关闭
		frameLogin.setTitle("ATM登录");						//设置窗口标题
		frameLogin.setSize(600, 600);						//设置窗口大小
		frameLogin.setLayout(null);							//设置窗口布局
		frameLogin.setLocationRelativeTo(null);				//设置窗口居中
		frameLogin.setResizable(false);						//固定窗口大小			
		frameLogin.getContentPane().add(panelLogin);
		
		//设置登录面板组件位置及大小
		panelLogin.setBounds(0, 0, 600, 600);				//设置登录面板位置大小
		panelLogin.setLayout(null);							//设置登录面板布局
		
		labelWel.setBounds(195, 50, 230,50);				
		labelWel.setForeground(Color.WHITE);
		labelWel.setFont(new Font("", 1, 30));				//设置欢迎登录标签字体大小
		
		labelId.setBounds(110, 150, 80, 50);
		labelId.setForeground(Color.WHITE);
		labelId.setFont(new Font("", 1, 25));				//设置卡号标签字体大小
		
		labelPwd.setBounds(110, 230, 80, 50);
		labelPwd.setForeground(Color.WHITE);
		labelPwd.setFont(new Font("", 1, 25));				//设置密码标签字体大小
		
		textId.setOpaque(false);
		textId.setBounds(190, 150, 300, 50);
		textId.setForeground(Color.BLACK);
		textId.setFont(new Font("", 1, 25));
		
		textPwd.setOpaque(false);
		textPwd.setBounds(190, 230, 300, 50);
		textPwd.setForeground(Color.BLACK);
		textPwd.setFont(new Font("", 1, 25));
	
		loginBtn.setBounds(220, 340, 160, 50);
		loginBtn.setFont(new Font("", 1, 18));				//设置登录按钮字体大小
		loginBtn.setIcon(iconLogin);
		
		//添加登录界面组件
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
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) 
	{

		new LoginInterface();
		
	}
	
		
		/**
		 * 登录界面按钮事件
		 */
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				if(e.getSource() == loginBtn)
				{
					if( Integer.parseInt(textId.getText())==accountNum && Integer.parseInt(textPwd.getText())==passWord)
					{
						JOptionPane.showMessageDialog(null, "登录成功!","提示",JOptionPane.INFORMATION_MESSAGE);
						frameLogin.setVisible(false);			//隐藏界面
						sface.frameSelection.setVisible(true);	//要显示的界面
					}else{
						JOptionPane.showMessageDialog(null, "账号或密码错误!","错误",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "请输入账号密码!","警告",JOptionPane.WARNING_MESSAGE);
			}
		}	
}

