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
 * Creates an association between an approval rule template and one or more
 * specified repositories.
 * </p>
 */
public class BatchAssociateApprovalRuleTemplateWithRepositoriesRequest extends
        AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the template you want to associate with one or more
     * repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleTemplateName;

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array
     * itself can be empty.
     * </p>
     * </note>
     */
    private java.util.List<String> repositoryNames;

    /**
     * <p>
     * The name of the template you want to associate with one or more
     * repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the template you want to associate with one or more
     *         repositories.
     *         </p>
     */
    public String getApprovalRuleTemplateName() {
        return approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template you want to associate with one or more
     * repositories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the template you want to associate with one or
     *            more repositories.
     *            </p>
     */
    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template you want to associate with one or more
     * repositories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the template you want to associate with one or
     *            more repositories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateApprovalRuleTemplateWithRepositoriesRequest withApprovalRuleTemplateName(
            String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
        return this;
    }

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array
     * itself can be empty.
     * </p>
     * </note>
     *
     * @return <p>
     *         The names of the repositories you want to associate with the
     *         template.
     *         </p>
     *         <note>
     *         <p>
     *         The length constraint limit is for each string in the array. The
     *         array itself can be empty.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array
     * itself can be empty.
     * </p>
     * </note>
     *
     * @param repositoryNames <p>
     *            The names of the repositories you want to associate with the
     *            template.
     *            </p>
     *            <note>
     *            <p>
     *            The length constraint limit is for each string in the array.
     *            The array itself can be empty.
     *            </p>
     *            </note>
     */
    public void setRepositoryNames(java.util.Collection<String> repositoryNames) {
        if (repositoryNames == null) {
            this.repositoryNames = null;
            return;
        }

        this.repositoryNames = new java.util.ArrayList<String>(repositoryNames);
    }

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array
     * itself can be empty.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryNames <p>
     *            The names of the repositories you want to associate with the
     *            template.
     *            </p>
     *            <note>
     *            <p>
     *            The length constraint limit is for each string in the array.
     *            The array itself can be empty.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateApprovalRuleTemplateWithRepositoriesRequest withRepositoryNames(
            String... repositoryNames) {
        if (getRepositoryNames() == null) {
            this.repositoryNames = new java.util.ArrayList<String>(repositoryNames.length);
        }
        for (String value : repositoryNames) {
            this.repositoryNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the repositories you want to associate with the template.
     * </p>
     * <note>
     * <p>
     * The length constraint limit is for each string in the array. The array
     * itself can be empty.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryNames <p>
     *            The names of the repositories you want to associate with the
     *            template.
     *            </p>
     *            <note>
     *            <p>
     *            The length constraint limit is for each string in the array.
     *            The array itself can be empty.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateApprovalRuleTemplateWithRepositoriesRequest withRepositoryNames(
            java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
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
        if (getRepositoryNames() != null)
            sb.append("repositoryNames: " + getRepositoryNames());
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
                + ((getRepositoryNames() == null) ? 0 : getRepositoryNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateApprovalRuleTemplateWithRepositoriesRequest == false)
            return false;
        BatchAssociateApprovalRuleTemplateWithRepositoriesRequest other = (BatchAssociateApprovalRuleTemplateWithRepositoriesRequest) obj;

        if (other.getApprovalRuleTemplateName() == null
                ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null
                && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getRepositoryNames() == null ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null
                && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        return true;
    }
}
