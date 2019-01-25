/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

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
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetCampaignVersionRequest
 */
public class GetCampaignVersionRequestMarshaller implements
        Marshaller<Request<GetCampaignVersionRequest>, GetCampaignVersionRequest> {

    public Request<GetCampaignVersionRequest> marshall(
            GetCampaignVersionRequest getCampaignVersionRequest) {
        if (getCampaignVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetCampaignVersionRequest)");
        }

        Request<GetCampaignVersionRequest> request = new DefaultRequest<GetCampaignVersionRequest>(
                getCampaignVersionRequest, "AmazonPinpoint");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/campaigns/{campaign-id}/versions/{version}";
        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (getCampaignVersionRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(getCampaignVersionRequest.getApplicationId()));
        uriResourcePath = uriResourcePath.replace(
                "{campaign-id}",
                (getCampaignVersionRequest.getCampaignId() == null) ? "" : StringUtils
                        .fromString(getCampaignVersionRequest.getCampaignId()));
        uriResourcePath = uriResourcePath.replace(
                "{version}",
                (getCampaignVersionRequest.getVersion() == null) ? "" : StringUtils
                        .fromString(getCampaignVersionRequest.getVersion()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
