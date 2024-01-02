package com.sayan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.sayan.dao.ProductDAO;
import com.sayan.dto.ProductVO;

public class ProductDAO {
private static ProductDAO instance = new ProductDAO();
	
	private ProductDAO() {}
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds;
			ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//DB의 전체 DATA검색
	public List<ProductVO> selectAllProduct(){
		
		List<ProductVO> productList = new ArrayList<ProductVO>();
		
		String sql ="select * from product order by code desc";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setCode(rs.getInt("code"));
				vo.setName(rs.getString("name"));
				vo.setPrice(rs.getInt("price"));
				vo.setPictureurl(rs.getString("pictureurl"));
				vo.setDescription(rs.getString("description"));
				
				productList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ProductDAO.close(conn, pstmt, rs);
		}
		
		
		return productList;
	}
	
	//기본키 code 해당하는 데이터만 검색
	public ProductVO selectProductByCode(String code) {
		ProductVO vo = new ProductVO();
		
		String sql ="select * from product where code=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(code));
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setCode(rs.getInt("code"));
				vo.setName(rs.getString("name"));
				vo.setPrice(rs.getInt("price"));
				vo.setPictureurl(rs.getString("pictureurl"));
				vo.setDescription(rs.getString("description"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ProductDAO.close(conn, pstmt, rs);
		}
		return vo;
	}
	
	//id, password 체크
	public int userCheck(String userid, String pwd) {
		return 0;
	}
	
	//id 존재여부 체크
	public int confirmID(String userid) {
		return 0;
	}
	
	//데이터 추가
	public int insertProduct(ProductVO vo) {
		int result = -1;
		String sql = "insert into product values(product_seq.nextval, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt= null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			//매핑
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setString(3, vo.getPictureurl());
			pstmt.setString(4, vo.getDescription());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ProductDAO.close(conn, pstmt);
		}
		
		return result;
	}
	
	//데이터 수정
	public int updateProduct(ProductVO vo) {
		String sql = "update product set name=?, price=?, pictureurl=?, description=? where code=?";
		Connection conn = null;
		PreparedStatement pstmt= null;
		int result = -1;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			//매핑
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setString(3, vo.getPictureurl());
			pstmt.setString(4, vo.getDescription());
			pstmt.setInt(5, vo.getCode());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ProductDAO.close(conn, pstmt);
		}
		
		return result;
	}

	public int deleteProduct(int code) {
		String sql = "DELETE FROM product WHERE code = ?";
		Connection conn = null;
		PreparedStatement pstmt= null;
		int result = -1;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
		
			pstmt.setInt(1, code);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ProductDAO.close(conn, pstmt);
		}
		
		return result;
	}
}