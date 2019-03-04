package com.xutao.service;

import com.xutao.pageUtil.Page;
import com.xutao.vo.BaseModel;

/**
 * Created by XUTAO on 2019/2/27.
 */
public interface IBaseService<M, QM extends BaseModel> {

    public void create(M m);
    public void update(M m);
    public void delete(int uuid);

    public M getByUuid(int uuid);

    public Page<M> getByConditionPage(QM qm);


}
