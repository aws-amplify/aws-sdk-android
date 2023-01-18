/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListPhoneNumbersV2Request
 */
public class ListPhoneNumbersV2RequestMarshaller implements
        Marshaller<Request<ListPhoneNumbersV2Request>, ListPhoneNumbersV2Request> {

    public Request<ListPhoneNumbersV2Request> marshall(
            ListPhoneNumbersV2Request listPhoneNumbersV2Request) {
        if (listPhoneNumbersV2Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListPhoneNumbersV2Request)");
        }

        Request<ListPhoneNumbersV2Request> request = new DefaultRequest<ListPhoneNumbersV2Request>(
                listPhoneNumbersV2Request, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/phone-number/list";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listPhoneNumbersV2Request.getTargetArn() != null) {
                String targetArn = listPhoneNumbersV2Request.getTargetArn();
                jsonWriter.name("TargetArn");
                jsonWriter.value(targetArn);
            }
            if (listPhoneNumbersV2Request.getMaxResults() != null) {
                Integer maxResults = listPhoneNumbersV2Request.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listPhoneNumbersV2Request.getNextToken() != null) {
                String nextToken = listPhoneNumbersV2Request.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listPhoneNumbersV2Request.getPhoneNumberCountryCodes() != null) {
                java.util.List<String> phoneNumberCountryCodes = listPhoneNumbersV2Request
                        .getPhoneNumberCountryCodes();
                jsonWriter.name("PhoneNumberCountryCodes");
                jsonWriter.beginArray();
                for (String phoneNumberCountryCodesItem : phoneNumberCountryCodes) {
                    if (phoneNumberCountryCodesItem != null) {
                        jsonWriter.value(phoneNumberCountryCodesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (listPhoneNumbersV2Request.getPhoneNumberTypes() != null) {
                java.util.List<String> phoneNumberTypes = listPhoneNumbersV2Request
                        .getPhoneNumberTypes();
                jsonWriter.name("PhoneNumberTypes");
                jsonWriter.beginArray();
                for (String phoneNumberTypesItem : phoneNumberTypes) {
                    if (phoneNumberTypesItem != null) {
                        jsonWriter.value(phoneNumberTypesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (listPhoneNumbersV2Request.getPhoneNumberPrefix() != null) {
                String phoneNumberPrefix = listPhoneNumbersV2Request.getPhoneNumberPrefix();
                jsonWriter.name("PhoneNumberPrefix");
                jsonWriter.value(phoneNumberPrefix);
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
