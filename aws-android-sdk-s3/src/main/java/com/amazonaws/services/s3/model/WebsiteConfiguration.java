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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies website configuration parameters for an Amazon S3 bucket.
 * </p>
 */
public class WebsiteConfiguration implements Serializable {
    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     */
    private ErrorDocument errorDocument;

    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     */
    private IndexDocument indexDocument;

    /**
     * <p>
     * The redirect behavior for every request to this bucket's website
     * endpoint.
     * </p>
     * <important>
     * <p>
     * If you specify this property, you can't specify any other property.
     * </p>
     * </important>
     */
    private RedirectAllRequestsTo redirectAllRequestsTo;

    /**
     * <p>
     * Rules that define when a redirect is applied and the redirect behavior.
     * </p>
     */
    private java.util.List<RoutingRule> routingRules;

    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     *
     * @return <p>
     *         The name of the error document for the website.
     *         </p>
     */
    public ErrorDocument getErrorDocument() {
        return errorDocument;
    }

    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     *
     * @param errorDocument <p>
     *            The name of the error document for the website.
     *            </p>
     */
    public void setErrorDocument(ErrorDocument errorDocument) {
        this.errorDocument = errorDocument;
    }

    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorDocument <p>
     *            The name of the error document for the website.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebsiteConfiguration withErrorDocument(ErrorDocument errorDocument) {
        this.errorDocument = errorDocument;
        return this;
    }

    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     *
     * @return <p>
     *         The name of the index document for the website.
     *         </p>
     */
    public IndexDocument getIndexDocument() {
        return indexDocument;
    }

    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     *
     * @param indexDocument <p>
     *            The name of the index document for the website.
     *            </p>
     */
    public void setIndexDocument(IndexDocument indexDocument) {
        this.indexDocument = indexDocument;
    }

    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param indexDocument <p>
     *            The name of the index document for the website.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebsiteConfiguration withIndexDocument(IndexDocument indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }

    /**
     * <p>
     * The redirect behavior for every request to this bucket's website
     * endpoint.
     * </p>
     * <important>
     * <p>
     * If you specify this property, you can't specify any other property.
     * </p>
     * </important>
     *
     * @return <p>
     *         The redirect behavior for every request to this bucket's website
     *         endpoint.
     *         </p>
     *         <important>
     *         <p>
     *         If you specify this property, you can't specify any other
     *         property.
     *         </p>
     *         </important>
     */
    public RedirectAllRequestsTo getRedirectAllRequestsTo() {
        return redirectAllRequestsTo;
    }

    /**
     * <p>
     * The redirect behavior for every request to this bucket's website
     * endpoint.
     * </p>
     * <important>
     * <p>
     * If you specify this property, you can't specify any other property.
     * </p>
     * </important>
     *
     * @param redirectAllRequestsTo <p>
     *            The redirect behavior for every request to this bucket's
     *            website endpoint.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify this property, you can't specify any other
     *            property.
     *            </p>
     *            </important>
     */
    public void setRedirectAllRequestsTo(RedirectAllRequestsTo redirectAllRequestsTo) {
        this.redirectAllRequestsTo = redirectAllRequestsTo;
    }

    /**
     * <p>
     * The redirect behavior for every request to this bucket's website
     * endpoint.
     * </p>
     * <important>
     * <p>
     * If you specify this property, you can't specify any other property.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redirectAllRequestsTo <p>
     *            The redirect behavior for every request to this bucket's
     *            website endpoint.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify this property, you can't specify any other
     *            property.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebsiteConfiguration withRedirectAllRequestsTo(
            RedirectAllRequestsTo redirectAllRequestsTo) {
        this.redirectAllRequestsTo = redirectAllRequestsTo;
        return this;
    }

    /**
     * <p>
     * Rules that define when a redirect is applied and the redirect behavior.
     * </p>
     *
     * @return <p>
     *         Rules that define when a redirect is applied and the redirect
     *         behavior.
     *         </p>
     */
    public java.util.List<RoutingRule> getRoutingRules() {
        return routingRules;
    }

    /**
     * <p>
     * Rules that define when a redirect is applied and the redirect behavior.
     * </p>
     *
     * @param routingRules <p>
     *            Rules that define when a redirect is applied and the redirect
     *            behavior.
     *            </p>
     */
    public void setRoutingRules(java.util.Collection<RoutingRule> routingRules) {
        if (routingRules == null) {
            this.routingRules = null;
            return;
        }

        this.routingRules = new java.util.ArrayList<RoutingRule>(routingRules);
    }

    /**
     * <p>
     * Rules that define when a redirect is applied and the redirect behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingRules <p>
     *            Rules that define when a redirect is applied and the redirect
     *            behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebsiteConfiguration withRoutingRules(RoutingRule... routingRules) {
        if (getRoutingRules() == null) {
            this.routingRules = new java.util.ArrayList<RoutingRule>(routingRules.length);
        }
        for (RoutingRule value : routingRules) {
            this.routingRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Rules that define when a redirect is applied and the redirect behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingRules <p>
     *            Rules that define when a redirect is applied and the redirect
     *            behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebsiteConfiguration withRoutingRules(java.util.Collection<RoutingRule> routingRules) {
        setRoutingRules(routingRules);
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
        if (getErrorDocument() != null)
            sb.append("ErrorDocument: " + getErrorDocument() + ",");
        if (getIndexDocument() != null)
            sb.append("IndexDocument: " + getIndexDocument() + ",");
        if (getRedirectAllRequestsTo() != null)
            sb.append("RedirectAllRequestsTo: " + getRedirectAllRequestsTo() + ",");
        if (getRoutingRules() != null)
            sb.append("RoutingRules: " + getRoutingRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getErrorDocument() == null) ? 0 : getErrorDocument().hashCode());
        hashCode = prime * hashCode
                + ((getIndexDocument() == null) ? 0 : getIndexDocument().hashCode());
        hashCode = prime
                * hashCode
                + ((getRedirectAllRequestsTo() == null) ? 0 : getRedirectAllRequestsTo().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingRules() == null) ? 0 : getRoutingRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebsiteConfiguration == false)
            return false;
        WebsiteConfiguration other = (WebsiteConfiguration) obj;

        if (other.getErrorDocument() == null ^ this.getErrorDocument() == null)
            return false;
        if (other.getErrorDocument() != null
                && other.getErrorDocument().equals(this.getErrorDocument()) == false)
            return false;
        if (other.getIndexDocument() == null ^ this.getIndexDocument() == null)
            return false;
        if (other.getIndexDocument() != null
                && other.getIndexDocument().equals(this.getIndexDocument()) == false)
            return false;
        if (other.getRedirectAllRequestsTo() == null ^ this.getRedirectAllRequestsTo() == null)
            return false;
        if (other.getRedirectAllRequestsTo() != null
                && other.getRedirectAllRequestsTo().equals(this.getRedirectAllRequestsTo()) == false)
            return false;
        if (other.getRoutingRules() == null ^ this.getRoutingRules() == null)
            return false;
        if (other.getRoutingRules() != null
                && other.getRoutingRules().equals(this.getRoutingRules()) == false)
            return false;
        return true;
    }
}
