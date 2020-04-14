package us.codecraft.tinyioc.beans.factory;

/**
 * bean的容器
 * @author yihua.huang@dianping.com
 * @date 20200414
 * 以 BeanFactory 接口为核心发散出的几个类，都是用于解决 IoC 容器在
 * 已经获取 Bean 的定义的情况下，如何装配、获取 Bean 实例 的问题
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

}
