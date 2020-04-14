package us.codecraft.tinyioc.aop;

/**
 * @author yihua.huang@dianping.com
 * @date 20200414
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();

}
