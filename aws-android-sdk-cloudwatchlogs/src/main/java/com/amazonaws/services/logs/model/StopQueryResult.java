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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class StopQueryResult implements Serializable {
    /**
     * <p>
     * This is true if the query was stopped by the <code>StopQuery</code>
     * operation.
     * </p>
     */
    private Boolean success;

    /**
     * <p>
     * This is true if the query was stopped by the <code>StopQuery</code>
     * operation.
     * </p>
     *
     * @return <p>
     *         This is true if the query was stopped by the
     *         <code>StopQuery</code> operation.
     *         </p>
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * <p>
     * This is true if the query was stopped by the <code>StopQuery</code>
     * operation.
     * </p>
     *
     * @return <p>
     *         This is true if the query was stopped by the
     *         <code>StopQuery</code> operation.
     *         </p>
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * <p>
     * This is true if the query was stopped by the <code>StopQuery</code>
     * operation.
     * </p>
     *
     * @param success <p>
     *            This is true if the query was stopped by the
     *            <code>StopQuery</code> operation.
     *            </p>
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * <p>
     * This is true if the query was stopped by the <code>StopQuery</code>
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param success <p>
     *            This is true if the query was stopped by the
     *            <code>StopQuery</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopQueryResult withSuccess(Boolean success) {
        this.success = success;
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
        if (getSuccess() != null)
            sb.append("success: " + getSuccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopQueryResult == false)
            return false;
        StopQueryResult other = (StopQueryResult) obj;

        if (other.getSuccess() == null ^ this.getSuccess() == null)
            return false;
        if (other.getSuccess() != null && other.getSuccess().equals(this.getSuccess()) == false)
            return false;
        return true;
    }
}
