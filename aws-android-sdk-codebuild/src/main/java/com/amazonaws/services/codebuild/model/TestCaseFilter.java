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

/**
 * <p>
 * A filter used to return specific types of test cases.
 * </p>
 */
public class TestCaseFilter implements Serializable {
    /**
     * <p>
     * The status used to filter test cases. Valid statuses are
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     * <code>SKIPPED</code>, and <code>UNKNOWN</code>. A
     * <code>TestCaseFilter</code> can have one status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The status used to filter test cases. Valid statuses are
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     * <code>SKIPPED</code>, and <code>UNKNOWN</code>. A
     * <code>TestCaseFilter</code> can have one status.
     * </p>
     *
     * @return <p>
     *         The status used to filter test cases. Valid statuses are
     *         <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     *         <code>SKIPPED</code>, and <code>UNKNOWN</code>. A
     *         <code>TestCaseFilter</code> can have one status.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status used to filter test cases. Valid statuses are
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     * <code>SKIPPED</code>, and <code>UNKNOWN</code>. A
     * <code>TestCaseFilter</code> can have one status.
     * </p>
     *
     * @param status <p>
     *            The status used to filter test cases. Valid statuses are
     *            <code>SUCCEEDED</code>, <code>FAILED</code>,
     *            <code>ERROR</code>, <code>SKIPPED</code>, and
     *            <code>UNKNOWN</code>. A <code>TestCaseFilter</code> can have
     *            one status.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status used to filter test cases. Valid statuses are
     * <code>SUCCEEDED</code>, <code>FAILED</code>, <code>ERROR</code>,
     * <code>SKIPPED</code>, and <code>UNKNOWN</code>. A
     * <code>TestCaseFilter</code> can have one status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status used to filter test cases. Valid statuses are
     *            <code>SUCCEEDED</code>, <code>FAILED</code>,
     *            <code>ERROR</code>, <code>SKIPPED</code>, and
     *            <code>UNKNOWN</code>. A <code>TestCaseFilter</code> can have
     *            one status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCaseFilter withStatus(String status) {
        this.status = status;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCaseFilter == false)
            return false;
        TestCaseFilter other = (TestCaseFilter) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
