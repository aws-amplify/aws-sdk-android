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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model.transform;

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
import com.amazonaws.services.aws-android-sdk-secretsmanager.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for GetRandomPasswordRequest
 */
public class GetRandomPasswordRequestMarshaller implements Marshaller<Request<GetRandomPasswordRequest>, GetRandomPasswordRequest> {

    public Request<GetRandomPasswordRequest> marshall(GetRandomPasswordRequest getRandomPasswordRequest) {
        if (getRandomPasswordRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetRandomPasswordRequest)");
        }

        Request<GetRandomPasswordRequest> request = new DefaultRequest<GetRandomPasswordRequest>(getRandomPasswordRequest, "AWSSecretsManager");
        String target = "secretsmanager.GetRandomPassword";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getRandomPasswordRequest.getPasswordLength() != null) {
                Long passwordLength = getRandomPasswordRequest.getPasswordLength();
                jsonWriter.name("PasswordLength");
            jsonWriter.value(passwordLength);
            }
            if (getRandomPasswordRequest.getExcludeCharacters() != null) {
                String excludeCharacters = getRandomPasswordRequest.getExcludeCharacters();
                jsonWriter.name("ExcludeCharacters");
            jsonWriter.value(excludeCharacters);
            }
            if (getRandomPasswordRequest.getExcludeNumbers() != null) {
                Boolean excludeNumbers = getRandomPasswordRequest.getExcludeNumbers();
                jsonWriter.name("ExcludeNumbers");
            jsonWriter.value(excludeNumbers);
            }
            if (getRandomPasswordRequest.getExcludePunctuation() != null) {
                Boolean excludePunctuation = getRandomPasswordRequest.getExcludePunctuation();
                jsonWriter.name("ExcludePunctuation");
            jsonWriter.value(excludePunctuation);
            }
            if (getRandomPasswordRequest.getExcludeUppercase() != null) {
                Boolean excludeUppercase = getRandomPasswordRequest.getExcludeUppercase();
                jsonWriter.name("ExcludeUppercase");
            jsonWriter.value(excludeUppercase);
            }
            if (getRandomPasswordRequest.getExcludeLowercase() != null) {
                Boolean excludeLowercase = getRandomPasswordRequest.getExcludeLowercase();
                jsonWriter.name("ExcludeLowercase");
            jsonWriter.value(excludeLowercase);
            }
            if (getRandomPasswordRequest.getIncludeSpace() != null) {
                Boolean includeSpace = getRandomPasswordRequest.getIncludeSpace();
                jsonWriter.name("IncludeSpace");
            jsonWriter.value(includeSpace);
            }
            if (getRandomPasswordRequest.getRequireEachIncludedType() != null) {
                Boolean requireEachIncludedType = getRandomPasswordRequest.getRequireEachIncludedType();
                jsonWriter.name("RequireEachIncludedType");
            jsonWriter.value(requireEachIncludedType);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
