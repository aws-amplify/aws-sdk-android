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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

/**
 * <p>
 * A job's shipping information, including inbound and outbound tracking numbers
 * and shipping speed options.
 * </p>
 */
public class ShippingDetails implements Serializable {
    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how
     * soon you'll get the Snowball from the job's creation date. This speed
     * represents how quickly it moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping
     * and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     */
    private String shippingOption;

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a
     * Snowball being returned to AWS for a particular job.
     * </p>
     */
    private Shipment inboundShipment;

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a
     * Snowball being delivered to the address that you specified for a
     * particular job.
     * </p>
     */
    private Shipment outboundShipment;

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how
     * soon you'll get the Snowball from the job's creation date. This speed
     * represents how quickly it moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping
     * and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @return <p>
     *         The shipping speed for a particular job. This speed doesn't
     *         dictate how soon you'll get the Snowball from the job's creation
     *         date. This speed represents how quickly it moves to its
     *         destination while in transit. Regional shipping speeds are as
     *         follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Australia, you have access to express shipping. Typically,
     *         Snowballs shipped express are delivered in about a day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the European Union (EU), you have access to express shipping.
     *         Typically, Snowballs shipped express are delivered in about a
     *         day. In addition, most countries in the EU have access to
     *         standard shipping, which typically takes less than a week, one
     *         way.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In India, Snowballs are delivered in one to seven days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the United States of America (US), you have access to one-day
     *         shipping and two-day shipping.
     *         </p>
     *         </li>
     *         </ul>
     * @see ShippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how
     * soon you'll get the Snowball from the job's creation date. This speed
     * represents how quickly it moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping
     * and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The shipping speed for a particular job. This speed doesn't
     *            dictate how soon you'll get the Snowball from the job's
     *            creation date. This speed represents how quickly it moves to
     *            its destination while in transit. Regional shipping speeds are
     *            as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            Snowballs shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowballs shipped express are delivered
     *            in about a day. In addition, most countries in the EU have
     *            access to standard shipping, which typically takes less than a
     *            week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowballs are delivered in one to seven days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the United States of America (US), you have access to
     *            one-day shipping and two-day shipping.
     *            </p>
     *            </li>
     *            </ul>
     * @see ShippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how
     * soon you'll get the Snowball from the job's creation date. This speed
     * represents how quickly it moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping
     * and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The shipping speed for a particular job. This speed doesn't
     *            dictate how soon you'll get the Snowball from the job's
     *            creation date. This speed represents how quickly it moves to
     *            its destination while in transit. Regional shipping speeds are
     *            as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            Snowballs shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowballs shipped express are delivered
     *            in about a day. In addition, most countries in the EU have
     *            access to standard shipping, which typically takes less than a
     *            week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowballs are delivered in one to seven days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the United States of America (US), you have access to
     *            one-day shipping and two-day shipping.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShippingOption
     */
    public ShippingDetails withShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
        return this;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how
     * soon you'll get the Snowball from the job's creation date. This speed
     * represents how quickly it moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping
     * and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The shipping speed for a particular job. This speed doesn't
     *            dictate how soon you'll get the Snowball from the job's
     *            creation date. This speed represents how quickly it moves to
     *            its destination while in transit. Regional shipping speeds are
     *            as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            Snowballs shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowballs shipped express are delivered
     *            in about a day. In addition, most countries in the EU have
     *            access to standard shipping, which typically takes less than a
     *            week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowballs are delivered in one to seven days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the United States of America (US), you have access to
     *            one-day shipping and two-day shipping.
     *            </p>
     *            </li>
     *            </ul>
     * @see ShippingOption
     */
    public void setShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how
     * soon you'll get the Snowball from the job's creation date. This speed
     * represents how quickly it moves to its destination while in transit.
     * Regional shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs
     * shipped express are delivered in about a day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping.
     * Typically, Snowballs shipped express are delivered in about a day. In
     * addition, most countries in the EU have access to standard shipping,
     * which typically takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping
     * and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD
     *
     * @param shippingOption <p>
     *            The shipping speed for a particular job. This speed doesn't
     *            dictate how soon you'll get the Snowball from the job's
     *            creation date. This speed represents how quickly it moves to
     *            its destination while in transit. Regional shipping speeds are
     *            as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Australia, you have access to express shipping. Typically,
     *            Snowballs shipped express are delivered in about a day.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the European Union (EU), you have access to express
     *            shipping. Typically, Snowballs shipped express are delivered
     *            in about a day. In addition, most countries in the EU have
     *            access to standard shipping, which typically takes less than a
     *            week, one way.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In India, Snowballs are delivered in one to seven days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the United States of America (US), you have access to
     *            one-day shipping and two-day shipping.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ShippingOption
     */
    public ShippingDetails withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
        return this;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a
     * Snowball being returned to AWS for a particular job.
     * </p>
     *
     * @return <p>
     *         The <code>Status</code> and <code>TrackingNumber</code> values
     *         for a Snowball being returned to AWS for a particular job.
     *         </p>
     */
    public Shipment getInboundShipment() {
        return inboundShipment;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a
     * Snowball being returned to AWS for a particular job.
     * </p>
     *
     * @param inboundShipment <p>
     *            The <code>Status</code> and <code>TrackingNumber</code> values
     *            for a Snowball being returned to AWS for a particular job.
     *            </p>
     */
    public void setInboundShipment(Shipment inboundShipment) {
        this.inboundShipment = inboundShipment;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a
     * Snowball being returned to AWS for a particular job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inboundShipment <p>
     *            The <code>Status</code> and <code>TrackingNumber</code> values
     *            for a Snowball being returned to AWS for a particular job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShippingDetails withInboundShipment(Shipment inboundShipment) {
        this.inboundShipment = inboundShipment;
        return this;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a
     * Snowball being delivered to the address that you specified for a
     * particular job.
     * </p>
     *
     * @return <p>
     *         The <code>Status</code> and <code>TrackingNumber</code> values
     *         for a Snowball being delivered to the address that you specified
     *         for a particular job.
     *         </p>
     */
    public Shipment getOutboundShipment() {
        return outboundShipment;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a
     * Snowball being delivered to the address that you specified for a
     * particular job.
     * </p>
     *
     * @param outboundShipment <p>
     *            The <code>Status</code> and <code>TrackingNumber</code> values
     *            for a Snowball being delivered to the address that you
     *            specified for a particular job.
     *            </p>
     */
    public void setOutboundShipment(Shipment outboundShipment) {
        this.outboundShipment = outboundShipment;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a
     * Snowball being delivered to the address that you specified for a
     * particular job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundShipment <p>
     *            The <code>Status</code> and <code>TrackingNumber</code> values
     *            for a Snowball being delivered to the address that you
     *            specified for a particular job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShippingDetails withOutboundShipment(Shipment outboundShipment) {
        this.outboundShipment = outboundShipment;
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
        if (getShippingOption() != null)
            sb.append("ShippingOption: " + getShippingOption() + ",");
        if (getInboundShipment() != null)
            sb.append("InboundShipment: " + getInboundShipment() + ",");
        if (getOutboundShipment() != null)
            sb.append("OutboundShipment: " + getOutboundShipment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode
                + ((getInboundShipment() == null) ? 0 : getInboundShipment().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundShipment() == null) ? 0 : getOutboundShipment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShippingDetails == false)
            return false;
        ShippingDetails other = (ShippingDetails) obj;

        if (other.getShippingOption() == null ^ this.getShippingOption() == null)
            return false;
        if (other.getShippingOption() != null
                && other.getShippingOption().equals(this.getShippingOption()) == false)
            return false;
        if (other.getInboundShipment() == null ^ this.getInboundShipment() == null)
            return false;
        if (other.getInboundShipment() != null
                && other.getInboundShipment().equals(this.getInboundShipment()) == false)
            return false;
        if (other.getOutboundShipment() == null ^ this.getOutboundShipment() == null)
            return false;
        if (other.getOutboundShipment() != null
                && other.getOutboundShipment().equals(this.getOutboundShipment()) == false)
            return false;
        return true;
    }
}
