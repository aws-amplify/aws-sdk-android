/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

public class ListFragmentsResult implements Serializable {
    /**
     * <p>
     * A list of fragment numbers that correspond to the time stamp range
     * provided.
     * </p>
     */
    private java.util.List<Fragment> fragments = new java.util.ArrayList<Fragment>();

    /**
     * <p>
     * If the returned list is truncated, the operation returns this token to
     * use to retrieve the next page of results. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of fragment numbers that correspond to the time stamp range
     * provided.
     * </p>
     *
     * @return <p>
     *         A list of fragment numbers that correspond to the time stamp
     *         range provided.
     *         </p>
     */
    public java.util.List<Fragment> getFragments() {
        return fragments;
    }

    /**
     * <p>
     * A list of fragment numbers that correspond to the time stamp range
     * provided.
     * </p>
     *
     * @param fragments <p>
     *            A list of fragment numbers that correspond to the time stamp
     *            range provided.
     *            </p>
     */
    public void setFragments(java.util.Collection<Fragment> fragments) {
        if (fragments == null) {
            this.fragments = null;
            return;
        }

        this.fragments = new java.util.ArrayList<Fragment>(fragments);
    }

    /**
     * <p>
     * A list of fragment numbers that correspond to the time stamp range
     * provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fragments <p>
     *            A list of fragment numbers that correspond to the time stamp
     *            range provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFragmentsResult withFragments(Fragment... fragments) {
        if (getFragments() == null) {
            this.fragments = new java.util.ArrayList<Fragment>(fragments.length);
        }
        for (Fragment value : fragments) {
            this.fragments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of fragment numbers that correspond to the time stamp range
     * provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fragments <p>
     *            A list of fragment numbers that correspond to the time stamp
     *            range provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFragmentsResult withFragments(java.util.Collection<Fragment> fragments) {
        setFragments(fragments);
        return this;
    }

    /**
     * <p>
     * If the returned list is truncated, the operation returns this token to
     * use to retrieve the next page of results. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         If the returned list is truncated, the operation returns this
     *         token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the returned list is truncated, the operation returns this token to
     * use to retrieve the next page of results. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            If the returned list is truncated, the operation returns this
     *            token to use to retrieve the next page of results. This value
     *            is <code>null</code> when there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the returned list is truncated, the operation returns this token to
     * use to retrieve the next page of results. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            If the returned list is truncated, the operation returns this
     *            token to use to retrieve the next page of results. This value
     *            is <code>null</code> when there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFragmentsResult withNextToken(String nextToken) {
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
        if (getFragments() != null)
            sb.append("Fragments: " + getFragments() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFragments() == null) ? 0 : getFragments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFragmentsResult == false)
            return false;
        ListFragmentsResult other = (ListFragmentsResult) obj;

        if (other.getFragments() == null ^ this.getFragments() == null)
            return false;
        if (other.getFragments() != null
                && other.getFragments().equals(this.getFragments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
