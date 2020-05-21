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
 * StAX marshaller for POJO RestoreRequest
 */
class RestoreRequestStaxMarshaller {

    public void marshall(RestoreRequest _restoreRequest, Request<?> request, String _prefix) {
        String prefix;
        if (_restoreRequest.getDays() != null) {
            prefix = _prefix + "Days";
            Integer days = _restoreRequest.getDays();
            request.addParameter(prefix, StringUtils.fromInteger(days));
        }
        if (_restoreRequest.getGlacierJobParameters() != null) {
            prefix = _prefix + "GlacierJobParameters";
            GlacierJobParameters glacierJobParameters = _restoreRequest.getGlacierJobParameters();
            GlacierJobParametersStaxMarshaller.getInstance().marshall(glacierJobParameters,
                    request, prefix + ".");
        }
        if (_restoreRequest.getType() != null) {
            prefix = _prefix + "Type";
            String type = _restoreRequest.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_restoreRequest.getTier() != null) {
            prefix = _prefix + "Tier";
            String tier = _restoreRequest.getTier();
            request.addParameter(prefix, StringUtils.fromString(tier));
        }
        if (_restoreRequest.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _restoreRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_restoreRequest.getSelectParameters() != null) {
            prefix = _prefix + "SelectParameters";
            SelectParameters selectParameters = _restoreRequest.getSelectParameters();
            SelectParametersStaxMarshaller.getInstance().marshall(selectParameters, request,
                    prefix + ".");
        }
        if (_restoreRequest.getOutputLocation() != null) {
            prefix = _prefix + "OutputLocation";
            OutputLocation outputLocation = _restoreRequest.getOutputLocation();
            OutputLocationStaxMarshaller.getInstance().marshall(outputLocation, request,
                    prefix + ".");
        }
    }

    private static RestoreRequestStaxMarshaller instance;

    public static RestoreRequestStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RestoreRequestStaxMarshaller();
        return instance;
    }
}
