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

import java.io.Serializable;


/**
 * <p>A summary of resources that are not compliant. The summary is organized according to resource type.</p>
 */
public class NonCompliantSummary implements Serializable {
    /**
     * <p>The total number of compliance items that are not compliant.</p>
     */
    private Integer nonCompliantCount;

    /**
     * <p>A summary of the non-compliance severity by compliance type</p>
     */
    private SeveritySummary severitySummary;

    /**
     * <p>The total number of compliance items that are not compliant.</p>
     *
     * @return <p>The total number of compliance items that are not compliant.</p>
     */
    public Integer getNonCompliantCount() {
        return nonCompliantCount;
    }

    /**
     * <p>The total number of compliance items that are not compliant.</p>
     *
     * @param nonCompliantCount <p>The total number of compliance items that are not compliant.</p>
     */
    public void setNonCompliantCount(Integer nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
    }

    /**
     * <p>The total number of compliance items that are not compliant.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nonCompliantCount <p>The total number of compliance items that are not compliant.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public NonCompliantSummary withNonCompliantCount(Integer nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
        return this;
    }

    /**
     * <p>A summary of the non-compliance severity by compliance type</p>
     *
     * @return <p>A summary of the non-compliance severity by compliance type</p>
     */
    public SeveritySummary getSeveritySummary() {
        return severitySummary;
    }

    /**
     * <p>A summary of the non-compliance severity by compliance type</p>
     *
     * @param severitySummary <p>A summary of the non-compliance severity by compliance type</p>
     */
    public void setSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
    }

    /**
     * <p>A summary of the non-compliance severity by compliance type</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severitySummary <p>A summary of the non-compliance severity by compliance type</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public NonCompliantSummary withSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNonCompliantCount() != null) sb.append("NonCompliantCount: " + getNonCompliantCount() + ",");
        if (getSeveritySummary() != null) sb.append("SeveritySummary: " + getSeveritySummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNonCompliantCount() == null) ? 0 : getNonCompliantCount().hashCode());
        hashCode = prime * hashCode + ((getSeveritySummary() == null) ? 0 : getSeveritySummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NonCompliantSummary == false) return false;
        NonCompliantSummary other = (NonCompliantSummary)obj;

        if (other.getNonCompliantCount() == null ^ this.getNonCompliantCount() == null) return false;
        if (other.getNonCompliantCount() != null && other.getNonCompliantCount().equals(this.getNonCompliantCount()) == false) return false;
        if (other.getSeveritySummary() == null ^ this.getSeveritySummary() == null) return false;
        if (other.getSeveritySummary() != null && other.getSeveritySummary().equals(this.getSeveritySummary()) == false) return false;
        return true;
    }
}
