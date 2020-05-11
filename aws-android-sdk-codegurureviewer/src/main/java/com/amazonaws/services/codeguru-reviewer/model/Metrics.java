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
package com.amazonaws.services.codeguru-reviewer.model;

import java.io.Serializable;


/**
 * <p> Information about the statistics from the code review. </p>
 */
public class Metrics implements Serializable {
    /**
     * <p> Lines of code metered in the code review. </p>
     */
    private Long meteredLinesOfCodeCount;

    /**
     * <p> Total number of recommendations found in the code review. </p>
     */
    private Long findingsCount;

    /**
     * <p> Lines of code metered in the code review. </p>
     *
     * @return <p> Lines of code metered in the code review. </p>
     */
    public Long getMeteredLinesOfCodeCount() {
        return meteredLinesOfCodeCount;
    }

    /**
     * <p> Lines of code metered in the code review. </p>
     *
     * @param meteredLinesOfCodeCount <p> Lines of code metered in the code review. </p>
     */
    public void setMeteredLinesOfCodeCount(Long meteredLinesOfCodeCount) {
        this.meteredLinesOfCodeCount = meteredLinesOfCodeCount;
    }

    /**
     * <p> Lines of code metered in the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param meteredLinesOfCodeCount <p> Lines of code metered in the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Metrics withMeteredLinesOfCodeCount(Long meteredLinesOfCodeCount) {
        this.meteredLinesOfCodeCount = meteredLinesOfCodeCount;
        return this;
    }

    /**
     * <p> Total number of recommendations found in the code review. </p>
     *
     * @return <p> Total number of recommendations found in the code review. </p>
     */
    public Long getFindingsCount() {
        return findingsCount;
    }

    /**
     * <p> Total number of recommendations found in the code review. </p>
     *
     * @param findingsCount <p> Total number of recommendations found in the code review. </p>
     */
    public void setFindingsCount(Long findingsCount) {
        this.findingsCount = findingsCount;
    }

    /**
     * <p> Total number of recommendations found in the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param findingsCount <p> Total number of recommendations found in the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Metrics withFindingsCount(Long findingsCount) {
        this.findingsCount = findingsCount;
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
        if (getMeteredLinesOfCodeCount() != null) sb.append("MeteredLinesOfCodeCount: " + getMeteredLinesOfCodeCount() + ",");
        if (getFindingsCount() != null) sb.append("FindingsCount: " + getFindingsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeteredLinesOfCodeCount() == null) ? 0 : getMeteredLinesOfCodeCount().hashCode());
        hashCode = prime * hashCode + ((getFindingsCount() == null) ? 0 : getFindingsCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Metrics == false) return false;
        Metrics other = (Metrics)obj;

        if (other.getMeteredLinesOfCodeCount() == null ^ this.getMeteredLinesOfCodeCount() == null) return false;
        if (other.getMeteredLinesOfCodeCount() != null && other.getMeteredLinesOfCodeCount().equals(this.getMeteredLinesOfCodeCount()) == false) return false;
        if (other.getFindingsCount() == null ^ this.getFindingsCount() == null) return false;
        if (other.getFindingsCount() != null && other.getFindingsCount().equals(this.getFindingsCount()) == false) return false;
        return true;
    }
}
