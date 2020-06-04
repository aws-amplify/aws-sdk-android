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
 * Deletes a specific domain entry.
 * </p>
 * <p>
 * The <code>delete domain entry</code> operation supports tag-based access
 * control via resource tags applied to the resource identified by
 * <code>domain name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class DeleteDomainEntryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain entry to delete.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * An array of key-value pairs containing information about your domain
     * entries.
     * </p>
     */
    private DomainEntry domainEntry;

    /**
     * <p>
     * The name of the domain entry to delete.
     * </p>
     *
     * @return <p>
     *         The name of the domain entry to delete.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain entry to delete.
     * </p>
     *
     * @param domainName <p>
     *            The name of the domain entry to delete.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain entry to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The name of the domain entry to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDomainEntryRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your domain
     * entries.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about your
     *         domain entries.
     *         </p>
     */
    public DomainEntry getDomainEntry() {
        return domainEntry;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your domain
     * entries.
     * </p>
     *
     * @param domainEntry <p>
     *            An array of key-value pairs containing information about your
     *            domain entries.
     *            </p>
     */
    public void setDomainEntry(DomainEntry domainEntry) {
        this.domainEntry = domainEntry;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your domain
     * entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainEntry <p>
     *            An array of key-value pairs containing information about your
     *            domain entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDomainEntryRequest withDomainEntry(DomainEntry domainEntry) {
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

        if (obj instanceof DeleteDomainEntryRequest == false)
            return false;
        DeleteDomainEntryRequest other = (DeleteDomainEntryRequest) obj;

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
