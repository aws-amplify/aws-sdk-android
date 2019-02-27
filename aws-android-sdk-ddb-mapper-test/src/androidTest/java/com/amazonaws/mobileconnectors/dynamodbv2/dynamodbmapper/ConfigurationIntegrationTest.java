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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.ObjectTableNameResolver;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.TableNameOverride;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.TableNameResolver;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Tests of the configuration object
 */
public class ConfigurationIntegrationTest extends DynamoDBMapperIntegrationTestBase {

    // We don't start with the current system millis like other tests because
    // it's out of the range of some data types
    private static int start = 1;
    private static int byteStart = -127;

    @Test
    public void testClobber() throws Exception {
        DynamoDBMapper util = new DynamoDBMapper(dynamo, new DynamoDBMapperConfig(
                SaveBehavior.CLOBBER));

        NumberAttributeClassExtended obj = getUniqueObject();
        util.save(obj);
        assertEquals(obj, util.load(obj.getClass(), obj.getKey()));

        NumberAttributeClass copy = copy(obj);
        util.save(copy);
        assertEquals(copy, util.load(copy.getClass(), obj.getKey()));

        // We should have lost the extra field because of the clobber behavior
        assertNull(util.load(NumberAttributeClassExtended.class, obj.getKey()).getExtraField());

        // Now test overriding the clobber behavior on a per-save basis
        obj = getUniqueObject();
        util.save(obj);
        assertEquals(obj, util.load(obj.getClass(), obj.getKey()));

        copy = copy(obj);
        util.save(copy, new DynamoDBMapperConfig(SaveBehavior.UPDATE));
        assertEquals(copy, util.load(copy.getClass(), obj.getKey()));

        // We shouldn't have lost any extra info
        assertNotNull(util.load(NumberAttributeClassExtended.class, obj.getKey()).getExtraField());
    }

    @Test
    public void testTableOverride() throws Exception {
        DynamoDBMapper util = new DynamoDBMapper(dynamo);

        TableOverrideTestClass obj = new TableOverrideTestClass();
        obj.setOtherField(UUID.randomUUID().toString());

        try {
            util.save(obj);
            fail("Expected an exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

        util.save(obj, new DynamoDBMapperConfig(new TableNameOverride("aws-java-sdk-util")));

        try {
            util.load(TableOverrideTestClass.class, obj.getKey());
            fail("Expected an exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Object loaded = util.load(TableOverrideTestClass.class, obj.getKey(),
                new DynamoDBMapperConfig(TableNameOverride.withTableNamePrefix("aws-")));
        assertEquals(loaded, obj);

        try {
            util.delete(obj);
            fail("Expected an exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

        util.delete(obj, new DynamoDBMapperConfig(TableNameOverride.withTableNamePrefix("aws-")));
    }

    @Test
    public void testTableNameResolver() {
        final String REAL_TABLE_NAME = "aws-java-sdk-util";

        DynamoDBMapper mapper = new DynamoDBMapper(dynamo);

        final TableOverrideTestClass obj = new TableOverrideTestClass();
        obj.setOtherField(UUID.randomUUID().toString());

        try {
            mapper.save(obj);
            fail("Expected an exception, because the POJO is annotated with a non-existent table.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Use TableNameResolver to save to the real table
        mapper.save(obj, new DynamoDBMapperConfig(new TableNameResolver() {
            @Override
            public String getTableName(Class<?> clazz, DynamoDBMapperConfig config) {
                if (clazz.equals(TableOverrideTestClass.class)) {
                    return REAL_TABLE_NAME;
                }
                throw new RuntimeException("Unexpected data object type.");
            }
        }));

        try {
            mapper.load(TableOverrideTestClass.class, obj.getKey());
            fail("Expected an exception, because the POJO is annotated with a non-existent table.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Use ObjectTableNameResolver to load from the real table
        Object loaded = mapper.load(obj,
                new DynamoDBMapperConfig(new ObjectTableNameResolver() {
                    @Override
                    public String getTableName(Object objectToLoad, DynamoDBMapperConfig config) {
                        if (objectToLoad == obj) {
                            return REAL_TABLE_NAME;
                        }
                        throw new RuntimeException("Unexpected data object.");
                    }
                }));
        assertEquals(loaded, obj);

        try {
            mapper.delete(obj);
            fail("Expected an exception, because the POJO is annotated with a non-existent table.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // When used at the same time, ObjectTableNameResolver should have the
        // highest priority

        final String NON_EXISTENT_TABLE_NAME = UUID.randomUUID().toString();
        mapper.delete(obj, new DynamoDBMapperConfig.Builder()
                .withTableNameOverride(new TableNameOverride(NON_EXISTENT_TABLE_NAME))
                .withTableNameResolver(new TableNameResolver() {
                    @Override
                    public String getTableName(Class<?> clazz, DynamoDBMapperConfig config) {
                        return NON_EXISTENT_TABLE_NAME;
                    }
                })
                .withObjectTableNameResolver(new ObjectTableNameResolver() {
                    @Override
                    public String getTableName(Object object, DynamoDBMapperConfig config) {
                        return REAL_TABLE_NAME;
                    }
                }).build());
    }

    private NumberAttributeClassExtended getUniqueObject() {
        NumberAttributeClassExtended obj = new NumberAttributeClassExtended();
        obj.setKey(String.valueOf(startKey++));
        obj.setBigDecimalAttribute(new BigDecimal(startKey++));
        obj.setBigIntegerAttribute(new BigInteger("" + startKey++));
        obj.setByteAttribute((byte) byteStart++);
        obj.setByteObjectAttribute(new Byte("" + byteStart++));
        obj.setDoubleAttribute(new Double("" + start++));
        obj.setDoubleObjectAttribute(new Double("" + start++));
        obj.setFloatAttribute(new Float("" + start++));
        obj.setFloatObjectAttribute(new Float("" + start++));
        obj.setIntAttribute(new Integer("" + start++));
        obj.setIntegerAttribute(new Integer("" + start++));
        obj.setLongAttribute(new Long("" + start++));
        obj.setLongObjectAttribute(new Long("" + start++));
        obj.setDateAttribute(new Date(startKey++));
        obj.setBooleanAttribute(start++ % 2 == 0);
        obj.setBooleanObjectAttribute(start++ % 2 == 0);
        obj.setExtraField("" + startKey++);
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(startKey++));
        obj.setCalendarAttribute(cal);
        return obj;
    }

    private NumberAttributeClass copy(NumberAttributeClassExtended obj) {
        NumberAttributeClass copy = new NumberAttributeClass();
        copy.setKey(obj.getKey());
        copy.setBigDecimalAttribute(obj.getBigDecimalAttribute());
        copy.setBigIntegerAttribute(obj.getBigIntegerAttribute());
        copy.setByteAttribute(obj.getByteAttribute());
        copy.setByteObjectAttribute(obj.getByteObjectAttribute());
        copy.setDoubleAttribute(obj.getDoubleAttribute());
        copy.setDoubleObjectAttribute(obj.getDoubleObjectAttribute());
        copy.setFloatAttribute(obj.getFloatAttribute());
        copy.setFloatObjectAttribute(obj.getFloatObjectAttribute());
        copy.setIntAttribute(obj.getIntAttribute());
        copy.setIntegerAttribute(obj.getIntegerAttribute());
        copy.setLongAttribute(obj.getLongAttribute());
        copy.setLongObjectAttribute(obj.getLongObjectAttribute());
        copy.setDateAttribute(obj.getDateAttribute());
        copy.setBooleanAttribute(obj.isBooleanAttribute());
        copy.setBooleanObjectAttribute(obj.getBooleanObjectAttribute());
        return copy;
    }

    @DynamoDBTable(tableName = "aws-java-sdk-util")
    public static final class NumberAttributeClassExtended extends NumberAttributeClass {

        private String extraField;

        public String getExtraField() {
            return extraField;
        }

        public void setExtraField(String extraField) {
            this.extraField = extraField;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = super.hashCode();
            result = prime * result + ((extraField == null) ? 0 : extraField.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!super.equals(obj))
                return false;
            if (getClass() != obj.getClass())
                return false;
            NumberAttributeClassExtended other = (NumberAttributeClassExtended) obj;
            if (extraField == null) {
                if (other.extraField != null)
                    return false;
            } else if (!extraField.equals(other.extraField))
                return false;
            return true;
        }
    }

    @DynamoDBTable(tableName = "java-sdk-util")
    // doesn't exist
    public static final class TableOverrideTestClass {

        private String key;
        private String otherField;

        @DynamoDBAutoGeneratedKey
        @DynamoDBHashKey
        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getOtherField() {
            return otherField;
        }

        public void setOtherField(String otherField) {
            this.otherField = otherField;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((key == null) ? 0 : key.hashCode());
            result = prime * result + ((otherField == null) ? 0 : otherField.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            TableOverrideTestClass other = (TableOverrideTestClass) obj;
            if (key == null) {
                if (other.key != null)
                    return false;
            } else if (!key.equals(other.key))
                return false;
            if (otherField == null) {
                if (other.otherField != null)
                    return false;
            } else if (!otherField.equals(other.otherField))
                return false;
            return true;
        }

    }

}
