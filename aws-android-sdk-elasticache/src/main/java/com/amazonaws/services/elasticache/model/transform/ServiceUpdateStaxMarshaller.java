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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ServiceUpdate
 */
class ServiceUpdateStaxMarshaller {

    public void marshall(ServiceUpdate _serviceUpdate, Request<?> request, String _prefix) {
        String prefix;
        if (_serviceUpdate.getServiceUpdateName() != null) {
            prefix = _prefix + "ServiceUpdateName";
            String serviceUpdateName = _serviceUpdate.getServiceUpdateName();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateName));
        }
        if (_serviceUpdate.getServiceUpdateReleaseDate() != null) {
            prefix = _prefix + "ServiceUpdateReleaseDate";
            java.util.Date serviceUpdateReleaseDate = _serviceUpdate.getServiceUpdateReleaseDate();
            request.addParameter(prefix, StringUtils.fromDate(serviceUpdateReleaseDate));
        }
        if (_serviceUpdate.getServiceUpdateEndDate() != null) {
            prefix = _prefix + "ServiceUpdateEndDate";
            java.util.Date serviceUpdateEndDate = _serviceUpdate.getServiceUpdateEndDate();
            request.addParameter(prefix, StringUtils.fromDate(serviceUpdateEndDate));
        }
        if (_serviceUpdate.getServiceUpdateSeverity() != null) {
            prefix = _prefix + "ServiceUpdateSeverity";
            String serviceUpdateSeverity = _serviceUpdate.getServiceUpdateSeverity();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateSeverity));
        }
        if (_serviceUpdate.getServiceUpdateRecommendedApplyByDate() != null) {
            prefix = _prefix + "ServiceUpdateRecommendedApplyByDate";
            java.util.Date serviceUpdateRecommendedApplyByDate = _serviceUpdate
                    .getServiceUpdateRecommendedApplyByDate();
            request.addParameter(prefix, StringUtils.fromDate(serviceUpdateRecommendedApplyByDate));
        }
        if (_serviceUpdate.getServiceUpdateStatus() != null) {
            prefix = _prefix + "ServiceUpdateStatus";
            String serviceUpdateStatus = _serviceUpdate.getServiceUpdateStatus();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateStatus));
        }
        if (_serviceUpdate.getServiceUpdateDescription() != null) {
            prefix = _prefix + "ServiceUpdateDescription";
            String serviceUpdateDescription = _serviceUpdate.getServiceUpdateDescription();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateDescription));
        }
        if (_serviceUpdate.getServiceUpdateType() != null) {
            prefix = _prefix + "ServiceUpdateType";
            String serviceUpdateType = _serviceUpdate.getServiceUpdateType();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateType));
        }
        if (_serviceUpdate.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _serviceUpdate.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_serviceUpdate.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _serviceUpdate.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_serviceUpdate.getAutoUpdateAfterRecommendedApplyByDate() != null) {
            prefix = _prefix + "AutoUpdateAfterRecommendedApplyByDate";
            Boolean autoUpdateAfterRecommendedApplyByDate = _serviceUpdate
                    .getAutoUpdateAfterRecommendedApplyByDate();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(autoUpdateAfterRecommendedApplyByDate));
        }
        if (_serviceUpdate.getEstimatedUpdateTime() != null) {
            prefix = _prefix + "EstimatedUpdateTime";
            String estimatedUpdateTime = _serviceUpdate.getEstimatedUpdateTime();
            request.addParameter(prefix, StringUtils.fromString(estimatedUpdateTime));
        }
    }

    private static ServiceUpdateStaxMarshaller instance;

    public static ServiceUpdateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceUpdateStaxMarshaller();
        return instance;
    }
}
