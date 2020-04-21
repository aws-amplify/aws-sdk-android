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

package com.amazonaws.services.amazonroute53domains.model.transform;

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
import com.amazonaws.services.amazonroute53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetDomainSuggestionsRequest
 */
public class GetDomainSuggestionsRequestMarshaller implements
        Marshaller<Request<GetDomainSuggestionsRequest>, GetDomainSuggestionsRequest> {

    public Request<GetDomainSuggestionsRequest> marshall(
            GetDomainSuggestionsRequest getDomainSuggestionsRequest) {
        if (getDomainSuggestionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetDomainSuggestionsRequest)");
        }

        Request<GetDomainSuggestionsRequest> request = new DefaultRequest<GetDomainSuggestionsRequest>(
                getDomainSuggestionsRequest, "AmazonRoute53Domains");
        String target = "Route53Domains_v20140515.GetDomainSuggestions";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getDomainSuggestionsRequest.getDomainName() != null) {
                String domainName = getDomainSuggestionsRequest.getDomainName();
                jsonWriter.name("DomainName");
                jsonWriter.value(domainName);
            }
            if (getDomainSuggestionsRequest.getSuggestionCount() != null) {
                Integer suggestionCount = getDomainSuggestionsRequest.getSuggestionCount();
                jsonWriter.name("SuggestionCount");
                jsonWriter.value(suggestionCount);
            }
            if (getDomainSuggestionsRequest.getOnlyAvailable() != null) {
                Boolean onlyAvailable = getDomainSuggestionsRequest.getOnlyAvailable();
                jsonWriter.name("OnlyAvailable");
                jsonWriter.value(onlyAvailable);
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
