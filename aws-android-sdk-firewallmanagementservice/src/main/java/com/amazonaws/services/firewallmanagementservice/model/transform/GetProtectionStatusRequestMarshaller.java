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

package com.amazonaws.services.firewallmanagementservice.model.transform;

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
import com.amazonaws.services.firewallmanagementservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetProtectionStatusRequest
 */
public class GetProtectionStatusRequestMarshaller implements
        Marshaller<Request<GetProtectionStatusRequest>, GetProtectionStatusRequest> {

    public Request<GetProtectionStatusRequest> marshall(
            GetProtectionStatusRequest getProtectionStatusRequest) {
        if (getProtectionStatusRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetProtectionStatusRequest)");
        }

        Request<GetProtectionStatusRequest> request = new DefaultRequest<GetProtectionStatusRequest>(
                getProtectionStatusRequest, "FirewallManagementService");
        String target = "AWSFMS_20180101.GetProtectionStatus";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getProtectionStatusRequest.getPolicyId() != null) {
                String policyId = getProtectionStatusRequest.getPolicyId();
                jsonWriter.name("PolicyId");
                jsonWriter.value(policyId);
            }
            if (getProtectionStatusRequest.getMemberAccountId() != null) {
                String memberAccountId = getProtectionStatusRequest.getMemberAccountId();
                jsonWriter.name("MemberAccountId");
                jsonWriter.value(memberAccountId);
            }
            if (getProtectionStatusRequest.getStartTime() != null) {
                java.util.Date startTime = getProtectionStatusRequest.getStartTime();
                jsonWriter.name("StartTime");
                jsonWriter.value(startTime);
            }
            if (getProtectionStatusRequest.getEndTime() != null) {
                java.util.Date endTime = getProtectionStatusRequest.getEndTime();
                jsonWriter.name("EndTime");
                jsonWriter.value(endTime);
            }
            if (getProtectionStatusRequest.getNextToken() != null) {
                String nextToken = getProtectionStatusRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getProtectionStatusRequest.getMaxResults() != null) {
                Integer maxResults = getProtectionStatusRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
