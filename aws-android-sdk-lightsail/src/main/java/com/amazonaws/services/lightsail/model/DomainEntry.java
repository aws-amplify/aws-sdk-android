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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a domain recordset entry.
 * </p>
 */
public class DomainEntry implements Serializable {
    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * <p>
     * For Lightsail load balancers, the value looks like
     * <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>
     * . Be sure to also set <code>isAlias</code> to <code>true</code> when
     * setting up an A record for a load balancer.
     * </p>
     */
    private String target;

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias
     * used by the Lightsail load balancer. You can include an alias (A type)
     * record in your request, which points to a load balancer DNS name and
     * routes traffic to your load balancer
     * </p>
     */
    private Boolean isAlias;

    /**
     * <p>
     * The type of domain entry, such as address (A), canonical name (CNAME),
     * mail exchanger (MX), name server (NS), start of authority (SOA), service
     * locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The following domain entry types can be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SRV</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TXT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> options;

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the domain recordset entry.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The ID of the domain recordset entry.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the domain recordset entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The ID of the domain recordset entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     *
     * @return <p>
     *         The name of the domain.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     *
     * @param name <p>
     *            The name of the domain.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * <p>
     * For Lightsail load balancers, the value looks like
     * <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>
     * . Be sure to also set <code>isAlias</code> to <code>true</code> when
     * setting up an A record for a load balancer.
     * </p>
     *
     * @return <p>
     *         The target AWS name server (e.g.,
     *         <code>ns-111.awsdns-22.com.</code>).
     *         </p>
     *         <p>
     *         For Lightsail load balancers, the value looks like
     *         <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>
     *         . Be sure to also set <code>isAlias</code> to <code>true</code>
     *         when setting up an A record for a load balancer.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * <p>
     * For Lightsail load balancers, the value looks like
     * <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>
     * . Be sure to also set <code>isAlias</code> to <code>true</code> when
     * setting up an A record for a load balancer.
     * </p>
     *
     * @param target <p>
     *            The target AWS name server (e.g.,
     *            <code>ns-111.awsdns-22.com.</code>).
     *            </p>
     *            <p>
     *            For Lightsail load balancers, the value looks like
     *            <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>
     *            . Be sure to also set <code>isAlias</code> to
     *            <code>true</code> when setting up an A record for a load
     *            balancer.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target AWS name server (e.g., <code>ns-111.awsdns-22.com.</code>).
     * </p>
     * <p>
     * For Lightsail load balancers, the value looks like
     * <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>
     * . Be sure to also set <code>isAlias</code> to <code>true</code> when
     * setting up an A record for a load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The target AWS name server (e.g.,
     *            <code>ns-111.awsdns-22.com.</code>).
     *            </p>
     *            <p>
     *            For Lightsail load balancers, the value looks like
     *            <code>ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com</code>
     *            . Be sure to also set <code>isAlias</code> to
     *            <code>true</code> when setting up an A record for a load
     *            balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainEntry withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias
     * used by the Lightsail load balancer. You can include an alias (A type)
     * record in your request, which points to a load balancer DNS name and
     * routes traffic to your load balancer
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, specifies whether the domain entry is an
     *         alias used by the Lightsail load balancer. You can include an
     *         alias (A type) record in your request, which points to a load
     *         balancer DNS name and routes traffic to your load balancer
     *         </p>
     */
    public Boolean isIsAlias() {
        return isAlias;
    }

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias
     * used by the Lightsail load balancer. You can include an alias (A type)
     * record in your request, which points to a load balancer DNS name and
     * routes traffic to your load balancer
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, specifies whether the domain entry is an
     *         alias used by the Lightsail load balancer. You can include an
     *         alias (A type) record in your request, which points to a load
     *         balancer DNS name and routes traffic to your load balancer
     *         </p>
     */
    public Boolean getIsAlias() {
        return isAlias;
    }

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias
     * used by the Lightsail load balancer. You can include an alias (A type)
     * record in your request, which points to a load balancer DNS name and
     * routes traffic to your load balancer
     * </p>
     *
     * @param isAlias <p>
     *            When <code>true</code>, specifies whether the domain entry is
     *            an alias used by the Lightsail load balancer. You can include
     *            an alias (A type) record in your request, which points to a
     *            load balancer DNS name and routes traffic to your load
     *            balancer
     *            </p>
     */
    public void setIsAlias(Boolean isAlias) {
        this.isAlias = isAlias;
    }

    /**
     * <p>
     * When <code>true</code>, specifies whether the domain entry is an alias
     * used by the Lightsail load balancer. You can include an alias (A type)
     * record in your request, which points to a load balancer DNS name and
     * routes traffic to your load balancer
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isAlias <p>
     *            When <code>true</code>, specifies whether the domain entry is
     *            an alias used by the Lightsail load balancer. You can include
     *            an alias (A type) record in your request, which points to a
     *            load balancer DNS name and routes traffic to your load
     *            balancer
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainEntry withIsAlias(Boolean isAlias) {
        this.isAlias = isAlias;
        return this;
    }

    /**
     * <p>
     * The type of domain entry, such as address (A), canonical name (CNAME),
     * mail exchanger (MX), name server (NS), start of authority (SOA), service
     * locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The following domain entry types can be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SRV</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TXT</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The type of domain entry, such as address (A), canonical name
     *         (CNAME), mail exchanger (MX), name server (NS), start of
     *         authority (SOA), service locator (SRV), or text (TXT).
     *         </p>
     *         <p>
     *         The following domain entry types can be used:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>A</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CNAME</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MX</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SOA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SRV</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TXT</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of domain entry, such as address (A), canonical name (CNAME),
     * mail exchanger (MX), name server (NS), start of authority (SOA), service
     * locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The following domain entry types can be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SRV</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TXT</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param type <p>
     *            The type of domain entry, such as address (A), canonical name
     *            (CNAME), mail exchanger (MX), name server (NS), start of
     *            authority (SOA), service locator (SRV), or text (TXT).
     *            </p>
     *            <p>
     *            The following domain entry types can be used:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>A</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CNAME</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MX</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SOA</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SRV</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TXT</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of domain entry, such as address (A), canonical name (CNAME),
     * mail exchanger (MX), name server (NS), start of authority (SOA), service
     * locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The following domain entry types can be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SRV</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TXT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of domain entry, such as address (A), canonical name
     *            (CNAME), mail exchanger (MX), name server (NS), start of
     *            authority (SOA), service locator (SRV), or text (TXT).
     *            </p>
     *            <p>
     *            The following domain entry types can be used:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>A</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CNAME</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MX</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SOA</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SRV</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TXT</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainEntry withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     *
     * @return <p>
     *         (Deprecated) The options for the domain entry.
     *         </p>
     *         <note>
     *         <p>
     *         In releases prior to November 29, 2017, this parameter was not
     *         included in the API response. It is now deprecated.
     *         </p>
     *         </note>
     */
    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     *
     * @param options <p>
     *            (Deprecated) The options for the domain entry.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to November 29, 2017, this parameter was not
     *            included in the API response. It is now deprecated.
     *            </p>
     *            </note>
     */
    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            (Deprecated) The options for the domain entry.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to November 29, 2017, this parameter was not
     *            included in the API response. It is now deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainEntry withOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }

    /**
     * <p>
     * (Deprecated) The options for the domain entry.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 29, 2017, this parameter was not included
     * in the API response. It is now deprecated.
     * </p>
     * </note>
     * <p>
     * The method adds a new key-value pair into options parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into options.
     * @param value The corresponding value of the entry to be added into
     *            options.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainEntry addoptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into options.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DomainEntry clearoptionsEntries() {
        this.options = null;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getTarget() != null)
            sb.append("target: " + getTarget() + ",");
        if (getIsAlias() != null)
            sb.append("isAlias: " + getIsAlias() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getOptions() != null)
            sb.append("options: " + getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getIsAlias() == null) ? 0 : getIsAlias().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainEntry == false)
            return false;
        DomainEntry other = (DomainEntry) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getIsAlias() == null ^ this.getIsAlias() == null)
            return false;
        if (other.getIsAlias() != null && other.getIsAlias().equals(this.getIsAlias()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }
}
