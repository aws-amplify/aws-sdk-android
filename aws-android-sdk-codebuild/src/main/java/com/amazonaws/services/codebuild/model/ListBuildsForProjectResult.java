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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

public class ListBuildsForProjectResult implements Serializable {
    /**
     * <p>
     * A list of build IDs for the specified build project, with each build ID
     * representing a single build.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items
     * are returned, along with a unique string called a <i>nextToken</i>. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of build IDs for the specified build project, with each build ID
     * representing a single build.
     * </p>
     *
     * @return <p>
     *         A list of build IDs for the specified build project, with each
     *         build ID representing a single build.
     *         </p>
     */
    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * A list of build IDs for the specified build project, with each build ID
     * representing a single build.
     * </p>
     *
     * @param ids <p>
     *            A list of build IDs for the specified build project, with each
     *            build ID representing a single build.
     *            </p>
     */
    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * A list of build IDs for the specified build project, with each build ID
     * representing a single build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            A list of build IDs for the specified build project, with each
     *            build ID representing a single build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBuildsForProjectResult withIds(String... ids) {
        if (getIds() == null) {
            this.ids = new java.util.ArrayList<String>(ids.length);
        }
        for (String value : ids) {
            this.ids.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of build IDs for the specified build project, with each build ID
     * representing a single build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            A list of build IDs for the specified build project, with each
     *            build ID representing a single build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBuildsForProjectResult withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items
     * are returned, along with a unique string called a <i>nextToken</i>. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call.
     * </p>
     *
     * @return <p>
     *         If there are more than 100 items in the list, only the first 100
     *         items are returned, along with a unique string called a
     *         <i>nextToken</i>. To get the next batch of items in the list,
     *         call this operation again, adding the next token to the call.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items
     * are returned, along with a unique string called a <i>nextToken</i>. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call.
     * </p>
     *
     * @param nextToken <p>
     *            If there are more than 100 items in the list, only the first
     *            100 items are returned, along with a unique string called a
     *            <i>nextToken</i>. To get the next batch of items in the list,
     *            call this operation again, adding the next token to the call.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more than 100 items in the list, only the first 100 items
     * are returned, along with a unique string called a <i>nextToken</i>. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are more than 100 items in the list, only the first
     *            100 items are returned, along with a unique string called a
     *            <i>nextToken</i>. To get the next batch of items in the list,
     *            call this operation again, adding the next token to the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBuildsForProjectResult withNextToken(String nextToken) {
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
        if (getIds() != null)
            sb.append("ids: " + getIds() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBuildsForProjectResult == false)
            return false;
        ListBuildsForProjectResult other = (ListBuildsForProjectResult) obj;

        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
