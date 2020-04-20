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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * This structure contains information about one canary runtime version. For
 * more information about runtime versions, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
 * > Canary Runtime Versions</a>.
 * </p>
 */
public class RuntimeVersion implements Serializable {
    /**
     * <p>
     * The name of the runtime version. Currently, the only valid value is
     * <code>syn-1.0</code>.
     * </p>
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only
     * valid value is <code>syn-1.0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String versionName;

    /**
     * <p>
     * A description of the runtime version, created by Amazon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The date that the runtime version was released.
     * </p>
     */
    private java.util.Date releaseDate;

    /**
     * <p>
     * If this runtime version is deprecated, this value is the date of
     * deprecation.
     * </p>
     */
    private java.util.Date deprecationDate;

    /**
     * <p>
     * The name of the runtime version. Currently, the only valid value is
     * <code>syn-1.0</code>.
     * </p>
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only
     * valid value is <code>syn-1.0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The name of the runtime version. Currently, the only valid value
     *         is <code>syn-1.0</code>.
     *         </p>
     *         <p>
     *         Specifies the runtime version to use for the canary. Currently,
     *         the only valid value is <code>syn-1.0</code>.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * The name of the runtime version. Currently, the only valid value is
     * <code>syn-1.0</code>.
     * </p>
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only
     * valid value is <code>syn-1.0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param versionName <p>
     *            The name of the runtime version. Currently, the only valid
     *            value is <code>syn-1.0</code>.
     *            </p>
     *            <p>
     *            Specifies the runtime version to use for the canary.
     *            Currently, the only valid value is <code>syn-1.0</code>.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name of the runtime version. Currently, the only valid value is
     * <code>syn-1.0</code>.
     * </p>
     * <p>
     * Specifies the runtime version to use for the canary. Currently, the only
     * valid value is <code>syn-1.0</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param versionName <p>
     *            The name of the runtime version. Currently, the only valid
     *            value is <code>syn-1.0</code>.
     *            </p>
     *            <p>
     *            Specifies the runtime version to use for the canary.
     *            Currently, the only valid value is <code>syn-1.0</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuntimeVersion withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * A description of the runtime version, created by Amazon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A description of the runtime version, created by Amazon.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the runtime version, created by Amazon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the runtime version, created by Amazon.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the runtime version, created by Amazon.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the runtime version, created by Amazon.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuntimeVersion withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date that the runtime version was released.
     * </p>
     *
     * @return <p>
     *         The date that the runtime version was released.
     *         </p>
     */
    public java.util.Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * <p>
     * The date that the runtime version was released.
     * </p>
     *
     * @param releaseDate <p>
     *            The date that the runtime version was released.
     *            </p>
     */
    public void setReleaseDate(java.util.Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * The date that the runtime version was released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param releaseDate <p>
     *            The date that the runtime version was released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuntimeVersion withReleaseDate(java.util.Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * <p>
     * If this runtime version is deprecated, this value is the date of
     * deprecation.
     * </p>
     *
     * @return <p>
     *         If this runtime version is deprecated, this value is the date of
     *         deprecation.
     *         </p>
     */
    public java.util.Date getDeprecationDate() {
        return deprecationDate;
    }

    /**
     * <p>
     * If this runtime version is deprecated, this value is the date of
     * deprecation.
     * </p>
     *
     * @param deprecationDate <p>
     *            If this runtime version is deprecated, this value is the date
     *            of deprecation.
     *            </p>
     */
    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    /**
     * <p>
     * If this runtime version is deprecated, this value is the date of
     * deprecation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deprecationDate <p>
     *            If this runtime version is deprecated, this value is the date
     *            of deprecation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuntimeVersion withDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
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
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getReleaseDate() != null)
            sb.append("ReleaseDate: " + getReleaseDate() + ",");
        if (getDeprecationDate() != null)
            sb.append("DeprecationDate: " + getDeprecationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime * hashCode
                + ((getDeprecationDate() == null) ? 0 : getDeprecationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeVersion == false)
            return false;
        RuntimeVersion other = (RuntimeVersion) obj;

        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReleaseDate() == null ^ this.getReleaseDate() == null)
            return false;
        if (other.getReleaseDate() != null
                && other.getReleaseDate().equals(this.getReleaseDate()) == false)
            return false;
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null)
            return false;
        if (other.getDeprecationDate() != null
                && other.getDeprecationDate().equals(this.getDeprecationDate()) == false)
            return false;
        return true;
    }
}
