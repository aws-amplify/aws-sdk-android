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
 * StAX marshaller for POJO EntityDetails
 */
class EntityDetailsStaxMarshaller {

    public void marshall(EntityDetails _entityDetails, Request<?> request, String _prefix) {
        String prefix;
        if (_entityDetails.getEntityInfo() != null) {
            prefix = _prefix + "EntityInfo";
            EntityInfo entityInfo = _entityDetails.getEntityInfo();
            EntityInfoStaxMarshaller.getInstance().marshall(entityInfo, request, prefix + ".");
        }
        if (_entityDetails.getLastAuthenticated() != null) {
            prefix = _prefix + "LastAuthenticated";
            java.util.Date lastAuthenticated = _entityDetails.getLastAuthenticated();
            request.addParameter(prefix, StringUtils.fromDate(lastAuthenticated));
        }
    }

    private static EntityDetailsStaxMarshaller instance;

    public static EntityDetailsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EntityDetailsStaxMarshaller();
        return instance;
    }
}
