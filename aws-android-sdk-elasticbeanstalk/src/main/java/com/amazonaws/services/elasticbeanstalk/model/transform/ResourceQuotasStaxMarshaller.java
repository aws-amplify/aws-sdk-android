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
 * StAX marshaller for POJO ResourceQuotas
 */
class ResourceQuotasStaxMarshaller {

    public void marshall(ResourceQuotas _resourceQuotas, Request<?> request, String _prefix) {
        String prefix;
        if (_resourceQuotas.getApplicationQuota() != null) {
            prefix = _prefix + "ApplicationQuota";
            ResourceQuota applicationQuota = _resourceQuotas.getApplicationQuota();
            ResourceQuotaStaxMarshaller.getInstance().marshall(applicationQuota, request,
                    prefix + ".");
        }
        if (_resourceQuotas.getApplicationVersionQuota() != null) {
            prefix = _prefix + "ApplicationVersionQuota";
            ResourceQuota applicationVersionQuota = _resourceQuotas.getApplicationVersionQuota();
            ResourceQuotaStaxMarshaller.getInstance().marshall(applicationVersionQuota, request,
                    prefix + ".");
        }
        if (_resourceQuotas.getEnvironmentQuota() != null) {
            prefix = _prefix + "EnvironmentQuota";
            ResourceQuota environmentQuota = _resourceQuotas.getEnvironmentQuota();
            ResourceQuotaStaxMarshaller.getInstance().marshall(environmentQuota, request,
                    prefix + ".");
        }
        if (_resourceQuotas.getConfigurationTemplateQuota() != null) {
            prefix = _prefix + "ConfigurationTemplateQuota";
            ResourceQuota configurationTemplateQuota = _resourceQuotas
                    .getConfigurationTemplateQuota();
            ResourceQuotaStaxMarshaller.getInstance().marshall(configurationTemplateQuota, request,
                    prefix + ".");
        }
        if (_resourceQuotas.getCustomPlatformQuota() != null) {
            prefix = _prefix + "CustomPlatformQuota";
            ResourceQuota customPlatformQuota = _resourceQuotas.getCustomPlatformQuota();
            ResourceQuotaStaxMarshaller.getInstance().marshall(customPlatformQuota, request,
                    prefix + ".");
        }
    }

    private static ResourceQuotasStaxMarshaller instance;

    public static ResourceQuotasStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceQuotasStaxMarshaller();
        return instance;
    }
}
