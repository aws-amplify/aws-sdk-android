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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


public class ValidateResourcePolicyResult implements Serializable {
    /**
     * <p>Returns a message stating that your Reource Policy passed validation. </p>
     */
    private Boolean policyValidationPassed;

    /**
     * <p>Returns an error message if your policy doesn't pass validatation.</p>
     */
    private java.util.List<ValidationErrorsEntry> validationErrors;

    /**
     * <p>Returns a message stating that your Reource Policy passed validation. </p>
     *
     * @return <p>Returns a message stating that your Reource Policy passed validation. </p>
     */
    public Boolean isPolicyValidationPassed() {
        return policyValidationPassed;
    }

    /**
     * <p>Returns a message stating that your Reource Policy passed validation. </p>
     *
     * @return <p>Returns a message stating that your Reource Policy passed validation. </p>
     */
    public Boolean getPolicyValidationPassed() {
        return policyValidationPassed;
    }

    /**
     * <p>Returns a message stating that your Reource Policy passed validation. </p>
     *
     * @param policyValidationPassed <p>Returns a message stating that your Reource Policy passed validation. </p>
     */
    public void setPolicyValidationPassed(Boolean policyValidationPassed) {
        this.policyValidationPassed = policyValidationPassed;
    }

    /**
     * <p>Returns a message stating that your Reource Policy passed validation. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyValidationPassed <p>Returns a message stating that your Reource Policy passed validation. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ValidateResourcePolicyResult withPolicyValidationPassed(Boolean policyValidationPassed) {
        this.policyValidationPassed = policyValidationPassed;
        return this;
    }

    /**
     * <p>Returns an error message if your policy doesn't pass validatation.</p>
     *
     * @return <p>Returns an error message if your policy doesn't pass validatation.</p>
     */
    public java.util.List<ValidationErrorsEntry> getValidationErrors() {
        return validationErrors;
    }

    /**
     * <p>Returns an error message if your policy doesn't pass validatation.</p>
     *
     * @param validationErrors <p>Returns an error message if your policy doesn't pass validatation.</p>
     */
    public void setValidationErrors(java.util.Collection<ValidationErrorsEntry> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
            return;
        }

        this.validationErrors = new java.util.ArrayList<ValidationErrorsEntry>(validationErrors);
    }

    /**
     * <p>Returns an error message if your policy doesn't pass validatation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationErrors <p>Returns an error message if your policy doesn't pass validatation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ValidateResourcePolicyResult withValidationErrors(ValidationErrorsEntry... validationErrors) {
        if (getValidationErrors() == null) {
            this.validationErrors = new java.util.ArrayList<ValidationErrorsEntry>(validationErrors.length);
        }
        for (ValidationErrorsEntry value : validationErrors) {
            this.validationErrors.add(value);
        }
        return this;
    }

    /**
     * <p>Returns an error message if your policy doesn't pass validatation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validationErrors <p>Returns an error message if your policy doesn't pass validatation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ValidateResourcePolicyResult withValidationErrors(java.util.Collection<ValidationErrorsEntry> validationErrors) {
        setValidationErrors(validationErrors);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyValidationPassed() != null) sb.append("PolicyValidationPassed: " + getPolicyValidationPassed() + ",");
        if (getValidationErrors() != null) sb.append("ValidationErrors: " + getValidationErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyValidationPassed() == null) ? 0 : getPolicyValidationPassed().hashCode());
        hashCode = prime * hashCode + ((getValidationErrors() == null) ? 0 : getValidationErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ValidateResourcePolicyResult == false) return false;
        ValidateResourcePolicyResult other = (ValidateResourcePolicyResult)obj;

        if (other.getPolicyValidationPassed() == null ^ this.getPolicyValidationPassed() == null) return false;
        if (other.getPolicyValidationPassed() != null && other.getPolicyValidationPassed().equals(this.getPolicyValidationPassed()) == false) return false;
        if (other.getValidationErrors() == null ^ this.getValidationErrors() == null) return false;
        if (other.getValidationErrors() != null && other.getValidationErrors().equals(this.getValidationErrors()) == false) return false;
        return true;
    }
}
