/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateInstanceRequest
 */
public class CreateInstanceRequestMarshaller implements
        Marshaller<Request<CreateInstanceRequest>, CreateInstanceRequest> {

    public Request<CreateInstanceRequest> marshall(CreateInstanceRequest createInstanceRequest) {
        if (createInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateInstanceRequest)");
        }

        Request<CreateInstanceRequest> request = new DefaultRequest<CreateInstanceRequest>(
                createInstanceRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/instance";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createInstanceRequest.getClientToken() != null) {
                String clientToken = createInstanceRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createInstanceRequest.getIdentityManagementType() != null) {
                String identityManagementType = createInstanceRequest.getIdentityManagementType();
                jsonWriter.name("IdentityManagementType");
                jsonWriter.value(identityManagementType);
            }
            if (createInstanceRequest.getInstanceAlias() != null) {
                String instanceAlias = createInstanceRequest.getInstanceAlias();
                jsonWriter.name("InstanceAlias");
                jsonWriter.value(instanceAlias);
            }
            if (createInstanceRequest.getDirectoryId() != null) {
                String directoryId = createInstanceRequest.getDirectoryId();
                jsonWriter.name("DirectoryId");
                jsonWriter.value(directoryId);
            }
            if (createInstanceRequest.getInboundCallsEnabled() != null) {
                Boolean inboundCallsEnabled = createInstanceRequest.getInboundCallsEnabled();
                jsonWriter.name("InboundCallsEnabled");
                jsonWriter.value(inboundCallsEnabled);
            }
            if (createInstanceRequest.getOutboundCallsEnabled() != null) {
                Boolean outboundCallsEnabled = createInstanceRequest.getOutboundCallsEnabled();
                jsonWriter.name("OutboundCallsEnabled");
                jsonWriter.value(outboundCallsEnabled);
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
