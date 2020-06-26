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
 * JSON request marshaller for CreateDomainRequest
 */
public class CreateDomainRequestMarshaller implements
        Marshaller<Request<CreateDomainRequest>, CreateDomainRequest> {

    public Request<CreateDomainRequest> marshall(CreateDomainRequest createDomainRequest) {
        if (createDomainRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDomainRequest)");
        }

        Request<CreateDomainRequest> request = new DefaultRequest<CreateDomainRequest>(
                createDomainRequest, "AmazonSageMakerService");
        String target = "SageMaker.CreateDomain";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDomainRequest.getDomainName() != null) {
                String domainName = createDomainRequest.getDomainName();
                jsonWriter.name("DomainName");
                jsonWriter.value(domainName);
            }
            if (createDomainRequest.getAuthMode() != null) {
                String authMode = createDomainRequest.getAuthMode();
                jsonWriter.name("AuthMode");
                jsonWriter.value(authMode);
            }
            if (createDomainRequest.getDefaultUserSettings() != null) {
                UserSettings defaultUserSettings = createDomainRequest.getDefaultUserSettings();
                jsonWriter.name("DefaultUserSettings");
                UserSettingsJsonMarshaller.getInstance().marshall(defaultUserSettings, jsonWriter);
            }
            if (createDomainRequest.getSubnetIds() != null) {
                java.util.List<String> subnetIds = createDomainRequest.getSubnetIds();
                jsonWriter.name("SubnetIds");
                jsonWriter.beginArray();
                for (String subnetIdsItem : subnetIds) {
                    if (subnetIdsItem != null) {
                        jsonWriter.value(subnetIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDomainRequest.getVpcId() != null) {
                String vpcId = createDomainRequest.getVpcId();
                jsonWriter.name("VpcId");
                jsonWriter.value(vpcId);
            }
            if (createDomainRequest.getTags() != null) {
                java.util.List<Tag> tags = createDomainRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDomainRequest.getHomeEfsFileSystemKmsKeyId() != null) {
                String homeEfsFileSystemKmsKeyId = createDomainRequest
                        .getHomeEfsFileSystemKmsKeyId();
                jsonWriter.name("HomeEfsFileSystemKmsKeyId");
                jsonWriter.value(homeEfsFileSystemKmsKeyId);
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
