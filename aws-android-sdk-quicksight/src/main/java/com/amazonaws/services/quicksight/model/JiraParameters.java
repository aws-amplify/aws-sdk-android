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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Jira parameters.
 * </p>
 */
public class JiraParameters implements Serializable {
    /**
     * <p>
     * The base URL of the Jira site.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String siteBaseUrl;

    /**
     * <p>
     * The base URL of the Jira site.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The base URL of the Jira site.
     *         </p>
     */
    public String getSiteBaseUrl() {
        return siteBaseUrl;
    }

    /**
     * <p>
     * The base URL of the Jira site.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param siteBaseUrl <p>
     *            The base URL of the Jira site.
     *            </p>
     */
    public void setSiteBaseUrl(String siteBaseUrl) {
        this.siteBaseUrl = siteBaseUrl;
    }

    /**
     * <p>
     * The base URL of the Jira site.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param siteBaseUrl <p>
     *            The base URL of the Jira site.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JiraParameters withSiteBaseUrl(String siteBaseUrl) {
        this.siteBaseUrl = siteBaseUrl;
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
        if (getSiteBaseUrl() != null)
            sb.append("SiteBaseUrl: " + getSiteBaseUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSiteBaseUrl() == null) ? 0 : getSiteBaseUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JiraParameters == false)
            return false;
        JiraParameters other = (JiraParameters) obj;

        if (other.getSiteBaseUrl() == null ^ this.getSiteBaseUrl() == null)
            return false;
        if (other.getSiteBaseUrl() != null
                && other.getSiteBaseUrl().equals(this.getSiteBaseUrl()) == false)
            return false;
        return true;
    }
}
