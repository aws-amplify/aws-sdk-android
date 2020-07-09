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


/**
 * <p>Displays errors that occurred during validation of the resource policy.</p>
 */
public class ValidationErrorsEntry implements Serializable {
    /**
     * <p>Checks the name of the policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String checkName;

    /**
     * <p>Displays error messages if validation encounters problems during validation of the resource policy.</p>
     */
    private String errorMessage;

    /**
     * <p>Checks the name of the policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>Checks the name of the policy.</p>
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * <p>Checks the name of the policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param checkName <p>Checks the name of the policy.</p>
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * <p>Checks the name of the policy.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param checkName <p>Checks the name of the policy.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ValidationErrorsEntry withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * <p>Displays error messages if validation encounters problems during validation of the resource policy.</p>
     *
     * @return <p>Displays error messages if validation encounters problems during validation of the resource policy.</p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>Displays error messages if validation encounters problems during validation of the resource policy.</p>
     *
     * @param errorMessage <p>Displays error messages if validation encounters problems during validation of the resource policy.</p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>Displays error messages if validation encounters problems during validation of the resource policy.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorMessage <p>Displays error messages if validation encounters problems during validation of the resource policy.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ValidationErrorsEntry withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getCheckName() != null) sb.append("CheckName: " + getCheckName() + ",");
        if (getErrorMessage() != null) sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ValidationErrorsEntry == false) return false;
        ValidationErrorsEntry other = (ValidationErrorsEntry)obj;

        if (other.getCheckName() == null ^ this.getCheckName() == null) return false;
        if (other.getCheckName() != null && other.getCheckName().equals(this.getCheckName()) == false) return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null) return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false) return false;
        return true;
    }
}
