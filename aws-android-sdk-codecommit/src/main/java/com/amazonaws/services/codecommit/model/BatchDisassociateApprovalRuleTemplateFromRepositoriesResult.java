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

public class BatchDisassociateApprovalRuleTemplateFromRepositoriesResult implements Serializable {
    /**
     * <p>
     * A list of repository names that have had their association with the
     * template removed.
     * </p>
     */
    private java.util.List<String> disassociatedRepositoryNames;

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove
     * the association between the template and the repositories.
     * </p>
     */
    private java.util.List<BatchDisassociateApprovalRuleTemplateFromRepositoriesError> errors;

    /**
     * <p>
     * A list of repository names that have had their association with the
     * template removed.
     * </p>
     *
     * @return <p>
     *         A list of repository names that have had their association with
     *         the template removed.
     *         </p>
     */
    public java.util.List<String> getDisassociatedRepositoryNames() {
        return disassociatedRepositoryNames;
    }

    /**
     * <p>
     * A list of repository names that have had their association with the
     * template removed.
     * </p>
     *
     * @param disassociatedRepositoryNames <p>
     *            A list of repository names that have had their association
     *            with the template removed.
     *            </p>
     */
    public void setDisassociatedRepositoryNames(
            java.util.Collection<String> disassociatedRepositoryNames) {
        if (disassociatedRepositoryNames == null) {
            this.disassociatedRepositoryNames = null;
            return;
        }

        this.disassociatedRepositoryNames = new java.util.ArrayList<String>(
                disassociatedRepositoryNames);
    }

    /**
     * <p>
     * A list of repository names that have had their association with the
     * template removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociatedRepositoryNames <p>
     *            A list of repository names that have had their association
     *            with the template removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult withDisassociatedRepositoryNames(
            String... disassociatedRepositoryNames) {
        if (getDisassociatedRepositoryNames() == null) {
            this.disassociatedRepositoryNames = new java.util.ArrayList<String>(
                    disassociatedRepositoryNames.length);
        }
        for (String value : disassociatedRepositoryNames) {
            this.disassociatedRepositoryNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of repository names that have had their association with the
     * template removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociatedRepositoryNames <p>
     *            A list of repository names that have had their association
     *            with the template removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult withDisassociatedRepositoryNames(
            java.util.Collection<String> disassociatedRepositoryNames) {
        setDisassociatedRepositoryNames(disassociatedRepositoryNames);
        return this;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove
     * the association between the template and the repositories.
     * </p>
     *
     * @return <p>
     *         A list of any errors that might have occurred while attempting to
     *         remove the association between the template and the repositories.
     *         </p>
     */
    public java.util.List<BatchDisassociateApprovalRuleTemplateFromRepositoriesError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove
     * the association between the template and the repositories.
     * </p>
     *
     * @param errors <p>
     *            A list of any errors that might have occurred while attempting
     *            to remove the association between the template and the
     *            repositories.
     *            </p>
     */
    public void setErrors(
            java.util.Collection<BatchDisassociateApprovalRuleTemplateFromRepositoriesError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchDisassociateApprovalRuleTemplateFromRepositoriesError>(
                errors);
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove
     * the association between the template and the repositories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of any errors that might have occurred while attempting
     *            to remove the association between the template and the
     *            repositories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult withErrors(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchDisassociateApprovalRuleTemplateFromRepositoriesError>(
                    errors.length);
        }
        for (BatchDisassociateApprovalRuleTemplateFromRepositoriesError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of any errors that might have occurred while attempting to remove
     * the association between the template and the repositories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of any errors that might have occurred while attempting
     *            to remove the association between the template and the
     *            repositories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDisassociateApprovalRuleTemplateFromRepositoriesResult withErrors(
            java.util.Collection<BatchDisassociateApprovalRuleTemplateFromRepositoriesError> errors) {
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
        if (getDisassociatedRepositoryNames() != null)
            sb.append("disassociatedRepositoryNames: " + getDisassociatedRepositoryNames() + ",");
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
                + ((getDisassociatedRepositoryNames() == null) ? 0
                        : getDisassociatedRepositoryNames().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateApprovalRuleTemplateFromRepositoriesResult == false)
            return false;
        BatchDisassociateApprovalRuleTemplateFromRepositoriesResult other = (BatchDisassociateApprovalRuleTemplateFromRepositoriesResult) obj;

        if (other.getDisassociatedRepositoryNames() == null
                ^ this.getDisassociatedRepositoryNames() == null)
            return false;
        if (other.getDisassociatedRepositoryNames() != null
                && other.getDisassociatedRepositoryNames().equals(
                        this.getDisassociatedRepositoryNames()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
