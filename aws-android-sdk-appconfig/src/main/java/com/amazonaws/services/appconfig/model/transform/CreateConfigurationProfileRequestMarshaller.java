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

package com.amazonaws.services.appconfig.model.transform;

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
import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateConfigurationProfileRequest
 */
public class CreateConfigurationProfileRequestMarshaller implements
        Marshaller<Request<CreateConfigurationProfileRequest>, CreateConfigurationProfileRequest> {

    public Request<CreateConfigurationProfileRequest> marshall(
            CreateConfigurationProfileRequest createConfigurationProfileRequest) {
        if (createConfigurationProfileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateConfigurationProfileRequest)");
        }

        Request<CreateConfigurationProfileRequest> request = new DefaultRequest<CreateConfigurationProfileRequest>(
                createConfigurationProfileRequest, "AmazonAppConfig");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/applications/{ApplicationId}/configurationprofiles";
        uriResourcePath = uriResourcePath.replace(
                "{ApplicationId}",
                (createConfigurationProfileRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(createConfigurationProfileRequest.getApplicationId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createConfigurationProfileRequest.getName() != null) {
                String name = createConfigurationProfileRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createConfigurationProfileRequest.getDescription() != null) {
                String description = createConfigurationProfileRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createConfigurationProfileRequest.getLocationUri() != null) {
                String locationUri = createConfigurationProfileRequest.getLocationUri();
                jsonWriter.name("LocationUri");
                jsonWriter.value(locationUri);
            }
            if (createConfigurationProfileRequest.getRetrievalRoleArn() != null) {
                String retrievalRoleArn = createConfigurationProfileRequest.getRetrievalRoleArn();
                jsonWriter.name("RetrievalRoleArn");
                jsonWriter.value(retrievalRoleArn);
            }
            if (createConfigurationProfileRequest.getValidators() != null) {
                java.util.List<Validator> validators = createConfigurationProfileRequest
                        .getValidators();
                jsonWriter.name("Validators");
                jsonWriter.beginArray();
                for (Validator validatorsItem : validators) {
                    if (validatorsItem != null) {
                        ValidatorJsonMarshaller.getInstance().marshall(validatorsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createConfigurationProfileRequest.getTags() != null) {
                java.util.Map<String, String> tags = createConfigurationProfileRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
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
