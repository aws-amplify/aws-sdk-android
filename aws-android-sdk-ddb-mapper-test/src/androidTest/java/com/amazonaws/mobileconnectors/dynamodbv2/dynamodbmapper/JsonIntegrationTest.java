/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.dynamodbv2.test.util.DynamoDBTestBase;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.TableNameOverride;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.amazonaws.services.dynamodbv2.model.TableStatus;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class JsonIntegrationTest extends DynamoDBTestBase {

    private static final String TABLE_NAME = "test-table-"
            + UUID.randomUUID().toString();

    private static DynamoDBMapper mapper;

    @BeforeClass
    public static void setup() throws Exception {
        setUpTestBase();
        mapper = new DynamoDBMapper(
                dynamo,
                new DynamoDBMapperConfig.Builder()
                        .withConversionSchema(ConversionSchemas.V2)
                        .withTableNameOverride(TableNameOverride
                                .withTableNameReplacement(TABLE_NAME))
                        .withConsistentReads(ConsistentReads.CONSISTENT)
                        .build());

        CreateTableRequest request = mapper
                .generateCreateTableRequest(TestClass.class)
                .withProvisionedThroughput(new ProvisionedThroughput(1L, 1L));

        dynamo.createTable(request);

        Thread.sleep(10000);

        while (true) {
            String status = dynamo.describeTable(TABLE_NAME)
                    .getTable()
                    .getTableStatus();

            if (status.equals(TableStatus.ACTIVE.toString())) {
                break;
            } else if (!status.equals(TableStatus.CREATING.toString())) {
                throw new RuntimeException("Table creation failed");
            }

            Thread.sleep(2000);
        }
    }

    @AfterClass
    public static void cleanup() {
        if (dynamo == null) {
            return;
        }

        try {
            dynamo.deleteTable(TABLE_NAME);
        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIt() {
        final ChildClass child1 = new ChildClass();
        child1.setBool(true);

        final ChildClass child2 = new ChildClass();
        child2.setBool(true);

        final ChildClass parent = new ChildClass();
        parent.setFirstChild(child1);
        parent.setOtherChildren(Arrays.asList(child1, child2));
        parent.setNamedChildren(new HashMap<String, ChildClass>() {
            {
                put("one", child1);
                put("two", child2);
            }
        });

        TestClass test = new TestClass();
        test.setId("test");
        test.setListOfMaps(Arrays.<Map<String, ChildClass>> asList(
                new HashMap<String, ChildClass>() {
                    {
                        put("parent", parent);
                    }
                },
                new HashMap<String, ChildClass>() {
                    {
                        put("parent", parent);
                    }
                },
                null
                ));
        test.setMapOfLists(new HashMap<String, List<ChildClass>>() {
            {
                put("parent", Arrays.asList(child1, child2));
                put("child2", Collections.<ChildClass> emptyList());
                put("child1", null);
            }
        });

        mapper.save(test);

        TestClass result = mapper.load(TestClass.class, "test");

        Assert.assertEquals(test, result);
    }

    @DynamoDBTable(tableName = "")
    public static class TestClass {

        private String id;
        private List<Map<String, ChildClass>> listOfMaps;
        private Map<String, List<ChildClass>> mapOfLists;

        @DynamoDBHashKey
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Map<String, ChildClass>> getListOfMaps() {
            return listOfMaps;
        }

        public void setListOfMaps(List<Map<String, ChildClass>> listOfMaps) {
            this.listOfMaps = listOfMaps;
        }

        public Map<String, List<ChildClass>> getMapOfLists() {
            return mapOfLists;
        }

        public void setMapOfLists(Map<String, List<ChildClass>> mapOfLists) {
            this.mapOfLists = mapOfLists;
        }

        @Override
        public boolean equals(Object obj) {
            TestClass other = (TestClass) obj;

            return (eq(id, other.id)
                    && eq(listOfMaps, other.listOfMaps)
                    && eq(mapOfLists, other.mapOfLists));
        }

        @Override
        public String toString() {
            return "{id=" + id + ", listOfMaps=" + listOfMaps + ", mapOfLists="
                    + mapOfLists + "}";
        }
    }

    @DynamoDBDocument
    public static class ChildClass {

        private boolean bool;

        private ChildClass firstChild;
        private List<ChildClass> otherChildren;
        private Map<String, ChildClass> namedChildren;

        public boolean isBool() {
            return bool;
        }

        public void setBool(boolean bool) {
            this.bool = bool;
        }

        public ChildClass getFirstChild() {
            return firstChild;
        }

        public void setFirstChild(ChildClass firstChild) {
            this.firstChild = firstChild;
        }

        public List<ChildClass> getOtherChildren() {
            return otherChildren;
        }

        public void setOtherChildren(List<ChildClass> otherChildren) {
            this.otherChildren = otherChildren;
        }

        public Map<String, ChildClass> getNamedChildren() {
            return namedChildren;
        }

        public void setNamedChildren(Map<String, ChildClass> namedChildren) {
            this.namedChildren = namedChildren;
        }

        @Override
        public boolean equals(Object obj) {
            ChildClass other = (ChildClass) obj;

            return (eq(bool, other.bool)
                    && eq(firstChild, other.firstChild)
                    && eq(otherChildren, other.otherChildren)
                    && eq(namedChildren, other.namedChildren));
        }

        @Override
        public String toString() {
            return "{bool=" + bool + ", firstChild=" + firstChild
                    + ", otherChildren=" + otherChildren + ", namedChildren="
                    + namedChildren + "}";
        }
    }

    private static <T> boolean eq(T one, T two) {
        if (one == null) {
            return (two == null);
        } else {
            return one.equals(two);
        }
    }
}
