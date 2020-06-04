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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of resources that are compliant. The summary is organized according
 * to the resource count for each compliance type.
 * </p>
 */
public class CompliantSummary implements Serializable {
    /**
     * <p>
     * The total number of resources that are compliant.
     * </p>
     */
    private Integer compliantCount;

    /**
     * <p>
     * A summary of the compliance severity by compliance type.
     * </p>
     */
    private SeveritySummary severitySummary;

    /**
     * <p>
     * The total number of resources that are compliant.
     * </p>
     *
     * @return <p>
     *         The total number of resources that are compliant.
     *         </p>
     */
    public Integer getCompliantCount() {
        return compliantCount;
    }

    /**
     * <p>
     * The total number of resources that are compliant.
     * </p>
     *
     * @param compliantCount <p>
     *            The total number of resources that are compliant.
     *            </p>
     */
    public void setCompliantCount(Integer compliantCount) {
        this.compliantCount = compliantCount;
    }

    /**
     * <p>
     * The total number of resources that are compliant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compliantCount <p>
     *            The total number of resources that are compliant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompliantSummary withCompliantCount(Integer compliantCount) {
        this.compliantCount = compliantCount;
        return this;
    }

    /**
     * <p>
     * A summary of the compliance severity by compliance type.
     * </p>
     *
     * @return <p>
     *         A summary of the compliance severity by compliance type.
     *         </p>
     */
    public SeveritySummary getSeveritySummary() {
        return severitySummary;
    }

    /**
     * <p>
     * A summary of the compliance severity by compliance type.
     * </p>
     *
     * @param severitySummary <p>
     *            A summary of the compliance severity by compliance type.
     *            </p>
     */
    public void setSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
    }

    /**
     * <p>
     * A summary of the compliance severity by compliance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param severitySummary <p>
     *            A summary of the compliance severity by compliance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompliantSummary withSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
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
        if (getCompliantCount() != null)
            sb.append("CompliantCount: " + getCompliantCount() + ",");
        if (getSeveritySummary() != null)
            sb.append("SeveritySummary: " + getSeveritySummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCompliantCount() == null) ? 0 : getCompliantCount().hashCode());
        hashCode = prime * hashCode
                + ((getSeveritySummary() == null) ? 0 : getSeveritySummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompliantSummary == false)
            return false;
        CompliantSummary other = (CompliantSummary) obj;

        if (other.getCompliantCount() == null ^ this.getCompliantCount() == null)
            return false;
        if (other.getCompliantCount() != null
                && other.getCompliantCount().equals(this.getCompliantCount()) == false)
            return false;
        if (other.getSeveritySummary() == null ^ this.getSeveritySummary() == null)
            return false;
        if (other.getSeveritySummary() != null
                && other.getSeveritySummary().equals(this.getSeveritySummary()) == false)
            return false;
        return true;
    }
}
