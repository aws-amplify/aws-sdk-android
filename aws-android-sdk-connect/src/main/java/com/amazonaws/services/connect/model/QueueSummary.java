/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains summary information about a queue.
 * </p>
 */
public class QueueSummary implements Serializable {
    /**
     * <p>
     * The identifier of the queue.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>
     * The type of queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, AGENT
     */
    private String queueType;

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     */
    private String lastModifiedRegion;

    /**
     * <p>
     * The identifier of the queue.
     * </p>
     *
     * @return <p>
     *         The identifier of the queue.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the queue.
     * </p>
     *
     * @param id <p>
     *            The identifier of the queue.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the queue.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the queue.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the queue.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the queue.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, AGENT
     *
     * @return <p>
     *         The type of queue.
     *         </p>
     * @see QueueType
     */
    public String getQueueType() {
        return queueType;
    }

    /**
     * <p>
     * The type of queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, AGENT
     *
     * @param queueType <p>
     *            The type of queue.
     *            </p>
     * @see QueueType
     */
    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    /**
     * <p>
     * The type of queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, AGENT
     *
     * @param queueType <p>
     *            The type of queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueueType
     */
    public QueueSummary withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * <p>
     * The type of queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, AGENT
     *
     * @param queueType <p>
     *            The type of queue.
     *            </p>
     * @see QueueType
     */
    public void setQueueType(QueueType queueType) {
        this.queueType = queueType.toString();
    }

    /**
     * <p>
     * The type of queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, AGENT
     *
     * @param queueType <p>
     *            The type of queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueueType
     */
    public QueueSummary withQueueType(QueueType queueType) {
        this.queueType = queueType.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     *
     * @return <p>
     *         The timestamp when this resource was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The timestamp when this resource was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when this resource was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The timestamp when this resource was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region where this resource was last
     *         modified.
     *         </p>
     */
    public String getLastModifiedRegion() {
        return lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param lastModifiedRegion <p>
     *            The Amazon Web Services Region where this resource was last
     *            modified.
     *            </p>
     */
    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where this resource was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param lastModifiedRegion <p>
     *            The Amazon Web Services Region where this resource was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueSummary withLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getQueueType() != null)
            sb.append("QueueType: " + getQueueType() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: " + getLastModifiedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueueType() == null) ? 0 : getQueueType().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueueSummary == false)
            return false;
        QueueSummary other = (QueueSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueueType() == null ^ this.getQueueType() == null)
            return false;
        if (other.getQueueType() != null
                && other.getQueueType().equals(this.getQueueType()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null
                && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }
}
