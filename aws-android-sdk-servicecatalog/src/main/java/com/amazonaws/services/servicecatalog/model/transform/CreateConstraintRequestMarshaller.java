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
 * JSON request marshaller for CreateConstraintRequest
 */
public class CreateConstraintRequestMarshaller implements
        Marshaller<Request<CreateConstraintRequest>, CreateConstraintRequest> {

    public Request<CreateConstraintRequest> marshall(CreateConstraintRequest createConstraintRequest) {
        if (createConstraintRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateConstraintRequest)");
        }

        Request<CreateConstraintRequest> request = new DefaultRequest<CreateConstraintRequest>(
                createConstraintRequest, "AWSServiceCatalog");
        String target = "AWS242ServiceCatalogService.CreateConstraint";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createConstraintRequest.getAcceptLanguage() != null) {
                String acceptLanguage = createConstraintRequest.getAcceptLanguage();
                jsonWriter.name("AcceptLanguage");
                jsonWriter.value(acceptLanguage);
            }
            if (createConstraintRequest.getPortfolioId() != null) {
                String portfolioId = createConstraintRequest.getPortfolioId();
                jsonWriter.name("PortfolioId");
                jsonWriter.value(portfolioId);
            }
            if (createConstraintRequest.getProductId() != null) {
                String productId = createConstraintRequest.getProductId();
                jsonWriter.name("ProductId");
                jsonWriter.value(productId);
            }
            if (createConstraintRequest.getParameters() != null) {
                String parameters = createConstraintRequest.getParameters();
                jsonWriter.name("Parameters");
                jsonWriter.value(parameters);
            }
            if (createConstraintRequest.getType() != null) {
                String type = createConstraintRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (createConstraintRequest.getDescription() != null) {
                String description = createConstraintRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createConstraintRequest.getIdempotencyToken() != null) {
                String idempotencyToken = createConstraintRequest.getIdempotencyToken();
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
