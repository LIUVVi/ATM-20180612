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
 * 功能选择界面
 * @author 青龙学习小组
 * @version 1.0
 */
public class SelectionInterface extends JFrame implements ActionListener{
	/**
	 * 余额
	 */
	int ye=0;											//初始化余额值
	/**
	 * 功能选择窗口
	 */
	JFrame frameSelection = new JFrame();				//创建功能选择窗口
	
	//创建各按钮背景
	/**
	 * 确认按钮背景
	 */
	ImageIcon iconbtnconfirm=new ImageIcon("images/btnconfirm.png");
	/**
	 * 查询余额按钮背景
	 */
	ImageIcon iconQuery=new ImageIcon("images/btnquery.png");		
	/**
	 * 取款按钮背景
	 */
	ImageIcon iconWithdraw=new ImageIcon("images/btnwithdraw.png");
	/**
	 * 存款按钮背景
	 */
	ImageIcon iconDeposit=new ImageIcon("images/btndeposit.png");
	/**
	 * 修改密码按钮背景
	 */
	ImageIcon iconModify=new ImageIcon("images/btnmodify.png");
	/**
	 * 注销按钮背景
	 */
	ImageIcon iconCancellation=new ImageIcon("images/btnRegain.png");
	/**
	 * 退出按钮背景
	 */
	ImageIcon iconOut=new ImageIcon("images/btnout.png");
	/**
	 * 100按钮背景
	 */
	ImageIcon iconBtn1=new ImageIcon("images/btn100.png");
	/**
	 * 300按钮背景
	 */
	ImageIcon iconBtn2=new ImageIcon("images/btn300.png");
	/**
	 * 500按钮背景
	 */
	ImageIcon iconBtn3=new ImageIcon("images/btn500.png");
	/**
	 * 1000按钮背景
	 */
	ImageIcon iconBtn4=new ImageIcon("images/btn1000.png");
	/**
	 * 1500按钮背景
	 */
	ImageIcon iconBtn5=new ImageIcon("images/btn1500.png");
	/**
	 * 2000按钮背景
	 */
	ImageIcon iconBtn6=new ImageIcon("images/btn2000.png");
	/**
	 * 2500按钮背景
	 */
	ImageIcon iconBtn7=new ImageIcon("images/btn2500.png");
	/**
	 * 3000按钮背景
	 */
	ImageIcon iconBtn8=new ImageIcon("images/btn3000.png");
	
	
	//创建功能选择界面组件
	/**
	 * 查询余额按钮
	 */
	JButton btnQuery = new JButton();					//创建查询余额按钮
	/**
	 * 取款按钮
	 */
	JButton btnWithdraw = new JButton();				//创建取款按钮
	/**
	 * 存款按钮
	 */
	JButton btnDeposit = new JButton();					//创建存款按钮
	/**
	 * 修改密码按钮
	 */
	JButton btnModify = new JButton();					//创建修改密码按钮
	/**
	 * 注销按钮
	 */
	JButton btnCancellation = new JButton();					//创建重登按钮按钮
	/**
	 * 退出按钮
	 */
	JButton btnOut = new JButton();						//创建退卡按钮
	/**
	 * 功能选择界面左面板
	 */
	JPanel panelLeft = new JPanel();					//创建左面板
	/**
	 * 功能选择界面信息展示面板
	 */
	JPanel panelInfo = new JPanel()						//创建信息展示面板并重写背景
	{
		 @Override    
         protected void paintComponent(Graphics g) 
		 {    
             ImageIcon icon = new ImageIcon("images/welinfo.png");    
             Image img = icon.getImage();    
             g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());    
         } 
	};
	/**
	 * 功能选择界面右面板
	 */
	JPanel panelRight = new JPanel();					//创建右面板
	
	
	//创建查询余额面板组件
	/**
	 * 查询余额面板
	 */
	JPanel panelQuery = new JPanel()					//创建查询余额面板并重写背景
	{
		@Override    
        protected void paintComponent(Graphics g) 
		 {    
            ImageIcon icon = new ImageIcon("images/bg.png");    
            Image img = icon.getImage();    
            g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());    
        }
	};
	/**
	 * 可用余额标签
	 */
	JLabel labelTxt = new JLabel("可用余额：");			//创建可用余额标签
	/**
	 * 余额标签
	 */
	JLabel labelBalance = new JLabel(ye+"元");			//创建余额标签
	
	
	//创建取款界面组件
	/**
	 * 取款面板
	 */
	JPanel panelWithdraw = new JPanel();				//创建取款面板
	/**
	 * 取款界面左面板
	 */
	JPanel panelWleft = new JPanel();					//创建取款界面左面板
	/**
	 * 取款界面右面板
	 */
	JPanel panelWright = new JPanel();					//创建取款界面右面板
	/**
	 * 取款界面中间面板
	 */
	JPanel panelWcenter = new JPanel()					//创建取款界面中间面板并重写背景
	{
		@Override    
        protected void paintComponent(Graphics g) 
		 {    
            ImageIcon icon = new ImageIcon("images/bg.png");    
            Image img = icon.getImage();    
            g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());    
        }
	};
	/**
	 * 取款金额标签
	 */
	JLabel labelWInfo = new JLabel("取款金额：");
	/**
	 * 取款输入框
	 */
	JTextField txtWmoney = new JTextField();			//创建取款输入框
	/**
	 * 取款确认按钮
	 */
	JButton buttonWconfirm = new JButton();			//创建取款确认按钮
	
	//创建存款界面组件
	/**
	 * 存款面板
	 */
	JPanel panelDeposit = new JPanel();					//创建存款面板
	/**
	 * 存款界面左面板
	 */
	JPanel panelDleft = new JPanel();					//创建存款界面左面板
	/**
	 * 存款界面右面板
	 */
	JPanel panelDright = new JPanel();					//创建存款界面右面板
	/**
	 * 存款界面中间面板
	 */
	JPanel panelDcenter = new JPanel()					//创建存款界面中间面板并重写背景
	{
		@Override    
        protected void paintComponent(Graphics g) 
		 {    
            ImageIcon icon = new ImageIcon("images/bg.png");    
            Image img = icon.getImage();    
            g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());    
        }
	};
	/**
	 * 存款金额标签
	 */
	JLabel labelDInfo = new JLabel("存款金额：");
	/**
	 * 存款输入框
	 */
	JTextField txtDmoney = new JTextField("");			//创建存款输入框
	/**
	 * 存款确认按钮
	 */
	JButton buttonDconfirm = new JButton();			//创建存款确认按钮
	
	//创建修改密码界面组件
	/**
	 * 修改密码面板
	 */
	JPanel panelModify = new JPanel()					//创建修改密码面板
	{
		@Override    
        protected void paintComponent(Graphics g) 
		 {    
            ImageIcon icon = new ImageIcon("images/bg.png");    
            Image img = icon.getImage();    
            g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());    
        }
	};
	/**
	 * 原密码标签
	 */
	JLabel labelOldpwd = new JLabel("原密码：");			//创建旧密码标签
	/**
	 * 新密码标签
	 */
	JLabel labelNewpwd1 = new JLabel("新密码：");			//创建新密码1标签
	/**
	 * 确认密码标签
	 */
	JLabel labelNewpwd2 = new JLabel("确认密码：");		//创建新密码2标签
	/**
	 * 旧密码输入框
	 */
	JPasswordField txtOldpwd = new JPasswordField();	//创建旧密码输入框
	/**
	 * 新密码输入框
	 */
	JPasswordField txtNewpwd1 = new JPasswordField();	//创建新密码输入框
	/**
	 * 确认密码输入框
	 */
	JPasswordField txtNewpwd2 = new JPasswordField();	//创建确认密码输入框
	/**
	 * 修改密码确认按钮
	 */
	JButton buttonMconfirm = new JButton();				//创建修改密码确认按钮
	
	//创建取款金额额度按钮
	/**
	 * 取款100按钮
	 */
	JButton button01 = new JButton();
	/**
	 * 取款300按钮
	 */
	JButton button02 = new JButton();
	/**
	 * 取款500按钮
	 */
	JButton button03 = new JButton();
	/**
	 * 取款1000按钮
	 */
	JButton button04 = new JButton();
	/**
	 * 取款1500按钮
	 */
	JButton button05 = new JButton();
	/**
	 * 取款2000按钮
	 */
	JButton button06 = new JButton();
	/**
	 * 取款2500按钮
	 */
	JButton button07 = new JButton();
	/**
	 * 取款3000按钮
	 */
	JButton button08 = new JButton();
	//创建存款金额额度按钮
	/**
	 * 存款100按钮
	 */
	JButton button1 = new JButton();
	/**
	 * 存款300按钮
	 */
	JButton button2 = new JButton();
	/**
	 * 存款500按钮
	 */
	JButton button3 = new JButton();
	/**
	 * 存款1000按钮
	 */
	JButton button4 = new JButton();
	/**
	 * 存款1500按钮
	 */
	JButton button5 = new JButton();
	/**
	 * 存款2000按钮
	 */
	JButton button6 = new JButton();
	/**
	 * 存款2500按钮
	 */
	JButton button7 = new JButton();
	/**
	 * 存款3000按钮
	 */
	JButton button8 = new JButton();
	/**
	 * 创建功能选择界面类的构造方法并在其中完成功能选择界面的设计
	 */
	public SelectionInterface()
	{
		frameSelection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口关闭
		frameSelection.setTitle("功能选择");					//设置窗口标题
		frameSelection.setSize(1000, 600);					//设置窗口大小
		frameSelection.setLayout(null);						//设置窗口布局
		frameSelection.setLocationRelativeTo(null);			//设置窗口居中
		frameSelection.setResizable(false);					//固定窗口大小
		frameSelection.setVisible(false);					
			
		//添加功能选择界面组件
		frameSelection.add(panelLeft);						//添加左面板
		frameSelection.add(panelRight);						//添加右面板
		frameSelection.add(panelInfo);						//添加信息展示面板
		frameSelection.add(panelQuery);						//添加查询余额面板
		frameSelection.add(panelWithdraw);					//添加取款面板
		frameSelection.add(panelDeposit);					//添加存款面板
		frameSelection.add(panelModify);					//添加修改密码面板
			
		//设置各面板位置大小
		panelLeft.setLayout(null);							//设置左面板布局
		btnQuery.setBounds(0, 0, 200, 139);					//设置查询余额按钮位置大小
		btnQuery.setIcon(iconQuery);						
		panelLeft.add(btnQuery );							//添加查询余额按钮到左面板
		btnWithdraw.setBounds(0, 214, 200, 139);			
		btnWithdraw.setIcon(iconWithdraw);
		panelLeft.add(btnWithdraw);							//添加取款按钮到左面板
		btnDeposit.setBounds(0, 431, 200, 139);
		btnDeposit.setIcon(iconDeposit);
		panelLeft.add(btnDeposit);							//添加存款按钮到左面板
		
		panelRight.setLayout(null);							//设置右面板布局
		btnModify.setBounds(0, 0, 200, 140);
		btnModify.setIcon(iconModify);
		panelRight.add(btnModify);							//添加修改密码按钮到右面板
		btnCancellation.setBounds(0, 215, 200, 140);
		btnCancellation.setIcon(iconCancellation);
		panelRight.add(btnCancellation);					//添加重登按钮到右面板
		btnOut.setBounds(0, 431, 200, 140);
		btnOut.setIcon(iconOut);
		panelRight.add(btnOut);								//添加退卡按钮到右面板
		
		panelLeft.setBounds(0, 0, 200, 600);				//设置左面板位置大小
		panelLeft.setBackground(new Color(57,54,61));		//设置左面板颜色
		panelRight.setBounds(795, 0, 200, 600);				//设置右面板位置大小
		panelRight.setBackground(new Color(57,54,61));		//设置右面板颜色
		panelInfo.setBounds(200,0,595,600);					//设置信息面板位置大小
		panelQuery.setBounds(200,0,595,600);				//设置查询余额面板位置大小
		panelWithdraw.setBounds(200,0,595,600);				//设置取款面板位置大小
		panelDeposit.setBounds(200,0,595,600);				//设置存款面板位置大小
		panelModify.setBounds(200,0,595,600);				//设置修改密码面板位置大小
		
		//设置面板是否可见
		panelInfo.setVisible(true);							
		panelQuery.setVisible(false);						
		panelWithdraw.setVisible(false);					
		panelDeposit.setVisible(false);						
		panelModify.setVisible(false);						
		
		//添加余额查询界面组件
		panelQuery.setLayout(null);
		panelQuery.add(labelTxt);
		panelQuery.add(labelBalance);
		labelTxt.setBounds(20, 180, 140, 50);
		labelTxt.setForeground(Color.WHITE);
		labelTxt.setFont(new Font("", 1, 25));
		labelBalance.setBounds(160, 180, 595, 50);
		labelBalance.setFont(new Font("", 1, 30));
		labelBalance.setForeground(Color.WHITE);
		
		
		//添加取款界面组件
		panelWithdraw.setLayout(null);
		panelWithdraw.add(panelWleft);
		panelWleft.setBounds(0, 0, 150, 600);
		panelWleft.setBackground(new Color(57,54,61));
		panelWleft.setLayout(null);
		
		button01.setBounds(0, 0, 150, 141);
		button01.setIcon(iconBtn1);
		panelWleft.add(button01);
		
		button02.setBounds(0, 141, 150, 141);
		button02.setIcon(iconBtn2);
		panelWleft.add(button02);
		
		button03.setBounds(0, 282, 150, 141);
		button03.setIcon(iconBtn3);
		panelWleft.add(button03);
		
		button04.setBounds(0, 423, 150, 147);
		button04.setIcon(iconBtn4);
		panelWleft.add(button04);
		
		panelWithdraw.add(panelWright);
		panelWright.setBounds(445, 0, 150, 600);
		panelWright.setBackground(new Color(57,54,61));
		panelWright.setLayout(null);
		
		button05.setBounds(0, 0, 150, 141);
		button05.setIcon(iconBtn5);
		panelWright.add(button05);
		
		button06.setBounds(0, 141, 150, 141);
		button06.setIcon(iconBtn6);
		panelWright.add(button06);
		
		button07.setBounds(0, 282, 150, 141);
		button07.setIcon(iconBtn7);
		panelWright.add(button07);
		
		button08.setBounds(0, 423, 150, 147);
		button08.setIcon(iconBtn8);
		panelWright.add(button08);
		
		panelWithdraw.add(panelWcenter);
		panelWcenter.setLayout(null);
		panelWcenter.setBounds(150,0,295,600);
		
		panelWcenter.add(labelWInfo);
		labelWInfo.setBounds(22, 50, 250, 50);
		labelWInfo.setFont(new Font("",1,20));
		labelWInfo.setForeground(Color.WHITE);
		
		panelWcenter.add(txtWmoney);
		txtWmoney.setBounds(22, 100, 250, 50);
		txtWmoney.setFont(new Font("",1,20));
		
		panelWcenter.add(buttonWconfirm);
		buttonWconfirm.setBounds(97,160,100,50);
		buttonWconfirm.setIcon(iconbtnconfirm);
		buttonWconfirm.setFont(new Font("",1,20));
		
		
		//添加存款界面组件
		panelDeposit.setLayout(null);
		panelDeposit.add(panelDleft);
		panelDleft.setBounds(0, 0, 150, 600);
		panelDleft.setBackground(new Color(57,54,61));
		panelDleft.setLayout(null);
		
		button1.setBounds(0, 0, 150, 141);
		button1.setIcon(iconBtn1);
		panelDleft.add(button1);
		
		button2.setBounds(0, 141, 150, 141);
		button2.setIcon(iconBtn2);
		panelDleft.add(button2);
		
		button3.setBounds(0, 282, 150, 141);
		button3.setIcon(iconBtn3);
		panelDleft.add(button3);
		
		button4.setBounds(0, 423, 150, 147);
		button4.setIcon(iconBtn4);
		panelDleft.add(button4);
		
		panelDeposit.add(panelDright);
		panelDright.setBounds(445, 0, 150, 600);
		panelDright.setBackground(new Color(57,54,61));
		panelDright.setLayout(null);
		
		button5.setBounds(0, 0, 150, 141);
		button5.setIcon(iconBtn5);
		panelDright.add(button5);
		
		button6.setBounds(0, 141, 150, 141);
		button6.setIcon(iconBtn6);
		panelDright.add(button6);
		
		button7.setBounds(0, 282, 150, 141);
		button7.setIcon(iconBtn7);
		panelDright.add(button7);
		
		button8.setBounds(0, 423, 150, 147);
		button8.setIcon(iconBtn8);
		panelDright.add(button8);
		
		panelDeposit.add(panelDcenter);
		panelDcenter.setLayout(null);
		panelDcenter.setBounds(150,0,295,600);
		
		panelDcenter.add(labelDInfo);
		labelDInfo.setBounds(22, 50, 250, 50);
		labelDInfo.setFont(new Font("",1,20));
		labelDInfo.setForeground(Color.WHITE);
		
		panelDcenter.add(txtDmoney);
		txtDmoney.setBounds(22, 100, 250, 50);
		txtDmoney.setFont(new Font("",1,20));
		
		panelDcenter.add(buttonDconfirm);
		buttonDconfirm.setBounds(97,160,100,50);
		buttonDconfirm.setIcon(iconbtnconfirm);
		buttonDconfirm.setFont(new Font("",1,20));
		
		//添加修改密码界面组件
		panelModify.setLayout(null);
		
		panelModify.add(labelOldpwd );
		labelOldpwd.setBounds(140, 100, 120, 40);
		labelOldpwd.setForeground(Color.WHITE);
		labelOldpwd.setFont(new Font("",1,20));
		
		panelModify.add(txtOldpwd);
		txtOldpwd.setBounds(240, 100, 210, 40);
		txtOldpwd.setFont(new Font("",1,20));
		
		panelModify.add(labelNewpwd1);
		labelNewpwd1.setBounds(140, 190, 120, 40);
		labelNewpwd1.setForeground(Color.WHITE);
		labelNewpwd1.setFont(new Font("",1,20));
		
		panelModify.add(txtNewpwd1);
		txtNewpwd1.setBounds(240, 190, 210, 40);
		txtNewpwd1.setFont(new Font("",1,20));
		
		
		panelModify.add(labelNewpwd2);
		labelNewpwd2.setBounds(140, 280, 120, 40);
		labelNewpwd2.setForeground(Color.WHITE);
		labelNewpwd2.setFont(new Font("",1,20));
		
		
		panelModify.add(txtNewpwd2);
		txtNewpwd2.setBounds(240, 280, 210, 40);
		txtNewpwd2.setFont(new Font("",1,20));
		
		panelModify.add(buttonMconfirm);
		buttonMconfirm.setBounds(250,340,100,50);
		buttonMconfirm.setIcon(iconbtnconfirm);
		buttonMconfirm.setFont(new Font("",1,18));
		
		
		
		//按钮监听注册
		btnQuery.addActionListener(this);
		btnWithdraw.addActionListener(this);
		btnDeposit.addActionListener(this);
		btnModify.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button01.addActionListener(this);
		button02.addActionListener(this);
		button03.addActionListener(this);
		button04.addActionListener(this);
		button05.addActionListener(this);
		button06.addActionListener(this);
		button07.addActionListener(this);
		button08.addActionListener(this);
		buttonDconfirm.addActionListener(this);
		buttonWconfirm.addActionListener(this);
		buttonMconfirm.addActionListener(this);
		btnCancellation.addActionListener(this);
		btnOut.addActionListener(this);
	} 
	@Override
	/**
	 * 功能选择界面按钮事件
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnQuery)
		{
			panelInfo.setVisible(false);
			panelWithdraw.setVisible(false);
			panelDeposit.setVisible(false);
			panelModify.setVisible(false);
			panelQuery.setVisible(true);	
		}
		else if(e.getSource() == btnWithdraw)
		{
			panelInfo.setVisible(false);
			panelDeposit.setVisible(false);
			panelQuery.setVisible(false);
			panelModify.setVisible(false);
			panelWithdraw.setVisible(true);
		}
		else if(e.getSource() == btnDeposit)
		{
			panelInfo.setVisible(false);
			panelQuery.setVisible(false);
			panelWithdraw.setVisible(false);
			panelModify.setVisible(false);
			panelDeposit.setVisible(true);
		}
		else if(e.getSource() == btnModify)
		{
			panelInfo.setVisible(false);
			panelQuery.setVisible(false);
			panelWithdraw.setVisible(false);
			panelDeposit.setVisible(false);
			panelModify.setVisible(true);
		}
		else if(e.getSource() == button1)
		{
			txtDmoney.setText("100");
		}
		else if(e.getSource() == button2)
		{
			txtDmoney.setText("300");
		}
		else if(e.getSource() == button3)
		{
			txtDmoney.setText("500");
		}
		else if(e.getSource() == button4)
		{
			txtDmoney.setText("1000");
		}
		else if(e.getSource() == button5)
		{
			txtDmoney.setText("1500");
		}
		else if(e.getSource() == button6)
		{
			txtDmoney.setText("2000");
		}
		else if(e.getSource() == button7)
		{
			txtDmoney.setText("2500");
		}
		else if(e.getSource() == button8)
		{
			txtDmoney.setText("3000");
		}
		else if(e.getSource() == buttonDconfirm)
		{
			String s=txtDmoney.getText();
			ye+= Integer.parseInt(s);
			labelBalance.setText(ye+"元");
			JOptionPane.showMessageDialog(null, "存款成功!","提示",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getSource() == button01)
		{
			txtWmoney.setText("100");
		}
		else if(e.getSource() == button02)
		{
			txtWmoney.setText("300");
		}
		else if(e.getSource() == button03)
		{
			txtWmoney.setText("500");
		}
		else if(e.getSource() == button04)
		{
			txtWmoney.setText("1000");
		}
		else if(e.getSource() == button05)
		{
			txtWmoney.setText("1500");
		}
		else if(e.getSource() == button06)
		{
			txtWmoney.setText("2000");
		}
		else if(e.getSource() == button07)
		{
			txtWmoney.setText("2500");
		}
		else if(e.getSource() == button08)
		{
			txtWmoney.setText("3000");
		}
		else if(e.getSource() == buttonWconfirm)
		{
			String s=txtWmoney.getText();
			if(ye>=Integer.parseInt(s))
			{
			ye-= Integer.parseInt(s);
			labelBalance.setText(ye+"元");
			JOptionPane.showMessageDialog(null, "取款成功!","提示",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "余额不足!","警告",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(e.getSource() == buttonMconfirm)
		{
			try
			{
				if(Integer.parseInt(txtOldpwd.getText())==LoginInterface.passWord && Integer.parseInt(txtNewpwd1.getText())==Integer.parseInt(txtNewpwd2.getText()))
				{
					LoginInterface.passWord=Integer.parseInt(txtNewpwd2.getText());
					JOptionPane.showMessageDialog(null, "修改成功!","提示",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "输入错误!","错误",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "输入错误!（密码为纯数字）","错误",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == btnCancellation)
		{
			LoginInterface.frameLogin.setVisible(true);
			LoginInterface.sface.frameSelection.setVisible(false);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"程序即将退出...，欢迎下次使用！");
			System.exit(0);
		}
	}

}
