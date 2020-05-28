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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

public class ListResourceDelegatesResult implements Serializable {
    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     */
    private java.util.List<Delegate> delegates;

    /**
     * <p>
     * The token used to paginate through the delegates associated with a
     * resource. While results are still available, it has an associated value.
     * When the last page is reached, the token is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     *
     * @return <p>
     *         One page of the resource's delegates.
     *         </p>
     */
    public java.util.List<Delegate> getDelegates() {
        return delegates;
    }

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     *
     * @param delegates <p>
     *            One page of the resource's delegates.
     *            </p>
     */
    public void setDelegates(java.util.Collection<Delegate> delegates) {
        if (delegates == null) {
            this.delegates = null;
            return;
        }

        this.delegates = new java.util.ArrayList<Delegate>(delegates);
    }

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegates <p>
     *            One page of the resource's delegates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDelegatesResult withDelegates(Delegate... delegates) {
        if (getDelegates() == null) {
            this.delegates = new java.util.ArrayList<Delegate>(delegates.length);
        }
        for (Delegate value : delegates) {
            this.delegates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One page of the resource's delegates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegates <p>
     *            One page of the resource's delegates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDelegatesResult withDelegates(java.util.Collection<Delegate> delegates) {
        setDelegates(delegates);
        return this;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a
     * resource. While results are still available, it has an associated value.
     * When the last page is reached, the token is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The token used to paginate through the delegates associated with
     *         a resource. While results are still available, it has an
     *         associated value. When the last page is reached, the token is
     *         empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a
     * resource. While results are still available, it has an associated value.
     * When the last page is reached, the token is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token used to paginate through the delegates associated
     *            with a resource. While results are still available, it has an
     *            associated value. When the last page is reached, the token is
     *            empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to paginate through the delegates associated with a
     * resource. While results are still available, it has an associated value.
     * When the last page is reached, the token is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token used to paginate through the delegates associated
     *            with a resource. While results are still available, it has an
     *            associated value. When the last page is reached, the token is
     *            empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceDelegatesResult withNextToken(String nextToken) {
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
        if (getDelegates() != null)
            sb.append("Delegates: " + getDelegates() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelegates() == null) ? 0 : getDelegates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceDelegatesResult == false)
            return false;
        ListResourceDelegatesResult other = (ListResourceDelegatesResult) obj;

        if (other.getDelegates() == null ^ this.getDelegates() == null)
            return false;
        if (other.getDelegates() != null
                && other.getDelegates().equals(this.getDelegates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
