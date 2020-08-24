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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Describes an association status.</p>
 */
public class AssociationStatus implements Serializable {
    /**
     * <p>The date when the status changed.</p>
     */
    private java.util.Date dateValue;

    /**
     * <p>The status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     */
    private String name;

    /**
     * <p>The reason for the status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String message;

    /**
     * <p>A user-defined string.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String additionalInfo;

    /**
     * <p>The date when the status changed.</p>
     *
     * @return <p>The date when the status changed.</p>
     */
    public java.util.Date getDate() {
        return dateValue;
    }

    /**
     * <p>The date when the status changed.</p>
     *
     * @param dateValue <p>The date when the status changed.</p>
     */
    public void setDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>The date when the status changed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateValue <p>The date when the status changed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationStatus withDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
        return this;
    }

    /**
     * <p>The status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @return <p>The status.</p>
     *
     * @see AssociationStatusName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @param name <p>The status.</p>
     *
     * @see AssociationStatusName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @param name <p>The status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AssociationStatusName
     */
    public AssociationStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @param name <p>The status.</p>
     *
     * @see AssociationStatusName
     */
    public void setName(AssociationStatusName name) {
        this.name = name.toString();
    }

    /**
     * <p>The status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed
     *
     * @param name <p>The status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AssociationStatusName
     */
    public AssociationStatus withName(AssociationStatusName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>The reason for the status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>The reason for the status.</p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>The reason for the status.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>The reason for the status.</p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>The reason for the status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>The reason for the status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>A user-defined string.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>A user-defined string.</p>
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>A user-defined string.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param additionalInfo <p>A user-defined string.</p>
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>A user-defined string.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param additionalInfo <p>A user-defined string.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationStatus withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDate() != null) sb.append("Date: " + getDate() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssociationStatus == false) return false;
        AssociationStatus other = (AssociationStatus)obj;

        if (other.getDate() == null ^ this.getDate() == null) return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false;
        return true;
    }
}
