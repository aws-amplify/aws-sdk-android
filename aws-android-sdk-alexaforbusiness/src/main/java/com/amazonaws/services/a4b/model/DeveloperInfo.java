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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The details about the developer that published the skill.
 * </p>
 */
public class DeveloperInfo implements Serializable {
    /**
     * <p>
     * The name of the developer.
     * </p>
     */
    private String developerName;

    /**
     * <p>
     * The URL of the privacy policy.
     * </p>
     */
    private String privacyPolicy;

    /**
     * <p>
     * The email of the developer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     */
    private String email;

    /**
     * <p>
     * The website of the developer.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The name of the developer.
     * </p>
     *
     * @return <p>
     *         The name of the developer.
     *         </p>
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * <p>
     * The name of the developer.
     * </p>
     *
     * @param developerName <p>
     *            The name of the developer.
     *            </p>
     */
    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    /**
     * <p>
     * The name of the developer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param developerName <p>
     *            The name of the developer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeveloperInfo withDeveloperName(String developerName) {
        this.developerName = developerName;
        return this;
    }

    /**
     * <p>
     * The URL of the privacy policy.
     * </p>
     *
     * @return <p>
     *         The URL of the privacy policy.
     *         </p>
     */
    public String getPrivacyPolicy() {
        return privacyPolicy;
    }

    /**
     * <p>
     * The URL of the privacy policy.
     * </p>
     *
     * @param privacyPolicy <p>
     *            The URL of the privacy policy.
     *            </p>
     */
    public void setPrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    /**
     * <p>
     * The URL of the privacy policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privacyPolicy <p>
     *            The URL of the privacy policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeveloperInfo withPrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
        return this;
    }

    /**
     * <p>
     * The email of the developer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @return <p>
     *         The email of the developer.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email of the developer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @param email <p>
     *            The email of the developer.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the developer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @param email <p>
     *            The email of the developer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeveloperInfo withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The website of the developer.
     * </p>
     *
     * @return <p>
     *         The website of the developer.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The website of the developer.
     * </p>
     *
     * @param url <p>
     *            The website of the developer.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The website of the developer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The website of the developer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeveloperInfo withUrl(String url) {
        this.url = url;
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
        if (getDeveloperName() != null)
            sb.append("DeveloperName: " + getDeveloperName() + ",");
        if (getPrivacyPolicy() != null)
            sb.append("PrivacyPolicy: " + getPrivacyPolicy() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeveloperName() == null) ? 0 : getDeveloperName().hashCode());
        hashCode = prime * hashCode
                + ((getPrivacyPolicy() == null) ? 0 : getPrivacyPolicy().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeveloperInfo == false)
            return false;
        DeveloperInfo other = (DeveloperInfo) obj;

        if (other.getDeveloperName() == null ^ this.getDeveloperName() == null)
            return false;
        if (other.getDeveloperName() != null
                && other.getDeveloperName().equals(this.getDeveloperName()) == false)
            return false;
        if (other.getPrivacyPolicy() == null ^ this.getPrivacyPolicy() == null)
            return false;
        if (other.getPrivacyPolicy() != null
                && other.getPrivacyPolicy().equals(this.getPrivacyPolicy()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
