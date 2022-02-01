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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UserPoolType
 */
class UserPoolTypeJsonUnmarshaller implements Unmarshaller<UserPoolType, JsonUnmarshallerContext> {

    public UserPoolType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserPoolType userPoolType = new UserPoolType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                userPoolType.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                userPoolType.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Policies")) {
                userPoolType.setPolicies(UserPoolPolicyTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LambdaConfig")) {
                userPoolType.setLambdaConfig(LambdaConfigTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                userPoolType.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                userPoolType.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                userPoolType.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaAttributes")) {
                userPoolType.setSchemaAttributes(new ListUnmarshaller<SchemaAttributeType>(
                        SchemaAttributeTypeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AutoVerifiedAttributes")) {
                userPoolType.setAutoVerifiedAttributes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AliasAttributes")) {
                userPoolType.setAliasAttributes(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UsernameAttributes")) {
                userPoolType.setUsernameAttributes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SmsVerificationMessage")) {
                userPoolType.setSmsVerificationMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailVerificationMessage")) {
                userPoolType.setEmailVerificationMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailVerificationSubject")) {
                userPoolType.setEmailVerificationSubject(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VerificationMessageTemplate")) {
                userPoolType
                        .setVerificationMessageTemplate(VerificationMessageTemplateTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SmsAuthenticationMessage")) {
                userPoolType.setSmsAuthenticationMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MfaConfiguration")) {
                userPoolType.setMfaConfiguration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceConfiguration")) {
                userPoolType.setDeviceConfiguration(DeviceConfigurationTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EstimatedNumberOfUsers")) {
                userPoolType.setEstimatedNumberOfUsers(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailConfiguration")) {
                userPoolType.setEmailConfiguration(EmailConfigurationTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SmsConfiguration")) {
                userPoolType.setSmsConfiguration(SmsConfigurationTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserPoolTags")) {
                userPoolType.setUserPoolTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SmsConfigurationFailure")) {
                userPoolType.setSmsConfigurationFailure(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailConfigurationFailure")) {
                userPoolType.setEmailConfigurationFailure(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Domain")) {
                userPoolType.setDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomDomain")) {
                userPoolType.setCustomDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdminCreateUserConfig")) {
                userPoolType.setAdminCreateUserConfig(AdminCreateUserConfigTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserPoolAddOns")) {
                userPoolType.setUserPoolAddOns(UserPoolAddOnsTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UsernameConfiguration")) {
                userPoolType.setUsernameConfiguration(UsernameConfigurationTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                userPoolType.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccountRecoverySetting")) {
                userPoolType.setAccountRecoverySetting(AccountRecoverySettingTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userPoolType;
    }

    private static UserPoolTypeJsonUnmarshaller instance;

    public static UserPoolTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolTypeJsonUnmarshaller();
        return instance;
    }
}
