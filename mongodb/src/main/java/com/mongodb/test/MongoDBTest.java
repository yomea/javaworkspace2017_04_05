package com.mongodb.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.bson.BsonArray;
import org.bson.Document;
import org.junit.Test;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.MongoDBUtil;

public class MongoDBTest {

	@Test
	public void writerData() throws InterruptedException {
		try {
			MongoDatabase md = MongoDBUtil.getDb("localhost", 27017, "test");

			md.createCollection("mongo_test");

			MongoCollection<Document> collection = md.getCollection("mongo_test");

			// 插入文档
			/**
			 * 1. 创建文档 org.bson.Document 参数为key-value的格式 2. 创建文档集合List<Document>
			 * 3. 将文档集合插入数据库集合中 mongoCollection.insertMany(List<Document>)
			 * 插入单个文档可以用 mongoCollection.insertOne(Document)
			 */
			Document document = new Document("title", "MongoDB").append("description", "database").append("likes", 100)
					.append("by", "Fly");
			List<Document> documents = new ArrayList<Document>();
			documents.add(document);
			collection.insertMany(documents);
			System.out.println("文档插入成功");
		} catch (

		Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}

	}

	@Test
	public void readData() throws InterruptedException {
		//try {
			MongoDatabase md = MongoDBUtil.getDb("localhost", 27017, "test");

			MongoCollection<Document> collection = md.getCollection("mongo_test");

			/*System.out.println("集合 test 选择成功");

			// 检索所有文档
			*//**
			 * 1. 获取迭代器FindIterable<Document> 2. 获取游标MongoCursor<Document> 3.
			 * 通过游标遍历检索出的文档集合
			 *//*
			FindIterable<Document> findIterable = collection.find();
			MongoCursor<Document> mongoCursor = findIterable.iterator();
			while (mongoCursor.hasNext()) {
				System.out.println(mongoCursor.next());
			}

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}*/

			List<Document> list = new ArrayList<>();
			
			list.add(new Document("$limit", 5));
			
			list.add(new Document("$group", new Document("_id", null).append("num_tutorial ", new Document("$sum", 1))));
		
		 AggregateIterable<Document> aggre = collection.aggregate(list);
		
		 Iterator<Document> it = aggre.iterator();
		 
		  while (it.hasNext()) {
		 
		  Document doc = it.next();
	
System.out.println(doc);

		}
		 

	}

}
