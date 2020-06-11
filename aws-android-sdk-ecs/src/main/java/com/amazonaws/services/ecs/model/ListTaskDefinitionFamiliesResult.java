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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class ListTaskDefinitionFamiliesResult implements Serializable {
    /**
     * <p>
     * The list of task definition family names that match the
     * <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     */
    private java.util.List<String> families;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListTaskDefinitionFamilies</code> request. When the results of a
     * <code>ListTaskDefinitionFamilies</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of task definition family names that match the
     * <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     *
     * @return <p>
     *         The list of task definition family names that match the
     *         <code>ListTaskDefinitionFamilies</code> request.
     *         </p>
     */
    public java.util.List<String> getFamilies() {
        return families;
    }

    /**
     * <p>
     * The list of task definition family names that match the
     * <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     *
     * @param families <p>
     *            The list of task definition family names that match the
     *            <code>ListTaskDefinitionFamilies</code> request.
     *            </p>
     */
    public void setFamilies(java.util.Collection<String> families) {
        if (families == null) {
            this.families = null;
            return;
        }

        this.families = new java.util.ArrayList<String>(families);
    }

    /**
     * <p>
     * The list of task definition family names that match the
     * <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param families <p>
     *            The list of task definition family names that match the
     *            <code>ListTaskDefinitionFamilies</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskDefinitionFamiliesResult withFamilies(String... families) {
        if (getFamilies() == null) {
            this.families = new java.util.ArrayList<String>(families.length);
        }
        for (String value : families) {
            this.families.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of task definition family names that match the
     * <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param families <p>
     *            The list of task definition family names that match the
     *            <code>ListTaskDefinitionFamilies</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskDefinitionFamiliesResult withFamilies(java.util.Collection<String> families) {
        setFamilies(families);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListTaskDefinitionFamilies</code> request. When the results of a
     * <code>ListTaskDefinitionFamilies</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>ListTaskDefinitionFamilies</code> request. When the results
     *         of a <code>ListTaskDefinitionFamilies</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the
     *         next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListTaskDefinitionFamilies</code> request. When the results of a
     * <code>ListTaskDefinitionFamilies</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListTaskDefinitionFamilies</code> request. When the
     *            results of a <code>ListTaskDefinitionFamilies</code> request
     *            exceed <code>maxResults</code>, this value can be used to
     *            retrieve the next page of results. This value is
     *            <code>null</code> when there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListTaskDefinitionFamilies</code> request. When the results of a
     * <code>ListTaskDefinitionFamilies</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListTaskDefinitionFamilies</code> request. When the
     *            results of a <code>ListTaskDefinitionFamilies</code> request
     *            exceed <code>maxResults</code>, this value can be used to
     *            retrieve the next page of results. This value is
     *            <code>null</code> when there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskDefinitionFamiliesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getFamilies() != null)
            sb.append("families: " + getFamilies() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamilies() == null) ? 0 : getFamilies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTaskDefinitionFamiliesResult == false)
            return false;
        ListTaskDefinitionFamiliesResult other = (ListTaskDefinitionFamiliesResult) obj;

        if (other.getFamilies() == null ^ this.getFamilies() == null)
            return false;
        if (other.getFamilies() != null && other.getFamilies().equals(this.getFamilies()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
