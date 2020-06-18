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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the type of limit that you specified in the
 * request and the current value for that limit.
 * </p>
 */
public class HostedZoneLimit implements Serializable {
    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can
     * create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs
     * that you can associate with the specified private hosted zone.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE
     */
    private String type;

    /**
     * <p>
     * The current value for the limit that is specified by <code>Type</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long value;

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can
     * create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs
     * that you can associate with the specified private hosted zone.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE
     *
     * @return <p>
     *         The limit that you requested. Valid values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you
     *         can create in the specified hosted zone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon
     *         VPCs that you can associate with the specified private hosted
     *         zone.
     *         </p>
     *         </li>
     *         </ul>
     * @see HostedZoneLimitType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can
     * create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs
     * that you can associate with the specified private hosted zone.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE
     *
     * @param type <p>
     *            The limit that you requested. Valid values include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that
     *            you can create in the specified hosted zone.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of
     *            Amazon VPCs that you can associate with the specified private
     *            hosted zone.
     *            </p>
     *            </li>
     *            </ul>
     * @see HostedZoneLimitType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can
     * create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs
     * that you can associate with the specified private hosted zone.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE
     *
     * @param type <p>
     *            The limit that you requested. Valid values include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that
     *            you can create in the specified hosted zone.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of
     *            Amazon VPCs that you can associate with the specified private
     *            hosted zone.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostedZoneLimitType
     */
    public HostedZoneLimit withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can
     * create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs
     * that you can associate with the specified private hosted zone.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE
     *
     * @param type <p>
     *            The limit that you requested. Valid values include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that
     *            you can create in the specified hosted zone.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of
     *            Amazon VPCs that you can associate with the specified private
     *            hosted zone.
     *            </p>
     *            </li>
     *            </ul>
     * @see HostedZoneLimitType
     */
    public void setType(HostedZoneLimitType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can
     * create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs
     * that you can associate with the specified private hosted zone.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE
     *
     * @param type <p>
     *            The limit that you requested. Valid values include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that
     *            you can create in the specified hosted zone.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of
     *            Amazon VPCs that you can associate with the specified private
     *            hosted zone.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostedZoneLimitType
     */
    public HostedZoneLimit withType(HostedZoneLimitType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <code>Type</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The current value for the limit that is specified by
     *         <code>Type</code>.
     *         </p>
     */
    public Long getValue() {
        return value;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <code>Type</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param value <p>
     *            The current value for the limit that is specified by
     *            <code>Type</code>.
     *            </p>
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <code>Type</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param value <p>
     *            The current value for the limit that is specified by
     *            <code>Type</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZoneLimit withValue(Long value) {
        this.value = value;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZoneLimit == false)
            return false;
        HostedZoneLimit other = (HostedZoneLimit) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
