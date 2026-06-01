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

package com.amazonaws.services.textract.model.transform;

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
import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateAdapterVersionRequest
 */
public class CreateAdapterVersionRequestMarshaller implements
        Marshaller<Request<CreateAdapterVersionRequest>, CreateAdapterVersionRequest> {

    public Request<CreateAdapterVersionRequest> marshall(
            CreateAdapterVersionRequest createAdapterVersionRequest) {
        if (createAdapterVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateAdapterVersionRequest)");
        }

        Request<CreateAdapterVersionRequest> request = new DefaultRequest<CreateAdapterVersionRequest>(
                createAdapterVersionRequest, "AmazonTextract");
        String target = "Textract.CreateAdapterVersion";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createAdapterVersionRequest.getAdapterId() != null) {
                String adapterId = createAdapterVersionRequest.getAdapterId();
                jsonWriter.name("AdapterId");
                jsonWriter.value(adapterId);
            }
            if (createAdapterVersionRequest.getClientRequestToken() != null) {
                String clientRequestToken = createAdapterVersionRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createAdapterVersionRequest.getDatasetConfig() != null) {
                AdapterVersionDatasetConfig datasetConfig = createAdapterVersionRequest
                        .getDatasetConfig();
                jsonWriter.name("DatasetConfig");
                AdapterVersionDatasetConfigJsonMarshaller.getInstance().marshall(datasetConfig,
                        jsonWriter);
            }
            if (createAdapterVersionRequest.getKMSKeyId() != null) {
                String kMSKeyId = createAdapterVersionRequest.getKMSKeyId();
                jsonWriter.name("KMSKeyId");
                jsonWriter.value(kMSKeyId);
            }
            if (createAdapterVersionRequest.getOutputConfig() != null) {
                OutputConfig outputConfig = createAdapterVersionRequest.getOutputConfig();
                jsonWriter.name("OutputConfig");
                OutputConfigJsonMarshaller.getInstance().marshall(outputConfig, jsonWriter);
            }
            if (createAdapterVersionRequest.getTags() != null) {
                java.util.Map<String, String> tags = createAdapterVersionRequest.getTags();
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
