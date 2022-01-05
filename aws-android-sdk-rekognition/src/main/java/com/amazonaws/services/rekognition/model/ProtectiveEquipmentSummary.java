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

/**
 * <p>
 * Summary information for required items of personal protective equipment (PPE)
 * detected on persons by a call to <a>DetectProtectiveEquipment</a>. You
 * specify the required type of PPE in the <code>SummarizationAttributes</code>
 * (<a>ProtectiveEquipmentSummarizationAttributes</a>) input parameter. The
 * summary includes which persons were detected wearing the required personal
 * protective equipment (<code>PersonsWithRequiredEquipment</code>), which
 * persons were detected as not wearing the required PPE (
 * <code>PersonsWithoutRequiredEquipment</code>), and the persons in which a
 * determination could not be made (<code>PersonsIndeterminate</code>).
 * </p>
 * <p>
 * To get a total for each category, use the size of the field array. For
 * example, to find out how many people were detected as wearing the specified
 * PPE, use the size of the <code>PersonsWithRequiredEquipment</code> array. If
 * you want to find out more about a person, such as the location
 * (<a>BoundingBox</a>) of the person on the image, use the person ID in each
 * array element. Each person ID matches the ID field of a
 * <a>ProtectiveEquipmentPerson</a> object returned in the <code>Persons</code>
 * array by <code>DetectProtectiveEquipment</code>.
 * </p>
 */
public class ProtectiveEquipmentSummary implements Serializable {
    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective
     * equipment.
     * </p>
     */
    private java.util.List<Integer> personsWithRequiredEquipment;

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE
     * specified in the <code>RequiredEquipmentTypes</code> field of the
     * detected personal protective equipment.
     * </p>
     */
    private java.util.List<Integer> personsWithoutRequiredEquipment;

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if
     * they are wearing personal protective equipment.
     * </p>
     */
    private java.util.List<Integer> personsIndeterminate;

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective
     * equipment.
     * </p>
     *
     * @return <p>
     *         An array of IDs for persons who are wearing detected personal
     *         protective equipment.
     *         </p>
     */
    public java.util.List<Integer> getPersonsWithRequiredEquipment() {
        return personsWithRequiredEquipment;
    }

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective
     * equipment.
     * </p>
     *
     * @param personsWithRequiredEquipment <p>
     *            An array of IDs for persons who are wearing detected personal
     *            protective equipment.
     *            </p>
     */
    public void setPersonsWithRequiredEquipment(
            java.util.Collection<Integer> personsWithRequiredEquipment) {
        if (personsWithRequiredEquipment == null) {
            this.personsWithRequiredEquipment = null;
            return;
        }

        this.personsWithRequiredEquipment = new java.util.ArrayList<Integer>(
                personsWithRequiredEquipment);
    }

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective
     * equipment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param personsWithRequiredEquipment <p>
     *            An array of IDs for persons who are wearing detected personal
     *            protective equipment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentSummary withPersonsWithRequiredEquipment(
            Integer... personsWithRequiredEquipment) {
        if (getPersonsWithRequiredEquipment() == null) {
            this.personsWithRequiredEquipment = new java.util.ArrayList<Integer>(
                    personsWithRequiredEquipment.length);
        }
        for (Integer value : personsWithRequiredEquipment) {
            this.personsWithRequiredEquipment.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective
     * equipment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param personsWithRequiredEquipment <p>
     *            An array of IDs for persons who are wearing detected personal
     *            protective equipment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentSummary withPersonsWithRequiredEquipment(
            java.util.Collection<Integer> personsWithRequiredEquipment) {
        setPersonsWithRequiredEquipment(personsWithRequiredEquipment);
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE
     * specified in the <code>RequiredEquipmentTypes</code> field of the
     * detected personal protective equipment.
     * </p>
     *
     * @return <p>
     *         An array of IDs for persons who are not wearing all of the types
     *         of PPE specified in the <code>RequiredEquipmentTypes</code> field
     *         of the detected personal protective equipment.
     *         </p>
     */
    public java.util.List<Integer> getPersonsWithoutRequiredEquipment() {
        return personsWithoutRequiredEquipment;
    }

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE
     * specified in the <code>RequiredEquipmentTypes</code> field of the
     * detected personal protective equipment.
     * </p>
     *
     * @param personsWithoutRequiredEquipment <p>
     *            An array of IDs for persons who are not wearing all of the
     *            types of PPE specified in the
     *            <code>RequiredEquipmentTypes</code> field of the detected
     *            personal protective equipment.
     *            </p>
     */
    public void setPersonsWithoutRequiredEquipment(
            java.util.Collection<Integer> personsWithoutRequiredEquipment) {
        if (personsWithoutRequiredEquipment == null) {
            this.personsWithoutRequiredEquipment = null;
            return;
        }

        this.personsWithoutRequiredEquipment = new java.util.ArrayList<Integer>(
                personsWithoutRequiredEquipment);
    }

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE
     * specified in the <code>RequiredEquipmentTypes</code> field of the
     * detected personal protective equipment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param personsWithoutRequiredEquipment <p>
     *            An array of IDs for persons who are not wearing all of the
     *            types of PPE specified in the
     *            <code>RequiredEquipmentTypes</code> field of the detected
     *            personal protective equipment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentSummary withPersonsWithoutRequiredEquipment(
            Integer... personsWithoutRequiredEquipment) {
        if (getPersonsWithoutRequiredEquipment() == null) {
            this.personsWithoutRequiredEquipment = new java.util.ArrayList<Integer>(
                    personsWithoutRequiredEquipment.length);
        }
        for (Integer value : personsWithoutRequiredEquipment) {
            this.personsWithoutRequiredEquipment.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE
     * specified in the <code>RequiredEquipmentTypes</code> field of the
     * detected personal protective equipment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param personsWithoutRequiredEquipment <p>
     *            An array of IDs for persons who are not wearing all of the
     *            types of PPE specified in the
     *            <code>RequiredEquipmentTypes</code> field of the detected
     *            personal protective equipment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentSummary withPersonsWithoutRequiredEquipment(
            java.util.Collection<Integer> personsWithoutRequiredEquipment) {
        setPersonsWithoutRequiredEquipment(personsWithoutRequiredEquipment);
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if
     * they are wearing personal protective equipment.
     * </p>
     *
     * @return <p>
     *         An array of IDs for persons where it was not possible to
     *         determine if they are wearing personal protective equipment.
     *         </p>
     */
    public java.util.List<Integer> getPersonsIndeterminate() {
        return personsIndeterminate;
    }

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if
     * they are wearing personal protective equipment.
     * </p>
     *
     * @param personsIndeterminate <p>
     *            An array of IDs for persons where it was not possible to
     *            determine if they are wearing personal protective equipment.
     *            </p>
     */
    public void setPersonsIndeterminate(java.util.Collection<Integer> personsIndeterminate) {
        if (personsIndeterminate == null) {
            this.personsIndeterminate = null;
            return;
        }

        this.personsIndeterminate = new java.util.ArrayList<Integer>(personsIndeterminate);
    }

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if
     * they are wearing personal protective equipment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param personsIndeterminate <p>
     *            An array of IDs for persons where it was not possible to
     *            determine if they are wearing personal protective equipment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentSummary withPersonsIndeterminate(Integer... personsIndeterminate) {
        if (getPersonsIndeterminate() == null) {
            this.personsIndeterminate = new java.util.ArrayList<Integer>(
                    personsIndeterminate.length);
        }
        for (Integer value : personsIndeterminate) {
            this.personsIndeterminate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if
     * they are wearing personal protective equipment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param personsIndeterminate <p>
     *            An array of IDs for persons where it was not possible to
     *            determine if they are wearing personal protective equipment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentSummary withPersonsIndeterminate(
            java.util.Collection<Integer> personsIndeterminate) {
        setPersonsIndeterminate(personsIndeterminate);
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
        if (getPersonsWithRequiredEquipment() != null)
            sb.append("PersonsWithRequiredEquipment: " + getPersonsWithRequiredEquipment() + ",");
        if (getPersonsWithoutRequiredEquipment() != null)
            sb.append("PersonsWithoutRequiredEquipment: " + getPersonsWithoutRequiredEquipment()
                    + ",");
        if (getPersonsIndeterminate() != null)
            sb.append("PersonsIndeterminate: " + getPersonsIndeterminate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPersonsWithRequiredEquipment() == null) ? 0
                        : getPersonsWithRequiredEquipment().hashCode());
        hashCode = prime
                * hashCode
                + ((getPersonsWithoutRequiredEquipment() == null) ? 0
                        : getPersonsWithoutRequiredEquipment().hashCode());
        hashCode = prime * hashCode
                + ((getPersonsIndeterminate() == null) ? 0 : getPersonsIndeterminate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectiveEquipmentSummary == false)
            return false;
        ProtectiveEquipmentSummary other = (ProtectiveEquipmentSummary) obj;

        if (other.getPersonsWithRequiredEquipment() == null
                ^ this.getPersonsWithRequiredEquipment() == null)
            return false;
        if (other.getPersonsWithRequiredEquipment() != null
                && other.getPersonsWithRequiredEquipment().equals(
                        this.getPersonsWithRequiredEquipment()) == false)
            return false;
        if (other.getPersonsWithoutRequiredEquipment() == null
                ^ this.getPersonsWithoutRequiredEquipment() == null)
            return false;
        if (other.getPersonsWithoutRequiredEquipment() != null
                && other.getPersonsWithoutRequiredEquipment().equals(
                        this.getPersonsWithoutRequiredEquipment()) == false)
            return false;
        if (other.getPersonsIndeterminate() == null ^ this.getPersonsIndeterminate() == null)
            return false;
        if (other.getPersonsIndeterminate() != null
                && other.getPersonsIndeterminate().equals(this.getPersonsIndeterminate()) == false)
            return false;
        return true;
    }
}
