package cn.stylefeng.guns.modular.note.model.params;

import lombok.Data;
import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 建议反馈表
 * </p>
 *
 * @author 
 * @since 2019-11-18
 */
@Data
public class QxFeedbackParam implements Serializable, BaseValidatingParam {

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
     * 用户ID
     */
    private Long userId;

    /**
     * 意见类型
     */
    private String type;

    /**
     * 反馈详情
     */
    private String content;

    /**
     * 状态 0-未处理；1-已处理
     */
    private String status;

    @Override
    public String checkParam() {
        return null;
    }

}
