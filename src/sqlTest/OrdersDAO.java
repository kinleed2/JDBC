package sqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Ordersテーブル用のDAOクラス
 * @author ts0818
 *
 */
public class OrdersDAO {

    public List<OrdersDTO> findAll() {
        // DTOクラスのインスタンス格納用
        List<OrdersDTO> ordersDTO = new ArrayList<>();

        // JDBCドライバ読み込み
        try {
            // PostgreSQLドライバの読み込み
            Class.forName("org.postgresql.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        // データベースへの接続
        try(Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/sqlTest",
                "postgres",
                "root"
        );) {
            // sql文を実行するためのオブジェクト生成
            Statement stmt = conn.createStatement();
            // SELECT文の発行
            String sql = "SELECT * FROM orders";
            // sql文の実行結果を取得（データベースからの値）
            ResultSet resultSet = stmt.executeQuery(sql);

            // データベースから取得した値がある間、
            while(resultSet.next()) {
                // OrdersDTOクラスのインスタンスを生成
                OrdersDTO dto = new OrdersDTO();
                // カラムorder_idの値をフィールドorder_idにセット
                dto.setOrder_id(resultSet.getInt("order_id"));
                // カラムorder_dateの値をフィールドorder_dateにセット
                dto.setOrder_date(resultSet.getDate("order_date"));
                // カラムclientの値をフィールドclientにセット
                dto.setClient(resultSet.getString("client"));
                // カラムorder_countの値をフィールドorder_countにセット
                dto.setOrder_count(resultSet.getInt("order_count"));
                // インスタンスをListに格納
                ordersDTO.add(dto);
                // while文で次のレコードの処理へ?
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        // DTOクラスのインスタンスのListを返す
        return ordersDTO;
    }

}