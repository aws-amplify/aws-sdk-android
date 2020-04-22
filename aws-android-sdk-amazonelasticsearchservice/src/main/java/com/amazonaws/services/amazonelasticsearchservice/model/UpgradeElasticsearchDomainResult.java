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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Container for response returned by
 * <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
 * </p>
 */
public class UpgradeElasticsearchDomainResult implements Serializable {
    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * <p>
     * The version of Elasticsearch that you intend to upgrade the domain to.
     * </p>
     */
    private String targetVersion;

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check
     * needs to be performed. This will not actually perform the Upgrade.
     * </p>
     */
    private Boolean performCheckOnly;

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         The name of an Elasticsearch domain. Domain names are unique
     *         across the domains owned by an account within an AWS region.
     *         Domain names start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen).
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of an Elasticsearch domain. Domain names are unique
     *            across the domains owned by an account within an AWS region.
     *            Domain names start with a letter or number and can contain the
     *            following characters: a-z (lowercase), 0-9, and - (hyphen).
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of an Elasticsearch domain. Domain names are unique
     *            across the domains owned by an account within an AWS region.
     *            Domain names start with a letter or number and can contain the
     *            following characters: a-z (lowercase), 0-9, and - (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeElasticsearchDomainResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The version of Elasticsearch that you intend to upgrade the domain to.
     * </p>
     *
     * @return <p>
     *         The version of Elasticsearch that you intend to upgrade the
     *         domain to.
     *         </p>
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    /**
     * <p>
     * The version of Elasticsearch that you intend to upgrade the domain to.
     * </p>
     *
     * @param targetVersion <p>
     *            The version of Elasticsearch that you intend to upgrade the
     *            domain to.
     *            </p>
     */
    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * <p>
     * The version of Elasticsearch that you intend to upgrade the domain to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVersion <p>
     *            The version of Elasticsearch that you intend to upgrade the
     *            domain to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeElasticsearchDomainResult withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check
     * needs to be performed. This will not actually perform the Upgrade.
     * </p>
     *
     * @return <p>
     *         This flag, when set to True, indicates that an Upgrade
     *         Eligibility Check needs to be performed. This will not actually
     *         perform the Upgrade.
     *         </p>
     */
    public Boolean isPerformCheckOnly() {
        return performCheckOnly;
    }

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check
     * needs to be performed. This will not actually perform the Upgrade.
     * </p>
     *
     * @return <p>
     *         This flag, when set to True, indicates that an Upgrade
     *         Eligibility Check needs to be performed. This will not actually
     *         perform the Upgrade.
     *         </p>
     */
    public Boolean getPerformCheckOnly() {
        return performCheckOnly;
    }

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check
     * needs to be performed. This will not actually perform the Upgrade.
     * </p>
     *
     * @param performCheckOnly <p>
     *            This flag, when set to True, indicates that an Upgrade
     *            Eligibility Check needs to be performed. This will not
     *            actually perform the Upgrade.
     *            </p>
     */
    public void setPerformCheckOnly(Boolean performCheckOnly) {
        this.performCheckOnly = performCheckOnly;
    }

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check
     * needs to be performed. This will not actually perform the Upgrade.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performCheckOnly <p>
     *            This flag, when set to True, indicates that an Upgrade
     *            Eligibility Check needs to be performed. This will not
     *            actually perform the Upgrade.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeElasticsearchDomainResult withPerformCheckOnly(Boolean performCheckOnly) {
        this.performCheckOnly = performCheckOnly;
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getTargetVersion() != null)
            sb.append("TargetVersion: " + getTargetVersion() + ",");
        if (getPerformCheckOnly() != null)
            sb.append("PerformCheckOnly: " + getPerformCheckOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVersion() == null) ? 0 : getTargetVersion().hashCode());
        hashCode = prime * hashCode
                + ((getPerformCheckOnly() == null) ? 0 : getPerformCheckOnly().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeElasticsearchDomainResult == false)
            return false;
        UpgradeElasticsearchDomainResult other = (UpgradeElasticsearchDomainResult) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTargetVersion() == null ^ this.getTargetVersion() == null)
            return false;
        if (other.getTargetVersion() != null
                && other.getTargetVersion().equals(this.getTargetVersion()) == false)
            return false;
        if (other.getPerformCheckOnly() == null ^ this.getPerformCheckOnly() == null)
            return false;
        if (other.getPerformCheckOnly() != null
                && other.getPerformCheckOnly().equals(this.getPerformCheckOnly()) == false)
            return false;
        return true;
    }
}
