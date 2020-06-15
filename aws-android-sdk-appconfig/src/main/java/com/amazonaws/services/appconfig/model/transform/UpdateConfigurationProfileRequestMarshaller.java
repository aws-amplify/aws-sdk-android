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
 * JSON request marshaller for UpdateConfigurationProfileRequest
 */
public class UpdateConfigurationProfileRequestMarshaller implements
        Marshaller<Request<UpdateConfigurationProfileRequest>, UpdateConfigurationProfileRequest> {

    public Request<UpdateConfigurationProfileRequest> marshall(
            UpdateConfigurationProfileRequest updateConfigurationProfileRequest) {
        if (updateConfigurationProfileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateConfigurationProfileRequest)");
        }

        Request<UpdateConfigurationProfileRequest> request = new DefaultRequest<UpdateConfigurationProfileRequest>(
                updateConfigurationProfileRequest, "AmazonAppConfig");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/applications/{ApplicationId}/configurationprofiles/{ConfigurationProfileId}";
        uriResourcePath = uriResourcePath.replace(
                "{ApplicationId}",
                (updateConfigurationProfileRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(updateConfigurationProfileRequest.getApplicationId()));
        uriResourcePath = uriResourcePath.replace(
                "{ConfigurationProfileId}",
                (updateConfigurationProfileRequest.getConfigurationProfileId() == null) ? ""
                        : StringUtils.fromString(updateConfigurationProfileRequest
                                .getConfigurationProfileId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateConfigurationProfileRequest.getName() != null) {
                String name = updateConfigurationProfileRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateConfigurationProfileRequest.getDescription() != null) {
                String description = updateConfigurationProfileRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateConfigurationProfileRequest.getRetrievalRoleArn() != null) {
                String retrievalRoleArn = updateConfigurationProfileRequest.getRetrievalRoleArn();
                jsonWriter.name("RetrievalRoleArn");
                jsonWriter.value(retrievalRoleArn);
            }
            if (updateConfigurationProfileRequest.getValidators() != null) {
                java.util.List<Validator> validators = updateConfigurationProfileRequest
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
