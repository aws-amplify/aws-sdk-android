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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

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
import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ExportApiRequest
 */
public class ExportApiRequestMarshaller implements
        Marshaller<Request<ExportApiRequest>, ExportApiRequest> {

    public Request<ExportApiRequest> marshall(ExportApiRequest exportApiRequest) {
        if (exportApiRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ExportApiRequest)");
        }

        Request<ExportApiRequest> request = new DefaultRequest<ExportApiRequest>(exportApiRequest,
                "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v2/apis/{apiId}/exports/{specification}";
        uriResourcePath = uriResourcePath.replace(
                "{apiId}",
                (exportApiRequest.getApiId() == null) ? "" : StringUtils
                        .fromString(exportApiRequest.getApiId()));
        if (exportApiRequest.getExportVersion() != null) {
            request.addParameter("exportVersion",
                    StringUtils.fromString(exportApiRequest.getExportVersion()));
        }
        if (exportApiRequest.getIncludeExtensions() != null) {
            request.addParameter("includeExtensions",
                    StringUtils.fromBoolean(exportApiRequest.getIncludeExtensions()));
        }
        if (exportApiRequest.getOutputType() != null) {
            request.addParameter("outputType",
                    StringUtils.fromString(exportApiRequest.getOutputType()));
        }
        uriResourcePath = uriResourcePath.replace(
                "{specification}",
                (exportApiRequest.getSpecification() == null) ? "" : StringUtils
                        .fromString(exportApiRequest.getSpecification()));
        if (exportApiRequest.getStageName() != null) {
            request.addParameter("stageName",
                    StringUtils.fromString(exportApiRequest.getStageName()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
