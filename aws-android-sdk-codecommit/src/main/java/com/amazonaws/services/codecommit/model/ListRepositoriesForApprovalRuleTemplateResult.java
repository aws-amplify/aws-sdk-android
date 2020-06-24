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

public class ListRepositoriesForApprovalRuleTemplateResult implements Serializable {
    /**
     * <p>
     * A list of repository names that are associated with the specified
     * approval rule template.
     * </p>
     */
    private java.util.List<String> repositoryNames;

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of repository names that are associated with the specified
     * approval rule template.
     * </p>
     *
     * @return <p>
     *         A list of repository names that are associated with the specified
     *         approval rule template.
     *         </p>
     */
    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * A list of repository names that are associated with the specified
     * approval rule template.
     * </p>
     *
     * @param repositoryNames <p>
     *            A list of repository names that are associated with the
     *            specified approval rule template.
     *            </p>
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
     * A list of repository names that are associated with the specified
     * approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryNames <p>
     *            A list of repository names that are associated with the
     *            specified approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoriesForApprovalRuleTemplateResult withRepositoryNames(
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
     * A list of repository names that are associated with the specified
     * approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryNames <p>
     *            A list of repository names that are associated with the
     *            specified approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoriesForApprovalRuleTemplateResult withRepositoryNames(
            java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     *
     * @return <p>
     *         An enumeration token that allows the operation to batch the next
     *         results of the operation.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that allows the operation to batch the
     *            next results of the operation.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that allows the operation to batch the
     *            next results of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoriesForApprovalRuleTemplateResult withNextToken(String nextToken) {
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
        if (getRepositoryNames() != null)
            sb.append("repositoryNames: " + getRepositoryNames() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryNames() == null) ? 0 : getRepositoryNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRepositoriesForApprovalRuleTemplateResult == false)
            return false;
        ListRepositoriesForApprovalRuleTemplateResult other = (ListRepositoriesForApprovalRuleTemplateResult) obj;

        if (other.getRepositoryNames() == null ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null
                && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
