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
package com.amazonaws.services.cognitoidentityprovider.model.transform;

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
import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * Create User Pool Request Marshaller
 */
public class CreateUserPoolRequestMarshaller implements Marshaller<Request<CreateUserPoolRequest>, CreateUserPoolRequest> {

    public Request<CreateUserPoolRequest> marshall(CreateUserPoolRequest createUserPoolRequest) {
    if (createUserPoolRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CreateUserPoolRequest> request = new DefaultRequest<CreateUserPoolRequest>(createUserPoolRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.CreateUserPool";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            if (createUserPoolRequest.getPoolName() != null) {
                jsonWriter.name("PoolName").value(createUserPoolRequest.getPoolName());
            }
            UserPoolPolicyType policies = createUserPoolRequest.getPolicies();
            if (policies != null) {

                jsonWriter.name("Policies");
                jsonWriter.beginObject();

                PasswordPolicyType passwordPolicy = policies.getPasswordPolicy();
                if (passwordPolicy != null) {

                    jsonWriter.name("PasswordPolicy");
                    jsonWriter.beginObject();

                    if (passwordPolicy.getMinimumLength() != null) {
                        jsonWriter.name("MinimumLength").value(passwordPolicy.getMinimumLength());
                    }
                    if (passwordPolicy.isRequireUppercase() != null) {
                        jsonWriter.name("RequireUppercase").value(passwordPolicy.isRequireUppercase());
                    }
                    if (passwordPolicy.isRequireLowercase() != null) {
                        jsonWriter.name("RequireLowercase").value(passwordPolicy.isRequireLowercase());
                    }
                    if (passwordPolicy.isRequireNumbers() != null) {
                        jsonWriter.name("RequireNumbers").value(passwordPolicy.isRequireNumbers());
                    }
                    if (passwordPolicy.isRequireSymbols() != null) {
                        jsonWriter.name("RequireSymbols").value(passwordPolicy.isRequireSymbols());
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }
            LambdaConfigType lambdaConfig = createUserPoolRequest.getLambdaConfig();
            if (lambdaConfig != null) {

                jsonWriter.name("LambdaConfig");
                jsonWriter.beginObject();

                if (lambdaConfig.getPreSignUp() != null) {
                    jsonWriter.name("PreSignUp").value(lambdaConfig.getPreSignUp());
                }
                if (lambdaConfig.getCustomMessage() != null) {
                    jsonWriter.name("CustomMessage").value(lambdaConfig.getCustomMessage());
                }
                if (lambdaConfig.getPostConfirmation() != null) {
                    jsonWriter.name("PostConfirmation").value(lambdaConfig.getPostConfirmation());
                }
                if (lambdaConfig.getPreAuthentication() != null) {
                    jsonWriter.name("PreAuthentication").value(lambdaConfig.getPreAuthentication());
                }
                if (lambdaConfig.getPostAuthentication() != null) {
                    jsonWriter.name("PostAuthentication").value(lambdaConfig.getPostAuthentication());
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> autoVerifiedAttributesList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(createUserPoolRequest.getAutoVerifiedAttributes());
            if (autoVerifiedAttributesList != null && !(autoVerifiedAttributesList.isAutoConstruct() && autoVerifiedAttributesList.isEmpty())) {

                jsonWriter.name("AutoVerifiedAttributes");
                jsonWriter.beginArray();

                for (String autoVerifiedAttributesListValue : autoVerifiedAttributesList) {
                    if (autoVerifiedAttributesListValue != null) {
                        jsonWriter.value(autoVerifiedAttributesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> aliasAttributesList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(createUserPoolRequest.getAliasAttributes());
            if (aliasAttributesList != null && !(aliasAttributesList.isAutoConstruct() && aliasAttributesList.isEmpty())) {

                jsonWriter.name("AliasAttributes");
                jsonWriter.beginArray();

                for (String aliasAttributesListValue : aliasAttributesList) {
                    if (aliasAttributesListValue != null) {
                        jsonWriter.value(aliasAttributesListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (createUserPoolRequest.getSmsVerificationMessage() != null) {
                jsonWriter.name("SmsVerificationMessage").value(createUserPoolRequest.getSmsVerificationMessage());
            }
            if (createUserPoolRequest.getEmailVerificationMessage() != null) {
                jsonWriter.name("EmailVerificationMessage").value(createUserPoolRequest.getEmailVerificationMessage());
            }
            if (createUserPoolRequest.getEmailVerificationSubject() != null) {
                jsonWriter.name("EmailVerificationSubject").value(createUserPoolRequest.getEmailVerificationSubject());
            }
            if (createUserPoolRequest.getSmsAuthenticationMessage() != null) {
                jsonWriter.name("SmsAuthenticationMessage").value(createUserPoolRequest.getSmsAuthenticationMessage());
            }
            if (createUserPoolRequest.getMfaConfiguration() != null) {
                jsonWriter.name("MfaConfiguration").value(createUserPoolRequest.getMfaConfiguration());
            }

            jsonWriter.endObject();

            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
