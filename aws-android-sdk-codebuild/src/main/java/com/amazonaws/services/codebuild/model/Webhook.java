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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a webhook that connects repository events to a build
 * project in AWS CodeBuild.
 * </p>
 */
public class Webhook implements Serializable {
    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String url;

    /**
     * <p>
     * The AWS CodeBuild endpoint where webhook events are sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String payloadUrl;

    /**
     * <p>
     * The secret token of the associated repository.
     * </p>
     * <note>
     * <p>
     * A Bitbucket webhook does not support <code>secret</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String secret;

    /**
     * <p>
     * A regular expression used to determine which repository branches are
     * built when a webhook is triggered. If the name of a branch matches the
     * regular expression, then it is built. If <code>branchFilter</code> is
     * empty, then all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of
     * <code>branchFilter</code>.
     * </p>
     * </note>
     */
    private String branchFilter;

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to
     * determine which webhooks are triggered. At least one
     * <code>WebhookFilter</code> in the array must specify <code>EVENT</code>
     * as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the
     * <code>filterGroups</code> array must pass. For a filter group to pass,
     * each of its filters must pass.
     * </p>
     */
    private java.util.List<java.util.List<WebhookFilter>> filterGroups;

    /**
     * <p>
     * A timestamp that indicates the last time a repository's secret token was
     * modified.
     * </p>
     */
    private java.util.Date lastModifiedSecret;

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The URL to the webhook.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param url <p>
     *            The URL to the webhook.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param url <p>
     *            The URL to the webhook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * The AWS CodeBuild endpoint where webhook events are sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The AWS CodeBuild endpoint where webhook events are sent.
     *         </p>
     */
    public String getPayloadUrl() {
        return payloadUrl;
    }

    /**
     * <p>
     * The AWS CodeBuild endpoint where webhook events are sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param payloadUrl <p>
     *            The AWS CodeBuild endpoint where webhook events are sent.
     *            </p>
     */
    public void setPayloadUrl(String payloadUrl) {
        this.payloadUrl = payloadUrl;
    }

    /**
     * <p>
     * The AWS CodeBuild endpoint where webhook events are sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param payloadUrl <p>
     *            The AWS CodeBuild endpoint where webhook events are sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withPayloadUrl(String payloadUrl) {
        this.payloadUrl = payloadUrl;
        return this;
    }

    /**
     * <p>
     * The secret token of the associated repository.
     * </p>
     * <note>
     * <p>
     * A Bitbucket webhook does not support <code>secret</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The secret token of the associated repository.
     *         </p>
     *         <note>
     *         <p>
     *         A Bitbucket webhook does not support <code>secret</code>.
     *         </p>
     *         </note>
     */
    public String getSecret() {
        return secret;
    }

    /**
     * <p>
     * The secret token of the associated repository.
     * </p>
     * <note>
     * <p>
     * A Bitbucket webhook does not support <code>secret</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param secret <p>
     *            The secret token of the associated repository.
     *            </p>
     *            <note>
     *            <p>
     *            A Bitbucket webhook does not support <code>secret</code>.
     *            </p>
     *            </note>
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * <p>
     * The secret token of the associated repository.
     * </p>
     * <note>
     * <p>
     * A Bitbucket webhook does not support <code>secret</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param secret <p>
     *            The secret token of the associated repository.
     *            </p>
     *            <note>
     *            <p>
     *            A Bitbucket webhook does not support <code>secret</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are
     * built when a webhook is triggered. If the name of a branch matches the
     * regular expression, then it is built. If <code>branchFilter</code> is
     * empty, then all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of
     * <code>branchFilter</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A regular expression used to determine which repository branches
     *         are built when a webhook is triggered. If the name of a branch
     *         matches the regular expression, then it is built. If
     *         <code>branchFilter</code> is empty, then all branches are built.
     *         </p>
     *         <note>
     *         <p>
     *         It is recommended that you use <code>filterGroups</code> instead
     *         of <code>branchFilter</code>.
     *         </p>
     *         </note>
     */
    public String getBranchFilter() {
        return branchFilter;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are
     * built when a webhook is triggered. If the name of a branch matches the
     * regular expression, then it is built. If <code>branchFilter</code> is
     * empty, then all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of
     * <code>branchFilter</code>.
     * </p>
     * </note>
     *
     * @param branchFilter <p>
     *            A regular expression used to determine which repository
     *            branches are built when a webhook is triggered. If the name of
     *            a branch matches the regular expression, then it is built. If
     *            <code>branchFilter</code> is empty, then all branches are
     *            built.
     *            </p>
     *            <note>
     *            <p>
     *            It is recommended that you use <code>filterGroups</code>
     *            instead of <code>branchFilter</code>.
     *            </p>
     *            </note>
     */
    public void setBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are
     * built when a webhook is triggered. If the name of a branch matches the
     * regular expression, then it is built. If <code>branchFilter</code> is
     * empty, then all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of
     * <code>branchFilter</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branchFilter <p>
     *            A regular expression used to determine which repository
     *            branches are built when a webhook is triggered. If the name of
     *            a branch matches the regular expression, then it is built. If
     *            <code>branchFilter</code> is empty, then all branches are
     *            built.
     *            </p>
     *            <note>
     *            <p>
     *            It is recommended that you use <code>filterGroups</code>
     *            instead of <code>branchFilter</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
        return this;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to
     * determine which webhooks are triggered. At least one
     * <code>WebhookFilter</code> in the array must specify <code>EVENT</code>
     * as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the
     * <code>filterGroups</code> array must pass. For a filter group to pass,
     * each of its filters must pass.
     * </p>
     *
     * @return <p>
     *         An array of arrays of <code>WebhookFilter</code> objects used to
     *         determine which webhooks are triggered. At least one
     *         <code>WebhookFilter</code> in the array must specify
     *         <code>EVENT</code> as its <code>type</code>.
     *         </p>
     *         <p>
     *         For a build to be triggered, at least one filter group in the
     *         <code>filterGroups</code> array must pass. For a filter group to
     *         pass, each of its filters must pass.
     *         </p>
     */
    public java.util.List<java.util.List<WebhookFilter>> getFilterGroups() {
        return filterGroups;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to
     * determine which webhooks are triggered. At least one
     * <code>WebhookFilter</code> in the array must specify <code>EVENT</code>
     * as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the
     * <code>filterGroups</code> array must pass. For a filter group to pass,
     * each of its filters must pass.
     * </p>
     *
     * @param filterGroups <p>
     *            An array of arrays of <code>WebhookFilter</code> objects used
     *            to determine which webhooks are triggered. At least one
     *            <code>WebhookFilter</code> in the array must specify
     *            <code>EVENT</code> as its <code>type</code>.
     *            </p>
     *            <p>
     *            For a build to be triggered, at least one filter group in the
     *            <code>filterGroups</code> array must pass. For a filter group
     *            to pass, each of its filters must pass.
     *            </p>
     */
    public void setFilterGroups(java.util.Collection<java.util.List<WebhookFilter>> filterGroups) {
        if (filterGroups == null) {
            this.filterGroups = null;
            return;
        }

        this.filterGroups = new java.util.ArrayList<java.util.List<WebhookFilter>>(filterGroups);
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to
     * determine which webhooks are triggered. At least one
     * <code>WebhookFilter</code> in the array must specify <code>EVENT</code>
     * as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the
     * <code>filterGroups</code> array must pass. For a filter group to pass,
     * each of its filters must pass.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterGroups <p>
     *            An array of arrays of <code>WebhookFilter</code> objects used
     *            to determine which webhooks are triggered. At least one
     *            <code>WebhookFilter</code> in the array must specify
     *            <code>EVENT</code> as its <code>type</code>.
     *            </p>
     *            <p>
     *            For a build to be triggered, at least one filter group in the
     *            <code>filterGroups</code> array must pass. For a filter group
     *            to pass, each of its filters must pass.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withFilterGroups(java.util.List<WebhookFilter>... filterGroups) {
        if (getFilterGroups() == null) {
            this.filterGroups = new java.util.ArrayList<java.util.List<WebhookFilter>>(
                    filterGroups.length);
        }
        for (java.util.List<WebhookFilter> value : filterGroups) {
            this.filterGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to
     * determine which webhooks are triggered. At least one
     * <code>WebhookFilter</code> in the array must specify <code>EVENT</code>
     * as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the
     * <code>filterGroups</code> array must pass. For a filter group to pass,
     * each of its filters must pass.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterGroups <p>
     *            An array of arrays of <code>WebhookFilter</code> objects used
     *            to determine which webhooks are triggered. At least one
     *            <code>WebhookFilter</code> in the array must specify
     *            <code>EVENT</code> as its <code>type</code>.
     *            </p>
     *            <p>
     *            For a build to be triggered, at least one filter group in the
     *            <code>filterGroups</code> array must pass. For a filter group
     *            to pass, each of its filters must pass.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withFilterGroups(java.util.Collection<java.util.List<WebhookFilter>> filterGroups) {
        setFilterGroups(filterGroups);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates the last time a repository's secret token was
     * modified.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates the last time a repository's secret
     *         token was modified.
     *         </p>
     */
    public java.util.Date getLastModifiedSecret() {
        return lastModifiedSecret;
    }

    /**
     * <p>
     * A timestamp that indicates the last time a repository's secret token was
     * modified.
     * </p>
     *
     * @param lastModifiedSecret <p>
     *            A timestamp that indicates the last time a repository's secret
     *            token was modified.
     *            </p>
     */
    public void setLastModifiedSecret(java.util.Date lastModifiedSecret) {
        this.lastModifiedSecret = lastModifiedSecret;
    }

    /**
     * <p>
     * A timestamp that indicates the last time a repository's secret token was
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedSecret <p>
     *            A timestamp that indicates the last time a repository's secret
     *            token was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Webhook withLastModifiedSecret(java.util.Date lastModifiedSecret) {
        this.lastModifiedSecret = lastModifiedSecret;
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
        if (getUrl() != null)
            sb.append("url: " + getUrl() + ",");
        if (getPayloadUrl() != null)
            sb.append("payloadUrl: " + getPayloadUrl() + ",");
        if (getSecret() != null)
            sb.append("secret: " + getSecret() + ",");
        if (getBranchFilter() != null)
            sb.append("branchFilter: " + getBranchFilter() + ",");
        if (getFilterGroups() != null)
            sb.append("filterGroups: " + getFilterGroups() + ",");
        if (getLastModifiedSecret() != null)
            sb.append("lastModifiedSecret: " + getLastModifiedSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getPayloadUrl() == null) ? 0 : getPayloadUrl().hashCode());
        hashCode = prime * hashCode + ((getSecret() == null) ? 0 : getSecret().hashCode());
        hashCode = prime * hashCode
                + ((getBranchFilter() == null) ? 0 : getBranchFilter().hashCode());
        hashCode = prime * hashCode
                + ((getFilterGroups() == null) ? 0 : getFilterGroups().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedSecret() == null) ? 0 : getLastModifiedSecret().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Webhook == false)
            return false;
        Webhook other = (Webhook) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getPayloadUrl() == null ^ this.getPayloadUrl() == null)
            return false;
        if (other.getPayloadUrl() != null
                && other.getPayloadUrl().equals(this.getPayloadUrl()) == false)
            return false;
        if (other.getSecret() == null ^ this.getSecret() == null)
            return false;
        if (other.getSecret() != null && other.getSecret().equals(this.getSecret()) == false)
            return false;
        if (other.getBranchFilter() == null ^ this.getBranchFilter() == null)
            return false;
        if (other.getBranchFilter() != null
                && other.getBranchFilter().equals(this.getBranchFilter()) == false)
            return false;
        if (other.getFilterGroups() == null ^ this.getFilterGroups() == null)
            return false;
        if (other.getFilterGroups() != null
                && other.getFilterGroups().equals(this.getFilterGroups()) == false)
            return false;
        if (other.getLastModifiedSecret() == null ^ this.getLastModifiedSecret() == null)
            return false;
        if (other.getLastModifiedSecret() != null
                && other.getLastModifiedSecret().equals(this.getLastModifiedSecret()) == false)
            return false;
        return true;
    }
}
