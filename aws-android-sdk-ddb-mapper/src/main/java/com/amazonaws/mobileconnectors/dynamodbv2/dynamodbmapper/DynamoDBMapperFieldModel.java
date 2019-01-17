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

/**
 * A class that converts the variable to DynamoDB field.
 */
public class DynamoDBMapperFieldModel {

    /**
     * The DynamoDB Attribute types.
     *
     * @author saligram
     */
    public enum DynamoDBAttributeType {
        /**
         * DynamoDB String.
         */
        S,
        /**
         * DynamoDB Number.
         */
        N,
        /**
         * DynamoDB Binary.
         */
        B,
        /**
         * DynamoDB String Set.
         */
        SS,
        /**
         * DynamoDB Number Set.
         */
        NS,
        /**
         * DynamoDB Binary Set.
         */
        BS,
        /**
         * DynamoDB Boolean.
         */
        BOOL,
        /**
         * DynamoDB Null.
         */
        NULL,
        /**
         * DynamoDB List.
         */
        L,
        /**
         * DynamoDB Map.
         */
        M
    }

    private final String dynamoDBAttributeName;
    private final DynamoDBAttributeType dynamoDBAttributeType;
    private final ArgumentMarshaller argumentMarshaller;

    /**
     * Constructor.
     *
     * @param dynamoDBAttributeName the attribute name.
     * @param dynamoDBAttributeType the attribute type.
     * @param argumentMarshaller the argument marshaller.
     */
    public DynamoDBMapperFieldModel(
            String dynamoDBAttributeName,
            DynamoDBAttributeType dynamoDBAttributeType,
            ArgumentMarshaller argumentMarshaller) {
        this.dynamoDBAttributeName = dynamoDBAttributeName;
        this.dynamoDBAttributeType = dynamoDBAttributeType;
        this.argumentMarshaller = argumentMarshaller;
    }

    /**
     * Returns the name of the DynamoDB attribute this mapped field will be
     * stored as.
     *
     * @return the dynamodb attribute name.
     */
    public String getDynamoDBAttributeName() {
        return dynamoDBAttributeName;
    }

    /**
     * Returns the type of the DynamoDB attribute this mapped field will be
     * stored as.
     *
     * @return the {@link DynamoDBAttributeType}
     */
    public DynamoDBAttributeType getDynamoDBAttributeType() {
        return dynamoDBAttributeType;
    }

    /**
     * (Internal usage only) Returns the argument marshaller that is bound to
     * this mapped field.
     *
     * @return the {@link ArgumentMarshaller}
     */
    ArgumentMarshaller getArgumentMarshaller() {
        return argumentMarshaller;
    }

}
