package com.wsimport.test;

import com.wsimport.MobileCodeWS;
import com.wsimport.MobileCodeWSSoap;

/**
 * 使用jdk自带的一个wsimport工具，执行以下命令
 * wsimport -s . -p com.wsimport http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL
 * 就可以生成代码
 * @author may
 *
 */
public class WsTest {

	public static void main(String[] args) {
		//创建一个服务
		MobileCodeWS mcw = new MobileCodeWS();
		
		//创建一个简单的对象访问协议
		MobileCodeWSSoap mcws = mcw.getMobileCodeWSSoap();
		
		//获取到信息
		String info = mcws.getMobileCodeInfo("15179237204", null);
		
		System.out.println(info);
		
	}
	
}
