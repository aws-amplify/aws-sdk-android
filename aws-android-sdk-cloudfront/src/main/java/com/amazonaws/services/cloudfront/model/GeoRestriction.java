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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that controls the countries in which your content is
 * distributed. CloudFront determines the location of your users using
 * <code>MaxMind</code> GeoIP databases.
 * </p>
 */
public class GeoRestriction implements Serializable {
    /**
     * <p>
     * The method that you want to use to restrict distribution of your content
     * by country:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code>: No geo restriction is enabled, meaning access to
     * content is not restricted by client geo location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blacklist</code>: The <code>Location</code> elements specify the
     * countries in which you don't want CloudFront to distribute your content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code>: The <code>Location</code> elements specify the
     * countries in which you want CloudFront to distribute your content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>blacklist, whitelist, none
     */
    private String restrictionType;

    /**
     * <p>
     * When geo restriction is <code>enabled</code>, this is the number of
     * countries in your <code>whitelist</code> or <code>blacklist</code>.
     * Otherwise, when it is not enabled, <code>Quantity</code> is
     * <code>0</code>, and you can omit <code>Items</code>.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * A complex type that contains a <code>Location</code> element for each
     * country in which you want CloudFront either to distribute your content (
     * <code>whitelist</code>) or not distribute your content (
     * <code>blacklist</code>).
     * </p>
     * <p>
     * The <code>Location</code> element is a two-letter, uppercase country code
     * for a country that you want to include in your <code>blacklist</code> or
     * <code>whitelist</code>. Include one <code>Location</code> element for
     * each country.
     * </p>
     * <p>
     * CloudFront and <code>MaxMind</code> both use <code>ISO 3166</code>
     * country codes. For the current list of countries and the corresponding
     * codes, see <code>ISO 3166-1-alpha-2</code> code on the <i>International
     * Organization for Standardization</i> website. You can also refer to the
     * country list on the CloudFront console, which includes both country names
     * and codes.
     * </p>
     */
    private java.util.List<String> items;

    /**
     * <p>
     * The method that you want to use to restrict distribution of your content
     * by country:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code>: No geo restriction is enabled, meaning access to
     * content is not restricted by client geo location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blacklist</code>: The <code>Location</code> elements specify the
     * countries in which you don't want CloudFront to distribute your content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code>: The <code>Location</code> elements specify the
     * countries in which you want CloudFront to distribute your content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>blacklist, whitelist, none
     *
     * @return <p>
     *         The method that you want to use to restrict distribution of your
     *         content by country:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>none</code>: No geo restriction is enabled, meaning access
     *         to content is not restricted by client geo location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>blacklist</code>: The <code>Location</code> elements
     *         specify the countries in which you don't want CloudFront to
     *         distribute your content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>whitelist</code>: The <code>Location</code> elements
     *         specify the countries in which you want CloudFront to distribute
     *         your content.
     *         </p>
     *         </li>
     *         </ul>
     * @see GeoRestrictionType
     */
    public String getRestrictionType() {
        return restrictionType;
    }

    /**
     * <p>
     * The method that you want to use to restrict distribution of your content
     * by country:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code>: No geo restriction is enabled, meaning access to
     * content is not restricted by client geo location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blacklist</code>: The <code>Location</code> elements specify the
     * countries in which you don't want CloudFront to distribute your content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code>: The <code>Location</code> elements specify the
     * countries in which you want CloudFront to distribute your content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>blacklist, whitelist, none
     *
     * @param restrictionType <p>
     *            The method that you want to use to restrict distribution of
     *            your content by country:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>none</code>: No geo restriction is enabled, meaning
     *            access to content is not restricted by client geo location.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>blacklist</code>: The <code>Location</code> elements
     *            specify the countries in which you don't want CloudFront to
     *            distribute your content.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>whitelist</code>: The <code>Location</code> elements
     *            specify the countries in which you want CloudFront to
     *            distribute your content.
     *            </p>
     *            </li>
     *            </ul>
     * @see GeoRestrictionType
     */
    public void setRestrictionType(String restrictionType) {
        this.restrictionType = restrictionType;
    }

    /**
     * <p>
     * The method that you want to use to restrict distribution of your content
     * by country:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code>: No geo restriction is enabled, meaning access to
     * content is not restricted by client geo location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blacklist</code>: The <code>Location</code> elements specify the
     * countries in which you don't want CloudFront to distribute your content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code>: The <code>Location</code> elements specify the
     * countries in which you want CloudFront to distribute your content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>blacklist, whitelist, none
     *
     * @param restrictionType <p>
     *            The method that you want to use to restrict distribution of
     *            your content by country:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>none</code>: No geo restriction is enabled, meaning
     *            access to content is not restricted by client geo location.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>blacklist</code>: The <code>Location</code> elements
     *            specify the countries in which you don't want CloudFront to
     *            distribute your content.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>whitelist</code>: The <code>Location</code> elements
     *            specify the countries in which you want CloudFront to
     *            distribute your content.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GeoRestrictionType
     */
    public GeoRestriction withRestrictionType(String restrictionType) {
        this.restrictionType = restrictionType;
        return this;
    }

    /**
     * <p>
     * The method that you want to use to restrict distribution of your content
     * by country:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code>: No geo restriction is enabled, meaning access to
     * content is not restricted by client geo location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blacklist</code>: The <code>Location</code> elements specify the
     * countries in which you don't want CloudFront to distribute your content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code>: The <code>Location</code> elements specify the
     * countries in which you want CloudFront to distribute your content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>blacklist, whitelist, none
     *
     * @param restrictionType <p>
     *            The method that you want to use to restrict distribution of
     *            your content by country:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>none</code>: No geo restriction is enabled, meaning
     *            access to content is not restricted by client geo location.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>blacklist</code>: The <code>Location</code> elements
     *            specify the countries in which you don't want CloudFront to
     *            distribute your content.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>whitelist</code>: The <code>Location</code> elements
     *            specify the countries in which you want CloudFront to
     *            distribute your content.
     *            </p>
     *            </li>
     *            </ul>
     * @see GeoRestrictionType
     */
    public void setRestrictionType(GeoRestrictionType restrictionType) {
        this.restrictionType = restrictionType.toString();
    }

    /**
     * <p>
     * The method that you want to use to restrict distribution of your content
     * by country:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code>: No geo restriction is enabled, meaning access to
     * content is not restricted by client geo location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blacklist</code>: The <code>Location</code> elements specify the
     * countries in which you don't want CloudFront to distribute your content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code>: The <code>Location</code> elements specify the
     * countries in which you want CloudFront to distribute your content.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>blacklist, whitelist, none
     *
     * @param restrictionType <p>
     *            The method that you want to use to restrict distribution of
     *            your content by country:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>none</code>: No geo restriction is enabled, meaning
     *            access to content is not restricted by client geo location.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>blacklist</code>: The <code>Location</code> elements
     *            specify the countries in which you don't want CloudFront to
     *            distribute your content.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>whitelist</code>: The <code>Location</code> elements
     *            specify the countries in which you want CloudFront to
     *            distribute your content.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GeoRestrictionType
     */
    public GeoRestriction withRestrictionType(GeoRestrictionType restrictionType) {
        this.restrictionType = restrictionType.toString();
        return this;
    }

    /**
     * <p>
     * When geo restriction is <code>enabled</code>, this is the number of
     * countries in your <code>whitelist</code> or <code>blacklist</code>.
     * Otherwise, when it is not enabled, <code>Quantity</code> is
     * <code>0</code>, and you can omit <code>Items</code>.
     * </p>
     *
     * @return <p>
     *         When geo restriction is <code>enabled</code>, this is the number
     *         of countries in your <code>whitelist</code> or
     *         <code>blacklist</code>. Otherwise, when it is not enabled,
     *         <code>Quantity</code> is <code>0</code>, and you can omit
     *         <code>Items</code>.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * When geo restriction is <code>enabled</code>, this is the number of
     * countries in your <code>whitelist</code> or <code>blacklist</code>.
     * Otherwise, when it is not enabled, <code>Quantity</code> is
     * <code>0</code>, and you can omit <code>Items</code>.
     * </p>
     *
     * @param quantity <p>
     *            When geo restriction is <code>enabled</code>, this is the
     *            number of countries in your <code>whitelist</code> or
     *            <code>blacklist</code>. Otherwise, when it is not enabled,
     *            <code>Quantity</code> is <code>0</code>, and you can omit
     *            <code>Items</code>.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * When geo restriction is <code>enabled</code>, this is the number of
     * countries in your <code>whitelist</code> or <code>blacklist</code>.
     * Otherwise, when it is not enabled, <code>Quantity</code> is
     * <code>0</code>, and you can omit <code>Items</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            When geo restriction is <code>enabled</code>, this is the
     *            number of countries in your <code>whitelist</code> or
     *            <code>blacklist</code>. Otherwise, when it is not enabled,
     *            <code>Quantity</code> is <code>0</code>, and you can omit
     *            <code>Items</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoRestriction withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * A complex type that contains a <code>Location</code> element for each
     * country in which you want CloudFront either to distribute your content (
     * <code>whitelist</code>) or not distribute your content (
     * <code>blacklist</code>).
     * </p>
     * <p>
     * The <code>Location</code> element is a two-letter, uppercase country code
     * for a country that you want to include in your <code>blacklist</code> or
     * <code>whitelist</code>. Include one <code>Location</code> element for
     * each country.
     * </p>
     * <p>
     * CloudFront and <code>MaxMind</code> both use <code>ISO 3166</code>
     * country codes. For the current list of countries and the corresponding
     * codes, see <code>ISO 3166-1-alpha-2</code> code on the <i>International
     * Organization for Standardization</i> website. You can also refer to the
     * country list on the CloudFront console, which includes both country names
     * and codes.
     * </p>
     *
     * @return <p>
     *         A complex type that contains a <code>Location</code> element for
     *         each country in which you want CloudFront either to distribute
     *         your content (<code>whitelist</code>) or not distribute your
     *         content (<code>blacklist</code>).
     *         </p>
     *         <p>
     *         The <code>Location</code> element is a two-letter, uppercase
     *         country code for a country that you want to include in your
     *         <code>blacklist</code> or <code>whitelist</code>. Include one
     *         <code>Location</code> element for each country.
     *         </p>
     *         <p>
     *         CloudFront and <code>MaxMind</code> both use
     *         <code>ISO 3166</code> country codes. For the current list of
     *         countries and the corresponding codes, see
     *         <code>ISO 3166-1-alpha-2</code> code on the <i>International
     *         Organization for Standardization</i> website. You can also refer
     *         to the country list on the CloudFront console, which includes
     *         both country names and codes.
     *         </p>
     */
    public java.util.List<String> getItems() {
        return items;
    }

    /**
     * <p>
     * A complex type that contains a <code>Location</code> element for each
     * country in which you want CloudFront either to distribute your content (
     * <code>whitelist</code>) or not distribute your content (
     * <code>blacklist</code>).
     * </p>
     * <p>
     * The <code>Location</code> element is a two-letter, uppercase country code
     * for a country that you want to include in your <code>blacklist</code> or
     * <code>whitelist</code>. Include one <code>Location</code> element for
     * each country.
     * </p>
     * <p>
     * CloudFront and <code>MaxMind</code> both use <code>ISO 3166</code>
     * country codes. For the current list of countries and the corresponding
     * codes, see <code>ISO 3166-1-alpha-2</code> code on the <i>International
     * Organization for Standardization</i> website. You can also refer to the
     * country list on the CloudFront console, which includes both country names
     * and codes.
     * </p>
     *
     * @param items <p>
     *            A complex type that contains a <code>Location</code> element
     *            for each country in which you want CloudFront either to
     *            distribute your content (<code>whitelist</code>) or not
     *            distribute your content (<code>blacklist</code>).
     *            </p>
     *            <p>
     *            The <code>Location</code> element is a two-letter, uppercase
     *            country code for a country that you want to include in your
     *            <code>blacklist</code> or <code>whitelist</code>. Include one
     *            <code>Location</code> element for each country.
     *            </p>
     *            <p>
     *            CloudFront and <code>MaxMind</code> both use
     *            <code>ISO 3166</code> country codes. For the current list of
     *            countries and the corresponding codes, see
     *            <code>ISO 3166-1-alpha-2</code> code on the <i>International
     *            Organization for Standardization</i> website. You can also
     *            refer to the country list on the CloudFront console, which
     *            includes both country names and codes.
     *            </p>
     */
    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<String>(items);
    }

    /**
     * <p>
     * A complex type that contains a <code>Location</code> element for each
     * country in which you want CloudFront either to distribute your content (
     * <code>whitelist</code>) or not distribute your content (
     * <code>blacklist</code>).
     * </p>
     * <p>
     * The <code>Location</code> element is a two-letter, uppercase country code
     * for a country that you want to include in your <code>blacklist</code> or
     * <code>whitelist</code>. Include one <code>Location</code> element for
     * each country.
     * </p>
     * <p>
     * CloudFront and <code>MaxMind</code> both use <code>ISO 3166</code>
     * country codes. For the current list of countries and the corresponding
     * codes, see <code>ISO 3166-1-alpha-2</code> code on the <i>International
     * Organization for Standardization</i> website. You can also refer to the
     * country list on the CloudFront console, which includes both country names
     * and codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains a <code>Location</code> element
     *            for each country in which you want CloudFront either to
     *            distribute your content (<code>whitelist</code>) or not
     *            distribute your content (<code>blacklist</code>).
     *            </p>
     *            <p>
     *            The <code>Location</code> element is a two-letter, uppercase
     *            country code for a country that you want to include in your
     *            <code>blacklist</code> or <code>whitelist</code>. Include one
     *            <code>Location</code> element for each country.
     *            </p>
     *            <p>
     *            CloudFront and <code>MaxMind</code> both use
     *            <code>ISO 3166</code> country codes. For the current list of
     *            countries and the corresponding codes, see
     *            <code>ISO 3166-1-alpha-2</code> code on the <i>International
     *            Organization for Standardization</i> website. You can also
     *            refer to the country list on the CloudFront console, which
     *            includes both country names and codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoRestriction withItems(String... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<String>(items.length);
        }
        for (String value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a <code>Location</code> element for each
     * country in which you want CloudFront either to distribute your content (
     * <code>whitelist</code>) or not distribute your content (
     * <code>blacklist</code>).
     * </p>
     * <p>
     * The <code>Location</code> element is a two-letter, uppercase country code
     * for a country that you want to include in your <code>blacklist</code> or
     * <code>whitelist</code>. Include one <code>Location</code> element for
     * each country.
     * </p>
     * <p>
     * CloudFront and <code>MaxMind</code> both use <code>ISO 3166</code>
     * country codes. For the current list of countries and the corresponding
     * codes, see <code>ISO 3166-1-alpha-2</code> code on the <i>International
     * Organization for Standardization</i> website. You can also refer to the
     * country list on the CloudFront console, which includes both country names
     * and codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains a <code>Location</code> element
     *            for each country in which you want CloudFront either to
     *            distribute your content (<code>whitelist</code>) or not
     *            distribute your content (<code>blacklist</code>).
     *            </p>
     *            <p>
     *            The <code>Location</code> element is a two-letter, uppercase
     *            country code for a country that you want to include in your
     *            <code>blacklist</code> or <code>whitelist</code>. Include one
     *            <code>Location</code> element for each country.
     *            </p>
     *            <p>
     *            CloudFront and <code>MaxMind</code> both use
     *            <code>ISO 3166</code> country codes. For the current list of
     *            countries and the corresponding codes, see
     *            <code>ISO 3166-1-alpha-2</code> code on the <i>International
     *            Organization for Standardization</i> website. You can also
     *            refer to the country list on the CloudFront console, which
     *            includes both country names and codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoRestriction withItems(java.util.Collection<String> items) {
        setItems(items);
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
        if (getRestrictionType() != null)
            sb.append("RestrictionType: " + getRestrictionType() + ",");
        if (getQuantity() != null)
            sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestrictionType() == null) ? 0 : getRestrictionType().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoRestriction == false)
            return false;
        GeoRestriction other = (GeoRestriction) obj;

        if (other.getRestrictionType() == null ^ this.getRestrictionType() == null)
            return false;
        if (other.getRestrictionType() != null
                && other.getRestrictionType().equals(this.getRestrictionType()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }
}
