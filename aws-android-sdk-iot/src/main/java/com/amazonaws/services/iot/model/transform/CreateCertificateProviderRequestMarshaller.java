/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateCertificateProviderRequest
 */
public class CreateCertificateProviderRequestMarshaller implements
        Marshaller<Request<CreateCertificateProviderRequest>, CreateCertificateProviderRequest> {

    public Request<CreateCertificateProviderRequest> marshall(
            CreateCertificateProviderRequest createCertificateProviderRequest) {
        if (createCertificateProviderRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCertificateProviderRequest)");
        }

        Request<CreateCertificateProviderRequest> request = new DefaultRequest<CreateCertificateProviderRequest>(
                createCertificateProviderRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/certificate-providers/{certificateProviderName}";
        uriResourcePath = uriResourcePath.replace(
                "{certificateProviderName}",
                (createCertificateProviderRequest.getCertificateProviderName() == null) ? ""
                        : StringUtils.fromString(createCertificateProviderRequest
                                .getCertificateProviderName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createCertificateProviderRequest.getLambdaFunctionArn() != null) {
                String lambdaFunctionArn = createCertificateProviderRequest.getLambdaFunctionArn();
                jsonWriter.name("lambdaFunctionArn");
                jsonWriter.value(lambdaFunctionArn);
            }
            if (createCertificateProviderRequest.getAccountDefaultForOperations() != null) {
                java.util.List<String> accountDefaultForOperations = createCertificateProviderRequest
                        .getAccountDefaultForOperations();
                jsonWriter.name("accountDefaultForOperations");
                jsonWriter.beginArray();
                for (String accountDefaultForOperationsItem : accountDefaultForOperations) {
                    if (accountDefaultForOperationsItem != null) {
                        jsonWriter.value(accountDefaultForOperationsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createCertificateProviderRequest.getClientToken() != null) {
                String clientToken = createCertificateProviderRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
            }
            if (createCertificateProviderRequest.getTags() != null) {
                java.util.List<Tag> tags = createCertificateProviderRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
