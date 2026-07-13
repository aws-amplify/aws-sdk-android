/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a Medical Scribe job. To use this operation, specify the name of the
 * job you want to delete using <code>MedicalScribeJobName</code>. Job names are
 * case sensitive.
 * </p>
 */
public class DeleteMedicalScribeJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Medical Scribe job you want to delete. Job names are case
     * sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String medicalScribeJobName;

    /**
     * <p>
     * The name of the Medical Scribe job you want to delete. Job names are case
     * sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the Medical Scribe job you want to delete. Job names
     *         are case sensitive.
     *         </p>
     */
    public String getMedicalScribeJobName() {
        return medicalScribeJobName;
    }

    /**
     * <p>
     * The name of the Medical Scribe job you want to delete. Job names are case
     * sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalScribeJobName <p>
     *            The name of the Medical Scribe job you want to delete. Job
     *            names are case sensitive.
     *            </p>
     */
    public void setMedicalScribeJobName(String medicalScribeJobName) {
        this.medicalScribeJobName = medicalScribeJobName;
    }

    /**
     * <p>
     * The name of the Medical Scribe job you want to delete. Job names are case
     * sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalScribeJobName <p>
     *            The name of the Medical Scribe job you want to delete. Job
     *            names are case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMedicalScribeJobRequest withMedicalScribeJobName(String medicalScribeJobName) {
        this.medicalScribeJobName = medicalScribeJobName;
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
        if (getMedicalScribeJobName() != null)
            sb.append("MedicalScribeJobName: " + getMedicalScribeJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMedicalScribeJobName() == null) ? 0 : getMedicalScribeJobName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMedicalScribeJobRequest == false)
            return false;
        DeleteMedicalScribeJobRequest other = (DeleteMedicalScribeJobRequest) obj;

        if (other.getMedicalScribeJobName() == null ^ this.getMedicalScribeJobName() == null)
            return false;
        if (other.getMedicalScribeJobName() != null
                && other.getMedicalScribeJobName().equals(this.getMedicalScribeJobName()) == false)
            return false;
        return true;
    }
}
