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
 * StAX marshaller for POJO PlatformSummary
 */
class PlatformSummaryStaxMarshaller {

    public void marshall(PlatformSummary _platformSummary, Request<?> request, String _prefix) {
        String prefix;
        if (_platformSummary.getPlatformArn() != null) {
            prefix = _prefix + "PlatformArn";
            String platformArn = _platformSummary.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (_platformSummary.getPlatformOwner() != null) {
            prefix = _prefix + "PlatformOwner";
            String platformOwner = _platformSummary.getPlatformOwner();
            request.addParameter(prefix, StringUtils.fromString(platformOwner));
        }
        if (_platformSummary.getPlatformStatus() != null) {
            prefix = _prefix + "PlatformStatus";
            String platformStatus = _platformSummary.getPlatformStatus();
            request.addParameter(prefix, StringUtils.fromString(platformStatus));
        }
        if (_platformSummary.getPlatformCategory() != null) {
            prefix = _prefix + "PlatformCategory";
            String platformCategory = _platformSummary.getPlatformCategory();
            request.addParameter(prefix, StringUtils.fromString(platformCategory));
        }
        if (_platformSummary.getOperatingSystemName() != null) {
            prefix = _prefix + "OperatingSystemName";
            String operatingSystemName = _platformSummary.getOperatingSystemName();
            request.addParameter(prefix, StringUtils.fromString(operatingSystemName));
        }
        if (_platformSummary.getOperatingSystemVersion() != null) {
            prefix = _prefix + "OperatingSystemVersion";
            String operatingSystemVersion = _platformSummary.getOperatingSystemVersion();
            request.addParameter(prefix, StringUtils.fromString(operatingSystemVersion));
        }
        if (_platformSummary.getSupportedTierList() != null) {
            prefix = _prefix + "SupportedTierList";
            java.util.List<String> supportedTierList = _platformSummary.getSupportedTierList();
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
        if (_platformSummary.getSupportedAddonList() != null) {
            prefix = _prefix + "SupportedAddonList";
            java.util.List<String> supportedAddonList = _platformSummary.getSupportedAddonList();
            int supportedAddonListIndex = 1;
            String supportedAddonListPrefix = prefix;
            for (String supportedAddonListItem : supportedAddonList) {
                prefix = supportedAddonListPrefix + ".member." + supportedAddonListIndex;
                if (supportedAddonListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(supportedAddonListItem));
                }
                supportedAddonListIndex++;
            }
            prefix = supportedAddonListPrefix;
        }
        if (_platformSummary.getPlatformLifecycleState() != null) {
            prefix = _prefix + "PlatformLifecycleState";
            String platformLifecycleState = _platformSummary.getPlatformLifecycleState();
            request.addParameter(prefix, StringUtils.fromString(platformLifecycleState));
        }
        if (_platformSummary.getPlatformVersion() != null) {
            prefix = _prefix + "PlatformVersion";
            String platformVersion = _platformSummary.getPlatformVersion();
            request.addParameter(prefix, StringUtils.fromString(platformVersion));
        }
        if (_platformSummary.getPlatformBranchName() != null) {
            prefix = _prefix + "PlatformBranchName";
            String platformBranchName = _platformSummary.getPlatformBranchName();
            request.addParameter(prefix, StringUtils.fromString(platformBranchName));
        }
        if (_platformSummary.getPlatformBranchLifecycleState() != null) {
            prefix = _prefix + "PlatformBranchLifecycleState";
            String platformBranchLifecycleState = _platformSummary
                    .getPlatformBranchLifecycleState();
            request.addParameter(prefix, StringUtils.fromString(platformBranchLifecycleState));
        }
    }

    private static PlatformSummaryStaxMarshaller instance;

    public static PlatformSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PlatformSummaryStaxMarshaller();
        return instance;
    }
}
