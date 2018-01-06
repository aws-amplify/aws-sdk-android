/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.AttributeTransformer.Parameters;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ConversionSchemas.MarshallerSet;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper.Builder;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper.FailedBatch;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.PaginationLoadingStrategy;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.TableNameOverride;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.mobile.config.AWSConfiguration;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MiscellaneousTests {

	private AmazonDynamoDB mockClient;
    private DynamoDBMapper mapper;
    private PaginationLoadingStrategy strategy = PaginationLoadingStrategy.LAZY_LOADING;
    private DynamoDBMapperConfig config;
    private static final String TABLE = "testTable";
    // We don't start with the current system millis like other tests because
    // it's out of the range of some data types
    private static int start = 1;
    private static int byteStart = 1;
    private static int startKeyDebug = 1;

    @Before
    public void setup() {

        config = new DynamoDBMapperConfig(strategy);
        mockClient = EasyMock.createMock(AmazonDynamoDBClient.class);
        mapper = new DynamoDBMapper(mockClient);
        
    }
    
    @Test
    public void testConstructors() {
    	MarshallerSet s = new MarshallerSet() {
			
			@Override
			public ArgumentMarshaller getMemberMarshaller(Type memberType) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ArgumentMarshaller getMarshaller(Method getter) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
    	ConversionSchema schema = new ConversionSchemas.StandardConversionSchema("test", s, null);
    	DynamoDBMapperConfig configObject = new DynamoDBMapperConfig(schema);
    	DynamoDBMapper mapperClient = new DynamoDBMapper(mockClient);
    	AWSCredentials creds =  new BasicAWSCredentials("random", "test");
    	StaticCredentialsProvider credProvider = new StaticCredentialsProvider(creds);
    	mapperClient = new DynamoDBMapper(mockClient, credProvider);
    	assertNotNull(mapperClient);
    	mapperClient = new DynamoDBMapper(mockClient, configObject, credProvider);
    	assertNotNull(mapperClient);
    	mapperClient = new DynamoDBMapper(mockClient, DynamoDBMapperConfig.DEFAULT, credProvider);
    	assertNotNull(mapperClient);
    	AttributeTransformer transformer = new AttributeTransformer() {
			
			@Override
			public Map<String, AttributeValue> untransform(Parameters<?> parameters) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, AttributeValue> transform(Parameters<?> parameters) {
				// TODO Auto-generated method stub
				return null;
			}
		};
    	mapperClient = new DynamoDBMapper(mockClient, config, transformer);
    	assertNotNull(mapperClient);
    	
    	Builder mapperClientBuilder = new DynamoDBMapper.Builder().dynamoDBClient(mockClient)
    			.awsCredentialsProviderForS3(credProvider)
    			.attributeTransformer(transformer)
    			.dynamoDBMapperConfig(configObject);
    	
    }
 
    @Test(expected = NullPointerException.class) 
    public void testBatchWriteException() {
    	 List<NumberSetAttributeClass> objs = new ArrayList<NumberSetAttributeClass>();
         for (int i = 0; i < 40; i++) {
             NumberSetAttributeClass obj = getUniqueNumericObject();
             objs.add(obj);
         }
         
        List<FailedBatch> failedBatches = mapper.batchSave(objs);
        for (NumberSetAttributeClass obj : objs) {
             NumberSetAttributeClass loaded = mapper.load(NumberSetAttributeClass.class,
                     obj.getKey());
             assertEquals(obj, loaded);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testScanResultPageException() {
    	mapper.count(NumberSetAttributeClass.class, new DynamoDBScanExpression());
    	mapper.count(NumberSetAttributeClass.class, new DynamoDBQueryExpression());
    }
    
    @Test(expected = NullPointerException.class) 
    public void testBatchDeleteException() {
    	 List<NumberSetAttributeClass> objs = new ArrayList<NumberSetAttributeClass>();
         for (int i = 0; i < 40; i++) {
             NumberSetAttributeClass obj = getUniqueNumericObject();
             objs.add(obj);
         }
         
        List<FailedBatch> failedBatches = mapper.batchDelete(objs);
        for (NumberSetAttributeClass obj : objs) {
             NumberSetAttributeClass loaded = mapper.load(NumberSetAttributeClass.class,
                     obj.getKey());
             assertEquals(obj, loaded);
        }
    }
    
    
    @Test
    public void testDeleteException() {
    	NumberSetAttributeClass obj = new NumberSetAttributeClass();
    	obj.setKey("test-key");
    	TableNameOverride tableOverride = new TableNameOverride("new-table-name");
    	DynamoDBMapperConfig config = new DynamoDBMapperConfig(tableOverride);
    	mapper.delete(obj, config);
    }
    
    @Test
    public void testDeleteExpressionException() {
    	NumberSetAttributeClass obj = new NumberSetAttributeClass();
    	obj.setKey("test-key");
    	TableNameOverride tableOverride = new TableNameOverride("new-table-name");
    	DynamoDBMapperConfig config = new DynamoDBMapperConfig(tableOverride);
    	DynamoDBDeleteExpression exp = new DynamoDBDeleteExpression();
    	mapper.delete(obj, exp, config);
    }
    
    @Test(expected = NullPointerException.class)
    public void testLoadException() {
    	NumberSetAttributeClass obj = new NumberSetAttributeClass();
    	obj.setKey("test-key");
    	TableNameOverride tableOverride = new TableNameOverride("new-table-name");
    	DynamoDBMapperConfig config = new DynamoDBMapperConfig(tableOverride);
    	mapper.load(obj, config);
    }
    
    @Test(expected = NullPointerException.class)
    public void testSaveException() {
    	NumberSetAttributeClass obj = new NumberSetAttributeClass();
    	obj.setKey("test-key");
    	TableNameOverride tableOverride = new TableNameOverride("new-table-name");
    	DynamoDBMapperConfig config = new DynamoDBMapperConfig(tableOverride);
    	DynamoDBSaveExpression exp = new DynamoDBSaveExpression();
    	mapper.save(obj, exp, config);
    }
    
    private NumberSetAttributeClass getUniqueNumericObject() {
        NumberSetAttributeClass obj = new NumberSetAttributeClass();
        obj.setKey(String.valueOf(startKeyDebug++));
        
        return obj;
    }
}
