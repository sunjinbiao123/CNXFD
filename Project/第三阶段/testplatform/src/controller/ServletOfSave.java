package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class ServletOfSave
 */
@WebServlet("/save")
public class ServletOfSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOfSave() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private List<String> getColumnLabels(ResultSet resultSet)
			throws SQLException {
		List<String> labels = new ArrayList<String>();
 
		ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
		for (int i = 0; i < rsmd.getColumnCount(); i++) {
			labels.add(rsmd.getColumnLabel(i + 1));
		}
 
		return labels;
	}
    
    public List<Map<String, Object>> handleResultSetToMapList(
			ResultSet resultSet) throws SQLException {
		List<Map<String, Object>> values = new ArrayList<Map<String, Object>>();
 
		List<String> columnLabels = getColumnLabels(resultSet);
		Map<String, Object> map = null;
 
		while (resultSet.next()) {
			map = new HashMap<String, Object>();
 
			for (String columnLabel : columnLabels) {
				Object value = resultSet.getObject(columnLabel);
				map.put(columnLabel, value);
			}
			values.add(map);
		}
		return values;
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String surl="jdbc:mysql://localhost:3306/testinterface?serverTimezone=UTC";
			String user="root";
			String password="87654321";
			Connection conn=DriverManager.getConnection(surl, user, password);
			String sql="select * from resultset";
			System.out.println(sql);
			PreparedStatement stmt=(PreparedStatement) conn.prepareStatement(sql);
			ResultSet set = stmt.executeQuery();
			List<Map<String, Object>> values = handleResultSetToMapList(set);
			System.out.println(values);
			conn.close();
			request.setAttribute("id", values.get(values.size()-1).get("id"));
			request.setAttribute("casename", values.get(values.size()-1).get("casename"));
			request.setAttribute("reqway", values.get(values.size()-1).get("reqway"));
			request.setAttribute("url", values.get(values.size()-1).get("url"));
			request.setAttribute("sumway",values.get(values.size()-1).get("sumway"));
			request.setAttribute("cases", values.get(values.size()-1).get("cases"));
			request.setAttribute("owner", values.get(values.size()-1).get("owner"));
			request.setAttribute("data", values.get(values.size()-1).get("date"));
			request.getRequestDispatcher("usecase.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
