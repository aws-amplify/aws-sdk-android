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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

/**
 * <p>
 * The details of a repository stored in AWS CodeArtifact. A CodeArtifact
 * repository contains a set of package versions, each of which maps to a set of
 * assets. Repositories are polyglot—a single repository can contain packages of
 * any supported type. Each repository exposes endpoints for fetching and
 * publishing packages using tools like the <code>npm</code> CLI, the Maven CLI
 * (<code>mvn</code>), and <code>pip</code>. You can create up to 100
 * repositories per AWS account.
 * </p>
 */
public class RepositoryDescription implements Serializable {
    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     */
    private String name;

    /**
     * <p>
     * The 12-digit account number of the AWS account that manages the
     * repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String administratorAccount;

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     */
    private String domainName;

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that
     * contains the repository. It does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String domainOwner;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String arn;

    /**
     * <p>
     * A text description of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     */
    private String description;

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The
     * order of the upstream repositories in the list determines their priority
     * order when AWS CodeArtifact looks for a requested package version. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     * >Working with upstream repositories</a>.
     * </p>
     */
    private java.util.List<UpstreamRepositoryInfo> upstreams;

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     */
    private java.util.List<RepositoryExternalConnectionInfo> externalConnections;

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @return <p>
     *         The name of the repository.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param name <p>
     *            The name of the repository.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param name <p>
     *            The name of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that manages the
     * repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The 12-digit account number of the AWS account that manages the
     *         repository.
     *         </p>
     */
    public String getAdministratorAccount() {
        return administratorAccount;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that manages the
     * repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param administratorAccount <p>
     *            The 12-digit account number of the AWS account that manages
     *            the repository.
     *            </p>
     */
    public void setAdministratorAccount(String administratorAccount) {
        this.administratorAccount = administratorAccount;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that manages the
     * repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param administratorAccount <p>
     *            The 12-digit account number of the AWS account that manages
     *            the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withAdministratorAccount(String administratorAccount) {
        this.administratorAccount = administratorAccount;
        return this;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @return <p>
     *         The name of the domain that contains the repository.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domainName <p>
     *            The name of the domain that contains the repository.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domainName <p>
     *            The name of the domain that contains the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that
     * contains the repository. It does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The 12-digit account number of the AWS account that owns the
     *         domain that contains the repository. It does not include dashes
     *         or spaces.
     *         </p>
     */
    public String getDomainOwner() {
        return domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that
     * contains the repository. It does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param domainOwner <p>
     *            The 12-digit account number of the AWS account that owns the
     *            domain that contains the repository. It does not include
     *            dashes or spaces.
     *            </p>
     */
    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that
     * contains the repository. It does not include dashes or spaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param domainOwner <p>
     *            The 12-digit account number of the AWS account that owns the
     *            domain that contains the repository. It does not include
     *            dashes or spaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the repository.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the repository.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * A text description of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @return <p>
     *         A text description of the repository.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A text description of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @param description <p>
     *            A text description of the repository.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @param description <p>
     *            A text description of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The
     * order of the upstream repositories in the list determines their priority
     * order when AWS CodeArtifact looks for a requested package version. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     * >Working with upstream repositories</a>.
     * </p>
     *
     * @return <p>
     *         A list of upstream repositories to associate with the repository.
     *         The order of the upstream repositories in the list determines
     *         their priority order when AWS CodeArtifact looks for a requested
     *         package version. For more information, see <a href=
     *         "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     *         >Working with upstream repositories</a>.
     *         </p>
     */
    public java.util.List<UpstreamRepositoryInfo> getUpstreams() {
        return upstreams;
    }

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The
     * order of the upstream repositories in the list determines their priority
     * order when AWS CodeArtifact looks for a requested package version. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     * >Working with upstream repositories</a>.
     * </p>
     *
     * @param upstreams <p>
     *            A list of upstream repositories to associate with the
     *            repository. The order of the upstream repositories in the list
     *            determines their priority order when AWS CodeArtifact looks
     *            for a requested package version. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     *            >Working with upstream repositories</a>.
     *            </p>
     */
    public void setUpstreams(java.util.Collection<UpstreamRepositoryInfo> upstreams) {
        if (upstreams == null) {
            this.upstreams = null;
            return;
        }

        this.upstreams = new java.util.ArrayList<UpstreamRepositoryInfo>(upstreams);
    }

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The
     * order of the upstream repositories in the list determines their priority
     * order when AWS CodeArtifact looks for a requested package version. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     * >Working with upstream repositories</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upstreams <p>
     *            A list of upstream repositories to associate with the
     *            repository. The order of the upstream repositories in the list
     *            determines their priority order when AWS CodeArtifact looks
     *            for a requested package version. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     *            >Working with upstream repositories</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withUpstreams(UpstreamRepositoryInfo... upstreams) {
        if (getUpstreams() == null) {
            this.upstreams = new java.util.ArrayList<UpstreamRepositoryInfo>(upstreams.length);
        }
        for (UpstreamRepositoryInfo value : upstreams) {
            this.upstreams.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The
     * order of the upstream repositories in the list determines their priority
     * order when AWS CodeArtifact looks for a requested package version. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     * >Working with upstream repositories</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upstreams <p>
     *            A list of upstream repositories to associate with the
     *            repository. The order of the upstream repositories in the list
     *            determines their priority order when AWS CodeArtifact looks
     *            for a requested package version. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html"
     *            >Working with upstream repositories</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withUpstreams(
            java.util.Collection<UpstreamRepositoryInfo> upstreams) {
        setUpstreams(upstreams);
        return this;
    }

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     *
     * @return <p>
     *         An array of external connections associated with the repository.
     *         </p>
     */
    public java.util.List<RepositoryExternalConnectionInfo> getExternalConnections() {
        return externalConnections;
    }

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     *
     * @param externalConnections <p>
     *            An array of external connections associated with the
     *            repository.
     *            </p>
     */
    public void setExternalConnections(
            java.util.Collection<RepositoryExternalConnectionInfo> externalConnections) {
        if (externalConnections == null) {
            this.externalConnections = null;
            return;
        }

        this.externalConnections = new java.util.ArrayList<RepositoryExternalConnectionInfo>(
                externalConnections);
    }

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalConnections <p>
     *            An array of external connections associated with the
     *            repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withExternalConnections(
            RepositoryExternalConnectionInfo... externalConnections) {
        if (getExternalConnections() == null) {
            this.externalConnections = new java.util.ArrayList<RepositoryExternalConnectionInfo>(
                    externalConnections.length);
        }
        for (RepositoryExternalConnectionInfo value : externalConnections) {
            this.externalConnections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalConnections <p>
     *            An array of external connections associated with the
     *            repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryDescription withExternalConnections(
            java.util.Collection<RepositoryExternalConnectionInfo> externalConnections) {
        setExternalConnections(externalConnections);
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getAdministratorAccount() != null)
            sb.append("administratorAccount: " + getAdministratorAccount() + ",");
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getDomainOwner() != null)
            sb.append("domainOwner: " + getDomainOwner() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getUpstreams() != null)
            sb.append("upstreams: " + getUpstreams() + ",");
        if (getExternalConnections() != null)
            sb.append("externalConnections: " + getExternalConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getAdministratorAccount() == null) ? 0 : getAdministratorAccount().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUpstreams() == null) ? 0 : getUpstreams().hashCode());
        hashCode = prime * hashCode
                + ((getExternalConnections() == null) ? 0 : getExternalConnections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryDescription == false)
            return false;
        RepositoryDescription other = (RepositoryDescription) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAdministratorAccount() == null ^ this.getAdministratorAccount() == null)
            return false;
        if (other.getAdministratorAccount() != null
                && other.getAdministratorAccount().equals(this.getAdministratorAccount()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null
                && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUpstreams() == null ^ this.getUpstreams() == null)
            return false;
        if (other.getUpstreams() != null
                && other.getUpstreams().equals(this.getUpstreams()) == false)
            return false;
        if (other.getExternalConnections() == null ^ this.getExternalConnections() == null)
            return false;
        if (other.getExternalConnections() != null
                && other.getExternalConnections().equals(this.getExternalConnections()) == false)
            return false;
        return true;
    }
}
