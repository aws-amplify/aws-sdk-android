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
 * Specifies the settings for events that cause a campaign to be sent.
 * </p>
 */
public class CampaignEventFilter implements Serializable {
    /**
     * <p>
     * The dimension settings of the event filter for the campaign.
     * </p>
     */
    private EventDimensions dimensions;

    /**
     * <p>
     * The type of event that causes the campaign to be sent. Valid values are:
     * SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT,
     * sends the campaign when an endpoint event (<link
     * linkend="apps-application-id-events">Events</link> resource) occurs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, ENDPOINT
     */
    private String filterType;

    /**
     * <p>
     * The dimension settings of the event filter for the campaign.
     * </p>
     *
     * @return <p>
     *         The dimension settings of the event filter for the campaign.
     *         </p>
     */
    public EventDimensions getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimension settings of the event filter for the campaign.
     * </p>
     *
     * @param dimensions <p>
     *            The dimension settings of the event filter for the campaign.
     *            </p>
     */
    public void setDimensions(EventDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimension settings of the event filter for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The dimension settings of the event filter for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignEventFilter withDimensions(EventDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent. Valid values are:
     * SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT,
     * sends the campaign when an endpoint event (<link
     * linkend="apps-application-id-events">Events</link> resource) occurs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, ENDPOINT
     *
     * @return <p>
     *         The type of event that causes the campaign to be sent. Valid
     *         values are: SYSTEM, sends the campaign when a system event
     *         occurs; and, ENDPOINT, sends the campaign when an endpoint event
     *         (<link linkend="apps-application-id-events">Events</link>
     *         resource) occurs.
     *         </p>
     * @see FilterType
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent. Valid values are:
     * SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT,
     * sends the campaign when an endpoint event (<link
     * linkend="apps-application-id-events">Events</link> resource) occurs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, ENDPOINT
     *
     * @param filterType <p>
     *            The type of event that causes the campaign to be sent. Valid
     *            values are: SYSTEM, sends the campaign when a system event
     *            occurs; and, ENDPOINT, sends the campaign when an endpoint
     *            event (<link
     *            linkend="apps-application-id-events">Events</link> resource)
     *            occurs.
     *            </p>
     * @see FilterType
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent. Valid values are:
     * SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT,
     * sends the campaign when an endpoint event (<link
     * linkend="apps-application-id-events">Events</link> resource) occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, ENDPOINT
     *
     * @param filterType <p>
     *            The type of event that causes the campaign to be sent. Valid
     *            values are: SYSTEM, sends the campaign when a system event
     *            occurs; and, ENDPOINT, sends the campaign when an endpoint
     *            event (<link
     *            linkend="apps-application-id-events">Events</link> resource)
     *            occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterType
     */
    public CampaignEventFilter withFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent. Valid values are:
     * SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT,
     * sends the campaign when an endpoint event (<link
     * linkend="apps-application-id-events">Events</link> resource) occurs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, ENDPOINT
     *
     * @param filterType <p>
     *            The type of event that causes the campaign to be sent. Valid
     *            values are: SYSTEM, sends the campaign when a system event
     *            occurs; and, ENDPOINT, sends the campaign when an endpoint
     *            event (<link
     *            linkend="apps-application-id-events">Events</link> resource)
     *            occurs.
     *            </p>
     * @see FilterType
     */
    public void setFilterType(FilterType filterType) {
        this.filterType = filterType.toString();
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent. Valid values are:
     * SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT,
     * sends the campaign when an endpoint event (<link
     * linkend="apps-application-id-events">Events</link> resource) occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYSTEM, ENDPOINT
     *
     * @param filterType <p>
     *            The type of event that causes the campaign to be sent. Valid
     *            values are: SYSTEM, sends the campaign when a system event
     *            occurs; and, ENDPOINT, sends the campaign when an endpoint
     *            event (<link
     *            linkend="apps-application-id-events">Events</link> resource)
     *            occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterType
     */
    public CampaignEventFilter withFilterType(FilterType filterType) {
        this.filterType = filterType.toString();
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
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getFilterType() != null)
            sb.append("FilterType: " + getFilterType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getFilterType() == null) ? 0 : getFilterType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignEventFilter == false)
            return false;
        CampaignEventFilter other = (CampaignEventFilter) obj;

        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getFilterType() == null ^ this.getFilterType() == null)
            return false;
        if (other.getFilterType() != null
                && other.getFilterType().equals(this.getFilterType()) == false)
            return false;
        return true;
    }
}
