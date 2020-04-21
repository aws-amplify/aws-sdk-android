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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

public class GetFindingsStatisticsResult implements Serializable {
    /**
     * <p>
     * The finding statistics object.
     * </p>
     */
    private FindingStatistics findingStatistics;

    /**
     * <p>
     * The finding statistics object.
     * </p>
     *
     * @return <p>
     *         The finding statistics object.
     *         </p>
     */
    public FindingStatistics getFindingStatistics() {
        return findingStatistics;
    }

    /**
     * <p>
     * The finding statistics object.
     * </p>
     *
     * @param findingStatistics <p>
     *            The finding statistics object.
     *            </p>
     */
    public void setFindingStatistics(FindingStatistics findingStatistics) {
        this.findingStatistics = findingStatistics;
    }

    /**
     * <p>
     * The finding statistics object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingStatistics <p>
     *            The finding statistics object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsStatisticsResult withFindingStatistics(FindingStatistics findingStatistics) {
        this.findingStatistics = findingStatistics;
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
        if (getFindingStatistics() != null)
            sb.append("FindingStatistics: " + getFindingStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFindingStatistics() == null) ? 0 : getFindingStatistics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsStatisticsResult == false)
            return false;
        GetFindingsStatisticsResult other = (GetFindingsStatisticsResult) obj;

        if (other.getFindingStatistics() == null ^ this.getFindingStatistics() == null)
            return false;
        if (other.getFindingStatistics() != null
                && other.getFindingStatistics().equals(this.getFindingStatistics()) == false)
            return false;
        return true;
    }
}
