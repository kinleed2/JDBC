package sqlTest;

import java.util.List;

public class OrdersMain {

    public static void main(String[] args) {
        // DAOクラスの<a class="keyword" href="http://d.hatena.ne.jp/keyword/%A5%A4%A5%F3%A5%B9%A5%BF%A5%F3%A5%B9">インスタンス</a>の生成
        OrdersDAO dao = new OrdersDAO();

        // findAll()メソッドの戻り値OrdersDTOクラスの<a class="keyword" href="http://d.hatena.ne.jp/keyword/%A5%A4%A5%F3%A5%B9%A5%BF%A5%F3%A5%B9">インスタンス</a>が格納されたList
        List<OrdersDTO> orders = dao.findAll();

        // Listの中のOrdersDTOクラスの<a class="keyword" href="http://d.hatena.ne.jp/keyword/%A5%A4%A5%F3%A5%B9%A5%BF%A5%F3%A5%B9">インスタンス</a>をループで処理
        for(OrdersDTO order: orders) {
            System.out.println("order_id:" + order.getOrder_id());
            System.out.println("order_date:" + order.getOrder_date());
            System.out.println("client:" + order.getClient());
            System.out.println("order_count:" + order.getOrder_count());
        }

    }

}
