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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a single occurrence of something interesting within the system.
 * Some examples of events are creating a cluster, adding or removing a cache
 * node, or rebooting a node.
 * </p>
 */
public class Event implements Serializable {
    /**
     * <p>
     * The identifier for the source of the event. For example, if the event
     * occurred at the cluster level, the identifier would be the name of the
     * cluster.
     * </p>
     */
    private String sourceIdentifier;

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a
     * security group, etc.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group,
     * cache-security-group, cache-subnet-group, replication-group
     */
    private String sourceType;

    /**
     * <p>
     * The text of the event.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     */
    private java.util.Date dateValue;

    /**
     * <p>
     * The identifier for the source of the event. For example, if the event
     * occurred at the cluster level, the identifier would be the name of the
     * cluster.
     * </p>
     *
     * @return <p>
     *         The identifier for the source of the event. For example, if the
     *         event occurred at the cluster level, the identifier would be the
     *         name of the cluster.
     *         </p>
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the source of the event. For example, if the event
     * occurred at the cluster level, the identifier would be the name of the
     * cluster.
     * </p>
     *
     * @param sourceIdentifier <p>
     *            The identifier for the source of the event. For example, if
     *            the event occurred at the cluster level, the identifier would
     *            be the name of the cluster.
     *            </p>
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the source of the event. For example, if the event
     * occurred at the cluster level, the identifier would be the name of the
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIdentifier <p>
     *            The identifier for the source of the event. For example, if
     *            the event occurred at the cluster level, the identifier would
     *            be the name of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a
     * security group, etc.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group,
     * cache-security-group, cache-subnet-group, replication-group
     *
     * @return <p>
     *         Specifies the origin of this event - a cluster, a parameter
     *         group, a security group, etc.
     *         </p>
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a
     * security group, etc.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group,
     * cache-security-group, cache-subnet-group, replication-group
     *
     * @param sourceType <p>
     *            Specifies the origin of this event - a cluster, a parameter
     *            group, a security group, etc.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a
     * security group, etc.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group,
     * cache-security-group, cache-subnet-group, replication-group
     *
     * @param sourceType <p>
     *            Specifies the origin of this event - a cluster, a parameter
     *            group, a security group, etc.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public Event withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a
     * security group, etc.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group,
     * cache-security-group, cache-subnet-group, replication-group
     *
     * @param sourceType <p>
     *            Specifies the origin of this event - a cluster, a parameter
     *            group, a security group, etc.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a
     * security group, etc.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group,
     * cache-security-group, cache-subnet-group, replication-group
     *
     * @param sourceType <p>
     *            Specifies the origin of this event - a cluster, a parameter
     *            group, a security group, etc.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public Event withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The text of the event.
     * </p>
     *
     * @return <p>
     *         The text of the event.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The text of the event.
     * </p>
     *
     * @param message <p>
     *            The text of the event.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The text of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The text of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     *
     * @return <p>
     *         The date and time when the event occurred.
     *         </p>
     */
    public java.util.Date getDate() {
        return dateValue;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     *
     * @param dateValue <p>
     *            The date and time when the event occurred.
     *            </p>
     */
    public void setDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateValue <p>
     *            The date and time when the event occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
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
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getDate() != null)
            sb.append("Date: " + getDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;

        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null
                && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        return true;
    }
}
