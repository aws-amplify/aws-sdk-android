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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ConversionSchemas.CachingUnmarshallerSet;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ConversionSchemas.UnmarshallerSet;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

import java.lang.reflect.Method;

public class CachingUnmarshallerSetTest {

    private static final UnmarshallerSet mock =
            EasyMock.createMock(UnmarshallerSet.class);

    private static final UnmarshallerSet sut = new CachingUnmarshallerSet(mock);

    @Test
    public void testIt() throws Exception {
        ArgumentUnmarshaller unmarshaller = new ArgumentUnmarshaller() {
            @Override
            public void typeCheck(AttributeValue value, Method setter) {
            }

            @Override
            public Object unmarshall(AttributeValue value) {
                return null;
            }
        };

        EasyMock.reset(mock);
        EasyMock
                .expect(mock.getUnmarshaller(
                        EasyMock.<Method> anyObject(),
                        EasyMock.<Method> anyObject()))
                .andReturn(unmarshaller);
        EasyMock.replay(mock);

        ArgumentUnmarshaller result = sut.getUnmarshaller(
                TestClass.class.getMethod("getString"),
                TestClass.class.getMethod("setString", String.class));

        Assert.assertSame(unmarshaller, result);

        result = sut.getUnmarshaller(
                TestClass.class.getMethod("getString"),
                TestClass.class.getMethod("setString", String.class));

        Assert.assertSame(unmarshaller, result);

        EasyMock.verify(mock);

        ArgumentUnmarshaller unmarshaller2 = new ArgumentUnmarshaller() {
            @Override
            public void typeCheck(AttributeValue value, Method setter) {
            }

            @Override
            public Object unmarshall(AttributeValue value) {
                return null;
            }
        };

        EasyMock.reset(mock);
        EasyMock
                .expect(mock.getUnmarshaller(
                        EasyMock.<Method> anyObject(),
                        EasyMock.<Method> anyObject()))
                .andReturn(unmarshaller2);

        EasyMock.replay(mock);

        result = sut.getUnmarshaller(
                TestClass.class.getMethod("getInt"),
                TestClass.class.getMethod("setInt", int.class));

        Assert.assertSame(unmarshaller2, result);

        EasyMock.verify(mock);
    }
}
