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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StreamingDistribution
 */
class StreamingDistributionStaxMarshaller {

    public void marshall(StreamingDistribution _streamingDistribution, Request<?> request,
            String _prefix) {
        String prefix;
        if (_streamingDistribution.getId() != null) {
            prefix = _prefix + "Id";
            String id = _streamingDistribution.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_streamingDistribution.getARN() != null) {
            prefix = _prefix + "ARN";
            String aRN = _streamingDistribution.getARN();
            request.addParameter(prefix, StringUtils.fromString(aRN));
        }
        if (_streamingDistribution.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _streamingDistribution.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_streamingDistribution.getLastModifiedTime() != null) {
            prefix = _prefix + "LastModifiedTime";
            java.util.Date lastModifiedTime = _streamingDistribution.getLastModifiedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastModifiedTime));
        }
        if (_streamingDistribution.getDomainName() != null) {
            prefix = _prefix + "DomainName";
            String domainName = _streamingDistribution.getDomainName();
            request.addParameter(prefix, StringUtils.fromString(domainName));
        }
        if (_streamingDistribution.getActiveTrustedSigners() != null) {
            prefix = _prefix + "ActiveTrustedSigners";
            ActiveTrustedSigners activeTrustedSigners = _streamingDistribution
                    .getActiveTrustedSigners();
            ActiveTrustedSignersStaxMarshaller.getInstance().marshall(activeTrustedSigners,
                    request, prefix + ".");
        }
        if (_streamingDistribution.getStreamingDistributionConfig() != null) {
            prefix = _prefix + "StreamingDistributionConfig";
            StreamingDistributionConfig streamingDistributionConfig = _streamingDistribution
                    .getStreamingDistributionConfig();
            StreamingDistributionConfigStaxMarshaller.getInstance().marshall(
                    streamingDistributionConfig, request, prefix + ".");
        }
    }

    private static StreamingDistributionStaxMarshaller instance;

    public static StreamingDistributionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StreamingDistributionStaxMarshaller();
        return instance;
    }
}
