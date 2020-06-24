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

public class BatchAssociateApprovalRuleTemplateWithRepositoriesResult implements Serializable {
    /**
     * <p>
     * A list of names of the repositories that have been associated with the
     * template.
     * </p>
     */
    private java.util.List<String> associatedRepositoryNames;

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to create
     * the association between the template and the repositories.
     * </p>
     */
    private java.util.List<BatchAssociateApprovalRuleTemplateWithRepositoriesError> errors;

    /**
     * <p>
     * A list of names of the repositories that have been associated with the
     * template.
     * </p>
     *
     * @return <p>
     *         A list of names of the repositories that have been associated
     *         with the template.
     *         </p>
     */
    public java.util.List<String> getAssociatedRepositoryNames() {
        return associatedRepositoryNames;
    }

    /**
     * <p>
     * A list of names of the repositories that have been associated with the
     * template.
     * </p>
     *
     * @param associatedRepositoryNames <p>
     *            A list of names of the repositories that have been associated
     *            with the template.
     *            </p>
     */
    public void setAssociatedRepositoryNames(java.util.Collection<String> associatedRepositoryNames) {
        if (associatedRepositoryNames == null) {
            this.associatedRepositoryNames = null;
            return;
        }

        this.associatedRepositoryNames = new java.util.ArrayList<String>(associatedRepositoryNames);
    }

    /**
     * <p>
     * A list of names of the repositories that have been associated with the
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedRepositoryNames <p>
     *            A list of names of the repositories that have been associated
     *            with the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateApprovalRuleTemplateWithRepositoriesResult withAssociatedRepositoryNames(
            String... associatedRepositoryNames) {
        if (getAssociatedRepositoryNames() == null) {
            this.associatedRepositoryNames = new java.util.ArrayList<String>(
                    associatedRepositoryNames.length);
        }
        for (String value : associatedRepositoryNames) {
            this.associatedRepositoryNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of the repositories that have been associated with the
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedRepositoryNames <p>
     *            A list of names of the repositories that have been associated
     *            with the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateApprovalRuleTemplateWithRepositoriesResult withAssociatedRepositoryNames(
            java.util.Collection<String> associatedRepositoryNames) {
        setAssociatedRepositoryNames(associatedRepositoryNames);
        return this;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to create
     * the association between the template and the repositories.
     * </p>
     *
     * @return <p>
     *         A list of any errors that might have occurred while attempting to
     *         create the association between the template and the repositories.
     *         </p>
     */
    public java.util.List<BatchAssociateApprovalRuleTemplateWithRepositoriesError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to create
     * the association between the template and the repositories.
     * </p>
     *
     * @param errors <p>
     *            A list of any errors that might have occurred while attempting
     *            to create the association between the template and the
     *            repositories.
     *            </p>
     */
    public void setErrors(
            java.util.Collection<BatchAssociateApprovalRuleTemplateWithRepositoriesError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchAssociateApprovalRuleTemplateWithRepositoriesError>(
                errors);
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to create
     * the association between the template and the repositories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of any errors that might have occurred while attempting
     *            to create the association between the template and the
     *            repositories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateApprovalRuleTemplateWithRepositoriesResult withErrors(
            BatchAssociateApprovalRuleTemplateWithRepositoriesError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchAssociateApprovalRuleTemplateWithRepositoriesError>(
                    errors.length);
        }
        for (BatchAssociateApprovalRuleTemplateWithRepositoriesError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to create
     * the association between the template and the repositories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of any errors that might have occurred while attempting
     *            to create the association between the template and the
     *            repositories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchAssociateApprovalRuleTemplateWithRepositoriesResult withErrors(
            java.util.Collection<BatchAssociateApprovalRuleTemplateWithRepositoriesError> errors) {
        setErrors(errors);
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
        if (getAssociatedRepositoryNames() != null)
            sb.append("associatedRepositoryNames: " + getAssociatedRepositoryNames() + ",");
        if (getErrors() != null)
            sb.append("errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssociatedRepositoryNames() == null) ? 0 : getAssociatedRepositoryNames()
                        .hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateApprovalRuleTemplateWithRepositoriesResult == false)
            return false;
        BatchAssociateApprovalRuleTemplateWithRepositoriesResult other = (BatchAssociateApprovalRuleTemplateWithRepositoriesResult) obj;

        if (other.getAssociatedRepositoryNames() == null
                ^ this.getAssociatedRepositoryNames() == null)
            return false;
        if (other.getAssociatedRepositoryNames() != null
                && other.getAssociatedRepositoryNames().equals(this.getAssociatedRepositoryNames()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
