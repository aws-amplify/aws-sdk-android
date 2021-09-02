/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Delete an OTA update.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >DeleteOTAUpdate</a> action.
 * </p>
 */
public class DeleteOTAUpdateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the OTA update to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String otaUpdateId;

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when
     * the OTA update is deleted. Ignored if the stream specified in the
     * OTAUpdate is supplied by the user.
     * </p>
     */
    private Boolean deleteStream;

    /**
     * <p>
     * When true, deletes the IoT job created by the OTAUpdate process even if
     * it is "IN_PROGRESS". Otherwise, if the job is not in a terminal state
     * ("COMPLETED" or "CANCELED") an exception will occur. The default is
     * false.
     * </p>
     */
    private Boolean forceDeleteAWSJob;

    /**
     * <p>
     * The ID of the OTA update to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The ID of the OTA update to delete.
     *         </p>
     */
    public String getOtaUpdateId() {
        return otaUpdateId;
    }

    /**
     * <p>
     * The ID of the OTA update to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param otaUpdateId <p>
     *            The ID of the OTA update to delete.
     *            </p>
     */
    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The ID of the OTA update to delete.
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
     *            The ID of the OTA update to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteOTAUpdateRequest withOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
        return this;
    }

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when
     * the OTA update is deleted. Ignored if the stream specified in the
     * OTAUpdate is supplied by the user.
     * </p>
     *
     * @return <p>
     *         When true, the stream created by the OTAUpdate process is deleted
     *         when the OTA update is deleted. Ignored if the stream specified
     *         in the OTAUpdate is supplied by the user.
     *         </p>
     */
    public Boolean isDeleteStream() {
        return deleteStream;
    }

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when
     * the OTA update is deleted. Ignored if the stream specified in the
     * OTAUpdate is supplied by the user.
     * </p>
     *
     * @return <p>
     *         When true, the stream created by the OTAUpdate process is deleted
     *         when the OTA update is deleted. Ignored if the stream specified
     *         in the OTAUpdate is supplied by the user.
     *         </p>
     */
    public Boolean getDeleteStream() {
        return deleteStream;
    }

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when
     * the OTA update is deleted. Ignored if the stream specified in the
     * OTAUpdate is supplied by the user.
     * </p>
     *
     * @param deleteStream <p>
     *            When true, the stream created by the OTAUpdate process is
     *            deleted when the OTA update is deleted. Ignored if the stream
     *            specified in the OTAUpdate is supplied by the user.
     *            </p>
     */
    public void setDeleteStream(Boolean deleteStream) {
        this.deleteStream = deleteStream;
    }

    /**
     * <p>
     * When true, the stream created by the OTAUpdate process is deleted when
     * the OTA update is deleted. Ignored if the stream specified in the
     * OTAUpdate is supplied by the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteStream <p>
     *            When true, the stream created by the OTAUpdate process is
     *            deleted when the OTA update is deleted. Ignored if the stream
     *            specified in the OTAUpdate is supplied by the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteOTAUpdateRequest withDeleteStream(Boolean deleteStream) {
        this.deleteStream = deleteStream;
        return this;
    }

    /**
     * <p>
     * When true, deletes the IoT job created by the OTAUpdate process even if
     * it is "IN_PROGRESS". Otherwise, if the job is not in a terminal state
     * ("COMPLETED" or "CANCELED") an exception will occur. The default is
     * false.
     * </p>
     *
     * @return <p>
     *         When true, deletes the IoT job created by the OTAUpdate process
     *         even if it is "IN_PROGRESS". Otherwise, if the job is not in a
     *         terminal state ("COMPLETED" or "CANCELED") an exception will
     *         occur. The default is false.
     *         </p>
     */
    public Boolean isForceDeleteAWSJob() {
        return forceDeleteAWSJob;
    }

    /**
     * <p>
     * When true, deletes the IoT job created by the OTAUpdate process even if
     * it is "IN_PROGRESS". Otherwise, if the job is not in a terminal state
     * ("COMPLETED" or "CANCELED") an exception will occur. The default is
     * false.
     * </p>
     *
     * @return <p>
     *         When true, deletes the IoT job created by the OTAUpdate process
     *         even if it is "IN_PROGRESS". Otherwise, if the job is not in a
     *         terminal state ("COMPLETED" or "CANCELED") an exception will
     *         occur. The default is false.
     *         </p>
     */
    public Boolean getForceDeleteAWSJob() {
        return forceDeleteAWSJob;
    }

    /**
     * <p>
     * When true, deletes the IoT job created by the OTAUpdate process even if
     * it is "IN_PROGRESS". Otherwise, if the job is not in a terminal state
     * ("COMPLETED" or "CANCELED") an exception will occur. The default is
     * false.
     * </p>
     *
     * @param forceDeleteAWSJob <p>
     *            When true, deletes the IoT job created by the OTAUpdate
     *            process even if it is "IN_PROGRESS". Otherwise, if the job is
     *            not in a terminal state ("COMPLETED" or "CANCELED") an
     *            exception will occur. The default is false.
     *            </p>
     */
    public void setForceDeleteAWSJob(Boolean forceDeleteAWSJob) {
        this.forceDeleteAWSJob = forceDeleteAWSJob;
    }

    /**
     * <p>
     * When true, deletes the IoT job created by the OTAUpdate process even if
     * it is "IN_PROGRESS". Otherwise, if the job is not in a terminal state
     * ("COMPLETED" or "CANCELED") an exception will occur. The default is
     * false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceDeleteAWSJob <p>
     *            When true, deletes the IoT job created by the OTAUpdate
     *            process even if it is "IN_PROGRESS". Otherwise, if the job is
     *            not in a terminal state ("COMPLETED" or "CANCELED") an
     *            exception will occur. The default is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteOTAUpdateRequest withForceDeleteAWSJob(Boolean forceDeleteAWSJob) {
        this.forceDeleteAWSJob = forceDeleteAWSJob;
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
        if (getDeleteStream() != null)
            sb.append("deleteStream: " + getDeleteStream() + ",");
        if (getForceDeleteAWSJob() != null)
            sb.append("forceDeleteAWSJob: " + getForceDeleteAWSJob());
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
                + ((getDeleteStream() == null) ? 0 : getDeleteStream().hashCode());
        hashCode = prime * hashCode
                + ((getForceDeleteAWSJob() == null) ? 0 : getForceDeleteAWSJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOTAUpdateRequest == false)
            return false;
        DeleteOTAUpdateRequest other = (DeleteOTAUpdateRequest) obj;

        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null
                && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getDeleteStream() == null ^ this.getDeleteStream() == null)
            return false;
        if (other.getDeleteStream() != null
                && other.getDeleteStream().equals(this.getDeleteStream()) == false)
            return false;
        if (other.getForceDeleteAWSJob() == null ^ this.getForceDeleteAWSJob() == null)
            return false;
        if (other.getForceDeleteAWSJob() != null
                && other.getForceDeleteAWSJob().equals(this.getForceDeleteAWSJob()) == false)
            return false;
        return true;
    }
}
