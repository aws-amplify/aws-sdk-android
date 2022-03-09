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

package com.amazonaws.services.comprehend.model.transform;

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
import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartTargetedSentimentDetectionJobRequest
 */
public class StartTargetedSentimentDetectionJobRequestMarshaller
        implements
        Marshaller<Request<StartTargetedSentimentDetectionJobRequest>, StartTargetedSentimentDetectionJobRequest> {

    public Request<StartTargetedSentimentDetectionJobRequest> marshall(
            StartTargetedSentimentDetectionJobRequest startTargetedSentimentDetectionJobRequest) {
        if (startTargetedSentimentDetectionJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartTargetedSentimentDetectionJobRequest)");
        }

        Request<StartTargetedSentimentDetectionJobRequest> request = new DefaultRequest<StartTargetedSentimentDetectionJobRequest>(
                startTargetedSentimentDetectionJobRequest, "AmazonComprehend");
        String target = "Comprehend_20171127.StartTargetedSentimentDetectionJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startTargetedSentimentDetectionJobRequest.getInputDataConfig() != null) {
                InputDataConfig inputDataConfig = startTargetedSentimentDetectionJobRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
            }
            if (startTargetedSentimentDetectionJobRequest.getOutputDataConfig() != null) {
                OutputDataConfig outputDataConfig = startTargetedSentimentDetectionJobRequest
                        .getOutputDataConfig();
                jsonWriter.name("OutputDataConfig");
                OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
            }
            if (startTargetedSentimentDetectionJobRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = startTargetedSentimentDetectionJobRequest
                        .getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (startTargetedSentimentDetectionJobRequest.getJobName() != null) {
                String jobName = startTargetedSentimentDetectionJobRequest.getJobName();
                jsonWriter.name("JobName");
                jsonWriter.value(jobName);
            }
            if (startTargetedSentimentDetectionJobRequest.getLanguageCode() != null) {
                String languageCode = startTargetedSentimentDetectionJobRequest.getLanguageCode();
                jsonWriter.name("LanguageCode");
                jsonWriter.value(languageCode);
            }
            if (startTargetedSentimentDetectionJobRequest.getClientRequestToken() != null) {
                String clientRequestToken = startTargetedSentimentDetectionJobRequest
                        .getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startTargetedSentimentDetectionJobRequest.getVolumeKmsKeyId() != null) {
                String volumeKmsKeyId = startTargetedSentimentDetectionJobRequest
                        .getVolumeKmsKeyId();
                jsonWriter.name("VolumeKmsKeyId");
                jsonWriter.value(volumeKmsKeyId);
            }
            if (startTargetedSentimentDetectionJobRequest.getVpcConfig() != null) {
                VpcConfig vpcConfig = startTargetedSentimentDetectionJobRequest.getVpcConfig();
                jsonWriter.name("VpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
            }
            if (startTargetedSentimentDetectionJobRequest.getTags() != null) {
                java.util.List<Tag> tags = startTargetedSentimentDetectionJobRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
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
