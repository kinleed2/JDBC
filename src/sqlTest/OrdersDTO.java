package sqlTest;

import java.sql.Date;

/**
 * Ordersテーブル用DTOクラス
 * @author ts0818
 *
 */
public class OrdersDTO {
    /**
     * フィールド変数
     */
    private int order_id;
    private Date order_date;
    private String client;
    private int order_count;

    /**
     * getter order_id
     * @return int order_id
     */
    public int getOrder_id() {
        return order_id;
    }

    /**
     * setter order_id
     * @param int order_id
     */
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    /**
     * getter order_date
     * @return Date order_date
     */
    public Date getOrder_date() {
        return order_date;
    }

    /**
     * setter order_date
     * @param Date order_date
     */
    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    /**
     * getter client
     * @return String client
     */
    public String getClient() {
        return client;
    }

    /**
     * setter client
     * @param String client
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * getter order_count
     * @return int order_count
     */
    public int getOrder_count() {
        return order_count;
    }

    /**
     * setter order_count
     * @param int order_count
     */
    public void setOrder_count(int order_count) {
        this.order_count = order_count;
    }

}