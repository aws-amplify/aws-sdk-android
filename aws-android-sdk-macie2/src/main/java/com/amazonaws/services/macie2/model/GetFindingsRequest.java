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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about one or more findings.
 * </p>
 */
public class GetFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to
     * retrieve information about.
     * </p>
     */
    private java.util.List<String> findingIds;

    /**
     * <p>
     * The criteria for sorting the results of the request.
     * </p>
     */
    private SortCriteria sortCriteria;

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to
     * retrieve information about.
     * </p>
     *
     * @return <p>
     *         An array of strings that lists the unique identifiers for the
     *         findings to retrieve information about.
     *         </p>
     */
    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to
     * retrieve information about.
     * </p>
     *
     * @param findingIds <p>
     *            An array of strings that lists the unique identifiers for the
     *            findings to retrieve information about.
     *            </p>
     */
    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to
     * retrieve information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            An array of strings that lists the unique identifiers for the
     *            findings to retrieve information about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsRequest withFindingIds(String... findingIds) {
        if (getFindingIds() == null) {
            this.findingIds = new java.util.ArrayList<String>(findingIds.length);
        }
        for (String value : findingIds) {
            this.findingIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the findings to
     * retrieve information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            An array of strings that lists the unique identifiers for the
     *            findings to retrieve information about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsRequest withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
        return this;
    }

    /**
     * <p>
     * The criteria for sorting the results of the request.
     * </p>
     *
     * @return <p>
     *         The criteria for sorting the results of the request.
     *         </p>
     */
    public SortCriteria getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * The criteria for sorting the results of the request.
     * </p>
     *
     * @param sortCriteria <p>
     *            The criteria for sorting the results of the request.
     *            </p>
     */
    public void setSortCriteria(SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * The criteria for sorting the results of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            The criteria for sorting the results of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsRequest withSortCriteria(SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
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
        if (getFindingIds() != null)
            sb.append("findingIds: " + getFindingIds() + ",");
        if (getSortCriteria() != null)
            sb.append("sortCriteria: " + getSortCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        hashCode = prime * hashCode
                + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsRequest == false)
            return false;
        GetFindingsRequest other = (GetFindingsRequest) obj;

        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null
                && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null
                && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        return true;
    }
}
