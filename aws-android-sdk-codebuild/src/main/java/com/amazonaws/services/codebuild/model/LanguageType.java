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

package com.amazonaws.services.codebuild.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Language Type
 */
public enum LanguageType {

    JAVA("JAVA"),
    PYTHON("PYTHON"),
    NODE_JS("NODE_JS"),
    RUBY("RUBY"),
    GOLANG("GOLANG"),
    DOCKER("DOCKER"),
    ANDROID("ANDROID"),
    DOTNET("DOTNET"),
    BASE("BASE"),
    PHP("PHP");

    private String value;

    private LanguageType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LanguageType> enumMap;
    static {
        enumMap = new HashMap<String, LanguageType>();
        enumMap.put("JAVA", JAVA);
        enumMap.put("PYTHON", PYTHON);
        enumMap.put("NODE_JS", NODE_JS);
        enumMap.put("RUBY", RUBY);
        enumMap.put("GOLANG", GOLANG);
        enumMap.put("DOCKER", DOCKER);
        enumMap.put("ANDROID", ANDROID);
        enumMap.put("DOTNET", DOTNET);
        enumMap.put("BASE", BASE);
        enumMap.put("PHP", PHP);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LanguageType corresponding to the value
     */
    public static LanguageType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
