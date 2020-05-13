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

public class GetFindingsResult implements Serializable {
    /**
     * <p>
     * An array of objects, one for each finding that meets the criteria
     * specified in the request.
     * </p>
     */
    private java.util.List<Finding> findings;

    /**
     * <p>
     * An array of objects, one for each finding that meets the criteria
     * specified in the request.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each finding that meets the criteria
     *         specified in the request.
     *         </p>
     */
    public java.util.List<Finding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * An array of objects, one for each finding that meets the criteria
     * specified in the request.
     * </p>
     *
     * @param findings <p>
     *            An array of objects, one for each finding that meets the
     *            criteria specified in the request.
     *            </p>
     */
    public void setFindings(java.util.Collection<Finding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<Finding>(findings);
    }

    /**
     * <p>
     * An array of objects, one for each finding that meets the criteria
     * specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findings <p>
     *            An array of objects, one for each finding that meets the
     *            criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsResult withFindings(Finding... findings) {
        if (getFindings() == null) {
            this.findings = new java.util.ArrayList<Finding>(findings.length);
        }
        for (Finding value : findings) {
            this.findings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each finding that meets the criteria
     * specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findings <p>
     *            An array of objects, one for each finding that meets the
     *            criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsResult withFindings(java.util.Collection<Finding> findings) {
        setFindings(findings);
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
        if (getFindings() != null)
            sb.append("findings: " + getFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindings() == null) ? 0 : getFindings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsResult == false)
            return false;
        GetFindingsResult other = (GetFindingsResult) obj;

        if (other.getFindings() == null ^ this.getFindings() == null)
            return false;
        if (other.getFindings() != null && other.getFindings().equals(this.getFindings()) == false)
            return false;
        return true;
    }
}
