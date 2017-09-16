package guanziqiang.core.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;

public class MongoDBConnection {
    
    public static MongoClient getMongoClient() {
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        //与数据库建立的最大连接数
        builder.connectionsPerHost(50);
        //当做大连接数全部在使用时，允许的排队等待数目
        builder.threadsAllowedToBlockForConnectionMultiplier(50);
        //等待获取数据库链接的时间。
        builder.maxWaitTime(1000*60*2);
        //与数据库建立的链接超时时间。
        builder.connectTimeout(1000*60*1);
        
        MongoClientOptions clientOptions = builder.build();
        
        MongoClient mongoClient = new MongoClient("192.168.0.102",clientOptions);
        
        return mongoClient;
    }
    
    public static void main(String[] args) {
        MongoClient mongoClient = getMongoClient();
        System.out.println(mongoClient.getDatabase("test"));
        
    }

}
