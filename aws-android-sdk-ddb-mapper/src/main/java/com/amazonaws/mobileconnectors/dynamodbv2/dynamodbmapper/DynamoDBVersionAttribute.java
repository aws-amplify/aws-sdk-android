/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for marking a property as an optimistic locking version attribute.
 * Applied to the getter method or the class field for the class's version
 * property. If the annotation is applied directly to the class field, the
 * corresponding getter and setter must be declared in the same class.
 * <p>
 * Only nullable, integral numeric types (e.g. Integer, Long) can be used as
 * version properties. On a save() operation, the {@link DynamoDBMapper} will
 * attempt to increment the version property and assert that the service's value
 * matches the client's. New objects will be assigned a version of 1 when saved.
 * <p>
 * Note that for batchWrite, and by extension batchSave and batchDelete, <b>no
 * version checks are performed</b>, as required by the
 * {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)}
 * API.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.FIELD, ElementType.METHOD
})
public @interface DynamoDBVersionAttribute {
    /**
     * Optional parameter when the name of the attribute as stored in DynamoDB
     * should differ from the name used by the getter / setter.
     */
    String attributeName() default "";
}
