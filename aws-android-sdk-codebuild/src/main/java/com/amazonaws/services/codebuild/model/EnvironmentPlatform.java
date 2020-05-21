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
 * A set of Docker images that are related by platform and are managed by AWS
 * CodeBuild.
 * </p>
 */
public class EnvironmentPlatform implements Serializable {
    /**
     * <p>
     * The platform's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER
     */
    private String platform;

    /**
     * <p>
     * The list of programming languages that are available for the specified
     * platform.
     * </p>
     */
    private java.util.List<EnvironmentLanguage> languages;

    /**
     * <p>
     * The platform's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER
     *
     * @return <p>
     *         The platform's name.
     *         </p>
     * @see PlatformType
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER
     *
     * @param platform <p>
     *            The platform's name.
     *            </p>
     * @see PlatformType
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform's name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER
     *
     * @param platform <p>
     *            The platform's name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformType
     */
    public EnvironmentPlatform withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The platform's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER
     *
     * @param platform <p>
     *            The platform's name.
     *            </p>
     * @see PlatformType
     */
    public void setPlatform(PlatformType platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The platform's name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER
     *
     * @param platform <p>
     *            The platform's name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformType
     */
    public EnvironmentPlatform withPlatform(PlatformType platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The list of programming languages that are available for the specified
     * platform.
     * </p>
     *
     * @return <p>
     *         The list of programming languages that are available for the
     *         specified platform.
     *         </p>
     */
    public java.util.List<EnvironmentLanguage> getLanguages() {
        return languages;
    }

    /**
     * <p>
     * The list of programming languages that are available for the specified
     * platform.
     * </p>
     *
     * @param languages <p>
     *            The list of programming languages that are available for the
     *            specified platform.
     *            </p>
     */
    public void setLanguages(java.util.Collection<EnvironmentLanguage> languages) {
        if (languages == null) {
            this.languages = null;
            return;
        }

        this.languages = new java.util.ArrayList<EnvironmentLanguage>(languages);
    }

    /**
     * <p>
     * The list of programming languages that are available for the specified
     * platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languages <p>
     *            The list of programming languages that are available for the
     *            specified platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentPlatform withLanguages(EnvironmentLanguage... languages) {
        if (getLanguages() == null) {
            this.languages = new java.util.ArrayList<EnvironmentLanguage>(languages.length);
        }
        for (EnvironmentLanguage value : languages) {
            this.languages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of programming languages that are available for the specified
     * platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languages <p>
     *            The list of programming languages that are available for the
     *            specified platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentPlatform withLanguages(java.util.Collection<EnvironmentLanguage> languages) {
        setLanguages(languages);
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
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform() + ",");
        if (getLanguages() != null)
            sb.append("languages: " + getLanguages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentPlatform == false)
            return false;
        EnvironmentPlatform other = (EnvironmentPlatform) obj;

        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getLanguages() == null ^ this.getLanguages() == null)
            return false;
        if (other.getLanguages() != null
                && other.getLanguages().equals(this.getLanguages()) == false)
            return false;
        return true;
    }
}
