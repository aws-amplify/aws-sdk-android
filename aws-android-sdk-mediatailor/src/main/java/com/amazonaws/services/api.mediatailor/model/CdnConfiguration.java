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

package com.amazonaws.services.api.mediatailor.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration for using a content delivery network (CDN), like Amazon
 * CloudFront, for content and ad segment management.
 * </p>
 */
public class CdnConfiguration implements Serializable {
    /**
     * <p>
     * A non-default content delivery network (CDN) to serve ad segments. By
     * default, AWS Elemental MediaTailor uses Amazon CloudFront with default
     * cache settings as its CDN for ad segments. To set up an alternate CDN,
     * create a rule in your CDN for the following origin:
     * ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's name
     * in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a
     * manifest, it reports your CDN as the source for ad segments.
     * </p>
     */
    private String adSegmentUrlPrefix;

    /**
     * <p>
     * A content delivery network (CDN) to cache content segments, so that
     * content requests don’t always have to go to the origin server. First,
     * create a rule in your CDN for the content segment origin server. Then
     * specify the rule's name in this ContentSegmentUrlPrefix. When AWS
     * Elemental MediaTailor serves a manifest, it reports your CDN as the
     * source for content segments.
     * </p>
     */
    private String contentSegmentUrlPrefix;

    /**
     * <p>
     * A non-default content delivery network (CDN) to serve ad segments. By
     * default, AWS Elemental MediaTailor uses Amazon CloudFront with default
     * cache settings as its CDN for ad segments. To set up an alternate CDN,
     * create a rule in your CDN for the following origin:
     * ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's name
     * in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a
     * manifest, it reports your CDN as the source for ad segments.
     * </p>
     *
     * @return <p>
     *         A non-default content delivery network (CDN) to serve ad
     *         segments. By default, AWS Elemental MediaTailor uses Amazon
     *         CloudFront with default cache settings as its CDN for ad
     *         segments. To set up an alternate CDN, create a rule in your CDN
     *         for the following origin:
     *         ads.mediatailor.&lt;region>.amazonaws.com. Then specify the
     *         rule's name in this AdSegmentUrlPrefix. When AWS Elemental
     *         MediaTailor serves a manifest, it reports your CDN as the source
     *         for ad segments.
     *         </p>
     */
    public String getAdSegmentUrlPrefix() {
        return adSegmentUrlPrefix;
    }

    /**
     * <p>
     * A non-default content delivery network (CDN) to serve ad segments. By
     * default, AWS Elemental MediaTailor uses Amazon CloudFront with default
     * cache settings as its CDN for ad segments. To set up an alternate CDN,
     * create a rule in your CDN for the following origin:
     * ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's name
     * in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a
     * manifest, it reports your CDN as the source for ad segments.
     * </p>
     *
     * @param adSegmentUrlPrefix <p>
     *            A non-default content delivery network (CDN) to serve ad
     *            segments. By default, AWS Elemental MediaTailor uses Amazon
     *            CloudFront with default cache settings as its CDN for ad
     *            segments. To set up an alternate CDN, create a rule in your
     *            CDN for the following origin:
     *            ads.mediatailor.&lt;region>.amazonaws.com. Then specify the
     *            rule's name in this AdSegmentUrlPrefix. When AWS Elemental
     *            MediaTailor serves a manifest, it reports your CDN as the
     *            source for ad segments.
     *            </p>
     */
    public void setAdSegmentUrlPrefix(String adSegmentUrlPrefix) {
        this.adSegmentUrlPrefix = adSegmentUrlPrefix;
    }

    /**
     * <p>
     * A non-default content delivery network (CDN) to serve ad segments. By
     * default, AWS Elemental MediaTailor uses Amazon CloudFront with default
     * cache settings as its CDN for ad segments. To set up an alternate CDN,
     * create a rule in your CDN for the following origin:
     * ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's name
     * in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a
     * manifest, it reports your CDN as the source for ad segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adSegmentUrlPrefix <p>
     *            A non-default content delivery network (CDN) to serve ad
     *            segments. By default, AWS Elemental MediaTailor uses Amazon
     *            CloudFront with default cache settings as its CDN for ad
     *            segments. To set up an alternate CDN, create a rule in your
     *            CDN for the following origin:
     *            ads.mediatailor.&lt;region>.amazonaws.com. Then specify the
     *            rule's name in this AdSegmentUrlPrefix. When AWS Elemental
     *            MediaTailor serves a manifest, it reports your CDN as the
     *            source for ad segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CdnConfiguration withAdSegmentUrlPrefix(String adSegmentUrlPrefix) {
        this.adSegmentUrlPrefix = adSegmentUrlPrefix;
        return this;
    }

    /**
     * <p>
     * A content delivery network (CDN) to cache content segments, so that
     * content requests don’t always have to go to the origin server. First,
     * create a rule in your CDN for the content segment origin server. Then
     * specify the rule's name in this ContentSegmentUrlPrefix. When AWS
     * Elemental MediaTailor serves a manifest, it reports your CDN as the
     * source for content segments.
     * </p>
     *
     * @return <p>
     *         A content delivery network (CDN) to cache content segments, so
     *         that content requests don’t always have to go to the origin
     *         server. First, create a rule in your CDN for the content segment
     *         origin server. Then specify the rule's name in this
     *         ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a
     *         manifest, it reports your CDN as the source for content segments.
     *         </p>
     */
    public String getContentSegmentUrlPrefix() {
        return contentSegmentUrlPrefix;
    }

    /**
     * <p>
     * A content delivery network (CDN) to cache content segments, so that
     * content requests don’t always have to go to the origin server. First,
     * create a rule in your CDN for the content segment origin server. Then
     * specify the rule's name in this ContentSegmentUrlPrefix. When AWS
     * Elemental MediaTailor serves a manifest, it reports your CDN as the
     * source for content segments.
     * </p>
     *
     * @param contentSegmentUrlPrefix <p>
     *            A content delivery network (CDN) to cache content segments, so
     *            that content requests don’t always have to go to the origin
     *            server. First, create a rule in your CDN for the content
     *            segment origin server. Then specify the rule's name in this
     *            ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves
     *            a manifest, it reports your CDN as the source for content
     *            segments.
     *            </p>
     */
    public void setContentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
        this.contentSegmentUrlPrefix = contentSegmentUrlPrefix;
    }

    /**
     * <p>
     * A content delivery network (CDN) to cache content segments, so that
     * content requests don’t always have to go to the origin server. First,
     * create a rule in your CDN for the content segment origin server. Then
     * specify the rule's name in this ContentSegmentUrlPrefix. When AWS
     * Elemental MediaTailor serves a manifest, it reports your CDN as the
     * source for content segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentSegmentUrlPrefix <p>
     *            A content delivery network (CDN) to cache content segments, so
     *            that content requests don’t always have to go to the origin
     *            server. First, create a rule in your CDN for the content
     *            segment origin server. Then specify the rule's name in this
     *            ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves
     *            a manifest, it reports your CDN as the source for content
     *            segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CdnConfiguration withContentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
        this.contentSegmentUrlPrefix = contentSegmentUrlPrefix;
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
        if (getAdSegmentUrlPrefix() != null)
            sb.append("AdSegmentUrlPrefix: " + getAdSegmentUrlPrefix() + ",");
        if (getContentSegmentUrlPrefix() != null)
            sb.append("ContentSegmentUrlPrefix: " + getContentSegmentUrlPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdSegmentUrlPrefix() == null) ? 0 : getAdSegmentUrlPrefix().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentSegmentUrlPrefix() == null) ? 0 : getContentSegmentUrlPrefix()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CdnConfiguration == false)
            return false;
        CdnConfiguration other = (CdnConfiguration) obj;

        if (other.getAdSegmentUrlPrefix() == null ^ this.getAdSegmentUrlPrefix() == null)
            return false;
        if (other.getAdSegmentUrlPrefix() != null
                && other.getAdSegmentUrlPrefix().equals(this.getAdSegmentUrlPrefix()) == false)
            return false;
        if (other.getContentSegmentUrlPrefix() == null ^ this.getContentSegmentUrlPrefix() == null)
            return false;
        if (other.getContentSegmentUrlPrefix() != null
                && other.getContentSegmentUrlPrefix().equals(this.getContentSegmentUrlPrefix()) == false)
            return false;
        return true;
    }
}
