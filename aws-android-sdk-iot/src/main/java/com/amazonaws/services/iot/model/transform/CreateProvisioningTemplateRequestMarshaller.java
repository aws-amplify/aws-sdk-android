/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateProvisioningTemplateRequest
 */
public class CreateProvisioningTemplateRequestMarshaller implements
        Marshaller<Request<CreateProvisioningTemplateRequest>, CreateProvisioningTemplateRequest> {

    public Request<CreateProvisioningTemplateRequest> marshall(
            CreateProvisioningTemplateRequest createProvisioningTemplateRequest) {
        if (createProvisioningTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateProvisioningTemplateRequest)");
        }

        Request<CreateProvisioningTemplateRequest> request = new DefaultRequest<CreateProvisioningTemplateRequest>(
                createProvisioningTemplateRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/provisioning-templates";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createProvisioningTemplateRequest.getTemplateName() != null) {
                String templateName = createProvisioningTemplateRequest.getTemplateName();
                jsonWriter.name("templateName");
                jsonWriter.value(templateName);
            }
            if (createProvisioningTemplateRequest.getDescription() != null) {
                String description = createProvisioningTemplateRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createProvisioningTemplateRequest.getTemplateBody() != null) {
                String templateBody = createProvisioningTemplateRequest.getTemplateBody();
                jsonWriter.name("templateBody");
                jsonWriter.value(templateBody);
            }
            if (createProvisioningTemplateRequest.getEnabled() != null) {
                Boolean enabled = createProvisioningTemplateRequest.getEnabled();
                jsonWriter.name("enabled");
                jsonWriter.value(enabled);
            }
            if (createProvisioningTemplateRequest.getProvisioningRoleArn() != null) {
                String provisioningRoleArn = createProvisioningTemplateRequest
                        .getProvisioningRoleArn();
                jsonWriter.name("provisioningRoleArn");
                jsonWriter.value(provisioningRoleArn);
            }
            if (createProvisioningTemplateRequest.getPreProvisioningHook() != null) {
                ProvisioningHook preProvisioningHook = createProvisioningTemplateRequest
                        .getPreProvisioningHook();
                jsonWriter.name("preProvisioningHook");
                ProvisioningHookJsonMarshaller.getInstance().marshall(preProvisioningHook,
                        jsonWriter);
            }
            if (createProvisioningTemplateRequest.getTags() != null) {
                java.util.List<Tag> tags = createProvisioningTemplateRequest.getTags();
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
