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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ResizeInfo
 */
class ResizeInfoStaxMarshaller {

    public void marshall(ResizeInfo _resizeInfo, Request<?> request, String _prefix) {
        String prefix;
        if (_resizeInfo.getResizeType() != null) {
            prefix = _prefix + "ResizeType";
            String resizeType = _resizeInfo.getResizeType();
            request.addParameter(prefix, StringUtils.fromString(resizeType));
        }
        if (_resizeInfo.getAllowCancelResize() != null) {
            prefix = _prefix + "AllowCancelResize";
            Boolean allowCancelResize = _resizeInfo.getAllowCancelResize();
            request.addParameter(prefix, StringUtils.fromBoolean(allowCancelResize));
        }
    }

    private static ResizeInfoStaxMarshaller instance;

    public static ResizeInfoStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResizeInfoStaxMarshaller();
        return instance;
    }
}
