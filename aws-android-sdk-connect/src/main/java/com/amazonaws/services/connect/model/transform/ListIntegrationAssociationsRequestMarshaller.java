/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListIntegrationAssociationsRequest
 */
public class ListIntegrationAssociationsRequestMarshaller implements
        Marshaller<Request<ListIntegrationAssociationsRequest>, ListIntegrationAssociationsRequest> {

    public Request<ListIntegrationAssociationsRequest> marshall(
            ListIntegrationAssociationsRequest listIntegrationAssociationsRequest) {
        if (listIntegrationAssociationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListIntegrationAssociationsRequest)");
        }

        Request<ListIntegrationAssociationsRequest> request = new DefaultRequest<ListIntegrationAssociationsRequest>(
                listIntegrationAssociationsRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/instance/{InstanceId}/integration-associations";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (listIntegrationAssociationsRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(listIntegrationAssociationsRequest.getInstanceId()));
        if (listIntegrationAssociationsRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listIntegrationAssociationsRequest.getNextToken()));
        }
        if (listIntegrationAssociationsRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listIntegrationAssociationsRequest.getMaxResults()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
