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
 * Sign Up Request Marshaller
 */
public class SignUpRequestMarshaller implements Marshaller<Request<SignUpRequest>, SignUpRequest> {

    public Request<SignUpRequest> marshall(SignUpRequest signUpRequest) {
    if (signUpRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<SignUpRequest> request = new DefaultRequest<SignUpRequest>(signUpRequest, "AmazonCognitoIdentityProvider");
        String target = "AWSCognitoIdentityProviderService.SignUp";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            if (signUpRequest.getClientId() != null) {
                jsonWriter.name("ClientId").value(signUpRequest.getClientId());
            }
            if (signUpRequest.getSecretHash() != null) {
                jsonWriter.name("SecretHash").value(signUpRequest.getSecretHash());
            }
            if (signUpRequest.getUsername() != null) {
                jsonWriter.name("Username").value(signUpRequest.getUsername());
            }
            if (signUpRequest.getPassword() != null) {
                jsonWriter.name("Password").value(signUpRequest.getPassword());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributesList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>)(signUpRequest.getUserAttributes());
            if (userAttributesList != null && !(userAttributesList.isAutoConstruct() && userAttributesList.isEmpty())) {

                jsonWriter.name("UserAttributes");
                jsonWriter.beginArray();

                for (AttributeType userAttributesListValue : userAttributesList) {
                    if (userAttributesListValue != null) {
                        jsonWriter.beginObject();
                        if (userAttributesListValue.getName() != null) {
                            jsonWriter.name("Name").value(userAttributesListValue.getName());
                        }
                        if (userAttributesListValue.getValue() != null) {
                            jsonWriter.name("Value").value(userAttributesListValue.getValue());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> validationDataList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>)(signUpRequest.getValidationData());
            if (validationDataList != null && !(validationDataList.isAutoConstruct() && validationDataList.isEmpty())) {

                jsonWriter.name("ValidationData");
                jsonWriter.beginArray();

                for (AttributeType validationDataListValue : validationDataList) {
                    if (validationDataListValue != null) {
                        jsonWriter.beginObject();
                        if (validationDataListValue.getName() != null) {
                            jsonWriter.name("Name").value(validationDataListValue.getName());
                        }
                        if (validationDataListValue.getValue() != null) {
                            jsonWriter.name("Value").value(validationDataListValue.getValue());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
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
