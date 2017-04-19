/*
 * Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AmazonPollyCustomRequest<T> extends DefaultRequest<T> {

    private final Map<String, List<String>> parameters = new LinkedHashMap<String, List<String>>();

    public AmazonPollyCustomRequest(AmazonWebServiceRequest originalRequest, String serviceName) {
        super(originalRequest, serviceName);
    }

    public AmazonPollyCustomRequest(String serviceName) {
        super(serviceName);
    }

    /**TODO: Create flag to override parameter instead of just adding the value.
     * @see com.amazonaws.Request#addParameter(java.lang.String,
     *      java.lang.String)
     */
    @Override
    public void addParameter(String name, String value) {
        List<String> list = this.parameters.get(name);
        if (list == null) {
            list = new ArrayList<String>();
            this.parameters.put(name, list);
        }
        list.add(value);
    }

    public Map<String, List<String>> getParametersWithList() {
        return parameters;
    }

}
