package com.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;

public class HttpClientTest {

	public static void get() {

		CloseableHttpClient httpClient = HttpClientBuilder.create().build();

		String uri = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo?mobileCode=15179237204&userID=";

		HttpGet get = new HttpGet(uri);

		try {
			CloseableHttpResponse response = httpClient.execute(get);

			System.out.println(response.getStatusLine().getStatusCode());

			InputStream in = response.getEntity().getContent();

			byte[] buff = new byte[1024];

			int len = 0;

			StringBuilder sb = new StringBuilder();

			while ((len = in.read(buff)) != -1) {

				sb.append(new String(buff, 0, len));

			}

			// System.out.println(sb);

			String string = sb.toString();

			Pattern pattern = Pattern.compile(">\\d{11}[^\\d]+<");

			Matcher matcher = pattern.matcher(string);

			matcher.find();

			System.out.println(matcher.group(0).replaceAll("<|>", ""));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void post() {

		// 创建Httpclient对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		String resultString = "";
		String url = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo";
		
		try {
			// 创建Http Post请求
			HttpPost httpPost = new HttpPost(url);
			// 创建参数列表
			List<NameValuePair> paramList = new ArrayList<>();
			paramList.add(new BasicNameValuePair("mobileCode", "15179237204"));
			paramList.add(new BasicNameValuePair("userID", ""));
			// 模拟表单
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList);
			httpPost.setEntity(entity);
			// 执行http请求
			response = httpClient.execute(httpPost);
			resultString = EntityUtils.toString(response.getEntity(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Pattern pattern = Pattern.compile(">\\d{11}[^\\d]+<");
		
		String str = resultString.substring(resultString.indexOf("<string"));

		Matcher matcher = pattern.matcher(str);
		
		System.out.println(matcher.find());

	//	matcher.find();

	//	System.out.println(matcher.group(0).replaceAll("<|>", ""));
		
		System.out.println(matcher.group(0).replaceAll("<|>", ""));

	}
	
	public static void postXML() {

		// 创建Httpclient对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		String resultString = "";
		String url = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx";
		
		try {
			// 创建Http Post请求
			HttpPost httpPost = new HttpPost(url);
			
			InputStream instream = new FileInputStream(new File("src/body.xml"));
			
			InputStreamEntity inputStreamEntity = new InputStreamEntity(instream, ContentType.create("text/xml", Consts.UTF_8));
					
			httpPost.setEntity(inputStreamEntity);
			// 执行http请求
			response = httpClient.execute(httpPost);
			resultString = EntityUtils.toString(response.getEntity(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Pattern pattern = Pattern.compile(">\\d{11}[^\\d]+<");
		
		String str = resultString.substring(resultString.indexOf("<string"));

		Matcher matcher = pattern.matcher(str);
		
		System.out.println(matcher.find());

	//	matcher.find();

	//	System.out.println(matcher.group(0).replaceAll("<|>", ""));
		
		System.out.println(matcher.group(0).replaceAll("<|>", ""));

	}

	public static void main(String[] args) {
		HttpClientTest.post();
	}

}
