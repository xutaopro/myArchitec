package com.xutao.architec.customermgr;

import com.xutao.architec.customermgr.dao.CustomerDao;
import com.xutao.architec.customermgr.service.ICustomerService;
import com.xutao.architec.customermgr.vo.CustomerModel;
import com.xutao.architec.customermgr.vo.CustomerQueryModel;
import com.xutao.pageUtil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by XUTAO on 2019/2/25.
 */
@Component
public class Client {

    @Autowired
    private ICustomerService s;

    public static void main(String[] args) {
        ApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Client client = (Client) actx.getBean("client");

        /*CustomerModel cm = new CustomerModel();
        cm.setCustomerId("c1");
        cm.setPwd("c1");
        cm.setRegisterTime("111");
        cm.setShowName("c1");
        cm.setTrueName("张三");
        client.customerDao.create(cm);*/
        CustomerQueryModel cqm = new CustomerQueryModel();
        cqm.getPage().setNowPage(1);
        cqm.getPage().setPageShow(1);

        Page<CustomerModel> p = client.s.getByConditionPage(cqm);

        System.out.println("list=="+p);
        System.out.println("page=="+cqm.getPage());

    }
}
