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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Reserved for future use.
 * </p>
 */
public class ApiCallDetails implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String api;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String apiServiceName;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.Date firstSeen;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.Date lastSeen;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getApi() {
        return api;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param api <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setApi(String api) {
        this.api = api;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param api <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiCallDetails withApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getApiServiceName() {
        return apiServiceName;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param apiServiceName <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setApiServiceName(String apiServiceName) {
        this.apiServiceName = apiServiceName;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiServiceName <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiCallDetails withApiServiceName(String apiServiceName) {
        this.apiServiceName = apiServiceName;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public java.util.Date getFirstSeen() {
        return firstSeen;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param firstSeen <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setFirstSeen(java.util.Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firstSeen <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiCallDetails withFirstSeen(java.util.Date firstSeen) {
        this.firstSeen = firstSeen;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public java.util.Date getLastSeen() {
        return lastSeen;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param lastSeen <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setLastSeen(java.util.Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSeen <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiCallDetails withLastSeen(java.util.Date lastSeen) {
        this.lastSeen = lastSeen;
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
        if (getApi() != null)
            sb.append("api: " + getApi() + ",");
        if (getApiServiceName() != null)
            sb.append("apiServiceName: " + getApiServiceName() + ",");
        if (getFirstSeen() != null)
            sb.append("firstSeen: " + getFirstSeen() + ",");
        if (getLastSeen() != null)
            sb.append("lastSeen: " + getLastSeen());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApi() == null) ? 0 : getApi().hashCode());
        hashCode = prime * hashCode
                + ((getApiServiceName() == null) ? 0 : getApiServiceName().hashCode());
        hashCode = prime * hashCode + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        hashCode = prime * hashCode + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiCallDetails == false)
            return false;
        ApiCallDetails other = (ApiCallDetails) obj;

        if (other.getApi() == null ^ this.getApi() == null)
            return false;
        if (other.getApi() != null && other.getApi().equals(this.getApi()) == false)
            return false;
        if (other.getApiServiceName() == null ^ this.getApiServiceName() == null)
            return false;
        if (other.getApiServiceName() != null
                && other.getApiServiceName().equals(this.getApiServiceName()) == false)
            return false;
        if (other.getFirstSeen() == null ^ this.getFirstSeen() == null)
            return false;
        if (other.getFirstSeen() != null
                && other.getFirstSeen().equals(this.getFirstSeen()) == false)
            return false;
        if (other.getLastSeen() == null ^ this.getLastSeen() == null)
            return false;
        if (other.getLastSeen() != null && other.getLastSeen().equals(this.getLastSeen()) == false)
            return false;
        return true;
    }
}
