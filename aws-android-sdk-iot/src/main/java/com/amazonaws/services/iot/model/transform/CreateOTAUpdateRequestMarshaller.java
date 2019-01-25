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
 * JSON request marshaller for CreateOTAUpdateRequest
 */
public class CreateOTAUpdateRequestMarshaller implements
        Marshaller<Request<CreateOTAUpdateRequest>, CreateOTAUpdateRequest> {

    public Request<CreateOTAUpdateRequest> marshall(CreateOTAUpdateRequest createOTAUpdateRequest) {
        if (createOTAUpdateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateOTAUpdateRequest)");
        }

        Request<CreateOTAUpdateRequest> request = new DefaultRequest<CreateOTAUpdateRequest>(
                createOTAUpdateRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/otaUpdates/{otaUpdateId}";
        uriResourcePath = uriResourcePath.replace(
                "{otaUpdateId}",
                (createOTAUpdateRequest.getOtaUpdateId() == null) ? "" : StringUtils
                        .fromString(createOTAUpdateRequest.getOtaUpdateId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createOTAUpdateRequest.getDescription() != null) {
                String description = createOTAUpdateRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createOTAUpdateRequest.getTargets() != null) {
                java.util.List<String> targets = createOTAUpdateRequest.getTargets();
                jsonWriter.name("targets");
                jsonWriter.beginArray();
                for (String targetsItem : targets) {
                    if (targetsItem != null) {
                        jsonWriter.value(targetsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createOTAUpdateRequest.getTargetSelection() != null) {
                String targetSelection = createOTAUpdateRequest.getTargetSelection();
                jsonWriter.name("targetSelection");
                jsonWriter.value(targetSelection);
            }
            if (createOTAUpdateRequest.getAwsJobExecutionsRolloutConfig() != null) {
                AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig = createOTAUpdateRequest
                        .getAwsJobExecutionsRolloutConfig();
                jsonWriter.name("awsJobExecutionsRolloutConfig");
                AwsJobExecutionsRolloutConfigJsonMarshaller.getInstance().marshall(
                        awsJobExecutionsRolloutConfig, jsonWriter);
            }
            if (createOTAUpdateRequest.getFiles() != null) {
                java.util.List<OTAUpdateFile> files = createOTAUpdateRequest.getFiles();
                jsonWriter.name("files");
                jsonWriter.beginArray();
                for (OTAUpdateFile filesItem : files) {
                    if (filesItem != null) {
                        OTAUpdateFileJsonMarshaller.getInstance().marshall(filesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createOTAUpdateRequest.getRoleArn() != null) {
                String roleArn = createOTAUpdateRequest.getRoleArn();
                jsonWriter.name("roleArn");
                jsonWriter.value(roleArn);
            }
            if (createOTAUpdateRequest.getAdditionalParameters() != null) {
                java.util.Map<String, String> additionalParameters = createOTAUpdateRequest
                        .getAdditionalParameters();
                jsonWriter.name("additionalParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> additionalParametersEntry : additionalParameters
                        .entrySet()) {
                    String additionalParametersValue = additionalParametersEntry.getValue();
                    if (additionalParametersValue != null) {
                        jsonWriter.name(additionalParametersEntry.getKey());
                        jsonWriter.value(additionalParametersValue);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
