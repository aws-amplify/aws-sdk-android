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
 * JSON request marshaller for UpdateUserPoolRequest
 */
public class UpdateUserPoolRequestMarshaller implements
        Marshaller<Request<UpdateUserPoolRequest>, UpdateUserPoolRequest> {

    public Request<UpdateUserPoolRequest> marshall(UpdateUserPoolRequest updateUserPoolRequest) {
        if (updateUserPoolRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateUserPoolRequest)");
        }

        Request<UpdateUserPoolRequest> request = new DefaultRequest<UpdateUserPoolRequest>(
                updateUserPoolRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.UpdateUserPool";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateUserPoolRequest.getUserPoolId() != null) {
                String userPoolId = updateUserPoolRequest.getUserPoolId();
                jsonWriter.name("UserPoolId");
                jsonWriter.value(userPoolId);
            }
            if (updateUserPoolRequest.getPolicies() != null) {
                UserPoolPolicyType policies = updateUserPoolRequest.getPolicies();
                jsonWriter.name("Policies");
                UserPoolPolicyTypeJsonMarshaller.getInstance().marshall(policies, jsonWriter);
            }
            if (updateUserPoolRequest.getLambdaConfig() != null) {
                LambdaConfigType lambdaConfig = updateUserPoolRequest.getLambdaConfig();
                jsonWriter.name("LambdaConfig");
                LambdaConfigTypeJsonMarshaller.getInstance().marshall(lambdaConfig, jsonWriter);
            }
            if (updateUserPoolRequest.getAutoVerifiedAttributes() != null) {
                java.util.List<String> autoVerifiedAttributes = updateUserPoolRequest
                        .getAutoVerifiedAttributes();
                jsonWriter.name("AutoVerifiedAttributes");
                jsonWriter.beginArray();
                for (String autoVerifiedAttributesItem : autoVerifiedAttributes) {
                    if (autoVerifiedAttributesItem != null) {
                        jsonWriter.value(autoVerifiedAttributesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateUserPoolRequest.getSmsVerificationMessage() != null) {
                String smsVerificationMessage = updateUserPoolRequest.getSmsVerificationMessage();
                jsonWriter.name("SmsVerificationMessage");
                jsonWriter.value(smsVerificationMessage);
            }
            if (updateUserPoolRequest.getEmailVerificationMessage() != null) {
                String emailVerificationMessage = updateUserPoolRequest
                        .getEmailVerificationMessage();
                jsonWriter.name("EmailVerificationMessage");
                jsonWriter.value(emailVerificationMessage);
            }
            if (updateUserPoolRequest.getEmailVerificationSubject() != null) {
                String emailVerificationSubject = updateUserPoolRequest
                        .getEmailVerificationSubject();
                jsonWriter.name("EmailVerificationSubject");
                jsonWriter.value(emailVerificationSubject);
            }
            if (updateUserPoolRequest.getVerificationMessageTemplate() != null) {
                VerificationMessageTemplateType verificationMessageTemplate = updateUserPoolRequest
                        .getVerificationMessageTemplate();
                jsonWriter.name("VerificationMessageTemplate");
                VerificationMessageTemplateTypeJsonMarshaller.getInstance().marshall(
                        verificationMessageTemplate, jsonWriter);
            }
            if (updateUserPoolRequest.getSmsAuthenticationMessage() != null) {
                String smsAuthenticationMessage = updateUserPoolRequest
                        .getSmsAuthenticationMessage();
                jsonWriter.name("SmsAuthenticationMessage");
                jsonWriter.value(smsAuthenticationMessage);
            }
            if (updateUserPoolRequest.getMfaConfiguration() != null) {
                String mfaConfiguration = updateUserPoolRequest.getMfaConfiguration();
                jsonWriter.name("MfaConfiguration");
                jsonWriter.value(mfaConfiguration);
            }
            if (updateUserPoolRequest.getDeviceConfiguration() != null) {
                DeviceConfigurationType deviceConfiguration = updateUserPoolRequest
                        .getDeviceConfiguration();
                jsonWriter.name("DeviceConfiguration");
                DeviceConfigurationTypeJsonMarshaller.getInstance().marshall(deviceConfiguration,
                        jsonWriter);
            }
            if (updateUserPoolRequest.getEmailConfiguration() != null) {
                EmailConfigurationType emailConfiguration = updateUserPoolRequest
                        .getEmailConfiguration();
                jsonWriter.name("EmailConfiguration");
                EmailConfigurationTypeJsonMarshaller.getInstance().marshall(emailConfiguration,
                        jsonWriter);
            }
            if (updateUserPoolRequest.getSmsConfiguration() != null) {
                SmsConfigurationType smsConfiguration = updateUserPoolRequest.getSmsConfiguration();
                jsonWriter.name("SmsConfiguration");
                SmsConfigurationTypeJsonMarshaller.getInstance().marshall(smsConfiguration,
                        jsonWriter);
            }
            if (updateUserPoolRequest.getUserPoolTags() != null) {
                java.util.Map<String, String> userPoolTags = updateUserPoolRequest
                        .getUserPoolTags();
                jsonWriter.name("UserPoolTags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> userPoolTagsEntry : userPoolTags
                        .entrySet()) {
                    String userPoolTagsValue = userPoolTagsEntry.getValue();
                    if (userPoolTagsValue != null) {
                        jsonWriter.name(userPoolTagsEntry.getKey());
                        jsonWriter.value(userPoolTagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateUserPoolRequest.getAdminCreateUserConfig() != null) {
                AdminCreateUserConfigType adminCreateUserConfig = updateUserPoolRequest
                        .getAdminCreateUserConfig();
                jsonWriter.name("AdminCreateUserConfig");
                AdminCreateUserConfigTypeJsonMarshaller.getInstance().marshall(
                        adminCreateUserConfig, jsonWriter);
            }
            if (updateUserPoolRequest.getUserPoolAddOns() != null) {
                UserPoolAddOnsType userPoolAddOns = updateUserPoolRequest.getUserPoolAddOns();
                jsonWriter.name("UserPoolAddOns");
                UserPoolAddOnsTypeJsonMarshaller.getInstance().marshall(userPoolAddOns, jsonWriter);
            }
            if (updateUserPoolRequest.getAccountRecoverySetting() != null) {
                AccountRecoverySettingType accountRecoverySetting = updateUserPoolRequest
                        .getAccountRecoverySetting();
                jsonWriter.name("AccountRecoverySetting");
                AccountRecoverySettingTypeJsonMarshaller.getInstance().marshall(
                        accountRecoverySetting, jsonWriter);
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
