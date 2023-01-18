/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateRuleRequest
 */
public class CreateRuleRequestMarshaller implements
        Marshaller<Request<CreateRuleRequest>, CreateRuleRequest> {

    public Request<CreateRuleRequest> marshall(CreateRuleRequest createRuleRequest) {
        if (createRuleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateRuleRequest)");
        }

        Request<CreateRuleRequest> request = new DefaultRequest<CreateRuleRequest>(
                createRuleRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/rules/{InstanceId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (createRuleRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(createRuleRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createRuleRequest.getName() != null) {
                String name = createRuleRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createRuleRequest.getTriggerEventSource() != null) {
                RuleTriggerEventSource triggerEventSource = createRuleRequest
                        .getTriggerEventSource();
                jsonWriter.name("TriggerEventSource");
                RuleTriggerEventSourceJsonMarshaller.getInstance().marshall(triggerEventSource,
                        jsonWriter);
            }
            if (createRuleRequest.getFunction() != null) {
                String function = createRuleRequest.getFunction();
                jsonWriter.name("Function");
                jsonWriter.value(function);
            }
            if (createRuleRequest.getActions() != null) {
                java.util.List<RuleAction> actions = createRuleRequest.getActions();
                jsonWriter.name("Actions");
                jsonWriter.beginArray();
                for (RuleAction actionsItem : actions) {
                    if (actionsItem != null) {
                        RuleActionJsonMarshaller.getInstance().marshall(actionsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createRuleRequest.getPublishStatus() != null) {
                String publishStatus = createRuleRequest.getPublishStatus();
                jsonWriter.name("PublishStatus");
                jsonWriter.value(publishStatus);
            }
            if (createRuleRequest.getClientToken() != null) {
                String clientToken = createRuleRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
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
