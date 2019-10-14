/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the channel type and other settings for an
 * endpoint.
 * </p>
 */
public class EndpointResponse implements Serializable {
    /**
     * <p>
     * The destination address for messages or push notifications that you send
     * to the endpoint. The address varies by channel. For example, the address
     * for a push-notification channel is typically the token provided by a push
     * notification service, such as an Apple Push Notification service (APNs)
     * device token or a Firebase Cloud Messaging (FCM) registration token. The
     * address for the SMS channel is a phone number in E.164 format, such as
     * +12065550100. The address for the email channel is an email address.
     * </p>
     */
    private String address;

    /**
     * <p>
     * The unique identifier for the application that's associated with the
     * endpoint.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["science", "music", "travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> attributes;

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to
     * the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     */
    private String channelType;

    /**
     * <p>
     * A number from 0-99 that represents the cohort that the endpoint is
     * assigned to. Endpoints are grouped into cohorts randomly, and each cohort
     * contains approximately 1 percent of the endpoints for an application.
     * Amazon Pinpoint assigns cohorts to the holdout or treatment allocations
     * for campaigns.
     * </p>
     */
    private String cohortId;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and
     * platform.
     * </p>
     */
    private EndpointDemographic demographic;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was last
     * updated.
     * </p>
     */
    private String effectiveDate;

    /**
     * <p>
     * Specifies whether messages or push notifications are sent to the
     * endpoint. Possible values are: ACTIVE, messages are sent to the endpoint;
     * and, INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create
     * an endpoint or update an existing endpoint. Amazon Pinpoint automatically
     * sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     */
    private String endpointStatus;

    /**
     * <p>
     * The unique identifier that you assigned to the endpoint. The identifier
     * should be a globally unique identifier (GUID) to ensure that it doesn't
     * conflict with other endpoint identifiers that are associated with the
     * application.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     */
    private EndpointLocation location;

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     */
    private java.util.Map<String, Double> metrics;

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted
     * out of receiving messages and push notifications from you. Possible
     * values are: ALL, the user has opted out and doesn't want to receive any
     * messages or push notifications; and, NONE, the user hasn't opted out and
     * wants to receive all messages and push notifications.
     * </p>
     */
    private String optOut;

    /**
     * <p>
     * The unique identifier for the most recent request to update the endpoint.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * One or more custom user attributes that your app reports to Amazon
     * Pinpoint for the user who's associated with the endpoint.
     * </p>
     */
    private EndpointUser user;

    /**
     * <p>
     * The destination address for messages or push notifications that you send
     * to the endpoint. The address varies by channel. For example, the address
     * for a push-notification channel is typically the token provided by a push
     * notification service, such as an Apple Push Notification service (APNs)
     * device token or a Firebase Cloud Messaging (FCM) registration token. The
     * address for the SMS channel is a phone number in E.164 format, such as
     * +12065550100. The address for the email channel is an email address.
     * </p>
     *
     * @return <p>
     *         The destination address for messages or push notifications that
     *         you send to the endpoint. The address varies by channel. For
     *         example, the address for a push-notification channel is typically
     *         the token provided by a push notification service, such as an
     *         Apple Push Notification service (APNs) device token or a Firebase
     *         Cloud Messaging (FCM) registration token. The address for the SMS
     *         channel is a phone number in E.164 format, such as +12065550100.
     *         The address for the email channel is an email address.
     *         </p>
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>
     * The destination address for messages or push notifications that you send
     * to the endpoint. The address varies by channel. For example, the address
     * for a push-notification channel is typically the token provided by a push
     * notification service, such as an Apple Push Notification service (APNs)
     * device token or a Firebase Cloud Messaging (FCM) registration token. The
     * address for the SMS channel is a phone number in E.164 format, such as
     * +12065550100. The address for the email channel is an email address.
     * </p>
     *
     * @param address <p>
     *            The destination address for messages or push notifications
     *            that you send to the endpoint. The address varies by channel.
     *            For example, the address for a push-notification channel is
     *            typically the token provided by a push notification service,
     *            such as an Apple Push Notification service (APNs) device token
     *            or a Firebase Cloud Messaging (FCM) registration token. The
     *            address for the SMS channel is a phone number in E.164 format,
     *            such as +12065550100. The address for the email channel is an
     *            email address.
     *            </p>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The destination address for messages or push notifications that you send
     * to the endpoint. The address varies by channel. For example, the address
     * for a push-notification channel is typically the token provided by a push
     * notification service, such as an Apple Push Notification service (APNs)
     * device token or a Firebase Cloud Messaging (FCM) registration token. The
     * address for the SMS channel is a phone number in E.164 format, such as
     * +12065550100. The address for the email channel is an email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param address <p>
     *            The destination address for messages or push notifications
     *            that you send to the endpoint. The address varies by channel.
     *            For example, the address for a push-notification channel is
     *            typically the token provided by a push notification service,
     *            such as an Apple Push Notification service (APNs) device token
     *            or a Firebase Cloud Messaging (FCM) registration token. The
     *            address for the SMS channel is a phone number in E.164 format,
     *            such as +12065550100. The address for the email channel is an
     *            email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that's associated with
     *         the endpoint.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the
     * endpoint.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that's associated
     *            with the endpoint.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that's associated
     *            with the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["science", "music", "travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * </p>
     *
     * @return <p>
     *         One or more custom attributes that describe the endpoint by
     *         associating a name with an array of values. For example, the
     *         value of a custom attribute named Interests might be: ["science",
     *         "music", "travel"]. You can use these attributes as filter
     *         criteria when you create segments.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["science", "music", "travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * </p>
     *
     * @param attributes <p>
     *            One or more custom attributes that describe the endpoint by
     *            associating a name with an array of values. For example, the
     *            value of a custom attribute named Interests might be:
     *            ["science", "music", "travel"]. You can use these attributes
     *            as filter criteria when you create segments.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["science", "music", "travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            One or more custom attributes that describe the endpoint by
     *            associating a name with an array of values. For example, the
     *            value of a custom attribute named Interests might be:
     *            ["science", "music", "travel"]. You can use these attributes
     *            as filter criteria when you create segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["science", "music", "travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse addAttributesEntry(String key, java.util.List<String> value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EndpointResponse clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to
     * the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @return <p>
     *         The channel that's used when sending messages or push
     *         notifications to the endpoint.
     *         </p>
     * @see ChannelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to
     * the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel that's used when sending messages or push
     *            notifications to the endpoint.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to
     * the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel that's used when sending messages or push
     *            notifications to the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public EndpointResponse withChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to
     * the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel that's used when sending messages or push
     *            notifications to the endpoint.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to
     * the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel that's used when sending messages or push
     *            notifications to the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public EndpointResponse withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * A number from 0-99 that represents the cohort that the endpoint is
     * assigned to. Endpoints are grouped into cohorts randomly, and each cohort
     * contains approximately 1 percent of the endpoints for an application.
     * Amazon Pinpoint assigns cohorts to the holdout or treatment allocations
     * for campaigns.
     * </p>
     *
     * @return <p>
     *         A number from 0-99 that represents the cohort that the endpoint
     *         is assigned to. Endpoints are grouped into cohorts randomly, and
     *         each cohort contains approximately 1 percent of the endpoints for
     *         an application. Amazon Pinpoint assigns cohorts to the holdout or
     *         treatment allocations for campaigns.
     *         </p>
     */
    public String getCohortId() {
        return cohortId;
    }

    /**
     * <p>
     * A number from 0-99 that represents the cohort that the endpoint is
     * assigned to. Endpoints are grouped into cohorts randomly, and each cohort
     * contains approximately 1 percent of the endpoints for an application.
     * Amazon Pinpoint assigns cohorts to the holdout or treatment allocations
     * for campaigns.
     * </p>
     *
     * @param cohortId <p>
     *            A number from 0-99 that represents the cohort that the
     *            endpoint is assigned to. Endpoints are grouped into cohorts
     *            randomly, and each cohort contains approximately 1 percent of
     *            the endpoints for an application. Amazon Pinpoint assigns
     *            cohorts to the holdout or treatment allocations for campaigns.
     *            </p>
     */
    public void setCohortId(String cohortId) {
        this.cohortId = cohortId;
    }

    /**
     * <p>
     * A number from 0-99 that represents the cohort that the endpoint is
     * assigned to. Endpoints are grouped into cohorts randomly, and each cohort
     * contains approximately 1 percent of the endpoints for an application.
     * Amazon Pinpoint assigns cohorts to the holdout or treatment allocations
     * for campaigns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cohortId <p>
     *            A number from 0-99 that represents the cohort that the
     *            endpoint is assigned to. Endpoints are grouped into cohorts
     *            randomly, and each cohort contains approximately 1 percent of
     *            the endpoints for an application. Amazon Pinpoint assigns
     *            cohorts to the holdout or treatment allocations for campaigns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withCohortId(String cohortId) {
        this.cohortId = cohortId;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when the endpoint was
     *         created.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time, in ISO 8601 format, when the endpoint was
     *            created.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time, in ISO 8601 format, when the endpoint was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and
     * platform.
     * </p>
     *
     * @return <p>
     *         The demographic information for the endpoint, such as the time
     *         zone and platform.
     *         </p>
     */
    public EndpointDemographic getDemographic() {
        return demographic;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and
     * platform.
     * </p>
     *
     * @param demographic <p>
     *            The demographic information for the endpoint, such as the time
     *            zone and platform.
     *            </p>
     */
    public void setDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and
     * platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param demographic <p>
     *            The demographic information for the endpoint, such as the time
     *            zone and platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was last
     * updated.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when the endpoint was last
     *         updated.
     *         </p>
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was last
     * updated.
     * </p>
     *
     * @param effectiveDate <p>
     *            The date and time, in ISO 8601 format, when the endpoint was
     *            last updated.
     *            </p>
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was last
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectiveDate <p>
     *            The date and time, in ISO 8601 format, when the endpoint was
     *            last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether messages or push notifications are sent to the
     * endpoint. Possible values are: ACTIVE, messages are sent to the endpoint;
     * and, INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create
     * an endpoint or update an existing endpoint. Amazon Pinpoint automatically
     * sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     *
     * @return <p>
     *         Specifies whether messages or push notifications are sent to the
     *         endpoint. Possible values are: ACTIVE, messages are sent to the
     *         endpoint; and, INACTIVE, messages aren’t sent to the endpoint.
     *         </p>
     *         <p>
     *         Amazon Pinpoint automatically sets this value to ACTIVE when you
     *         create an endpoint or update an existing endpoint. Amazon
     *         Pinpoint automatically sets this value to INACTIVE if you update
     *         another endpoint that has the same address specified by the
     *         Address property.
     *         </p>
     */
    public String getEndpointStatus() {
        return endpointStatus;
    }

    /**
     * <p>
     * Specifies whether messages or push notifications are sent to the
     * endpoint. Possible values are: ACTIVE, messages are sent to the endpoint;
     * and, INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create
     * an endpoint or update an existing endpoint. Amazon Pinpoint automatically
     * sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     *
     * @param endpointStatus <p>
     *            Specifies whether messages or push notifications are sent to
     *            the endpoint. Possible values are: ACTIVE, messages are sent
     *            to the endpoint; and, INACTIVE, messages aren’t sent to the
     *            endpoint.
     *            </p>
     *            <p>
     *            Amazon Pinpoint automatically sets this value to ACTIVE when
     *            you create an endpoint or update an existing endpoint. Amazon
     *            Pinpoint automatically sets this value to INACTIVE if you
     *            update another endpoint that has the same address specified by
     *            the Address property.
     *            </p>
     */
    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * Specifies whether messages or push notifications are sent to the
     * endpoint. Possible values are: ACTIVE, messages are sent to the endpoint;
     * and, INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create
     * an endpoint or update an existing endpoint. Amazon Pinpoint automatically
     * sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointStatus <p>
     *            Specifies whether messages or push notifications are sent to
     *            the endpoint. Possible values are: ACTIVE, messages are sent
     *            to the endpoint; and, INACTIVE, messages aren’t sent to the
     *            endpoint.
     *            </p>
     *            <p>
     *            Amazon Pinpoint automatically sets this value to ACTIVE when
     *            you create an endpoint or update an existing endpoint. Amazon
     *            Pinpoint automatically sets this value to INACTIVE if you
     *            update another endpoint that has the same address specified by
     *            the Address property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }

    /**
     * <p>
     * The unique identifier that you assigned to the endpoint. The identifier
     * should be a globally unique identifier (GUID) to ensure that it doesn't
     * conflict with other endpoint identifiers that are associated with the
     * application.
     * </p>
     *
     * @return <p>
     *         The unique identifier that you assigned to the endpoint. The
     *         identifier should be a globally unique identifier (GUID) to
     *         ensure that it doesn't conflict with other endpoint identifiers
     *         that are associated with the application.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier that you assigned to the endpoint. The identifier
     * should be a globally unique identifier (GUID) to ensure that it doesn't
     * conflict with other endpoint identifiers that are associated with the
     * application.
     * </p>
     *
     * @param id <p>
     *            The unique identifier that you assigned to the endpoint. The
     *            identifier should be a globally unique identifier (GUID) to
     *            ensure that it doesn't conflict with other endpoint
     *            identifiers that are associated with the application.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier that you assigned to the endpoint. The identifier
     * should be a globally unique identifier (GUID) to ensure that it doesn't
     * conflict with other endpoint identifiers that are associated with the
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier that you assigned to the endpoint. The
     *            identifier should be a globally unique identifier (GUID) to
     *            ensure that it doesn't conflict with other endpoint
     *            identifiers that are associated with the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     *
     * @return <p>
     *         The geographic information for the endpoint.
     *         </p>
     */
    public EndpointLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     *
     * @param location <p>
     *            The geographic information for the endpoint.
     *            </p>
     */
    public void setLocation(EndpointLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The geographic information for the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withLocation(EndpointLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     *
     * @return <p>
     *         One or more custom metrics that your app reports to Amazon
     *         Pinpoint for the endpoint.
     *         </p>
     */
    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     *
     * @param metrics <p>
     *            One or more custom metrics that your app reports to Amazon
     *            Pinpoint for the endpoint.
     *            </p>
     */
    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            One or more custom metrics that your app reports to Amazon
     *            Pinpoint for the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into
     *            Metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse addMetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EndpointResponse clearMetricsEntries() {
        this.metrics = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted
     * out of receiving messages and push notifications from you. Possible
     * values are: ALL, the user has opted out and doesn't want to receive any
     * messages or push notifications; and, NONE, the user hasn't opted out and
     * wants to receive all messages and push notifications.
     * </p>
     *
     * @return <p>
     *         Specifies whether the user who's associated with the endpoint has
     *         opted out of receiving messages and push notifications from you.
     *         Possible values are: ALL, the user has opted out and doesn't want
     *         to receive any messages or push notifications; and, NONE, the
     *         user hasn't opted out and wants to receive all messages and push
     *         notifications.
     *         </p>
     */
    public String getOptOut() {
        return optOut;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted
     * out of receiving messages and push notifications from you. Possible
     * values are: ALL, the user has opted out and doesn't want to receive any
     * messages or push notifications; and, NONE, the user hasn't opted out and
     * wants to receive all messages and push notifications.
     * </p>
     *
     * @param optOut <p>
     *            Specifies whether the user who's associated with the endpoint
     *            has opted out of receiving messages and push notifications
     *            from you. Possible values are: ALL, the user has opted out and
     *            doesn't want to receive any messages or push notifications;
     *            and, NONE, the user hasn't opted out and wants to receive all
     *            messages and push notifications.
     *            </p>
     */
    public void setOptOut(String optOut) {
        this.optOut = optOut;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted
     * out of receiving messages and push notifications from you. Possible
     * values are: ALL, the user has opted out and doesn't want to receive any
     * messages or push notifications; and, NONE, the user hasn't opted out and
     * wants to receive all messages and push notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optOut <p>
     *            Specifies whether the user who's associated with the endpoint
     *            has opted out of receiving messages and push notifications
     *            from you. Possible values are: ALL, the user has opted out and
     *            doesn't want to receive any messages or push notifications;
     *            and, NONE, the user hasn't opted out and wants to receive all
     *            messages and push notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withOptOut(String optOut) {
        this.optOut = optOut;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the most recent request to update the endpoint.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the most recent request to update the
     *         endpoint.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The unique identifier for the most recent request to update the endpoint.
     * </p>
     *
     * @param requestId <p>
     *            The unique identifier for the most recent request to update
     *            the endpoint.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier for the most recent request to update the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            The unique identifier for the most recent request to update
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * One or more custom user attributes that your app reports to Amazon
     * Pinpoint for the user who's associated with the endpoint.
     * </p>
     *
     * @return <p>
     *         One or more custom user attributes that your app reports to
     *         Amazon Pinpoint for the user who's associated with the endpoint.
     *         </p>
     */
    public EndpointUser getUser() {
        return user;
    }

    /**
     * <p>
     * One or more custom user attributes that your app reports to Amazon
     * Pinpoint for the user who's associated with the endpoint.
     * </p>
     *
     * @param user <p>
     *            One or more custom user attributes that your app reports to
     *            Amazon Pinpoint for the user who's associated with the
     *            endpoint.
     *            </p>
     */
    public void setUser(EndpointUser user) {
        this.user = user;
    }

    /**
     * <p>
     * One or more custom user attributes that your app reports to Amazon
     * Pinpoint for the user who's associated with the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            One or more custom user attributes that your app reports to
     *            Amazon Pinpoint for the user who's associated with the
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointResponse withUser(EndpointUser user) {
        this.user = user;
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
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getChannelType() != null)
            sb.append("ChannelType: " + getChannelType() + ",");
        if (getCohortId() != null)
            sb.append("CohortId: " + getCohortId() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDemographic() != null)
            sb.append("Demographic: " + getDemographic() + ",");
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: " + getEffectiveDate() + ",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: " + getEndpointStatus() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
        if (getOptOut() != null)
            sb.append("OptOut: " + getOptOut() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getUser() != null)
            sb.append("User: " + getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode + ((getCohortId() == null) ? 0 : getCohortId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getDemographic() == null) ? 0 : getDemographic().hashCode());
        hashCode = prime * hashCode
                + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getOptOut() == null) ? 0 : getOptOut().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointResponse == false)
            return false;
        EndpointResponse other = (EndpointResponse) obj;

        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null
                && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getCohortId() == null ^ this.getCohortId() == null)
            return false;
        if (other.getCohortId() != null && other.getCohortId().equals(this.getCohortId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDemographic() == null ^ this.getDemographic() == null)
            return false;
        if (other.getDemographic() != null
                && other.getDemographic().equals(this.getDemographic()) == false)
            return false;
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null
                && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null
                && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getOptOut() == null ^ this.getOptOut() == null)
            return false;
        if (other.getOptOut() != null && other.getOptOut().equals(this.getOptOut()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }
}
