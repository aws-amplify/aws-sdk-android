/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class QueriesConfig implements Serializable {
    /**
     * <p/>
     */
    private java.util.List<Query> queries;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<Query> getQueries() {
        return queries;
    }

    /**
     * <p/>
     *
     * @param queries <p/>
     */
    public void setQueries(java.util.Collection<Query> queries) {
        if (queries == null) {
            this.queries = null;
            return;
        }

        this.queries = new java.util.ArrayList<Query>(queries);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queries <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueriesConfig withQueries(Query... queries) {
        if (getQueries() == null) {
            this.queries = new java.util.ArrayList<Query>(queries.length);
        }
        for (Query value : queries) {
            this.queries.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queries <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueriesConfig withQueries(java.util.Collection<Query> queries) {
        setQueries(queries);
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
        if (getQueries() != null)
            sb.append("Queries: " + getQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueries() == null) ? 0 : getQueries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueriesConfig == false)
            return false;
        QueriesConfig other = (QueriesConfig) obj;

        if (other.getQueries() == null ^ this.getQueries() == null)
            return false;
        if (other.getQueries() != null && other.getQueries().equals(this.getQueries()) == false)
            return false;
        return true;
    }
}
