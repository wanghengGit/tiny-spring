package us.codecraft.tinyioc;

/**
 * @author yihua.huang@dianping.com
 * @author kit
 * @date 20201102
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    private String text;

    private OutputService outputService;

    @Override
    public void helloWorld(){
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

}
