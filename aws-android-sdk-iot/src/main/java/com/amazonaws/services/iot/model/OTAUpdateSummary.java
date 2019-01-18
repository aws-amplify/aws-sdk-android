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

/**
 * <p>
 * An OTA update summary.
 * </p>
 */
public class OTAUpdateSummary implements Serializable {
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
     * The OTA update ARN.
     * </p>
     */
    private String otaUpdateArn;

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     */
    private java.util.Date creationDate;

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
    public OTAUpdateSummary withOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
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
    public OTAUpdateSummary withOtaUpdateArn(String otaUpdateArn) {
        this.otaUpdateArn = otaUpdateArn;
        return this;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     *
     * @return <p>
     *         The date when the OTA update was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date when the OTA update was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date when the OTA update was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateSummary withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getOtaUpdateArn() != null)
            sb.append("otaUpdateArn: " + getOtaUpdateArn() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate());
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
                + ((getOtaUpdateArn() == null) ? 0 : getOtaUpdateArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OTAUpdateSummary == false)
            return false;
        OTAUpdateSummary other = (OTAUpdateSummary) obj;

        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null
                && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getOtaUpdateArn() == null ^ this.getOtaUpdateArn() == null)
            return false;
        if (other.getOtaUpdateArn() != null
                && other.getOtaUpdateArn().equals(this.getOtaUpdateArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
