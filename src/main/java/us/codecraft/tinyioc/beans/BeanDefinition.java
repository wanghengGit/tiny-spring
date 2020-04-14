package us.codecraft.tinyioc.beans;

/**
 * bean的内容及元数据，保存在BeanFactory中，包装bean的实体
 * 
 * @author yihua.huang@dianping.com
 * @date 20200414
 * 以 BeanDefinition 类为核心发散出的几个类，都是用于解决 Bean 的具体定义问题，
 * 包括 Bean 的名字是什么、它的类型是什么，它的属性赋予了哪些值或者引用，
 * 也就是 如何在 IoC 容器中定义一个 Bean，使得 IoC 容器可以根据这个定义来生成实例 的问题
 */
public class BeanDefinition {

	private Object bean;

	private Class beanClass;

	private String beanClassName;

	private PropertyValues propertyValues = new PropertyValues();

	public BeanDefinition() {
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

	public String getBeanClassName() {
		return beanClassName;
	}

	public void setBeanClassName(String beanClassName) {
		this.beanClassName = beanClassName;
		try {
			this.beanClass = Class.forName(beanClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Object getBean() {
		return bean;
	}

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}
}
