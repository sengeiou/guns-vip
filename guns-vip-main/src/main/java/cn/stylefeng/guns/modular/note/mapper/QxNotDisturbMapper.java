package cn.stylefeng.guns.modular.note.mapper;

import cn.stylefeng.guns.modular.note.entity.QxNotDisturb;
import cn.stylefeng.guns.modular.note.model.params.QxNotDisturbParam;
import cn.stylefeng.guns.modular.note.model.result.QxNotDisturbResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 消息免打扰表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-11-18
 */
public interface QxNotDisturbMapper extends BaseMapper<QxNotDisturb> {

    /**
     * 获取列表
     *
     * @author 
     * @Date 2019-11-18
     */
    List<QxNotDisturbResult> customList(@Param("paramCondition") QxNotDisturbParam paramCondition);

    /**
     * 获取map列表
     *
     * @author 
     * @Date 2019-11-18
     */
    List<Map<String, Object>> customMapList(@Param("paramCondition") QxNotDisturbParam paramCondition);

    /**
     * 获取分页实体列表
     *
     * @author 
     * @Date 2019-11-18
     */
    Page<QxNotDisturbResult> customPageList(@Param("page") Page page, @Param("paramCondition") QxNotDisturbParam paramCondition);

    /**
     * 获取分页map列表
     *
     * @author 
     * @Date 2019-11-18
     */
    Page<Map<String, Object>> customPageMapList(@Param("page") Page page, @Param("paramCondition") QxNotDisturbParam paramCondition);

}
