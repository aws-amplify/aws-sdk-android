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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * The response to the request.
 * </p>
 */
public class ListFindingsResult implements Serializable {
    /**
     * <p>
     * A list of findings retrieved from the analyzer that match the filter
     * criteria specified, if any.
     * </p>
     */
    private java.util.List<FindingSummary> findings;

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of findings retrieved from the analyzer that match the filter
     * criteria specified, if any.
     * </p>
     *
     * @return <p>
     *         A list of findings retrieved from the analyzer that match the
     *         filter criteria specified, if any.
     *         </p>
     */
    public java.util.List<FindingSummary> getFindings() {
        return findings;
    }

    /**
     * <p>
     * A list of findings retrieved from the analyzer that match the filter
     * criteria specified, if any.
     * </p>
     *
     * @param findings <p>
     *            A list of findings retrieved from the analyzer that match the
     *            filter criteria specified, if any.
     *            </p>
     */
    public void setFindings(java.util.Collection<FindingSummary> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<FindingSummary>(findings);
    }

    /**
     * <p>
     * A list of findings retrieved from the analyzer that match the filter
     * criteria specified, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findings <p>
     *            A list of findings retrieved from the analyzer that match the
     *            filter criteria specified, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsResult withFindings(FindingSummary... findings) {
        if (getFindings() == null) {
            this.findings = new java.util.ArrayList<FindingSummary>(findings.length);
        }
        for (FindingSummary value : findings) {
            this.findings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of findings retrieved from the analyzer that match the filter
     * criteria specified, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findings <p>
     *            A list of findings retrieved from the analyzer that match the
     *            filter criteria specified, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsResult withFindings(java.util.Collection<FindingSummary> findings) {
        setFindings(findings);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @return <p>
     *         A token used for pagination of results returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsResult withNextToken(String nextToken) {
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
        if (getFindings() != null)
            sb.append("findings: " + getFindings() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindings() == null) ? 0 : getFindings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFindingsResult == false)
            return false;
        ListFindingsResult other = (ListFindingsResult) obj;

        if (other.getFindings() == null ^ this.getFindings() == null)
            return false;
        if (other.getFindings() != null && other.getFindings().equals(this.getFindings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
