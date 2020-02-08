package edu.neu.csye6200;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class UI {
	private static String path = UI.class.getClassLoader().getResource(".").getPath();
	private static JFrame framewelcome = null;
	private static JFrame framelogin = null;
	private static JFrame frameregister = null;
	private static JFrame framemovie = null;
	private static JFrame frametheater = null;
	private static JFrame framehall = null;
	private static JFrame frameorder = null;
	private static JFrame frameuserinfo = null;
	private static JFrame framerecord = null;

	public static void WelcomeUI() {
		// create jFrame
		framewelcome = new JFrame("Tickets Order for Movies");
		// Setting the width and height of frame
		framewelcome.setSize(412, 720);
		framewelcome.setLocationRelativeTo(null);
		framewelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set visible
		framewelcome.setVisible(true);

		JPanel jPanel1 = new JPanel();
		JLabel lblTitle = new JLabel();
		JLabel lblStart = new JLabel();

		jPanel1.setBackground(new Color(244, 244, 244));

		lblTitle.setBackground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Lucida Grande", 1, 18)); // NOI18N
		lblTitle.setForeground(new Color(255, 129, 48));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setIcon(new ImageIcon(path + "../src/img/Welcome_head.PNG")); // NOI18N
		lblTitle.setText("Movie System");
		lblTitle.setMaximumSize(new Dimension(400, 100));
		lblTitle.setMinimumSize(new Dimension(400, 100));
		lblTitle.setPreferredSize(new Dimension(400, 100));

		lblStart.setIcon(new ImageIcon(path + "../src/img/Movie_brand.png")); // NOI18N
		lblStart.setText("jLabel2");
		lblStart.setPreferredSize(new Dimension(400, 500));
		lblStart.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lblStartMouseClicked(evt);
			}
		});

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(57, 57, 57).addComponent(lblTitle,
								GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(lblStart,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(19, 19, 19)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(69, 69, 69)
						.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(12, 12, 12).addComponent(lblStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)));

		GroupLayout layout = new GroupLayout(framewelcome.getContentPane());
		framewelcome.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	}

	private static void lblStartMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		framewelcome.dispose();
		LoginUI();

	}

	public static void LoginUI() {
		// create jFrame
		framelogin = new JFrame("Tickets Order for Movies");
		// Setting the width and height of frame
		framelogin.setSize(412, 720);
		framelogin.setLocationRelativeTo(null);
		framelogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set visible
		framelogin.setVisible(true);

		JPanel jPanel1 = new JPanel();
		JPanel upJPanel = new JPanel();
		JLabel lblImage = new JLabel();
		JLabel lblWelcome = new JLabel();
		JPanel downJPanel = new JPanel();
		JLabel lblPassword = new JLabel();
		JLabel lblUserName = new JLabel();
		JTextField txtUserName = new JTextField();
		JPasswordField PasswordField = new JPasswordField();
		JPanel jPanel2 = new JPanel();
		JButton btnLogin = new JButton();
		JLabel lblRegister = new JLabel();
		JLabel jLabel1 = new JLabel();

		jPanel1.setPreferredSize(new Dimension(400, 700));

		upJPanel.setBackground(new Color(244, 244, 244));

		lblImage.setIcon(new ImageIcon(path + "../src/img/Login_head.PNG")); // NOI18N

		lblWelcome.setFont(new Font("Lucida Grande", 1, 18)); // NOI18N
		lblWelcome.setText("Welcome !!!");

		GroupLayout upJPanelLayout = new GroupLayout(upJPanel);
		upJPanel.setLayout(upJPanelLayout);
		upJPanelLayout.setHorizontalGroup(upJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(upJPanelLayout.createSequentialGroup().addGap(45, 45, 45)
						.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(lblWelcome)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		upJPanelLayout.setVerticalGroup(upJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(lblImage, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
				.addGroup(GroupLayout.Alignment.TRAILING,
						upJPanelLayout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(lblWelcome)
								.addGap(70, 70, 70)));

		downJPanel.setBackground(new Color(244, 244, 244));

		lblPassword.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
		lblPassword.setForeground(new Color(91, 50, 86));
		lblPassword.setText("Password :");

		lblUserName.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
		lblUserName.setForeground(new Color(91, 50, 86));
		lblUserName.setText("Username :");

		txtUserName.setBackground(new Color(255, 255, 255));

		PasswordField.setBackground(new Color(255, 255, 255));
		// PasswordField.setText("aaaaaaa");

		btnLogin.setBackground(new Color(210, 215, 211));
		btnLogin.setFont(new Font("Lucida Grande", 1, 16)); // NOI18N
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setText("Log in");
		btnLogin.setMaximumSize(new Dimension(100, 50));
		btnLogin.setMinimumSize(new Dimension(100, 50));

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
				btnLogin, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
				Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE));

		lblRegister.setBackground(new Color(211, 211, 211));
		lblRegister.setFont(new Font("Lucida Grande", 0, 14)); // NOI18N
		lblRegister.setForeground(new Color(91, 50, 86));
		lblRegister.setText("Click here to create a new account");
		lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lblRegisterMouseClicked(evt);
			}
		});

		jLabel1.setIcon(new ImageIcon(path + "../src/img/login.png")); // NOI18N

		GroupLayout downJPanelLayout = new GroupLayout(downJPanel);
		downJPanel.setLayout(downJPanelLayout);
		downJPanelLayout.setHorizontalGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(downJPanelLayout.createSequentialGroup().addGroup(downJPanelLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(downJPanelLayout.createSequentialGroup().addGap(89, 89, 89).addComponent(lblRegister))
						.addGroup(downJPanelLayout.createSequentialGroup().addGap(120, 120, 120)
								.addGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, 160,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(PasswordField, GroupLayout.Alignment.TRAILING,
												GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)))
						.addGroup(downJPanelLayout.createSequentialGroup().addGap(131, 131, 131).addComponent(jLabel1,
								GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
						.addGroup(downJPanelLayout.createSequentialGroup().addGap(53, 53, 53)
								.addGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(lblPassword).addComponent(lblUserName))))
						.addContainerGap(90, Short.MAX_VALUE)));
		downJPanelLayout.setVerticalGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(downJPanelLayout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(lblUserName).addGap(18, 18, 18)
						.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(31, 31, 31).addComponent(lblPassword).addGap(29, 29, 29)
						.addComponent(PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
						.addComponent(lblRegister).addGap(53, 53, 53).addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(downJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(upJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(upJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(downJPanel,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		GroupLayout layout = new GroupLayout(framelogin.getContentPane());
		framelogin.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 413, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 700, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jPanel1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));

		// login
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (txtUserName.getText().compareTo("") == 0) {
					JOptionPane.showMessageDialog(null, "The username cannot be empty!");
				} else if (PasswordField.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "The password cannot be empty!");
				} else {
					String username = txtUserName.getText();
					String password = String.valueOf(PasswordField.getPassword());
					int flag = Login.JudgeUsernamePassword(username, password);
					switch (flag) {
					case 1:
						JOptionPane.showMessageDialog(null, "No such a user!");
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Password is not correct!");
						break;
					case 3:
						framelogin.dispose();
						Operation.choice();
						break;
					}
				}
			}
		});
		//
		// // register
		// registerButton.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// framelogin.dispose();
		// UI.RegisterUI();
		// }
		// });
	}

	private static void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		framelogin.dispose();
		RegisterUI();
	}

	public static void RegisterUI() {
		// create jFrame
		frameregister = new JFrame("Tickets Order for Movies");
		// Setting the width and height of frame
		frameregister.setSize(400, 720);
		frameregister.setLocationRelativeTo(null);
		frameregister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set visible
		frameregister.setVisible(true);

		JPanel jPanel1 = new JPanel();
		JPanel upJPanel = new JPanel();
		JLabel lblImage = new JLabel();
		JLabel lblWelcome = new JLabel();
		JPanel downJPanel = new JPanel();
		JLabel lblPassword = new JLabel();
		JPasswordField txtPassword = new JPasswordField();
		JLabel lblUserName = new JLabel();
		JTextField txtUserName = new JTextField();
		JButton btnBack = new JButton();
		JPanel jPanel2 = new JPanel();
		JButton btnSignUp = new JButton();
		JLabel jLabel1 = new JLabel();

		jPanel1.setPreferredSize(new Dimension(400, 700));

		upJPanel.setBackground(new Color(244, 244, 244));

		lblImage.setIcon(new ImageIcon(path + "../src/img/Login_head.PNG")); // NOI18N

		lblWelcome.setFont(new Font("Lucida Grande", 1, 18)); // NOI18N
		lblWelcome.setText("Welcome !!!");

		GroupLayout upJPanelLayout = new GroupLayout(upJPanel);
		upJPanel.setLayout(upJPanelLayout);
		upJPanelLayout.setHorizontalGroup(upJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(upJPanelLayout.createSequentialGroup().addGap(45, 45, 45)
						.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(lblWelcome)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		upJPanelLayout.setVerticalGroup(upJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(lblImage, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
				.addGroup(GroupLayout.Alignment.TRAILING,
						upJPanelLayout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(lblWelcome)
								.addGap(70, 70, 70)));

		downJPanel.setBackground(new Color(244, 244, 244));

		lblPassword.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
		lblPassword.setForeground(new Color(91, 50, 86));
		lblPassword.setText("Password :");

		txtPassword.setBackground(new Color(255, 255, 255));

		lblUserName.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
		lblUserName.setForeground(new Color(91, 50, 86));
		lblUserName.setText("Username :");

		txtUserName.setBackground(new Color(255, 255, 255));

		btnBack.setFont(new Font("Lucida Grande", 0, 14)); // NOI18N
		btnBack.setForeground(new Color(219, 90, 107));
		btnBack.setText("Back");
		btnBack.setMaximumSize(new Dimension(100, 50));
		btnBack.setMinimumSize(new Dimension(100, 50));
		// back to login
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				frameregister.dispose();
				LoginUI();
			}
		});

		btnSignUp.setBackground(new Color(210, 215, 211));
		btnSignUp.setFont(new Font("Lucida Grande", 1, 16)); // NOI18N
		btnSignUp.setForeground(new Color(0, 0, 0));
		btnSignUp.setText("Sign up");
		btnSignUp.setMaximumSize(new Dimension(100, 50));
		btnSignUp.setMinimumSize(new Dimension(100, 50));
		btnSignUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (txtUserName.getText().compareTo("") == 0) {
					JOptionPane.showMessageDialog(null, "The username cannot be empty!");
				} else if (txtPassword.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "The password cannot be empty!");
				} else {
					String username = txtUserName.getText();
					String password = String.valueOf(txtPassword.getPassword());
					if (Login.IfhasUsername(username))
						JOptionPane.showMessageDialog(null, "There is already such a username!");
					else {
						if (Login.InsertUserinfo(username, password)) {
							JOptionPane.showMessageDialog(null, "Complete!");
							frameregister.dispose();
							UI.LoginUI();
						} else {
							JOptionPane.showMessageDialog(null, "Failed. Please try again.");
						}
					}
				}
			}
		});

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
				btnSignUp, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
				Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
						.addComponent(btnSignUp, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)));

		jLabel1.setIcon(new ImageIcon(path + "../src/img/register.png")); // NOI18N

		GroupLayout downJPanelLayout = new GroupLayout(downJPanel);
		downJPanel.setLayout(downJPanelLayout);
		downJPanelLayout.setHorizontalGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(downJPanelLayout.createSequentialGroup().addGroup(downJPanelLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(downJPanelLayout.createSequentialGroup().addContainerGap()
								.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addGap(80, 80, 80).addComponent(jLabel1))
						.addGroup(downJPanelLayout.createSequentialGroup().addGap(54, 54, 54)
								.addGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblUserName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(51, 51, 51)
								.addGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, 140,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(txtPassword, GroupLayout.Alignment.TRAILING,
												GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(57, Short.MAX_VALUE)));
		downJPanelLayout.setVerticalGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(downJPanelLayout.createSequentialGroup().addGroup(downJPanelLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(downJPanelLayout.createSequentialGroup().addGap(21, 21, 21).addComponent(btnBack,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(downJPanelLayout.createSequentialGroup().addGap(47, 47, 47).addComponent(jLabel1)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
						.addGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUserName))
						.addGap(30, 30, 30)
						.addGroup(downJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(lblPassword).addComponent(txtPassword, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(117, 117, 117).addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(downJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(upJPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(upJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(downJPanel,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		GroupLayout layout = new GroupLayout(frameregister.getContentPane());
		frameregister.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jPanel1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 700, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jPanel1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));

	}

	public static void MovieUI() {
		framemovie = new JFrame("Tickets Order for Movies");
		framemovie.setBounds(100, 100, 400, 700);

		framemovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framemovie.setLocationRelativeTo(null);

		framemovie.setVisible(true);

		JPanel panel = new JPanel();
		framemovie.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		Color white = new Color(255, 255, 255);
		Color whitegray = new Color(244, 244, 244);

		// bottom buttons group
		JButton moviebtn = new JButton();
		JButton theaterbtn = new JButton();
		JButton userbtn = new JButton();
		moviebtn.setIcon(new ImageIcon(path + "../src/img/movie.png"));
		theaterbtn.setIcon(new ImageIcon(path + "../src/img/theatres.png"));
		userbtn.setIcon(new ImageIcon(path + "../src/img/user.png"));
		moviebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				framemovie.dispose();
				MovieUI();
			}
		});
		theaterbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				framemovie.dispose();
				TheaterUI();
			}
		});
		userbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				framemovie.dispose();
				UserInfoUI();
			}
		});
		JPanel bottombtnpanel = new JPanel();
		bottombtnpanel.setBackground(whitegray);
		bottombtnpanel.setLayout(new GridLayout(1, 3));
		bottombtnpanel.add(moviebtn);
		bottombtnpanel.add(theaterbtn);
		bottombtnpanel.add(userbtn);
		panel.add(bottombtnpanel, BorderLayout.SOUTH);

		// search group
		JPanel searchpanel = new JPanel();
		searchpanel.setBackground(whitegray);
		JButton searchbtn = new JButton();
		searchbtn.setIcon(new ImageIcon(path + "../src/img/search.png"));
		JTextField searchtext = new JTextField();
		searchtext.setPreferredSize(new Dimension(300, 35));
		searchpanel.add(searchtext);
		searchpanel.add(searchbtn);
		panel.add(searchpanel, BorderLayout.NORTH);

		// content panel
		JPanel contentpanel = new JPanel();
		contentpanel.setBackground(whitegray);
		contentpanel.setLayout(null);
		contentpanel.setPreferredSize(new Dimension(400, 10 + 155 * Operation.operation.getMovies().size()));
		JScrollPane content = new JScrollPane(contentpanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.setBorder(null);
		panel.add(content, BorderLayout.CENTER);
		int i = 0;
		for (Movie movie : Operation.operation.getMovies()) {
			JPanel movie_panel = new JPanel();
			movie_panel.setLayout(null);
			movie_panel.setBackground(white);
			movie_panel.setBounds(5, 5 + 155 * i, 380, 150);
			// movie_panel.setLayout(new GridLayout(1, 3));
			JLabel movie_picture = new JLabel();
			movie_picture.setBounds(0, 0, 100, 150);
			ImageIcon moviepicture = new ImageIcon(path + "../src/img/" + movie.getMoviePicture() + ".png");
			moviepicture.setImage(moviepicture.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
			movie_picture.setIcon(moviepicture);

			JPanel movie_info = new JPanel();
			movie_info.setLayout(null);
			movie_info.setBounds(100, 0, 180, 150);
			movie_info.setBackground(white);
			JLabel movie_name = new JLabel(movie.getMovieName());
			movie_name.setBounds(10, 5, 170, 30);
			JLabel movie_class = new JLabel(movie.getMovieClass());
			movie_class.setBounds(10, 40, 170, 30);
			JLabel movie_actors = new JLabel(movie.getMovieActors());
			movie_actors.setBounds(10, 75, 170, 30);
			JLabel movie_description = new JLabel(movie.getMovieDescription());
			movie_description.setBounds(10, 110, 170, 30);
			movie_info.add(movie_name);
			movie_info.add(movie_class);
			movie_info.add(movie_actors);
			movie_info.add(movie_description);

			JButton movie_btn = new JButton("Order");
			movie_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					framemovie.dispose();
					TheaterUI(movie);
				}
			});
			movie_btn.setBounds(285, 95, 90, 50);
			movie_panel.add(movie_picture);
			movie_panel.add(movie_info);
			movie_panel.add(movie_btn);
			contentpanel.add(movie_panel);

			i++;
		}
	}

	public static void MovieUI(Theater theater) {
		framemovie = new JFrame("Tickets Order for Movies");
		framemovie.setBounds(100, 100, 400, 700);

		framemovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framemovie.setLocationRelativeTo(null);

		framemovie.setVisible(true);

		JPanel panel = new JPanel();
		framemovie.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		Color white = new Color(255, 255, 255);
		Color whitegray = new Color(244, 244, 244);

		// search group
		JPanel searchpanel = new JPanel();
		searchpanel.setPreferredSize(new Dimension(180, 40));
		searchpanel.setLayout(null);
		searchpanel.setBackground(whitegray);
		// button for back
		JButton backButton = new JButton("⬅");
		backButton.setBounds(0, 0, 60, 40);
		panel.add(backButton);

		// back to choice
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				framemovie.dispose();
				TheaterUI();
			}
		});
		searchpanel.add(backButton);
		panel.add(searchpanel, BorderLayout.NORTH);

		// content panel
		JPanel contentpanel = new JPanel();
		contentpanel.setBackground(whitegray);
		contentpanel.setLayout(null);
		contentpanel.setPreferredSize(new Dimension(400, 10 + 155 * Operation.operation.getMovies().size()));
		JScrollPane content = new JScrollPane(contentpanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.setBorder(null);
		panel.add(content, BorderLayout.CENTER);
		int i = 0;
		for (Movie movie : Operation.operation.getMovies()) {
			JPanel movie_panel = new JPanel();
			movie_panel.setLayout(null);
			movie_panel.setBackground(white);
			movie_panel.setBounds(5, 5 + 155 * i, 380, 150);
			// movie_panel.setLayout(new GridLayout(1, 3));
			JLabel movie_picture = new JLabel();
			movie_picture.setBounds(0, 0, 90, 150);
			ImageIcon moviepicture = new ImageIcon(path + "../src/img/" + movie.getMoviePicture() + ".png");
			moviepicture.setImage(moviepicture.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
			movie_picture.setIcon(moviepicture);

			JPanel movie_info = new JPanel();
			movie_info.setLayout(null);
			movie_info.setBounds(90, 0, 180, 150);
			movie_info.setBackground(white);
			JLabel movie_name = new JLabel(movie.getMovieName());
			movie_name.setBounds(10, 5, 170, 30);
			JLabel movie_class = new JLabel(movie.getMovieClass());
			movie_class.setBounds(10, 40, 170, 30);
			JLabel movie_actors = new JLabel(movie.getMovieActors());
			movie_actors.setBounds(10, 75, 170, 30);
			JLabel movie_description = new JLabel(movie.getMovieDescription());
			movie_description.setBounds(10, 110, 170, 30);
			movie_info.add(movie_name);
			movie_info.add(movie_class);
			movie_info.add(movie_actors);
			movie_info.add(movie_description);

			JButton movie_btn = new JButton("Order");
			movie_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					framemovie.dispose();
					HallUI(theater, movie, 1);
				}
			});
			movie_btn.setBounds(275, 95, 100, 50);
			movie_panel.add(movie_picture);
			movie_panel.add(movie_info);
			movie_panel.add(movie_btn);
			contentpanel.add(movie_panel);

			i++;
		}
	}

	public static void TheaterUI() {
		frametheater = new JFrame("Tickets Order for Movies");
		frametheater.setBounds(100, 100, 400, 700);

		frametheater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frametheater.setLocationRelativeTo(null);

		frametheater.setVisible(true);

		JPanel panel = new JPanel();
		frametheater.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		Color white = new Color(255, 255, 255);
		Color whitegray = new Color(244, 244, 244);

		// bottom buttons group
		JButton moviebtn = new JButton();
		JButton theaterbtn = new JButton();
		JButton userbtn = new JButton();
		moviebtn.setIcon(new ImageIcon(path + "../src/img/movie.png"));
		theaterbtn.setIcon(new ImageIcon(path + "../src/img/theatres.png"));
		userbtn.setIcon(new ImageIcon(path + "../src/img/user.png"));
		moviebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frametheater.dispose();
				MovieUI();
			}
		});
		theaterbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frametheater.dispose();
				TheaterUI();
			}
		});
		userbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frametheater.dispose();
				UserInfoUI();
			}
		});
		JPanel bottombtnpanel = new JPanel();
		bottombtnpanel.setBackground(whitegray);
		bottombtnpanel.setLayout(new GridLayout(1, 3));
		bottombtnpanel.add(moviebtn);
		bottombtnpanel.add(theaterbtn);
		bottombtnpanel.add(userbtn);
		panel.add(bottombtnpanel, BorderLayout.SOUTH);

		// search group
		JPanel searchpanel = new JPanel();
		searchpanel.setBackground(whitegray);
		JButton searchbtn = new JButton();
		searchbtn.setIcon(new ImageIcon(path + "../src/img/search.png"));
		JTextField searchtext = new JTextField();
		searchtext.setPreferredSize(new Dimension(300, 35));
		searchpanel.add(searchtext);
		searchpanel.add(searchbtn);
		panel.add(searchpanel, BorderLayout.NORTH);

		// content panel
		JPanel contentpanel = new JPanel();
		contentpanel.setBackground(whitegray);
		contentpanel.setLayout(null);
		contentpanel.setPreferredSize(new Dimension(400, 10 + 105 * Operation.operation.getTheaters().size()));
		JScrollPane content = new JScrollPane(contentpanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.setBorder(null);
		panel.add(content, BorderLayout.CENTER);
		int i = 0;
		for (Theater theater : Operation.operation.getTheaters()) {
			JPanel theater_panel = new JPanel();
			theater_panel.setLayout(null);
			theater_panel.setBackground(white);
			theater_panel.setBounds(5, 5 + 105 * i, 380, 100);
			// movie_panel.setLayout(new GridLayout(1, 3));

			JPanel theater_info = new JPanel();
			theater_info.setLayout(null);
			theater_info.setBounds(10, 0, 260, 100);
			theater_info.setBackground(white);
			JLabel theater_name = new JLabel(theater.getTheaterName());
			theater_name.setBounds(10, 10, 260, 20);
			JLabel theater_location = new JLabel(theater.getTheaterLocation());
			theater_location.setBounds(10, 35, 260, 20);
			JLabel theater_description = new JLabel(theater.getTheaterDescription());
			theater_description.setBounds(10, 60, 260, 20);
			theater_info.add(theater_name);
			theater_info.add(theater_location);
			theater_info.add(theater_description);

			JButton theater_btn = new JButton("Order");
			theater_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frametheater.dispose();
					MovieUI(theater);
				}
			});
			theater_btn.setBounds(275, 45, 100, 50);
			theater_panel.add(theater_info);
			theater_panel.add(theater_btn);
			contentpanel.add(theater_panel);

			i++;
		}
	}

	public static void TheaterUI(Movie movie) {
		frametheater = new JFrame("Tickets Order for Movies");
		frametheater.setBounds(100, 100, 400, 700);

		frametheater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frametheater.setLocationRelativeTo(null);

		frametheater.setVisible(true);

		JPanel panel = new JPanel();
		frametheater.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		Color white = new Color(255, 255, 255);
		Color whitegray = new Color(244, 244, 244);

		// search group
		JPanel searchpanel = new JPanel();
		searchpanel.setPreferredSize(new Dimension(180, 40));
		searchpanel.setLayout(null);
		searchpanel.setBackground(whitegray);
		// button for back
		JButton backButton = new JButton("⬅");
		backButton.setBounds(0, 0, 60, 40);
		panel.add(backButton);

		// back to choice
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				frametheater.dispose();
				MovieUI();
			}
		});
		searchpanel.add(backButton);
		panel.add(searchpanel, BorderLayout.NORTH);

		// content panel
		JPanel contentpanel = new JPanel();
		contentpanel.setBackground(whitegray);
		contentpanel.setLayout(null);
		contentpanel.setPreferredSize(new Dimension(400, 10 + 105 * Operation.operation.getTheaters().size()));
		JScrollPane content = new JScrollPane(contentpanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.setBorder(null);
		panel.add(content, BorderLayout.CENTER);
		int i = 0;
		for (Theater theater : Operation.operation.getTheaters()) {
			JPanel theater_panel = new JPanel();
			theater_panel.setLayout(null);
			theater_panel.setBackground(white);
			theater_panel.setBounds(5, 5 + 105 * i, 380, 100);
			// movie_panel.setLayout(new GridLayout(1, 3));

			JPanel theater_info = new JPanel();
			theater_info.setLayout(null);
			theater_info.setBounds(10, 0, 260, 100);
			theater_info.setBackground(white);
			JLabel theater_name = new JLabel(theater.getTheaterName());
			theater_name.setBounds(10, 10, 260, 20);
			JLabel theater_location = new JLabel(theater.getTheaterLocation());
			theater_location.setBounds(10, 35, 260, 20);
			JLabel theater_description = new JLabel(theater.getTheaterDescription());
			theater_description.setBounds(10, 60, 260, 20);
			theater_info.add(theater_name);
			theater_info.add(theater_location);
			theater_info.add(theater_description);

			JButton theater_btn = new JButton("Order");
			theater_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frametheater.dispose();
					HallUI(theater, movie, 2);
				}
			});
			theater_btn.setBounds(275, 45, 100, 50);
			theater_panel.add(theater_info);
			theater_panel.add(theater_btn);
			contentpanel.add(theater_panel);

			i++;
		}
	}

	public static void HallUI(Theater theater, Movie movie, int flag) {
		framehall = new JFrame("Tickets Order for Movies");
		framehall.setBounds(100, 100, 400, 700);

		framehall.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framehall.setLocationRelativeTo(null);

		framehall.setVisible(true);

		JPanel panel = new JPanel();
		framehall.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		Color white = new Color(255, 255, 255);
		Color whitegray = new Color(244, 244, 244);
		Color grey = new Color(233, 233, 233);
		// search group
		JPanel searchpanel = new JPanel();
		searchpanel.setPreferredSize(new Dimension(180, 40));
		searchpanel.setLayout(null);
		searchpanel.setBackground(whitegray);
		// button for back
		JButton backButton = new JButton("⬅");
		backButton.setBounds(0, 0, 60, 40);

		// back to choice
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (flag == 1) {
					framehall.dispose();
					MovieUI(theater);
				} else if (flag == 2) {
					framehall.dispose();
					TheaterUI(movie);
				}

			}
		});

		JLabel movienamelable = new JLabel(movie.getMovieName(), JLabel.CENTER);
		movienamelable.setBounds(100, 0, 200, 40);
		searchpanel.add(backButton);
		searchpanel.add(movienamelable);
		panel.add(searchpanel, BorderLayout.NORTH);

		// info of theater
		JPanel theaterpanel = new JPanel();
		theaterpanel.setBackground(grey);
		theaterpanel.setPreferredSize(new Dimension(400, 100));
		theaterpanel.setLayout(null);
		panel.add(theaterpanel, BorderLayout.SOUTH);
		JPanel theater_panel = new JPanel();
		theater_panel.setLayout(null);
		theater_panel.setBackground(grey);
		theater_panel.setBounds(5, 5, 390, 100);
		// movie_panel.setLayout(new GridLayout(1, 3));
		JPanel theater_info = new JPanel();
		theater_info.setLayout(null);
		theater_info.setBounds(10, 0, 390, 100);
		JLabel theater_name = new JLabel(theater.getTheaterName(), JLabel.CENTER);
		theater_name.setBounds(0, 10, 390, 20);
		JLabel theater_location = new JLabel(theater.getTheaterLocation(), JLabel.CENTER);
		theater_location.setBounds(0, 35, 390, 20);
		JLabel theater_description = new JLabel(theater.getTheaterDescription(), JLabel.CENTER);
		theater_description.setBounds(0, 60, 390, 20);
		theater_panel.add(theater_name);
		theater_panel.add(theater_location);
		theater_panel.add(theater_description);
		theaterpanel.add(theater_panel);

		// content panel
		JPanel contentpanel = new JPanel();
		contentpanel.setBackground(whitegray);
		contentpanel.setLayout(null);
		contentpanel.setPreferredSize(
				new Dimension(400, 10 + 105 * Order.ifhasthismovieinthistheater(movie, theater).size()));
		JScrollPane content = new JScrollPane(contentpanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.setBorder(null);
		panel.add(content, BorderLayout.CENTER);

		if (Order.ifhasthismovieinthistheater(movie, theater).size() == 0) {
			JLabel warnLabel = new JLabel("No arrangement in recent time!", JLabel.CENTER);
			warnLabel.setBounds(0, 10, 400, 50);
			contentpanel.add(warnLabel);
		} else {
			int i = 0;
			for (Arrangement arrangement : Order.ifhasthismovieinthistheater(movie, theater)) {
				JPanel arrangement_panel = new JPanel();
				arrangement_panel.setLayout(null);
				arrangement_panel.setBackground(white);
				arrangement_panel.setBounds(5, 5 + 105 * i, 380, 100);
				// movie_panel.setLayout(new GridLayout(1, 3));

				JPanel arrangement_info = new JPanel();
				arrangement_info.setLayout(null);
				arrangement_info.setBounds(10, 0, 260, 100);
				arrangement_info.setBackground(white);
				JLabel arrangement_hallid = new JLabel("No." + arrangement.getHallid() + " Hall");
				arrangement_hallid.setBounds(10, 10, 260, 20);
				JLabel start_time = new JLabel("Start at : " + arrangement.getStarttime());
				start_time.setBounds(10, 35, 260, 20);
				JLabel end_time = new JLabel("End at : " + arrangement.getEndtime());
				end_time.setBounds(10, 60, 260, 20);
				arrangement_info.add(arrangement_hallid);
				arrangement_info.add(start_time);
				arrangement_info.add(end_time);
				if (!Order.ifArrangementisFull(arrangement)) {
					JButton aarrangementButton = new JButton("Order");
					aarrangementButton.setBounds(275, 45, 100, 50);
					aarrangementButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							framehall.dispose();
							OrderUI(arrangement.getArrangementid(), theater, movie, flag);
						}
					});
					arrangement_panel.add(aarrangementButton);
				} else {
					JLabel aarrangementFull = new JLabel("Full", JLabel.CENTER);
					aarrangementFull.setBounds(275, 45, 100, 50);
					arrangement_panel.add(aarrangementFull);
				}
				arrangement_panel.add(arrangement_info);
				contentpanel.add(arrangement_panel);

				i++;

			}
		}

	}

	public static void OrderUI(int arrangementid, Theater theater, Movie movie, int flag) {
		frameorder = new JFrame("Tickets Order for Movies");
		frameorder.setBounds(100, 100, 400, 700);

		frameorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameorder.setLocationRelativeTo(null);

		frameorder.setVisible(true);

		JPanel panel = new JPanel();
		frameorder.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		// Color white = new Color(255, 255, 255);
		Color whitegray = new Color(244, 244, 244);
		Color grey = new Color(233, 233, 233);

		// search group
		JPanel searchpanel = new JPanel();
		searchpanel.setPreferredSize(new Dimension(180, 40));
		searchpanel.setLayout(null);
		searchpanel.setBackground(whitegray);
		// button for back
		JButton backButton = new JButton("⬅");
		backButton.setBounds(0, 0, 60, 40);
		panel.add(backButton);

		// back to choice
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				frameorder.dispose();
				HallUI(theater, movie, flag);
			}
		});
		searchpanel.add(backButton);
		panel.add(searchpanel, BorderLayout.NORTH);

		JLabel movienamelable = new JLabel(movie.getMovieName(), JLabel.CENTER);
		movienamelable.setBounds(100, 0, 200, 40);
		searchpanel.add(backButton);
		searchpanel.add(movienamelable);
		panel.add(searchpanel, BorderLayout.NORTH);

		// info of order
		JPanel orderpanel = new JPanel();
		orderpanel.setBackground(grey);
		orderpanel.setPreferredSize(new Dimension(400, 100));
		orderpanel.setLayout(null);
		panel.add(orderpanel, BorderLayout.CENTER);
		JPanel orderinfo_panel = new JPanel();
		orderinfo_panel.setLayout(null);
		orderinfo_panel.setBackground(grey);
		orderinfo_panel.setBounds(5, 5, 390, 100);
		// movie_panel.setLayout(new GridLayout(1, 3));
		JPanel theater_info = new JPanel();
		theater_info.setLayout(null);
		theater_info.setBounds(10, 0, 260, 100);
		JLabel movie_name = new JLabel(movie.getMovieName());
		movie_name.setBounds(10, 10, 260, 20);
		JLabel theater_name = new JLabel(theater.getTheaterName());
		theater_name.setBounds(10, 35, 260, 20);
		JLabel start_time = new JLabel("Start at : "
				+ DatabaseFactory.databasefactory.getobject().getArrangementthroughid(arrangementid).getStarttime());
		start_time.setBounds(10, 60, 260, 20);
		JLabel end_time = new JLabel("End at : "
				+ DatabaseFactory.databasefactory.getobject().getArrangementthroughid(arrangementid).getEndtime());
		end_time.setBounds(10, 85, 260, 20);
		orderinfo_panel.add(movie_name);
		orderinfo_panel.add(theater_name);
		orderinfo_panel.add(start_time);
		orderinfo_panel.add(end_time);
		orderpanel.add(orderinfo_panel);

		// order
		JPanel numpanel = new JPanel();
		numpanel.setBackground(whitegray);
		numpanel.setPreferredSize(new Dimension(400, 200));
		numpanel.setLayout(null);
		panel.add(numpanel, BorderLayout.SOUTH);
		// 添加一个标签
		JLabel label = new JLabel("number of tickets：", JLabel.CENTER);
		label.setBounds(10, 20, 200, 50);
		numpanel.add(label);

		// 需要选择的条目
		String[] listData = new String[] { "1", "2", "3", "4" };

		// 创建一个下拉列表框
		final JComboBox<String> numberofticket = new JComboBox<String>(listData);
		numberofticket.setBounds(210, 20, 100, 50);
		// 设置默认选中的条目
		numberofticket.setSelectedIndex(0);
		// 添加到内容面板
		numpanel.add(numberofticket);

		JButton submitbutton = new JButton("Submit");
		submitbutton.setBounds(310, 145, 80, 50);
		numpanel.add(submitbutton);

		submitbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out
						.println("选中: " + numberofticket.getSelectedIndex() + " = " + numberofticket.getSelectedItem());
				int ticketnum = Integer.valueOf("" + numberofticket.getSelectedItem());
				if (Order.ifArrangementisEnough(arrangementid, ticketnum)) {
					if (Order.InsertOrderRecord(Operation.operation.getUser().getUserId(), arrangementid, ticketnum)) {
						JOptionPane.showMessageDialog(null, "Complete!");
						frameorder.dispose();
						UI.UserInfoUI();
					} else {
						JOptionPane.showMessageDialog(null, "Failed. Please try again.");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Sorry! There is no enough seats.");
				}
			}
		});

	}

	public static void UserInfoUI() {
		frameuserinfo = new JFrame("Tickets Order for Movies");
		frameuserinfo.setBounds(100, 100, 400, 700);

		frameuserinfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameuserinfo.setLocationRelativeTo(null);

		frameuserinfo.setVisible(true);

		JPanel panel = new JPanel();
		frameuserinfo.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		// Color white = new Color(255, 255, 255);
		Color whitegray = new Color(244, 244, 244);

		// bottom buttons group
		JButton moviebtn = new JButton();
		JButton theaterbtn = new JButton();
		JButton userbtn = new JButton();
		moviebtn.setIcon(new ImageIcon(path + "../src/img/movie.png"));
		theaterbtn.setIcon(new ImageIcon(path + "../src/img/theatres.png"));
		userbtn.setIcon(new ImageIcon(path + "../src/img/user.png"));
		moviebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameuserinfo.dispose();
				MovieUI();
			}
		});
		theaterbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameuserinfo.dispose();
				TheaterUI();
			}
		});
		userbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameuserinfo.dispose();
				UserInfoUI();
			}
		});
		JPanel bottombtnpanel = new JPanel();
		bottombtnpanel.setBackground(whitegray);
		bottombtnpanel.setLayout(new GridLayout(1, 3));
		bottombtnpanel.add(moviebtn);
		bottombtnpanel.add(theaterbtn);
		bottombtnpanel.add(userbtn);
		panel.add(bottombtnpanel, BorderLayout.SOUTH);

		// content panel
		JPanel contentpanel = new JPanel();
		contentpanel.setBackground(whitegray);
		contentpanel.setLayout(null);
		contentpanel.setPreferredSize(new Dimension(400, 600));
		panel.add(contentpanel, BorderLayout.NORTH);

		// Profile
		JButton headbtn = new JButton();
		ImageIcon headicon = new ImageIcon(path + "../src/img/demo.png");
		headicon.setImage(headicon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		headbtn.setIcon(headicon);
		headbtn.setBounds(30, 30, 70, 70);
		// Name
		JLabel user_name = new JLabel();
		user_name.setBounds(150, 35, 300, 50);
		user_name.setFont(new java.awt.Font("Dialog", 0, 20));
		user_name.setText(Operation.operation.getUser().getUserName());
		// Edit
		JButton setbtn = new JButton();
		ImageIcon seticon = new ImageIcon(path + "../src/img/set.png");
		seticon.setImage(seticon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		setbtn.setIcon(seticon);
		setbtn.setBounds(350, 50, 20, 20);

		// Location
		ImageIcon location = new ImageIcon(path + "../src/img/location.png");
		location.setImage(location.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		JButton locationbtn = new JButton("Location", location);
		locationbtn.setFont(new java.awt.Font("Dialog", 0, 15));
		locationbtn.setBounds(0, 120, 400, 50);
		locationbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// f.dispose();
				// Six.demo("location");
			}
		});

		// purchase history
		ImageIcon history = new ImageIcon(path + "../src/img/history.png");
		history.setImage(history.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		JButton recordbtn = new JButton("Purchase History", history);
		recordbtn.setFont(new java.awt.Font("Dialog", 0, 15));
		recordbtn.setBounds(0, 163, 400, 50);
		recordbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameuserinfo.dispose();
				RecordUI();
				// History.demo();
			}
		});

		// help
		ImageIcon help = new ImageIcon(path + "../src/img/help.png");
		help.setImage(help.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		JButton helpbtn = new JButton("Help", help);
		helpbtn.setFont(new java.awt.Font("Dialog", 0, 15));
		helpbtn.setBounds(0, 230, 400, 50);
		helpbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// f.dispose();//点击按钮时frame1销毁,new一个frame2
				// Six.demo("help");
			}
		});

		// about
		ImageIcon about = new ImageIcon(path + "../src/img/about.png");
		about.setImage(about.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		JButton aboutbtn = new JButton("About", about);
		aboutbtn.setFont(new java.awt.Font("Dialog", 0, 15));
		aboutbtn.setBounds(0, 273, 400, 50);
		aboutbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// f.dispose();//点击按钮时frame1销毁,new一个frame2
				// Six.demo("about");
			}
		});

		// Logout
		JButton logoutbtn = new JButton("Log out");
		logoutbtn.setForeground(Color.RED);
		logoutbtn.setBounds(0, 500, 400, 50);
		logoutbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameuserinfo.dispose();
				LoginUI();
			}
		});

		contentpanel.add(headbtn);
		contentpanel.add(user_name);
		contentpanel.add(setbtn);
		contentpanel.add(logoutbtn);
		contentpanel.add(recordbtn);
		contentpanel.add(locationbtn);
		contentpanel.add(helpbtn);
		contentpanel.add(aboutbtn);

		// to user record
		// userrecord.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // TODO Auto-generated method stub
		//
		// frameuserinfo.dispose();
		// RecordUI();
		// }
		// });

	}

	public static void RecordUI() {
		framerecord = new JFrame("Tickets Order for Movies");
		framerecord.setBounds(100, 100, 400, 700);

		framerecord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framerecord.setLocationRelativeTo(null);

		framerecord.setVisible(true);

		JPanel panel = new JPanel();
		framerecord.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());

		Color white = new Color(255, 255, 255);
		Color whitegray = new Color(244, 244, 244);

		// search group
		JPanel searchpanel = new JPanel();
		searchpanel.setPreferredSize(new Dimension(180, 40));
		searchpanel.setLayout(null);
		searchpanel.setBackground(whitegray);
		// button for back
		JButton backButton = new JButton("⬅");
		backButton.setBounds(0, 0, 60, 40);
		panel.add(backButton);

		// back to choice
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				framerecord.dispose();
				UserInfoUI();
			}
		});
		searchpanel.add(backButton);
		panel.add(searchpanel, BorderLayout.NORTH);

		// content panel
		JPanel contentpanel = new JPanel();
		contentpanel.setBackground(whitegray);
		contentpanel.setLayout(null);
		contentpanel.setPreferredSize(new Dimension(400, 10 + 105 * Operation.operation.getTicketrecords().size()));
		JScrollPane content = new JScrollPane(contentpanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		content.setBorder(null);
		panel.add(content, BorderLayout.CENTER);

		Order.UpdateUserRecord();

		int i = 0;
		for (TicketRecord ticketrecord : Operation.operation.getTicketrecords()) {
			JPanel record_panel = new JPanel();
			record_panel.setLayout(null);
			record_panel.setBackground(white);
			record_panel.setBounds(5, 5 + 105 * i, 380, 100);
			// movie_panel.setLayout(new GridLayout(1, 3));

			JPanel record_info = new JPanel();
			record_info.setLayout(null);
			record_info.setBounds(10, 0, 260, 100);
			record_info.setBackground(white);
			JLabel record_movie_name = new JLabel(DatabaseFactory.databasefactory.getobject()
					.getMovienamethrougharrangementid(ticketrecord.getArrangementId()));
			record_movie_name.setBounds(10, 10, 260, 20);
			JLabel record_theater_name = new JLabel(DatabaseFactory.databasefactory.getobject()
					.getTheaternamethrougharrangementid(ticketrecord.getArrangementId()));
			record_theater_name.setBounds(10, 35, 260, 20);
			JLabel ticket_num = new JLabel("Number of Tickets: " + ticketrecord.getTicketNum());
			ticket_num.setBounds(10, 60, 260, 20);
			record_info.add(record_movie_name);
			record_info.add(record_theater_name);
			record_info.add(ticket_num);

			if (ticketrecord.getRecordState() == 0) {
				JButton ticketrecordbutton = new JButton("Refund");
				ticketrecordbutton.setBounds(275, 45, 100, 50);
				record_panel.add(ticketrecordbutton);
				ticketrecordbutton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (Order.RefundTicket(ticketrecord.getRecordId())) {
							JOptionPane.showMessageDialog(null, "Complete!");
							framerecord.dispose();
							RecordUI();
						} else {
							JOptionPane.showMessageDialog(null, "Failed! Please try again!");
						}
					}
				});
			} else if (ticketrecord.getRecordState() == 1) {
				JLabel ticketrecordInvalid = new JLabel("Refunded");
				ticketrecordInvalid.setBounds(290, 50, 85, 45);
				record_panel.add(ticketrecordInvalid);
			} else {
				JLabel ticketrecordInvalid = new JLabel("Invalid");
				ticketrecordInvalid.setBounds(300, 50, 75, 45);
				record_panel.add(ticketrecordInvalid);
			}
			record_panel.add(record_info);
			contentpanel.add(record_panel);

			i++;
		}
	}
}