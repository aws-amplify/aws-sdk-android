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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetParametersByPathRequest
 */
public class GetParametersByPathRequestMarshaller implements
        Marshaller<Request<GetParametersByPathRequest>, GetParametersByPathRequest> {

    public Request<GetParametersByPathRequest> marshall(
            GetParametersByPathRequest getParametersByPathRequest) {
        if (getParametersByPathRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetParametersByPathRequest)");
        }

        Request<GetParametersByPathRequest> request = new DefaultRequest<GetParametersByPathRequest>(
                getParametersByPathRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.GetParametersByPath";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getParametersByPathRequest.getPath() != null) {
                String path = getParametersByPathRequest.getPath();
                jsonWriter.name("Path");
                jsonWriter.value(path);
            }
            if (getParametersByPathRequest.getRecursive() != null) {
                Boolean recursive = getParametersByPathRequest.getRecursive();
                jsonWriter.name("Recursive");
                jsonWriter.value(recursive);
            }
            if (getParametersByPathRequest.getParameterFilters() != null) {
                java.util.List<ParameterStringFilter> parameterFilters = getParametersByPathRequest
                        .getParameterFilters();
                jsonWriter.name("ParameterFilters");
                jsonWriter.beginArray();
                for (ParameterStringFilter parameterFiltersItem : parameterFilters) {
                    if (parameterFiltersItem != null) {
                        ParameterStringFilterJsonMarshaller.getInstance().marshall(
                                parameterFiltersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getParametersByPathRequest.getWithDecryption() != null) {
                Boolean withDecryption = getParametersByPathRequest.getWithDecryption();
                jsonWriter.name("WithDecryption");
                jsonWriter.value(withDecryption);
            }
            if (getParametersByPathRequest.getMaxResults() != null) {
                Integer maxResults = getParametersByPathRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getParametersByPathRequest.getNextToken() != null) {
                String nextToken = getParametersByPathRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
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
