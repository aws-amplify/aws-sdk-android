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
 * JSON request marshaller for SetV2LoggingOptionsRequest
 */
public class SetV2LoggingOptionsRequestMarshaller implements
        Marshaller<Request<SetV2LoggingOptionsRequest>, SetV2LoggingOptionsRequest> {

    public Request<SetV2LoggingOptionsRequest> marshall(
            SetV2LoggingOptionsRequest setV2LoggingOptionsRequest) {
        if (setV2LoggingOptionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetV2LoggingOptionsRequest)");
        }

        Request<SetV2LoggingOptionsRequest> request = new DefaultRequest<SetV2LoggingOptionsRequest>(
                setV2LoggingOptionsRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v2LoggingOptions";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (setV2LoggingOptionsRequest.getRoleArn() != null) {
                String roleArn = setV2LoggingOptionsRequest.getRoleArn();
                jsonWriter.name("roleArn");
                jsonWriter.value(roleArn);
            }
            if (setV2LoggingOptionsRequest.getDefaultLogLevel() != null) {
                String defaultLogLevel = setV2LoggingOptionsRequest.getDefaultLogLevel();
                jsonWriter.name("defaultLogLevel");
                jsonWriter.value(defaultLogLevel);
            }
            if (setV2LoggingOptionsRequest.getDisableAllLogs() != null) {
                Boolean disableAllLogs = setV2LoggingOptionsRequest.getDisableAllLogs();
                jsonWriter.name("disableAllLogs");
                jsonWriter.value(disableAllLogs);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
