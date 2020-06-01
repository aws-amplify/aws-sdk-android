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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about a single query. Requires that you have access to
 * the workgroup in which the query was saved.
 * </p>
 */
public class GetNamedQueryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * </p>
     */
    private String namedQueryId;

    /**
     * <p>
     * The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * </p>
     *
     * @return <p>
     *         The unique ID of the query. Use <a>ListNamedQueries</a> to get
     *         query IDs.
     *         </p>
     */
    public String getNamedQueryId() {
        return namedQueryId;
    }

    /**
     * <p>
     * The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * </p>
     *
     * @param namedQueryId <p>
     *            The unique ID of the query. Use <a>ListNamedQueries</a> to get
     *            query IDs.
     *            </p>
     */
    public void setNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }

    /**
     * <p>
     * The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedQueryId <p>
     *            The unique ID of the query. Use <a>ListNamedQueries</a> to get
     *            query IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetNamedQueryRequest withNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
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
        if (getNamedQueryId() != null)
            sb.append("NamedQueryId: " + getNamedQueryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNamedQueryId() == null) ? 0 : getNamedQueryId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNamedQueryRequest == false)
            return false;
        GetNamedQueryRequest other = (GetNamedQueryRequest) obj;

        if (other.getNamedQueryId() == null ^ this.getNamedQueryId() == null)
            return false;
        if (other.getNamedQueryId() != null
                && other.getNamedQueryId().equals(this.getNamedQueryId()) == false)
            return false;
        return true;
    }
}
