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

package com.amazonaws.services.quicksight.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Data Source Type
 */
public enum DataSourceType {

    ADOBE_ANALYTICS("ADOBE_ANALYTICS"),
    AMAZON_ELASTICSEARCH("AMAZON_ELASTICSEARCH"),
    ATHENA("ATHENA"),
    AURORA("AURORA"),
    AURORA_POSTGRESQL("AURORA_POSTGRESQL"),
    AWS_IOT_ANALYTICS("AWS_IOT_ANALYTICS"),
    GITHUB("GITHUB"),
    JIRA("JIRA"),
    MARIADB("MARIADB"),
    MYSQL("MYSQL"),
    POSTGRESQL("POSTGRESQL"),
    PRESTO("PRESTO"),
    REDSHIFT("REDSHIFT"),
    S3("S3"),
    SALESFORCE("SALESFORCE"),
    SERVICENOW("SERVICENOW"),
    SNOWFLAKE("SNOWFLAKE"),
    SPARK("SPARK"),
    SQLSERVER("SQLSERVER"),
    TERADATA("TERADATA"),
    TWITTER("TWITTER");

    private String value;

    private DataSourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DataSourceType> enumMap;
    static {
        enumMap = new HashMap<String, DataSourceType>();
        enumMap.put("ADOBE_ANALYTICS", ADOBE_ANALYTICS);
        enumMap.put("AMAZON_ELASTICSEARCH", AMAZON_ELASTICSEARCH);
        enumMap.put("ATHENA", ATHENA);
        enumMap.put("AURORA", AURORA);
        enumMap.put("AURORA_POSTGRESQL", AURORA_POSTGRESQL);
        enumMap.put("AWS_IOT_ANALYTICS", AWS_IOT_ANALYTICS);
        enumMap.put("GITHUB", GITHUB);
        enumMap.put("JIRA", JIRA);
        enumMap.put("MARIADB", MARIADB);
        enumMap.put("MYSQL", MYSQL);
        enumMap.put("POSTGRESQL", POSTGRESQL);
        enumMap.put("PRESTO", PRESTO);
        enumMap.put("REDSHIFT", REDSHIFT);
        enumMap.put("S3", S3);
        enumMap.put("SALESFORCE", SALESFORCE);
        enumMap.put("SERVICENOW", SERVICENOW);
        enumMap.put("SNOWFLAKE", SNOWFLAKE);
        enumMap.put("SPARK", SPARK);
        enumMap.put("SQLSERVER", SQLSERVER);
        enumMap.put("TERADATA", TERADATA);
        enumMap.put("TWITTER", TWITTER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DataSourceType corresponding to the value
     */
    public static DataSourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
