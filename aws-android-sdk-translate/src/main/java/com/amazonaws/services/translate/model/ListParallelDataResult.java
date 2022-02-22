/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

public class ListParallelDataResult implements Serializable {
    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     */
    private java.util.List<ParallelDataProperties> parallelDataPropertiesList;

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     *
     * @return <p>
     *         The properties of the parallel data resources returned by this
     *         request.
     *         </p>
     */
    public java.util.List<ParallelDataProperties> getParallelDataPropertiesList() {
        return parallelDataPropertiesList;
    }

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     *
     * @param parallelDataPropertiesList <p>
     *            The properties of the parallel data resources returned by this
     *            request.
     *            </p>
     */
    public void setParallelDataPropertiesList(
            java.util.Collection<ParallelDataProperties> parallelDataPropertiesList) {
        if (parallelDataPropertiesList == null) {
            this.parallelDataPropertiesList = null;
            return;
        }

        this.parallelDataPropertiesList = new java.util.ArrayList<ParallelDataProperties>(
                parallelDataPropertiesList);
    }

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataPropertiesList <p>
     *            The properties of the parallel data resources returned by this
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListParallelDataResult withParallelDataPropertiesList(
            ParallelDataProperties... parallelDataPropertiesList) {
        if (getParallelDataPropertiesList() == null) {
            this.parallelDataPropertiesList = new java.util.ArrayList<ParallelDataProperties>(
                    parallelDataPropertiesList.length);
        }
        for (ParallelDataProperties value : parallelDataPropertiesList) {
            this.parallelDataPropertiesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataPropertiesList <p>
     *            The properties of the parallel data resources returned by this
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListParallelDataResult withParallelDataPropertiesList(
            java.util.Collection<ParallelDataProperties> parallelDataPropertiesList) {
        setParallelDataPropertiesList(parallelDataPropertiesList);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @return <p>
     *         The string to use in a subsequent request to get the next page of
     *         results in a paginated response. This value is null if there are
     *         no additional pages.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListParallelDataResult withNextToken(String nextToken) {
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
        if (getParallelDataPropertiesList() != null)
            sb.append("ParallelDataPropertiesList: " + getParallelDataPropertiesList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getParallelDataPropertiesList() == null) ? 0 : getParallelDataPropertiesList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListParallelDataResult == false)
            return false;
        ListParallelDataResult other = (ListParallelDataResult) obj;

        if (other.getParallelDataPropertiesList() == null
                ^ this.getParallelDataPropertiesList() == null)
            return false;
        if (other.getParallelDataPropertiesList() != null
                && other.getParallelDataPropertiesList().equals(
                        this.getParallelDataPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
