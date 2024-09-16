/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListUserProficienciesRequest
 */
public class ListUserProficienciesRequestMarshaller implements
        Marshaller<Request<ListUserProficienciesRequest>, ListUserProficienciesRequest> {

    public Request<ListUserProficienciesRequest> marshall(
            ListUserProficienciesRequest listUserProficienciesRequest) {
        if (listUserProficienciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListUserProficienciesRequest)");
        }

        Request<ListUserProficienciesRequest> request = new DefaultRequest<ListUserProficienciesRequest>(
                listUserProficienciesRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/users/{InstanceId}/{UserId}/proficiencies";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (listUserProficienciesRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(listUserProficienciesRequest.getInstanceId()));
        uriResourcePath = uriResourcePath.replace(
                "{UserId}",
                (listUserProficienciesRequest.getUserId() == null) ? "" : StringUtils
                        .fromString(listUserProficienciesRequest.getUserId()));
        if (listUserProficienciesRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listUserProficienciesRequest.getNextToken()));
        }
        if (listUserProficienciesRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listUserProficienciesRequest.getMaxResults()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
