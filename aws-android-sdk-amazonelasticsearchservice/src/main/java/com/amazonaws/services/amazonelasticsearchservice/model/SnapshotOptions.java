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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the time, in UTC format, when the service takes a daily automated
 * snapshot of the specified Elasticsearch domain. Default value is
 * <code>0</code> hours.
 * </p>
 */
public class SnapshotOptions implements Serializable {
    /**
     * <p>
     * Specifies the time, in UTC format, when the service takes a daily
     * automated snapshot of the specified Elasticsearch domain. Default value
     * is <code>0</code> hours.
     * </p>
     */
    private Integer automatedSnapshotStartHour;

    /**
     * <p>
     * Specifies the time, in UTC format, when the service takes a daily
     * automated snapshot of the specified Elasticsearch domain. Default value
     * is <code>0</code> hours.
     * </p>
     *
     * @return <p>
     *         Specifies the time, in UTC format, when the service takes a daily
     *         automated snapshot of the specified Elasticsearch domain. Default
     *         value is <code>0</code> hours.
     *         </p>
     */
    public Integer getAutomatedSnapshotStartHour() {
        return automatedSnapshotStartHour;
    }

    /**
     * <p>
     * Specifies the time, in UTC format, when the service takes a daily
     * automated snapshot of the specified Elasticsearch domain. Default value
     * is <code>0</code> hours.
     * </p>
     *
     * @param automatedSnapshotStartHour <p>
     *            Specifies the time, in UTC format, when the service takes a
     *            daily automated snapshot of the specified Elasticsearch
     *            domain. Default value is <code>0</code> hours.
     *            </p>
     */
    public void setAutomatedSnapshotStartHour(Integer automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = automatedSnapshotStartHour;
    }

    /**
     * <p>
     * Specifies the time, in UTC format, when the service takes a daily
     * automated snapshot of the specified Elasticsearch domain. Default value
     * is <code>0</code> hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automatedSnapshotStartHour <p>
     *            Specifies the time, in UTC format, when the service takes a
     *            daily automated snapshot of the specified Elasticsearch
     *            domain. Default value is <code>0</code> hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotOptions withAutomatedSnapshotStartHour(Integer automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = automatedSnapshotStartHour;
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
        if (getAutomatedSnapshotStartHour() != null)
            sb.append("AutomatedSnapshotStartHour: " + getAutomatedSnapshotStartHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutomatedSnapshotStartHour() == null) ? 0 : getAutomatedSnapshotStartHour()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotOptions == false)
            return false;
        SnapshotOptions other = (SnapshotOptions) obj;

        if (other.getAutomatedSnapshotStartHour() == null
                ^ this.getAutomatedSnapshotStartHour() == null)
            return false;
        if (other.getAutomatedSnapshotStartHour() != null
                && other.getAutomatedSnapshotStartHour().equals(
                        this.getAutomatedSnapshotStartHour()) == false)
            return false;
        return true;
    }
}
