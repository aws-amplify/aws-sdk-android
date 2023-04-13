/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

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
import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateStreamProcessorRequest
 */
public class UpdateStreamProcessorRequestMarshaller implements
        Marshaller<Request<UpdateStreamProcessorRequest>, UpdateStreamProcessorRequest> {

    public Request<UpdateStreamProcessorRequest> marshall(
            UpdateStreamProcessorRequest updateStreamProcessorRequest) {
        if (updateStreamProcessorRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateStreamProcessorRequest)");
        }

        Request<UpdateStreamProcessorRequest> request = new DefaultRequest<UpdateStreamProcessorRequest>(
                updateStreamProcessorRequest, "AmazonRekognition");
        String target = "RekognitionService.UpdateStreamProcessor";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateStreamProcessorRequest.getName() != null) {
                String name = updateStreamProcessorRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateStreamProcessorRequest.getSettingsForUpdate() != null) {
                StreamProcessorSettingsForUpdate settingsForUpdate = updateStreamProcessorRequest
                        .getSettingsForUpdate();
                jsonWriter.name("SettingsForUpdate");
                StreamProcessorSettingsForUpdateJsonMarshaller.getInstance().marshall(
                        settingsForUpdate, jsonWriter);
            }
            if (updateStreamProcessorRequest.getRegionsOfInterestForUpdate() != null) {
                java.util.List<RegionOfInterest> regionsOfInterestForUpdate = updateStreamProcessorRequest
                        .getRegionsOfInterestForUpdate();
                jsonWriter.name("RegionsOfInterestForUpdate");
                jsonWriter.beginArray();
                for (RegionOfInterest regionsOfInterestForUpdateItem : regionsOfInterestForUpdate) {
                    if (regionsOfInterestForUpdateItem != null) {
                        RegionOfInterestJsonMarshaller.getInstance().marshall(
                                regionsOfInterestForUpdateItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateStreamProcessorRequest.getDataSharingPreferenceForUpdate() != null) {
                StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate = updateStreamProcessorRequest
                        .getDataSharingPreferenceForUpdate();
                jsonWriter.name("DataSharingPreferenceForUpdate");
                StreamProcessorDataSharingPreferenceJsonMarshaller.getInstance().marshall(
                        dataSharingPreferenceForUpdate, jsonWriter);
            }
            if (updateStreamProcessorRequest.getParametersToDelete() != null) {
                java.util.List<String> parametersToDelete = updateStreamProcessorRequest
                        .getParametersToDelete();
                jsonWriter.name("ParametersToDelete");
                jsonWriter.beginArray();
                for (String parametersToDeleteItem : parametersToDelete) {
                    if (parametersToDeleteItem != null) {
                        jsonWriter.value(parametersToDeleteItem);
                    }
                }
                jsonWriter.endArray();
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
