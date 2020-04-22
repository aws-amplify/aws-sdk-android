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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeTagsRequest
 */
public class DescribeTagsRequestMarshaller implements
        Marshaller<Request<DescribeTagsRequest>, DescribeTagsRequest> {

    public Request<DescribeTagsRequest> marshall(DescribeTagsRequest describeTagsRequest) {
        if (describeTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeTagsRequest)");
        }

        Request<DescribeTagsRequest> request = new DefaultRequest<DescribeTagsRequest>(
                describeTagsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeTags");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeTagsRequest.getResourceName() != null) {
            prefix = "ResourceName";
            String resourceName = describeTagsRequest.getResourceName();
            request.addParameter(prefix, StringUtils.fromString(resourceName));
        }
        if (describeTagsRequest.getResourceType() != null) {
            prefix = "ResourceType";
            String resourceType = describeTagsRequest.getResourceType();
            request.addParameter(prefix, StringUtils.fromString(resourceType));
        }
        if (describeTagsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeTagsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeTagsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeTagsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeTagsRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = describeTagsRequest.getTagKeys();
            int tagKeysIndex = 1;
            String tagKeysPrefix = prefix;
            for (String tagKeysItem : tagKeys) {
                prefix = tagKeysPrefix + "." + tagKeysIndex;
                if (tagKeysItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagKeysItem));
                }
                tagKeysIndex++;
            }
            prefix = tagKeysPrefix;
        }
        if (describeTagsRequest.getTagValues() != null) {
            prefix = "TagValues";
            java.util.List<String> tagValues = describeTagsRequest.getTagValues();
            int tagValuesIndex = 1;
            String tagValuesPrefix = prefix;
            for (String tagValuesItem : tagValues) {
                prefix = tagValuesPrefix + "." + tagValuesIndex;
                if (tagValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagValuesItem));
                }
                tagValuesIndex++;
            }
            prefix = tagValuesPrefix;
        }

        return request;
    }
}
