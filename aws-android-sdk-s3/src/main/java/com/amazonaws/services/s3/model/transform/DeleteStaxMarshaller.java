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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Delete
 */
class DeleteStaxMarshaller {

    public void marshall(Delete _delete, Request<?> request, String _prefix) {
        String prefix;
        if (_delete.getObjects() != null) {
            prefix = _prefix + "Objects";
            java.util.List<ObjectIdentifier> objects = _delete.getObjects();
            int objectsIndex = 1;
            String objectsPrefix = prefix;
            for (ObjectIdentifier objectsItem : objects) {
                prefix = objectsPrefix + ".member." + objectsIndex;
                if (objectsItem != null) {
                    ObjectIdentifierStaxMarshaller.getInstance().marshall(objectsItem, request,
                            prefix + ".");
                }
                objectsIndex++;
            }
            prefix = objectsPrefix;
        }
        if (_delete.getQuiet() != null) {
            prefix = _prefix + "Quiet";
            Boolean quiet = _delete.getQuiet();
            request.addParameter(prefix, StringUtils.fromBoolean(quiet));
        }
    }

    private static DeleteStaxMarshaller instance;

    public static DeleteStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteStaxMarshaller();
        return instance;
    }
}
