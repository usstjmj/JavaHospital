import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;

public class PLogin {
	public PLogin(){
		Connection con=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Statement st=null;
		if(con!=null)
			System.out.println("���ӳɹ�");
		
			try {
				st=con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		String sql="select * from medicine";
		
		JFrame frm=new JFrame("Ժ����¼");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel top=new JPanel();
		frm.getContentPane().add(top, BorderLayout.NORTH);
		JLabel label=new JLabel("ҩ��������Ϣ");
		top.add(label);
		
		JPanel center=new JPanel();
		frm.getContentPane().add(center, BorderLayout.CENTER);
		JTextArea area=new JTextArea();
		
		
		
		try {
			ResultSet rs=st.executeQuery(sql);
			while (rs.next()){
				
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//��ɾ��һ����executeUpdate����
		}
		
		System.out.println(area.getText());
		
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		frm.setBounds(400,200,400,200);
		frm.setVisible(true);
		
	}
	

}