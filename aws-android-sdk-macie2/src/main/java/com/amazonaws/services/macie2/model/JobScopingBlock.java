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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Reserved for future use.
 * </p>
 */
public class JobScopingBlock implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.List<JobScopeTerm> and;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public java.util.List<JobScopeTerm> getAnd() {
        return and;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param and <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setAnd(java.util.Collection<JobScopeTerm> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<JobScopeTerm>(and);
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param and <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobScopingBlock withAnd(JobScopeTerm... and) {
        if (getAnd() == null) {
            this.and = new java.util.ArrayList<JobScopeTerm>(and.length);
        }
        for (JobScopeTerm value : and) {
            this.and.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param and <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobScopingBlock withAnd(java.util.Collection<JobScopeTerm> and) {
        setAnd(and);
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
        if (getAnd() != null)
            sb.append("and: " + getAnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobScopingBlock == false)
            return false;
        JobScopingBlock other = (JobScopingBlock) obj;

        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        return true;
    }
}
