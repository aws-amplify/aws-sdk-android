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
 * Marshaller interface for storing complex types in DynamoDB as Strings.
 * Implementors provide methods to transform instances of a class to and from
 * Strings.
 *
 * @param <T> the type of object to be marshalled.
 */
public interface DynamoDBMarshaller<T extends Object> {

    /**
     * Turns an object of type T into its String representation.
     *
     * @param getterReturnResult the object of type T
     * @return marshalled string from object.
     */
    public String marshall(T getterReturnResult);

    /**
     * Turns a String representation of an object of type T into an object.
     *
     * @param clazz the class of type T to unmarshall.
     * @param obj the string to unmarshall from.
     * @return an instance of type T.
     */
    public T unmarshall(Class<T> clazz, String obj);
}
