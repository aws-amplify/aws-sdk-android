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
 * The configuration setting for the log types to be enabled for export to
 * CloudWatch Logs for a specific DB instance or DB cluster.
 * </p>
 * <p>
 * The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays
 * determine which logs will be exported (or not exported) to CloudWatch Logs.
 * The values within these arrays depend on the DB engine being used. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
 * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS
 * User Guide</i>.
 * </p>
 */
public class CloudwatchLogsExportConfiguration implements Serializable {
    /**
     * <p>
     * The list of log types to enable.
     * </p>
     */
    private java.util.List<String> enableLogTypes;

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     */
    private java.util.List<String> disableLogTypes;

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     *
     * @return <p>
     *         The list of log types to enable.
     *         </p>
     */
    public java.util.List<String> getEnableLogTypes() {
        return enableLogTypes;
    }

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     *
     * @param enableLogTypes <p>
     *            The list of log types to enable.
     *            </p>
     */
    public void setEnableLogTypes(java.util.Collection<String> enableLogTypes) {
        if (enableLogTypes == null) {
            this.enableLogTypes = null;
            return;
        }

        this.enableLogTypes = new java.util.ArrayList<String>(enableLogTypes);
    }

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableLogTypes <p>
     *            The list of log types to enable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchLogsExportConfiguration withEnableLogTypes(String... enableLogTypes) {
        if (getEnableLogTypes() == null) {
            this.enableLogTypes = new java.util.ArrayList<String>(enableLogTypes.length);
        }
        for (String value : enableLogTypes) {
            this.enableLogTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableLogTypes <p>
     *            The list of log types to enable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchLogsExportConfiguration withEnableLogTypes(
            java.util.Collection<String> enableLogTypes) {
        setEnableLogTypes(enableLogTypes);
        return this;
    }

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     *
     * @return <p>
     *         The list of log types to disable.
     *         </p>
     */
    public java.util.List<String> getDisableLogTypes() {
        return disableLogTypes;
    }

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     *
     * @param disableLogTypes <p>
     *            The list of log types to disable.
     *            </p>
     */
    public void setDisableLogTypes(java.util.Collection<String> disableLogTypes) {
        if (disableLogTypes == null) {
            this.disableLogTypes = null;
            return;
        }

        this.disableLogTypes = new java.util.ArrayList<String>(disableLogTypes);
    }

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableLogTypes <p>
     *            The list of log types to disable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchLogsExportConfiguration withDisableLogTypes(String... disableLogTypes) {
        if (getDisableLogTypes() == null) {
            this.disableLogTypes = new java.util.ArrayList<String>(disableLogTypes.length);
        }
        for (String value : disableLogTypes) {
            this.disableLogTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableLogTypes <p>
     *            The list of log types to disable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchLogsExportConfiguration withDisableLogTypes(
            java.util.Collection<String> disableLogTypes) {
        setDisableLogTypes(disableLogTypes);
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
        if (getEnableLogTypes() != null)
            sb.append("EnableLogTypes: " + getEnableLogTypes() + ",");
        if (getDisableLogTypes() != null)
            sb.append("DisableLogTypes: " + getDisableLogTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableLogTypes() == null) ? 0 : getEnableLogTypes().hashCode());
        hashCode = prime * hashCode
                + ((getDisableLogTypes() == null) ? 0 : getDisableLogTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudwatchLogsExportConfiguration == false)
            return false;
        CloudwatchLogsExportConfiguration other = (CloudwatchLogsExportConfiguration) obj;

        if (other.getEnableLogTypes() == null ^ this.getEnableLogTypes() == null)
            return false;
        if (other.getEnableLogTypes() != null
                && other.getEnableLogTypes().equals(this.getEnableLogTypes()) == false)
            return false;
        if (other.getDisableLogTypes() == null ^ this.getDisableLogTypes() == null)
            return false;
        if (other.getDisableLogTypes() != null
                && other.getDisableLogTypes().equals(this.getDisableLogTypes()) == false)
            return false;
        return true;
    }
}
