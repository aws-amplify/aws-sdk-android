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

package com.amazonaws.services.support.model.transform;

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
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateCaseRequest
 */
public class CreateCaseRequestMarshaller implements
        Marshaller<Request<CreateCaseRequest>, CreateCaseRequest> {

    public Request<CreateCaseRequest> marshall(CreateCaseRequest createCaseRequest) {
        if (createCaseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCaseRequest)");
        }

        Request<CreateCaseRequest> request = new DefaultRequest<CreateCaseRequest>(
                createCaseRequest, "AWSSupport");
        String target = "AWSSupport_20130415.CreateCase";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createCaseRequest.getSubject() != null) {
                String subject = createCaseRequest.getSubject();
                jsonWriter.name("subject");
                jsonWriter.value(subject);
            }
            if (createCaseRequest.getServiceCode() != null) {
                String serviceCode = createCaseRequest.getServiceCode();
                jsonWriter.name("serviceCode");
                jsonWriter.value(serviceCode);
            }
            if (createCaseRequest.getSeverityCode() != null) {
                String severityCode = createCaseRequest.getSeverityCode();
                jsonWriter.name("severityCode");
                jsonWriter.value(severityCode);
            }
            if (createCaseRequest.getCategoryCode() != null) {
                String categoryCode = createCaseRequest.getCategoryCode();
                jsonWriter.name("categoryCode");
                jsonWriter.value(categoryCode);
            }
            if (createCaseRequest.getCommunicationBody() != null) {
                String communicationBody = createCaseRequest.getCommunicationBody();
                jsonWriter.name("communicationBody");
                jsonWriter.value(communicationBody);
            }
            if (createCaseRequest.getCcEmailAddresses() != null) {
                java.util.List<String> ccEmailAddresses = createCaseRequest.getCcEmailAddresses();
                jsonWriter.name("ccEmailAddresses");
                jsonWriter.beginArray();
                for (String ccEmailAddressesItem : ccEmailAddresses) {
                    if (ccEmailAddressesItem != null) {
                        jsonWriter.value(ccEmailAddressesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createCaseRequest.getLanguage() != null) {
                String language = createCaseRequest.getLanguage();
                jsonWriter.name("language");
                jsonWriter.value(language);
            }
            if (createCaseRequest.getIssueType() != null) {
                String issueType = createCaseRequest.getIssueType();
                jsonWriter.name("issueType");
                jsonWriter.value(issueType);
            }
            if (createCaseRequest.getAttachmentSetId() != null) {
                String attachmentSetId = createCaseRequest.getAttachmentSetId();
                jsonWriter.name("attachmentSetId");
                jsonWriter.value(attachmentSetId);
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
