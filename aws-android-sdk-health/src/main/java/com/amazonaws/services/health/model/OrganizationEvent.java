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
 * Summary information about an event, returned by the
 * <a>DescribeEventsForOrganization</a> operation.
 * </p>
 */
public class OrganizationEvent implements Serializable {
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
    private String arn;

    /**
     * <p>
     * The AWS service that is affected by the event. For example, EC2, RDS.
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
     * <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-]{3,100}<br/>
     */
    private String eventTypeCode;

    /**
     * <p>
     * The category of the event type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     */
    private String eventTypeCategory;

    /**
     * The new value for the eventScopeCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     */
    private String eventScopeCode;

    /**
     * <p>
     * The AWS Region name of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     * <b>Pattern: </b>[^:/]{2,25}<br/>
     */
    private String region;

    /**
     * <p>
     * The date and time that the event began.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The most recent date and time that the event was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The most recent status of the event. Possible values are
     * <code>open</code>, <code>closed</code>, and <code>upcoming</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed, upcoming
     */
    private String statusCode;

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
    public String getArn() {
        return arn;
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
     * @param arn <p>
     *            The unique identifier for the event. Format:
     *            <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *            . Example:
     *            <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
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
     * @param arn <p>
     *            The unique identifier for the event. Format:
     *            <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *            . Example:
     *            <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEvent withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example, EC2, RDS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 30<br/>
     * <b>Pattern: </b>[^:/]{2,30}<br/>
     *
     * @return <p>
     *         The AWS service that is affected by the event. For example, EC2,
     *         RDS.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example, EC2, RDS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 30<br/>
     * <b>Pattern: </b>[^:/]{2,30}<br/>
     *
     * @param service <p>
     *            The AWS service that is affected by the event. For example,
     *            EC2, RDS.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example, EC2, RDS.
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
     *            EC2, RDS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEvent withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is
     * <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-]{3,100}<br/>
     *
     * @return <p>
     *         The unique identifier for the event type. The format is
     *         <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     *         <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     *         </p>
     */
    public String getEventTypeCode() {
        return eventTypeCode;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is
     * <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-]{3,100}<br/>
     *
     * @param eventTypeCode <p>
     *            The unique identifier for the event type. The format is
     *            <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     *            <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     *            </p>
     */
    public void setEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is
     * <code>AWS_SERVICE_DESCRIPTION</code>. For example,
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
     * @param eventTypeCode <p>
     *            The unique identifier for the event type. The format is
     *            <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     *            <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEvent withEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
        return this;
    }

    /**
     * <p>
     * The category of the event type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     *
     * @return <p>
     *         The category of the event type.
     *         </p>
     * @see EventTypeCategory
     */
    public String getEventTypeCategory() {
        return eventTypeCategory;
    }

    /**
     * <p>
     * The category of the event type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     *
     * @param eventTypeCategory <p>
     *            The category of the event type.
     *            </p>
     * @see EventTypeCategory
     */
    public void setEventTypeCategory(String eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory;
    }

    /**
     * <p>
     * The category of the event type.
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
     * @param eventTypeCategory <p>
     *            The category of the event type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventTypeCategory
     */
    public OrganizationEvent withEventTypeCategory(String eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory;
        return this;
    }

    /**
     * <p>
     * The category of the event type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Allowed Values: </b>issue, accountNotification, scheduledChange,
     * investigation
     *
     * @param eventTypeCategory <p>
     *            The category of the event type.
     *            </p>
     * @see EventTypeCategory
     */
    public void setEventTypeCategory(EventTypeCategory eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory.toString();
    }

    /**
     * <p>
     * The category of the event type.
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
     * @param eventTypeCategory <p>
     *            The category of the event type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventTypeCategory
     */
    public OrganizationEvent withEventTypeCategory(EventTypeCategory eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory.toString();
        return this;
    }

    /**
     * Returns the value of the eventScopeCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @return The value of the eventScopeCode property for this object.
     * @see EventScopeCode
     */
    public String getEventScopeCode() {
        return eventScopeCode;
    }

    /**
     * Sets the value of eventScopeCode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @param eventScopeCode The new value for the eventScopeCode property for
     *            this object.
     * @see EventScopeCode
     */
    public void setEventScopeCode(String eventScopeCode) {
        this.eventScopeCode = eventScopeCode;
    }

    /**
     * Sets the value of the eventScopeCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @param eventScopeCode The new value for the eventScopeCode property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventScopeCode
     */
    public OrganizationEvent withEventScopeCode(String eventScopeCode) {
        this.eventScopeCode = eventScopeCode;
        return this;
    }

    /**
     * Sets the value of eventScopeCode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @param eventScopeCode The new value for the eventScopeCode property for
     *            this object.
     * @see EventScopeCode
     */
    public void setEventScopeCode(EventScopeCode eventScopeCode) {
        this.eventScopeCode = eventScopeCode.toString();
    }

    /**
     * Sets the value of the eventScopeCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @param eventScopeCode The new value for the eventScopeCode property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventScopeCode
     */
    public OrganizationEvent withEventScopeCode(EventScopeCode eventScopeCode) {
        this.eventScopeCode = eventScopeCode.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region name of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     * <b>Pattern: </b>[^:/]{2,25}<br/>
     *
     * @return <p>
     *         The AWS Region name of the event.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region name of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     * <b>Pattern: </b>[^:/]{2,25}<br/>
     *
     * @param region <p>
     *            The AWS Region name of the event.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region name of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     * <b>Pattern: </b>[^:/]{2,25}<br/>
     *
     * @param region <p>
     *            The AWS Region name of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEvent withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The date and time that the event began.
     * </p>
     *
     * @return <p>
     *         The date and time that the event began.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The date and time that the event began.
     * </p>
     *
     * @param startTime <p>
     *            The date and time that the event began.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that the event began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The date and time that the event began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEvent withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     *
     * @return <p>
     *         The date and time that the event ended.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     *
     * @param endTime <p>
     *            The date and time that the event ended.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The date and time that the event ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEvent withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The most recent date and time that the event was updated.
     * </p>
     *
     * @return <p>
     *         The most recent date and time that the event was updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The most recent date and time that the event was updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The most recent date and time that the event was updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The most recent date and time that the event was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The most recent date and time that the event was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationEvent withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are
     * <code>open</code>, <code>closed</code>, and <code>upcoming</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed, upcoming
     *
     * @return <p>
     *         The most recent status of the event. Possible values are
     *         <code>open</code>, <code>closed</code>, and <code>upcoming</code>
     *         .
     *         </p>
     * @see EventStatusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are
     * <code>open</code>, <code>closed</code>, and <code>upcoming</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed, upcoming
     *
     * @param statusCode <p>
     *            The most recent status of the event. Possible values are
     *            <code>open</code>, <code>closed</code>, and
     *            <code>upcoming</code>.
     *            </p>
     * @see EventStatusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are
     * <code>open</code>, <code>closed</code>, and <code>upcoming</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed, upcoming
     *
     * @param statusCode <p>
     *            The most recent status of the event. Possible values are
     *            <code>open</code>, <code>closed</code>, and
     *            <code>upcoming</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventStatusCode
     */
    public OrganizationEvent withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are
     * <code>open</code>, <code>closed</code>, and <code>upcoming</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed, upcoming
     *
     * @param statusCode <p>
     *            The most recent status of the event. Possible values are
     *            <code>open</code>, <code>closed</code>, and
     *            <code>upcoming</code>.
     *            </p>
     * @see EventStatusCode
     */
    public void setStatusCode(EventStatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are
     * <code>open</code>, <code>closed</code>, and <code>upcoming</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed, upcoming
     *
     * @param statusCode <p>
     *            The most recent status of the event. Possible values are
     *            <code>open</code>, <code>closed</code>, and
     *            <code>upcoming</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventStatusCode
     */
    public OrganizationEvent withStatusCode(EventStatusCode statusCode) {
        this.statusCode = statusCode.toString();
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getService() != null)
            sb.append("service: " + getService() + ",");
        if (getEventTypeCode() != null)
            sb.append("eventTypeCode: " + getEventTypeCode() + ",");
        if (getEventTypeCategory() != null)
            sb.append("eventTypeCategory: " + getEventTypeCategory() + ",");
        if (getEventScopeCode() != null)
            sb.append("eventScopeCode: " + getEventScopeCode() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getStatusCode() != null)
            sb.append("statusCode: " + getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode
                + ((getEventTypeCode() == null) ? 0 : getEventTypeCode().hashCode());
        hashCode = prime * hashCode
                + ((getEventTypeCategory() == null) ? 0 : getEventTypeCategory().hashCode());
        hashCode = prime * hashCode
                + ((getEventScopeCode() == null) ? 0 : getEventScopeCode().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationEvent == false)
            return false;
        OrganizationEvent other = (OrganizationEvent) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getEventTypeCode() == null ^ this.getEventTypeCode() == null)
            return false;
        if (other.getEventTypeCode() != null
                && other.getEventTypeCode().equals(this.getEventTypeCode()) == false)
            return false;
        if (other.getEventTypeCategory() == null ^ this.getEventTypeCategory() == null)
            return false;
        if (other.getEventTypeCategory() != null
                && other.getEventTypeCategory().equals(this.getEventTypeCategory()) == false)
            return false;
        if (other.getEventScopeCode() == null ^ this.getEventScopeCode() == null)
            return false;
        if (other.getEventScopeCode() != null
                && other.getEventScopeCode().equals(this.getEventScopeCode()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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
        return true;
    }
}
