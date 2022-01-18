/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

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
import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetMapTileRequest
 */
public class GetMapTileRequestMarshaller implements
        Marshaller<Request<GetMapTileRequest>, GetMapTileRequest> {

    public Request<GetMapTileRequest> marshall(GetMapTileRequest getMapTileRequest) {
        if (getMapTileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetMapTileRequest)");
        }

        Request<GetMapTileRequest> request = new DefaultRequest<GetMapTileRequest>(
                getMapTileRequest, "AmazonLocation");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/maps/v0/maps/{MapName}/tiles/{Z}/{X}/{Y}";
        uriResourcePath = uriResourcePath.replace(
                "{MapName}",
                (getMapTileRequest.getMapName() == null) ? "" : StringUtils
                        .fromString(getMapTileRequest.getMapName()));
        uriResourcePath = uriResourcePath.replace("{X}", (getMapTileRequest.getX() == null) ? ""
                : StringUtils.fromString(getMapTileRequest.getX()));
        uriResourcePath = uriResourcePath.replace("{Y}", (getMapTileRequest.getY() == null) ? ""
                : StringUtils.fromString(getMapTileRequest.getY()));
        uriResourcePath = uriResourcePath.replace("{Z}", (getMapTileRequest.getZ() == null) ? ""
                : StringUtils.fromString(getMapTileRequest.getZ()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }
        request.setHostPrefix("maps.");

        return request;
    }
}
