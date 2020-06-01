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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * The output configuration for monitoring jobs.
 * </p>
 */
public class MonitoringOutputConfig implements Serializable {
    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the
     * periodic monitoring jobs is uploaded.
     * </p>
     */
    private java.util.List<MonitoringOutput> monitoringOutputs;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the model artifacts at rest using Amazon S3 server-side
     * encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the
     * periodic monitoring jobs is uploaded.
     * </p>
     *
     * @return <p>
     *         Monitoring outputs for monitoring jobs. This is where the output
     *         of the periodic monitoring jobs is uploaded.
     *         </p>
     */
    public java.util.List<MonitoringOutput> getMonitoringOutputs() {
        return monitoringOutputs;
    }

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the
     * periodic monitoring jobs is uploaded.
     * </p>
     *
     * @param monitoringOutputs <p>
     *            Monitoring outputs for monitoring jobs. This is where the
     *            output of the periodic monitoring jobs is uploaded.
     *            </p>
     */
    public void setMonitoringOutputs(java.util.Collection<MonitoringOutput> monitoringOutputs) {
        if (monitoringOutputs == null) {
            this.monitoringOutputs = null;
            return;
        }

        this.monitoringOutputs = new java.util.ArrayList<MonitoringOutput>(monitoringOutputs);
    }

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the
     * periodic monitoring jobs is uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringOutputs <p>
     *            Monitoring outputs for monitoring jobs. This is where the
     *            output of the periodic monitoring jobs is uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringOutputConfig withMonitoringOutputs(MonitoringOutput... monitoringOutputs) {
        if (getMonitoringOutputs() == null) {
            this.monitoringOutputs = new java.util.ArrayList<MonitoringOutput>(
                    monitoringOutputs.length);
        }
        for (MonitoringOutput value : monitoringOutputs) {
            this.monitoringOutputs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Monitoring outputs for monitoring jobs. This is where the output of the
     * periodic monitoring jobs is uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringOutputs <p>
     *            Monitoring outputs for monitoring jobs. This is where the
     *            output of the periodic monitoring jobs is uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringOutputConfig withMonitoringOutputs(
            java.util.Collection<MonitoringOutput> monitoringOutputs) {
        setMonitoringOutputs(monitoringOutputs);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the model artifacts at rest using Amazon S3 server-side
     * encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS Key Management Service (AWS KMS) key that Amazon
     *         SageMaker uses to encrypt the model artifacts at rest using
     *         Amazon S3 server-side encryption.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the model artifacts at rest using Amazon S3 server-side
     * encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key that Amazon
     *            SageMaker uses to encrypt the model artifacts at rest using
     *            Amazon S3 server-side encryption.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the model artifacts at rest using Amazon S3 server-side
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key that Amazon
     *            SageMaker uses to encrypt the model artifacts at rest using
     *            Amazon S3 server-side encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringOutputConfig withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getMonitoringOutputs() != null)
            sb.append("MonitoringOutputs: " + getMonitoringOutputs() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMonitoringOutputs() == null) ? 0 : getMonitoringOutputs().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringOutputConfig == false)
            return false;
        MonitoringOutputConfig other = (MonitoringOutputConfig) obj;

        if (other.getMonitoringOutputs() == null ^ this.getMonitoringOutputs() == null)
            return false;
        if (other.getMonitoringOutputs() != null
                && other.getMonitoringOutputs().equals(this.getMonitoringOutputs()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
