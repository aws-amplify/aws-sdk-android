/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for UpdateKeyRequest
 */
public class UpdateKeyRequestMarshaller implements
        Marshaller<Request<UpdateKeyRequest>, UpdateKeyRequest> {

    public Request<UpdateKeyRequest> marshall(UpdateKeyRequest updateKeyRequest) {
        if (updateKeyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateKeyRequest)");
        }

        Request<UpdateKeyRequest> request = new DefaultRequest<UpdateKeyRequest>(updateKeyRequest,
                "AmazonLocation");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/metadata/v0/keys/{KeyName}";
        uriResourcePath = uriResourcePath.replace(
                "{KeyName}",
                (updateKeyRequest.getKeyName() == null) ? "" : StringUtils
                        .fromString(updateKeyRequest.getKeyName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateKeyRequest.getDescription() != null) {
                String description = updateKeyRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateKeyRequest.getExpireTime() != null) {
                java.util.Date expireTime = updateKeyRequest.getExpireTime();
                jsonWriter.name("ExpireTime");
                jsonWriter.value(DateUtils.formatISO8601Date(expireTime));
            }
            if (updateKeyRequest.getNoExpiry() != null) {
                Boolean noExpiry = updateKeyRequest.getNoExpiry();
                jsonWriter.name("NoExpiry");
                jsonWriter.value(noExpiry);
            }
            if (updateKeyRequest.getForceUpdate() != null) {
                Boolean forceUpdate = updateKeyRequest.getForceUpdate();
                jsonWriter.name("ForceUpdate");
                jsonWriter.value(forceUpdate);
            }
            if (updateKeyRequest.getRestrictions() != null) {
                ApiKeyRestrictions restrictions = updateKeyRequest.getRestrictions();
                jsonWriter.name("Restrictions");
                ApiKeyRestrictionsJsonMarshaller.getInstance().marshall(restrictions, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }
        request.setHostPrefix("cp.metadata.");

        return request;
    }
}
