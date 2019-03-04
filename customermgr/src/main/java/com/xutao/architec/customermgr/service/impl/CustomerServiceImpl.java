package com.xutao.architec.customermgr.service.impl;

import com.xutao.architec.customermgr.dao.CustomerDao;
import com.xutao.architec.customermgr.service.ICustomerService;
import com.xutao.architec.customermgr.vo.CustomerModel;
import com.xutao.architec.customermgr.vo.CustomerQueryModel;
import com.xutao.service.IBaseService;
import com.xutao.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XUTAO on 2019/2/27.
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerModel, CustomerQueryModel> implements ICustomerService {

    @Autowired
    private CustomerDao dao;

    @Autowired
    private void setDao(CustomerDao dao){
        this.dao = dao;
        super.setDAO(dao);
    }


}
