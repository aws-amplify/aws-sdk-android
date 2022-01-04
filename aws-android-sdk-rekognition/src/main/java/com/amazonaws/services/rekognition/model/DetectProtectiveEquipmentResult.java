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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class DetectProtectiveEquipmentResult implements Serializable {
    /**
     * <p>
     * The version number of the PPE detection model used to detect PPE in the
     * image.
     * </p>
     */
    private String protectiveEquipmentModelVersion;

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing
     * PPE).
     * </p>
     */
    private java.util.List<ProtectiveEquipmentPerson> persons;

    /**
     * <p>
     * Summary information for the types of PPE specified in the
     * <code>SummarizationAttributes</code> input parameter.
     * </p>
     */
    private ProtectiveEquipmentSummary summary;

    /**
     * <p>
     * The version number of the PPE detection model used to detect PPE in the
     * image.
     * </p>
     *
     * @return <p>
     *         The version number of the PPE detection model used to detect PPE
     *         in the image.
     *         </p>
     */
    public String getProtectiveEquipmentModelVersion() {
        return protectiveEquipmentModelVersion;
    }

    /**
     * <p>
     * The version number of the PPE detection model used to detect PPE in the
     * image.
     * </p>
     *
     * @param protectiveEquipmentModelVersion <p>
     *            The version number of the PPE detection model used to detect
     *            PPE in the image.
     *            </p>
     */
    public void setProtectiveEquipmentModelVersion(String protectiveEquipmentModelVersion) {
        this.protectiveEquipmentModelVersion = protectiveEquipmentModelVersion;
    }

    /**
     * <p>
     * The version number of the PPE detection model used to detect PPE in the
     * image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protectiveEquipmentModelVersion <p>
     *            The version number of the PPE detection model used to detect
     *            PPE in the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectProtectiveEquipmentResult withProtectiveEquipmentModelVersion(
            String protectiveEquipmentModelVersion) {
        this.protectiveEquipmentModelVersion = protectiveEquipmentModelVersion;
        return this;
    }

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing
     * PPE).
     * </p>
     *
     * @return <p>
     *         An array of persons detected in the image (including persons not
     *         wearing PPE).
     *         </p>
     */
    public java.util.List<ProtectiveEquipmentPerson> getPersons() {
        return persons;
    }

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing
     * PPE).
     * </p>
     *
     * @param persons <p>
     *            An array of persons detected in the image (including persons
     *            not wearing PPE).
     *            </p>
     */
    public void setPersons(java.util.Collection<ProtectiveEquipmentPerson> persons) {
        if (persons == null) {
            this.persons = null;
            return;
        }

        this.persons = new java.util.ArrayList<ProtectiveEquipmentPerson>(persons);
    }

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing
     * PPE).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persons <p>
     *            An array of persons detected in the image (including persons
     *            not wearing PPE).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectProtectiveEquipmentResult withPersons(ProtectiveEquipmentPerson... persons) {
        if (getPersons() == null) {
            this.persons = new java.util.ArrayList<ProtectiveEquipmentPerson>(persons.length);
        }
        for (ProtectiveEquipmentPerson value : persons) {
            this.persons.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing
     * PPE).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persons <p>
     *            An array of persons detected in the image (including persons
     *            not wearing PPE).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectProtectiveEquipmentResult withPersons(
            java.util.Collection<ProtectiveEquipmentPerson> persons) {
        setPersons(persons);
        return this;
    }

    /**
     * <p>
     * Summary information for the types of PPE specified in the
     * <code>SummarizationAttributes</code> input parameter.
     * </p>
     *
     * @return <p>
     *         Summary information for the types of PPE specified in the
     *         <code>SummarizationAttributes</code> input parameter.
     *         </p>
     */
    public ProtectiveEquipmentSummary getSummary() {
        return summary;
    }

    /**
     * <p>
     * Summary information for the types of PPE specified in the
     * <code>SummarizationAttributes</code> input parameter.
     * </p>
     *
     * @param summary <p>
     *            Summary information for the types of PPE specified in the
     *            <code>SummarizationAttributes</code> input parameter.
     *            </p>
     */
    public void setSummary(ProtectiveEquipmentSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Summary information for the types of PPE specified in the
     * <code>SummarizationAttributes</code> input parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summary <p>
     *            Summary information for the types of PPE specified in the
     *            <code>SummarizationAttributes</code> input parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectProtectiveEquipmentResult withSummary(ProtectiveEquipmentSummary summary) {
        this.summary = summary;
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
        if (getProtectiveEquipmentModelVersion() != null)
            sb.append("ProtectiveEquipmentModelVersion: " + getProtectiveEquipmentModelVersion()
                    + ",");
        if (getPersons() != null)
            sb.append("Persons: " + getPersons() + ",");
        if (getSummary() != null)
            sb.append("Summary: " + getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProtectiveEquipmentModelVersion() == null) ? 0
                        : getProtectiveEquipmentModelVersion().hashCode());
        hashCode = prime * hashCode + ((getPersons() == null) ? 0 : getPersons().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectProtectiveEquipmentResult == false)
            return false;
        DetectProtectiveEquipmentResult other = (DetectProtectiveEquipmentResult) obj;

        if (other.getProtectiveEquipmentModelVersion() == null
                ^ this.getProtectiveEquipmentModelVersion() == null)
            return false;
        if (other.getProtectiveEquipmentModelVersion() != null
                && other.getProtectiveEquipmentModelVersion().equals(
                        this.getProtectiveEquipmentModelVersion()) == false)
            return false;
        if (other.getPersons() == null ^ this.getPersons() == null)
            return false;
        if (other.getPersons() != null && other.getPersons().equals(this.getPersons()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }
}
