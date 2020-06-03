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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ServiceLastAccessed
 */
class ServiceLastAccessedStaxMarshaller {

    public void marshall(ServiceLastAccessed _serviceLastAccessed, Request<?> request,
            String _prefix) {
        String prefix;
        if (_serviceLastAccessed.getServiceName() != null) {
            prefix = _prefix + "ServiceName";
            String serviceName = _serviceLastAccessed.getServiceName();
            request.addParameter(prefix, StringUtils.fromString(serviceName));
        }
        if (_serviceLastAccessed.getLastAuthenticated() != null) {
            prefix = _prefix + "LastAuthenticated";
            java.util.Date lastAuthenticated = _serviceLastAccessed.getLastAuthenticated();
            request.addParameter(prefix, StringUtils.fromDate(lastAuthenticated));
        }
        if (_serviceLastAccessed.getServiceNamespace() != null) {
            prefix = _prefix + "ServiceNamespace";
            String serviceNamespace = _serviceLastAccessed.getServiceNamespace();
            request.addParameter(prefix, StringUtils.fromString(serviceNamespace));
        }
        if (_serviceLastAccessed.getLastAuthenticatedEntity() != null) {
            prefix = _prefix + "LastAuthenticatedEntity";
            String lastAuthenticatedEntity = _serviceLastAccessed.getLastAuthenticatedEntity();
            request.addParameter(prefix, StringUtils.fromString(lastAuthenticatedEntity));
        }
        if (_serviceLastAccessed.getLastAuthenticatedRegion() != null) {
            prefix = _prefix + "LastAuthenticatedRegion";
            String lastAuthenticatedRegion = _serviceLastAccessed.getLastAuthenticatedRegion();
            request.addParameter(prefix, StringUtils.fromString(lastAuthenticatedRegion));
        }
        if (_serviceLastAccessed.getTotalAuthenticatedEntities() != null) {
            prefix = _prefix + "TotalAuthenticatedEntities";
            Integer totalAuthenticatedEntities = _serviceLastAccessed
                    .getTotalAuthenticatedEntities();
            request.addParameter(prefix, StringUtils.fromInteger(totalAuthenticatedEntities));
        }
        if (_serviceLastAccessed.getTrackedActionsLastAccessed() != null) {
            prefix = _prefix + "TrackedActionsLastAccessed";
            java.util.List<TrackedActionLastAccessed> trackedActionsLastAccessed = _serviceLastAccessed
                    .getTrackedActionsLastAccessed();
            int trackedActionsLastAccessedIndex = 1;
            String trackedActionsLastAccessedPrefix = prefix;
            for (TrackedActionLastAccessed trackedActionsLastAccessedItem : trackedActionsLastAccessed) {
                prefix = trackedActionsLastAccessedPrefix + ".member."
                        + trackedActionsLastAccessedIndex;
                if (trackedActionsLastAccessedItem != null) {
                    TrackedActionLastAccessedStaxMarshaller.getInstance().marshall(
                            trackedActionsLastAccessedItem, request, prefix + ".");
                }
                trackedActionsLastAccessedIndex++;
            }
            prefix = trackedActionsLastAccessedPrefix;
        }
    }

    private static ServiceLastAccessedStaxMarshaller instance;

    public static ServiceLastAccessedStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceLastAccessedStaxMarshaller();
        return instance;
    }
}
