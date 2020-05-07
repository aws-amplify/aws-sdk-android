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
 * JSON request marshaller for ModifyVpcEndpointServiceConfigurationRequest
 */
public class ModifyVpcEndpointServiceConfigurationRequestMarshaller
        implements
        Marshaller<Request<ModifyVpcEndpointServiceConfigurationRequest>, ModifyVpcEndpointServiceConfigurationRequest> {

    public Request<ModifyVpcEndpointServiceConfigurationRequest> marshall(
            ModifyVpcEndpointServiceConfigurationRequest modifyVpcEndpointServiceConfigurationRequest) {
        if (modifyVpcEndpointServiceConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyVpcEndpointServiceConfigurationRequest)");
        }

        Request<ModifyVpcEndpointServiceConfigurationRequest> request = new DefaultRequest<ModifyVpcEndpointServiceConfigurationRequest>(
                modifyVpcEndpointServiceConfigurationRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (modifyVpcEndpointServiceConfigurationRequest.getDryRun() != null) {
                Boolean dryRun = modifyVpcEndpointServiceConfigurationRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (modifyVpcEndpointServiceConfigurationRequest.getServiceId() != null) {
                String serviceId = modifyVpcEndpointServiceConfigurationRequest.getServiceId();
                jsonWriter.name("ServiceId");
                jsonWriter.value(serviceId);
            }
            if (modifyVpcEndpointServiceConfigurationRequest.getPrivateDnsName() != null) {
                String privateDnsName = modifyVpcEndpointServiceConfigurationRequest
                        .getPrivateDnsName();
                jsonWriter.name("PrivateDnsName");
                jsonWriter.value(privateDnsName);
            }
            if (modifyVpcEndpointServiceConfigurationRequest.getRemovePrivateDnsName() != null) {
                Boolean removePrivateDnsName = modifyVpcEndpointServiceConfigurationRequest
                        .getRemovePrivateDnsName();
                jsonWriter.name("RemovePrivateDnsName");
                jsonWriter.value(removePrivateDnsName);
            }
            if (modifyVpcEndpointServiceConfigurationRequest.getAcceptanceRequired() != null) {
                Boolean acceptanceRequired = modifyVpcEndpointServiceConfigurationRequest
                        .getAcceptanceRequired();
                jsonWriter.name("AcceptanceRequired");
                jsonWriter.value(acceptanceRequired);
            }
            if (modifyVpcEndpointServiceConfigurationRequest.getAddNetworkLoadBalancerArns() != null) {
                java.util.List<String> addNetworkLoadBalancerArns = modifyVpcEndpointServiceConfigurationRequest
                        .getAddNetworkLoadBalancerArns();
                jsonWriter.name("AddNetworkLoadBalancerArns");
                jsonWriter.beginArray();
                for (String addNetworkLoadBalancerArnsItem : addNetworkLoadBalancerArns) {
                    if (addNetworkLoadBalancerArnsItem != null) {
                        jsonWriter.value(addNetworkLoadBalancerArnsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyVpcEndpointServiceConfigurationRequest.getRemoveNetworkLoadBalancerArns() != null) {
                java.util.List<String> removeNetworkLoadBalancerArns = modifyVpcEndpointServiceConfigurationRequest
                        .getRemoveNetworkLoadBalancerArns();
                jsonWriter.name("RemoveNetworkLoadBalancerArns");
                jsonWriter.beginArray();
                for (String removeNetworkLoadBalancerArnsItem : removeNetworkLoadBalancerArns) {
                    if (removeNetworkLoadBalancerArnsItem != null) {
                        jsonWriter.value(removeNetworkLoadBalancerArnsItem);
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
