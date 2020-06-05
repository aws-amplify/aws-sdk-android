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
 * StAX marshaller for POJO Restrictions
 */
class RestrictionsStaxMarshaller {

    public void marshall(Restrictions _restrictions, Request<?> request, String _prefix) {
        String prefix;
        if (_restrictions.getGeoRestriction() != null) {
            prefix = _prefix + "GeoRestriction";
            GeoRestriction geoRestriction = _restrictions.getGeoRestriction();
            GeoRestrictionStaxMarshaller.getInstance().marshall(geoRestriction, request,
                    prefix + ".");
        }
    }

    private static RestrictionsStaxMarshaller instance;

    public static RestrictionsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RestrictionsStaxMarshaller();
        return instance;
    }
}
