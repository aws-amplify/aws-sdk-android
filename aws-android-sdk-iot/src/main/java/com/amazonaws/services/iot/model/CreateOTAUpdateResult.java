/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class CreateOTAUpdateResult implements Serializable {
    /**
     * <p>
     * The OTA update ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String otaUpdateId;

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     */
    private String awsIotJobId;

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     */
    private String otaUpdateArn;

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     */
    private String awsIotJobArn;

    /**
     * <p>
     * The OTA update status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     */
    private String otaUpdateStatus;

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The OTA update ID.
     *         </p>
     */
    public String getOtaUpdateId() {
        return otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param otaUpdateId <p>
     *            The OTA update ID.
     *            </p>
     */
    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param otaUpdateId <p>
     *            The OTA update ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateResult withOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
        return this;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     *
     * @return <p>
     *         The AWS IoT job ID associated with the OTA update.
     *         </p>
     */
    public String getAwsIotJobId() {
        return awsIotJobId;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     *
     * @param awsIotJobId <p>
     *            The AWS IoT job ID associated with the OTA update.
     *            </p>
     */
    public void setAwsIotJobId(String awsIotJobId) {
        this.awsIotJobId = awsIotJobId;
    }

    /**
     * <p>
     * The AWS IoT job ID associated with the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsIotJobId <p>
     *            The AWS IoT job ID associated with the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateResult withAwsIotJobId(String awsIotJobId) {
        this.awsIotJobId = awsIotJobId;
        return this;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     *
     * @return <p>
     *         The OTA update ARN.
     *         </p>
     */
    public String getOtaUpdateArn() {
        return otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     *
     * @param otaUpdateArn <p>
     *            The OTA update ARN.
     *            </p>
     */
    public void setOtaUpdateArn(String otaUpdateArn) {
        this.otaUpdateArn = otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otaUpdateArn <p>
     *            The OTA update ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateResult withOtaUpdateArn(String otaUpdateArn) {
        this.otaUpdateArn = otaUpdateArn;
        return this;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     *
     * @return <p>
     *         The AWS IoT job ARN associated with the OTA update.
     *         </p>
     */
    public String getAwsIotJobArn() {
        return awsIotJobArn;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     *
     * @param awsIotJobArn <p>
     *            The AWS IoT job ARN associated with the OTA update.
     *            </p>
     */
    public void setAwsIotJobArn(String awsIotJobArn) {
        this.awsIotJobArn = awsIotJobArn;
    }

    /**
     * <p>
     * The AWS IoT job ARN associated with the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsIotJobArn <p>
     *            The AWS IoT job ARN associated with the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateResult withAwsIotJobArn(String awsIotJobArn) {
        this.awsIotJobArn = awsIotJobArn;
        return this;
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @return <p>
     *         The OTA update status.
     *         </p>
     * @see OTAUpdateStatus
     */
    public String getOtaUpdateStatus() {
        return otaUpdateStatus;
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The OTA update status.
     *            </p>
     * @see OTAUpdateStatus
     */
    public void setOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The OTA update status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OTAUpdateStatus
     */
    public CreateOTAUpdateResult withOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The OTA update status.
     *            </p>
     * @see OTAUpdateStatus
     */
    public void setOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
    }

    /**
     * <p>
     * The OTA update status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The OTA update status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OTAUpdateStatus
     */
    public CreateOTAUpdateResult withOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
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
        if (getOtaUpdateId() != null)
            sb.append("otaUpdateId: " + getOtaUpdateId() + ",");
        if (getAwsIotJobId() != null)
            sb.append("awsIotJobId: " + getAwsIotJobId() + ",");
        if (getOtaUpdateArn() != null)
            sb.append("otaUpdateArn: " + getOtaUpdateArn() + ",");
        if (getAwsIotJobArn() != null)
            sb.append("awsIotJobArn: " + getAwsIotJobArn() + ",");
        if (getOtaUpdateStatus() != null)
            sb.append("otaUpdateStatus: " + getOtaUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        hashCode = prime * hashCode
                + ((getAwsIotJobId() == null) ? 0 : getAwsIotJobId().hashCode());
        hashCode = prime * hashCode
                + ((getOtaUpdateArn() == null) ? 0 : getOtaUpdateArn().hashCode());
        hashCode = prime * hashCode
                + ((getAwsIotJobArn() == null) ? 0 : getAwsIotJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getOtaUpdateStatus() == null) ? 0 : getOtaUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOTAUpdateResult == false)
            return false;
        CreateOTAUpdateResult other = (CreateOTAUpdateResult) obj;

        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null
                && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getAwsIotJobId() == null ^ this.getAwsIotJobId() == null)
            return false;
        if (other.getAwsIotJobId() != null
                && other.getAwsIotJobId().equals(this.getAwsIotJobId()) == false)
            return false;
        if (other.getOtaUpdateArn() == null ^ this.getOtaUpdateArn() == null)
            return false;
        if (other.getOtaUpdateArn() != null
                && other.getOtaUpdateArn().equals(this.getOtaUpdateArn()) == false)
            return false;
        if (other.getAwsIotJobArn() == null ^ this.getAwsIotJobArn() == null)
            return false;
        if (other.getAwsIotJobArn() != null
                && other.getAwsIotJobArn().equals(this.getAwsIotJobArn()) == false)
            return false;
        if (other.getOtaUpdateStatus() == null ^ this.getOtaUpdateStatus() == null)
            return false;
        if (other.getOtaUpdateStatus() != null
                && other.getOtaUpdateStatus().equals(this.getOtaUpdateStatus()) == false)
            return false;
        return true;
    }
}
