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
 * JSON request marshaller for RevokeSecurityGroupIngressRequest
 */
public class RevokeSecurityGroupIngressRequestMarshaller implements
        Marshaller<Request<RevokeSecurityGroupIngressRequest>, RevokeSecurityGroupIngressRequest> {

    public Request<RevokeSecurityGroupIngressRequest> marshall(
            RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest) {
        if (revokeSecurityGroupIngressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RevokeSecurityGroupIngressRequest)");
        }

        Request<RevokeSecurityGroupIngressRequest> request = new DefaultRequest<RevokeSecurityGroupIngressRequest>(
                revokeSecurityGroupIngressRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (revokeSecurityGroupIngressRequest.getCidrIp() != null) {
                String cidrIp = revokeSecurityGroupIngressRequest.getCidrIp();
                jsonWriter.name("CidrIp");
                jsonWriter.value(cidrIp);
            }
            if (revokeSecurityGroupIngressRequest.getFromPort() != null) {
                Integer fromPort = revokeSecurityGroupIngressRequest.getFromPort();
                jsonWriter.name("FromPort");
                jsonWriter.value(fromPort);
            }
            if (revokeSecurityGroupIngressRequest.getGroupId() != null) {
                String groupId = revokeSecurityGroupIngressRequest.getGroupId();
                jsonWriter.name("GroupId");
                jsonWriter.value(groupId);
            }
            if (revokeSecurityGroupIngressRequest.getGroupName() != null) {
                String groupName = revokeSecurityGroupIngressRequest.getGroupName();
                jsonWriter.name("GroupName");
                jsonWriter.value(groupName);
            }
            if (revokeSecurityGroupIngressRequest.getIpPermissions() != null) {
                java.util.List<IpPermission> ipPermissions = revokeSecurityGroupIngressRequest
                        .getIpPermissions();
                jsonWriter.name("IpPermissions");
                jsonWriter.beginArray();
                for (IpPermission ipPermissionsItem : ipPermissions) {
                    if (ipPermissionsItem != null) {
                        IpPermissionJsonMarshaller.getInstance().marshall(ipPermissionsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (revokeSecurityGroupIngressRequest.getIpProtocol() != null) {
                String ipProtocol = revokeSecurityGroupIngressRequest.getIpProtocol();
                jsonWriter.name("IpProtocol");
                jsonWriter.value(ipProtocol);
            }
            if (revokeSecurityGroupIngressRequest.getSourceSecurityGroupName() != null) {
                String sourceSecurityGroupName = revokeSecurityGroupIngressRequest
                        .getSourceSecurityGroupName();
                jsonWriter.name("SourceSecurityGroupName");
                jsonWriter.value(sourceSecurityGroupName);
            }
            if (revokeSecurityGroupIngressRequest.getSourceSecurityGroupOwnerId() != null) {
                String sourceSecurityGroupOwnerId = revokeSecurityGroupIngressRequest
                        .getSourceSecurityGroupOwnerId();
                jsonWriter.name("SourceSecurityGroupOwnerId");
                jsonWriter.value(sourceSecurityGroupOwnerId);
            }
            if (revokeSecurityGroupIngressRequest.getToPort() != null) {
                Integer toPort = revokeSecurityGroupIngressRequest.getToPort();
                jsonWriter.name("ToPort");
                jsonWriter.value(toPort);
            }
            if (revokeSecurityGroupIngressRequest.getDryRun() != null) {
                Boolean dryRun = revokeSecurityGroupIngressRequest.getDryRun();
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
