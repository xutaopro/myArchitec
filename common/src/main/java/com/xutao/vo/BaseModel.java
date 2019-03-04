package com.xutao.vo;

import com.xutao.pageUtil.Page;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by XUTAO on 2019/2/27.
 */
@Data
public class BaseModel implements Serializable{
    private Integer uuid;

    private Page page = new Page();


}
