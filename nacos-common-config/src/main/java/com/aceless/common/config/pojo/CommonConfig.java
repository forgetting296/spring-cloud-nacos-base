package com.aceless.common.config.pojo;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author liuziping
 * @date 2020/12/25 3:38 下午
 */
@Data
@Component
public class CommonConfig {

    @NacosValue(value = "${nacos.test.property1:123}", autoRefreshed = true)
    public static String prop1;

    @NacosValue(value = "${nacos.test.property2:123}", autoRefreshed = true)
    public String prop2;

    @NacosValue(value = "${nacos.test.property3:123}", autoRefreshed = true)
    public String prop3;

    @NacosValue(value = "${nacos.test.property4:123}", autoRefreshed = true)
    public String prop4;

    @NacosValue(value = "${nacos.test.property5:123}", autoRefreshed = true)
    public String prop5;

    @NacosValue(value = "${nacos.test.property6:123}", autoRefreshed = true)
    public String prop6;

    @NacosValue(value = "${nacos.test.property7:123}", autoRefreshed = true)
    public static String prop7 = "prop7";
}
