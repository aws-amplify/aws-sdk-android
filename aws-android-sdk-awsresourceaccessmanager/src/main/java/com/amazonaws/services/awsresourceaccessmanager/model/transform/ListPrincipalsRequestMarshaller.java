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

package com.amazonaws.services.awsresourceaccessmanager.model.transform;

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
import com.amazonaws.services.awsresourceaccessmanager.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListPrincipalsRequest
 */
public class ListPrincipalsRequestMarshaller implements
        Marshaller<Request<ListPrincipalsRequest>, ListPrincipalsRequest> {

    public Request<ListPrincipalsRequest> marshall(ListPrincipalsRequest listPrincipalsRequest) {
        if (listPrincipalsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListPrincipalsRequest)");
        }

        Request<ListPrincipalsRequest> request = new DefaultRequest<ListPrincipalsRequest>(
                listPrincipalsRequest, "AWSResourceAccessManager");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/listprincipals";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listPrincipalsRequest.getResourceOwner() != null) {
                String resourceOwner = listPrincipalsRequest.getResourceOwner();
                jsonWriter.name("resourceOwner");
                jsonWriter.value(resourceOwner);
            }
            if (listPrincipalsRequest.getResourceArn() != null) {
                String resourceArn = listPrincipalsRequest.getResourceArn();
                jsonWriter.name("resourceArn");
                jsonWriter.value(resourceArn);
            }
            if (listPrincipalsRequest.getPrincipals() != null) {
                java.util.List<String> principals = listPrincipalsRequest.getPrincipals();
                jsonWriter.name("principals");
                jsonWriter.beginArray();
                for (String principalsItem : principals) {
                    if (principalsItem != null) {
                        jsonWriter.value(principalsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (listPrincipalsRequest.getResourceType() != null) {
                String resourceType = listPrincipalsRequest.getResourceType();
                jsonWriter.name("resourceType");
                jsonWriter.value(resourceType);
            }
            if (listPrincipalsRequest.getResourceShareArns() != null) {
                java.util.List<String> resourceShareArns = listPrincipalsRequest
                        .getResourceShareArns();
                jsonWriter.name("resourceShareArns");
                jsonWriter.beginArray();
                for (String resourceShareArnsItem : resourceShareArns) {
                    if (resourceShareArnsItem != null) {
                        jsonWriter.value(resourceShareArnsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (listPrincipalsRequest.getNextToken() != null) {
                String nextToken = listPrincipalsRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (listPrincipalsRequest.getMaxResults() != null) {
                Integer maxResults = listPrincipalsRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
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
