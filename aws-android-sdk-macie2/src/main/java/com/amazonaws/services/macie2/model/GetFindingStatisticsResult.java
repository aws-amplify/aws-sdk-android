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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class GetFindingStatisticsResult implements Serializable {
    /**
     * <p>
     * An array of objects, one for each group of findings that meet the filter
     * criteria specified in the request.
     * </p>
     */
    private java.util.List<GroupCount> countsByGroup;

    /**
     * <p>
     * An array of objects, one for each group of findings that meet the filter
     * criteria specified in the request.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each group of findings that meet the
     *         filter criteria specified in the request.
     *         </p>
     */
    public java.util.List<GroupCount> getCountsByGroup() {
        return countsByGroup;
    }

    /**
     * <p>
     * An array of objects, one for each group of findings that meet the filter
     * criteria specified in the request.
     * </p>
     *
     * @param countsByGroup <p>
     *            An array of objects, one for each group of findings that meet
     *            the filter criteria specified in the request.
     *            </p>
     */
    public void setCountsByGroup(java.util.Collection<GroupCount> countsByGroup) {
        if (countsByGroup == null) {
            this.countsByGroup = null;
            return;
        }

        this.countsByGroup = new java.util.ArrayList<GroupCount>(countsByGroup);
    }

    /**
     * <p>
     * An array of objects, one for each group of findings that meet the filter
     * criteria specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countsByGroup <p>
     *            An array of objects, one for each group of findings that meet
     *            the filter criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingStatisticsResult withCountsByGroup(GroupCount... countsByGroup) {
        if (getCountsByGroup() == null) {
            this.countsByGroup = new java.util.ArrayList<GroupCount>(countsByGroup.length);
        }
        for (GroupCount value : countsByGroup) {
            this.countsByGroup.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each group of findings that meet the filter
     * criteria specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countsByGroup <p>
     *            An array of objects, one for each group of findings that meet
     *            the filter criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingStatisticsResult withCountsByGroup(
            java.util.Collection<GroupCount> countsByGroup) {
        setCountsByGroup(countsByGroup);
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
        if (getCountsByGroup() != null)
            sb.append("countsByGroup: " + getCountsByGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCountsByGroup() == null) ? 0 : getCountsByGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingStatisticsResult == false)
            return false;
        GetFindingStatisticsResult other = (GetFindingStatisticsResult) obj;

        if (other.getCountsByGroup() == null ^ this.getCountsByGroup() == null)
            return false;
        if (other.getCountsByGroup() != null
                && other.getCountsByGroup().equals(this.getCountsByGroup()) == false)
            return false;
        return true;
    }
}
