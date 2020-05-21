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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the webhook associated with an AWS CodeBuild build project.
 * </p>
 * <note>
 * <p>
 * If you use Bitbucket for your repository, <code>rotateSecret</code> is
 * ignored.
 * </p>
 * </note>
 */
public class UpdateWebhookRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9\-_]{1,254}<br/>
     */
    private String projectName;

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
     * A boolean value that specifies whether the associated GitHub repository's
     * secret token should be updated. If you use Bitbucket for your repository,
     * <code>rotateSecret</code> is ignored.
     * </p>
     */
    private Boolean rotateSecret;

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to
     * determine if a webhook event can trigger a build. A filter group must
     * contain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     */
    private java.util.List<java.util.List<WebhookFilter>> filterGroups;

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9\-_]{1,254}<br/>
     *
     * @return <p>
     *         The name of the AWS CodeBuild project.
     *         </p>
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9\-_]{1,254}<br/>
     *
     * @param projectName <p>
     *            The name of the AWS CodeBuild project.
     *            </p>
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9\-_]{1,254}<br/>
     *
     * @param projectName <p>
     *            The name of the AWS CodeBuild project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWebhookRequest withProjectName(String projectName) {
        this.projectName = projectName;
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
    public UpdateWebhookRequest withBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's
     * secret token should be updated. If you use Bitbucket for your repository,
     * <code>rotateSecret</code> is ignored.
     * </p>
     *
     * @return <p>
     *         A boolean value that specifies whether the associated GitHub
     *         repository's secret token should be updated. If you use Bitbucket
     *         for your repository, <code>rotateSecret</code> is ignored.
     *         </p>
     */
    public Boolean isRotateSecret() {
        return rotateSecret;
    }

    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's
     * secret token should be updated. If you use Bitbucket for your repository,
     * <code>rotateSecret</code> is ignored.
     * </p>
     *
     * @return <p>
     *         A boolean value that specifies whether the associated GitHub
     *         repository's secret token should be updated. If you use Bitbucket
     *         for your repository, <code>rotateSecret</code> is ignored.
     *         </p>
     */
    public Boolean getRotateSecret() {
        return rotateSecret;
    }

    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's
     * secret token should be updated. If you use Bitbucket for your repository,
     * <code>rotateSecret</code> is ignored.
     * </p>
     *
     * @param rotateSecret <p>
     *            A boolean value that specifies whether the associated GitHub
     *            repository's secret token should be updated. If you use
     *            Bitbucket for your repository, <code>rotateSecret</code> is
     *            ignored.
     *            </p>
     */
    public void setRotateSecret(Boolean rotateSecret) {
        this.rotateSecret = rotateSecret;
    }

    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's
     * secret token should be updated. If you use Bitbucket for your repository,
     * <code>rotateSecret</code> is ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rotateSecret <p>
     *            A boolean value that specifies whether the associated GitHub
     *            repository's secret token should be updated. If you use
     *            Bitbucket for your repository, <code>rotateSecret</code> is
     *            ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWebhookRequest withRotateSecret(Boolean rotateSecret) {
        this.rotateSecret = rotateSecret;
        return this;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to
     * determine if a webhook event can trigger a build. A filter group must
     * contain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     *
     * @return <p>
     *         An array of arrays of <code>WebhookFilter</code> objects used to
     *         determine if a webhook event can trigger a build. A filter group
     *         must contain at least one <code>EVENT</code>
     *         <code>WebhookFilter</code>.
     *         </p>
     */
    public java.util.List<java.util.List<WebhookFilter>> getFilterGroups() {
        return filterGroups;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to
     * determine if a webhook event can trigger a build. A filter group must
     * contain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     *
     * @param filterGroups <p>
     *            An array of arrays of <code>WebhookFilter</code> objects used
     *            to determine if a webhook event can trigger a build. A filter
     *            group must contain at least one <code>EVENT</code>
     *            <code>WebhookFilter</code>.
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
     * determine if a webhook event can trigger a build. A filter group must
     * contain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterGroups <p>
     *            An array of arrays of <code>WebhookFilter</code> objects used
     *            to determine if a webhook event can trigger a build. A filter
     *            group must contain at least one <code>EVENT</code>
     *            <code>WebhookFilter</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWebhookRequest withFilterGroups(java.util.List<WebhookFilter>... filterGroups) {
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
     * determine if a webhook event can trigger a build. A filter group must
     * contain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterGroups <p>
     *            An array of arrays of <code>WebhookFilter</code> objects used
     *            to determine if a webhook event can trigger a build. A filter
     *            group must contain at least one <code>EVENT</code>
     *            <code>WebhookFilter</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWebhookRequest withFilterGroups(
            java.util.Collection<java.util.List<WebhookFilter>> filterGroups) {
        setFilterGroups(filterGroups);
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
        if (getProjectName() != null)
            sb.append("projectName: " + getProjectName() + ",");
        if (getBranchFilter() != null)
            sb.append("branchFilter: " + getBranchFilter() + ",");
        if (getRotateSecret() != null)
            sb.append("rotateSecret: " + getRotateSecret() + ",");
        if (getFilterGroups() != null)
            sb.append("filterGroups: " + getFilterGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode
                + ((getBranchFilter() == null) ? 0 : getBranchFilter().hashCode());
        hashCode = prime * hashCode
                + ((getRotateSecret() == null) ? 0 : getRotateSecret().hashCode());
        hashCode = prime * hashCode
                + ((getFilterGroups() == null) ? 0 : getFilterGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWebhookRequest == false)
            return false;
        UpdateWebhookRequest other = (UpdateWebhookRequest) obj;

        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null
                && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getBranchFilter() == null ^ this.getBranchFilter() == null)
            return false;
        if (other.getBranchFilter() != null
                && other.getBranchFilter().equals(this.getBranchFilter()) == false)
            return false;
        if (other.getRotateSecret() == null ^ this.getRotateSecret() == null)
            return false;
        if (other.getRotateSecret() != null
                && other.getRotateSecret().equals(this.getRotateSecret()) == false)
            return false;
        if (other.getFilterGroups() == null ^ this.getFilterGroups() == null)
            return false;
        if (other.getFilterGroups() != null
                && other.getFilterGroups().equals(this.getFilterGroups()) == false)
            return false;
        return true;
    }
}
