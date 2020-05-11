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
 * JSON request marshaller for ReplaceNetworkAclEntryRequest
 */
public class ReplaceNetworkAclEntryRequestMarshaller implements
        Marshaller<Request<ReplaceNetworkAclEntryRequest>, ReplaceNetworkAclEntryRequest> {

    public Request<ReplaceNetworkAclEntryRequest> marshall(
            ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest) {
        if (replaceNetworkAclEntryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ReplaceNetworkAclEntryRequest)");
        }

        Request<ReplaceNetworkAclEntryRequest> request = new DefaultRequest<ReplaceNetworkAclEntryRequest>(
                replaceNetworkAclEntryRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (replaceNetworkAclEntryRequest.getCidrBlock() != null) {
                String cidrBlock = replaceNetworkAclEntryRequest.getCidrBlock();
                jsonWriter.name("CidrBlock");
                jsonWriter.value(cidrBlock);
            }
            if (replaceNetworkAclEntryRequest.getDryRun() != null) {
                Boolean dryRun = replaceNetworkAclEntryRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (replaceNetworkAclEntryRequest.getEgress() != null) {
                Boolean egress = replaceNetworkAclEntryRequest.getEgress();
                jsonWriter.name("Egress");
                jsonWriter.value(egress);
            }
            if (replaceNetworkAclEntryRequest.getIcmpTypeCode() != null) {
                IcmpTypeCode icmpTypeCode = replaceNetworkAclEntryRequest.getIcmpTypeCode();
                jsonWriter.name("IcmpTypeCode");
                IcmpTypeCodeJsonMarshaller.getInstance().marshall(icmpTypeCode, jsonWriter);
            }
            if (replaceNetworkAclEntryRequest.getIpv6CidrBlock() != null) {
                String ipv6CidrBlock = replaceNetworkAclEntryRequest.getIpv6CidrBlock();
                jsonWriter.name("Ipv6CidrBlock");
                jsonWriter.value(ipv6CidrBlock);
            }
            if (replaceNetworkAclEntryRequest.getNetworkAclId() != null) {
                String networkAclId = replaceNetworkAclEntryRequest.getNetworkAclId();
                jsonWriter.name("NetworkAclId");
                jsonWriter.value(networkAclId);
            }
            if (replaceNetworkAclEntryRequest.getPortRange() != null) {
                PortRange portRange = replaceNetworkAclEntryRequest.getPortRange();
                jsonWriter.name("PortRange");
                PortRangeJsonMarshaller.getInstance().marshall(portRange, jsonWriter);
            }
            if (replaceNetworkAclEntryRequest.getProtocol() != null) {
                String protocol = replaceNetworkAclEntryRequest.getProtocol();
                jsonWriter.name("Protocol");
                jsonWriter.value(protocol);
            }
            if (replaceNetworkAclEntryRequest.getRuleAction() != null) {
                String ruleAction = replaceNetworkAclEntryRequest.getRuleAction();
                jsonWriter.name("RuleAction");
                jsonWriter.value(ruleAction);
            }
            if (replaceNetworkAclEntryRequest.getRuleNumber() != null) {
                Integer ruleNumber = replaceNetworkAclEntryRequest.getRuleNumber();
                jsonWriter.name("RuleNumber");
                jsonWriter.value(ruleNumber);
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
