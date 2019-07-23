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

package com.amazonaws.services.comprehend.model.transform;

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
import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateEntityRecognizerRequest
 */
public class CreateEntityRecognizerRequestMarshaller implements
        Marshaller<Request<CreateEntityRecognizerRequest>, CreateEntityRecognizerRequest> {

    public Request<CreateEntityRecognizerRequest> marshall(
            CreateEntityRecognizerRequest createEntityRecognizerRequest) {
        if (createEntityRecognizerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateEntityRecognizerRequest)");
        }

        Request<CreateEntityRecognizerRequest> request = new DefaultRequest<CreateEntityRecognizerRequest>(
                createEntityRecognizerRequest, "AmazonComprehend");
        String target = "Comprehend_20171127.CreateEntityRecognizer";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createEntityRecognizerRequest.getRecognizerName() != null) {
                String recognizerName = createEntityRecognizerRequest.getRecognizerName();
                jsonWriter.name("RecognizerName");
                jsonWriter.value(recognizerName);
            }
            if (createEntityRecognizerRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = createEntityRecognizerRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (createEntityRecognizerRequest.getTags() != null) {
                java.util.List<Tag> tags = createEntityRecognizerRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createEntityRecognizerRequest.getInputDataConfig() != null) {
                EntityRecognizerInputDataConfig inputDataConfig = createEntityRecognizerRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                EntityRecognizerInputDataConfigJsonMarshaller.getInstance().marshall(
                        inputDataConfig, jsonWriter);
            }
            if (createEntityRecognizerRequest.getClientRequestToken() != null) {
                String clientRequestToken = createEntityRecognizerRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createEntityRecognizerRequest.getLanguageCode() != null) {
                String languageCode = createEntityRecognizerRequest.getLanguageCode();
                jsonWriter.name("LanguageCode");
                jsonWriter.value(languageCode);
            }
            if (createEntityRecognizerRequest.getVolumeKmsKeyId() != null) {
                String volumeKmsKeyId = createEntityRecognizerRequest.getVolumeKmsKeyId();
                jsonWriter.name("VolumeKmsKeyId");
                jsonWriter.value(volumeKmsKeyId);
            }
            if (createEntityRecognizerRequest.getVpcConfig() != null) {
                VpcConfig vpcConfig = createEntityRecognizerRequest.getVpcConfig();
                jsonWriter.name("VpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
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
