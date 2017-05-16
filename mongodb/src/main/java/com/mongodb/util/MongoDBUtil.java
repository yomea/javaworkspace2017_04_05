package com.mongodb.util;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtil {

	public static MongoDatabase getDb(String ipAddr, int port, String dbName) {

		MongoDatabase mongoDatabase = null;
		
		try {
			// 连接到 mongodb 服务
			MongoClient mongoClient = new MongoClient(ipAddr, port);

			// 连接到数据库
			mongoDatabase = mongoClient.getDatabase(dbName);
			System.out.println("Connect to database successfully");
			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}

		return mongoDatabase;
		
	}

}
