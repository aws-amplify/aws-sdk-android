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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * A list of the log types whose configuration is still pending. In other words,
 * these log types are in the process of being activated or deactivated.
 * </p>
 */
public class PendingCloudwatchLogsExports implements Serializable {
    /**
     * <p>
     * Log types that are in the process of being deactivated. After they are
     * deactivated, these log types aren't exported to CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> logTypesToEnable;

    /**
     * <p>
     * Log types that are in the process of being enabled. After they are
     * enabled, these log types are exported to CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> logTypesToDisable;

    /**
     * <p>
     * Log types that are in the process of being deactivated. After they are
     * deactivated, these log types aren't exported to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         Log types that are in the process of being deactivated. After
     *         they are deactivated, these log types aren't exported to
     *         CloudWatch Logs.
     *         </p>
     */
    public java.util.List<String> getLogTypesToEnable() {
        return logTypesToEnable;
    }

    /**
     * <p>
     * Log types that are in the process of being deactivated. After they are
     * deactivated, these log types aren't exported to CloudWatch Logs.
     * </p>
     *
     * @param logTypesToEnable <p>
     *            Log types that are in the process of being deactivated. After
     *            they are deactivated, these log types aren't exported to
     *            CloudWatch Logs.
     *            </p>
     */
    public void setLogTypesToEnable(java.util.Collection<String> logTypesToEnable) {
        if (logTypesToEnable == null) {
            this.logTypesToEnable = null;
            return;
        }

        this.logTypesToEnable = new java.util.ArrayList<String>(logTypesToEnable);
    }

    /**
     * <p>
     * Log types that are in the process of being deactivated. After they are
     * deactivated, these log types aren't exported to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logTypesToEnable <p>
     *            Log types that are in the process of being deactivated. After
     *            they are deactivated, these log types aren't exported to
     *            CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingCloudwatchLogsExports withLogTypesToEnable(String... logTypesToEnable) {
        if (getLogTypesToEnable() == null) {
            this.logTypesToEnable = new java.util.ArrayList<String>(logTypesToEnable.length);
        }
        for (String value : logTypesToEnable) {
            this.logTypesToEnable.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Log types that are in the process of being deactivated. After they are
     * deactivated, these log types aren't exported to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logTypesToEnable <p>
     *            Log types that are in the process of being deactivated. After
     *            they are deactivated, these log types aren't exported to
     *            CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingCloudwatchLogsExports withLogTypesToEnable(
            java.util.Collection<String> logTypesToEnable) {
        setLogTypesToEnable(logTypesToEnable);
        return this;
    }

    /**
     * <p>
     * Log types that are in the process of being enabled. After they are
     * enabled, these log types are exported to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         Log types that are in the process of being enabled. After they
     *         are enabled, these log types are exported to CloudWatch Logs.
     *         </p>
     */
    public java.util.List<String> getLogTypesToDisable() {
        return logTypesToDisable;
    }

    /**
     * <p>
     * Log types that are in the process of being enabled. After they are
     * enabled, these log types are exported to CloudWatch Logs.
     * </p>
     *
     * @param logTypesToDisable <p>
     *            Log types that are in the process of being enabled. After they
     *            are enabled, these log types are exported to CloudWatch Logs.
     *            </p>
     */
    public void setLogTypesToDisable(java.util.Collection<String> logTypesToDisable) {
        if (logTypesToDisable == null) {
            this.logTypesToDisable = null;
            return;
        }

        this.logTypesToDisable = new java.util.ArrayList<String>(logTypesToDisable);
    }

    /**
     * <p>
     * Log types that are in the process of being enabled. After they are
     * enabled, these log types are exported to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logTypesToDisable <p>
     *            Log types that are in the process of being enabled. After they
     *            are enabled, these log types are exported to CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingCloudwatchLogsExports withLogTypesToDisable(String... logTypesToDisable) {
        if (getLogTypesToDisable() == null) {
            this.logTypesToDisable = new java.util.ArrayList<String>(logTypesToDisable.length);
        }
        for (String value : logTypesToDisable) {
            this.logTypesToDisable.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Log types that are in the process of being enabled. After they are
     * enabled, these log types are exported to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logTypesToDisable <p>
     *            Log types that are in the process of being enabled. After they
     *            are enabled, these log types are exported to CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingCloudwatchLogsExports withLogTypesToDisable(
            java.util.Collection<String> logTypesToDisable) {
        setLogTypesToDisable(logTypesToDisable);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLogTypesToEnable() != null)
            sb.append("LogTypesToEnable: " + getLogTypesToEnable() + ",");
        if (getLogTypesToDisable() != null)
            sb.append("LogTypesToDisable: " + getLogTypesToDisable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogTypesToEnable() == null) ? 0 : getLogTypesToEnable().hashCode());
        hashCode = prime * hashCode
                + ((getLogTypesToDisable() == null) ? 0 : getLogTypesToDisable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingCloudwatchLogsExports == false)
            return false;
        PendingCloudwatchLogsExports other = (PendingCloudwatchLogsExports) obj;

        if (other.getLogTypesToEnable() == null ^ this.getLogTypesToEnable() == null)
            return false;
        if (other.getLogTypesToEnable() != null
                && other.getLogTypesToEnable().equals(this.getLogTypesToEnable()) == false)
            return false;
        if (other.getLogTypesToDisable() == null ^ this.getLogTypesToDisable() == null)
            return false;
        if (other.getLogTypesToDisable() != null
                && other.getLogTypesToDisable().equals(this.getLogTypesToDisable()) == false)
            return false;
        return true;
    }
}
