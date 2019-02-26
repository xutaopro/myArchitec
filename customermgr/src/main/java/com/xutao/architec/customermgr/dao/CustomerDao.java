package com.xutao.architec.customermgr.dao;


import com.xutao.architec.customermgr.vo.CustomerModel;
import com.xutao.architec.customermgr.vo.CustomerQueryModel;

import java.util.List;

import com.xutao.dao.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * Created by XUTAO on 2019/2/24.
 */
@Repository
public interface CustomerDao extends BaseDao<CustomerModel, CustomerQueryModel>{


}
