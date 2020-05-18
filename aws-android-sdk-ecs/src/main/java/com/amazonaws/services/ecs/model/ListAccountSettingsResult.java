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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class ListAccountSettingsResult implements Serializable {
    /**
     * <p>
     * The account settings for the resource.
     * </p>
     */
    private java.util.List<Setting> settings;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListAccountSettings</code> request. When the results of a
     * <code>ListAccountSettings</code> request exceed <code>maxResults</code>,
     * this value can be used to retrieve the next page of results. This value
     * is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     *
     * @return <p>
     *         The account settings for the resource.
     *         </p>
     */
    public java.util.List<Setting> getSettings() {
        return settings;
    }

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     *
     * @param settings <p>
     *            The account settings for the resource.
     *            </p>
     */
    public void setSettings(java.util.Collection<Setting> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new java.util.ArrayList<Setting>(settings);
    }

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            The account settings for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccountSettingsResult withSettings(Setting... settings) {
        if (getSettings() == null) {
            this.settings = new java.util.ArrayList<Setting>(settings.length);
        }
        for (Setting value : settings) {
            this.settings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The account settings for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            The account settings for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccountSettingsResult withSettings(java.util.Collection<Setting> settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListAccountSettings</code> request. When the results of a
     * <code>ListAccountSettings</code> request exceed <code>maxResults</code>,
     * this value can be used to retrieve the next page of results. This value
     * is <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>ListAccountSettings</code> request. When the results of a
     *         <code>ListAccountSettings</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the
     *         next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListAccountSettings</code> request. When the results of a
     * <code>ListAccountSettings</code> request exceed <code>maxResults</code>,
     * this value can be used to retrieve the next page of results. This value
     * is <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListAccountSettings</code> request. When the results of
     *            a <code>ListAccountSettings</code> request exceed
     *            <code>maxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListAccountSettings</code> request. When the results of a
     * <code>ListAccountSettings</code> request exceed <code>maxResults</code>,
     * this value can be used to retrieve the next page of results. This value
     * is <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListAccountSettings</code> request. When the results of
     *            a <code>ListAccountSettings</code> request exceed
     *            <code>maxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccountSettingsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSettings() != null)
            sb.append("settings: " + getSettings() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccountSettingsResult == false)
            return false;
        ListAccountSettingsResult other = (ListAccountSettingsResult) obj;

        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
