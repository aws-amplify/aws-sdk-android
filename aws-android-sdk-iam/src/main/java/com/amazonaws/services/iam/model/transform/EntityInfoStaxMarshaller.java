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
 * StAX marshaller for POJO EntityInfo
 */
class EntityInfoStaxMarshaller {

    public void marshall(EntityInfo _entityInfo, Request<?> request, String _prefix) {
        String prefix;
        if (_entityInfo.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _entityInfo.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_entityInfo.getName() != null) {
            prefix = _prefix + "Name";
            String name = _entityInfo.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_entityInfo.getType() != null) {
            prefix = _prefix + "Type";
            String type = _entityInfo.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_entityInfo.getId() != null) {
            prefix = _prefix + "Id";
            String id = _entityInfo.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_entityInfo.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _entityInfo.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
    }

    private static EntityInfoStaxMarshaller instance;

    public static EntityInfoStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EntityInfoStaxMarshaller();
        return instance;
    }
}
