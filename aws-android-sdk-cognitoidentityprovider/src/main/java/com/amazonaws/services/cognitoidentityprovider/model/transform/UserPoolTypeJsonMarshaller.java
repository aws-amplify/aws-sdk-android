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

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserPoolType
 */
class UserPoolTypeJsonMarshaller {

    public void marshall(UserPoolType userPoolType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userPoolType.getId() != null) {
            String id = userPoolType.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (userPoolType.getName() != null) {
            String name = userPoolType.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (userPoolType.getPolicies() != null) {
            UserPoolPolicyType policies = userPoolType.getPolicies();
            jsonWriter.name("Policies");
            UserPoolPolicyTypeJsonMarshaller.getInstance().marshall(policies, jsonWriter);
        }
        if (userPoolType.getLambdaConfig() != null) {
            LambdaConfigType lambdaConfig = userPoolType.getLambdaConfig();
            jsonWriter.name("LambdaConfig");
            LambdaConfigTypeJsonMarshaller.getInstance().marshall(lambdaConfig, jsonWriter);
        }
        if (userPoolType.getStatus() != null) {
            String status = userPoolType.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (userPoolType.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = userPoolType.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (userPoolType.getCreationDate() != null) {
            java.util.Date creationDate = userPoolType.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (userPoolType.getSchemaAttributes() != null) {
            java.util.List<SchemaAttributeType> schemaAttributes = userPoolType
                    .getSchemaAttributes();
            jsonWriter.name("SchemaAttributes");
            jsonWriter.beginArray();
            for (SchemaAttributeType schemaAttributesItem : schemaAttributes) {
                if (schemaAttributesItem != null) {
                    SchemaAttributeTypeJsonMarshaller.getInstance().marshall(schemaAttributesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolType.getAutoVerifiedAttributes() != null) {
            java.util.List<String> autoVerifiedAttributes = userPoolType
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
        if (userPoolType.getAliasAttributes() != null) {
            java.util.List<String> aliasAttributes = userPoolType.getAliasAttributes();
            jsonWriter.name("AliasAttributes");
            jsonWriter.beginArray();
            for (String aliasAttributesItem : aliasAttributes) {
                if (aliasAttributesItem != null) {
                    jsonWriter.value(aliasAttributesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolType.getUsernameAttributes() != null) {
            java.util.List<String> usernameAttributes = userPoolType.getUsernameAttributes();
            jsonWriter.name("UsernameAttributes");
            jsonWriter.beginArray();
            for (String usernameAttributesItem : usernameAttributes) {
                if (usernameAttributesItem != null) {
                    jsonWriter.value(usernameAttributesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userPoolType.getSmsVerificationMessage() != null) {
            String smsVerificationMessage = userPoolType.getSmsVerificationMessage();
            jsonWriter.name("SmsVerificationMessage");
            jsonWriter.value(smsVerificationMessage);
        }
        if (userPoolType.getEmailVerificationMessage() != null) {
            String emailVerificationMessage = userPoolType.getEmailVerificationMessage();
            jsonWriter.name("EmailVerificationMessage");
            jsonWriter.value(emailVerificationMessage);
        }
        if (userPoolType.getEmailVerificationSubject() != null) {
            String emailVerificationSubject = userPoolType.getEmailVerificationSubject();
            jsonWriter.name("EmailVerificationSubject");
            jsonWriter.value(emailVerificationSubject);
        }
        if (userPoolType.getVerificationMessageTemplate() != null) {
            VerificationMessageTemplateType verificationMessageTemplate = userPoolType
                    .getVerificationMessageTemplate();
            jsonWriter.name("VerificationMessageTemplate");
            VerificationMessageTemplateTypeJsonMarshaller.getInstance().marshall(
                    verificationMessageTemplate, jsonWriter);
        }
        if (userPoolType.getSmsAuthenticationMessage() != null) {
            String smsAuthenticationMessage = userPoolType.getSmsAuthenticationMessage();
            jsonWriter.name("SmsAuthenticationMessage");
            jsonWriter.value(smsAuthenticationMessage);
        }
        if (userPoolType.getMfaConfiguration() != null) {
            String mfaConfiguration = userPoolType.getMfaConfiguration();
            jsonWriter.name("MfaConfiguration");
            jsonWriter.value(mfaConfiguration);
        }
        if (userPoolType.getDeviceConfiguration() != null) {
            DeviceConfigurationType deviceConfiguration = userPoolType.getDeviceConfiguration();
            jsonWriter.name("DeviceConfiguration");
            DeviceConfigurationTypeJsonMarshaller.getInstance().marshall(deviceConfiguration,
                    jsonWriter);
        }
        if (userPoolType.getEstimatedNumberOfUsers() != null) {
            Integer estimatedNumberOfUsers = userPoolType.getEstimatedNumberOfUsers();
            jsonWriter.name("EstimatedNumberOfUsers");
            jsonWriter.value(estimatedNumberOfUsers);
        }
        if (userPoolType.getEmailConfiguration() != null) {
            EmailConfigurationType emailConfiguration = userPoolType.getEmailConfiguration();
            jsonWriter.name("EmailConfiguration");
            EmailConfigurationTypeJsonMarshaller.getInstance().marshall(emailConfiguration,
                    jsonWriter);
        }
        if (userPoolType.getSmsConfiguration() != null) {
            SmsConfigurationType smsConfiguration = userPoolType.getSmsConfiguration();
            jsonWriter.name("SmsConfiguration");
            SmsConfigurationTypeJsonMarshaller.getInstance().marshall(smsConfiguration, jsonWriter);
        }
        if (userPoolType.getUserPoolTags() != null) {
            java.util.Map<String, String> userPoolTags = userPoolType.getUserPoolTags();
            jsonWriter.name("UserPoolTags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> userPoolTagsEntry : userPoolTags.entrySet()) {
                String userPoolTagsValue = userPoolTagsEntry.getValue();
                if (userPoolTagsValue != null) {
                    jsonWriter.name(userPoolTagsEntry.getKey());
                    jsonWriter.value(userPoolTagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (userPoolType.getSmsConfigurationFailure() != null) {
            String smsConfigurationFailure = userPoolType.getSmsConfigurationFailure();
            jsonWriter.name("SmsConfigurationFailure");
            jsonWriter.value(smsConfigurationFailure);
        }
        if (userPoolType.getEmailConfigurationFailure() != null) {
            String emailConfigurationFailure = userPoolType.getEmailConfigurationFailure();
            jsonWriter.name("EmailConfigurationFailure");
            jsonWriter.value(emailConfigurationFailure);
        }
        if (userPoolType.getDomain() != null) {
            String domain = userPoolType.getDomain();
            jsonWriter.name("Domain");
            jsonWriter.value(domain);
        }
        if (userPoolType.getCustomDomain() != null) {
            String customDomain = userPoolType.getCustomDomain();
            jsonWriter.name("CustomDomain");
            jsonWriter.value(customDomain);
        }
        if (userPoolType.getAdminCreateUserConfig() != null) {
            AdminCreateUserConfigType adminCreateUserConfig = userPoolType
                    .getAdminCreateUserConfig();
            jsonWriter.name("AdminCreateUserConfig");
            AdminCreateUserConfigTypeJsonMarshaller.getInstance().marshall(adminCreateUserConfig,
                    jsonWriter);
        }
        if (userPoolType.getUserPoolAddOns() != null) {
            UserPoolAddOnsType userPoolAddOns = userPoolType.getUserPoolAddOns();
            jsonWriter.name("UserPoolAddOns");
            UserPoolAddOnsTypeJsonMarshaller.getInstance().marshall(userPoolAddOns, jsonWriter);
        }
        if (userPoolType.getUsernameConfiguration() != null) {
            UsernameConfigurationType usernameConfiguration = userPoolType
                    .getUsernameConfiguration();
            jsonWriter.name("UsernameConfiguration");
            UsernameConfigurationTypeJsonMarshaller.getInstance().marshall(usernameConfiguration,
                    jsonWriter);
        }
        if (userPoolType.getArn() != null) {
            String arn = userPoolType.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (userPoolType.getAccountRecoverySetting() != null) {
            AccountRecoverySettingType accountRecoverySetting = userPoolType
                    .getAccountRecoverySetting();
            jsonWriter.name("AccountRecoverySetting");
            AccountRecoverySettingTypeJsonMarshaller.getInstance().marshall(accountRecoverySetting,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UserPoolTypeJsonMarshaller instance;

    public static UserPoolTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolTypeJsonMarshaller();
        return instance;
    }
}
