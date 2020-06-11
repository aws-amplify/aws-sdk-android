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

package com.amazonaws.services.models.lex.model.transform;

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
import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetSlotTypeVersionsRequest
 */
public class GetSlotTypeVersionsRequestMarshaller implements
        Marshaller<Request<GetSlotTypeVersionsRequest>, GetSlotTypeVersionsRequest> {

    public Request<GetSlotTypeVersionsRequest> marshall(
            GetSlotTypeVersionsRequest getSlotTypeVersionsRequest) {
        if (getSlotTypeVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetSlotTypeVersionsRequest)");
        }

        Request<GetSlotTypeVersionsRequest> request = new DefaultRequest<GetSlotTypeVersionsRequest>(
                getSlotTypeVersionsRequest, "AmazonLexModelBuildingService");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/slottypes/{name}/versions/";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (getSlotTypeVersionsRequest.getName() == null) ? "" : StringUtils
                        .fromString(getSlotTypeVersionsRequest.getName()));
        if (getSlotTypeVersionsRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(getSlotTypeVersionsRequest.getNextToken()));
        }
        if (getSlotTypeVersionsRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(getSlotTypeVersionsRequest.getMaxResults()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
