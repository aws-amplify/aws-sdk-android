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

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.util.StringUtils;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnmarshallerTests {

    private static final S3ClientCache S3CC = new S3ClientCache((AWSCredentialsProvider) null);

    private static final ItemConverter CONVERTER = ConversionSchemas.V1
            .getConverter(new ConversionSchema.Dependencies()
                    .with(S3ClientCache.class, S3CC));

    @Test
    public void testBoolean() {
        assertEquals(false, unconvert("getBoolean", "setBoolean",
                new AttributeValue().withN("0")));

        assertEquals(true, unconvert("getBoolean", "setBoolean",
                new AttributeValue().withN("1")));

        assertEquals(false, unconvert("getBoolean", "setBoolean",
                new AttributeValue().withBOOL(false)));

        assertEquals(true, unconvert("getBoolean", "setBoolean",
                new AttributeValue().withBOOL(true)));

        assertEquals(false, unconvert("getBoxedBoolean", "setBoxedBoolean",
                new AttributeValue().withN("0")));

        assertEquals(true, unconvert("getBoxedBoolean", "setBoxedBoolean",
                new AttributeValue().withN("1")));

        assertEquals(false, unconvert("getBoxedBoolean", "setBoxedBoolean",
                new AttributeValue().withBOOL(false)));

        assertEquals(true, unconvert("getBoxedBoolean", "setBoxedBoolean",
                new AttributeValue().withBOOL(true)));
    }

    @Test
    public void testString() {
        assertEquals("test", unconvert("getString", "setString",
                new AttributeValue("test")));

        Assert.assertNull(unconvert("getCustomString", "setCustomString",
                new AttributeValue("ignoreme")));
    }

    @Test
    public void testDate() {
        assertEquals(new Date(0), unconvert("getDate", "setDate",
                new AttributeValue("1970-01-01T00:00:00.000Z")));

        final Calendar c = Calendar.getInstance();
        c.setTimeInMillis(0);

        assertEquals(c, unconvert("getCalendar", "setCalendar",
                new AttributeValue("1970-01-01T00:00:00.000Z")));
    }

    @Test
    public void testNumbers() {
        assertEquals((byte) 1, unconvert("getByte", "setByte",
                new AttributeValue().withN("1")));
        assertEquals((byte) 1, unconvert("getBoxedByte", "setBoxedByte",
                new AttributeValue().withN("1")));

        assertEquals((short) 1, unconvert("getShort", "setShort",
                new AttributeValue().withN("1")));
        assertEquals((short) 1, unconvert("getBoxedShort", "setBoxedShort",
                new AttributeValue().withN("1")));

        assertEquals(1, unconvert("getInt", "setInt",
                new AttributeValue().withN("1")));
        assertEquals(1, unconvert("getBoxedInt", "setBoxedInt",
                new AttributeValue().withN("1")));

        assertEquals(1l, unconvert("getLong", "setLong",
                new AttributeValue().withN("1")));
        assertEquals(1l, unconvert("getBoxedLong", "setBoxedLong",
                new AttributeValue().withN("1")));

        assertEquals(BigInteger.ONE, unconvert("getBigInt", "setBigInt",
                new AttributeValue().withN("1")));

        assertEquals(1.5f, unconvert("getFloat", "setFloat",
                new AttributeValue().withN("1.5")));
        assertEquals(1.5f, unconvert("getBoxedFloat", "setBoxedFloat",
                new AttributeValue().withN("1.5")));

        assertEquals(1.5d, unconvert("getDouble", "setDouble",
                new AttributeValue().withN("1.5")));
        assertEquals(1.5d, unconvert("getBoxedDouble", "setBoxedDouble",
                new AttributeValue().withN("1.5")));

        assertEquals(BigDecimal.ONE, unconvert("getBigDecimal", "setBigDecimal",
                new AttributeValue().withN("1")));
    }

    @Test
    public void testBinary() {
        final ByteBuffer test = ByteBuffer.wrap("test".getBytes(StringUtils.UTF8));
        Assert.assertTrue(Arrays.equals("test".getBytes(StringUtils.UTF8), (byte[]) unconvert(
                "getByteArray", "setByteArray",
                new AttributeValue().withB(test.slice()))));

        assertEquals(test.slice(), unconvert("getByteBuffer", "setByteBuffer",
                new AttributeValue().withB(test.slice())));
    }

    @Test
    public void testBooleanSet() {
        assertEquals(new HashSet<Boolean>() {
            {
                add(true);
            }
        },
                unconvert("getBooleanSet", "setBooleanSet",
                        new AttributeValue().withNS("1")));

        assertEquals(new HashSet<Boolean>() {
            {
                add(false);
            }
        },
                unconvert("getBooleanSet", "setBooleanSet",
                        new AttributeValue().withNS("0")));

        assertEquals(new HashSet<Boolean>() {
            {
                add(true);
                add(false);
            }
        },
                unconvert("getBooleanSet", "setBooleanSet",
                        new AttributeValue().withNS("0", "1")));
    }

    @Test
    public void testStringSet() {
        Assert.assertNull(unconvert("getStringSet", "setStringSet",
                new AttributeValue().withNULL(true)));

        assertEquals(new HashSet<String>() {
            {
                add("a");
                add("b");
            }
        },
                unconvert("getStringSet", "setStringSet",
                        new AttributeValue().withSS("a", "b")));
    }

    @Test
    public void testDateSet() {
        assertEquals(Collections.singleton(new Date(0)),
                unconvert("getDateSet", "setDateSet", new AttributeValue()
                        .withSS("1970-01-01T00:00:00.000Z")));

        final Calendar c = Calendar.getInstance();
        c.setTimeInMillis(0);

        assertEquals(Collections.singleton(c),
                unconvert("getCalendarSet", "setCalendarSet",
                        new AttributeValue()
                                .withSS("1970-01-01T00:00:00.000Z")));
    }

    @Test
    public void testNumberSet() {
        Assert.assertNull(unconvert("getByteSet", "setByteSet",
                new AttributeValue().withNULL(true)));
        Assert.assertNull(unconvert("getShortSet", "setShortSet",
                new AttributeValue().withNULL(true)));
        Assert.assertNull(unconvert("getIntSet", "setIntSet",
                new AttributeValue().withNULL(true)));
        Assert.assertNull(unconvert("getLongSet", "setLongSet",
                new AttributeValue().withNULL(true)));
        Assert.assertNull(unconvert("getBigIntegerSet", "setBigIntegerSet",
                new AttributeValue().withNULL(true)));
        Assert.assertNull(unconvert("getFloatSet", "setFloatSet",
                new AttributeValue().withNULL(true)));
        Assert.assertNull(unconvert("getDoubleSet", "setDoubleSet",
                new AttributeValue().withNULL(true)));
        Assert.assertNull(unconvert("getBigDecimalSet", "setBigDecimalSet",
                new AttributeValue().withNULL(true)));

        assertEquals(new HashSet<Byte>() {
            {
                add((byte) 1);
            }
        },
                unconvert("getByteSet", "setByteSet",
                        new AttributeValue().withNS("1")));

        assertEquals(new HashSet<Short>() {
            {
                add((short) 1);
            }
        },
                unconvert("getShortSet", "setShortSet",
                        new AttributeValue().withNS("1")));

        assertEquals(new HashSet<Integer>() {
            {
                add(1);
            }
        },
                unconvert("getIntSet", "setIntSet",
                        new AttributeValue().withNS("1")));

        assertEquals(new HashSet<Long>() {
            {
                add(1l);
            }
        },
                unconvert("getLongSet", "setLongSet",
                        new AttributeValue().withNS("1")));

        assertEquals(new HashSet<BigInteger>() {
            {
                add(BigInteger.ONE);
            }
        },
                unconvert("getBigIntegerSet", "setBigIntegerSet",
                        new AttributeValue().withNS("1")));

        assertEquals(new HashSet<Float>() {
            {
                add(1.5f);
            }
        },
                unconvert("getFloatSet", "setFloatSet",
                        new AttributeValue().withNS("1.5")));

        assertEquals(new HashSet<Double>() {
            {
                add(1.5d);
            }
        },
                unconvert("getDoubleSet", "setDoubleSet",
                        new AttributeValue().withNS("1.5")));

        assertEquals(new HashSet<BigDecimal>() {
            {
                add(BigDecimal.ONE);
            }
        },
                unconvert("getBigDecimalSet", "setBigDecimalSet",
                        new AttributeValue().withNS("1")));
    }

    @Test
    public void testBinarySet() {
        Assert.assertNull(unconvert("getByteArraySet", "setByteArraySet",
                new AttributeValue().withNULL(true)));
        Assert.assertNull(unconvert("getByteBufferSet", "setByteBufferSet",
                new AttributeValue().withNULL(true)));

        final ByteBuffer test = ByteBuffer.wrap("test".getBytes(StringUtils.UTF8));

        final Set<byte[]> result = (Set<byte[]>) unconvert(
                "getByteArraySet", "setByteArraySet",
                new AttributeValue().withBS(test.slice()));

        assertEquals(1, result.size());
        Assert.assertTrue(Arrays.equals(
                "test".getBytes(StringUtils.UTF8),
                result.iterator().next()));

        Assert.assertEquals(Collections.singleton(test.slice()),
                unconvert("getByteBufferSet", "setByteBufferSet",
                        new AttributeValue().withBS(test.slice())));
    }

    @Test
    public void testList() {
        Assert.assertNull(unconvert("getList", "setList",
                new AttributeValue().withNULL(true)));

        assertEquals(Arrays.asList("a", "b", "c"),
                unconvert("getList", "setList", new AttributeValue().withL(
                        new AttributeValue("a"),
                        new AttributeValue("b"),
                        new AttributeValue("c"))));

        assertEquals(Arrays.asList("a", null),
                unconvert("getList", "setList", new AttributeValue().withL(
                        new AttributeValue("a"),
                        new AttributeValue().withNULL(true))));
    }

    @Test
    public void testSetList() {
        Assert.assertNull(unconvert("getSetList", "setSetList",
                new AttributeValue().withNULL(true)));

        assertEquals(Arrays.asList(new Set[] {
                null
        }),
                unconvert("getSetList", "setSetList", new AttributeValue().withL(
                        new AttributeValue().withNULL(true))));

        assertEquals(Arrays.asList(Collections.singleton("a")),
                unconvert("getSetList", "setSetList", new AttributeValue().withL(
                        new AttributeValue().withSS("a"))));
    }

    @Test
    public void testMap() {
        Assert.assertNull(unconvert("getMap", "setMap",
                new AttributeValue().withNULL(true)));

        assertEquals(new HashMap<String, String>() {
            {
                put("a", "b");
                put("c", "d");
            }
        },
                unconvert("getMap", "setMap", new AttributeValue().withM(
                        new HashMap<String, AttributeValue>() {
                            {
                                put("a", new AttributeValue("b"));
                                put("c", new AttributeValue("d"));
                            }
                        })));

        assertEquals(new HashMap<String, String>() {
            {
                put("a", null);
            }
        },
                unconvert("getMap", "setMap", new AttributeValue().withM(
                        new HashMap<String, AttributeValue>() {
                            {
                                put("a", new AttributeValue().withNULL(true));
                            }
                        })));
    }

    @Test
    public void testSetMap() {
        Assert.assertNull(unconvert("getSetMap", "setSetMap",
                new AttributeValue().withNULL(true)));

        assertEquals(new HashMap<String, Set<String>>() {
            {
                put("a", null);
                put("b", new TreeSet<String>(Arrays.asList("a", "b")));
            }
        },
                unconvert("getSetMap", "setSetMap", new AttributeValue().withM(
                        new HashMap<String, AttributeValue>() {
                            {
                                put("a", new AttributeValue().withNULL(true));
                                put("b", new AttributeValue().withSS("a", "b"));
                            }
                        })));
    }

    @Test
    public void testObject() {
        Assert.assertNull(unconvert("getObject", "setObject",
                new AttributeValue().withNULL(true)));

        assertEquals(new SubClass(), unconvert("getObject", "setObject",
                new AttributeValue().withM(new HashMap<String, AttributeValue>() {
                    {
                        put("name", new AttributeValue("name"));
                        put("value", new AttributeValue().withN("123"));
                    }
                })));

        assertEquals(new SubClass(), unconvert("getObject", "setObject",
                new AttributeValue().withM(new HashMap<String, AttributeValue>() {
                    {
                        put("name", new AttributeValue("name"));
                        put("value", new AttributeValue().withN("123"));
                        put("null", new AttributeValue().withNULL(true));
                    }
                })));
    }

    @Test
    public void testUnannotatedObject() throws Exception {
        final Method getter = UnannotatedSubClass.class.getMethod("getChild");
        final Method setter = UnannotatedSubClass.class
                .getMethod("setChild", UnannotatedSubClass.class);

        try {
            CONVERTER.unconvert(getter, setter, new AttributeValue().withS(""));
            Assert.fail("Expected DynamoDBMappingException");
        } catch (final DynamoDBMappingException e) {
        }
    }

    @Test
    public void testS3Link() {
        final S3Link link = (S3Link) unconvert("getS3Link", "setS3Link",
                new AttributeValue("{\"s3\":{"
                        + "\"bucket\":\"bucket\","
                        + "\"key\":\"key\","
                        + "\"region\":null}}"));

        assertEquals("bucket", link.getBucketName());
        assertEquals("key", link.getKey());
        assertEquals(Region.US_Standard, link.getS3Region());
    }

    public Object unconvert(String getter, String setter, AttributeValue value) {
        try {

            final Method gm = TestClass.class.getMethod(getter);
            final Method sm = TestClass.class.getMethod(setter, gm.getReturnType());
            return CONVERTER.unconvert(gm, sm, value);

        } catch (final RuntimeException e) {
            throw e;
        } catch (final Exception e) {
            throw new RuntimeException("BOOM", e);
        }
    }

}
