package study.practice.practice32;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v2.DBConnectionManager;
import study.db.sample.v2.Dept;

public class StudentDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	// 기본 student 전체 조회 메소드
	public List<StudentDTO> findStudentList() {

		conn = DBConnectionManager.connectDB();

		List<StudentDTO> list = new ArrayList<StudentDTO>();

		// 쿼리 준비
		// String sqlQuery = "select * from student";
		// select TO_CHAR(birthday, 'yyyy-MM-dd')
		// select TO_CHAR(birthday, 'yyyyMMdd')
		String sqlQuery = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'yyyyMMdd') birthday, "
				+ " tel, height, weight, deptno1, deptno2, profno " + " from student";
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) {

				StudentDTO s = new StudentDTO();
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));
				// s.setBrithday(
				// ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday"))
				// );
				s.setBirthday(rs.getString("birthday")); // yyyy-MM-dd
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));

				list.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return list;

	}

	// 2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
	public List<StudentDTO> findStudentListByGrade(int grade) {

		conn = DBConnectionManager.connectDB();

		List<StudentDTO> list = new ArrayList<StudentDTO>();

		// 쿼리 준비
		String sqlQuery = "select * from student where grade = ? ";
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, grade);
			rs = psmt.executeQuery();

			while (rs.next()) {

				StudentDTO s = new StudentDTO();
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));
				// s.setBirthday(
				// ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday"))
				// );
				s.setBirthday(rs.getString("birthday"));
				s.setTel(rs.getString("tel"));

				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));

				list.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return list;

	}

	public int saveStudent(StudentDTO studentDTO) {

		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 쿼리 준비
		String sqlQuery = " insert into student values (?, ?, ?, ?, ?,  TO_DATE(?, 'yyyy-MM-dd') , ?, ?, ?, ?, ?, ?) ";
						//모든 컬럼에 넣을거면 컬럼명 삭제가능
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 셋팅
			psmt.setInt(1, studentDTO.getStudno());
			psmt.setString(2, studentDTO.getName());
			psmt.setString(3, studentDTO.getId());
			psmt.setInt(4, studentDTO.getGrade());
			psmt.setString(5, studentDTO.getJumin());
			psmt.setString(6, studentDTO.getBirthday());
			
			psmt.setString(7, studentDTO.getTel());
			psmt.setInt(8, studentDTO.getHeight());
			psmt.setInt(9, studentDTO.getWeight());
			psmt.setInt(10, studentDTO.getDeptno1());
			psmt.setInt(11, studentDTO.getDeptno2());
			psmt.setInt(12, studentDTO.getProfno());
			
			//psmt.setDate(6, Date.valueOf(student.getBirthday()));
			//								String , LocalDate
			
			//psmt.setTimestamp(6, ConvertDateUtil.convertLocalDateTimeToTimestamp(student.getBirthday()));
			// 								LocalDateTime
			
			// select -> executeQuery
			// insert, update, delete -> executeUpdate

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

}
