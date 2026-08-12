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

public class StartMedicalScribeJobResult implements Serializable {
    /**
     * <p>
     * Provides detailed information about the current Medical Scribe job,
     * including job status and, if applicable, failure reason.
     * </p>
     */
    private MedicalScribeJob medicalScribeJob;

    /**
     * <p>
     * Provides detailed information about the current Medical Scribe job,
     * including job status and, if applicable, failure reason.
     * </p>
     *
     * @return <p>
     *         Provides detailed information about the current Medical Scribe
     *         job, including job status and, if applicable, failure reason.
     *         </p>
     */
    public MedicalScribeJob getMedicalScribeJob() {
        return medicalScribeJob;
    }

    /**
     * <p>
     * Provides detailed information about the current Medical Scribe job,
     * including job status and, if applicable, failure reason.
     * </p>
     *
     * @param medicalScribeJob <p>
     *            Provides detailed information about the current Medical Scribe
     *            job, including job status and, if applicable, failure reason.
     *            </p>
     */
    public void setMedicalScribeJob(MedicalScribeJob medicalScribeJob) {
        this.medicalScribeJob = medicalScribeJob;
    }

    /**
     * <p>
     * Provides detailed information about the current Medical Scribe job,
     * including job status and, if applicable, failure reason.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param medicalScribeJob <p>
     *            Provides detailed information about the current Medical Scribe
     *            job, including job status and, if applicable, failure reason.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalScribeJobResult withMedicalScribeJob(MedicalScribeJob medicalScribeJob) {
        this.medicalScribeJob = medicalScribeJob;
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
        if (getMedicalScribeJob() != null)
            sb.append("MedicalScribeJob: " + getMedicalScribeJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMedicalScribeJob() == null) ? 0 : getMedicalScribeJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMedicalScribeJobResult == false)
            return false;
        StartMedicalScribeJobResult other = (StartMedicalScribeJobResult) obj;

        if (other.getMedicalScribeJob() == null ^ this.getMedicalScribeJob() == null)
            return false;
        if (other.getMedicalScribeJob() != null
                && other.getMedicalScribeJob().equals(this.getMedicalScribeJob()) == false)
            return false;
        return true;
    }
}
