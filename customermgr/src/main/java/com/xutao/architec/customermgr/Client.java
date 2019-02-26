package com.xutao.architec.customermgr;

import com.xutao.architec.customermgr.dao.CustomerDao;
import com.xutao.architec.customermgr.vo.CustomerModel;
import com.xutao.architec.customermgr.vo.CustomerQueryModel;
import com.xutao.pageUtil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by XUTAO on 2019/2/25.
 */
@Component
public class Client {

    @Autowired
    private CustomerDao customerDao;

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

        List<CustomerModel> p = client.customerDao.getByConditionPage(cqm);

        System.out.println("list=="+p);
        System.out.println("page=="+cqm.getPage());

    }
}
