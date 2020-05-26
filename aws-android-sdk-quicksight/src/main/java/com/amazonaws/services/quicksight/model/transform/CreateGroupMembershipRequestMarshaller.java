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
 * JSON request marshaller for CreateGroupMembershipRequest
 */
public class CreateGroupMembershipRequestMarshaller implements
        Marshaller<Request<CreateGroupMembershipRequest>, CreateGroupMembershipRequest> {

    public Request<CreateGroupMembershipRequest> marshall(
            CreateGroupMembershipRequest createGroupMembershipRequest) {
        if (createGroupMembershipRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateGroupMembershipRequest)");
        }

        Request<CreateGroupMembershipRequest> request = new DefaultRequest<CreateGroupMembershipRequest>(
                createGroupMembershipRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/accounts/{AwsAccountId}/namespaces/{Namespace}/groups/{GroupName}/members/{MemberName}";
        uriResourcePath = uriResourcePath.replace(
                "{MemberName}",
                (createGroupMembershipRequest.getMemberName() == null) ? "" : StringUtils
                        .fromString(createGroupMembershipRequest.getMemberName()));
        uriResourcePath = uriResourcePath.replace(
                "{GroupName}",
                (createGroupMembershipRequest.getGroupName() == null) ? "" : StringUtils
                        .fromString(createGroupMembershipRequest.getGroupName()));
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (createGroupMembershipRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(createGroupMembershipRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{Namespace}",
                (createGroupMembershipRequest.getNamespace() == null) ? "" : StringUtils
                        .fromString(createGroupMembershipRequest.getNamespace()));
        request.setResourcePath(uriResourcePath);
        request.addHeader("Content-Length", "0");
        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
