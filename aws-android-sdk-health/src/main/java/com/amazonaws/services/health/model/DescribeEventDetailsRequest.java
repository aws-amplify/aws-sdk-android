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
 * Returns detailed information about one or more specified events. Information
 * includes standard event data (region, service, and so on, as returned by
 * <a>DescribeEvents</a>), a detailed event description, and possible additional
 * metadata that depends upon the nature of the event. Affected entities are not
 * included; to retrieve those, use the <a>DescribeAffectedEntities</a>
 * operation.
 * </p>
 * <p>
 * If a specified event cannot be retrieved, an error message is returned for
 * that event.
 * </p>
 */
public class DescribeEventDetailsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     */
    private java.util.List<String> eventArns;

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
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     *
     * @return <p>
     *         A list of event ARNs (unique identifiers). For example:
     *         <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     *         </p>
     */
    public java.util.List<String> getEventArns() {
        return eventArns;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     *
     * @param eventArns <p>
     *            A list of event ARNs (unique identifiers). For example:
     *            <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     *            </p>
     */
    public void setEventArns(java.util.Collection<String> eventArns) {
        if (eventArns == null) {
            this.eventArns = null;
            return;
        }

        this.eventArns = new java.util.ArrayList<String>(eventArns);
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventArns <p>
     *            A list of event ARNs (unique identifiers). For example:
     *            <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsRequest withEventArns(String... eventArns) {
        if (getEventArns() == null) {
            this.eventArns = new java.util.ArrayList<String>(eventArns.length);
        }
        for (String value : eventArns) {
            this.eventArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventArns <p>
     *            A list of event ARNs (unique identifiers). For example:
     *            <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventDetailsRequest withEventArns(java.util.Collection<String> eventArns) {
        setEventArns(eventArns);
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
    public DescribeEventDetailsRequest withLocale(String locale) {
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
        if (getEventArns() != null)
            sb.append("eventArns: " + getEventArns() + ",");
        if (getLocale() != null)
            sb.append("locale: " + getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArns() == null) ? 0 : getEventArns().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventDetailsRequest == false)
            return false;
        DescribeEventDetailsRequest other = (DescribeEventDetailsRequest) obj;

        if (other.getEventArns() == null ^ this.getEventArns() == null)
            return false;
        if (other.getEventArns() != null
                && other.getEventArns().equals(this.getEventArns()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }
}
