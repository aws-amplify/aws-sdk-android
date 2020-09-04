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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

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
import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for SendAutomationSignalRequest
 */
public class SendAutomationSignalRequestMarshaller implements Marshaller<Request<SendAutomationSignalRequest>, SendAutomationSignalRequest> {

    public Request<SendAutomationSignalRequest> marshall(SendAutomationSignalRequest sendAutomationSignalRequest) {
        if (sendAutomationSignalRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(SendAutomationSignalRequest)");
        }

        Request<SendAutomationSignalRequest> request = new DefaultRequest<SendAutomationSignalRequest>(sendAutomationSignalRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.SendAutomationSignal";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (sendAutomationSignalRequest.getAutomationExecutionId() != null) {
                String automationExecutionId = sendAutomationSignalRequest.getAutomationExecutionId();
                jsonWriter.name("AutomationExecutionId");
            jsonWriter.value(automationExecutionId);
            }
            if (sendAutomationSignalRequest.getSignalType() != null) {
                String signalType = sendAutomationSignalRequest.getSignalType();
                jsonWriter.name("SignalType");
            jsonWriter.value(signalType);
            }
            if (sendAutomationSignalRequest.getPayload() != null) {
                java.util.Map<String, java.util.List<String>> payload = sendAutomationSignalRequest.getPayload();
                jsonWriter.name("Payload");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> payloadEntry : payload.entrySet()) {
                java.util.List<String> payloadValue = payloadEntry.getValue();
                if (payloadValue != null) {
                    jsonWriter.name(payloadEntry.getKey());
            jsonWriter.beginArray();
            for (String payloadValueItem : payloadValue) {
                if (payloadValueItem != null) {
            jsonWriter.value(payloadValueItem);
                    }
            }
            jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
