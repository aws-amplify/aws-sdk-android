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

package com.amazonaws.services.awsglue.model.transform;

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
import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateDevEndpointRequest
 */
public class UpdateDevEndpointRequestMarshaller implements
        Marshaller<Request<UpdateDevEndpointRequest>, UpdateDevEndpointRequest> {

    public Request<UpdateDevEndpointRequest> marshall(
            UpdateDevEndpointRequest updateDevEndpointRequest) {
        if (updateDevEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDevEndpointRequest)");
        }

        Request<UpdateDevEndpointRequest> request = new DefaultRequest<UpdateDevEndpointRequest>(
                updateDevEndpointRequest, "AWSGlue");
        String target = "AWSGlue.UpdateDevEndpoint";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDevEndpointRequest.getEndpointName() != null) {
                String endpointName = updateDevEndpointRequest.getEndpointName();
                jsonWriter.name("EndpointName");
                jsonWriter.value(endpointName);
            }
            if (updateDevEndpointRequest.getPublicKey() != null) {
                String publicKey = updateDevEndpointRequest.getPublicKey();
                jsonWriter.name("PublicKey");
                jsonWriter.value(publicKey);
            }
            if (updateDevEndpointRequest.getAddPublicKeys() != null) {
                java.util.List<String> addPublicKeys = updateDevEndpointRequest.getAddPublicKeys();
                jsonWriter.name("AddPublicKeys");
                jsonWriter.beginArray();
                for (String addPublicKeysItem : addPublicKeys) {
                    if (addPublicKeysItem != null) {
                        jsonWriter.value(addPublicKeysItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateDevEndpointRequest.getDeletePublicKeys() != null) {
                java.util.List<String> deletePublicKeys = updateDevEndpointRequest
                        .getDeletePublicKeys();
                jsonWriter.name("DeletePublicKeys");
                jsonWriter.beginArray();
                for (String deletePublicKeysItem : deletePublicKeys) {
                    if (deletePublicKeysItem != null) {
                        jsonWriter.value(deletePublicKeysItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateDevEndpointRequest.getCustomLibraries() != null) {
                DevEndpointCustomLibraries customLibraries = updateDevEndpointRequest
                        .getCustomLibraries();
                jsonWriter.name("CustomLibraries");
                DevEndpointCustomLibrariesJsonMarshaller.getInstance().marshall(customLibraries,
                        jsonWriter);
            }
            if (updateDevEndpointRequest.getUpdateEtlLibraries() != null) {
                Boolean updateEtlLibraries = updateDevEndpointRequest.getUpdateEtlLibraries();
                jsonWriter.name("UpdateEtlLibraries");
                jsonWriter.value(updateEtlLibraries);
            }
            if (updateDevEndpointRequest.getDeleteArguments() != null) {
                java.util.List<String> deleteArguments = updateDevEndpointRequest
                        .getDeleteArguments();
                jsonWriter.name("DeleteArguments");
                jsonWriter.beginArray();
                for (String deleteArgumentsItem : deleteArguments) {
                    if (deleteArgumentsItem != null) {
                        jsonWriter.value(deleteArgumentsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateDevEndpointRequest.getAddArguments() != null) {
                java.util.Map<String, String> addArguments = updateDevEndpointRequest
                        .getAddArguments();
                jsonWriter.name("AddArguments");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> addArgumentsEntry : addArguments
                        .entrySet()) {
                    String addArgumentsValue = addArgumentsEntry.getValue();
                    if (addArgumentsValue != null) {
                        jsonWriter.name(addArgumentsEntry.getKey());
                        jsonWriter.value(addArgumentsValue);
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
