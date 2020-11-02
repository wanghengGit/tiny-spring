package us.codecraft.tinyioc.aop;

/**
 * 被代理的对象
 * @author yihua.huang@dianping.com
 * @author kit
 * @date 20201102
 */
public class TargetSource {

	private Class<?> targetClass;

    private Class<?>[] interfaces;

	private Object target;

	public TargetSource(Object target, Class<?> targetClass,Class<?>... interfaces) {
		this.target = target;
		this.targetClass = targetClass;
        this.interfaces = interfaces;
	}

	public Class<?> getTargetClass() {
		return targetClass;
	}

	public Object getTarget() {
		return target;
	}

    public Class<?>[] getInterfaces() {
        return interfaces;
    }
}
