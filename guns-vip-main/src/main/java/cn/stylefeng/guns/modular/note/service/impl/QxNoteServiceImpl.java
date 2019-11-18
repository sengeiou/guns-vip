package cn.stylefeng.guns.modular.note.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.note.entity.QxNote;
import cn.stylefeng.guns.modular.note.mapper.QxNoteMapper;
import cn.stylefeng.guns.modular.note.model.params.QxNoteParam;
import cn.stylefeng.guns.modular.note.model.result.QxNoteResult;
import  cn.stylefeng.guns.modular.note.service.QxNoteService;
import cn.stylefeng.roses.core.util.ToolUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 私密日记 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-11-18
 */
@Service
public class QxNoteServiceImpl extends ServiceImpl<QxNoteMapper, QxNote> implements QxNoteService {

    @Override
    public void add(QxNoteParam param){
        QxNote entity = getEntity(param);
        this.save(entity);
    }

    @Override
    public void delete(QxNoteParam param){
        this.removeById(getKey(param));
    }

    @Override
    public void update(QxNoteParam param){
        QxNote oldEntity = getOldEntity(param);
        QxNote newEntity = getEntity(param);
        ToolUtil.copyProperties(newEntity, oldEntity);
        this.updateById(newEntity);
    }

    @Override
    public QxNoteResult findBySpec(QxNoteParam param){
        return null;
    }

    @Override
    public List<QxNoteResult> findListBySpec(QxNoteParam param){
        return null;
    }

    @Override
    public LayuiPageInfo findPageBySpec(QxNoteParam param){
        Page pageContext = getPageContext();
        IPage page = this.baseMapper.customPageList(pageContext, param);
        return LayuiPageFactory.createPageInfo(page);
    }

    private Serializable getKey(QxNoteParam param){
        return param.getId();
    }

    private Page getPageContext() {
        return LayuiPageFactory.defaultPage();
    }

    private QxNote getOldEntity(QxNoteParam param) {
        return this.getById(getKey(param));
    }

    private QxNote getEntity(QxNoteParam param) {
        QxNote entity = new QxNote();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
