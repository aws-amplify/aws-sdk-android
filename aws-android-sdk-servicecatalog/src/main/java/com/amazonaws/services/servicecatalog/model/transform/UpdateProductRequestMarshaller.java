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
 * JSON request marshaller for UpdateProductRequest
 */
public class UpdateProductRequestMarshaller implements
        Marshaller<Request<UpdateProductRequest>, UpdateProductRequest> {

    public Request<UpdateProductRequest> marshall(UpdateProductRequest updateProductRequest) {
        if (updateProductRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateProductRequest)");
        }

        Request<UpdateProductRequest> request = new DefaultRequest<UpdateProductRequest>(
                updateProductRequest, "AWSServiceCatalog");
        String target = "AWS242ServiceCatalogService.UpdateProduct";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateProductRequest.getAcceptLanguage() != null) {
                String acceptLanguage = updateProductRequest.getAcceptLanguage();
                jsonWriter.name("AcceptLanguage");
                jsonWriter.value(acceptLanguage);
            }
            if (updateProductRequest.getId() != null) {
                String id = updateProductRequest.getId();
                jsonWriter.name("Id");
                jsonWriter.value(id);
            }
            if (updateProductRequest.getName() != null) {
                String name = updateProductRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateProductRequest.getOwner() != null) {
                String owner = updateProductRequest.getOwner();
                jsonWriter.name("Owner");
                jsonWriter.value(owner);
            }
            if (updateProductRequest.getDescription() != null) {
                String description = updateProductRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateProductRequest.getDistributor() != null) {
                String distributor = updateProductRequest.getDistributor();
                jsonWriter.name("Distributor");
                jsonWriter.value(distributor);
            }
            if (updateProductRequest.getSupportDescription() != null) {
                String supportDescription = updateProductRequest.getSupportDescription();
                jsonWriter.name("SupportDescription");
                jsonWriter.value(supportDescription);
            }
            if (updateProductRequest.getSupportEmail() != null) {
                String supportEmail = updateProductRequest.getSupportEmail();
                jsonWriter.name("SupportEmail");
                jsonWriter.value(supportEmail);
            }
            if (updateProductRequest.getSupportUrl() != null) {
                String supportUrl = updateProductRequest.getSupportUrl();
                jsonWriter.name("SupportUrl");
                jsonWriter.value(supportUrl);
            }
            if (updateProductRequest.getAddTags() != null) {
                java.util.List<Tag> addTags = updateProductRequest.getAddTags();
                jsonWriter.name("AddTags");
                jsonWriter.beginArray();
                for (Tag addTagsItem : addTags) {
                    if (addTagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(addTagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateProductRequest.getRemoveTags() != null) {
                java.util.List<String> removeTags = updateProductRequest.getRemoveTags();
                jsonWriter.name("RemoveTags");
                jsonWriter.beginArray();
                for (String removeTagsItem : removeTags) {
                    if (removeTagsItem != null) {
                        jsonWriter.value(removeTagsItem);
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
