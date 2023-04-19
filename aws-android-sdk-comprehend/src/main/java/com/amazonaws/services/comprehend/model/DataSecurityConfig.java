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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Data security configuration.
 * </p>
 */
public class DataSecurityConfig implements Serializable {
    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom
     * models. The ModelKmsKeyId can be either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     */
    private String modelKmsKeyId;

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the
     * data lake.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     */
    private String dataLakeKmsKeyId;

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for the job. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom
     * models. The ModelKmsKeyId can be either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @return <p>
     *         ID for the KMS key that Amazon Comprehend uses to encrypt trained
     *         custom models. The ModelKmsKeyId can be either of the following
     *         formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getModelKmsKeyId() {
        return modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom
     * models. The ModelKmsKeyId can be either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @param modelKmsKeyId <p>
     *            ID for the KMS key that Amazon Comprehend uses to encrypt
     *            trained custom models. The ModelKmsKeyId can be either of the
     *            following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            KMS Key ID:
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN) of a KMS Key:
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setModelKmsKeyId(String modelKmsKeyId) {
        this.modelKmsKeyId = modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom
     * models. The ModelKmsKeyId can be either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @param modelKmsKeyId <p>
     *            ID for the KMS key that Amazon Comprehend uses to encrypt
     *            trained custom models. The ModelKmsKeyId can be either of the
     *            following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            KMS Key ID:
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN) of a KMS Key:
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSecurityConfig withModelKmsKeyId(String modelKmsKeyId) {
        this.modelKmsKeyId = modelKmsKeyId;
        return this;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @return <p>
     *         ID for the KMS key that Amazon Comprehend uses to encrypt the
     *         volume.
     *         </p>
     */
    public String getVolumeKmsKeyId() {
        return volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @param volumeKmsKeyId <p>
     *            ID for the KMS key that Amazon Comprehend uses to encrypt the
     *            volume.
     *            </p>
     */
    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @param volumeKmsKeyId <p>
     *            ID for the KMS key that Amazon Comprehend uses to encrypt the
     *            volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSecurityConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
        return this;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the
     * data lake.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @return <p>
     *         ID for the KMS key that Amazon Comprehend uses to encrypt the
     *         data in the data lake.
     *         </p>
     */
    public String getDataLakeKmsKeyId() {
        return dataLakeKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the
     * data lake.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @param dataLakeKmsKeyId <p>
     *            ID for the KMS key that Amazon Comprehend uses to encrypt the
     *            data in the data lake.
     *            </p>
     */
    public void setDataLakeKmsKeyId(String dataLakeKmsKeyId) {
        this.dataLakeKmsKeyId = dataLakeKmsKeyId;
    }

    /**
     * <p>
     * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the
     * data lake.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^\p{ASCII}+$<br/>
     *
     * @param dataLakeKmsKeyId <p>
     *            ID for the KMS key that Amazon Comprehend uses to encrypt the
     *            data in the data lake.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSecurityConfig withDataLakeKmsKeyId(String dataLakeKmsKeyId) {
        this.dataLakeKmsKeyId = dataLakeKmsKeyId;
        return this;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for the job. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @return <p>
     *         Configuration parameters for an optional private Virtual Private
     *         Cloud (VPC) containing the resources you are using for the job.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *         >Amazon VPC</a>.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for the job. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            Configuration parameters for an optional private Virtual
     *            Private Cloud (VPC) containing the resources you are using for
     *            the job. For more information, see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *            >Amazon VPC</a>.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for an optional private Virtual Private Cloud
     * (VPC) containing the resources you are using for the job. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            Configuration parameters for an optional private Virtual
     *            Private Cloud (VPC) containing the resources you are using for
     *            the job. For more information, see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *            >Amazon VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSecurityConfig withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
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
        if (getModelKmsKeyId() != null)
            sb.append("ModelKmsKeyId: " + getModelKmsKeyId() + ",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: " + getVolumeKmsKeyId() + ",");
        if (getDataLakeKmsKeyId() != null)
            sb.append("DataLakeKmsKeyId: " + getDataLakeKmsKeyId() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getModelKmsKeyId() == null) ? 0 : getModelKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDataLakeKmsKeyId() == null) ? 0 : getDataLakeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSecurityConfig == false)
            return false;
        DataSecurityConfig other = (DataSecurityConfig) obj;

        if (other.getModelKmsKeyId() == null ^ this.getModelKmsKeyId() == null)
            return false;
        if (other.getModelKmsKeyId() != null
                && other.getModelKmsKeyId().equals(this.getModelKmsKeyId()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null
                && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getDataLakeKmsKeyId() == null ^ this.getDataLakeKmsKeyId() == null)
            return false;
        if (other.getDataLakeKmsKeyId() != null
                && other.getDataLakeKmsKeyId().equals(this.getDataLakeKmsKeyId()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }
}
