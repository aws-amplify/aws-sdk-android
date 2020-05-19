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
 * Metadata about a type of event that is reported by AWS Health. Data consists
 * of the category (for example, <code>issue</code>), the service (for example,
 * <code>EC2</code>), and the event type code (for example,
 * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
 * </p>
 */
public class EventType implements Serializable {
    /**
     * <p>
     * The AWS service that is affected by the event. For example,
     * <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 30<br/>
     * <b>Pattern: </b>[^:/]{2,30}<br/>
     */
    private String service;

    /**
     * <p>
     * The unique identifier for the event type. The format is
     * <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-]{3,100}<br/>
     */
    private String code;

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     */
    private String category;

    /**
     * <p>
     * The AWS service that is affected by the event. For example,
     * <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 30<br/>
     * <b>Pattern: </b>[^:/]{2,30}<br/>
     *
     * @return <p>
     *         The AWS service that is affected by the event. For example,
     *         <code>EC2</code>, <code>RDS</code>.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example,
     * <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 30<br/>
     * <b>Pattern: </b>[^:/]{2,30}<br/>
     *
     * @param service <p>
     *            The AWS service that is affected by the event. For example,
     *            <code>EC2</code>, <code>RDS</code>.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example,
     * <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 30<br/>
     * <b>Pattern: </b>[^:/]{2,30}<br/>
     *
     * @param service <p>
     *            The AWS service that is affected by the event. For example,
     *            <code>EC2</code>, <code>RDS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventType withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is
     * <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-]{3,100}<br/>
     *
     * @return <p>
     *         The unique identifier for the event type. The format is
     *         <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for example,
     *         <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is
     * <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-]{3,100}<br/>
     *
     * @param code <p>
     *            The unique identifier for the event type. The format is
     *            <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     *            example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is
     * <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-]{3,100}<br/>
     *
     * @param code <p>
     *            The unique identifier for the event type. The format is
     *            <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     *            example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventType withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     *
     * @return <p>
     *         A list of event type category codes (<code>issue</code>,
     *         <code>scheduledChange</code>, or <code>accountNotification</code>
     *         ).
     *         </p>
     * @see EventTypeCategory
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     *
     * @param category <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     * @see EventTypeCategory
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     *
     * @param category <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventTypeCategory
     */
    public EventType withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     *
     * @param category <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     * @see EventTypeCategory
     */
    public void setCategory(EventTypeCategory category) {
        this.category = category.toString();
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     *
     * @param category <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventTypeCategory
     */
    public EventType withCategory(EventTypeCategory category) {
        this.category = category.toString();
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
        if (getService() != null)
            sb.append("service: " + getService() + ",");
        if (getCode() != null)
            sb.append("code: " + getCode() + ",");
        if (getCategory() != null)
            sb.append("category: " + getCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventType == false)
            return false;
        EventType other = (EventType) obj;

        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        return true;
    }
}
