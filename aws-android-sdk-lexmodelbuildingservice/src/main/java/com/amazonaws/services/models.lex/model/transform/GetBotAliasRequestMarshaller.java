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
 * JSON request marshaller for GetBotAliasRequest
 */
public class GetBotAliasRequestMarshaller implements
        Marshaller<Request<GetBotAliasRequest>, GetBotAliasRequest> {

    public Request<GetBotAliasRequest> marshall(GetBotAliasRequest getBotAliasRequest) {
        if (getBotAliasRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetBotAliasRequest)");
        }

        Request<GetBotAliasRequest> request = new DefaultRequest<GetBotAliasRequest>(
                getBotAliasRequest, "AmazonLexModelBuildingService");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/bots/{botName}/aliases/{name}";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (getBotAliasRequest.getName() == null) ? "" : StringUtils
                        .fromString(getBotAliasRequest.getName()));
        uriResourcePath = uriResourcePath.replace(
                "{botName}",
                (getBotAliasRequest.getBotName() == null) ? "" : StringUtils
                        .fromString(getBotAliasRequest.getBotName()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
