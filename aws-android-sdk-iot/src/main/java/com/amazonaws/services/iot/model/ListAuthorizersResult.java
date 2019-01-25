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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListAuthorizersResult implements Serializable {
    /**
     * <p>
     * The authorizers.
     * </p>
     */
    private java.util.List<AuthorizerSummary> authorizers;

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * The authorizers.
     * </p>
     *
     * @return <p>
     *         The authorizers.
     *         </p>
     */
    public java.util.List<AuthorizerSummary> getAuthorizers() {
        return authorizers;
    }

    /**
     * <p>
     * The authorizers.
     * </p>
     *
     * @param authorizers <p>
     *            The authorizers.
     *            </p>
     */
    public void setAuthorizers(java.util.Collection<AuthorizerSummary> authorizers) {
        if (authorizers == null) {
            this.authorizers = null;
            return;
        }

        this.authorizers = new java.util.ArrayList<AuthorizerSummary>(authorizers);
    }

    /**
     * <p>
     * The authorizers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizers <p>
     *            The authorizers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuthorizersResult withAuthorizers(AuthorizerSummary... authorizers) {
        if (getAuthorizers() == null) {
            this.authorizers = new java.util.ArrayList<AuthorizerSummary>(authorizers.length);
        }
        for (AuthorizerSummary value : authorizers) {
            this.authorizers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The authorizers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizers <p>
     *            The authorizers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuthorizersResult withAuthorizers(java.util.Collection<AuthorizerSummary> authorizers) {
        setAuthorizers(authorizers);
        return this;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         A marker used to get the next set of results.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            A marker used to get the next set of results.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A marker used to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            A marker used to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuthorizersResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getAuthorizers() != null)
            sb.append("authorizers: " + getAuthorizers() + ",");
        if (getNextMarker() != null)
            sb.append("nextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizers() == null) ? 0 : getAuthorizers().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuthorizersResult == false)
            return false;
        ListAuthorizersResult other = (ListAuthorizersResult) obj;

        if (other.getAuthorizers() == null ^ this.getAuthorizers() == null)
            return false;
        if (other.getAuthorizers() != null
                && other.getAuthorizers().equals(this.getAuthorizers()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
