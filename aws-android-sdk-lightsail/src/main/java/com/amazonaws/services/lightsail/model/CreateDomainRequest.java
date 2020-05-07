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
 * Creates a domain resource for the specified domain (e.g., example.com).
 * </p>
 * <p>
 * The <code>create domain</code> operation supports tag-based access control
 * via request tags. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain name to manage (e.g., <code>example.com</code>).
     * </p>
     * <note>
     * <p>
     * You cannot register a new domain name using Lightsail. You must register
     * a domain name using Amazon Route 53 or another domain name registrar. If
     * you have already registered your domain, you can enter its name in this
     * parameter to manage the DNS records for that domain.
     * </p>
     * </note>
     */
    private String domainName;

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The domain name to manage (e.g., <code>example.com</code>).
     * </p>
     * <note>
     * <p>
     * You cannot register a new domain name using Lightsail. You must register
     * a domain name using Amazon Route 53 or another domain name registrar. If
     * you have already registered your domain, you can enter its name in this
     * parameter to manage the DNS records for that domain.
     * </p>
     * </note>
     *
     * @return <p>
     *         The domain name to manage (e.g., <code>example.com</code>).
     *         </p>
     *         <note>
     *         <p>
     *         You cannot register a new domain name using Lightsail. You must
     *         register a domain name using Amazon Route 53 or another domain
     *         name registrar. If you have already registered your domain, you
     *         can enter its name in this parameter to manage the DNS records
     *         for that domain.
     *         </p>
     *         </note>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name to manage (e.g., <code>example.com</code>).
     * </p>
     * <note>
     * <p>
     * You cannot register a new domain name using Lightsail. You must register
     * a domain name using Amazon Route 53 or another domain name registrar. If
     * you have already registered your domain, you can enter its name in this
     * parameter to manage the DNS records for that domain.
     * </p>
     * </note>
     *
     * @param domainName <p>
     *            The domain name to manage (e.g., <code>example.com</code>).
     *            </p>
     *            <note>
     *            <p>
     *            You cannot register a new domain name using Lightsail. You
     *            must register a domain name using Amazon Route 53 or another
     *            domain name registrar. If you have already registered your
     *            domain, you can enter its name in this parameter to manage the
     *            DNS records for that domain.
     *            </p>
     *            </note>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name to manage (e.g., <code>example.com</code>).
     * </p>
     * <note>
     * <p>
     * You cannot register a new domain name using Lightsail. You must register
     * a domain name using Amazon Route 53 or another domain name registrar. If
     * you have already registered your domain, you can enter its name in this
     * parameter to manage the DNS records for that domain.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name to manage (e.g., <code>example.com</code>).
     *            </p>
     *            <note>
     *            <p>
     *            You cannot register a new domain name using Lightsail. You
     *            must register a domain name using Amazon Route 53 or another
     *            domain name registrar. If you have already registered your
     *            domain, you can enter its name in this parameter to manage the
     *            DNS records for that domain.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @return <p>
     *         The tag keys and optional values to add to the resource during
     *         create.
     *         </p>
     *         <p>
     *         To tag a resource after it has been created, see the
     *         <code>tag resource</code> operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
