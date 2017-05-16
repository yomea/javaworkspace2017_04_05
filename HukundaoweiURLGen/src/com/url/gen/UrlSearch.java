package com.url.gen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UrlSearch implements Runnable {
	
	private static int countUrl = 0;
	
	private static int totalPage = 0;
	
	private  Document doc = null;
	
	private String url;
	
	private String prefixUrl;
	
	private String shuffixUrl;
	
	public UrlSearch(String url, String prefixUrl, String shuffixUrl) {
		this.url = url;
		
		this.prefixUrl = prefixUrl;
		
		this.shuffixUrl = shuffixUrl;
		
		
	}

	/**
	 * var as =
	 * document.getElementsByClassName('subarea')[0].getElementsByTagName('a');for(var
	 * i = 0; i < as.length; i++) {document.write(as[i].href + '{30}</br>
	 * ');}
	 * 
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {

		String url = "http://zhuhai.ganji.com/fang/agent/";

		String prefixUrl = "http://zhuhai.ganji.com";

		String shuffixUrl = "o[page]/";
		
		selectUrl(url, prefixUrl, shuffixUrl);
		
		/*Document doc = Jsoup.connect("http://dg.ganji.com/fang/agent/dongkeng/").get();
		Elements newsHeadlines = doc.select(".subarea a");
		
		System.out.println(newsHeadlines.isEmpty());*/
		
	}
	
	
	private static void selectUrl(String url, String prefixUrl, String shuffixUrl) {
		
		ExecutorService executorService = new ThreadPoolExecutor(50, 60, 2000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));
		
		Document document = null;
		Connection connection = Jsoup.connect(url);
		
		try {
			
			

			document = connection.get();
			
			Elements es = document.select(".posrelative>div>a");
			
			Iterator<Element> it = es.iterator();
			
			if(it.hasNext()) {
				it.next();
				
			}
			
			while(it.hasNext()) {
				
				Element e = it.next();
				
				//System.out.println(prefixUrl + e.attr("href"));
				
				UrlSearch urlSearch = new UrlSearch(prefixUrl + e.attr("href"), prefixUrl, shuffixUrl);
				
				
				executorService.execute(urlSearch);
				
			}
			
		} catch (IOException e) {
			
			
		} finally {
			
			executorService.shutdown();
			
			try {
				executorService.awaitTermination(1, TimeUnit.HOURS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
			System.err.println("任务完成了。。。。。。。。。共生成" + countUrl +"条url。。。。。。。。。。。共" + totalPage + "页");
				
		}
		
		
		
		
	}

	private  void start(String url, String prefixUrl, String shuffixUrl) throws InterruptedException {

		List<String> list = new ArrayList<>();
		boolean flag = true;
		int count = 0;
		while (flag) {
			try {
				doc = Jsoup.connect(url).get();
				
			} catch (IOException e) {
				// nothing to do
			}
			
			count ++;
			if(doc == null) {
				continue;
				
			}
			if(count >= 5) {
				
				flag = false;
			}
			
			Elements newsHeadlines = doc.select(".subarea a");
			
			if(newsHeadlines.isEmpty()) {
				wer(url, shuffixUrl);
				return;
				
			}

			Iterator<Element> it = newsHeadlines.iterator();
			
			

			while (it.hasNext()) {

				Element e = it.next();

				list.add(prefixUrl + e.attr("href") + shuffixUrl);
				// System.out.println(prefixUrl + e.attr("href") + shuffixUrl);

			}
			
			if(!list.isEmpty()) {
				flag = false;
				
			}
			
		}
		if(!list.isEmpty()) {
			
			list.remove(0);
			page(list);
		}
		
		

	}
	
	
	private void wer(String url, String shuffixUrl) throws InterruptedException {
		
		
		for (int j = 1; j <= 100; j++) {

			String urlStr = url+ shuffixUrl;

			try {

				String newUrlStr = urlStr.replaceAll("\\[page\\]", String.valueOf(j));
				
				int count = 0;
				boolean flag = true;

				// System.out.println(newUrlStr);
				while(flag) {

					doc = Jsoup.connect(newUrlStr).get();
					count++;
					
					if(doc == null && count < 5) {
						   
						   continue;
						   
					 } else {
						 
						 flag = false;
						 
					 }
					Thread.sleep(100);
				}
				
			   Thread.sleep(100);
			   
			   

				Elements page = doc.select(".linkOn span");

				String pageStr = page.html();

				try {

					int pageNum = Integer.valueOf(pageStr);
					if (pageNum != j) {
						throw new RuntimeException();

					}

				} catch (Exception e) {
					if (j - 1 != 0) {
						countUrl++;
						totalPage += j - 1;
						System.out.println(urlStr + "{" + String.valueOf(j - 1) + "},");
					}

					break;
				}

			} catch (IOException e) {
				// nothing to do
			}

		}
		
	}

	private  void page(List<String> list) throws InterruptedException {

		for (int i = 0; i < list.size(); i++) {

			for (int j = 1; j <= 100; j++) {

				String urlStr = list.get(i);

				try {

					String newUrlStr = urlStr.replaceAll("\\[page\\]", String.valueOf(j));

					// System.out.println(newUrlStr);

					doc = Jsoup.connect(newUrlStr).get();

				//	Thread.sleep(100);

					Elements page = doc.select(".linkOn span");

					String pageStr = page.html();

					try {

						int pageNum = Integer.valueOf(pageStr);
						if (pageNum != j) {
							throw new RuntimeException();

						}

					} catch (Exception e) {
						if (j - 1 != 0) {
							countUrl++;
							totalPage += j - 1;
							System.out.println(urlStr + "{" + String.valueOf(j - 1) + "},");
						}

						break;
					}

				} catch (IOException e) {
					// nothing to do
				}

			}

		}

	}

	@Override
	public void run() {
		
		try {
			start(url, prefixUrl, shuffixUrl);
		} catch (InterruptedException e) {
			
		}
		
	}

}
