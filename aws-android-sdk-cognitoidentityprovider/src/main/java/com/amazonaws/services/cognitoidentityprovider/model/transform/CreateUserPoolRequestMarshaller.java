/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateUserPoolRequest
 */
public class CreateUserPoolRequestMarshaller implements
        Marshaller<Request<CreateUserPoolRequest>, CreateUserPoolRequest> {

    public Request<CreateUserPoolRequest> marshall(CreateUserPoolRequest createUserPoolRequest) {
        if (createUserPoolRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateUserPoolRequest)");
        }

        Request<CreateUserPoolRequest> request = new DefaultRequest<CreateUserPoolRequest>(
                createUserPoolRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.CreateUserPool";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createUserPoolRequest.getPoolName() != null) {
                String poolName = createUserPoolRequest.getPoolName();
                jsonWriter.name("PoolName");
                jsonWriter.value(poolName);
            }
            if (createUserPoolRequest.getPolicies() != null) {
                UserPoolPolicyType policies = createUserPoolRequest.getPolicies();
                jsonWriter.name("Policies");
                UserPoolPolicyTypeJsonMarshaller.getInstance().marshall(policies, jsonWriter);
            }
            if (createUserPoolRequest.getLambdaConfig() != null) {
                LambdaConfigType lambdaConfig = createUserPoolRequest.getLambdaConfig();
                jsonWriter.name("LambdaConfig");
                LambdaConfigTypeJsonMarshaller.getInstance().marshall(lambdaConfig, jsonWriter);
            }
            if (createUserPoolRequest.getAutoVerifiedAttributes() != null) {
                java.util.List<String> autoVerifiedAttributes = createUserPoolRequest
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
            if (createUserPoolRequest.getAliasAttributes() != null) {
                java.util.List<String> aliasAttributes = createUserPoolRequest.getAliasAttributes();
                jsonWriter.name("AliasAttributes");
                jsonWriter.beginArray();
                for (String aliasAttributesItem : aliasAttributes) {
                    if (aliasAttributesItem != null) {
                        jsonWriter.value(aliasAttributesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserPoolRequest.getUsernameAttributes() != null) {
                java.util.List<String> usernameAttributes = createUserPoolRequest
                        .getUsernameAttributes();
                jsonWriter.name("UsernameAttributes");
                jsonWriter.beginArray();
                for (String usernameAttributesItem : usernameAttributes) {
                    if (usernameAttributesItem != null) {
                        jsonWriter.value(usernameAttributesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserPoolRequest.getSmsVerificationMessage() != null) {
                String smsVerificationMessage = createUserPoolRequest.getSmsVerificationMessage();
                jsonWriter.name("SmsVerificationMessage");
                jsonWriter.value(smsVerificationMessage);
            }
            if (createUserPoolRequest.getEmailVerificationMessage() != null) {
                String emailVerificationMessage = createUserPoolRequest
                        .getEmailVerificationMessage();
                jsonWriter.name("EmailVerificationMessage");
                jsonWriter.value(emailVerificationMessage);
            }
            if (createUserPoolRequest.getEmailVerificationSubject() != null) {
                String emailVerificationSubject = createUserPoolRequest
                        .getEmailVerificationSubject();
                jsonWriter.name("EmailVerificationSubject");
                jsonWriter.value(emailVerificationSubject);
            }
            if (createUserPoolRequest.getVerificationMessageTemplate() != null) {
                VerificationMessageTemplateType verificationMessageTemplate = createUserPoolRequest
                        .getVerificationMessageTemplate();
                jsonWriter.name("VerificationMessageTemplate");
                VerificationMessageTemplateTypeJsonMarshaller.getInstance().marshall(
                        verificationMessageTemplate, jsonWriter);
            }
            if (createUserPoolRequest.getSmsAuthenticationMessage() != null) {
                String smsAuthenticationMessage = createUserPoolRequest
                        .getSmsAuthenticationMessage();
                jsonWriter.name("SmsAuthenticationMessage");
                jsonWriter.value(smsAuthenticationMessage);
            }
            if (createUserPoolRequest.getMfaConfiguration() != null) {
                String mfaConfiguration = createUserPoolRequest.getMfaConfiguration();
                jsonWriter.name("MfaConfiguration");
                jsonWriter.value(mfaConfiguration);
            }
            if (createUserPoolRequest.getDeviceConfiguration() != null) {
                DeviceConfigurationType deviceConfiguration = createUserPoolRequest
                        .getDeviceConfiguration();
                jsonWriter.name("DeviceConfiguration");
                DeviceConfigurationTypeJsonMarshaller.getInstance().marshall(deviceConfiguration,
                        jsonWriter);
            }
            if (createUserPoolRequest.getEmailConfiguration() != null) {
                EmailConfigurationType emailConfiguration = createUserPoolRequest
                        .getEmailConfiguration();
                jsonWriter.name("EmailConfiguration");
                EmailConfigurationTypeJsonMarshaller.getInstance().marshall(emailConfiguration,
                        jsonWriter);
            }
            if (createUserPoolRequest.getSmsConfiguration() != null) {
                SmsConfigurationType smsConfiguration = createUserPoolRequest.getSmsConfiguration();
                jsonWriter.name("SmsConfiguration");
                SmsConfigurationTypeJsonMarshaller.getInstance().marshall(smsConfiguration,
                        jsonWriter);
            }
            if (createUserPoolRequest.getUserPoolTags() != null) {
                java.util.Map<String, String> userPoolTags = createUserPoolRequest
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
            if (createUserPoolRequest.getAdminCreateUserConfig() != null) {
                AdminCreateUserConfigType adminCreateUserConfig = createUserPoolRequest
                        .getAdminCreateUserConfig();
                jsonWriter.name("AdminCreateUserConfig");
                AdminCreateUserConfigTypeJsonMarshaller.getInstance().marshall(
                        adminCreateUserConfig, jsonWriter);
            }
            if (createUserPoolRequest.getSchema() != null) {
                java.util.List<SchemaAttributeType> schema = createUserPoolRequest.getSchema();
                jsonWriter.name("Schema");
                jsonWriter.beginArray();
                for (SchemaAttributeType schemaItem : schema) {
                    if (schemaItem != null) {
                        SchemaAttributeTypeJsonMarshaller.getInstance().marshall(schemaItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserPoolRequest.getUserPoolAddOns() != null) {
                UserPoolAddOnsType userPoolAddOns = createUserPoolRequest.getUserPoolAddOns();
                jsonWriter.name("UserPoolAddOns");
                UserPoolAddOnsTypeJsonMarshaller.getInstance().marshall(userPoolAddOns, jsonWriter);
            }
            if (createUserPoolRequest.getUsernameConfiguration() != null) {
                UsernameConfigurationType usernameConfiguration = createUserPoolRequest
                        .getUsernameConfiguration();
                jsonWriter.name("UsernameConfiguration");
                UsernameConfigurationTypeJsonMarshaller.getInstance().marshall(
                        usernameConfiguration, jsonWriter);
            }
            if (createUserPoolRequest.getAccountRecoverySetting() != null) {
                AccountRecoverySettingType accountRecoverySetting = createUserPoolRequest
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
