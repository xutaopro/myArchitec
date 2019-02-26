package com.xutao.architec.customermgr.vo;

import lombok.Data;

/**
 * Created by XUTAO on 2019/2/24.
 */
@Data
public class CustomerModel {
    private Integer uuid;

    private String customerId;

    private String pwd;

    private String showName;

    private String trueName;

    private String registerTime;
}
