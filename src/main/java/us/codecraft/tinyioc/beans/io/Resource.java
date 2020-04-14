package us.codecraft.tinyioc.beans.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Resource是spring内部定位资源的接口。
 * @author yihua.huang@dianping.com
 * @date 20200414
 * 以 Resource 接口为核心发散出的几个类，都是用于解决 IoC 容器中的内容从哪里来的问题，
 * 也就是 配置文件从哪里读取、配置文件如何读取 的问题
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
