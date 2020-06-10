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
 * Information about the portfolio share operation.
 * </p>
 */
public class ShareDetails implements Serializable {
    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     */
    private java.util.List<String> successfulShares;

    /**
     * <p>
     * List of errors.
     * </p>
     */
    private java.util.List<ShareError> shareErrors;

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     *
     * @return <p>
     *         List of accounts for whom the operation succeeded.
     *         </p>
     */
    public java.util.List<String> getSuccessfulShares() {
        return successfulShares;
    }

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     *
     * @param successfulShares <p>
     *            List of accounts for whom the operation succeeded.
     *            </p>
     */
    public void setSuccessfulShares(java.util.Collection<String> successfulShares) {
        if (successfulShares == null) {
            this.successfulShares = null;
            return;
        }

        this.successfulShares = new java.util.ArrayList<String>(successfulShares);
    }

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulShares <p>
     *            List of accounts for whom the operation succeeded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShareDetails withSuccessfulShares(String... successfulShares) {
        if (getSuccessfulShares() == null) {
            this.successfulShares = new java.util.ArrayList<String>(successfulShares.length);
        }
        for (String value : successfulShares) {
            this.successfulShares.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulShares <p>
     *            List of accounts for whom the operation succeeded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShareDetails withSuccessfulShares(java.util.Collection<String> successfulShares) {
        setSuccessfulShares(successfulShares);
        return this;
    }

    /**
     * <p>
     * List of errors.
     * </p>
     *
     * @return <p>
     *         List of errors.
     *         </p>
     */
    public java.util.List<ShareError> getShareErrors() {
        return shareErrors;
    }

    /**
     * <p>
     * List of errors.
     * </p>
     *
     * @param shareErrors <p>
     *            List of errors.
     *            </p>
     */
    public void setShareErrors(java.util.Collection<ShareError> shareErrors) {
        if (shareErrors == null) {
            this.shareErrors = null;
            return;
        }

        this.shareErrors = new java.util.ArrayList<ShareError>(shareErrors);
    }

    /**
     * <p>
     * List of errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shareErrors <p>
     *            List of errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShareDetails withShareErrors(ShareError... shareErrors) {
        if (getShareErrors() == null) {
            this.shareErrors = new java.util.ArrayList<ShareError>(shareErrors.length);
        }
        for (ShareError value : shareErrors) {
            this.shareErrors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shareErrors <p>
     *            List of errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShareDetails withShareErrors(java.util.Collection<ShareError> shareErrors) {
        setShareErrors(shareErrors);
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
        if (getSuccessfulShares() != null)
            sb.append("SuccessfulShares: " + getSuccessfulShares() + ",");
        if (getShareErrors() != null)
            sb.append("ShareErrors: " + getShareErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSuccessfulShares() == null) ? 0 : getSuccessfulShares().hashCode());
        hashCode = prime * hashCode
                + ((getShareErrors() == null) ? 0 : getShareErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareDetails == false)
            return false;
        ShareDetails other = (ShareDetails) obj;

        if (other.getSuccessfulShares() == null ^ this.getSuccessfulShares() == null)
            return false;
        if (other.getSuccessfulShares() != null
                && other.getSuccessfulShares().equals(this.getSuccessfulShares()) == false)
            return false;
        if (other.getShareErrors() == null ^ this.getShareErrors() == null)
            return false;
        if (other.getShareErrors() != null
                && other.getShareErrors().equals(this.getShareErrors()) == false)
            return false;
        return true;
    }
}
