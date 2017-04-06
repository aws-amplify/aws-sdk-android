/*
 * Copyright 2011-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for marking a property in a class as the attribute to be used as
 * range key for one or more local secondary indexes on a DynamoDB table.
 * Applied to the getter method or the class field for the indexed range key
 * property. If the annotation is applied directly to the class field, the
 * corresponding getter and setter must be declared in the same class.
 * <p>
 * This annotation is required if this attribute will be used as index key for
 * item queries.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.FIELD, ElementType.METHOD
})
public @interface DynamoDBIndexRangeKey {

    /**
     * Optional parameter when the name of the attribute as stored in DynamoDB
     * should differ from the name used by the getter / setter.
     */
    String attributeName() default "";

    /**
     * Parameter for the name of the local secondary index.
     * <p>
     * This is required if this attribute is the index key for only one local
     * secondary index.
     */
    String localSecondaryIndexName() default "";

    /**
     * Parameter for the names of the local secondary indexes.
     * <p>
     * This is required if this attribute is the index key for multiple local
     * secondary indexes.
     */
    String[] localSecondaryIndexNames() default {};

    /**
     * Parameter for the name of the global secondary index.
     * <p>
     * This is required if this attribute is the index key for only one global
     * secondary index.
     */
    String globalSecondaryIndexName() default "";

    /**
     * Parameter for the names of the global secondary indexes.
     * <p>
     * This is required if this attribute is the index key for multiple global
     * secondary indexes.
     */
    String[] globalSecondaryIndexNames() default {};

}
