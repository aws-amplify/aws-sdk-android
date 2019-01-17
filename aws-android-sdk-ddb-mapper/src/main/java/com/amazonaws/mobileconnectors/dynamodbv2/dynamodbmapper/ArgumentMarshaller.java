/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * Interface to make it possible to cache the expensive type determination
 * behavior.
 */
public interface ArgumentMarshaller {

    /**
     * Marshalls the object given into an AttributeValue.
     * 
     * @param obj the object to be marshalled.
     * @return {@link AttributeValue}
     */
    AttributeValue marshall(Object obj);

    /**
     * The boolean attribute marshaller.
     */
    interface BooleanAttributeMarshaller extends ArgumentMarshaller {
    }

    /**
     * The boolean attribute marshaller.
     */
    interface StringAttributeMarshaller extends ArgumentMarshaller {
    }

    /**
     * The number attribute marshaller.
     */
    interface NumberAttributeMarshaller extends ArgumentMarshaller {
    }

    /**
     * The binary attribute marshaller.
     */
    interface BinaryAttributeMarshaller extends ArgumentMarshaller {
    }

    /**
     * The string set attribute marshaller.
     */
    interface StringSetAttributeMarshaller extends ArgumentMarshaller {
    }

    /**
     * The number set attribute marshaller.
     */
    interface NumberSetAttributeMarshaller extends ArgumentMarshaller {
    }

    /**
     * The binary set attribute marshaller.
     */
    interface BinarySetAttributeMarshaller extends ArgumentMarshaller {
    }

    /**
     * The list attribute marshaller.
     */
    interface ListAttributeMarshaller extends ArgumentMarshaller {
    }

    /**
     * The map attribute marshaller.
     */
    interface MapAttributeMarshaller extends ArgumentMarshaller {
    }
}
