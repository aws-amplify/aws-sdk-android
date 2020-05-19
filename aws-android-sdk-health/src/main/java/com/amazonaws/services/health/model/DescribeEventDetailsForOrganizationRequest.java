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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns detailed information about one or more specified events for one or
 * more accounts in your organization. Information includes standard event data
 * (Region, service, and so on, as returned by
 * <a>DescribeEventsForOrganization</a>, a detailed event description, and
 * possible additional metadata that depends upon the nature of the event.
 * Affected entities are not included; to retrieve those, use the
 * <a>DescribeAffectedEntitiesForOrganization</a> operation.
 * </p>
 * <p>
 * Before you can call this operation, you must first enable AWS Health to work
 * with AWS Organizations. To do this, call the
 * <a>EnableHealthServiceAccessForOrganization</a> operation from your
 * organization's master account.
 * </p>
 */
public class DescribeEventDetailsForOrganizationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and
     * the <code>eventArn</code>.
     * </p>
     */
    private java.util.List<EventAccountFilter> organizationEventDetailFilters;

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     */
    private String locale;

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and
     * the <code>eventArn</code>.
     * </p>
     *
     * @return <p>
     *         A set of JSON elements that includes the
     *         <code>awsAccountId</code> and the <code>eventArn</code>.
     *         </p>
     */
    public java.util.List<EventAccountFilter> getOrganizationEventDetailFilters() {
        return organizationEventDetailFilters;
    }

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and
     * the <code>eventArn</code>.
     * </p>
     *
     * @param organizationEventDetailFilters <p>
     *            A set of JSON elements that includes the
     *            <code>awsAccountId</code> and the <code>eventArn</code>.
     *            </p>
     */
    public void setOrganizationEventDetailFilters(
            java.util.Collection<EventAccountFilter> organizationEventDetailFilters) {
        if (organizationEventDetailFilters == null) {
            this.organizationEventDetailFilters = null;
            return;
        }

        this.organizationEventDetailFilters = new java.util.ArrayList<EventAccountFilter>(
                organizationEventDetailFilters);
    }

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and
     * the <code>eventArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationEventDetailFilters <p>
     *            A set of JSON elements that includes the
     *            <code>awsAccountId</code> and the <code>eventArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsForOrganizationRequest withOrganizationEventDetailFilters(
            EventAccountFilter... organizationEventDetailFilters) {
        if (getOrganizationEventDetailFilters() == null) {
            this.organizationEventDetailFilters = new java.util.ArrayList<EventAccountFilter>(
                    organizationEventDetailFilters.length);
        }
        for (EventAccountFilter value : organizationEventDetailFilters) {
            this.organizationEventDetailFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of JSON elements that includes the <code>awsAccountId</code> and
     * the <code>eventArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationEventDetailFilters <p>
     *            A set of JSON elements that includes the
     *            <code>awsAccountId</code> and the <code>eventArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsForOrganizationRequest withOrganizationEventDetailFilters(
            java.util.Collection<EventAccountFilter> organizationEventDetailFilters) {
        setOrganizationEventDetailFilters(organizationEventDetailFilters);
        return this;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @return <p>
     *         The locale (language) to return information in. English (en) is
     *         the default and the only supported value at this time.
     *         </p>
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @param locale <p>
     *            The locale (language) to return information in. English (en)
     *            is the default and the only supported value at this time.
     *            </p>
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @param locale <p>
     *            The locale (language) to return information in. English (en)
     *            is the default and the only supported value at this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsForOrganizationRequest withLocale(String locale) {
        this.locale = locale;
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
        if (getOrganizationEventDetailFilters() != null)
            sb.append("organizationEventDetailFilters: " + getOrganizationEventDetailFilters()
                    + ",");
        if (getLocale() != null)
            sb.append("locale: " + getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOrganizationEventDetailFilters() == null) ? 0
                        : getOrganizationEventDetailFilters().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventDetailsForOrganizationRequest == false)
            return false;
        DescribeEventDetailsForOrganizationRequest other = (DescribeEventDetailsForOrganizationRequest) obj;

        if (other.getOrganizationEventDetailFilters() == null
                ^ this.getOrganizationEventDetailFilters() == null)
            return false;
        if (other.getOrganizationEventDetailFilters() != null
                && other.getOrganizationEventDetailFilters().equals(
                        this.getOrganizationEventDetailFilters()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }
}
