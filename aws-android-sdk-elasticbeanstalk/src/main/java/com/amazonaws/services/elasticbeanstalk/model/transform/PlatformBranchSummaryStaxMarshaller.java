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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PlatformBranchSummary
 */
class PlatformBranchSummaryStaxMarshaller {

    public void marshall(PlatformBranchSummary _platformBranchSummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_platformBranchSummary.getPlatformName() != null) {
            prefix = _prefix + "PlatformName";
            String platformName = _platformBranchSummary.getPlatformName();
            request.addParameter(prefix, StringUtils.fromString(platformName));
        }
        if (_platformBranchSummary.getBranchName() != null) {
            prefix = _prefix + "BranchName";
            String branchName = _platformBranchSummary.getBranchName();
            request.addParameter(prefix, StringUtils.fromString(branchName));
        }
        if (_platformBranchSummary.getLifecycleState() != null) {
            prefix = _prefix + "LifecycleState";
            String lifecycleState = _platformBranchSummary.getLifecycleState();
            request.addParameter(prefix, StringUtils.fromString(lifecycleState));
        }
        if (_platformBranchSummary.getBranchOrder() != null) {
            prefix = _prefix + "BranchOrder";
            Integer branchOrder = _platformBranchSummary.getBranchOrder();
            request.addParameter(prefix, StringUtils.fromInteger(branchOrder));
        }
        if (_platformBranchSummary.getSupportedTierList() != null) {
            prefix = _prefix + "SupportedTierList";
            java.util.List<String> supportedTierList = _platformBranchSummary
                    .getSupportedTierList();
            int supportedTierListIndex = 1;
            String supportedTierListPrefix = prefix;
            for (String supportedTierListItem : supportedTierList) {
                prefix = supportedTierListPrefix + ".member." + supportedTierListIndex;
                if (supportedTierListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(supportedTierListItem));
                }
                supportedTierListIndex++;
            }
            prefix = supportedTierListPrefix;
        }
    }

    private static PlatformBranchSummaryStaxMarshaller instance;

    public static PlatformBranchSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PlatformBranchSummaryStaxMarshaller();
        return instance;
    }
}
