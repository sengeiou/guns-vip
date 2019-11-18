package cn.stylefeng.guns.modular.note.model.params;

import lombok.Data;
import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 约单表
 * </p>
 *
 * @author 
 * @since 2019-11-18
 */
@Data
public class QxInviteParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * 标识
     */
    private Long id;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 创建人
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新人
     */
    private Long updatedBy;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 删除标识
     */
    private Boolean deleted;

    /**
     * 邀请人
     */
    private Long inviter;

    /**
     * 被邀请人
     */
    private Long invitee;

    /**
     * 邀请时间
     */
    private Date inviteTime;

    /**
     * 约单类型 0-主动约；1-被动约
     */
    private String inviteType;

    /**
     * 约会类型
     */
    private Long dateTypeId;

    /**
     * 扣款种类 礼物ID
     */
    private Long giftId;

    /**
     * 地点
     */
    private String location;

    /**
     * 城市编号
     */
    private String cityNo;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 状态 0-待配对;1-已配对;2-进行中;3-已完成;4-已取消;5-已投诉
     */
    private String status;

    /**
     * 约单单号
     */
    private String sn;

    @Override
    public String checkParam() {
        return null;
    }

}
