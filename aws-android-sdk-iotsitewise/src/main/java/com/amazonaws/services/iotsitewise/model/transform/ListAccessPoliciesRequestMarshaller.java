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

package com.amazonaws.services.iotsitewise.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListAccessPoliciesRequest
 */
public class ListAccessPoliciesRequestMarshaller implements
        Marshaller<Request<ListAccessPoliciesRequest>, ListAccessPoliciesRequest> {

    public Request<ListAccessPoliciesRequest> marshall(
            ListAccessPoliciesRequest listAccessPoliciesRequest) {
        if (listAccessPoliciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListAccessPoliciesRequest)");
        }

        Request<ListAccessPoliciesRequest> request = new DefaultRequest<ListAccessPoliciesRequest>(
                listAccessPoliciesRequest, "AWSIoTSiteWise");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/access-policies";
        if (listAccessPoliciesRequest.getIdentityType() != null) {
            request.addParameter("identityType",
                    StringUtils.fromString(listAccessPoliciesRequest.getIdentityType()));
        }
        if (listAccessPoliciesRequest.getIdentityId() != null) {
            request.addParameter("identityId",
                    StringUtils.fromString(listAccessPoliciesRequest.getIdentityId()));
        }
        if (listAccessPoliciesRequest.getResourceType() != null) {
            request.addParameter("resourceType",
                    StringUtils.fromString(listAccessPoliciesRequest.getResourceType()));
        }
        if (listAccessPoliciesRequest.getResourceId() != null) {
            request.addParameter("resourceId",
                    StringUtils.fromString(listAccessPoliciesRequest.getResourceId()));
        }
        if (listAccessPoliciesRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listAccessPoliciesRequest.getNextToken()));
        }
        if (listAccessPoliciesRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listAccessPoliciesRequest.getMaxResults()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
