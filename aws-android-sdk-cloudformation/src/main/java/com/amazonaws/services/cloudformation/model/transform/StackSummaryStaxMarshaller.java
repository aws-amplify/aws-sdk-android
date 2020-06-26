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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StackSummary
 */
class StackSummaryStaxMarshaller {

    public void marshall(StackSummary _stackSummary, Request<?> request, String _prefix) {
        String prefix;
        if (_stackSummary.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _stackSummary.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_stackSummary.getStackName() != null) {
            prefix = _prefix + "StackName";
            String stackName = _stackSummary.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (_stackSummary.getTemplateDescription() != null) {
            prefix = _prefix + "TemplateDescription";
            String templateDescription = _stackSummary.getTemplateDescription();
            request.addParameter(prefix, StringUtils.fromString(templateDescription));
        }
        if (_stackSummary.getCreationTime() != null) {
            prefix = _prefix + "CreationTime";
            java.util.Date creationTime = _stackSummary.getCreationTime();
            request.addParameter(prefix, StringUtils.fromDate(creationTime));
        }
        if (_stackSummary.getLastUpdatedTime() != null) {
            prefix = _prefix + "LastUpdatedTime";
            java.util.Date lastUpdatedTime = _stackSummary.getLastUpdatedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastUpdatedTime));
        }
        if (_stackSummary.getDeletionTime() != null) {
            prefix = _prefix + "DeletionTime";
            java.util.Date deletionTime = _stackSummary.getDeletionTime();
            request.addParameter(prefix, StringUtils.fromDate(deletionTime));
        }
        if (_stackSummary.getStackStatus() != null) {
            prefix = _prefix + "StackStatus";
            String stackStatus = _stackSummary.getStackStatus();
            request.addParameter(prefix, StringUtils.fromString(stackStatus));
        }
        if (_stackSummary.getStackStatusReason() != null) {
            prefix = _prefix + "StackStatusReason";
            String stackStatusReason = _stackSummary.getStackStatusReason();
            request.addParameter(prefix, StringUtils.fromString(stackStatusReason));
        }
        if (_stackSummary.getParentId() != null) {
            prefix = _prefix + "ParentId";
            String parentId = _stackSummary.getParentId();
            request.addParameter(prefix, StringUtils.fromString(parentId));
        }
        if (_stackSummary.getRootId() != null) {
            prefix = _prefix + "RootId";
            String rootId = _stackSummary.getRootId();
            request.addParameter(prefix, StringUtils.fromString(rootId));
        }
        if (_stackSummary.getDriftInformation() != null) {
            prefix = _prefix + "DriftInformation";
            StackDriftInformationSummary driftInformation = _stackSummary.getDriftInformation();
            StackDriftInformationSummaryStaxMarshaller.getInstance().marshall(driftInformation,
                    request, prefix + ".");
        }
    }

    private static StackSummaryStaxMarshaller instance;

    public static StackSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackSummaryStaxMarshaller();
        return instance;
    }
}
