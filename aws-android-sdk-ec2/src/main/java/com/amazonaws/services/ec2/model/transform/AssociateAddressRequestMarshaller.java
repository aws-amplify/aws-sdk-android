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
 * JSON request marshaller for AssociateAddressRequest
 */
public class AssociateAddressRequestMarshaller implements
        Marshaller<Request<AssociateAddressRequest>, AssociateAddressRequest> {

    public Request<AssociateAddressRequest> marshall(AssociateAddressRequest associateAddressRequest) {
        if (associateAddressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AssociateAddressRequest)");
        }

        Request<AssociateAddressRequest> request = new DefaultRequest<AssociateAddressRequest>(
                associateAddressRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (associateAddressRequest.getAllocationId() != null) {
                String allocationId = associateAddressRequest.getAllocationId();
                jsonWriter.name("AllocationId");
                jsonWriter.value(allocationId);
            }
            if (associateAddressRequest.getInstanceId() != null) {
                String instanceId = associateAddressRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (associateAddressRequest.getPublicIp() != null) {
                String publicIp = associateAddressRequest.getPublicIp();
                jsonWriter.name("PublicIp");
                jsonWriter.value(publicIp);
            }
            if (associateAddressRequest.getAllowReassociation() != null) {
                Boolean allowReassociation = associateAddressRequest.getAllowReassociation();
                jsonWriter.name("AllowReassociation");
                jsonWriter.value(allowReassociation);
            }
            if (associateAddressRequest.getDryRun() != null) {
                Boolean dryRun = associateAddressRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (associateAddressRequest.getNetworkInterfaceId() != null) {
                String networkInterfaceId = associateAddressRequest.getNetworkInterfaceId();
                jsonWriter.name("NetworkInterfaceId");
                jsonWriter.value(networkInterfaceId);
            }
            if (associateAddressRequest.getPrivateIpAddress() != null) {
                String privateIpAddress = associateAddressRequest.getPrivateIpAddress();
                jsonWriter.name("PrivateIpAddress");
                jsonWriter.value(privateIpAddress);
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
