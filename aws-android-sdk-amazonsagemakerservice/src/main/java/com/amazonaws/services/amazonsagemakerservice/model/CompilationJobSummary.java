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
 * A summary of a model compilation job.
 * </p>
 */
public class CompilationJobSummary implements Serializable {
    /**
     * <p>
     * The name of the model compilation job that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String compilationJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*
     * <br/>
     */
    private String compilationJobArn;

    /**
     * <p>
     * The time when the model compilation job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time when the model compilation job started.
     * </p>
     */
    private java.util.Date compilationStartTime;

    /**
     * <p>
     * The time when the model compilation job completed.
     * </p>
     */
    private java.util.Date compilationEndTime;

    /**
     * <p>
     * The type of device that the model will run on after compilation has
     * completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     */
    private String compilationTargetDevice;

    /**
     * <p>
     * The time when the model compilation job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     */
    private String compilationJobStatus;

    /**
     * <p>
     * The name of the model compilation job that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the model compilation job that you want a summary
     *         for.
     *         </p>
     */
    public String getCompilationJobName() {
        return compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param compilationJobName <p>
     *            The name of the model compilation job that you want a summary
     *            for.
     *            </p>
     */
    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job that you want a summary for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param compilationJobName <p>
     *            The name of the model compilation job that you want a summary
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompilationJobSummary withCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the model compilation job.
     *         </p>
     */
    public String getCompilationJobArn() {
        return compilationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*
     * <br/>
     *
     * @param compilationJobArn <p>
     *            The Amazon Resource Name (ARN) of the model compilation job.
     *            </p>
     */
    public void setCompilationJobArn(String compilationJobArn) {
        this.compilationJobArn = compilationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*
     * <br/>
     *
     * @param compilationJobArn <p>
     *            The Amazon Resource Name (ARN) of the model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompilationJobSummary withCompilationJobArn(String compilationJobArn) {
        this.compilationJobArn = compilationJobArn;
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job was created.
     * </p>
     *
     * @return <p>
     *         The time when the model compilation job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time when the model compilation job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time when the model compilation job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the model compilation job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when the model compilation job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompilationJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job started.
     * </p>
     *
     * @return <p>
     *         The time when the model compilation job started.
     *         </p>
     */
    public java.util.Date getCompilationStartTime() {
        return compilationStartTime;
    }

    /**
     * <p>
     * The time when the model compilation job started.
     * </p>
     *
     * @param compilationStartTime <p>
     *            The time when the model compilation job started.
     *            </p>
     */
    public void setCompilationStartTime(java.util.Date compilationStartTime) {
        this.compilationStartTime = compilationStartTime;
    }

    /**
     * <p>
     * The time when the model compilation job started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compilationStartTime <p>
     *            The time when the model compilation job started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompilationJobSummary withCompilationStartTime(java.util.Date compilationStartTime) {
        this.compilationStartTime = compilationStartTime;
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job completed.
     * </p>
     *
     * @return <p>
     *         The time when the model compilation job completed.
     *         </p>
     */
    public java.util.Date getCompilationEndTime() {
        return compilationEndTime;
    }

    /**
     * <p>
     * The time when the model compilation job completed.
     * </p>
     *
     * @param compilationEndTime <p>
     *            The time when the model compilation job completed.
     *            </p>
     */
    public void setCompilationEndTime(java.util.Date compilationEndTime) {
        this.compilationEndTime = compilationEndTime;
    }

    /**
     * <p>
     * The time when the model compilation job completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compilationEndTime <p>
     *            The time when the model compilation job completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompilationJobSummary withCompilationEndTime(java.util.Date compilationEndTime) {
        this.compilationEndTime = compilationEndTime;
        return this;
    }

    /**
     * <p>
     * The type of device that the model will run on after compilation has
     * completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     *
     * @return <p>
     *         The type of device that the model will run on after compilation
     *         has completed.
     *         </p>
     * @see TargetDevice
     */
    public String getCompilationTargetDevice() {
        return compilationTargetDevice;
    }

    /**
     * <p>
     * The type of device that the model will run on after compilation has
     * completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     *
     * @param compilationTargetDevice <p>
     *            The type of device that the model will run on after
     *            compilation has completed.
     *            </p>
     * @see TargetDevice
     */
    public void setCompilationTargetDevice(String compilationTargetDevice) {
        this.compilationTargetDevice = compilationTargetDevice;
    }

    /**
     * <p>
     * The type of device that the model will run on after compilation has
     * completed.
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
     * @param compilationTargetDevice <p>
     *            The type of device that the model will run on after
     *            compilation has completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetDevice
     */
    public CompilationJobSummary withCompilationTargetDevice(String compilationTargetDevice) {
        this.compilationTargetDevice = compilationTargetDevice;
        return this;
    }

    /**
     * <p>
     * The type of device that the model will run on after compilation has
     * completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lambda, ml_m4, ml_m5, ml_c4, ml_c5, ml_p2, ml_p3,
     * ml_inf1, jetson_tx1, jetson_tx2, jetson_nano, jetson_xavier, rasp3b,
     * imx8qm, deeplens, rk3399, rk3288, aisage, sbe_c, qcs605, qcs603,
     * sitara_am57x, amba_cv22
     *
     * @param compilationTargetDevice <p>
     *            The type of device that the model will run on after
     *            compilation has completed.
     *            </p>
     * @see TargetDevice
     */
    public void setCompilationTargetDevice(TargetDevice compilationTargetDevice) {
        this.compilationTargetDevice = compilationTargetDevice.toString();
    }

    /**
     * <p>
     * The type of device that the model will run on after compilation has
     * completed.
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
     * @param compilationTargetDevice <p>
     *            The type of device that the model will run on after
     *            compilation has completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetDevice
     */
    public CompilationJobSummary withCompilationTargetDevice(TargetDevice compilationTargetDevice) {
        this.compilationTargetDevice = compilationTargetDevice.toString();
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job was last modified.
     * </p>
     *
     * @return <p>
     *         The time when the model compilation job was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The time when the model compilation job was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The time when the model compilation job was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the model compilation job was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The time when the model compilation job was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompilationJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @return <p>
     *         The status of the model compilation job.
     *         </p>
     * @see CompilationJobStatus
     */
    public String getCompilationJobStatus() {
        return compilationJobStatus;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @param compilationJobStatus <p>
     *            The status of the model compilation job.
     *            </p>
     * @see CompilationJobStatus
     */
    public void setCompilationJobStatus(String compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @param compilationJobStatus <p>
     *            The status of the model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompilationJobStatus
     */
    public CompilationJobSummary withCompilationJobStatus(String compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @param compilationJobStatus <p>
     *            The status of the model compilation job.
     *            </p>
     * @see CompilationJobStatus
     */
    public void setCompilationJobStatus(CompilationJobStatus compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus.toString();
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING,
     * STOPPED
     *
     * @param compilationJobStatus <p>
     *            The status of the model compilation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompilationJobStatus
     */
    public CompilationJobSummary withCompilationJobStatus(CompilationJobStatus compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus.toString();
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
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: " + getCompilationJobName() + ",");
        if (getCompilationJobArn() != null)
            sb.append("CompilationJobArn: " + getCompilationJobArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCompilationStartTime() != null)
            sb.append("CompilationStartTime: " + getCompilationStartTime() + ",");
        if (getCompilationEndTime() != null)
            sb.append("CompilationEndTime: " + getCompilationEndTime() + ",");
        if (getCompilationTargetDevice() != null)
            sb.append("CompilationTargetDevice: " + getCompilationTargetDevice() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getCompilationJobStatus() != null)
            sb.append("CompilationJobStatus: " + getCompilationJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode
                + ((getCompilationJobArn() == null) ? 0 : getCompilationJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompilationStartTime() == null) ? 0 : getCompilationStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompilationEndTime() == null) ? 0 : getCompilationEndTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getCompilationTargetDevice() == null) ? 0 : getCompilationTargetDevice()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompilationJobStatus() == null) ? 0 : getCompilationJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompilationJobSummary == false)
            return false;
        CompilationJobSummary other = (CompilationJobSummary) obj;

        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null
                && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        if (other.getCompilationJobArn() == null ^ this.getCompilationJobArn() == null)
            return false;
        if (other.getCompilationJobArn() != null
                && other.getCompilationJobArn().equals(this.getCompilationJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompilationStartTime() == null ^ this.getCompilationStartTime() == null)
            return false;
        if (other.getCompilationStartTime() != null
                && other.getCompilationStartTime().equals(this.getCompilationStartTime()) == false)
            return false;
        if (other.getCompilationEndTime() == null ^ this.getCompilationEndTime() == null)
            return false;
        if (other.getCompilationEndTime() != null
                && other.getCompilationEndTime().equals(this.getCompilationEndTime()) == false)
            return false;
        if (other.getCompilationTargetDevice() == null ^ this.getCompilationTargetDevice() == null)
            return false;
        if (other.getCompilationTargetDevice() != null
                && other.getCompilationTargetDevice().equals(this.getCompilationTargetDevice()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCompilationJobStatus() == null ^ this.getCompilationJobStatus() == null)
            return false;
        if (other.getCompilationJobStatus() != null
                && other.getCompilationJobStatus().equals(this.getCompilationJobStatus()) == false)
            return false;
        return true;
    }
}
