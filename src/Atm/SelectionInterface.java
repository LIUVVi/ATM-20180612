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
 * ����ѡ�����
 * @author ����ѧϰС��
 * @version 1.0
 */
public class SelectionInterface extends JFrame implements ActionListener{
	/**
	 * ���
	 */
	int ye=0;											//��ʼ�����ֵ
	/**
	 * ����ѡ�񴰿�
	 */
	JFrame frameSelection = new JFrame();				//��������ѡ�񴰿�
	
	//��������ť����
	/**
	 * ȷ�ϰ�ť����
	 */
	ImageIcon iconbtnconfirm=new ImageIcon("images/btnconfirm.png");
	/**
	 * ��ѯ��ť����
	 */
	ImageIcon iconQuery=new ImageIcon("images/btnquery.png");		
	/**
	 * ȡ�ť����
	 */
	ImageIcon iconWithdraw=new ImageIcon("images/btnwithdraw.png");
	/**
	 * ��ť����
	 */
	ImageIcon iconDeposit=new ImageIcon("images/btndeposit.png");
	/**
	 * �޸����밴ť����
	 */
	ImageIcon iconModify=new ImageIcon("images/btnmodify.png");
	/**
	 * ע����ť����
	 */
	ImageIcon iconCancellation=new ImageIcon("images/btnRegain.png");
	/**
	 * �˳���ť����
	 */
	ImageIcon iconOut=new ImageIcon("images/btnout.png");
	/**
	 * 100��ť����
	 */
	ImageIcon iconBtn1=new ImageIcon("images/btn100.png");
	/**
	 * 300��ť����
	 */
	ImageIcon iconBtn2=new ImageIcon("images/btn300.png");
	/**
	 * 500��ť����
	 */
	ImageIcon iconBtn3=new ImageIcon("images/btn500.png");
	/**
	 * 1000��ť����
	 */
	ImageIcon iconBtn4=new ImageIcon("images/btn1000.png");
	/**
	 * 1500��ť����
	 */
	ImageIcon iconBtn5=new ImageIcon("images/btn1500.png");
	/**
	 * 2000��ť����
	 */
	ImageIcon iconBtn6=new ImageIcon("images/btn2000.png");
	/**
	 * 2500��ť����
	 */
	ImageIcon iconBtn7=new ImageIcon("images/btn2500.png");
	/**
	 * 3000��ť����
	 */
	ImageIcon iconBtn8=new ImageIcon("images/btn3000.png");
	
	
	//��������ѡ��������
	/**
	 * ��ѯ��ť
	 */
	JButton btnQuery = new JButton();					//������ѯ��ť
	/**
	 * ȡ�ť
	 */
	JButton btnWithdraw = new JButton();				//����ȡ�ť
	/**
	 * ��ť
	 */
	JButton btnDeposit = new JButton();					//������ť
	/**
	 * �޸����밴ť
	 */
	JButton btnModify = new JButton();					//�����޸����밴ť
	/**
	 * ע����ť
	 */
	JButton btnCancellation = new JButton();					//�����صǰ�ť��ť
	/**
	 * �˳���ť
	 */
	JButton btnOut = new JButton();						//�����˿���ť
	/**
	 * ����ѡ����������
	 */
	JPanel panelLeft = new JPanel();					//���������
	/**
	 * ����ѡ�������Ϣչʾ���
	 */
	JPanel panelInfo = new JPanel()						//������Ϣչʾ��岢��д����
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
	 * ����ѡ����������
	 */
	JPanel panelRight = new JPanel();					//���������
	
	
	//������ѯ���������
	/**
	 * ��ѯ������
	 */
	JPanel panelQuery = new JPanel()					//������ѯ�����岢��д����
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
	 * ��������ǩ
	 */
	JLabel labelTxt = new JLabel("������");			//������������ǩ
	/**
	 * ����ǩ
	 */
	JLabel labelBalance = new JLabel(ye+"Ԫ");			//��������ǩ
	
	
	//����ȡ��������
	/**
	 * ȡ�����
	 */
	JPanel panelWithdraw = new JPanel();				//����ȡ�����
	/**
	 * ȡ����������
	 */
	JPanel panelWleft = new JPanel();					//����ȡ����������
	/**
	 * ȡ����������
	 */
	JPanel panelWright = new JPanel();					//����ȡ����������
	/**
	 * ȡ������м����
	 */
	JPanel panelWcenter = new JPanel()					//����ȡ������м���岢��д����
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
	 * ȡ�����ǩ
	 */
	JLabel labelWInfo = new JLabel("ȡ���");
	/**
	 * ȡ�������
	 */
	JTextField txtWmoney = new JTextField();			//����ȡ�������
	/**
	 * ȡ��ȷ�ϰ�ť
	 */
	JButton buttonWconfirm = new JButton();			//����ȡ��ȷ�ϰ�ť
	
	//�������������
	/**
	 * ������
	 */
	JPanel panelDeposit = new JPanel();					//����������
	/**
	 * �����������
	 */
	JPanel panelDleft = new JPanel();					//���������������
	/**
	 * �����������
	 */
	JPanel panelDright = new JPanel();					//���������������
	/**
	 * �������м����
	 */
	JPanel panelDcenter = new JPanel()					//�����������м���岢��д����
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
	 * ������ǩ
	 */
	JLabel labelDInfo = new JLabel("����");
	/**
	 * ��������
	 */
	JTextField txtDmoney = new JTextField("");			//������������
	/**
	 * ���ȷ�ϰ�ť
	 */
	JButton buttonDconfirm = new JButton();			//�������ȷ�ϰ�ť
	
	//�����޸�����������
	/**
	 * �޸��������
	 */
	JPanel panelModify = new JPanel()					//�����޸��������
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
	 * ԭ�����ǩ
	 */
	JLabel labelOldpwd = new JLabel("ԭ���룺");			//�����������ǩ
	/**
	 * �������ǩ
	 */
	JLabel labelNewpwd1 = new JLabel("�����룺");			//����������1��ǩ
	/**
	 * ȷ�������ǩ
	 */
	JLabel labelNewpwd2 = new JLabel("ȷ�����룺");		//����������2��ǩ
	/**
	 * �����������
	 */
	JPasswordField txtOldpwd = new JPasswordField();	//���������������
	/**
	 * �����������
	 */
	JPasswordField txtNewpwd1 = new JPasswordField();	//���������������
	/**
	 * ȷ�����������
	 */
	JPasswordField txtNewpwd2 = new JPasswordField();	//����ȷ�����������
	/**
	 * �޸�����ȷ�ϰ�ť
	 */
	JButton buttonMconfirm = new JButton();				//�����޸�����ȷ�ϰ�ť
	
	//����ȡ�����Ȱ�ť
	/**
	 * ȡ��100��ť
	 */
	JButton button01 = new JButton();
	/**
	 * ȡ��300��ť
	 */
	JButton button02 = new JButton();
	/**
	 * ȡ��500��ť
	 */
	JButton button03 = new JButton();
	/**
	 * ȡ��1000��ť
	 */
	JButton button04 = new JButton();
	/**
	 * ȡ��1500��ť
	 */
	JButton button05 = new JButton();
	/**
	 * ȡ��2000��ť
	 */
	JButton button06 = new JButton();
	/**
	 * ȡ��2500��ť
	 */
	JButton button07 = new JButton();
	/**
	 * ȡ��3000��ť
	 */
	JButton button08 = new JButton();
	//����������Ȱ�ť
	/**
	 * ���100��ť
	 */
	JButton button1 = new JButton();
	/**
	 * ���300��ť
	 */
	JButton button2 = new JButton();
	/**
	 * ���500��ť
	 */
	JButton button3 = new JButton();
	/**
	 * ���1000��ť
	 */
	JButton button4 = new JButton();
	/**
	 * ���1500��ť
	 */
	JButton button5 = new JButton();
	/**
	 * ���2000��ť
	 */
	JButton button6 = new JButton();
	/**
	 * ���2500��ť
	 */
	JButton button7 = new JButton();
	/**
	 * ���3000��ť
	 */
	JButton button8 = new JButton();
	/**
	 * ��������ѡ�������Ĺ��췽������������ɹ���ѡ���������
	 */
	public SelectionInterface()
	{
		frameSelection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ô��ڹر�
		frameSelection.setTitle("����ѡ��");					//���ô��ڱ���
		frameSelection.setSize(1000, 600);					//���ô��ڴ�С
		frameSelection.setLayout(null);						//���ô��ڲ���
		frameSelection.setLocationRelativeTo(null);			//���ô��ھ���
		frameSelection.setResizable(false);					//�̶����ڴ�С
		frameSelection.setVisible(false);					
			
		//��ӹ���ѡ��������
		frameSelection.add(panelLeft);						//��������
		frameSelection.add(panelRight);						//��������
		frameSelection.add(panelInfo);						//�����Ϣչʾ���
		frameSelection.add(panelQuery);						//��Ӳ�ѯ������
		frameSelection.add(panelWithdraw);					//���ȡ�����
		frameSelection.add(panelDeposit);					//��Ӵ�����
		frameSelection.add(panelModify);					//����޸��������
			
		//���ø����λ�ô�С
		panelLeft.setLayout(null);							//��������岼��
		btnQuery.setBounds(0, 0, 200, 139);					//���ò�ѯ��ťλ�ô�С
		btnQuery.setIcon(iconQuery);						
		panelLeft.add(btnQuery );							//��Ӳ�ѯ��ť�������
		btnWithdraw.setBounds(0, 214, 200, 139);			
		btnWithdraw.setIcon(iconWithdraw);
		panelLeft.add(btnWithdraw);							//���ȡ�ť�������
		btnDeposit.setBounds(0, 431, 200, 139);
		btnDeposit.setIcon(iconDeposit);
		panelLeft.add(btnDeposit);							//��Ӵ�ť�������
		
		panelRight.setLayout(null);							//��������岼��
		btnModify.setBounds(0, 0, 200, 140);
		btnModify.setIcon(iconModify);
		panelRight.add(btnModify);							//����޸����밴ť�������
		btnCancellation.setBounds(0, 215, 200, 140);
		btnCancellation.setIcon(iconCancellation);
		panelRight.add(btnCancellation);					//����صǰ�ť�������
		btnOut.setBounds(0, 431, 200, 140);
		btnOut.setIcon(iconOut);
		panelRight.add(btnOut);								//����˿���ť�������
		
		panelLeft.setBounds(0, 0, 200, 600);				//���������λ�ô�С
		panelLeft.setBackground(new Color(57,54,61));		//�����������ɫ
		panelRight.setBounds(795, 0, 200, 600);				//���������λ�ô�С
		panelRight.setBackground(new Color(57,54,61));		//�����������ɫ
		panelInfo.setBounds(200,0,595,600);					//������Ϣ���λ�ô�С
		panelQuery.setBounds(200,0,595,600);				//���ò�ѯ������λ�ô�С
		panelWithdraw.setBounds(200,0,595,600);				//����ȡ�����λ�ô�С
		panelDeposit.setBounds(200,0,595,600);				//���ô�����λ�ô�С
		panelModify.setBounds(200,0,595,600);				//�����޸��������λ�ô�С
		
		//��������Ƿ�ɼ�
		panelInfo.setVisible(true);							
		panelQuery.setVisible(false);						
		panelWithdraw.setVisible(false);					
		panelDeposit.setVisible(false);						
		panelModify.setVisible(false);						
		
		//�������ѯ�������
		panelQuery.setLayout(null);
		panelQuery.add(labelTxt);
		panelQuery.add(labelBalance);
		labelTxt.setBounds(20, 180, 140, 50);
		labelTxt.setForeground(Color.WHITE);
		labelTxt.setFont(new Font("", 1, 25));
		labelBalance.setBounds(160, 180, 595, 50);
		labelBalance.setFont(new Font("", 1, 30));
		labelBalance.setForeground(Color.WHITE);
		
		
		//���ȡ��������
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
		
		
		//��Ӵ��������
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
		
		//����޸�����������
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
		
		
		
		//��ť����ע��
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
	 * ����ѡ����水ť�¼�
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
			labelBalance.setText(ye+"Ԫ");
			JOptionPane.showMessageDialog(null, "���ɹ�!","��ʾ",JOptionPane.INFORMATION_MESSAGE);
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
			labelBalance.setText(ye+"Ԫ");
			JOptionPane.showMessageDialog(null, "ȡ��ɹ�!","��ʾ",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "����!","����",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(e.getSource() == buttonMconfirm)
		{
			try
			{
				if(Integer.parseInt(txtOldpwd.getText())==LoginInterface.passWord && Integer.parseInt(txtNewpwd1.getText())==Integer.parseInt(txtNewpwd2.getText()))
				{
					LoginInterface.passWord=Integer.parseInt(txtNewpwd2.getText());
					JOptionPane.showMessageDialog(null, "�޸ĳɹ�!","��ʾ",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "�������!","����",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "�������!������Ϊ�����֣�","����",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == btnCancellation)
		{
			LoginInterface.frameLogin.setVisible(true);
			LoginInterface.sface.frameSelection.setVisible(false);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"���򼴽��˳�...����ӭ�´�ʹ�ã�");
			System.exit(0);
		}
	}

}
