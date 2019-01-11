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
 * JSON request marshaller for CreateDocumentClassifierRequest
 */
public class CreateDocumentClassifierRequestMarshaller implements
        Marshaller<Request<CreateDocumentClassifierRequest>, CreateDocumentClassifierRequest> {

    public Request<CreateDocumentClassifierRequest> marshall(
            CreateDocumentClassifierRequest createDocumentClassifierRequest) {
        if (createDocumentClassifierRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDocumentClassifierRequest)");
        }

        Request<CreateDocumentClassifierRequest> request = new DefaultRequest<CreateDocumentClassifierRequest>(
                createDocumentClassifierRequest, "AmazonComprehend");
        String target = "Comprehend_20171127.CreateDocumentClassifier";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDocumentClassifierRequest.getDocumentClassifierName() != null) {
                String documentClassifierName = createDocumentClassifierRequest
                        .getDocumentClassifierName();
                jsonWriter.name("DocumentClassifierName");
                jsonWriter.value(documentClassifierName);
            }
            if (createDocumentClassifierRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = createDocumentClassifierRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (createDocumentClassifierRequest.getInputDataConfig() != null) {
                DocumentClassifierInputDataConfig inputDataConfig = createDocumentClassifierRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                DocumentClassifierInputDataConfigJsonMarshaller.getInstance().marshall(
                        inputDataConfig, jsonWriter);
            }
            if (createDocumentClassifierRequest.getClientRequestToken() != null) {
                String clientRequestToken = createDocumentClassifierRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createDocumentClassifierRequest.getLanguageCode() != null) {
                String languageCode = createDocumentClassifierRequest.getLanguageCode();
                jsonWriter.name("LanguageCode");
                jsonWriter.value(languageCode);
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
