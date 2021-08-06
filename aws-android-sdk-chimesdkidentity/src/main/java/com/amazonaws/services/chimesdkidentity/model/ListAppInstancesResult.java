/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

public class ListAppInstancesResult implements Serializable {
    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     */
    private java.util.List<AppInstanceSummary> appInstances;

    /**
     * <p>
     * The token passed by previous API requests until the maximum number of
     * <code>AppInstance</code>s is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     *
     * @return <p>
     *         The information for each <code>AppInstance</code>.
     *         </p>
     */
    public java.util.List<AppInstanceSummary> getAppInstances() {
        return appInstances;
    }

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     *
     * @param appInstances <p>
     *            The information for each <code>AppInstance</code>.
     *            </p>
     */
    public void setAppInstances(java.util.Collection<AppInstanceSummary> appInstances) {
        if (appInstances == null) {
            this.appInstances = null;
            return;
        }

        this.appInstances = new java.util.ArrayList<AppInstanceSummary>(appInstances);
    }

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstances <p>
     *            The information for each <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppInstancesResult withAppInstances(AppInstanceSummary... appInstances) {
        if (getAppInstances() == null) {
            this.appInstances = new java.util.ArrayList<AppInstanceSummary>(appInstances.length);
        }
        for (AppInstanceSummary value : appInstances) {
            this.appInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The information for each <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstances <p>
     *            The information for each <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppInstancesResult withAppInstances(
            java.util.Collection<AppInstanceSummary> appInstances) {
        setAppInstances(appInstances);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API requests until the maximum number of
     * <code>AppInstance</code>s is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The token passed by previous API requests until the maximum
     *         number of <code>AppInstance</code>s is reached.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token passed by previous API requests until the maximum number of
     * <code>AppInstance</code>s is reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API requests until the maximum
     *            number of <code>AppInstance</code>s is reached.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API requests until the maximum number of
     * <code>AppInstance</code>s is reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API requests until the maximum
     *            number of <code>AppInstance</code>s is reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppInstancesResult withNextToken(String nextToken) {
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
        if (getAppInstances() != null)
            sb.append("AppInstances: " + getAppInstances() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstances() == null) ? 0 : getAppInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppInstancesResult == false)
            return false;
        ListAppInstancesResult other = (ListAppInstancesResult) obj;

        if (other.getAppInstances() == null ^ this.getAppInstances() == null)
            return false;
        if (other.getAppInstances() != null
                && other.getAppInstances().equals(this.getAppInstances()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
