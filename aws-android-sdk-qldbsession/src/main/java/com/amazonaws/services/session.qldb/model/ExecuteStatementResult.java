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

package com.amazonaws.services.session.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details of the executed statement.
 * </p>
 */
public class ExecuteStatementResult implements Serializable {
    /**
     * <p>
     * Contains the details of the first fetched page.
     * </p>
     */
    private Page firstPage;

    /**
     * <p>
     * Contains the details of the first fetched page.
     * </p>
     *
     * @return <p>
     *         Contains the details of the first fetched page.
     *         </p>
     */
    public Page getFirstPage() {
        return firstPage;
    }

    /**
     * <p>
     * Contains the details of the first fetched page.
     * </p>
     *
     * @param firstPage <p>
     *            Contains the details of the first fetched page.
     *            </p>
     */
    public void setFirstPage(Page firstPage) {
        this.firstPage = firstPage;
    }

    /**
     * <p>
     * Contains the details of the first fetched page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firstPage <p>
     *            Contains the details of the first fetched page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecuteStatementResult withFirstPage(Page firstPage) {
        this.firstPage = firstPage;
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
        if (getFirstPage() != null)
            sb.append("FirstPage: " + getFirstPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstPage() == null) ? 0 : getFirstPage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteStatementResult == false)
            return false;
        ExecuteStatementResult other = (ExecuteStatementResult) obj;

        if (other.getFirstPage() == null ^ this.getFirstPage() == null)
            return false;
        if (other.getFirstPage() != null
                && other.getFirstPage().equals(this.getFirstPage()) == false)
            return false;
        return true;
    }
}
