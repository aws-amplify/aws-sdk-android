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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates one of the following entry records associated with the domain:
 * Address (A), canonical name (CNAME), mail exchanger (MX), name server (NS),
 * start of authority (SOA), service locator (SRV), or text (TXT).
 * </p>
 * <p>
 * The <code>create domain entry</code> operation supports tag-based access
 * control via resource tags applied to the resource identified by
 * <code>domain name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateDomainEntryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for which you want to
     * create the domain entry.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry
     * request.
     * </p>
     */
    private DomainEntry domainEntry;

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for which you want to
     * create the domain entry.
     * </p>
     *
     * @return <p>
     *         The domain name (e.g., <code>example.com</code>) for which you
     *         want to create the domain entry.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for which you want to
     * create the domain entry.
     * </p>
     *
     * @param domainName <p>
     *            The domain name (e.g., <code>example.com</code>) for which you
     *            want to create the domain entry.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name (e.g., <code>example.com</code>) for which you want to
     * create the domain entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name (e.g., <code>example.com</code>) for which you
     *            want to create the domain entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainEntryRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry
     * request.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about the
     *         domain entry request.
     *         </p>
     */
    public DomainEntry getDomainEntry() {
        return domainEntry;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry
     * request.
     * </p>
     *
     * @param domainEntry <p>
     *            An array of key-value pairs containing information about the
     *            domain entry request.
     *            </p>
     */
    public void setDomainEntry(DomainEntry domainEntry) {
        this.domainEntry = domainEntry;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the domain entry
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainEntry <p>
     *            An array of key-value pairs containing information about the
     *            domain entry request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainEntryRequest withDomainEntry(DomainEntry domainEntry) {
        this.domainEntry = domainEntry;
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
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getDomainEntry() != null)
            sb.append("domainEntry: " + getDomainEntry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getDomainEntry() == null) ? 0 : getDomainEntry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainEntryRequest == false)
            return false;
        CreateDomainEntryRequest other = (CreateDomainEntryRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainEntry() == null ^ this.getDomainEntry() == null)
            return false;
        if (other.getDomainEntry() != null
                && other.getDomainEntry().equals(this.getDomainEntry()) == false)
            return false;
        return true;
    }
}
