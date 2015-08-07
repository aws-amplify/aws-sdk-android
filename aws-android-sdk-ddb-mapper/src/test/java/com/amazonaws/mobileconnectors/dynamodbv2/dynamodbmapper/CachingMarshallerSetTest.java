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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ConversionSchemas.CachingMarshallerSet;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ConversionSchemas.MarshallerSet;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

import java.lang.reflect.Method;

public class CachingMarshallerSetTest {

    private static final MarshallerSet mock =
            EasyMock.createMock(MarshallerSet.class);

    private static final MarshallerSet sut = new CachingMarshallerSet(mock);

    @Test
    public void testIt() throws Exception {
        ArgumentMarshaller marshaller = new ArgumentMarshaller() {
            @Override
            public AttributeValue marshall(Object value) {
                return null;
            }
        };

        EasyMock.reset(mock);
        EasyMock
                .expect(mock.getMarshaller(EasyMock.<Method> anyObject()))
                .andReturn(marshaller);
        EasyMock.replay(mock);

        ArgumentMarshaller result = sut.getMarshaller(
                TestClass.class.getMethod("getString"));

        Assert.assertSame(marshaller, result);

        result = sut.getMarshaller(TestClass.class.getMethod("getString"));

        Assert.assertSame(marshaller, result);

        EasyMock.verify(mock);

        ArgumentMarshaller marshaller2 = new ArgumentMarshaller() {
            @Override
            public AttributeValue marshall(Object value) {
                return null;
            }
        };

        EasyMock.reset(mock);
        EasyMock
                .expect(mock.getMarshaller(EasyMock.<Method> anyObject()))
                .andReturn(marshaller2);
        EasyMock.replay(mock);

        result = sut.getMarshaller(TestClass.class.getMethod("getInt"));

        Assert.assertSame(marshaller2, result);

        EasyMock.verify(mock);
    }
}
