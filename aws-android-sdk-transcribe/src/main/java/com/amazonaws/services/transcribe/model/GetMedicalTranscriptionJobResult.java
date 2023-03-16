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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

public class GetMedicalTranscriptionJobResult implements Serializable {
    /**
     * <p>
     * Provides detailed information about the specified medical transcription
     * job, including job status and, if applicable, failure reason.
     * </p>
     */
    private MedicalTranscriptionJob medicalTranscriptionJob;

    /**
     * <p>
     * Provides detailed information about the specified medical transcription
     * job, including job status and, if applicable, failure reason.
     * </p>
     *
     * @return <p>
     *         Provides detailed information about the specified medical
     *         transcription job, including job status and, if applicable,
     *         failure reason.
     *         </p>
     */
    public MedicalTranscriptionJob getMedicalTranscriptionJob() {
        return medicalTranscriptionJob;
    }

    /**
     * <p>
     * Provides detailed information about the specified medical transcription
     * job, including job status and, if applicable, failure reason.
     * </p>
     *
     * @param medicalTranscriptionJob <p>
     *            Provides detailed information about the specified medical
     *            transcription job, including job status and, if applicable,
     *            failure reason.
     *            </p>
     */
    public void setMedicalTranscriptionJob(MedicalTranscriptionJob medicalTranscriptionJob) {
        this.medicalTranscriptionJob = medicalTranscriptionJob;
    }

    /**
     * <p>
     * Provides detailed information about the specified medical transcription
     * job, including job status and, if applicable, failure reason.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param medicalTranscriptionJob <p>
     *            Provides detailed information about the specified medical
     *            transcription job, including job status and, if applicable,
     *            failure reason.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMedicalTranscriptionJobResult withMedicalTranscriptionJob(
            MedicalTranscriptionJob medicalTranscriptionJob) {
        this.medicalTranscriptionJob = medicalTranscriptionJob;
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
        if (getMedicalTranscriptionJob() != null)
            sb.append("MedicalTranscriptionJob: " + getMedicalTranscriptionJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMedicalTranscriptionJob() == null) ? 0 : getMedicalTranscriptionJob()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMedicalTranscriptionJobResult == false)
            return false;
        GetMedicalTranscriptionJobResult other = (GetMedicalTranscriptionJobResult) obj;

        if (other.getMedicalTranscriptionJob() == null ^ this.getMedicalTranscriptionJob() == null)
            return false;
        if (other.getMedicalTranscriptionJob() != null
                && other.getMedicalTranscriptionJob().equals(this.getMedicalTranscriptionJob()) == false)
            return false;
        return true;
    }
}
