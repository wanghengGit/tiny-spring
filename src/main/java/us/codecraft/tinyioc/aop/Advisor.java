package us.codecraft.tinyioc.aop;

import org.aopalliance.aop.Advice;

/**
 * @author yihua.huang@dianping.com
 * @date 20200414
 */
public interface Advisor {

    Advice getAdvice();
}
