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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class GetFindingsResult implements Serializable {
    /**
     * <p>
     * The findings that matched the filters specified in the request.
     * </p>
     */
    private java.util.List<AwsSecurityFinding> findings;

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The findings that matched the filters specified in the request.
     * </p>
     *
     * @return <p>
     *         The findings that matched the filters specified in the request.
     *         </p>
     */
    public java.util.List<AwsSecurityFinding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * The findings that matched the filters specified in the request.
     * </p>
     *
     * @param findings <p>
     *            The findings that matched the filters specified in the
     *            request.
     *            </p>
     */
    public void setFindings(java.util.Collection<AwsSecurityFinding> findings) {
        if (findings == null) {
            this.findings = null;
            return;
        }

        this.findings = new java.util.ArrayList<AwsSecurityFinding>(findings);
    }

    /**
     * <p>
     * The findings that matched the filters specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findings <p>
     *            The findings that matched the filters specified in the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsResult withFindings(AwsSecurityFinding... findings) {
        if (getFindings() == null) {
            this.findings = new java.util.ArrayList<AwsSecurityFinding>(findings.length);
        }
        for (AwsSecurityFinding value : findings) {
            this.findings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The findings that matched the filters specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findings <p>
     *            The findings that matched the filters specified in the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsResult withFindings(java.util.Collection<AwsSecurityFinding> findings) {
        setFindings(findings);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The pagination token to use to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsResult withNextToken(String nextToken) {
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
            sb.append("Findings: " + getFindings() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
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

        if (obj instanceof GetFindingsResult == false)
            return false;
        GetFindingsResult other = (GetFindingsResult) obj;

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
