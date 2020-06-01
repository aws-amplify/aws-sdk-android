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

package com.amazonaws.services.api.sagemaker.model.transform;

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
import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateEndpointConfigRequest
 */
public class CreateEndpointConfigRequestMarshaller implements
        Marshaller<Request<CreateEndpointConfigRequest>, CreateEndpointConfigRequest> {

    public Request<CreateEndpointConfigRequest> marshall(
            CreateEndpointConfigRequest createEndpointConfigRequest) {
        if (createEndpointConfigRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateEndpointConfigRequest)");
        }

        Request<CreateEndpointConfigRequest> request = new DefaultRequest<CreateEndpointConfigRequest>(
                createEndpointConfigRequest, "AmazonSageMakerService");
        String target = "SageMaker.CreateEndpointConfig";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createEndpointConfigRequest.getEndpointConfigName() != null) {
                String endpointConfigName = createEndpointConfigRequest.getEndpointConfigName();
                jsonWriter.name("EndpointConfigName");
                jsonWriter.value(endpointConfigName);
            }
            if (createEndpointConfigRequest.getProductionVariants() != null) {
                java.util.List<ProductionVariant> productionVariants = createEndpointConfigRequest
                        .getProductionVariants();
                jsonWriter.name("ProductionVariants");
                jsonWriter.beginArray();
                for (ProductionVariant productionVariantsItem : productionVariants) {
                    if (productionVariantsItem != null) {
                        ProductionVariantJsonMarshaller.getInstance().marshall(
                                productionVariantsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createEndpointConfigRequest.getDataCaptureConfig() != null) {
                DataCaptureConfig dataCaptureConfig = createEndpointConfigRequest
                        .getDataCaptureConfig();
                jsonWriter.name("DataCaptureConfig");
                DataCaptureConfigJsonMarshaller.getInstance().marshall(dataCaptureConfig,
                        jsonWriter);
            }
            if (createEndpointConfigRequest.getTags() != null) {
                java.util.List<Tag> tags = createEndpointConfigRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createEndpointConfigRequest.getKmsKeyId() != null) {
                String kmsKeyId = createEndpointConfigRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
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
