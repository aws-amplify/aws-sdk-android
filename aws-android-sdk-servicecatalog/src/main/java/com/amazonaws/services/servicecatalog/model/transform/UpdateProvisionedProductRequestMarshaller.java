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
 * JSON request marshaller for UpdateProvisionedProductRequest
 */
public class UpdateProvisionedProductRequestMarshaller implements
        Marshaller<Request<UpdateProvisionedProductRequest>, UpdateProvisionedProductRequest> {

    public Request<UpdateProvisionedProductRequest> marshall(
            UpdateProvisionedProductRequest updateProvisionedProductRequest) {
        if (updateProvisionedProductRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateProvisionedProductRequest)");
        }

        Request<UpdateProvisionedProductRequest> request = new DefaultRequest<UpdateProvisionedProductRequest>(
                updateProvisionedProductRequest, "AWSServiceCatalog");
        String target = "AWS242ServiceCatalogService.UpdateProvisionedProduct";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateProvisionedProductRequest.getAcceptLanguage() != null) {
                String acceptLanguage = updateProvisionedProductRequest.getAcceptLanguage();
                jsonWriter.name("AcceptLanguage");
                jsonWriter.value(acceptLanguage);
            }
            if (updateProvisionedProductRequest.getProvisionedProductName() != null) {
                String provisionedProductName = updateProvisionedProductRequest
                        .getProvisionedProductName();
                jsonWriter.name("ProvisionedProductName");
                jsonWriter.value(provisionedProductName);
            }
            if (updateProvisionedProductRequest.getProvisionedProductId() != null) {
                String provisionedProductId = updateProvisionedProductRequest
                        .getProvisionedProductId();
                jsonWriter.name("ProvisionedProductId");
                jsonWriter.value(provisionedProductId);
            }
            if (updateProvisionedProductRequest.getProductId() != null) {
                String productId = updateProvisionedProductRequest.getProductId();
                jsonWriter.name("ProductId");
                jsonWriter.value(productId);
            }
            if (updateProvisionedProductRequest.getProvisioningArtifactId() != null) {
                String provisioningArtifactId = updateProvisionedProductRequest
                        .getProvisioningArtifactId();
                jsonWriter.name("ProvisioningArtifactId");
                jsonWriter.value(provisioningArtifactId);
            }
            if (updateProvisionedProductRequest.getPathId() != null) {
                String pathId = updateProvisionedProductRequest.getPathId();
                jsonWriter.name("PathId");
                jsonWriter.value(pathId);
            }
            if (updateProvisionedProductRequest.getProvisioningParameters() != null) {
                java.util.List<UpdateProvisioningParameter> provisioningParameters = updateProvisionedProductRequest
                        .getProvisioningParameters();
                jsonWriter.name("ProvisioningParameters");
                jsonWriter.beginArray();
                for (UpdateProvisioningParameter provisioningParametersItem : provisioningParameters) {
                    if (provisioningParametersItem != null) {
                        UpdateProvisioningParameterJsonMarshaller.getInstance().marshall(
                                provisioningParametersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateProvisionedProductRequest.getProvisioningPreferences() != null) {
                UpdateProvisioningPreferences provisioningPreferences = updateProvisionedProductRequest
                        .getProvisioningPreferences();
                jsonWriter.name("ProvisioningPreferences");
                UpdateProvisioningPreferencesJsonMarshaller.getInstance().marshall(
                        provisioningPreferences, jsonWriter);
            }
            if (updateProvisionedProductRequest.getTags() != null) {
                java.util.List<Tag> tags = updateProvisionedProductRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateProvisionedProductRequest.getUpdateToken() != null) {
                String updateToken = updateProvisionedProductRequest.getUpdateToken();
                jsonWriter.name("UpdateToken");
                jsonWriter.value(updateToken);
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
