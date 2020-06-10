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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * Details of the described attack.
 * </p>
 */
public class AttackProperty implements Serializable {
    /**
     * <p>
     * The type of distributed denial of service (DDoS) event that was observed.
     * <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NETWORK, APPLICATION
     */
    private String attackLayer;

    /**
     * <p>
     * Defines the DDoS attack property information that is provided. The
     * <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     * <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only for
     * WordPress reflective pingback DDoS attacks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESTINATION_URL, REFERRER, SOURCE_ASN,
     * SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT,
     * WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE
     */
    private String attackPropertyIdentifier;

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five
     * contributors to an attack.
     * </p>
     */
    private java.util.List<Contributor> topContributors;

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BITS, BYTES, PACKETS, REQUESTS
     */
    private String unit;

    /**
     * <p>
     * The total contributions made to this attack by all contributors, not just
     * the five listed in the <code>TopContributors</code> list.
     * </p>
     */
    private Long total;

    /**
     * <p>
     * The type of distributed denial of service (DDoS) event that was observed.
     * <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NETWORK, APPLICATION
     *
     * @return <p>
     *         The type of distributed denial of service (DDoS) event that was
     *         observed. <code>NETWORK</code> indicates layer 3 and layer 4
     *         events and <code>APPLICATION</code> indicates layer 7 events.
     *         </p>
     * @see AttackLayer
     */
    public String getAttackLayer() {
        return attackLayer;
    }

    /**
     * <p>
     * The type of distributed denial of service (DDoS) event that was observed.
     * <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NETWORK, APPLICATION
     *
     * @param attackLayer <p>
     *            The type of distributed denial of service (DDoS) event that
     *            was observed. <code>NETWORK</code> indicates layer 3 and layer
     *            4 events and <code>APPLICATION</code> indicates layer 7
     *            events.
     *            </p>
     * @see AttackLayer
     */
    public void setAttackLayer(String attackLayer) {
        this.attackLayer = attackLayer;
    }

    /**
     * <p>
     * The type of distributed denial of service (DDoS) event that was observed.
     * <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NETWORK, APPLICATION
     *
     * @param attackLayer <p>
     *            The type of distributed denial of service (DDoS) event that
     *            was observed. <code>NETWORK</code> indicates layer 3 and layer
     *            4 events and <code>APPLICATION</code> indicates layer 7
     *            events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttackLayer
     */
    public AttackProperty withAttackLayer(String attackLayer) {
        this.attackLayer = attackLayer;
        return this;
    }

    /**
     * <p>
     * The type of distributed denial of service (DDoS) event that was observed.
     * <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NETWORK, APPLICATION
     *
     * @param attackLayer <p>
     *            The type of distributed denial of service (DDoS) event that
     *            was observed. <code>NETWORK</code> indicates layer 3 and layer
     *            4 events and <code>APPLICATION</code> indicates layer 7
     *            events.
     *            </p>
     * @see AttackLayer
     */
    public void setAttackLayer(AttackLayer attackLayer) {
        this.attackLayer = attackLayer.toString();
    }

    /**
     * <p>
     * The type of distributed denial of service (DDoS) event that was observed.
     * <code>NETWORK</code> indicates layer 3 and layer 4 events and
     * <code>APPLICATION</code> indicates layer 7 events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NETWORK, APPLICATION
     *
     * @param attackLayer <p>
     *            The type of distributed denial of service (DDoS) event that
     *            was observed. <code>NETWORK</code> indicates layer 3 and layer
     *            4 events and <code>APPLICATION</code> indicates layer 7
     *            events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttackLayer
     */
    public AttackProperty withAttackLayer(AttackLayer attackLayer) {
        this.attackLayer = attackLayer.toString();
        return this;
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided. The
     * <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     * <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only for
     * WordPress reflective pingback DDoS attacks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESTINATION_URL, REFERRER, SOURCE_ASN,
     * SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT,
     * WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE
     *
     * @return <p>
     *         Defines the DDoS attack property information that is provided.
     *         The <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     *         <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only for
     *         WordPress reflective pingback DDoS attacks.
     *         </p>
     * @see AttackPropertyIdentifier
     */
    public String getAttackPropertyIdentifier() {
        return attackPropertyIdentifier;
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided. The
     * <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     * <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only for
     * WordPress reflective pingback DDoS attacks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESTINATION_URL, REFERRER, SOURCE_ASN,
     * SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT,
     * WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE
     *
     * @param attackPropertyIdentifier <p>
     *            Defines the DDoS attack property information that is provided.
     *            The <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     *            <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only
     *            for WordPress reflective pingback DDoS attacks.
     *            </p>
     * @see AttackPropertyIdentifier
     */
    public void setAttackPropertyIdentifier(String attackPropertyIdentifier) {
        this.attackPropertyIdentifier = attackPropertyIdentifier;
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided. The
     * <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     * <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only for
     * WordPress reflective pingback DDoS attacks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESTINATION_URL, REFERRER, SOURCE_ASN,
     * SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT,
     * WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE
     *
     * @param attackPropertyIdentifier <p>
     *            Defines the DDoS attack property information that is provided.
     *            The <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     *            <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only
     *            for WordPress reflective pingback DDoS attacks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttackPropertyIdentifier
     */
    public AttackProperty withAttackPropertyIdentifier(String attackPropertyIdentifier) {
        this.attackPropertyIdentifier = attackPropertyIdentifier;
        return this;
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided. The
     * <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     * <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only for
     * WordPress reflective pingback DDoS attacks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESTINATION_URL, REFERRER, SOURCE_ASN,
     * SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT,
     * WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE
     *
     * @param attackPropertyIdentifier <p>
     *            Defines the DDoS attack property information that is provided.
     *            The <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     *            <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only
     *            for WordPress reflective pingback DDoS attacks.
     *            </p>
     * @see AttackPropertyIdentifier
     */
    public void setAttackPropertyIdentifier(AttackPropertyIdentifier attackPropertyIdentifier) {
        this.attackPropertyIdentifier = attackPropertyIdentifier.toString();
    }

    /**
     * <p>
     * Defines the DDoS attack property information that is provided. The
     * <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     * <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only for
     * WordPress reflective pingback DDoS attacks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DESTINATION_URL, REFERRER, SOURCE_ASN,
     * SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT,
     * WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE
     *
     * @param attackPropertyIdentifier <p>
     *            Defines the DDoS attack property information that is provided.
     *            The <code>WORDPRESS_PINGBACK_REFLECTOR</code> and
     *            <code>WORDPRESS_PINGBACK_SOURCE</code> values are valid only
     *            for WordPress reflective pingback DDoS attacks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttackPropertyIdentifier
     */
    public AttackProperty withAttackPropertyIdentifier(
            AttackPropertyIdentifier attackPropertyIdentifier) {
        this.attackPropertyIdentifier = attackPropertyIdentifier.toString();
        return this;
    }

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five
     * contributors to an attack.
     * </p>
     *
     * @return <p>
     *         The array of <a>Contributor</a> objects that includes the top
     *         five contributors to an attack.
     *         </p>
     */
    public java.util.List<Contributor> getTopContributors() {
        return topContributors;
    }

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five
     * contributors to an attack.
     * </p>
     *
     * @param topContributors <p>
     *            The array of <a>Contributor</a> objects that includes the top
     *            five contributors to an attack.
     *            </p>
     */
    public void setTopContributors(java.util.Collection<Contributor> topContributors) {
        if (topContributors == null) {
            this.topContributors = null;
            return;
        }

        this.topContributors = new java.util.ArrayList<Contributor>(topContributors);
    }

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five
     * contributors to an attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topContributors <p>
     *            The array of <a>Contributor</a> objects that includes the top
     *            five contributors to an attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackProperty withTopContributors(Contributor... topContributors) {
        if (getTopContributors() == null) {
            this.topContributors = new java.util.ArrayList<Contributor>(topContributors.length);
        }
        for (Contributor value : topContributors) {
            this.topContributors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>Contributor</a> objects that includes the top five
     * contributors to an attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topContributors <p>
     *            The array of <a>Contributor</a> objects that includes the top
     *            five contributors to an attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackProperty withTopContributors(java.util.Collection<Contributor> topContributors) {
        setTopContributors(topContributors);
        return this;
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BITS, BYTES, PACKETS, REQUESTS
     *
     * @return <p>
     *         The unit of the <code>Value</code> of the contributions.
     *         </p>
     * @see Unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BITS, BYTES, PACKETS, REQUESTS
     *
     * @param unit <p>
     *            The unit of the <code>Value</code> of the contributions.
     *            </p>
     * @see Unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BITS, BYTES, PACKETS, REQUESTS
     *
     * @param unit <p>
     *            The unit of the <code>Value</code> of the contributions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Unit
     */
    public AttackProperty withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BITS, BYTES, PACKETS, REQUESTS
     *
     * @param unit <p>
     *            The unit of the <code>Value</code> of the contributions.
     *            </p>
     * @see Unit
     */
    public void setUnit(Unit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit of the <code>Value</code> of the contributions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BITS, BYTES, PACKETS, REQUESTS
     *
     * @param unit <p>
     *            The unit of the <code>Value</code> of the contributions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Unit
     */
    public AttackProperty withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The total contributions made to this attack by all contributors, not just
     * the five listed in the <code>TopContributors</code> list.
     * </p>
     *
     * @return <p>
     *         The total contributions made to this attack by all contributors,
     *         not just the five listed in the <code>TopContributors</code>
     *         list.
     *         </p>
     */
    public Long getTotal() {
        return total;
    }

    /**
     * <p>
     * The total contributions made to this attack by all contributors, not just
     * the five listed in the <code>TopContributors</code> list.
     * </p>
     *
     * @param total <p>
     *            The total contributions made to this attack by all
     *            contributors, not just the five listed in the
     *            <code>TopContributors</code> list.
     *            </p>
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * <p>
     * The total contributions made to this attack by all contributors, not just
     * the five listed in the <code>TopContributors</code> list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The total contributions made to this attack by all
     *            contributors, not just the five listed in the
     *            <code>TopContributors</code> list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackProperty withTotal(Long total) {
        this.total = total;
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
        if (getAttackLayer() != null)
            sb.append("AttackLayer: " + getAttackLayer() + ",");
        if (getAttackPropertyIdentifier() != null)
            sb.append("AttackPropertyIdentifier: " + getAttackPropertyIdentifier() + ",");
        if (getTopContributors() != null)
            sb.append("TopContributors: " + getTopContributors() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit() + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttackLayer() == null) ? 0 : getAttackLayer().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttackPropertyIdentifier() == null) ? 0 : getAttackPropertyIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTopContributors() == null) ? 0 : getTopContributors().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackProperty == false)
            return false;
        AttackProperty other = (AttackProperty) obj;

        if (other.getAttackLayer() == null ^ this.getAttackLayer() == null)
            return false;
        if (other.getAttackLayer() != null
                && other.getAttackLayer().equals(this.getAttackLayer()) == false)
            return false;
        if (other.getAttackPropertyIdentifier() == null
                ^ this.getAttackPropertyIdentifier() == null)
            return false;
        if (other.getAttackPropertyIdentifier() != null
                && other.getAttackPropertyIdentifier().equals(this.getAttackPropertyIdentifier()) == false)
            return false;
        if (other.getTopContributors() == null ^ this.getTopContributors() == null)
            return false;
        if (other.getTopContributors() != null
                && other.getTopContributors().equals(this.getTopContributors()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }
}
