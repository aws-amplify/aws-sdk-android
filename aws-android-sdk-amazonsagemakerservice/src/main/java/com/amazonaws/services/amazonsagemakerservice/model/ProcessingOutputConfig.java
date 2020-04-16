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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The output configuration for the processing job.
 * </p>
 */
public class ProcessingOutputConfig implements Serializable {
    /**
     * <p>
     * Output configuration information for a processing job.
     * </p>
     */
    private java.util.List<ProcessingOutput> outputs;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the processing job output. <code>KmsKeyId</code> can be an ID
     * of a KMS key, ARN of a KMS key, alias of a KMS key, or alias of a KMS
     * key. The <code>KmsKeyId</code> is applied to all outputs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Output configuration information for a processing job.
     * </p>
     *
     * @return <p>
     *         Output configuration information for a processing job.
     *         </p>
     */
    public java.util.List<ProcessingOutput> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * Output configuration information for a processing job.
     * </p>
     *
     * @param outputs <p>
     *            Output configuration information for a processing job.
     *            </p>
     */
    public void setOutputs(java.util.Collection<ProcessingOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<ProcessingOutput>(outputs);
    }

    /**
     * <p>
     * Output configuration information for a processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs <p>
     *            Output configuration information for a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingOutputConfig withOutputs(ProcessingOutput... outputs) {
        if (getOutputs() == null) {
            this.outputs = new java.util.ArrayList<ProcessingOutput>(outputs.length);
        }
        for (ProcessingOutput value : outputs) {
            this.outputs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Output configuration information for a processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs <p>
     *            Output configuration information for a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingOutputConfig withOutputs(java.util.Collection<ProcessingOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the processing job output. <code>KmsKeyId</code> can be an ID
     * of a KMS key, ARN of a KMS key, alias of a KMS key, or alias of a KMS
     * key. The <code>KmsKeyId</code> is applied to all outputs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS Key Management Service (AWS KMS) key that Amazon
     *         SageMaker uses to encrypt the processing job output.
     *         <code>KmsKeyId</code> can be an ID of a KMS key, ARN of a KMS
     *         key, alias of a KMS key, or alias of a KMS key. The
     *         <code>KmsKeyId</code> is applied to all outputs.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the processing job output. <code>KmsKeyId</code> can be an ID
     * of a KMS key, ARN of a KMS key, alias of a KMS key, or alias of a KMS
     * key. The <code>KmsKeyId</code> is applied to all outputs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The AWS Key Management Service (AWS KMS) key that Amazon
     *            SageMaker uses to encrypt the processing job output.
     *            <code>KmsKeyId</code> can be an ID of a KMS key, ARN of a KMS
     *            key, alias of a KMS key, or alias of a KMS key. The
     *            <code>KmsKeyId</code> is applied to all outputs.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses
     * to encrypt the processing job output. <code>KmsKeyId</code> can be an ID
     * of a KMS key, ARN of a KMS key, alias of a KMS key, or alias of a KMS
     * key. The <code>KmsKeyId</code> is applied to all outputs.
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
     *            SageMaker uses to encrypt the processing job output.
     *            <code>KmsKeyId</code> can be an ID of a KMS key, ARN of a KMS
     *            key, alias of a KMS key, or alias of a KMS key. The
     *            <code>KmsKeyId</code> is applied to all outputs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingOutputConfig withKmsKeyId(String kmsKeyId) {
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
        if (getOutputs() != null)
            sb.append("Outputs: " + getOutputs() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingOutputConfig == false)
            return false;
        ProcessingOutputConfig other = (ProcessingOutputConfig) obj;

        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
