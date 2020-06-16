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
 * StAX marshaller for POJO Distribution
 */
class DistributionStaxMarshaller {

    public void marshall(Distribution _distribution, Request<?> request, String _prefix) {
        String prefix;
        if (_distribution.getId() != null) {
            prefix = _prefix + "Id";
            String id = _distribution.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_distribution.getARN() != null) {
            prefix = _prefix + "ARN";
            String aRN = _distribution.getARN();
            request.addParameter(prefix, StringUtils.fromString(aRN));
        }
        if (_distribution.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _distribution.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_distribution.getLastModifiedTime() != null) {
            prefix = _prefix + "LastModifiedTime";
            java.util.Date lastModifiedTime = _distribution.getLastModifiedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastModifiedTime));
        }
        if (_distribution.getInProgressInvalidationBatches() != null) {
            prefix = _prefix + "InProgressInvalidationBatches";
            Integer inProgressInvalidationBatches = _distribution
                    .getInProgressInvalidationBatches();
            request.addParameter(prefix, StringUtils.fromInteger(inProgressInvalidationBatches));
        }
        if (_distribution.getDomainName() != null) {
            prefix = _prefix + "DomainName";
            String domainName = _distribution.getDomainName();
            request.addParameter(prefix, StringUtils.fromString(domainName));
        }
        if (_distribution.getActiveTrustedSigners() != null) {
            prefix = _prefix + "ActiveTrustedSigners";
            ActiveTrustedSigners activeTrustedSigners = _distribution.getActiveTrustedSigners();
            ActiveTrustedSignersStaxMarshaller.getInstance().marshall(activeTrustedSigners,
                    request, prefix + ".");
        }
        if (_distribution.getDistributionConfig() != null) {
            prefix = _prefix + "DistributionConfig";
            DistributionConfig distributionConfig = _distribution.getDistributionConfig();
            DistributionConfigStaxMarshaller.getInstance().marshall(distributionConfig, request,
                    prefix + ".");
        }
        if (_distribution.getAliasICPRecordals() != null) {
            prefix = _prefix + "AliasICPRecordals";
            java.util.List<AliasICPRecordal> aliasICPRecordals = _distribution
                    .getAliasICPRecordals();
            int aliasICPRecordalsIndex = 1;
            String aliasICPRecordalsPrefix = prefix;
            for (AliasICPRecordal aliasICPRecordalsItem : aliasICPRecordals) {
                prefix = aliasICPRecordalsPrefix + "." + aliasICPRecordalsIndex;
                if (aliasICPRecordalsItem != null) {
                    AliasICPRecordalStaxMarshaller.getInstance().marshall(aliasICPRecordalsItem,
                            request, prefix + ".");
                }
                aliasICPRecordalsIndex++;
            }
            prefix = aliasICPRecordalsPrefix;
        }
    }

    private static DistributionStaxMarshaller instance;

    public static DistributionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DistributionStaxMarshaller();
        return instance;
    }
}
