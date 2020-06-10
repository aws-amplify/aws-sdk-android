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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Update the properties of a repository.
 * </p>
 */
public class UpdateRepositoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain associated with the repository to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     */
    private String domain;

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String domainOwner;

    /**
     * <p>
     * The name of the repository to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     */
    private String repository;

    /**
     * <p>
     * An updated repository description.
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
    private java.util.List<UpstreamRepository> upstreams;

    /**
     * <p>
     * The name of the domain associated with the repository to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @return <p>
     *         The name of the domain associated with the repository to update.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The name of the domain associated with the repository to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p>
     *            The name of the domain associated with the repository to
     *            update.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain associated with the repository to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p>
     *            The name of the domain associated with the repository to
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The 12-digit account number of the AWS account that owns the
     *         domain. It does not include dashes or spaces.
     *         </p>
     */
    public String getDomainOwner() {
        return domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param domainOwner <p>
     *            The 12-digit account number of the AWS account that owns the
     *            domain. It does not include dashes or spaces.
     *            </p>
     */
    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It
     * does not include dashes or spaces.
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
     *            domain. It does not include dashes or spaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryRequest withDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * <p>
     * The name of the repository to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @return <p>
     *         The name of the repository to update.
     *         </p>
     */
    public String getRepository() {
        return repository;
    }

    /**
     * <p>
     * The name of the repository to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p>
     *            The name of the repository to update.
     *            </p>
     */
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p>
     *            The name of the repository to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * <p>
     * An updated repository description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @return <p>
     *         An updated repository description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An updated repository description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @param description <p>
     *            An updated repository description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An updated repository description.
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
     *            An updated repository description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryRequest withDescription(String description) {
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
    public java.util.List<UpstreamRepository> getUpstreams() {
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
    public void setUpstreams(java.util.Collection<UpstreamRepository> upstreams) {
        if (upstreams == null) {
            this.upstreams = null;
            return;
        }

        this.upstreams = new java.util.ArrayList<UpstreamRepository>(upstreams);
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
    public UpdateRepositoryRequest withUpstreams(UpstreamRepository... upstreams) {
        if (getUpstreams() == null) {
            this.upstreams = new java.util.ArrayList<UpstreamRepository>(upstreams.length);
        }
        for (UpstreamRepository value : upstreams) {
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
    public UpdateRepositoryRequest withUpstreams(java.util.Collection<UpstreamRepository> upstreams) {
        setUpstreams(upstreams);
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
        if (getDomain() != null)
            sb.append("domain: " + getDomain() + ",");
        if (getDomainOwner() != null)
            sb.append("domainOwner: " + getDomainOwner() + ",");
        if (getRepository() != null)
            sb.append("repository: " + getRepository() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getUpstreams() != null)
            sb.append("upstreams: " + getUpstreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUpstreams() == null) ? 0 : getUpstreams().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryRequest == false)
            return false;
        UpdateRepositoryRequest other = (UpdateRepositoryRequest) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null
                && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null
                && other.getRepository().equals(this.getRepository()) == false)
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
        return true;
    }
}
