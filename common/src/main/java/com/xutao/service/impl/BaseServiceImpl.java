package com.xutao.service.impl;

import com.xutao.dao.BaseDao;
import com.xutao.pageUtil.Page;
import com.xutao.service.IBaseService;
import com.xutao.vo.BaseModel;

import java.util.List;

/**
 * Created by XUTAO on 2019/2/27.
 */
public class BaseServiceImpl<M, QM extends BaseModel> implements IBaseService<M, QM> {

    private BaseDao dao;

    public void setDAO(BaseDao dao){
        this.dao = dao;
    }

    public void create(M m) {
        dao.create(m);
    }

    public void update(M m) {
        dao.update(m);
    }

    public void delete(int uuid) {
        dao.delete(uuid);
    }

    public M getByUuid(int uuid) {
        return (M) dao.getByUuid(uuid);
    }

    public Page<M> getByConditionPage(QM qm) {
        List<M> list = dao.getByConditionPage(qm);
        qm.getPage().setResult(list);
        return qm.getPage();
    }
}
