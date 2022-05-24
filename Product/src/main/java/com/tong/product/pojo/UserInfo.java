package com.tong.product.pojo;

import com.tong.product.config.UserGroup;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.groups.ConvertGroup;

/**
 * @author 童纯盼
 * @date 2022/3/31 13:08
 */
@Data
public class UserInfo {

    @NotNull(message = "名字不能为空")
    private String name ;

    @Min(message = "年龄必须大于0", value = 0L)
    private int age;

}
