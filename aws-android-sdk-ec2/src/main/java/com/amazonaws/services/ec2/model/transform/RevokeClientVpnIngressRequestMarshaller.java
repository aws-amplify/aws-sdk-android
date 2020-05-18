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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for RevokeClientVpnIngressRequest
 */
public class RevokeClientVpnIngressRequestMarshaller implements
        Marshaller<Request<RevokeClientVpnIngressRequest>, RevokeClientVpnIngressRequest> {

    public Request<RevokeClientVpnIngressRequest> marshall(
            RevokeClientVpnIngressRequest revokeClientVpnIngressRequest) {
        if (revokeClientVpnIngressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RevokeClientVpnIngressRequest)");
        }

        Request<RevokeClientVpnIngressRequest> request = new DefaultRequest<RevokeClientVpnIngressRequest>(
                revokeClientVpnIngressRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (revokeClientVpnIngressRequest.getClientVpnEndpointId() != null) {
                String clientVpnEndpointId = revokeClientVpnIngressRequest.getClientVpnEndpointId();
                jsonWriter.name("ClientVpnEndpointId");
                jsonWriter.value(clientVpnEndpointId);
            }
            if (revokeClientVpnIngressRequest.getTargetNetworkCidr() != null) {
                String targetNetworkCidr = revokeClientVpnIngressRequest.getTargetNetworkCidr();
                jsonWriter.name("TargetNetworkCidr");
                jsonWriter.value(targetNetworkCidr);
            }
            if (revokeClientVpnIngressRequest.getAccessGroupId() != null) {
                String accessGroupId = revokeClientVpnIngressRequest.getAccessGroupId();
                jsonWriter.name("AccessGroupId");
                jsonWriter.value(accessGroupId);
            }
            if (revokeClientVpnIngressRequest.getRevokeAllGroups() != null) {
                Boolean revokeAllGroups = revokeClientVpnIngressRequest.getRevokeAllGroups();
                jsonWriter.name("RevokeAllGroups");
                jsonWriter.value(revokeAllGroups);
            }
            if (revokeClientVpnIngressRequest.getDryRun() != null) {
                Boolean dryRun = revokeClientVpnIngressRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
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
