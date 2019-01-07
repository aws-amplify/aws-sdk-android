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
 * JSON request marshaller for SetRiskConfigurationRequest
 */
public class SetRiskConfigurationRequestMarshaller implements
        Marshaller<Request<SetRiskConfigurationRequest>, SetRiskConfigurationRequest> {

    public Request<SetRiskConfigurationRequest> marshall(
            SetRiskConfigurationRequest setRiskConfigurationRequest) {
        if (setRiskConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetRiskConfigurationRequest)");
        }

        Request<SetRiskConfigurationRequest> request = new DefaultRequest<SetRiskConfigurationRequest>(
                setRiskConfigurationRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.SetRiskConfiguration";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (setRiskConfigurationRequest.getUserPoolId() != null) {
                String userPoolId = setRiskConfigurationRequest.getUserPoolId();
                jsonWriter.name("UserPoolId");
                jsonWriter.value(userPoolId);
            }
            if (setRiskConfigurationRequest.getClientId() != null) {
                String clientId = setRiskConfigurationRequest.getClientId();
                jsonWriter.name("ClientId");
                jsonWriter.value(clientId);
            }
            if (setRiskConfigurationRequest.getCompromisedCredentialsRiskConfiguration() != null) {
                CompromisedCredentialsRiskConfigurationType compromisedCredentialsRiskConfiguration = setRiskConfigurationRequest
                        .getCompromisedCredentialsRiskConfiguration();
                jsonWriter.name("CompromisedCredentialsRiskConfiguration");
                CompromisedCredentialsRiskConfigurationTypeJsonMarshaller.getInstance().marshall(
                        compromisedCredentialsRiskConfiguration, jsonWriter);
            }
            if (setRiskConfigurationRequest.getAccountTakeoverRiskConfiguration() != null) {
                AccountTakeoverRiskConfigurationType accountTakeoverRiskConfiguration = setRiskConfigurationRequest
                        .getAccountTakeoverRiskConfiguration();
                jsonWriter.name("AccountTakeoverRiskConfiguration");
                AccountTakeoverRiskConfigurationTypeJsonMarshaller.getInstance().marshall(
                        accountTakeoverRiskConfiguration, jsonWriter);
            }
            if (setRiskConfigurationRequest.getRiskExceptionConfiguration() != null) {
                RiskExceptionConfigurationType riskExceptionConfiguration = setRiskConfigurationRequest
                        .getRiskExceptionConfiguration();
                jsonWriter.name("RiskExceptionConfiguration");
                RiskExceptionConfigurationTypeJsonMarshaller.getInstance().marshall(
                        riskExceptionConfiguration, jsonWriter);
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
