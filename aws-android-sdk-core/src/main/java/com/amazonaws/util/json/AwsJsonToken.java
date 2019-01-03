/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.util.json;

/**
 * The token types returned from {@link AwsJsonReader#peek()}.
 */
public enum AwsJsonToken {
    /** The beginning of an array '[' */
    BEGIN_ARRAY,
    /** The end of an array ']' */
    END_ARRAY,
    /** The beginning of an object '{' */
    BEGIN_OBJECT,
    /** The end of an object '}' */
    END_OBJECT,
    /** A field name in an object */
    FIELD_NAME,
    /** Boolean value, either true of false */
    VALUE_BOOLEAN,
    /** Value null */
    VALUE_NULL,
    /** A number, can be long, double */
    VALUE_NUMBER,
    /** A string value, with quotes */
    VALUE_STRING,
    /** None of the above as fail-safe */
    UNKNOWN
}
