/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.lambdainvoker;

/**
 * An interface for databinding between POJO and byte array.
 */
public interface LambdaDataBinder {

    /**
     * Converts an encoded byte array into a POJO.
     *
     * @param content an encoded content in bytes
     * @param clazz class to be deserialized into
     * @param <T> the type of the class
     * @return a POJO
     */
    <T> T deserialize(byte[] content, Class<T> clazz);

    /**
     * Serializes an object into encoded byte array.
     *
     * @param object object to be serialized
     * @return a byte array
     */
    byte[] serialize(Object object);
}
