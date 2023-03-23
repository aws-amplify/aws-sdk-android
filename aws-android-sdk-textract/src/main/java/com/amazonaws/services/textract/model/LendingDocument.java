/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Holds the structured data returned by AnalyzeDocument for lending documents.
 * </p>
 */
public class LendingDocument implements Serializable {
    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     */
    private java.util.List<LendingField> lendingFields;

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     */
    private java.util.List<SignatureDetection> signatureDetections;

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     *
     * @return <p>
     *         An array of LendingField objects.
     *         </p>
     */
    public java.util.List<LendingField> getLendingFields() {
        return lendingFields;
    }

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     *
     * @param lendingFields <p>
     *            An array of LendingField objects.
     *            </p>
     */
    public void setLendingFields(java.util.Collection<LendingField> lendingFields) {
        if (lendingFields == null) {
            this.lendingFields = null;
            return;
        }

        this.lendingFields = new java.util.ArrayList<LendingField>(lendingFields);
    }

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lendingFields <p>
     *            An array of LendingField objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingDocument withLendingFields(LendingField... lendingFields) {
        if (getLendingFields() == null) {
            this.lendingFields = new java.util.ArrayList<LendingField>(lendingFields.length);
        }
        for (LendingField value : lendingFields) {
            this.lendingFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of LendingField objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lendingFields <p>
     *            An array of LendingField objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingDocument withLendingFields(java.util.Collection<LendingField> lendingFields) {
        setLendingFields(lendingFields);
        return this;
    }

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     *
     * @return <p>
     *         A list of signatures detected in a lending document.
     *         </p>
     */
    public java.util.List<SignatureDetection> getSignatureDetections() {
        return signatureDetections;
    }

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     *
     * @param signatureDetections <p>
     *            A list of signatures detected in a lending document.
     *            </p>
     */
    public void setSignatureDetections(java.util.Collection<SignatureDetection> signatureDetections) {
        if (signatureDetections == null) {
            this.signatureDetections = null;
            return;
        }

        this.signatureDetections = new java.util.ArrayList<SignatureDetection>(signatureDetections);
    }

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signatureDetections <p>
     *            A list of signatures detected in a lending document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingDocument withSignatureDetections(SignatureDetection... signatureDetections) {
        if (getSignatureDetections() == null) {
            this.signatureDetections = new java.util.ArrayList<SignatureDetection>(
                    signatureDetections.length);
        }
        for (SignatureDetection value : signatureDetections) {
            this.signatureDetections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of signatures detected in a lending document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signatureDetections <p>
     *            A list of signatures detected in a lending document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingDocument withSignatureDetections(
            java.util.Collection<SignatureDetection> signatureDetections) {
        setSignatureDetections(signatureDetections);
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
        if (getLendingFields() != null)
            sb.append("LendingFields: " + getLendingFields() + ",");
        if (getSignatureDetections() != null)
            sb.append("SignatureDetections: " + getSignatureDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLendingFields() == null) ? 0 : getLendingFields().hashCode());
        hashCode = prime * hashCode
                + ((getSignatureDetections() == null) ? 0 : getSignatureDetections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingDocument == false)
            return false;
        LendingDocument other = (LendingDocument) obj;

        if (other.getLendingFields() == null ^ this.getLendingFields() == null)
            return false;
        if (other.getLendingFields() != null
                && other.getLendingFields().equals(this.getLendingFields()) == false)
            return false;
        if (other.getSignatureDetections() == null ^ this.getSignatureDetections() == null)
            return false;
        if (other.getSignatureDetections() != null
                && other.getSignatureDetections().equals(this.getSignatureDetections()) == false)
            return false;
        return true;
    }
}
