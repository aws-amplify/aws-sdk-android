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
import static org.junit.Assert.assertSame;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.ObjectTableNameResolver;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.PaginationLoadingStrategy;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.TableNameOverride;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.TableNameResolver;

import org.junit.Test;

public class DynamoDBMapperConfigTest {

    @Test
    public void testMapperConfigBuilderWithAndAddMethods() {
        DynamoDBMapperConfig.Builder b = new DynamoDBMapperConfig.Builder();

        assertNotNull(b.withConsistentReads(ConsistentReads.CONSISTENT));
        assertEquals(b.getConsistentReads(), ConsistentReads.CONSISTENT);

        ConversionSchema cs = new ConversionSchemas.StandardConversionSchema(null, null, null);
        assertNotNull(b.withConversionSchema(cs));
        assertSame(b.getConversionSchema(), cs);

        ObjectTableNameResolver otnr = new TestObjectTableNameResolver();
        assertNotNull(b.withObjectTableNameResolver(otnr));
        assertSame(b.getObjectTableNameResolver(), otnr);

        assertNotNull(b.withPaginationLoadingStrategy(PaginationLoadingStrategy.LAZY_LOADING));
        assertEquals(b.getPaginationLoadingStrategy(), PaginationLoadingStrategy.LAZY_LOADING);

        RequestMetricCollector rmc = new TestRequestMetricCollector();
        assertNotNull(b.withRequestMetricCollector(rmc));
        assertSame(b.getRequestMetricCollector(), rmc);

        assertNotNull(b.withSaveBehavior(SaveBehavior.CLOBBER));
        assertEquals(b.getSaveBehavior(), SaveBehavior.CLOBBER);

        TableNameOverride tno = new TableNameOverride("test");
        assertNotNull(b.withTableNameOverride(tno));
        assertSame(b.getTableNameOverride(), tno);

        TableNameResolver tnr = new DynamoDBMapperConfig.DefaultTableNameResolver();
        assertNotNull(b.withTableNameResolver(tnr));
        assertSame(b.getTableNameResolver(), tnr);

        DynamoDBMapperConfig conf = b.build();
        assertEquals(conf.getConsistentReads(), ConsistentReads.CONSISTENT);
        assertSame(conf.getConversionSchema(), cs);
        assertSame(conf.getObjectTableNameResolver(), otnr);
        assertEquals(conf.getPaginationLoadingStrategy(), PaginationLoadingStrategy.LAZY_LOADING);
        assertSame(conf.getRequestMetricCollector(), rmc);
        assertEquals(conf.getSaveBehavior(), SaveBehavior.CLOBBER);
        assertSame(conf.getTableNameOverride(), tno);
        assertSame(conf.getTableNameResolver(), tnr);
    }

    @Test
    public void testSetMethods() {
        DynamoDBMapperConfig.Builder b = new DynamoDBMapperConfig.Builder();

        b.setConsistentReads(
                ConsistentReads.CONSISTENT);
        assertEquals(b.getConsistentReads(), ConsistentReads.CONSISTENT);

        ConversionSchema cs = new ConversionSchemas.StandardConversionSchema(null, null, null);
        b.setConversionSchema(cs);
        assertSame(b.getConversionSchema(), cs);

        ObjectTableNameResolver otnr = new TestObjectTableNameResolver();
        b.setObjectTableNameResolver(otnr);
        assertSame(b.getObjectTableNameResolver(), otnr);

        b.setPaginationLoadingStrategy(PaginationLoadingStrategy.LAZY_LOADING);
        assertEquals(b.getPaginationLoadingStrategy(), PaginationLoadingStrategy.LAZY_LOADING);

        RequestMetricCollector rmc = new TestRequestMetricCollector();
        b.setRequestMetricCollector(rmc);
        assertSame(b.getRequestMetricCollector(), rmc);

        b.setSaveBehavior(SaveBehavior.CLOBBER);
        assertEquals(b.getSaveBehavior(), SaveBehavior.CLOBBER);

        TableNameOverride tno = new TableNameOverride("test");
        b.setTableNameOverride(tno);
        assertSame(b.getTableNameOverride(), tno);

        TableNameResolver tnr = new DynamoDBMapperConfig.DefaultTableNameResolver();
        b.setTableNameResolver(tnr);
        assertSame(b.getTableNameResolver(), tnr);

        DynamoDBMapperConfig conf = b.build();
        assertEquals(conf.getConsistentReads(), ConsistentReads.CONSISTENT);
        assertSame(conf.getConversionSchema(), cs);
        assertSame(conf.getObjectTableNameResolver(), otnr);
        assertEquals(conf.getPaginationLoadingStrategy(), PaginationLoadingStrategy.LAZY_LOADING);
        assertSame(conf.getRequestMetricCollector(), rmc);
        assertEquals(conf.getSaveBehavior(), SaveBehavior.CLOBBER);
        assertSame(conf.getTableNameOverride(), tno);
        assertSame(conf.getTableNameResolver(), tnr);
    }

    @Test
    public void testConstructorWithNullOverrides() {
        DynamoDBMapperConfig conf = new DynamoDBMapperConfig.Builder().build();

        DynamoDBMapperConfig copy = new DynamoDBMapperConfig(conf, null);
        assertEquals(conf.getConsistentReads(), copy.getConsistentReads());
        assertEquals(conf.getConversionSchema(), copy.getConversionSchema());
        assertEquals(conf.getObjectTableNameResolver(), copy.getObjectTableNameResolver());
        assertEquals(conf.getPaginationLoadingStrategy(), copy.getPaginationLoadingStrategy());
        assertEquals(conf.getRequestMetricCollector(), copy.getRequestMetricCollector());
        assertEquals(conf.getSaveBehavior(), conf.getSaveBehavior());
        assertEquals(conf.getTableNameOverride(), copy.getTableNameOverride());
        assertEquals(conf.getTableNameResolver(), copy.getTableNameResolver());
    }

    @Test
    public void testConstructorWithNonNullOverrides() {
        DynamoDBMapperConfig.Builder b = new DynamoDBMapperConfig.Builder();

        b.setConsistentReads(
                ConsistentReads.CONSISTENT);
        assertEquals(b.getConsistentReads(), ConsistentReads.CONSISTENT);

        ConversionSchema cs = new ConversionSchemas.StandardConversionSchema(null, null, null);
        b.setConversionSchema(cs);
        assertSame(b.getConversionSchema(), cs);

        ObjectTableNameResolver otnr = new TestObjectTableNameResolver();
        b.setObjectTableNameResolver(otnr);
        assertSame(b.getObjectTableNameResolver(), otnr);

        b.setPaginationLoadingStrategy(PaginationLoadingStrategy.LAZY_LOADING);
        assertEquals(b.getPaginationLoadingStrategy(), PaginationLoadingStrategy.LAZY_LOADING);

        RequestMetricCollector rmc = new TestRequestMetricCollector();
        b.setRequestMetricCollector(rmc);
        assertSame(b.getRequestMetricCollector(), rmc);

        b.setSaveBehavior(SaveBehavior.CLOBBER);
        assertEquals(b.getSaveBehavior(), SaveBehavior.CLOBBER);

        TableNameOverride tno = new TableNameOverride("test");
        b.setTableNameOverride(tno);
        assertSame(b.getTableNameOverride(), tno);

        TableNameResolver tnr = new DynamoDBMapperConfig.DefaultTableNameResolver();
        b.setTableNameResolver(tnr);
        assertSame(b.getTableNameResolver(), tnr);

        DynamoDBMapperConfig conf = b.build();
        DynamoDBMapperConfig nullConfig = new DynamoDBMapperConfig.Builder()
                .withConsistentReads(null)
                .withConversionSchema(null).withObjectTableNameResolver(null)
                .withPaginationLoadingStrategy(null).withRequestMetricCollector(null)
                .withSaveBehavior(null).withTableNameOverride(null).withTableNameResolver(null)
                .build();

        DynamoDBMapperConfig copy = new DynamoDBMapperConfig(nullConfig, conf);
        assertEquals(copy.getConsistentReads(), conf.getConsistentReads());
        assertEquals(copy.getConversionSchema(), conf.getConversionSchema());
        assertEquals(copy.getObjectTableNameResolver(), conf.getObjectTableNameResolver());
        assertEquals(copy.getPaginationLoadingStrategy(), conf.getPaginationLoadingStrategy());
        assertEquals(copy.getRequestMetricCollector(), conf.getRequestMetricCollector());
        assertEquals(copy.getSaveBehavior(), conf.getSaveBehavior());
        assertEquals(copy.getTableNameOverride(), conf.getTableNameOverride());
        assertEquals(copy.getTableNameResolver(), conf.getTableNameResolver());
    }

    private static class TestObjectTableNameResolver implements ObjectTableNameResolver {

        @Override
        public String getTableName(Object object, DynamoDBMapperConfig config) {
            // TODO Auto-generated method stub
            return null;
        }
    }

    private static class TestRequestMetricCollector extends RequestMetricCollector {

        @Override
        public void collectMetrics(Request<?> arg0, Response<?> arg1) {
            // TODO Auto-generated method stub

        }
    }

}
