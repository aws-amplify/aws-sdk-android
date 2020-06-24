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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The result structure for an Amplify app list request.
 * </p>
 */
public class ListAppsResult implements Serializable {
    /**
     * <p>
     * A list of Amplify apps.
     * </p>
     */
    private java.util.List<App> apps;

    /**
     * <p>
     * A pagination token. Set to null to start listing apps from start. If
     * non-null, the pagination token is returned in a result. Pass its value in
     * here to list more projects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of Amplify apps.
     * </p>
     *
     * @return <p>
     *         A list of Amplify apps.
     *         </p>
     */
    public java.util.List<App> getApps() {
        return apps;
    }

    /**
     * <p>
     * A list of Amplify apps.
     * </p>
     *
     * @param apps <p>
     *            A list of Amplify apps.
     *            </p>
     */
    public void setApps(java.util.Collection<App> apps) {
        if (apps == null) {
            this.apps = null;
            return;
        }

        this.apps = new java.util.ArrayList<App>(apps);
    }

    /**
     * <p>
     * A list of Amplify apps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apps <p>
     *            A list of Amplify apps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppsResult withApps(App... apps) {
        if (getApps() == null) {
            this.apps = new java.util.ArrayList<App>(apps.length);
        }
        for (App value : apps) {
            this.apps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amplify apps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apps <p>
     *            A list of Amplify apps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppsResult withApps(java.util.Collection<App> apps) {
        setApps(apps);
        return this;
    }

    /**
     * <p>
     * A pagination token. Set to null to start listing apps from start. If
     * non-null, the pagination token is returned in a result. Pass its value in
     * here to list more projects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         A pagination token. Set to null to start listing apps from start.
     *         If non-null, the pagination token is returned in a result. Pass
     *         its value in here to list more projects.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token. Set to null to start listing apps from start. If
     * non-null, the pagination token is returned in a result. Pass its value in
     * here to list more projects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token. Set to null to start listing apps from
     *            start. If non-null, the pagination token is returned in a
     *            result. Pass its value in here to list more projects.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. Set to null to start listing apps from start. If
     * non-null, the pagination token is returned in a result. Pass its value in
     * here to list more projects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token. Set to null to start listing apps from
     *            start. If non-null, the pagination token is returned in a
     *            result. Pass its value in here to list more projects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppsResult withNextToken(String nextToken) {
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
        if (getApps() != null)
            sb.append("apps: " + getApps() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApps() == null) ? 0 : getApps().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppsResult == false)
            return false;
        ListAppsResult other = (ListAppsResult) obj;

        if (other.getApps() == null ^ this.getApps() == null)
            return false;
        if (other.getApps() != null && other.getApps().equals(this.getApps()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
