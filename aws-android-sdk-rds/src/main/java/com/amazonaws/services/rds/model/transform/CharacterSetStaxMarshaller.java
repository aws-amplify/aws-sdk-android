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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CharacterSet
 */
class CharacterSetStaxMarshaller {

    public void marshall(CharacterSet _characterSet, Request<?> request, String _prefix) {
        String prefix;
        if (_characterSet.getCharacterSetName() != null) {
            prefix = _prefix + "CharacterSetName";
            String characterSetName = _characterSet.getCharacterSetName();
            request.addParameter(prefix, StringUtils.fromString(characterSetName));
        }
        if (_characterSet.getCharacterSetDescription() != null) {
            prefix = _prefix + "CharacterSetDescription";
            String characterSetDescription = _characterSet.getCharacterSetDescription();
            request.addParameter(prefix, StringUtils.fromString(characterSetDescription));
        }
    }

    private static CharacterSetStaxMarshaller instance;

    public static CharacterSetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CharacterSetStaxMarshaller();
        return instance;
    }
}
