/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitosync.model.transform;

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
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateRecordsRequest
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public class UpdateRecordsRequestMarshaller implements
        Marshaller<Request<UpdateRecordsRequest>, UpdateRecordsRequest> {

    public Request<UpdateRecordsRequest> marshall(UpdateRecordsRequest updateRecordsRequest) {
        if (updateRecordsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateRecordsRequest)");
        }

        Request<UpdateRecordsRequest> request = new DefaultRequest<UpdateRecordsRequest>(
                updateRecordsRequest, "AmazonCognitoSync");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateRecordsRequest.getClientContext() != null) {
            request.addHeader("x-amz-Client-Context",
                    StringUtils.fromString(updateRecordsRequest.getClientContext()));
        }
        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}";
        uriResourcePath = uriResourcePath.replace(
                "{IdentityPoolId}",
                (updateRecordsRequest.getIdentityPoolId() == null) ? "" : StringUtils
                        .fromString(updateRecordsRequest.getIdentityPoolId()));
        uriResourcePath = uriResourcePath.replace(
                "{IdentityId}",
                (updateRecordsRequest.getIdentityId() == null) ? "" : StringUtils
                        .fromString(updateRecordsRequest.getIdentityId()));
        uriResourcePath = uriResourcePath.replace(
                "{DatasetName}",
                (updateRecordsRequest.getDatasetName() == null) ? "" : StringUtils
                        .fromString(updateRecordsRequest.getDatasetName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateRecordsRequest.getDeviceId() != null) {
                String deviceId = updateRecordsRequest.getDeviceId();
                jsonWriter.name("DeviceId");
                jsonWriter.value(deviceId);
            }
            if (updateRecordsRequest.getRecordPatches() != null) {
                java.util.List<RecordPatch> recordPatches = updateRecordsRequest.getRecordPatches();
                jsonWriter.name("RecordPatches");
                jsonWriter.beginArray();
                for (RecordPatch recordPatchesItem : recordPatches) {
                    if (recordPatchesItem != null) {
                        RecordPatchJsonMarshaller.getInstance().marshall(recordPatchesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateRecordsRequest.getSyncSessionToken() != null) {
                String syncSessionToken = updateRecordsRequest.getSyncSessionToken();
                jsonWriter.name("SyncSessionToken");
                jsonWriter.value(syncSessionToken);
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
