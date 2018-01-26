package com.xf.serviceImpl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.xf.service.TestService;

public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		http();
		return "hello " + name;
	}

	public void http() {
		new GetMothod().start();
	}

}

class GetMothod extends Thread {
	@Override
	public void run() {
		URL url;
		try {
			url = new URL("http://www.runoob.com/index.html?language=cn#j2se");
			System.out.println("URL 为：" + url.toString());
			System.out.println("协议为：" + url.getProtocol());
			System.out.println("验证信息：" + url.getAuthority());
			System.out.println("文件名及请求参数：" + url.getFile());
			System.out.println("主机名：" + url.getHost());
			System.out.println("路径：" + url.getPath());
			System.out.println("端口：" + url.getPort());
			System.out.println("默认端口：" + url.getDefaultPort());
			System.out.println("请求参数：" + url.getQuery());
			System.out.println("定位位置：" + url.getRef());

			URLConnection conn = url.openConnection();
			conn.addRequestProperty("encoding", "UTF-8");
			InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String line;
			StringBuilder builder = new StringBuilder();
			while ((line = br.readLine()) != null) {
				builder.append(line);
			}
			br.close();
			isr.close();
			is.close();

			System.out.println(builder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
