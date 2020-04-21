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

package com.amazonaws.services.amazonroute53domains.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Whether the domain name can be transferred to Route 53.
 * </p>
 * <note>
 * <p>
 * You can transfer only domains that have a value of <code>TRANSFERABLE</code>
 * for <code>Transferable</code>.
 * </p>
 * </note>
 * <p>
 * Valid values:
 * </p>
 * <dl>
 * <dt>TRANSFERABLE</dt>
 * <dd>
 * <p>
 * The domain name can be transferred to Route 53.
 * </p>
 * </dd>
 * <dt>UNTRANSFERRABLE</dt>
 * <dd>
 * <p>
 * The domain name can't be transferred to Route 53.
 * </p>
 * </dd>
 * <dt>DONT_KNOW</dt>
 * <dd>
 * <p>
 * Reserved for future use.
 * </p>
 * </dd>
 * </dl>
 */
public enum Transferable {

    TRANSFERABLE("TRANSFERABLE"),
    UNTRANSFERABLE("UNTRANSFERABLE"),
    DONT_KNOW("DONT_KNOW");

    private String value;

    private Transferable(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Transferable> enumMap;
    static {
        enumMap = new HashMap<String, Transferable>();
        enumMap.put("TRANSFERABLE", TRANSFERABLE);
        enumMap.put("UNTRANSFERABLE", UNTRANSFERABLE);
        enumMap.put("DONT_KNOW", DONT_KNOW);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Transferable corresponding to the value
     */
    public static Transferable fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
