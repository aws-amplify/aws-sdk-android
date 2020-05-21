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
 * The PublicAccessBlock configuration that you want to apply to this Amazon S3
 * bucket. You can enable the configuration options in any combination. For more
 * information about when Amazon S3 considers a bucket or object public, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
 * >The Meaning of "Public"</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 */
public class PublicAccessBlockConfiguration implements Serializable {
    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists
     * (ACLs) for this bucket and objects in this bucket. Setting this element
     * to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     */
    private Boolean blockPublicAcls;

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and
     * objects in this bucket. Setting this element to <code>TRUE</code> causes
     * Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs
     * and doesn't prevent new public ACLs from being set.
     * </p>
     */
    private Boolean ignorePublicAcls;

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for this
     * bucket. Setting this element to <code>TRUE</code> causes Amazon S3 to
     * reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     */
    private Boolean blockPublicPolicy;

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for
     * this bucket. Setting this element to <code>TRUE</code> restricts access
     * to this bucket to only AWS services and authorized users within this
     * account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies,
     * except that public and cross-account access within any public bucket
     * policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     */
    private Boolean restrictPublicBuckets;

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists
     * (ACLs) for this bucket and objects in this bucket. Setting this element
     * to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 should block public access control
     *         lists (ACLs) for this bucket and objects in this bucket. Setting
     *         this element to <code>TRUE</code> causes the following behavior:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT Bucket acl and PUT Object acl calls fail if the specified ACL
     *         is public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Object calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Bucket calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Enabling this setting doesn't affect existing policies or ACLs.
     *         </p>
     */
    public Boolean isBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists
     * (ACLs) for this bucket and objects in this bucket. Setting this element
     * to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 should block public access control
     *         lists (ACLs) for this bucket and objects in this bucket. Setting
     *         this element to <code>TRUE</code> causes the following behavior:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT Bucket acl and PUT Object acl calls fail if the specified ACL
     *         is public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Object calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Bucket calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Enabling this setting doesn't affect existing policies or ACLs.
     *         </p>
     */
    public Boolean getBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists
     * (ACLs) for this bucket and objects in this bucket. Setting this element
     * to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     *
     * @param blockPublicAcls <p>
     *            Specifies whether Amazon S3 should block public access control
     *            lists (ACLs) for this bucket and objects in this bucket.
     *            Setting this element to <code>TRUE</code> causes the following
     *            behavior:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PUT Bucket acl and PUT Object acl calls fail if the specified
     *            ACL is public.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PUT Object calls fail if the request includes a public ACL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PUT Bucket calls fail if the request includes a public ACL.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Enabling this setting doesn't affect existing policies or
     *            ACLs.
     *            </p>
     */
    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists
     * (ACLs) for this bucket and objects in this bucket. Setting this element
     * to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicAcls <p>
     *            Specifies whether Amazon S3 should block public access control
     *            lists (ACLs) for this bucket and objects in this bucket.
     *            Setting this element to <code>TRUE</code> causes the following
     *            behavior:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PUT Bucket acl and PUT Object acl calls fail if the specified
     *            ACL is public.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PUT Object calls fail if the request includes a public ACL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PUT Bucket calls fail if the request includes a public ACL.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Enabling this setting doesn't affect existing policies or
     *            ACLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicAccessBlockConfiguration withBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and
     * objects in this bucket. Setting this element to <code>TRUE</code> causes
     * Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs
     * and doesn't prevent new public ACLs from being set.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 should ignore public ACLs for this
     *         bucket and objects in this bucket. Setting this element to
     *         <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on
     *         this bucket and objects in this bucket.
     *         </p>
     *         <p>
     *         Enabling this setting doesn't affect the persistence of any
     *         existing ACLs and doesn't prevent new public ACLs from being set.
     *         </p>
     */
    public Boolean isIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and
     * objects in this bucket. Setting this element to <code>TRUE</code> causes
     * Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs
     * and doesn't prevent new public ACLs from being set.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 should ignore public ACLs for this
     *         bucket and objects in this bucket. Setting this element to
     *         <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on
     *         this bucket and objects in this bucket.
     *         </p>
     *         <p>
     *         Enabling this setting doesn't affect the persistence of any
     *         existing ACLs and doesn't prevent new public ACLs from being set.
     *         </p>
     */
    public Boolean getIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and
     * objects in this bucket. Setting this element to <code>TRUE</code> causes
     * Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs
     * and doesn't prevent new public ACLs from being set.
     * </p>
     *
     * @param ignorePublicAcls <p>
     *            Specifies whether Amazon S3 should ignore public ACLs for this
     *            bucket and objects in this bucket. Setting this element to
     *            <code>TRUE</code> causes Amazon S3 to ignore all public ACLs
     *            on this bucket and objects in this bucket.
     *            </p>
     *            <p>
     *            Enabling this setting doesn't affect the persistence of any
     *            existing ACLs and doesn't prevent new public ACLs from being
     *            set.
     *            </p>
     */
    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and
     * objects in this bucket. Setting this element to <code>TRUE</code> causes
     * Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs
     * and doesn't prevent new public ACLs from being set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignorePublicAcls <p>
     *            Specifies whether Amazon S3 should ignore public ACLs for this
     *            bucket and objects in this bucket. Setting this element to
     *            <code>TRUE</code> causes Amazon S3 to ignore all public ACLs
     *            on this bucket and objects in this bucket.
     *            </p>
     *            <p>
     *            Enabling this setting doesn't affect the persistence of any
     *            existing ACLs and doesn't prevent new public ACLs from being
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicAccessBlockConfiguration withIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for this
     * bucket. Setting this element to <code>TRUE</code> causes Amazon S3 to
     * reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 should block public bucket policies
     *         for this bucket. Setting this element to <code>TRUE</code> causes
     *         Amazon S3 to reject calls to PUT Bucket policy if the specified
     *         bucket policy allows public access.
     *         </p>
     *         <p>
     *         Enabling this setting doesn't affect existing bucket policies.
     *         </p>
     */
    public Boolean isBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for this
     * bucket. Setting this element to <code>TRUE</code> causes Amazon S3 to
     * reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 should block public bucket policies
     *         for this bucket. Setting this element to <code>TRUE</code> causes
     *         Amazon S3 to reject calls to PUT Bucket policy if the specified
     *         bucket policy allows public access.
     *         </p>
     *         <p>
     *         Enabling this setting doesn't affect existing bucket policies.
     *         </p>
     */
    public Boolean getBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for this
     * bucket. Setting this element to <code>TRUE</code> causes Amazon S3 to
     * reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     *
     * @param blockPublicPolicy <p>
     *            Specifies whether Amazon S3 should block public bucket
     *            policies for this bucket. Setting this element to
     *            <code>TRUE</code> causes Amazon S3 to reject calls to PUT
     *            Bucket policy if the specified bucket policy allows public
     *            access.
     *            </p>
     *            <p>
     *            Enabling this setting doesn't affect existing bucket policies.
     *            </p>
     */
    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for this
     * bucket. Setting this element to <code>TRUE</code> causes Amazon S3 to
     * reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicPolicy <p>
     *            Specifies whether Amazon S3 should block public bucket
     *            policies for this bucket. Setting this element to
     *            <code>TRUE</code> causes Amazon S3 to reject calls to PUT
     *            Bucket policy if the specified bucket policy allows public
     *            access.
     *            </p>
     *            <p>
     *            Enabling this setting doesn't affect existing bucket policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicAccessBlockConfiguration withBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for
     * this bucket. Setting this element to <code>TRUE</code> restricts access
     * to this bucket to only AWS services and authorized users within this
     * account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies,
     * except that public and cross-account access within any public bucket
     * policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 should restrict public bucket
     *         policies for this bucket. Setting this element to
     *         <code>TRUE</code> restricts access to this bucket to only AWS
     *         services and authorized users within this account if the bucket
     *         has a public policy.
     *         </p>
     *         <p>
     *         Enabling this setting doesn't affect previously stored bucket
     *         policies, except that public and cross-account access within any
     *         public bucket policy, including non-public delegation to specific
     *         accounts, is blocked.
     *         </p>
     */
    public Boolean isRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for
     * this bucket. Setting this element to <code>TRUE</code> restricts access
     * to this bucket to only AWS services and authorized users within this
     * account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies,
     * except that public and cross-account access within any public bucket
     * policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon S3 should restrict public bucket
     *         policies for this bucket. Setting this element to
     *         <code>TRUE</code> restricts access to this bucket to only AWS
     *         services and authorized users within this account if the bucket
     *         has a public policy.
     *         </p>
     *         <p>
     *         Enabling this setting doesn't affect previously stored bucket
     *         policies, except that public and cross-account access within any
     *         public bucket policy, including non-public delegation to specific
     *         accounts, is blocked.
     *         </p>
     */
    public Boolean getRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for
     * this bucket. Setting this element to <code>TRUE</code> restricts access
     * to this bucket to only AWS services and authorized users within this
     * account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies,
     * except that public and cross-account access within any public bucket
     * policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     *
     * @param restrictPublicBuckets <p>
     *            Specifies whether Amazon S3 should restrict public bucket
     *            policies for this bucket. Setting this element to
     *            <code>TRUE</code> restricts access to this bucket to only AWS
     *            services and authorized users within this account if the
     *            bucket has a public policy.
     *            </p>
     *            <p>
     *            Enabling this setting doesn't affect previously stored bucket
     *            policies, except that public and cross-account access within
     *            any public bucket policy, including non-public delegation to
     *            specific accounts, is blocked.
     *            </p>
     */
    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for
     * this bucket. Setting this element to <code>TRUE</code> restricts access
     * to this bucket to only AWS services and authorized users within this
     * account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies,
     * except that public and cross-account access within any public bucket
     * policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restrictPublicBuckets <p>
     *            Specifies whether Amazon S3 should restrict public bucket
     *            policies for this bucket. Setting this element to
     *            <code>TRUE</code> restricts access to this bucket to only AWS
     *            services and authorized users within this account if the
     *            bucket has a public policy.
     *            </p>
     *            <p>
     *            Enabling this setting doesn't affect previously stored bucket
     *            policies, except that public and cross-account access within
     *            any public bucket policy, including non-public delegation to
     *            specific accounts, is blocked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicAccessBlockConfiguration withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
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
        if (getBlockPublicAcls() != null)
            sb.append("BlockPublicAcls: " + getBlockPublicAcls() + ",");
        if (getIgnorePublicAcls() != null)
            sb.append("IgnorePublicAcls: " + getIgnorePublicAcls() + ",");
        if (getBlockPublicPolicy() != null)
            sb.append("BlockPublicPolicy: " + getBlockPublicPolicy() + ",");
        if (getRestrictPublicBuckets() != null)
            sb.append("RestrictPublicBuckets: " + getRestrictPublicBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlockPublicAcls() == null) ? 0 : getBlockPublicAcls().hashCode());
        hashCode = prime * hashCode
                + ((getIgnorePublicAcls() == null) ? 0 : getIgnorePublicAcls().hashCode());
        hashCode = prime * hashCode
                + ((getBlockPublicPolicy() == null) ? 0 : getBlockPublicPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getRestrictPublicBuckets() == null) ? 0 : getRestrictPublicBuckets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicAccessBlockConfiguration == false)
            return false;
        PublicAccessBlockConfiguration other = (PublicAccessBlockConfiguration) obj;

        if (other.getBlockPublicAcls() == null ^ this.getBlockPublicAcls() == null)
            return false;
        if (other.getBlockPublicAcls() != null
                && other.getBlockPublicAcls().equals(this.getBlockPublicAcls()) == false)
            return false;
        if (other.getIgnorePublicAcls() == null ^ this.getIgnorePublicAcls() == null)
            return false;
        if (other.getIgnorePublicAcls() != null
                && other.getIgnorePublicAcls().equals(this.getIgnorePublicAcls()) == false)
            return false;
        if (other.getBlockPublicPolicy() == null ^ this.getBlockPublicPolicy() == null)
            return false;
        if (other.getBlockPublicPolicy() != null
                && other.getBlockPublicPolicy().equals(this.getBlockPublicPolicy()) == false)
            return false;
        if (other.getRestrictPublicBuckets() == null ^ this.getRestrictPublicBuckets() == null)
            return false;
        if (other.getRestrictPublicBuckets() != null
                && other.getRestrictPublicBuckets().equals(this.getRestrictPublicBuckets()) == false)
            return false;
        return true;
    }
}
