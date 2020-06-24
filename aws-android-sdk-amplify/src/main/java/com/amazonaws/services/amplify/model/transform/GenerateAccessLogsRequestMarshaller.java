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

package com.amazonaws.services.amplify.model.transform;

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
import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GenerateAccessLogsRequest
 */
public class GenerateAccessLogsRequestMarshaller implements
        Marshaller<Request<GenerateAccessLogsRequest>, GenerateAccessLogsRequest> {

    public Request<GenerateAccessLogsRequest> marshall(
            GenerateAccessLogsRequest generateAccessLogsRequest) {
        if (generateAccessLogsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GenerateAccessLogsRequest)");
        }

        Request<GenerateAccessLogsRequest> request = new DefaultRequest<GenerateAccessLogsRequest>(
                generateAccessLogsRequest, "AWSAmplify");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apps/{appId}/accesslogs";
        uriResourcePath = uriResourcePath.replace(
                "{appId}",
                (generateAccessLogsRequest.getAppId() == null) ? "" : StringUtils
                        .fromString(generateAccessLogsRequest.getAppId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (generateAccessLogsRequest.getStartTime() != null) {
                java.util.Date startTime = generateAccessLogsRequest.getStartTime();
                jsonWriter.name("startTime");
                jsonWriter.value(startTime);
            }
            if (generateAccessLogsRequest.getEndTime() != null) {
                java.util.Date endTime = generateAccessLogsRequest.getEndTime();
                jsonWriter.name("endTime");
                jsonWriter.value(endTime);
            }
            if (generateAccessLogsRequest.getDomainName() != null) {
                String domainName = generateAccessLogsRequest.getDomainName();
                jsonWriter.name("domainName");
                jsonWriter.value(domainName);
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
