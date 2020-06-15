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

package com.amazonaws.services.a4b.model.transform;

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
import com.amazonaws.services.a4b.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateContactRequest
 */
public class UpdateContactRequestMarshaller implements
        Marshaller<Request<UpdateContactRequest>, UpdateContactRequest> {

    public Request<UpdateContactRequest> marshall(UpdateContactRequest updateContactRequest) {
        if (updateContactRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateContactRequest)");
        }

        Request<UpdateContactRequest> request = new DefaultRequest<UpdateContactRequest>(
                updateContactRequest, "AlexaForBusiness");
        String target = "AlexaForBusiness.UpdateContact";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateContactRequest.getContactArn() != null) {
                String contactArn = updateContactRequest.getContactArn();
                jsonWriter.name("ContactArn");
                jsonWriter.value(contactArn);
            }
            if (updateContactRequest.getDisplayName() != null) {
                String displayName = updateContactRequest.getDisplayName();
                jsonWriter.name("DisplayName");
                jsonWriter.value(displayName);
            }
            if (updateContactRequest.getFirstName() != null) {
                String firstName = updateContactRequest.getFirstName();
                jsonWriter.name("FirstName");
                jsonWriter.value(firstName);
            }
            if (updateContactRequest.getLastName() != null) {
                String lastName = updateContactRequest.getLastName();
                jsonWriter.name("LastName");
                jsonWriter.value(lastName);
            }
            if (updateContactRequest.getPhoneNumber() != null) {
                String phoneNumber = updateContactRequest.getPhoneNumber();
                jsonWriter.name("PhoneNumber");
                jsonWriter.value(phoneNumber);
            }
            if (updateContactRequest.getPhoneNumbers() != null) {
                java.util.List<PhoneNumber> phoneNumbers = updateContactRequest.getPhoneNumbers();
                jsonWriter.name("PhoneNumbers");
                jsonWriter.beginArray();
                for (PhoneNumber phoneNumbersItem : phoneNumbers) {
                    if (phoneNumbersItem != null) {
                        PhoneNumberJsonMarshaller.getInstance().marshall(phoneNumbersItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateContactRequest.getSipAddresses() != null) {
                java.util.List<SipAddress> sipAddresses = updateContactRequest.getSipAddresses();
                jsonWriter.name("SipAddresses");
                jsonWriter.beginArray();
                for (SipAddress sipAddressesItem : sipAddresses) {
                    if (sipAddressesItem != null) {
                        SipAddressJsonMarshaller.getInstance().marshall(sipAddressesItem,
                                jsonWriter);
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
