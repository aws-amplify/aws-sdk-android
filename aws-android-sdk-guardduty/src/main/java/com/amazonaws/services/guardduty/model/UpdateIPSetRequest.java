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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the IPSet specified by the IPSet ID.
 * </p>
 */
public class UpdateIPSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The detectorID that specifies the GuardDuty service whose IPSet you want
     * to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The unique ID that specifies the IPSet that you want to update.
     * </p>
     */
    private String ipSetId;

    /**
     * <p>
     * The unique ID that specifies the IPSet that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String name;

    /**
     * <p>
     * The updated URI of the file that contains the IPSet. For example: .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String location;

    /**
     * <p>
     * The updated Boolean value that specifies whether the IPSet is active or
     * not.
     * </p>
     */
    private Boolean activate;

    /**
     * <p>
     * The detectorID that specifies the GuardDuty service whose IPSet you want
     * to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The detectorID that specifies the GuardDuty service whose IPSet
     *         you want to update.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The detectorID that specifies the GuardDuty service whose IPSet you want
     * to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The detectorID that specifies the GuardDuty service whose
     *            IPSet you want to update.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detectorID that specifies the GuardDuty service whose IPSet you want
     * to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The detectorID that specifies the GuardDuty service whose
     *            IPSet you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The unique ID that specifies the IPSet that you want to update.
     * </p>
     *
     * @return <p>
     *         The unique ID that specifies the IPSet that you want to update.
     *         </p>
     */
    public String getIpSetId() {
        return ipSetId;
    }

    /**
     * <p>
     * The unique ID that specifies the IPSet that you want to update.
     * </p>
     *
     * @param ipSetId <p>
     *            The unique ID that specifies the IPSet that you want to
     *            update.
     *            </p>
     */
    public void setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
    }

    /**
     * <p>
     * The unique ID that specifies the IPSet that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipSetId <p>
     *            The unique ID that specifies the IPSet that you want to
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }

    /**
     * <p>
     * The unique ID that specifies the IPSet that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID that specifies the IPSet that you want to update.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The unique ID that specifies the IPSet that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param name <p>
     *            The unique ID that specifies the IPSet that you want to
     *            update.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique ID that specifies the IPSet that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param name <p>
     *            The unique ID that specifies the IPSet that you want to
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The updated URI of the file that contains the IPSet. For example: .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The updated URI of the file that contains the IPSet. For example:
     *         .
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The updated URI of the file that contains the IPSet. For example: .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param location <p>
     *            The updated URI of the file that contains the IPSet. For
     *            example: .
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The updated URI of the file that contains the IPSet. For example: .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param location <p>
     *            The updated URI of the file that contains the IPSet. For
     *            example: .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The updated Boolean value that specifies whether the IPSet is active or
     * not.
     * </p>
     *
     * @return <p>
     *         The updated Boolean value that specifies whether the IPSet is
     *         active or not.
     *         </p>
     */
    public Boolean isActivate() {
        return activate;
    }

    /**
     * <p>
     * The updated Boolean value that specifies whether the IPSet is active or
     * not.
     * </p>
     *
     * @return <p>
     *         The updated Boolean value that specifies whether the IPSet is
     *         active or not.
     *         </p>
     */
    public Boolean getActivate() {
        return activate;
    }

    /**
     * <p>
     * The updated Boolean value that specifies whether the IPSet is active or
     * not.
     * </p>
     *
     * @param activate <p>
     *            The updated Boolean value that specifies whether the IPSet is
     *            active or not.
     *            </p>
     */
    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    /**
     * <p>
     * The updated Boolean value that specifies whether the IPSet is active or
     * not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activate <p>
     *            The updated Boolean value that specifies whether the IPSet is
     *            active or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withActivate(Boolean activate) {
        this.activate = activate;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getIpSetId() != null)
            sb.append("IpSetId: " + getIpSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getActivate() != null)
            sb.append("Activate: " + getActivate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getIpSetId() == null) ? 0 : getIpSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getActivate() == null) ? 0 : getActivate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIPSetRequest == false)
            return false;
        UpdateIPSetRequest other = (UpdateIPSetRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getIpSetId() == null ^ this.getIpSetId() == null)
            return false;
        if (other.getIpSetId() != null && other.getIpSetId().equals(this.getIpSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getActivate() == null ^ this.getActivate() == null)
            return false;
        if (other.getActivate() != null && other.getActivate().equals(this.getActivate()) == false)
            return false;
        return true;
    }
}
