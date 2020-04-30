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

package com.amazonaws.services.schemas.model.transform;

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
import com.amazonaws.services.schemas.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SearchSchemasRequest
 */
public class SearchSchemasRequestMarshaller implements
        Marshaller<Request<SearchSchemasRequest>, SearchSchemasRequest> {

    public Request<SearchSchemasRequest> marshall(SearchSchemasRequest searchSchemasRequest) {
        if (searchSchemasRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SearchSchemasRequest)");
        }

        Request<SearchSchemasRequest> request = new DefaultRequest<SearchSchemasRequest>(
                searchSchemasRequest, "Schemas");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/registries/name/{registryName}/schemas/search";
        if (searchSchemasRequest.getKeywords() != null) {
            request.addParameter("keywords",
                    StringUtils.fromString(searchSchemasRequest.getKeywords()));
        }
        if (searchSchemasRequest.getLimit() != null) {
            request.addParameter("limit", StringUtils.fromInteger(searchSchemasRequest.getLimit()));
        }
        if (searchSchemasRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(searchSchemasRequest.getNextToken()));
        }
        uriResourcePath = uriResourcePath.replace(
                "{registryName}",
                (searchSchemasRequest.getRegistryName() == null) ? "" : StringUtils
                        .fromString(searchSchemasRequest.getRegistryName()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
