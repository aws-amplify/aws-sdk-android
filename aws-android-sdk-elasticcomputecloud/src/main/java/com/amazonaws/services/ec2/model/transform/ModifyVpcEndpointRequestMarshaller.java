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
 * JSON request marshaller for ModifyVpcEndpointRequest
 */
public class ModifyVpcEndpointRequestMarshaller implements
        Marshaller<Request<ModifyVpcEndpointRequest>, ModifyVpcEndpointRequest> {

    public Request<ModifyVpcEndpointRequest> marshall(
            ModifyVpcEndpointRequest modifyVpcEndpointRequest) {
        if (modifyVpcEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyVpcEndpointRequest)");
        }

        Request<ModifyVpcEndpointRequest> request = new DefaultRequest<ModifyVpcEndpointRequest>(
                modifyVpcEndpointRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (modifyVpcEndpointRequest.getDryRun() != null) {
                Boolean dryRun = modifyVpcEndpointRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (modifyVpcEndpointRequest.getVpcEndpointId() != null) {
                String vpcEndpointId = modifyVpcEndpointRequest.getVpcEndpointId();
                jsonWriter.name("VpcEndpointId");
                jsonWriter.value(vpcEndpointId);
            }
            if (modifyVpcEndpointRequest.getResetPolicy() != null) {
                Boolean resetPolicy = modifyVpcEndpointRequest.getResetPolicy();
                jsonWriter.name("ResetPolicy");
                jsonWriter.value(resetPolicy);
            }
            if (modifyVpcEndpointRequest.getPolicyDocument() != null) {
                String policyDocument = modifyVpcEndpointRequest.getPolicyDocument();
                jsonWriter.name("PolicyDocument");
                jsonWriter.value(policyDocument);
            }
            if (modifyVpcEndpointRequest.getAddRouteTableIds() != null) {
                java.util.List<String> addRouteTableIds = modifyVpcEndpointRequest
                        .getAddRouteTableIds();
                jsonWriter.name("AddRouteTableIds");
                jsonWriter.beginArray();
                for (String addRouteTableIdsItem : addRouteTableIds) {
                    if (addRouteTableIdsItem != null) {
                        jsonWriter.value(addRouteTableIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyVpcEndpointRequest.getRemoveRouteTableIds() != null) {
                java.util.List<String> removeRouteTableIds = modifyVpcEndpointRequest
                        .getRemoveRouteTableIds();
                jsonWriter.name("RemoveRouteTableIds");
                jsonWriter.beginArray();
                for (String removeRouteTableIdsItem : removeRouteTableIds) {
                    if (removeRouteTableIdsItem != null) {
                        jsonWriter.value(removeRouteTableIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyVpcEndpointRequest.getAddSubnetIds() != null) {
                java.util.List<String> addSubnetIds = modifyVpcEndpointRequest.getAddSubnetIds();
                jsonWriter.name("AddSubnetIds");
                jsonWriter.beginArray();
                for (String addSubnetIdsItem : addSubnetIds) {
                    if (addSubnetIdsItem != null) {
                        jsonWriter.value(addSubnetIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyVpcEndpointRequest.getRemoveSubnetIds() != null) {
                java.util.List<String> removeSubnetIds = modifyVpcEndpointRequest
                        .getRemoveSubnetIds();
                jsonWriter.name("RemoveSubnetIds");
                jsonWriter.beginArray();
                for (String removeSubnetIdsItem : removeSubnetIds) {
                    if (removeSubnetIdsItem != null) {
                        jsonWriter.value(removeSubnetIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyVpcEndpointRequest.getAddSecurityGroupIds() != null) {
                java.util.List<String> addSecurityGroupIds = modifyVpcEndpointRequest
                        .getAddSecurityGroupIds();
                jsonWriter.name("AddSecurityGroupIds");
                jsonWriter.beginArray();
                for (String addSecurityGroupIdsItem : addSecurityGroupIds) {
                    if (addSecurityGroupIdsItem != null) {
                        jsonWriter.value(addSecurityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyVpcEndpointRequest.getRemoveSecurityGroupIds() != null) {
                java.util.List<String> removeSecurityGroupIds = modifyVpcEndpointRequest
                        .getRemoveSecurityGroupIds();
                jsonWriter.name("RemoveSecurityGroupIds");
                jsonWriter.beginArray();
                for (String removeSecurityGroupIdsItem : removeSecurityGroupIds) {
                    if (removeSecurityGroupIdsItem != null) {
                        jsonWriter.value(removeSecurityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyVpcEndpointRequest.getPrivateDnsEnabled() != null) {
                Boolean privateDnsEnabled = modifyVpcEndpointRequest.getPrivateDnsEnabled();
                jsonWriter.name("PrivateDnsEnabled");
                jsonWriter.value(privateDnsEnabled);
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
