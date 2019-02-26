package com.xutao.dao;

import java.util.List;

/**
 * Created by XUTAO on 2019/2/26.
 */
public interface BaseDao<M, QM> {

    void create(M cm);
    void update(M cm);
    void delete(int uuid);

    M getByUuid(int uuid);

    List<M> getByConditionPage(QM qm);
}
