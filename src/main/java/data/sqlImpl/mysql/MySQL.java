package data.sqlImpl.mysql;

/**
 * @author wwz
 * @version 2016年5月5日 上午12:25:17
 */
public class MySQL {
	
	//不要用这个了！！xyf

//	private Connection conn;
//
//	public MySQL() {
//		connectMySQL();
//	}
//
//	/**
//	 * 连接数据库
//	 * @author wwz
//	 * @version 2015年5月05日 下午8:36:57
//	 */
//	private void connectMySQL() {
//		try {
//			//加载驱动，这一句也可写为：Class.forName("com.mysql.jdbc.Driver");
//			Class.forName(MySQLConf.DRIVER);
//			//建立到MySQL的连接
//			conn = DriverManager.getConnection(MySQLConf.URL, MySQLConf.USER, MySQLConf.PASSWORD);
//			if (!conn.isClosed()) {
//				System.out.println("Succeeded connecting to the Database!");
//			}
//			// 删除需要爬的数据【以前存在的】
////			Statement statement = conn.createStatement();
////			String sql = "TRUNCATE extra_time";
////			statement.execute(sql);
////			sql = "TRUNCATE match_player";
////			statement.execute(sql);
////			sql = "TRUNCATE match_profile";
////			statement.execute(sql);
////			sql = "TRUNCATE player_profile";
////			statement.execute(sql);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void close() {
//		try {
//			conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public Connection getConn() {
//		return this.conn;
//	}

}
