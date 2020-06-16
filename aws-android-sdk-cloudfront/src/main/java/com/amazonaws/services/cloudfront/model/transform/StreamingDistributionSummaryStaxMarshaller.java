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
 * StAX marshaller for POJO StreamingDistributionSummary
 */
class StreamingDistributionSummaryStaxMarshaller {

    public void marshall(StreamingDistributionSummary _streamingDistributionSummary,
            Request<?> request, String _prefix) {
        String prefix;
        if (_streamingDistributionSummary.getId() != null) {
            prefix = _prefix + "Id";
            String id = _streamingDistributionSummary.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_streamingDistributionSummary.getARN() != null) {
            prefix = _prefix + "ARN";
            String aRN = _streamingDistributionSummary.getARN();
            request.addParameter(prefix, StringUtils.fromString(aRN));
        }
        if (_streamingDistributionSummary.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _streamingDistributionSummary.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_streamingDistributionSummary.getLastModifiedTime() != null) {
            prefix = _prefix + "LastModifiedTime";
            java.util.Date lastModifiedTime = _streamingDistributionSummary.getLastModifiedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastModifiedTime));
        }
        if (_streamingDistributionSummary.getDomainName() != null) {
            prefix = _prefix + "DomainName";
            String domainName = _streamingDistributionSummary.getDomainName();
            request.addParameter(prefix, StringUtils.fromString(domainName));
        }
        if (_streamingDistributionSummary.getS3Origin() != null) {
            prefix = _prefix + "S3Origin";
            S3Origin s3Origin = _streamingDistributionSummary.getS3Origin();
            S3OriginStaxMarshaller.getInstance().marshall(s3Origin, request, prefix + ".");
        }
        if (_streamingDistributionSummary.getAliases() != null) {
            prefix = _prefix + "Aliases";
            Aliases aliases = _streamingDistributionSummary.getAliases();
            AliasesStaxMarshaller.getInstance().marshall(aliases, request, prefix + ".");
        }
        if (_streamingDistributionSummary.getTrustedSigners() != null) {
            prefix = _prefix + "TrustedSigners";
            TrustedSigners trustedSigners = _streamingDistributionSummary.getTrustedSigners();
            TrustedSignersStaxMarshaller.getInstance().marshall(trustedSigners, request,
                    prefix + ".");
        }
        if (_streamingDistributionSummary.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _streamingDistributionSummary.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
        if (_streamingDistributionSummary.getPriceClass() != null) {
            prefix = _prefix + "PriceClass";
            String priceClass = _streamingDistributionSummary.getPriceClass();
            request.addParameter(prefix, StringUtils.fromString(priceClass));
        }
        if (_streamingDistributionSummary.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _streamingDistributionSummary.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
    }

    private static StreamingDistributionSummaryStaxMarshaller instance;

    public static StreamingDistributionSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StreamingDistributionSummaryStaxMarshaller();
        return instance;
    }
}
