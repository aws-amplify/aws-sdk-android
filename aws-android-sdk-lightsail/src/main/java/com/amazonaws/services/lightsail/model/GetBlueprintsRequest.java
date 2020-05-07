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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the list of available instance images, or <i>blueprints</i>. You can
 * use a blueprint to create a new instance already running a specific operating
 * system, as well as a preinstalled app or development stack. The software each
 * instance is running depends on the blueprint image you choose.
 * </p>
 * <note>
 * <p>
 * Use active blueprints when creating new instances. Inactive blueprints are
 * listed to support customers with existing instances and are not necessarily
 * available to create new instances. Blueprints are marked inactive when they
 * become outdated due to operating system updates or new application releases.
 * </p>
 * </note>
 */
public class GetBlueprintsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A Boolean value indicating whether to include inactive results in your
     * request.
     * </p>
     */
    private Boolean includeInactive;

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetBlueprints</code>
     * request. If your results are paginated, the response will return a next
     * page token that you can specify as the page token in a subsequent
     * request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * A Boolean value indicating whether to include inactive results in your
     * request.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether to include inactive results in
     *         your request.
     *         </p>
     */
    public Boolean isIncludeInactive() {
        return includeInactive;
    }

    /**
     * <p>
     * A Boolean value indicating whether to include inactive results in your
     * request.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether to include inactive results in
     *         your request.
     *         </p>
     */
    public Boolean getIncludeInactive() {
        return includeInactive;
    }

    /**
     * <p>
     * A Boolean value indicating whether to include inactive results in your
     * request.
     * </p>
     *
     * @param includeInactive <p>
     *            A Boolean value indicating whether to include inactive results
     *            in your request.
     *            </p>
     */
    public void setIncludeInactive(Boolean includeInactive) {
        this.includeInactive = includeInactive;
    }

    /**
     * <p>
     * A Boolean value indicating whether to include inactive results in your
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeInactive <p>
     *            A Boolean value indicating whether to include inactive results
     *            in your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBlueprintsRequest withIncludeInactive(Boolean includeInactive) {
        this.includeInactive = includeInactive;
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetBlueprints</code>
     * request. If your results are paginated, the response will return a next
     * page token that you can specify as the page token in a subsequent
     * request.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of results from your
     *         request.
     *         </p>
     *         <p>
     *         To get a page token, perform an initial
     *         <code>GetBlueprints</code> request. If your results are
     *         paginated, the response will return a next page token that you
     *         can specify as the page token in a subsequent request.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetBlueprints</code>
     * request. If your results are paginated, the response will return a next
     * page token that you can specify as the page token in a subsequent
     * request.
     * </p>
     *
     * @param pageToken <p>
     *            The token to advance to the next page of results from your
     *            request.
     *            </p>
     *            <p>
     *            To get a page token, perform an initial
     *            <code>GetBlueprints</code> request. If your results are
     *            paginated, the response will return a next page token that you
     *            can specify as the page token in a subsequent request.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetBlueprints</code>
     * request. If your results are paginated, the response will return a next
     * page token that you can specify as the page token in a subsequent
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageToken <p>
     *            The token to advance to the next page of results from your
     *            request.
     *            </p>
     *            <p>
     *            To get a page token, perform an initial
     *            <code>GetBlueprints</code> request. If your results are
     *            paginated, the response will return a next page token that you
     *            can specify as the page token in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBlueprintsRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        if (getIncludeInactive() != null)
            sb.append("includeInactive: " + getIncludeInactive() + ",");
        if (getPageToken() != null)
            sb.append("pageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIncludeInactive() == null) ? 0 : getIncludeInactive().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlueprintsRequest == false)
            return false;
        GetBlueprintsRequest other = (GetBlueprintsRequest) obj;

        if (other.getIncludeInactive() == null ^ this.getIncludeInactive() == null)
            return false;
        if (other.getIncludeInactive() != null
                && other.getIncludeInactive().equals(this.getIncludeInactive()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }
}
