/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * Attach Principal Policy Request Marshaller
 */
public class AttachPrincipalPolicyRequestMarshaller implements Marshaller<Request<AttachPrincipalPolicyRequest>, AttachPrincipalPolicyRequest> {

    public Request<AttachPrincipalPolicyRequest> marshall(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest) {
    if (attachPrincipalPolicyRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<AttachPrincipalPolicyRequest> request = new DefaultRequest<AttachPrincipalPolicyRequest>(attachPrincipalPolicyRequest, "AWSIot");
        String target = "AWSIotService.AttachPrincipalPolicy";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.PUT);
        if (attachPrincipalPolicyRequest.getPrincipal() != null)
          request.addHeader("x-amzn-iot-principal", StringUtils.fromString(attachPrincipalPolicyRequest.getPrincipal()));
        
        String uriResourcePath = "/principal-policies/{policyName}"; 
        uriResourcePath = uriResourcePath.replace("{policyName}", (attachPrincipalPolicyRequest.getPolicyName() == null) ? "" : StringUtils.fromString(attachPrincipalPolicyRequest.getPolicyName())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    if(!(nameValuePair[1].isEmpty()))
                        request.addParameter(nameValuePair[0], nameValuePair[1]);
                }
            }
        }
        request.setResourcePath(uriResourcePath);
        
        request.addHeader("Content-Length", "0");
        request.setContent(new ByteArrayInputStream(new byte[0]));
        
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
