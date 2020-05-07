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
 * Information about build output artifacts.
 * </p>
 */
public class BuildArtifacts implements Serializable {
    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file
     * integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's
     * <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     */
    private String sha256sum;

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file
     * integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's
     * <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     */
    private String md5sum;

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     */
    private Boolean overrideArtifactName;

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     */
    private Boolean encryptionDisabled;

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     */
    private String artifactIdentifier;

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     *
     * @return <p>
     *         Information about the location of the build artifacts.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     *
     * @param location <p>
     *            Information about the location of the build artifacts.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            Information about the location of the build artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildArtifacts withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file
     * integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's
     * <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The SHA-256 hash of the build artifact.
     *         </p>
     *         <p>
     *         You can use this hash along with a checksum tool to confirm file
     *         integrity and authenticity.
     *         </p>
     *         <note>
     *         <p>
     *         This value is available only if the build project's
     *         <code>packaging</code> value is set to <code>ZIP</code>.
     *         </p>
     *         </note>
     */
    public String getSha256sum() {
        return sha256sum;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file
     * integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's
     * <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     *
     * @param sha256sum <p>
     *            The SHA-256 hash of the build artifact.
     *            </p>
     *            <p>
     *            You can use this hash along with a checksum tool to confirm
     *            file integrity and authenticity.
     *            </p>
     *            <note>
     *            <p>
     *            This value is available only if the build project's
     *            <code>packaging</code> value is set to <code>ZIP</code>.
     *            </p>
     *            </note>
     */
    public void setSha256sum(String sha256sum) {
        this.sha256sum = sha256sum;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file
     * integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's
     * <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sha256sum <p>
     *            The SHA-256 hash of the build artifact.
     *            </p>
     *            <p>
     *            You can use this hash along with a checksum tool to confirm
     *            file integrity and authenticity.
     *            </p>
     *            <note>
     *            <p>
     *            This value is available only if the build project's
     *            <code>packaging</code> value is set to <code>ZIP</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildArtifacts withSha256sum(String sha256sum) {
        this.sha256sum = sha256sum;
        return this;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file
     * integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's
     * <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The MD5 hash of the build artifact.
     *         </p>
     *         <p>
     *         You can use this hash along with a checksum tool to confirm file
     *         integrity and authenticity.
     *         </p>
     *         <note>
     *         <p>
     *         This value is available only if the build project's
     *         <code>packaging</code> value is set to <code>ZIP</code>.
     *         </p>
     *         </note>
     */
    public String getMd5sum() {
        return md5sum;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file
     * integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's
     * <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     *
     * @param md5sum <p>
     *            The MD5 hash of the build artifact.
     *            </p>
     *            <p>
     *            You can use this hash along with a checksum tool to confirm
     *            file integrity and authenticity.
     *            </p>
     *            <note>
     *            <p>
     *            This value is available only if the build project's
     *            <code>packaging</code> value is set to <code>ZIP</code>.
     *            </p>
     *            </note>
     */
    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file
     * integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's
     * <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param md5sum <p>
     *            The MD5 hash of the build artifact.
     *            </p>
     *            <p>
     *            You can use this hash along with a checksum tool to confirm
     *            file integrity and authenticity.
     *            </p>
     *            <note>
     *            <p>
     *            This value is available only if the build project's
     *            <code>packaging</code> value is set to <code>ZIP</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildArtifacts withMd5sum(String md5sum) {
        this.md5sum = md5sum;
        return this;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     *
     * @return <p>
     *         If this flag is set, a name specified in the buildspec file
     *         overrides the artifact name. The name specified in a buildspec
     *         file is calculated at build time and uses the Shell Command
     *         Language. For example, you can append a date and time to your
     *         artifact name so that it is always unique.
     *         </p>
     */
    public Boolean isOverrideArtifactName() {
        return overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     *
     * @return <p>
     *         If this flag is set, a name specified in the buildspec file
     *         overrides the artifact name. The name specified in a buildspec
     *         file is calculated at build time and uses the Shell Command
     *         Language. For example, you can append a date and time to your
     *         artifact name so that it is always unique.
     *         </p>
     */
    public Boolean getOverrideArtifactName() {
        return overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     *
     * @param overrideArtifactName <p>
     *            If this flag is set, a name specified in the buildspec file
     *            overrides the artifact name. The name specified in a buildspec
     *            file is calculated at build time and uses the Shell Command
     *            Language. For example, you can append a date and time to your
     *            artifact name so that it is always unique.
     *            </p>
     */
    public void setOverrideArtifactName(Boolean overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrideArtifactName <p>
     *            If this flag is set, a name specified in the buildspec file
     *            overrides the artifact name. The name specified in a buildspec
     *            file is calculated at build time and uses the Shell Command
     *            Language. For example, you can append a date and time to your
     *            artifact name so that it is always unique.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildArtifacts withOverrideArtifactName(Boolean overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
        return this;
    }

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     *
     * @return <p>
     *         Information that tells you if encryption for build artifacts is
     *         disabled.
     *         </p>
     */
    public Boolean isEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     *
     * @return <p>
     *         Information that tells you if encryption for build artifacts is
     *         disabled.
     *         </p>
     */
    public Boolean getEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     *
     * @param encryptionDisabled <p>
     *            Information that tells you if encryption for build artifacts
     *            is disabled.
     *            </p>
     */
    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionDisabled <p>
     *            Information that tells you if encryption for build artifacts
     *            is disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildArtifacts withEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
        return this;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     *
     * @return <p>
     *         An identifier for this artifact definition.
     *         </p>
     */
    public String getArtifactIdentifier() {
        return artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     *
     * @param artifactIdentifier <p>
     *            An identifier for this artifact definition.
     *            </p>
     */
    public void setArtifactIdentifier(String artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param artifactIdentifier <p>
     *            An identifier for this artifact definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BuildArtifacts withArtifactIdentifier(String artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
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
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getSha256sum() != null)
            sb.append("sha256sum: " + getSha256sum() + ",");
        if (getMd5sum() != null)
            sb.append("md5sum: " + getMd5sum() + ",");
        if (getOverrideArtifactName() != null)
            sb.append("overrideArtifactName: " + getOverrideArtifactName() + ",");
        if (getEncryptionDisabled() != null)
            sb.append("encryptionDisabled: " + getEncryptionDisabled() + ",");
        if (getArtifactIdentifier() != null)
            sb.append("artifactIdentifier: " + getArtifactIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getSha256sum() == null) ? 0 : getSha256sum().hashCode());
        hashCode = prime * hashCode + ((getMd5sum() == null) ? 0 : getMd5sum().hashCode());
        hashCode = prime * hashCode
                + ((getOverrideArtifactName() == null) ? 0 : getOverrideArtifactName().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        hashCode = prime * hashCode
                + ((getArtifactIdentifier() == null) ? 0 : getArtifactIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildArtifacts == false)
            return false;
        BuildArtifacts other = (BuildArtifacts) obj;

        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getSha256sum() == null ^ this.getSha256sum() == null)
            return false;
        if (other.getSha256sum() != null
                && other.getSha256sum().equals(this.getSha256sum()) == false)
            return false;
        if (other.getMd5sum() == null ^ this.getMd5sum() == null)
            return false;
        if (other.getMd5sum() != null && other.getMd5sum().equals(this.getMd5sum()) == false)
            return false;
        if (other.getOverrideArtifactName() == null ^ this.getOverrideArtifactName() == null)
            return false;
        if (other.getOverrideArtifactName() != null
                && other.getOverrideArtifactName().equals(this.getOverrideArtifactName()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null
                && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        if (other.getArtifactIdentifier() == null ^ this.getArtifactIdentifier() == null)
            return false;
        if (other.getArtifactIdentifier() != null
                && other.getArtifactIdentifier().equals(this.getArtifactIdentifier()) == false)
            return false;
        return true;
    }
}
