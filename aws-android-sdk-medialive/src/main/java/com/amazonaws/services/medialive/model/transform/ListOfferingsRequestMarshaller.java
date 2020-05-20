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

package com.amazonaws.services.medialive.model.transform;

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
import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListOfferingsRequest
 */
public class ListOfferingsRequestMarshaller implements
        Marshaller<Request<ListOfferingsRequest>, ListOfferingsRequest> {

    public Request<ListOfferingsRequest> marshall(ListOfferingsRequest listOfferingsRequest) {
        if (listOfferingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListOfferingsRequest)");
        }

        Request<ListOfferingsRequest> request = new DefaultRequest<ListOfferingsRequest>(
                listOfferingsRequest, "AWSElementalMediaLive");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/prod/offerings";
        if (listOfferingsRequest.getChannelClass() != null) {
            request.addParameter("channelClass",
                    StringUtils.fromString(listOfferingsRequest.getChannelClass()));
        }
        if (listOfferingsRequest.getChannelConfiguration() != null) {
            request.addParameter("channelConfiguration",
                    StringUtils.fromString(listOfferingsRequest.getChannelConfiguration()));
        }
        if (listOfferingsRequest.getCodec() != null) {
            request.addParameter("codec", StringUtils.fromString(listOfferingsRequest.getCodec()));
        }
        if (listOfferingsRequest.getDuration() != null) {
            request.addParameter("duration",
                    StringUtils.fromString(listOfferingsRequest.getDuration()));
        }
        if (listOfferingsRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listOfferingsRequest.getMaxResults()));
        }
        if (listOfferingsRequest.getMaximumBitrate() != null) {
            request.addParameter("maximumBitrate",
                    StringUtils.fromString(listOfferingsRequest.getMaximumBitrate()));
        }
        if (listOfferingsRequest.getMaximumFramerate() != null) {
            request.addParameter("maximumFramerate",
                    StringUtils.fromString(listOfferingsRequest.getMaximumFramerate()));
        }
        if (listOfferingsRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listOfferingsRequest.getNextToken()));
        }
        if (listOfferingsRequest.getResolution() != null) {
            request.addParameter("resolution",
                    StringUtils.fromString(listOfferingsRequest.getResolution()));
        }
        if (listOfferingsRequest.getResourceType() != null) {
            request.addParameter("resourceType",
                    StringUtils.fromString(listOfferingsRequest.getResourceType()));
        }
        if (listOfferingsRequest.getSpecialFeature() != null) {
            request.addParameter("specialFeature",
                    StringUtils.fromString(listOfferingsRequest.getSpecialFeature()));
        }
        if (listOfferingsRequest.getVideoQuality() != null) {
            request.addParameter("videoQuality",
                    StringUtils.fromString(listOfferingsRequest.getVideoQuality()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
