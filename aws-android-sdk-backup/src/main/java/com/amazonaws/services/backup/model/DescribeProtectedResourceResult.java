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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

public class DescribeProtectedResourceResult implements Serializable {
    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an EBS
     * volume or an Amazon RDS database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String resourceType;

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and
     * Coordinated Universal Time (UTC). The value of
     * <code>LastBackupTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastBackupTime;

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies a resource. The format of the ARN
     *         depends on the resource type.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     *
     * @param resourceArn <p>
     *            An ARN that uniquely identifies a resource. The format of the
     *            ARN depends on the resource type.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            An ARN that uniquely identifies a resource. The format of the
     *            ARN depends on the resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProtectedResourceResult withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an EBS
     * volume or an Amazon RDS database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The type of AWS resource saved as a recovery point; for example,
     *         an EBS volume or an Amazon RDS database.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an EBS
     * volume or an Amazon RDS database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            The type of AWS resource saved as a recovery point; for
     *            example, an EBS volume or an Amazon RDS database.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an EBS
     * volume or an Amazon RDS database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            The type of AWS resource saved as a recovery point; for
     *            example, an EBS volume or an Amazon RDS database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProtectedResourceResult withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and
     * Coordinated Universal Time (UTC). The value of
     * <code>LastBackupTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time that a resource was last backed up, in Unix
     *         format and Coordinated Universal Time (UTC). The value of
     *         <code>LastBackupTime</code> is accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26,
     *         2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getLastBackupTime() {
        return lastBackupTime;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and
     * Coordinated Universal Time (UTC). The value of
     * <code>LastBackupTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param lastBackupTime <p>
     *            The date and time that a resource was last backed up, in Unix
     *            format and Coordinated Universal Time (UTC). The value of
     *            <code>LastBackupTime</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setLastBackupTime(java.util.Date lastBackupTime) {
        this.lastBackupTime = lastBackupTime;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and
     * Coordinated Universal Time (UTC). The value of
     * <code>LastBackupTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastBackupTime <p>
     *            The date and time that a resource was last backed up, in Unix
     *            format and Coordinated Universal Time (UTC). The value of
     *            <code>LastBackupTime</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProtectedResourceResult withLastBackupTime(java.util.Date lastBackupTime) {
        this.lastBackupTime = lastBackupTime;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getLastBackupTime() != null)
            sb.append("LastBackupTime: " + getLastBackupTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getLastBackupTime() == null) ? 0 : getLastBackupTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProtectedResourceResult == false)
            return false;
        DescribeProtectedResourceResult other = (DescribeProtectedResourceResult) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLastBackupTime() == null ^ this.getLastBackupTime() == null)
            return false;
        if (other.getLastBackupTime() != null
                && other.getLastBackupTime().equals(this.getLastBackupTime()) == false)
            return false;
        return true;
    }
}
