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
 * JSON request marshaller for RevokeSecurityGroupEgressRequest
 */
public class RevokeSecurityGroupEgressRequestMarshaller implements
        Marshaller<Request<RevokeSecurityGroupEgressRequest>, RevokeSecurityGroupEgressRequest> {

    public Request<RevokeSecurityGroupEgressRequest> marshall(
            RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest) {
        if (revokeSecurityGroupEgressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RevokeSecurityGroupEgressRequest)");
        }

        Request<RevokeSecurityGroupEgressRequest> request = new DefaultRequest<RevokeSecurityGroupEgressRequest>(
                revokeSecurityGroupEgressRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (revokeSecurityGroupEgressRequest.getDryRun() != null) {
                Boolean dryRun = revokeSecurityGroupEgressRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (revokeSecurityGroupEgressRequest.getGroupId() != null) {
                String groupId = revokeSecurityGroupEgressRequest.getGroupId();
                jsonWriter.name("GroupId");
                jsonWriter.value(groupId);
            }
            if (revokeSecurityGroupEgressRequest.getIpPermissions() != null) {
                java.util.List<IpPermission> ipPermissions = revokeSecurityGroupEgressRequest
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
            if (revokeSecurityGroupEgressRequest.getCidrIp() != null) {
                String cidrIp = revokeSecurityGroupEgressRequest.getCidrIp();
                jsonWriter.name("CidrIp");
                jsonWriter.value(cidrIp);
            }
            if (revokeSecurityGroupEgressRequest.getFromPort() != null) {
                Integer fromPort = revokeSecurityGroupEgressRequest.getFromPort();
                jsonWriter.name("FromPort");
                jsonWriter.value(fromPort);
            }
            if (revokeSecurityGroupEgressRequest.getIpProtocol() != null) {
                String ipProtocol = revokeSecurityGroupEgressRequest.getIpProtocol();
                jsonWriter.name("IpProtocol");
                jsonWriter.value(ipProtocol);
            }
            if (revokeSecurityGroupEgressRequest.getToPort() != null) {
                Integer toPort = revokeSecurityGroupEgressRequest.getToPort();
                jsonWriter.name("ToPort");
                jsonWriter.value(toPort);
            }
            if (revokeSecurityGroupEgressRequest.getSourceSecurityGroupName() != null) {
                String sourceSecurityGroupName = revokeSecurityGroupEgressRequest
                        .getSourceSecurityGroupName();
                jsonWriter.name("SourceSecurityGroupName");
                jsonWriter.value(sourceSecurityGroupName);
            }
            if (revokeSecurityGroupEgressRequest.getSourceSecurityGroupOwnerId() != null) {
                String sourceSecurityGroupOwnerId = revokeSecurityGroupEgressRequest
                        .getSourceSecurityGroupOwnerId();
                jsonWriter.name("SourceSecurityGroupOwnerId");
                jsonWriter.value(sourceSecurityGroupOwnerId);
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
