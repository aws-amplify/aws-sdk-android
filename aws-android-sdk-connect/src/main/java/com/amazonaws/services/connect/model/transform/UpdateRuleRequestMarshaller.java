/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for UpdateRuleRequest
 */
public class UpdateRuleRequestMarshaller implements
        Marshaller<Request<UpdateRuleRequest>, UpdateRuleRequest> {

    public Request<UpdateRuleRequest> marshall(UpdateRuleRequest updateRuleRequest) {
        if (updateRuleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateRuleRequest)");
        }

        Request<UpdateRuleRequest> request = new DefaultRequest<UpdateRuleRequest>(
                updateRuleRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/rules/{InstanceId}/{RuleId}";
        uriResourcePath = uriResourcePath.replace(
                "{RuleId}",
                (updateRuleRequest.getRuleId() == null) ? "" : StringUtils
                        .fromString(updateRuleRequest.getRuleId()));
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (updateRuleRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(updateRuleRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateRuleRequest.getName() != null) {
                String name = updateRuleRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateRuleRequest.getFunction() != null) {
                String function = updateRuleRequest.getFunction();
                jsonWriter.name("Function");
                jsonWriter.value(function);
            }
            if (updateRuleRequest.getActions() != null) {
                java.util.List<RuleAction> actions = updateRuleRequest.getActions();
                jsonWriter.name("Actions");
                jsonWriter.beginArray();
                for (RuleAction actionsItem : actions) {
                    if (actionsItem != null) {
                        RuleActionJsonMarshaller.getInstance().marshall(actionsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateRuleRequest.getPublishStatus() != null) {
                String publishStatus = updateRuleRequest.getPublishStatus();
                jsonWriter.name("PublishStatus");
                jsonWriter.value(publishStatus);
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
