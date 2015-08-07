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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.AttributeTransformer.Parameters;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AttributeTransformerChainTest {
    @Test
    public void testTransformEmptyChain() {

        AttributeTransformer transformer = new AttributeTransformerChain(
                Collections.<AttributeTransformer> emptyList()
                );

        Map<String, AttributeValue> values = EasyMock.createMock(Map.class);
        EasyMock.replay(values);

        Parameters<?> params = EasyMock.createMock(Parameters.class);
        EasyMock.expect(params.getAttributeValues()).andReturn(values);
        EasyMock.replay(params);

        Map<String, AttributeValue> result = transformer.transform(params);
        Assert.assertSame(values, result);
    }

    @Test
    public void testUntransformEmptyChain() {

        AttributeTransformer transformer = new AttributeTransformerChain(
                Collections.<AttributeTransformer> emptyList()
                );

        Map<String, AttributeValue> values = EasyMock.createMock(Map.class);
        EasyMock.replay(values);

        Parameters<?> params = EasyMock.createMock(Parameters.class);
        EasyMock.expect(params.getAttributeValues()).andReturn(values);
        EasyMock.replay(params);

        Map<String, AttributeValue> result = transformer.untransform(params);
        Assert.assertSame(values, result);
    }

    @Test
    public void testTransform() {

        AttributeTransformer transformer1 = new TestTransformer(".one");
        AttributeTransformer transformer2 = new TestTransformer(".two");

        AttributeTransformer chain =
                new AttributeTransformerChain(transformer1, transformer2);

        Map<String, AttributeValue> values =
                new HashMap<String, AttributeValue>();

        values.put("test1", new AttributeValue("foo"));
        values.put("test2", new AttributeValue("bar"));

        Parameters<?> params = EasyMock.createMock(Parameters.class);
        EasyMock.expect(params.getAttributeValues()).andReturn(values);
        EasyMock.replay(params);

        Map<String, AttributeValue> result = chain.transform(params);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());

        Assert.assertEquals("foo.one.two", result.get("test1").getS());
        Assert.assertEquals("bar.one.two", result.get("test2").getS());
    }

    @Test
    public void testUntransform() {

        AttributeTransformer transformer1 = new TestTransformer(".one");
        AttributeTransformer transformer2 = new TestTransformer(".two");

        AttributeTransformer chain =
                new AttributeTransformerChain(transformer1, transformer2);

        Map<String, AttributeValue> values =
                new HashMap<String, AttributeValue>();

        values.put("test1", new AttributeValue("foo.one.two"));
        values.put("test2", new AttributeValue("bar.one.two"));

        Parameters<?> params = EasyMock.createMock(Parameters.class);
        EasyMock.expect(params.getAttributeValues()).andReturn(values);
        EasyMock.replay(params);

        Map<String, AttributeValue> result = chain.untransform(params);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());

        Assert.assertEquals("foo", result.get("test1").getS());
        Assert.assertEquals("bar", result.get("test2").getS());
    }

    @Test
    public void testRoundTrip() {

        AttributeTransformer transformer1 = new TestTransformer(".one");
        AttributeTransformer transformer2 = new TestTransformer(".two");

        AttributeTransformer chain =
                new AttributeTransformerChain(transformer1, transformer2);

        Map<String, AttributeValue> values =
                new HashMap<String, AttributeValue>();

        values.put("test1", new AttributeValue("foo"));
        values.put("test2", new AttributeValue("bar"));

        Parameters<?> params = EasyMock.createMock(Parameters.class);
        EasyMock.expect(params.getAttributeValues()).andReturn(values);
        EasyMock.replay(params);

        Map<String, AttributeValue> result = chain.transform(params);

        EasyMock.reset(params);
        EasyMock.expect(params.getAttributeValues()).andReturn(result);
        EasyMock.replay(params);

        result = chain.untransform(params);

        Assert.assertEquals(values, result);
    }

    private static class TestTransformer implements AttributeTransformer {

        private final String appendMe;

        public TestTransformer(final String appendMe) {
            this.appendMe = appendMe;
        }

        @Override
        public Map<String, AttributeValue> transform(
                final Parameters<?> parameters) {

            Map<String, AttributeValue> rval =
                    new HashMap<String, AttributeValue>();

            for (Map.Entry<String, AttributeValue> entry : parameters.getAttributeValues()
                    .entrySet()) {

                rval.put(entry.getKey(), transform(entry.getValue()));
            }

            return rval;
        }

        @Override
        public Map<String, AttributeValue> untransform(
                final Parameters<?> parameters) {

            Map<String, AttributeValue> rval =
                    new HashMap<String, AttributeValue>();

            for (Map.Entry<String, AttributeValue> entry : parameters.getAttributeValues()
                    .entrySet()) {

                rval.put(entry.getKey(), untransform(entry.getValue()));
            }

            return rval;
        }

        private AttributeValue transform(AttributeValue value) {
            return new AttributeValue(value.getS() + appendMe);
        }

        private AttributeValue untransform(AttributeValue value) {
            String s = value.getS();
            if (s.endsWith(appendMe)) {
                return new AttributeValue(
                        s.substring(0, s.length() - appendMe.length()));
            } else {
                return value;
            }
        }
    }
}
