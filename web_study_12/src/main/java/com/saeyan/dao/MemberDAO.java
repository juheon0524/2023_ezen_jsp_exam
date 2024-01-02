package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.MemberVO;
import com.saeyan.util.DBManager;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	
	private MemberDAO() {}

	public static MemberDAO getInstance() {
		return MemberDAO.instance;
	}
	
	public int updateMember(MemberVO vo) {
		int result = -1;

		String sql = "update board set custname=?, phone=?, address=?, date=TO_DATE(?, 'YYYY-MM-DD'), "
				+ "grade=?, city? where custno=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getCustname());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getDate());
			pstmt.setString(5, vo.getGrade());
			pstmt.setString(6, vo.getCity());
			pstmt.setInt(7, vo.getCustno());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return result;
	}

	public List<MemberVO> selectAllMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo = null;
		String sql = "select * from member_tb1_02 order by custno desc";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			vo = new MemberVO();
			vo.setCustno(rs.getInt("custno"));
			vo.setCustname(rs.getNString("custname"));
			vo.setPhone(rs.getString("phone"));
			vo.setAddress(rs.getString("address"));
			vo.setDate(rs.getString("joindate"));
			vo.setGrade(rs.getString("grade"));
			vo.setCity(rs.getString("city"));
			
			list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

}	
