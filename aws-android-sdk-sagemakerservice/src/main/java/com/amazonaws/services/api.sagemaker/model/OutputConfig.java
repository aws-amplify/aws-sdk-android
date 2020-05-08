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
 * Contains information about the output location for the compiled model and the
 * device (target) that the model runs on.
 * </p>
 */
public class OutputConfig implements Serializable {
    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model
     * artifacts. For example, s3://bucket-name/key-name-prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3OutputLocation;

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has
     * been compiled. For example: ml_c5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     */
    private String targetDevice;

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model
     * artifacts. For example, s3://bucket-name/key-name-prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         Identifies the S3 path where you want Amazon SageMaker to store
     *         the model artifacts. For example,
     *         s3://bucket-name/key-name-prefix.
     *         </p>
     */
    public String getS3OutputLocation() {
        return s3OutputLocation;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model
     * artifacts. For example, s3://bucket-name/key-name-prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputLocation <p>
     *            Identifies the S3 path where you want Amazon SageMaker to
     *            store the model artifacts. For example,
     *            s3://bucket-name/key-name-prefix.
     *            </p>
     */
    public void setS3OutputLocation(String s3OutputLocation) {
        this.s3OutputLocation = s3OutputLocation;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model
     * artifacts. For example, s3://bucket-name/key-name-prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputLocation <p>
     *            Identifies the S3 path where you want Amazon SageMaker to
     *            store the model artifacts. For example,
     *            s3://bucket-name/key-name-prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputConfig withS3OutputLocation(String s3OutputLocation) {
        this.s3OutputLocation = s3OutputLocation;
        return this;
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has
     * been compiled. For example: ml_c5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     *
     * @return <p>
     *         Identifies the device that you want to run your model on after it
     *         has been compiled. For example: ml_c5.
     *         </p>
     * @see TargetDevice
     */
    public String getTargetDevice() {
        return targetDevice;
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has
     * been compiled. For example: ml_c5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     *
     * @param targetDevice <p>
     *            Identifies the device that you want to run your model on after
     *            it has been compiled. For example: ml_c5.
     *            </p>
     * @see TargetDevice
     */
    public void setTargetDevice(String targetDevice) {
        this.targetDevice = targetDevice;
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has
     * been compiled. For example: ml_c5.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     *
     * @param targetDevice <p>
     *            Identifies the device that you want to run your model on after
     *            it has been compiled. For example: ml_c5.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetDevice
     */
    public OutputConfig withTargetDevice(String targetDevice) {
        this.targetDevice = targetDevice;
        return this;
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has
     * been compiled. For example: ml_c5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     *
     * @param targetDevice <p>
     *            Identifies the device that you want to run your model on after
     *            it has been compiled. For example: ml_c5.
     *            </p>
     * @see TargetDevice
     */
    public void setTargetDevice(TargetDevice targetDevice) {
        this.targetDevice = targetDevice.toString();
    }

    /**
     * <p>
     * Identifies the device that you want to run your model on after it has
     * been compiled. For example: ml_c5.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     *
     * @param targetDevice <p>
     *            Identifies the device that you want to run your model on after
     *            it has been compiled. For example: ml_c5.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetDevice
     */
    public OutputConfig withTargetDevice(TargetDevice targetDevice) {
        this.targetDevice = targetDevice.toString();
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
        if (getS3OutputLocation() != null)
            sb.append("S3OutputLocation: " + getS3OutputLocation() + ",");
        if (getTargetDevice() != null)
            sb.append("TargetDevice: " + getTargetDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3OutputLocation() == null) ? 0 : getS3OutputLocation().hashCode());
        hashCode = prime * hashCode
                + ((getTargetDevice() == null) ? 0 : getTargetDevice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputConfig == false)
            return false;
        OutputConfig other = (OutputConfig) obj;

        if (other.getS3OutputLocation() == null ^ this.getS3OutputLocation() == null)
            return false;
        if (other.getS3OutputLocation() != null
                && other.getS3OutputLocation().equals(this.getS3OutputLocation()) == false)
            return false;
        if (other.getTargetDevice() == null ^ this.getTargetDevice() == null)
            return false;
        if (other.getTargetDevice() != null
                && other.getTargetDevice().equals(this.getTargetDevice()) == false)
            return false;
        return true;
    }
}
