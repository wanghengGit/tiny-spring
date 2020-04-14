package us.codecraft.tinyioc.context;

import us.codecraft.tinyioc.beans.factory.BeanFactory;

/**
 * @author yihua.huang@dianping.com
 * @date 20200414
 * 以 ApplicationContext 接口为核心发散出的几个类，主要是对前面 Resouce 、 BeanFactory、BeanDefinition 进行了功能的封装，
 * 解决 根据地址获取 IoC 容器并使用 的问题
 */
public interface ApplicationContext extends BeanFactory {
}
