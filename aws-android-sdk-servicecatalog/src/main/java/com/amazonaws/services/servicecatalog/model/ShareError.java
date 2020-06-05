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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Errors that occurred during the portfolio share operation.
 * </p>
 */
public class ShareError implements Serializable {
    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     */
    private java.util.List<String> accounts;

    /**
     * <p>
     * Information about the error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Error type that happened when processing the operation.
     * </p>
     */
    private String error;

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     *
     * @return <p>
     *         List of accounts impacted by the error.
     *         </p>
     */
    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     *
     * @param accounts <p>
     *            List of accounts impacted by the error.
     *            </p>
     */
    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accounts <p>
     *            List of accounts impacted by the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShareError withAccounts(String... accounts) {
        if (getAccounts() == null) {
            this.accounts = new java.util.ArrayList<String>(accounts.length);
        }
        for (String value : accounts) {
            this.accounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accounts <p>
     *            List of accounts impacted by the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShareError withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     *
     * @return <p>
     *         Information about the error.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     *
     * @param message <p>
     *            Information about the error.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Information about the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShareError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * Error type that happened when processing the operation.
     * </p>
     *
     * @return <p>
     *         Error type that happened when processing the operation.
     *         </p>
     */
    public String getError() {
        return error;
    }

    /**
     * <p>
     * Error type that happened when processing the operation.
     * </p>
     *
     * @param error <p>
     *            Error type that happened when processing the operation.
     *            </p>
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * Error type that happened when processing the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            Error type that happened when processing the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShareError withError(String error) {
        this.error = error;
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
        if (getAccounts() != null)
            sb.append("Accounts: " + getAccounts() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getError() != null)
            sb.append("Error: " + getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareError == false)
            return false;
        ShareError other = (ShareError) obj;

        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }
}
