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
 * The values used to filter results from the
 * <a>DescribeEventDetailsForOrganization</a> and
 * <a>DescribeAffectedEntitiesForOrganization</a> operations.
 * </p>
 */
public class EventAccountFilter implements Serializable {
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
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\S+$<br/>
     */
    private String awsAccountId;

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
    public EventAccountFilter withEventArn(String eventArn) {
        this.eventArn = eventArn;
        return this;
    }

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @return <p>
     *         The 12-digit AWS account numbers that contains the affected
     *         entities.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 12<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param awsAccountId <p>
     *            The 12-digit AWS account numbers that contains the affected
     *            entities.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
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
     *            The 12-digit AWS account numbers that contains the affected
     *            entities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventAccountFilter withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
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
        if (getEventArn() != null)
            sb.append("eventArn: " + getEventArn() + ",");
        if (getAwsAccountId() != null)
            sb.append("awsAccountId: " + getAwsAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventAccountFilter == false)
            return false;
        EventAccountFilter other = (EventAccountFilter) obj;

        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        return true;
    }
}
