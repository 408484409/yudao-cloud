package cn.iocoder.mall.order.biz.dto.order;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 订单 query
 *
 * @author Sin
 * @time 2019-03-23 14:15
 */
@Data
@Accessors(chain = true)
public class OrderQueryDTO implements Serializable {

    /**
     * id
     */
    private Integer id;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 用户 id
     */
    private Integer userId;
    /**
     * 物流id
     */
    private Integer orderLogisticsId;
    /**
     * 是否退换货
     */
    private Integer hasReturnExchange;
    /**
     * 付款时间（待发货）
     */
    private LocalDateTime startPaymentTime;
    private LocalDateTime endPaymentTime;
    /**
     * 创建时间
     */
    private LocalDateTime startCreateTime;
    private LocalDateTime endCreateTime;
    /**
     * 删除状态
     */
    private Integer deleted;
    /**
     * 状态
     */
    private Integer status;
    private Integer pageNo;
    private Integer pageSize;
}
