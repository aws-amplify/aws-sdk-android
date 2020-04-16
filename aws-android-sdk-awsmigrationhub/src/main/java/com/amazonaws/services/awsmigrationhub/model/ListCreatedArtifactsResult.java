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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

public class ListCreatedArtifactsResult implements Serializable {
    /**
     * <p>
     * If there are more created artifacts than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified
     * in the request.
     * </p>
     */
    private java.util.List<CreatedArtifact> createdArtifactList;

    /**
     * <p>
     * If there are more created artifacts than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @return <p>
     *         If there are more created artifacts than the max result, return
     *         the next token to be passed to the next call as a bookmark of
     *         where to start from.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are more created artifacts than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If there are more created artifacts than the max result,
     *            return the next token to be passed to the next call as a
     *            bookmark of where to start from.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more created artifacts than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If there are more created artifacts than the max result,
     *            return the next token to be passed to the next call as a
     *            bookmark of where to start from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCreatedArtifactsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified
     * in the request.
     * </p>
     *
     * @return <p>
     *         List of created artifacts up to the maximum number of results
     *         specified in the request.
     *         </p>
     */
    public java.util.List<CreatedArtifact> getCreatedArtifactList() {
        return createdArtifactList;
    }

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified
     * in the request.
     * </p>
     *
     * @param createdArtifactList <p>
     *            List of created artifacts up to the maximum number of results
     *            specified in the request.
     *            </p>
     */
    public void setCreatedArtifactList(java.util.Collection<CreatedArtifact> createdArtifactList) {
        if (createdArtifactList == null) {
            this.createdArtifactList = null;
            return;
        }

        this.createdArtifactList = new java.util.ArrayList<CreatedArtifact>(createdArtifactList);
    }

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified
     * in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdArtifactList <p>
     *            List of created artifacts up to the maximum number of results
     *            specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCreatedArtifactsResult withCreatedArtifactList(
            CreatedArtifact... createdArtifactList) {
        if (getCreatedArtifactList() == null) {
            this.createdArtifactList = new java.util.ArrayList<CreatedArtifact>(
                    createdArtifactList.length);
        }
        for (CreatedArtifact value : createdArtifactList) {
            this.createdArtifactList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified
     * in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdArtifactList <p>
     *            List of created artifacts up to the maximum number of results
     *            specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCreatedArtifactsResult withCreatedArtifactList(
            java.util.Collection<CreatedArtifact> createdArtifactList) {
        setCreatedArtifactList(createdArtifactList);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getCreatedArtifactList() != null)
            sb.append("CreatedArtifactList: " + getCreatedArtifactList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedArtifactList() == null) ? 0 : getCreatedArtifactList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCreatedArtifactsResult == false)
            return false;
        ListCreatedArtifactsResult other = (ListCreatedArtifactsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCreatedArtifactList() == null ^ this.getCreatedArtifactList() == null)
            return false;
        if (other.getCreatedArtifactList() != null
                && other.getCreatedArtifactList().equals(this.getCreatedArtifactList()) == false)
            return false;
        return true;
    }
}
