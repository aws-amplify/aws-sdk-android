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
 * For an existing AWS CodeBuild build project that has its source code stored
 * in a GitHub or Bitbucket repository, enables AWS CodeBuild to start
 * rebuilding the source code every time a code change is pushed to the
 * repository.
 * </p>
 * <important>
 * <p>
 * If you enable webhooks for an AWS CodeBuild project, and the project is used
 * as a build step in AWS CodePipeline, then two identical builds are created
 * for each commit. One build is triggered through webhooks, and one through AWS
 * CodePipeline. Because billing is on a per-build basis, you are billed for
 * both builds. Therefore, if you are using AWS CodePipeline, we recommend that
 * you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear
 * the Webhook box. For more information, see step 5 in <a href=
 * "https://docs.aws.amazon.com/codebuild/latest/userguide/change-project.html#change-project-console"
 * >Change a Build Project's Settings</a>.
 * </p>
 * </important>
 */
public class CreateWebhookRequest extends AmazonWebServiceRequest implements Serializable {
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
    public CreateWebhookRequest withProjectName(String projectName) {
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
    public CreateWebhookRequest withBranchFilter(String branchFilter) {
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
    public CreateWebhookRequest withFilterGroups(java.util.List<WebhookFilter>... filterGroups) {
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
    public CreateWebhookRequest withFilterGroups(
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
                + ((getFilterGroups() == null) ? 0 : getFilterGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebhookRequest == false)
            return false;
        CreateWebhookRequest other = (CreateWebhookRequest) obj;

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
        if (other.getFilterGroups() == null ^ this.getFilterGroups() == null)
            return false;
        if (other.getFilterGroups() != null
                && other.getFilterGroups().equals(this.getFilterGroups()) == false)
            return false;
        return true;
    }
}
