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

package com.amazonaws.services.worklink.model.transform;

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
import com.amazonaws.services.worklink.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DisassociateWebsiteAuthorizationProviderRequest
 */
public class DisassociateWebsiteAuthorizationProviderRequestMarshaller
        implements
        Marshaller<Request<DisassociateWebsiteAuthorizationProviderRequest>, DisassociateWebsiteAuthorizationProviderRequest> {

    public Request<DisassociateWebsiteAuthorizationProviderRequest> marshall(
            DisassociateWebsiteAuthorizationProviderRequest disassociateWebsiteAuthorizationProviderRequest) {
        if (disassociateWebsiteAuthorizationProviderRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DisassociateWebsiteAuthorizationProviderRequest)");
        }

        Request<DisassociateWebsiteAuthorizationProviderRequest> request = new DefaultRequest<DisassociateWebsiteAuthorizationProviderRequest>(
                disassociateWebsiteAuthorizationProviderRequest, "AmazonWorkLink");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/disassociateWebsiteAuthorizationProvider";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (disassociateWebsiteAuthorizationProviderRequest.getFleetArn() != null) {
                String fleetArn = disassociateWebsiteAuthorizationProviderRequest.getFleetArn();
                jsonWriter.name("FleetArn");
                jsonWriter.value(fleetArn);
            }
            if (disassociateWebsiteAuthorizationProviderRequest.getAuthorizationProviderId() != null) {
                String authorizationProviderId = disassociateWebsiteAuthorizationProviderRequest
                        .getAuthorizationProviderId();
                jsonWriter.name("AuthorizationProviderId");
                jsonWriter.value(authorizationProviderId);
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
