/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

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
import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SetUserPoolMfaConfigRequest
 */
public class SetUserPoolMfaConfigRequestMarshaller implements
        Marshaller<Request<SetUserPoolMfaConfigRequest>, SetUserPoolMfaConfigRequest> {

    public Request<SetUserPoolMfaConfigRequest> marshall(
            SetUserPoolMfaConfigRequest setUserPoolMfaConfigRequest) {
        if (setUserPoolMfaConfigRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetUserPoolMfaConfigRequest)");
        }

        Request<SetUserPoolMfaConfigRequest> request = new DefaultRequest<SetUserPoolMfaConfigRequest>(
                setUserPoolMfaConfigRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.SetUserPoolMfaConfig";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (setUserPoolMfaConfigRequest.getUserPoolId() != null) {
                String userPoolId = setUserPoolMfaConfigRequest.getUserPoolId();
                jsonWriter.name("UserPoolId");
                jsonWriter.value(userPoolId);
            }
            if (setUserPoolMfaConfigRequest.getSmsMfaConfiguration() != null) {
                SmsMfaConfigType smsMfaConfiguration = setUserPoolMfaConfigRequest
                        .getSmsMfaConfiguration();
                jsonWriter.name("SmsMfaConfiguration");
                SmsMfaConfigTypeJsonMarshaller.getInstance().marshall(smsMfaConfiguration,
                        jsonWriter);
            }
            if (setUserPoolMfaConfigRequest.getSoftwareTokenMfaConfiguration() != null) {
                SoftwareTokenMfaConfigType softwareTokenMfaConfiguration = setUserPoolMfaConfigRequest
                        .getSoftwareTokenMfaConfiguration();
                jsonWriter.name("SoftwareTokenMfaConfiguration");
                SoftwareTokenMfaConfigTypeJsonMarshaller.getInstance().marshall(
                        softwareTokenMfaConfiguration, jsonWriter);
            }
            if (setUserPoolMfaConfigRequest.getMfaConfiguration() != null) {
                String mfaConfiguration = setUserPoolMfaConfigRequest.getMfaConfiguration();
                jsonWriter.name("MfaConfiguration");
                jsonWriter.value(mfaConfiguration);
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
