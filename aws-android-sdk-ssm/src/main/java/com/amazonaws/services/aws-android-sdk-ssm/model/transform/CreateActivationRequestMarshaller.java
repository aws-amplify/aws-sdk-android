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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

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
import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for CreateActivationRequest
 */
public class CreateActivationRequestMarshaller implements Marshaller<Request<CreateActivationRequest>, CreateActivationRequest> {

    public Request<CreateActivationRequest> marshall(CreateActivationRequest createActivationRequest) {
        if (createActivationRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateActivationRequest)");
        }

        Request<CreateActivationRequest> request = new DefaultRequest<CreateActivationRequest>(createActivationRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.CreateActivation";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createActivationRequest.getDescription() != null) {
                String description = createActivationRequest.getDescription();
                jsonWriter.name("Description");
            jsonWriter.value(description);
            }
            if (createActivationRequest.getDefaultInstanceName() != null) {
                String defaultInstanceName = createActivationRequest.getDefaultInstanceName();
                jsonWriter.name("DefaultInstanceName");
            jsonWriter.value(defaultInstanceName);
            }
            if (createActivationRequest.getIamRole() != null) {
                String iamRole = createActivationRequest.getIamRole();
                jsonWriter.name("IamRole");
            jsonWriter.value(iamRole);
            }
            if (createActivationRequest.getRegistrationLimit() != null) {
                Integer registrationLimit = createActivationRequest.getRegistrationLimit();
                jsonWriter.name("RegistrationLimit");
            jsonWriter.value(registrationLimit);
            }
            if (createActivationRequest.getExpirationDate() != null) {
                java.util.Date expirationDate = createActivationRequest.getExpirationDate();
                jsonWriter.name("ExpirationDate");
            jsonWriter.value(expirationDate);
            }
            if (createActivationRequest.getTags() != null) {
                java.util.List<Tag> tags = createActivationRequest.getTags();
                jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
            TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
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
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
