package com.example.product.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
//@PropertySource("classpath:/resources/application.properties")
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

	//@Value("${couchbase.bucket}")
	 private final String bucket ="Product";
	 private final String name ="admin";
	 private final String password ="admin123";
	
	@Override
	public String getConnectionString() {
		 return Collections.singletonList("127.0.0.1").toString();
	}

	@Override
	public String getUserName() {
		return name;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getBucketName() {
		return bucket;
	}
}
