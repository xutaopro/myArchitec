package com.xutao.architec.customermgr.vo;

import com.xutao.pageUtil.Page;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by XUTAO on 2019/2/24.
 */
@Data
public class CustomerQueryModel extends CustomerModel{
    private Page page = new Page();

    public Page getPage() {
        return page;
    }
    public void setPage(Page page) {
        this.page = page;
    }
}
