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
 * Holds the normalized key-value pairs returned by AnalyzeDocument, including
 * the document type, detected text, and geometry.
 * </p>
 */
public class LendingField implements Serializable {
    /**
     * <p>
     * The type of the lending document.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The results extracted for a lending document.
     * </p>
     */
    private LendingDetection keyDetection;

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     */
    private java.util.List<LendingDetection> valueDetections;

    /**
     * <p>
     * The type of the lending document.
     * </p>
     *
     * @return <p>
     *         The type of the lending document.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the lending document.
     * </p>
     *
     * @param type <p>
     *            The type of the lending document.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the lending document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of the lending document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingField withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The results extracted for a lending document.
     * </p>
     *
     * @return <p>
     *         The results extracted for a lending document.
     *         </p>
     */
    public LendingDetection getKeyDetection() {
        return keyDetection;
    }

    /**
     * <p>
     * The results extracted for a lending document.
     * </p>
     *
     * @param keyDetection <p>
     *            The results extracted for a lending document.
     *            </p>
     */
    public void setKeyDetection(LendingDetection keyDetection) {
        this.keyDetection = keyDetection;
    }

    /**
     * <p>
     * The results extracted for a lending document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyDetection <p>
     *            The results extracted for a lending document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingField withKeyDetection(LendingDetection keyDetection) {
        this.keyDetection = keyDetection;
        return this;
    }

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     *
     * @return <p>
     *         An array of LendingDetection objects.
     *         </p>
     */
    public java.util.List<LendingDetection> getValueDetections() {
        return valueDetections;
    }

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     *
     * @param valueDetections <p>
     *            An array of LendingDetection objects.
     *            </p>
     */
    public void setValueDetections(java.util.Collection<LendingDetection> valueDetections) {
        if (valueDetections == null) {
            this.valueDetections = null;
            return;
        }

        this.valueDetections = new java.util.ArrayList<LendingDetection>(valueDetections);
    }

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueDetections <p>
     *            An array of LendingDetection objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingField withValueDetections(LendingDetection... valueDetections) {
        if (getValueDetections() == null) {
            this.valueDetections = new java.util.ArrayList<LendingDetection>(valueDetections.length);
        }
        for (LendingDetection value : valueDetections) {
            this.valueDetections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueDetections <p>
     *            An array of LendingDetection objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingField withValueDetections(java.util.Collection<LendingDetection> valueDetections) {
        setValueDetections(valueDetections);
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
        if (getKeyDetection() != null)
            sb.append("KeyDetection: " + getKeyDetection() + ",");
        if (getValueDetections() != null)
            sb.append("ValueDetections: " + getValueDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getKeyDetection() == null) ? 0 : getKeyDetection().hashCode());
        hashCode = prime * hashCode
                + ((getValueDetections() == null) ? 0 : getValueDetections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingField == false)
            return false;
        LendingField other = (LendingField) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeyDetection() == null ^ this.getKeyDetection() == null)
            return false;
        if (other.getKeyDetection() != null
                && other.getKeyDetection().equals(this.getKeyDetection()) == false)
            return false;
        if (other.getValueDetections() == null ^ this.getValueDetections() == null)
            return false;
        if (other.getValueDetections() != null
                && other.getValueDetections().equals(this.getValueDetections()) == false)
            return false;
        return true;
    }
}
