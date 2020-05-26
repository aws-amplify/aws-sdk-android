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

package com.amazonaws.services.quicksight.model.transform;

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
import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListUserGroupsRequest
 */
public class ListUserGroupsRequestMarshaller implements
        Marshaller<Request<ListUserGroupsRequest>, ListUserGroupsRequest> {

    public Request<ListUserGroupsRequest> marshall(ListUserGroupsRequest listUserGroupsRequest) {
        if (listUserGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListUserGroupsRequest)");
        }

        Request<ListUserGroupsRequest> request = new DefaultRequest<ListUserGroupsRequest>(
                listUserGroupsRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/accounts/{AwsAccountId}/namespaces/{Namespace}/users/{UserName}/groups";
        uriResourcePath = uriResourcePath.replace(
                "{UserName}",
                (listUserGroupsRequest.getUserName() == null) ? "" : StringUtils
                        .fromString(listUserGroupsRequest.getUserName()));
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (listUserGroupsRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(listUserGroupsRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{Namespace}",
                (listUserGroupsRequest.getNamespace() == null) ? "" : StringUtils
                        .fromString(listUserGroupsRequest.getNamespace()));
        if (listUserGroupsRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(listUserGroupsRequest.getNextToken()));
        }
        if (listUserGroupsRequest.getMaxResults() != null) {
            request.addParameter("max-results",
                    StringUtils.fromInteger(listUserGroupsRequest.getMaxResults()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
