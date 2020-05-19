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
 * JSON request marshaller for CreateVpcRequest
 */
public class CreateVpcRequestMarshaller implements
        Marshaller<Request<CreateVpcRequest>, CreateVpcRequest> {

    public Request<CreateVpcRequest> marshall(CreateVpcRequest createVpcRequest) {
        if (createVpcRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateVpcRequest)");
        }

        Request<CreateVpcRequest> request = new DefaultRequest<CreateVpcRequest>(createVpcRequest,
                "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createVpcRequest.getCidrBlock() != null) {
                String cidrBlock = createVpcRequest.getCidrBlock();
                jsonWriter.name("CidrBlock");
                jsonWriter.value(cidrBlock);
            }
            if (createVpcRequest.getAmazonProvidedIpv6CidrBlock() != null) {
                Boolean amazonProvidedIpv6CidrBlock = createVpcRequest
                        .getAmazonProvidedIpv6CidrBlock();
                jsonWriter.name("AmazonProvidedIpv6CidrBlock");
                jsonWriter.value(amazonProvidedIpv6CidrBlock);
            }
            if (createVpcRequest.getIpv6Pool() != null) {
                String ipv6Pool = createVpcRequest.getIpv6Pool();
                jsonWriter.name("Ipv6Pool");
                jsonWriter.value(ipv6Pool);
            }
            if (createVpcRequest.getIpv6CidrBlock() != null) {
                String ipv6CidrBlock = createVpcRequest.getIpv6CidrBlock();
                jsonWriter.name("Ipv6CidrBlock");
                jsonWriter.value(ipv6CidrBlock);
            }
            if (createVpcRequest.getDryRun() != null) {
                Boolean dryRun = createVpcRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (createVpcRequest.getInstanceTenancy() != null) {
                String instanceTenancy = createVpcRequest.getInstanceTenancy();
                jsonWriter.name("InstanceTenancy");
                jsonWriter.value(instanceTenancy);
            }
            if (createVpcRequest.getIpv6CidrBlockNetworkBorderGroup() != null) {
                String ipv6CidrBlockNetworkBorderGroup = createVpcRequest
                        .getIpv6CidrBlockNetworkBorderGroup();
                jsonWriter.name("Ipv6CidrBlockNetworkBorderGroup");
                jsonWriter.value(ipv6CidrBlockNetworkBorderGroup);
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
