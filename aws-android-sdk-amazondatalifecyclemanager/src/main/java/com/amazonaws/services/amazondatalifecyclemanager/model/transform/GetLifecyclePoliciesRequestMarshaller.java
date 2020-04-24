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

package com.amazonaws.services.amazondatalifecyclemanager.model.transform;

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
import com.amazonaws.services.amazondatalifecyclemanager.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetLifecyclePoliciesRequest
 */
public class GetLifecyclePoliciesRequestMarshaller implements
        Marshaller<Request<GetLifecyclePoliciesRequest>, GetLifecyclePoliciesRequest> {

    public Request<GetLifecyclePoliciesRequest> marshall(
            GetLifecyclePoliciesRequest getLifecyclePoliciesRequest) {
        if (getLifecyclePoliciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetLifecyclePoliciesRequest)");
        }

        Request<GetLifecyclePoliciesRequest> request = new DefaultRequest<GetLifecyclePoliciesRequest>(
                getLifecyclePoliciesRequest, "AmazonDataLifecycleManager");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/policies";
        if (getLifecyclePoliciesRequest.getPolicyIds() != null) {
            request.addParameter(
                    "policyIds",
                    StringUtils.join(",",
                            getLifecyclePoliciesRequest.getPolicyIds().toArray(new String[0])));
        }
        if (getLifecyclePoliciesRequest.getState() != null) {
            request.addParameter("state",
                    StringUtils.fromString(getLifecyclePoliciesRequest.getState()));
        }
        if (getLifecyclePoliciesRequest.getResourceTypes() != null) {
            request.addParameter(
                    "resourceTypes",
                    StringUtils.join(",",
                            getLifecyclePoliciesRequest.getResourceTypes().toArray(new String[0])));
        }
        if (getLifecyclePoliciesRequest.getTargetTags() != null) {
            request.addParameter(
                    "targetTags",
                    StringUtils.join(",",
                            getLifecyclePoliciesRequest.getTargetTags().toArray(new String[0])));
        }
        if (getLifecyclePoliciesRequest.getTagsToAdd() != null) {
            request.addParameter(
                    "tagsToAdd",
                    StringUtils.join(",",
                            getLifecyclePoliciesRequest.getTagsToAdd().toArray(new String[0])));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
