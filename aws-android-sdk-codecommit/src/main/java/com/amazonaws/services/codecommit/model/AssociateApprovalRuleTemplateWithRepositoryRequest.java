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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an association between an approval rule template and a specified
 * repository. Then, the next time a pull request is created in the repository
 * where the destination reference (if specified) matches the destination
 * reference (branch) for the pull request, an approval rule that matches the
 * template conditions is automatically created for that pull request. If no
 * destination references are specified in the template, an approval rule that
 * matches the template contents is created for all pull requests in that
 * repository.
 * </p>
 */
public class AssociateApprovalRuleTemplateWithRepositoryRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name for the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleTemplateName;

    /**
     * <p>
     * The name of the repository that you want to associate with the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The name for the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name for the approval rule template.
     *         </p>
     */
    public String getApprovalRuleTemplateName() {
        return approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name for the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name for the approval rule template.
     *            </p>
     */
    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name for the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name for the approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateApprovalRuleTemplateWithRepositoryRequest withApprovalRuleTemplateName(
            String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
        return this;
    }

    /**
     * <p>
     * The name of the repository that you want to associate with the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository that you want to associate with the
     *         template.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository that you want to associate with the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that you want to associate with the
     *            template.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that you want to associate with the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that you want to associate with the
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateApprovalRuleTemplateWithRepositoryRequest withRepositoryName(
            String repositoryName) {
        this.repositoryName = repositoryName;
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
        if (getApprovalRuleTemplateName() != null)
            sb.append("approvalRuleTemplateName: " + getApprovalRuleTemplateName() + ",");
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateApprovalRuleTemplateWithRepositoryRequest == false)
            return false;
        AssociateApprovalRuleTemplateWithRepositoryRequest other = (AssociateApprovalRuleTemplateWithRepositoryRequest) obj;

        if (other.getApprovalRuleTemplateName() == null
                ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null
                && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }
}
