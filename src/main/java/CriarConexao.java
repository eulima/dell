

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/CriarConexao")
public class CriarConexao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CriarConexao() {
        super();    
    }
	
    public static Connection getConexao() throws SQLException{	
		try{
	   Class.forName("com.mysql.jdbc.Driver");
	   System.out.print("---CONNECTOU----");
	   
	 //  return DriverManager.getConnection("jdbc:mysql://localhost:3306/eugenio","root","rafael12");
	
	   return DriverManager.getConnection("jdbc:mysql://127.7.71.2:3306/eugenio","adminKnxmK8C","jAC5TjTqV8nr");
	   
		} catch (SQLException e){
			System.out.print("===CATCH A CONNECTACAO===="+ e);
			throw new SQLException(e);
			}catch	(ClassNotFoundException e1){
				System.out.print("CLASSNOT FOUND EXCEPTION"+ e1);
				throw new SQLException(e1);
			}
		}
}
