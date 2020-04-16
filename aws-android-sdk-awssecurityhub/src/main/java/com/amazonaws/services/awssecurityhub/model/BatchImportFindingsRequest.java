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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Imports security findings generated from an integrated third-party product
 * into Security Hub. This action is requested by the integrated product to
 * import its findings into Security Hub.
 * </p>
 * <p>
 * The maximum allowed size for a finding is 240 Kb. An error is returned for
 * any finding larger than 240 Kb.
 * </p>
 * <p>
 * After a finding is created, <code>BatchImportFindings</code> cannot be used
 * to update the following finding fields and objects, which Security Hub
 * customers use to manage their investigation workflow.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Confidence</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Criticality</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Note</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RelatedFindings</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Severity</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Types</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UserDefinedFields</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>VerificationState</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Workflow</code>
 * </p>
 * </li>
 * </ul>
 */
public class BatchImportFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of findings to import. To successfully import a finding, it must
     * follow the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     * >AWS Security Finding Format</a>. Maximum of 100 findings per request.
     * </p>
     */
    private java.util.List<AwsSecurityFinding> findings;

    /**
     * <p>
     * A list of findings to import. To successfully import a finding, it must
     * follow the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     * >AWS Security Finding Format</a>. Maximum of 100 findings per request.
     * </p>
     *
     * @return <p>
     *         A list of findings to import. To successfully import a finding,
     *         it must follow the <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     *         >AWS Security Finding Format</a>. Maximum of 100 findings per
     *         request.
     *         </p>
     */
    public java.util.List<AwsSecurityFinding> getFindings() {
        return findings;
    }

    /**
     * <p>
     * A list of findings to import. To successfully import a finding, it must
     * follow the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     * >AWS Security Finding Format</a>. Maximum of 100 findings per request.
     * </p>
     *
     * @param findings <p>
     *            A list of findings to import. To successfully import a
     *            finding, it must follow the <a href=
     *            "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     *            >AWS Security Finding Format</a>. Maximum of 100 findings per
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
     * A list of findings to import. To successfully import a finding, it must
     * follow the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     * >AWS Security Finding Format</a>. Maximum of 100 findings per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findings <p>
     *            A list of findings to import. To successfully import a
     *            finding, it must follow the <a href=
     *            "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     *            >AWS Security Finding Format</a>. Maximum of 100 findings per
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchImportFindingsRequest withFindings(AwsSecurityFinding... findings) {
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
     * A list of findings to import. To successfully import a finding, it must
     * follow the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     * >AWS Security Finding Format</a>. Maximum of 100 findings per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findings <p>
     *            A list of findings to import. To successfully import a
     *            finding, it must follow the <a href=
     *            "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html"
     *            >AWS Security Finding Format</a>. Maximum of 100 findings per
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchImportFindingsRequest withFindings(java.util.Collection<AwsSecurityFinding> findings) {
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
            sb.append("Findings: " + getFindings());
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

        if (obj instanceof BatchImportFindingsRequest == false)
            return false;
        BatchImportFindingsRequest other = (BatchImportFindingsRequest) obj;

        if (other.getFindings() == null ^ this.getFindings() == null)
            return false;
        if (other.getFindings() != null && other.getFindings().equals(this.getFindings()) == false)
            return false;
        return true;
    }
}
