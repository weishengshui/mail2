package mail.mailTest;

import junit.framework.TestCase;

import com.wss.lsl.mail.main.SendEmailBean;


public class Test  extends TestCase{

	public void test() {
		SendEmailBean sendEmailBean = new SendEmailBean();
		sendEmailBean.sendSimpleEmail("657620636@qq.com", "你好，水哥！", "测试邮箱程序");
		
	}

}
