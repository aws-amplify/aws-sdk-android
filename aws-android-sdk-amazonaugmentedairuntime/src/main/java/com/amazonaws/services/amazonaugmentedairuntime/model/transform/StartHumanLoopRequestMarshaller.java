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

package com.amazonaws.services.amazonaugmentedairuntime.model.transform;

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
import com.amazonaws.services.amazonaugmentedairuntime.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartHumanLoopRequest
 */
public class StartHumanLoopRequestMarshaller implements
        Marshaller<Request<StartHumanLoopRequest>, StartHumanLoopRequest> {

    public Request<StartHumanLoopRequest> marshall(StartHumanLoopRequest startHumanLoopRequest) {
        if (startHumanLoopRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartHumanLoopRequest)");
        }

        Request<StartHumanLoopRequest> request = new DefaultRequest<StartHumanLoopRequest>(
                startHumanLoopRequest, "AmazonAugmentedAIRuntime");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/human-loops";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startHumanLoopRequest.getHumanLoopName() != null) {
                String humanLoopName = startHumanLoopRequest.getHumanLoopName();
                jsonWriter.name("HumanLoopName");
                jsonWriter.value(humanLoopName);
            }
            if (startHumanLoopRequest.getFlowDefinitionArn() != null) {
                String flowDefinitionArn = startHumanLoopRequest.getFlowDefinitionArn();
                jsonWriter.name("FlowDefinitionArn");
                jsonWriter.value(flowDefinitionArn);
            }
            if (startHumanLoopRequest.getHumanLoopInput() != null) {
                HumanLoopInput humanLoopInput = startHumanLoopRequest.getHumanLoopInput();
                jsonWriter.name("HumanLoopInput");
                HumanLoopInputJsonMarshaller.getInstance().marshall(humanLoopInput, jsonWriter);
            }
            if (startHumanLoopRequest.getDataAttributes() != null) {
                HumanLoopDataAttributes dataAttributes = startHumanLoopRequest.getDataAttributes();
                jsonWriter.name("DataAttributes");
                HumanLoopDataAttributesJsonMarshaller.getInstance().marshall(dataAttributes,
                        jsonWriter);
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
