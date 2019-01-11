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

package com.amazonaws.services.translate.model.transform;

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
import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ImportTerminologyRequest
 */
public class ImportTerminologyRequestMarshaller implements
        Marshaller<Request<ImportTerminologyRequest>, ImportTerminologyRequest> {

    public Request<ImportTerminologyRequest> marshall(
            ImportTerminologyRequest importTerminologyRequest) {
        if (importTerminologyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ImportTerminologyRequest)");
        }

        Request<ImportTerminologyRequest> request = new DefaultRequest<ImportTerminologyRequest>(
                importTerminologyRequest, "AmazonTranslate");
        String target = "AWSShineFrontendService_20170701.ImportTerminology";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (importTerminologyRequest.getName() != null) {
                String name = importTerminologyRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (importTerminologyRequest.getMergeStrategy() != null) {
                String mergeStrategy = importTerminologyRequest.getMergeStrategy();
                jsonWriter.name("MergeStrategy");
                jsonWriter.value(mergeStrategy);
            }
            if (importTerminologyRequest.getDescription() != null) {
                String description = importTerminologyRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (importTerminologyRequest.getTerminologyData() != null) {
                TerminologyData terminologyData = importTerminologyRequest.getTerminologyData();
                jsonWriter.name("TerminologyData");
                TerminologyDataJsonMarshaller.getInstance().marshall(terminologyData, jsonWriter);
            }
            if (importTerminologyRequest.getEncryptionKey() != null) {
                EncryptionKey encryptionKey = importTerminologyRequest.getEncryptionKey();
                jsonWriter.name("EncryptionKey");
                EncryptionKeyJsonMarshaller.getInstance().marshall(encryptionKey, jsonWriter);
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
