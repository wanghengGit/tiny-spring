package us.codecraft.tinyioc.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author yihua.huang@dianping.com
 * @author kit
 * @date 20201102
 */
public class TimerInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long time = System.nanoTime();
		System.out.println("开始调用 " + invocation.getMethod().getName() + " start!");
		Object proceed = invocation.proceed();
		System.out.println("结束调用 " + invocation.getMethod().getName() + " end! takes " + (System.nanoTime() - time)
				+ " nanoseconds.");
		return proceed;
	}

}
