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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * A phone number used for Amazon Chime Business Calling or an Amazon Chime
 * Voice Connector.
 * </p>
 */
public class PhoneNumber implements Serializable {
    /**
     * <p>
     * The phone number ID.
     * </p>
     */
    private String phoneNumberId;

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     */
    private String e164PhoneNumber;

    /**
     * <p>
     * The phone number type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Local, TollFree
     */
    private String type;

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     */
    private String productType;

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     */
    private String status;

    /**
     * <p>
     * The phone number capabilities.
     * </p>
     */
    private PhoneNumberCapabilities capabilities;

    /**
     * <p>
     * The phone number associations.
     * </p>
     */
    private java.util.List<PhoneNumberAssociation> associations;

    /**
     * <p>
     * The outbound calling name associated with the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     */
    private String callingName;

    /**
     * <p>
     * The outbound calling name status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unassigned, UpdateInProgress, UpdateSucceeded,
     * UpdateFailed
     */
    private String callingNameStatus;

    /**
     * <p>
     * The phone number creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The updated phone number timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The deleted phone number timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date deletionTimestamp;

    /**
     * <p>
     * The phone number ID.
     * </p>
     *
     * @return <p>
     *         The phone number ID.
     *         </p>
     */
    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID.
     * </p>
     *
     * @param phoneNumberId <p>
     *            The phone number ID.
     *            </p>
     */
    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberId <p>
     *            The phone number ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @return <p>
     *         The phone number, in E.164 format.
     *         </p>
     */
    public String getE164PhoneNumber() {
        return e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param e164PhoneNumber <p>
     *            The phone number, in E.164 format.
     *            </p>
     */
    public void setE164PhoneNumber(String e164PhoneNumber) {
        this.e164PhoneNumber = e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param e164PhoneNumber <p>
     *            The phone number, in E.164 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withE164PhoneNumber(String e164PhoneNumber) {
        this.e164PhoneNumber = e164PhoneNumber;
        return this;
    }

    /**
     * <p>
     * The phone number type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Local, TollFree
     *
     * @return <p>
     *         The phone number type.
     *         </p>
     * @see PhoneNumberType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The phone number type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Local, TollFree
     *
     * @param type <p>
     *            The phone number type.
     *            </p>
     * @see PhoneNumberType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The phone number type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Local, TollFree
     *
     * @param type <p>
     *            The phone number type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberType
     */
    public PhoneNumber withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The phone number type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Local, TollFree
     *
     * @param type <p>
     *            The phone number type.
     *            </p>
     * @see PhoneNumberType
     */
    public void setType(PhoneNumberType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The phone number type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Local, TollFree
     *
     * @param type <p>
     *            The phone number type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberType
     */
    public PhoneNumber withType(PhoneNumberType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @return <p>
     *         The phone number product type.
     *         </p>
     * @see PhoneNumberProductType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number product type.
     *            </p>
     * @see PhoneNumberProductType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberProductType
     */
    public PhoneNumber withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number product type.
     *            </p>
     * @see PhoneNumberProductType
     */
    public void setProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberProductType
     */
    public PhoneNumber withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @return <p>
     *         The phone number status.
     *         </p>
     * @see PhoneNumberStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @see PhoneNumberStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberStatus
     */
    public PhoneNumber withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @see PhoneNumberStatus
     */
    public void setStatus(PhoneNumberStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberStatus
     */
    public PhoneNumber withStatus(PhoneNumberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The phone number capabilities.
     * </p>
     *
     * @return <p>
     *         The phone number capabilities.
     *         </p>
     */
    public PhoneNumberCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The phone number capabilities.
     * </p>
     *
     * @param capabilities <p>
     *            The phone number capabilities.
     *            </p>
     */
    public void setCapabilities(PhoneNumberCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The phone number capabilities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The phone number capabilities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withCapabilities(PhoneNumberCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * <p>
     * The phone number associations.
     * </p>
     *
     * @return <p>
     *         The phone number associations.
     *         </p>
     */
    public java.util.List<PhoneNumberAssociation> getAssociations() {
        return associations;
    }

    /**
     * <p>
     * The phone number associations.
     * </p>
     *
     * @param associations <p>
     *            The phone number associations.
     *            </p>
     */
    public void setAssociations(java.util.Collection<PhoneNumberAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new java.util.ArrayList<PhoneNumberAssociation>(associations);
    }

    /**
     * <p>
     * The phone number associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associations <p>
     *            The phone number associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withAssociations(PhoneNumberAssociation... associations) {
        if (getAssociations() == null) {
            this.associations = new java.util.ArrayList<PhoneNumberAssociation>(associations.length);
        }
        for (PhoneNumberAssociation value : associations) {
            this.associations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The phone number associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associations <p>
     *            The phone number associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withAssociations(java.util.Collection<PhoneNumberAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * The outbound calling name associated with the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @return <p>
     *         The outbound calling name associated with the phone number.
     *         </p>
     */
    public String getCallingName() {
        return callingName;
    }

    /**
     * <p>
     * The outbound calling name associated with the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @param callingName <p>
     *            The outbound calling name associated with the phone number.
     *            </p>
     */
    public void setCallingName(String callingName) {
        this.callingName = callingName;
    }

    /**
     * <p>
     * The outbound calling name associated with the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @param callingName <p>
     *            The outbound calling name associated with the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withCallingName(String callingName) {
        this.callingName = callingName;
        return this;
    }

    /**
     * <p>
     * The outbound calling name status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unassigned, UpdateInProgress, UpdateSucceeded,
     * UpdateFailed
     *
     * @return <p>
     *         The outbound calling name status.
     *         </p>
     * @see CallingNameStatus
     */
    public String getCallingNameStatus() {
        return callingNameStatus;
    }

    /**
     * <p>
     * The outbound calling name status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unassigned, UpdateInProgress, UpdateSucceeded,
     * UpdateFailed
     *
     * @param callingNameStatus <p>
     *            The outbound calling name status.
     *            </p>
     * @see CallingNameStatus
     */
    public void setCallingNameStatus(String callingNameStatus) {
        this.callingNameStatus = callingNameStatus;
    }

    /**
     * <p>
     * The outbound calling name status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unassigned, UpdateInProgress, UpdateSucceeded,
     * UpdateFailed
     *
     * @param callingNameStatus <p>
     *            The outbound calling name status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CallingNameStatus
     */
    public PhoneNumber withCallingNameStatus(String callingNameStatus) {
        this.callingNameStatus = callingNameStatus;
        return this;
    }

    /**
     * <p>
     * The outbound calling name status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unassigned, UpdateInProgress, UpdateSucceeded,
     * UpdateFailed
     *
     * @param callingNameStatus <p>
     *            The outbound calling name status.
     *            </p>
     * @see CallingNameStatus
     */
    public void setCallingNameStatus(CallingNameStatus callingNameStatus) {
        this.callingNameStatus = callingNameStatus.toString();
    }

    /**
     * <p>
     * The outbound calling name status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unassigned, UpdateInProgress, UpdateSucceeded,
     * UpdateFailed
     *
     * @param callingNameStatus <p>
     *            The outbound calling name status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CallingNameStatus
     */
    public PhoneNumber withCallingNameStatus(CallingNameStatus callingNameStatus) {
        this.callingNameStatus = callingNameStatus.toString();
        return this;
    }

    /**
     * <p>
     * The phone number creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The phone number creation timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The phone number creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The phone number creation timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The phone number creation timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The phone number creation timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The updated phone number timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The updated phone number timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * <p>
     * The updated phone number timestamp, in ISO 8601 format.
     * </p>
     *
     * @param updatedTimestamp <p>
     *            The updated phone number timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated phone number timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTimestamp <p>
     *            The updated phone number timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    /**
     * <p>
     * The deleted phone number timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The deleted phone number timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getDeletionTimestamp() {
        return deletionTimestamp;
    }

    /**
     * <p>
     * The deleted phone number timestamp, in ISO 8601 format.
     * </p>
     *
     * @param deletionTimestamp <p>
     *            The deleted phone number timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setDeletionTimestamp(java.util.Date deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
    }

    /**
     * <p>
     * The deleted phone number timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionTimestamp <p>
     *            The deleted phone number timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumber withDeletionTimestamp(java.util.Date deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: " + getPhoneNumberId() + ",");
        if (getE164PhoneNumber() != null)
            sb.append("E164PhoneNumber: " + getE164PhoneNumber() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getProductType() != null)
            sb.append("ProductType: " + getProductType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getAssociations() != null)
            sb.append("Associations: " + getAssociations() + ",");
        if (getCallingName() != null)
            sb.append("CallingName: " + getCallingName() + ",");
        if (getCallingNameStatus() != null)
            sb.append("CallingNameStatus: " + getCallingNameStatus() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: " + getUpdatedTimestamp() + ",");
        if (getDeletionTimestamp() != null)
            sb.append("DeletionTimestamp: " + getDeletionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode
                + ((getE164PhoneNumber() == null) ? 0 : getE164PhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode
                + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode
                + ((getCallingName() == null) ? 0 : getCallingName().hashCode());
        hashCode = prime * hashCode
                + ((getCallingNameStatus() == null) ? 0 : getCallingNameStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionTimestamp() == null) ? 0 : getDeletionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumber == false)
            return false;
        PhoneNumber other = (PhoneNumber) obj;

        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null
                && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getE164PhoneNumber() == null ^ this.getE164PhoneNumber() == null)
            return false;
        if (other.getE164PhoneNumber() != null
                && other.getE164PhoneNumber().equals(this.getE164PhoneNumber()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null
                && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null
                && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        if (other.getCallingName() == null ^ this.getCallingName() == null)
            return false;
        if (other.getCallingName() != null
                && other.getCallingName().equals(this.getCallingName()) == false)
            return false;
        if (other.getCallingNameStatus() == null ^ this.getCallingNameStatus() == null)
            return false;
        if (other.getCallingNameStatus() != null
                && other.getCallingNameStatus().equals(this.getCallingNameStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null
                && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getDeletionTimestamp() == null ^ this.getDeletionTimestamp() == null)
            return false;
        if (other.getDeletionTimestamp() != null
                && other.getDeletionTimestamp().equals(this.getDeletionTimestamp()) == false)
            return false;
        return true;
    }
}
