/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Structure containing both the normalized type of the extracted information
 * and the text associated with it. These are extracted as Type and Value
 * respectively.
 * </p>
 */
public class IdentityDocumentField implements Serializable {
    /**
     * <p>
     * Used to contain the information detected by an AnalyzeID operation.
     * </p>
     */
    private AnalyzeIDDetections type;

    /**
     * <p>
     * Used to contain the information detected by an AnalyzeID operation.
     * </p>
     */
    private AnalyzeIDDetections valueDetection;

    /**
     * <p>
     * Used to contain the information detected by an AnalyzeID operation.
     * </p>
     *
     * @return <p>
     *         Used to contain the information detected by an AnalyzeID
     *         operation.
     *         </p>
     */
    public AnalyzeIDDetections getType() {
        return type;
    }

    /**
     * <p>
     * Used to contain the information detected by an AnalyzeID operation.
     * </p>
     *
     * @param type <p>
     *            Used to contain the information detected by an AnalyzeID
     *            operation.
     *            </p>
     */
    public void setType(AnalyzeIDDetections type) {
        this.type = type;
    }

    /**
     * <p>
     * Used to contain the information detected by an AnalyzeID operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            Used to contain the information detected by an AnalyzeID
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityDocumentField withType(AnalyzeIDDetections type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Used to contain the information detected by an AnalyzeID operation.
     * </p>
     *
     * @return <p>
     *         Used to contain the information detected by an AnalyzeID
     *         operation.
     *         </p>
     */
    public AnalyzeIDDetections getValueDetection() {
        return valueDetection;
    }

    /**
     * <p>
     * Used to contain the information detected by an AnalyzeID operation.
     * </p>
     *
     * @param valueDetection <p>
     *            Used to contain the information detected by an AnalyzeID
     *            operation.
     *            </p>
     */
    public void setValueDetection(AnalyzeIDDetections valueDetection) {
        this.valueDetection = valueDetection;
    }

    /**
     * <p>
     * Used to contain the information detected by an AnalyzeID operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueDetection <p>
     *            Used to contain the information detected by an AnalyzeID
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityDocumentField withValueDetection(AnalyzeIDDetections valueDetection) {
        this.valueDetection = valueDetection;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValueDetection() != null)
            sb.append("ValueDetection: " + getValueDetection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getValueDetection() == null) ? 0 : getValueDetection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityDocumentField == false)
            return false;
        IdentityDocumentField other = (IdentityDocumentField) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValueDetection() == null ^ this.getValueDetection() == null)
            return false;
        if (other.getValueDetection() != null
                && other.getValueDetection().equals(this.getValueDetection()) == false)
            return false;
        return true;
    }
}
