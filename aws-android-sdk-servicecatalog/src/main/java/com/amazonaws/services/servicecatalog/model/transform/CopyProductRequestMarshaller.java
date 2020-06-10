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

package com.amazonaws.services.servicecatalog.model.transform;

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
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CopyProductRequest
 */
public class CopyProductRequestMarshaller implements
        Marshaller<Request<CopyProductRequest>, CopyProductRequest> {

    public Request<CopyProductRequest> marshall(CopyProductRequest copyProductRequest) {
        if (copyProductRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopyProductRequest)");
        }

        Request<CopyProductRequest> request = new DefaultRequest<CopyProductRequest>(
                copyProductRequest, "AWSServiceCatalog");
        String target = "AWS242ServiceCatalogService.CopyProduct";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (copyProductRequest.getAcceptLanguage() != null) {
                String acceptLanguage = copyProductRequest.getAcceptLanguage();
                jsonWriter.name("AcceptLanguage");
                jsonWriter.value(acceptLanguage);
            }
            if (copyProductRequest.getSourceProductArn() != null) {
                String sourceProductArn = copyProductRequest.getSourceProductArn();
                jsonWriter.name("SourceProductArn");
                jsonWriter.value(sourceProductArn);
            }
            if (copyProductRequest.getTargetProductId() != null) {
                String targetProductId = copyProductRequest.getTargetProductId();
                jsonWriter.name("TargetProductId");
                jsonWriter.value(targetProductId);
            }
            if (copyProductRequest.getTargetProductName() != null) {
                String targetProductName = copyProductRequest.getTargetProductName();
                jsonWriter.name("TargetProductName");
                jsonWriter.value(targetProductName);
            }
            if (copyProductRequest.getSourceProvisioningArtifactIdentifiers() != null) {
                java.util.List<java.util.Map<String, String>> sourceProvisioningArtifactIdentifiers = copyProductRequest
                        .getSourceProvisioningArtifactIdentifiers();
                jsonWriter.name("SourceProvisioningArtifactIdentifiers");
                jsonWriter.beginArray();
                for (java.util.Map<String, String> sourceProvisioningArtifactIdentifiersItem : sourceProvisioningArtifactIdentifiers) {
                    if (sourceProvisioningArtifactIdentifiersItem != null) {
                        jsonWriter.beginObject();
                        for (java.util.Map.Entry<String, String> sourceProvisioningArtifactIdentifiersItemEntry : sourceProvisioningArtifactIdentifiersItem
                                .entrySet()) {
                            String sourceProvisioningArtifactIdentifiersItemValue = sourceProvisioningArtifactIdentifiersItemEntry
                                    .getValue();
                            if (sourceProvisioningArtifactIdentifiersItemValue != null) {
                                jsonWriter.name(sourceProvisioningArtifactIdentifiersItemEntry
                                        .getKey());
                                jsonWriter.value(sourceProvisioningArtifactIdentifiersItemValue);
                            }
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (copyProductRequest.getCopyOptions() != null) {
                java.util.List<String> copyOptions = copyProductRequest.getCopyOptions();
                jsonWriter.name("CopyOptions");
                jsonWriter.beginArray();
                for (String copyOptionsItem : copyOptions) {
                    if (copyOptionsItem != null) {
                        jsonWriter.value(copyOptionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (copyProductRequest.getIdempotencyToken() != null) {
                String idempotencyToken = copyProductRequest.getIdempotencyToken();
                jsonWriter.name("IdempotencyToken");
                jsonWriter.value(idempotencyToken);
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
