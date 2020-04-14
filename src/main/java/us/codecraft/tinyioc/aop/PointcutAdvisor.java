package us.codecraft.tinyioc.aop;

/**
 * @author yihua.huang@dianping.com
 * @date 20200414
 */
public interface PointcutAdvisor extends Advisor{

   Pointcut getPointcut();
}
