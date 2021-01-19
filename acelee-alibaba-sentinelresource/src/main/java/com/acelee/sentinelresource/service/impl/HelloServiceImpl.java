package com.acelee.sentinelresource.service.impl;

import com.acelee.sentinelresource.service.HelloService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author liuziping
 * @date 2020/12/24 4:19 下午
 */
@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

    /**
     * 在需要控制流量的地方 使用 @SentinelResource 注解
     * 保护策略： 限流、降级等
     *
     * 如果Controller中的方法没有经过限流 而其中调用的部分service方法需要限流 则 给对应的service中的方法添加@SentinelResource注解就ok
     * 通过该注解的blockHandler属性可以指定具体的处理函数 和 Hystrix的fallback很像
     *
     * @param s
     */
    @Override
//    @SentinelResource(value = "doSomething", blockHandler = "exceptionHandler")
    @SentinelResource(value = "doSomething", blockHandler = "exceptionHandler")
    public void doSomething(String s) {
        System.out.println("doSomething........ " + s);
    }

    /**
     * Sentinel相比于Hystrix更丰富 还有基于响应时间和异常数的降级策略
     *
     * @param s
     */
    @Override
//    @SentinelResource(value = "doSomething2")
    @SentinelResource(value = "doSomething2", fallback = "fallbackHandler")
    public void doSomething2(String s) {
        log.info("doSomething2------------"+s);
        throw new RuntimeException("发生异常");
    }

    /** 限流与阻塞处理
     *  实现处理函数 必须与资源点的传参一样 并且后边加上BlockException异常参数 返回值也必须一致
     *  这样的设计和Hystrix的fallback很相似
     *  实际使用的时候 可以根据业务对限流请求做缓存 或者前端提示 都可以基于此方法来实现
     */
    public void exceptionHandler(String str, BlockException ex) {
        log.error("blockHandler: " + str, ex);
    }

    /**
     * 熔断与降级处理
     * 如果通过Sentinel设置了doSomething2的熔断降级策略 满足熔断降级策略之后 就会执行fallbackHandler的方法 然后controller端正常返回数据
     * @param str
     */
    public void fallbackHandler(String str) {
        log.error("fallbackHandler: {}", str);
    }

}
