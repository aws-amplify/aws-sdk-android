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
 * StAX request marshaller for DescribeHsmClientCertificatesRequest
 */
public class DescribeHsmClientCertificatesRequestMarshaller
        implements
        Marshaller<Request<DescribeHsmClientCertificatesRequest>, DescribeHsmClientCertificatesRequest> {

    public Request<DescribeHsmClientCertificatesRequest> marshall(
            DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest) {
        if (describeHsmClientCertificatesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeHsmClientCertificatesRequest)");
        }

        Request<DescribeHsmClientCertificatesRequest> request = new DefaultRequest<DescribeHsmClientCertificatesRequest>(
                describeHsmClientCertificatesRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeHsmClientCertificates");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeHsmClientCertificatesRequest.getHsmClientCertificateIdentifier() != null) {
            prefix = "HsmClientCertificateIdentifier";
            String hsmClientCertificateIdentifier = describeHsmClientCertificatesRequest
                    .getHsmClientCertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmClientCertificateIdentifier));
        }
        if (describeHsmClientCertificatesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeHsmClientCertificatesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeHsmClientCertificatesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeHsmClientCertificatesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeHsmClientCertificatesRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = describeHsmClientCertificatesRequest.getTagKeys();
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
        if (describeHsmClientCertificatesRequest.getTagValues() != null) {
            prefix = "TagValues";
            java.util.List<String> tagValues = describeHsmClientCertificatesRequest.getTagValues();
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
