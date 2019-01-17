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

import com.amazonaws.util.StringUtils;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * A Json data binder backed by Gson.
 */
public class LambdaJsonBinder implements LambdaDataBinder {

    private final Gson gson;

    /**
     * Constructs a Lambda Json binder.
     */
    public LambdaJsonBinder() {
        this.gson = new Gson();
    }

    @Override
    public <T> T deserialize(byte[] content, Class<T> clazz) {
        if (content == null) {
            return null;
        }
        Reader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(content),
                StringUtils.UTF8));
        return gson.fromJson(reader, clazz);
    }

    @Override
    public byte[] serialize(Object object) {
        return gson.toJson(object).getBytes(StringUtils.UTF8);
    }
}
