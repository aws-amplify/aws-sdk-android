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

package com.amazonaws.services.pinpoint.model.transform;

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
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PhoneNumberValidateRequest
 */
public class PhoneNumberValidateRequestMarshaller implements
        Marshaller<Request<PhoneNumberValidateRequest>, PhoneNumberValidateRequest> {

    public Request<PhoneNumberValidateRequest> marshall(
            PhoneNumberValidateRequest phoneNumberValidateRequest) {
        if (phoneNumberValidateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PhoneNumberValidateRequest)");
        }

        Request<PhoneNumberValidateRequest> request = new DefaultRequest<PhoneNumberValidateRequest>(
                phoneNumberValidateRequest, "AmazonPinpoint");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/phone/number/validate";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            if (phoneNumberValidateRequest.getNumberValidateRequest() != null) {
                NumberValidateRequest numberValidateRequest = phoneNumberValidateRequest
                        .getNumberValidateRequest();
                NumberValidateRequestJsonMarshaller.getInstance().marshall(numberValidateRequest,
                        jsonWriter);
            }
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
