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
 * JSON request marshaller for CreateSecurityProfileRequest
 */
public class CreateSecurityProfileRequestMarshaller implements
        Marshaller<Request<CreateSecurityProfileRequest>, CreateSecurityProfileRequest> {

    public Request<CreateSecurityProfileRequest> marshall(
            CreateSecurityProfileRequest createSecurityProfileRequest) {
        if (createSecurityProfileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateSecurityProfileRequest)");
        }

        Request<CreateSecurityProfileRequest> request = new DefaultRequest<CreateSecurityProfileRequest>(
                createSecurityProfileRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/security-profiles/{securityProfileName}";
        uriResourcePath = uriResourcePath.replace(
                "{securityProfileName}",
                (createSecurityProfileRequest.getSecurityProfileName() == null) ? "" : StringUtils
                        .fromString(createSecurityProfileRequest.getSecurityProfileName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createSecurityProfileRequest.getSecurityProfileDescription() != null) {
                String securityProfileDescription = createSecurityProfileRequest
                        .getSecurityProfileDescription();
                jsonWriter.name("securityProfileDescription");
                jsonWriter.value(securityProfileDescription);
            }
            if (createSecurityProfileRequest.getBehaviors() != null) {
                java.util.List<Behavior> behaviors = createSecurityProfileRequest.getBehaviors();
                jsonWriter.name("behaviors");
                jsonWriter.beginArray();
                for (Behavior behaviorsItem : behaviors) {
                    if (behaviorsItem != null) {
                        BehaviorJsonMarshaller.getInstance().marshall(behaviorsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createSecurityProfileRequest.getAlertTargets() != null) {
                java.util.Map<String, AlertTarget> alertTargets = createSecurityProfileRequest
                        .getAlertTargets();
                jsonWriter.name("alertTargets");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, AlertTarget> alertTargetsEntry : alertTargets
                        .entrySet()) {
                    AlertTarget alertTargetsValue = alertTargetsEntry.getValue();
                    if (alertTargetsValue != null) {
                        jsonWriter.name(alertTargetsEntry.getKey());
                        AlertTargetJsonMarshaller.getInstance().marshall(alertTargetsValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (createSecurityProfileRequest.getTags() != null) {
                java.util.List<Tag> tags = createSecurityProfileRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
