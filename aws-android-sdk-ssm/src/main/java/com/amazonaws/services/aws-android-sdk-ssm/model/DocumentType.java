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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Document Type
 */
public enum DocumentType {

    Command("Command"),
    Policy("Policy"),
    Automation("Automation"),
    Session("Session"),
    Package("Package"),
    ApplicationConfiguration("ApplicationConfiguration"),
    ApplicationConfigurationSchema("ApplicationConfigurationSchema"),
    DeploymentStrategy("DeploymentStrategy"),
    ChangeCalendar("ChangeCalendar");

    private String value;

    private DocumentType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DocumentType> enumMap;
    static {
        enumMap = new HashMap<String, DocumentType>();
        enumMap.put("Command", Command);
        enumMap.put("Policy", Policy);
        enumMap.put("Automation", Automation);
        enumMap.put("Session", Session);
        enumMap.put("Package", Package);
        enumMap.put("ApplicationConfiguration", ApplicationConfiguration);
        enumMap.put("ApplicationConfigurationSchema", ApplicationConfigurationSchema);
        enumMap.put("DeploymentStrategy", DeploymentStrategy);
        enumMap.put("ChangeCalendar", ChangeCalendar);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return DocumentType corresponding to the value
     */
    public static DocumentType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
