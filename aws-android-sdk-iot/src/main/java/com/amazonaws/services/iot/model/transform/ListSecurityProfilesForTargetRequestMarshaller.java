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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListSecurityProfilesForTargetRequest
 */
public class ListSecurityProfilesForTargetRequestMarshaller
        implements
        Marshaller<Request<ListSecurityProfilesForTargetRequest>, ListSecurityProfilesForTargetRequest> {

    public Request<ListSecurityProfilesForTargetRequest> marshall(
            ListSecurityProfilesForTargetRequest listSecurityProfilesForTargetRequest) {
        if (listSecurityProfilesForTargetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListSecurityProfilesForTargetRequest)");
        }

        Request<ListSecurityProfilesForTargetRequest> request = new DefaultRequest<ListSecurityProfilesForTargetRequest>(
                listSecurityProfilesForTargetRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/security-profiles-for-target";
        if (listSecurityProfilesForTargetRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listSecurityProfilesForTargetRequest.getNextToken()));
        }
        if (listSecurityProfilesForTargetRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listSecurityProfilesForTargetRequest.getMaxResults()));
        }
        if (listSecurityProfilesForTargetRequest.getRecursive() != null) {
            request.addParameter("recursive",
                    StringUtils.fromBoolean(listSecurityProfilesForTargetRequest.getRecursive()));
        }
        if (listSecurityProfilesForTargetRequest.getSecurityProfileTargetArn() != null) {
            request.addParameter("securityProfileTargetArn", StringUtils
                    .fromString(listSecurityProfilesForTargetRequest.getSecurityProfileTargetArn()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
