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

package com.amazonaws.services.health.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an entity that is affected by a Health event.
 * </p>
 */
public class AffectedEntity implements Serializable {
    /**
     * <p>
     * The unique identifier for the entity. Format:
     * <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>
     * . Example:
     * <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     * <b>Pattern: </b>.{0,1600}<br/>
     */
    private String entityArn;

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     * <b>Pattern:
     * </b>arn:aws(-[a-z]+(-[a-z]+)?)?:health:[^:]*:[^:]*:event(?:/[\w-]+){3}
     * <br/>
     */
    private String eventArn;

    /**
     * <p>
     * The ID of the affected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1224<br/>
     * <b>Pattern: </b>.{0,1224}<br/>
     */
    private String entityValue;

    /**
     * <p>
     * The URL of the affected entity.
     * </p>
     */
    private String entityUrl;

    /**
     * <p>
     * The 12-digit AWS account number that contains the affected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\S+$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The most recent time that the entity was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible
     * values are <code>IMPAIRED</code>, <code>UNIMPAIRED</code>, and
     * <code>UNKNOWN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPAIRED, UNIMPAIRED, UNKNOWN
     */
    private String statusCode;

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique identifier for the entity. Format:
     * <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>
     * . Example:
     * <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     * <b>Pattern: </b>.{0,1600}<br/>
     *
     * @return <p>
     *         The unique identifier for the entity. Format:
     *         <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>
     *         . Example:
     *         <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     *         </p>
     */
    public String getEntityArn() {
        return entityArn;
    }

    /**
     * <p>
     * The unique identifier for the entity. Format:
     * <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>
     * . Example:
     * <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     * <b>Pattern: </b>.{0,1600}<br/>
     *
     * @param entityArn <p>
     *            The unique identifier for the entity. Format:
     *            <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>
     *            . Example:
     *            <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     *            </p>
     */
    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The unique identifier for the entity. Format:
     * <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>
     * . Example:
     * <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     * <b>Pattern: </b>.{0,1600}<br/>
     *
     * @param entityArn <p>
     *            The unique identifier for the entity. Format:
     *            <code>arn:aws:health:<i>entity-region</i>:<i>aws-account</i>:entity/<i>entity-id</i> </code>
     *            . Example:
     *            <code>arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AffectedEntity withEntityArn(String entityArn) {
        this.entityArn = entityArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     * <b>Pattern:
     * </b>arn:aws(-[a-z]+(-[a-z]+)?)?:health:[^:]*:[^:]*:event(?:/[\w-]+){3}
     * <br/>
     *
     * @return <p>
     *         The unique identifier for the event. Format:
     *         <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *         . Example:
     *         <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     *         </p>
     */
    public String getEventArn() {
        return eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     * <b>Pattern:
     * </b>arn:aws(-[a-z]+(-[a-z]+)?)?:health:[^:]*:[^:]*:event(?:/[\w-]+){3}
     * <br/>
     *
     * @param eventArn <p>
     *            The unique identifier for the event. Format:
     *            <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *            . Example:
     *            <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     *            </p>
     */
    public void setEventArn(String eventArn) {
        this.eventArn = eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     * <b>Pattern:
     * </b>arn:aws(-[a-z]+(-[a-z]+)?)?:health:[^:]*:[^:]*:event(?:/[\w-]+){3}
     * <br/>
     *
     * @param eventArn <p>
     *            The unique identifier for the event. Format:
     *            <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *            . Example:
     *            <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AffectedEntity withEventArn(String eventArn) {
        this.eventArn = eventArn;
        return this;
    }

    /**
     * <p>
     * The ID of the affected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1224<br/>
     * <b>Pattern: </b>.{0,1224}<br/>
     *
     * @return <p>
     *         The ID of the affected entity.
     *         </p>
     */
    public String getEntityValue() {
        return entityValue;
    }

    /**
     * <p>
     * The ID of the affected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1224<br/>
     * <b>Pattern: </b>.{0,1224}<br/>
     *
     * @param entityValue <p>
     *            The ID of the affected entity.
     *            </p>
     */
    public void setEntityValue(String entityValue) {
        this.entityValue = entityValue;
    }

    /**
     * <p>
     * The ID of the affected entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1224<br/>
     * <b>Pattern: </b>.{0,1224}<br/>
     *
     * @param entityValue <p>
     *            The ID of the affected entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AffectedEntity withEntityValue(String entityValue) {
        this.entityValue = entityValue;
        return this;
    }

    /**
     * <p>
     * The URL of the affected entity.
     * </p>
     *
     * @return <p>
     *         The URL of the affected entity.
     *         </p>
     */
    public String getEntityUrl() {
        return entityUrl;
    }

    /**
     * <p>
     * The URL of the affected entity.
     * </p>
     *
     * @param entityUrl <p>
     *            The URL of the affected entity.
     *            </p>
     */
    public void setEntityUrl(String entityUrl) {
        this.entityUrl = entityUrl;
    }

    /**
     * <p>
     * The URL of the affected entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityUrl <p>
     *            The URL of the affected entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AffectedEntity withEntityUrl(String entityUrl) {
        this.entityUrl = entityUrl;
        return this;
    }

    /**
     * <p>
     * The 12-digit AWS account number that contains the affected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @return <p>
     *         The 12-digit AWS account number that contains the affected
     *         entity.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account number that contains the affected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param awsAccountId <p>
     *            The 12-digit AWS account number that contains the affected
     *            entity.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account number that contains the affected entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param awsAccountId <p>
     *            The 12-digit AWS account number that contains the affected
     *            entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AffectedEntity withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The most recent time that the entity was updated.
     * </p>
     *
     * @return <p>
     *         The most recent time that the entity was updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The most recent time that the entity was updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The most recent time that the entity was updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The most recent time that the entity was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The most recent time that the entity was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AffectedEntity withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible
     * values are <code>IMPAIRED</code>, <code>UNIMPAIRED</code>, and
     * <code>UNKNOWN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPAIRED, UNIMPAIRED, UNKNOWN
     *
     * @return <p>
     *         The most recent status of the entity affected by the event. The
     *         possible values are <code>IMPAIRED</code>,
     *         <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     *         </p>
     * @see EntityStatusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible
     * values are <code>IMPAIRED</code>, <code>UNIMPAIRED</code>, and
     * <code>UNKNOWN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPAIRED, UNIMPAIRED, UNKNOWN
     *
     * @param statusCode <p>
     *            The most recent status of the entity affected by the event.
     *            The possible values are <code>IMPAIRED</code>,
     *            <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     *            </p>
     * @see EntityStatusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible
     * values are <code>IMPAIRED</code>, <code>UNIMPAIRED</code>, and
     * <code>UNKNOWN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPAIRED, UNIMPAIRED, UNKNOWN
     *
     * @param statusCode <p>
     *            The most recent status of the entity affected by the event.
     *            The possible values are <code>IMPAIRED</code>,
     *            <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityStatusCode
     */
    public AffectedEntity withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible
     * values are <code>IMPAIRED</code>, <code>UNIMPAIRED</code>, and
     * <code>UNKNOWN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPAIRED, UNIMPAIRED, UNKNOWN
     *
     * @param statusCode <p>
     *            The most recent status of the entity affected by the event.
     *            The possible values are <code>IMPAIRED</code>,
     *            <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     *            </p>
     * @see EntityStatusCode
     */
    public void setStatusCode(EntityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }

    /**
     * <p>
     * The most recent status of the entity affected by the event. The possible
     * values are <code>IMPAIRED</code>, <code>UNIMPAIRED</code>, and
     * <code>UNKNOWN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPAIRED, UNIMPAIRED, UNKNOWN
     *
     * @param statusCode <p>
     *            The most recent status of the entity affected by the event.
     *            The possible values are <code>IMPAIRED</code>,
     *            <code>UNIMPAIRED</code>, and <code>UNKNOWN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityStatusCode
     */
    public AffectedEntity withStatusCode(EntityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     *
     * @return <p>
     *         A map of entity tags attached to the affected entity.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     *
     * @param tags <p>
     *            A map of entity tags attached to the affected entity.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of entity tags attached to the affected entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AffectedEntity withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AffectedEntity addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AffectedEntity cleartagsEntries() {
        this.tags = null;
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
        if (getEntityArn() != null)
            sb.append("entityArn: " + getEntityArn() + ",");
        if (getEventArn() != null)
            sb.append("eventArn: " + getEventArn() + ",");
        if (getEntityValue() != null)
            sb.append("entityValue: " + getEntityValue() + ",");
        if (getEntityUrl() != null)
            sb.append("entityUrl: " + getEntityUrl() + ",");
        if (getAwsAccountId() != null)
            sb.append("awsAccountId: " + getAwsAccountId() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getStatusCode() != null)
            sb.append("statusCode: " + getStatusCode() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode
                + ((getEntityValue() == null) ? 0 : getEntityValue().hashCode());
        hashCode = prime * hashCode + ((getEntityUrl() == null) ? 0 : getEntityUrl().hashCode());
        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AffectedEntity == false)
            return false;
        AffectedEntity other = (AffectedEntity) obj;

        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null
                && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getEntityValue() == null ^ this.getEntityValue() == null)
            return false;
        if (other.getEntityValue() != null
                && other.getEntityValue().equals(this.getEntityValue()) == false)
            return false;
        if (other.getEntityUrl() == null ^ this.getEntityUrl() == null)
            return false;
        if (other.getEntityUrl() != null
                && other.getEntityUrl().equals(this.getEntityUrl()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
