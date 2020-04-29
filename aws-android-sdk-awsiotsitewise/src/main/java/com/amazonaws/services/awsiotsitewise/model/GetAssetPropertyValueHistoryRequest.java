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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the history of an asset property's values. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#historical-values"
 * >Querying Historical Property Values</a> in the <i>AWS IoT SiteWise User
 * Guide</i>.
 * </p>
 * <p>
 * To identify an asset property, you must specify one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <code>assetId</code> and <code>propertyId</code> of an asset property.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>propertyAlias</code>, which is a data stream alias (for example,
 * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset
 * property's alias, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
 * >UpdateAssetProperty</a>.
 * </p>
 * </li>
 * </ul>
 */
public class GetAssetPropertyValueHistoryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String assetId;

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String propertyId;

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String propertyAlias;

    /**
     * <p>
     * The exclusive start of the range from which to query historical data,
     * expressed in seconds in Unix epoch time.
     * </p>
     */
    private java.util.Date startDate;

    /**
     * <p>
     * The inclusive end of the range from which to query historical data,
     * expressed in seconds in Unix epoch time.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     */
    private java.util.List<String> qualities;

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String timeOrdering;

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset property.
     *         </p>
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param propertyId <p>
     *            The ID of the asset property.
     *            </p>
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param propertyId <p>
     *            The ID of the asset property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The property alias that identifies the property, such as an
     *         OPC-UA server data stream path (for example,
     *         <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *         >Mapping Industrial Data Streams to Asset Properties</a> in the
     *         <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     */
    public String getPropertyAlias() {
        return propertyAlias;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyAlias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     */
    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyAlias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
        return this;
    }

    /**
     * <p>
     * The exclusive start of the range from which to query historical data,
     * expressed in seconds in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The exclusive start of the range from which to query historical
     *         data, expressed in seconds in Unix epoch time.
     *         </p>
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The exclusive start of the range from which to query historical data,
     * expressed in seconds in Unix epoch time.
     * </p>
     *
     * @param startDate <p>
     *            The exclusive start of the range from which to query
     *            historical data, expressed in seconds in Unix epoch time.
     *            </p>
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The exclusive start of the range from which to query historical data,
     * expressed in seconds in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            The exclusive start of the range from which to query
     *            historical data, expressed in seconds in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withStartDate(java.util.Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * The inclusive end of the range from which to query historical data,
     * expressed in seconds in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The inclusive end of the range from which to query historical
     *         data, expressed in seconds in Unix epoch time.
     *         </p>
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * The inclusive end of the range from which to query historical data,
     * expressed in seconds in Unix epoch time.
     * </p>
     *
     * @param endDate <p>
     *            The inclusive end of the range from which to query historical
     *            data, expressed in seconds in Unix epoch time.
     *            </p>
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The inclusive end of the range from which to query historical data,
     * expressed in seconds in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            The inclusive end of the range from which to query historical
     *            data, expressed in seconds in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withEndDate(java.util.Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     *
     * @return <p>
     *         The quality by which to filter asset data.
     *         </p>
     */
    public java.util.List<String> getQualities() {
        return qualities;
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     *
     * @param qualities <p>
     *            The quality by which to filter asset data.
     *            </p>
     */
    public void setQualities(java.util.Collection<String> qualities) {
        if (qualities == null) {
            this.qualities = null;
            return;
        }

        this.qualities = new java.util.ArrayList<String>(qualities);
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param qualities <p>
     *            The quality by which to filter asset data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withQualities(String... qualities) {
        if (getQualities() == null) {
            this.qualities = new java.util.ArrayList<String>(qualities.length);
        }
        for (String value : qualities) {
            this.qualities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The quality by which to filter asset data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param qualities <p>
     *            The quality by which to filter asset data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withQualities(java.util.Collection<String> qualities) {
        setQualities(qualities);
        return this;
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         The chronological sorting order of the requested information.
     *         </p>
     * @see TimeOrdering
     */
    public String getTimeOrdering() {
        return timeOrdering;
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param timeOrdering <p>
     *            The chronological sorting order of the requested information.
     *            </p>
     * @see TimeOrdering
     */
    public void setTimeOrdering(String timeOrdering) {
        this.timeOrdering = timeOrdering;
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param timeOrdering <p>
     *            The chronological sorting order of the requested information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeOrdering
     */
    public GetAssetPropertyValueHistoryRequest withTimeOrdering(String timeOrdering) {
        this.timeOrdering = timeOrdering;
        return this;
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param timeOrdering <p>
     *            The chronological sorting order of the requested information.
     *            </p>
     * @see TimeOrdering
     */
    public void setTimeOrdering(TimeOrdering timeOrdering) {
        this.timeOrdering = timeOrdering.toString();
    }

    /**
     * <p>
     * The chronological sorting order of the requested information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param timeOrdering <p>
     *            The chronological sorting order of the requested information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeOrdering
     */
    public GetAssetPropertyValueHistoryRequest withTimeOrdering(TimeOrdering timeOrdering) {
        this.timeOrdering = timeOrdering.toString();
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @return <p>
     *         The token to be used for the next set of paginated results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token to be used for the next set of paginated results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token to be used for the next set of paginated results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to be returned per paginated
     *         request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned per paginated
     *            request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned per paginated
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueHistoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getAssetId() != null)
            sb.append("assetId: " + getAssetId() + ",");
        if (getPropertyId() != null)
            sb.append("propertyId: " + getPropertyId() + ",");
        if (getPropertyAlias() != null)
            sb.append("propertyAlias: " + getPropertyAlias() + ",");
        if (getStartDate() != null)
            sb.append("startDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("endDate: " + getEndDate() + ",");
        if (getQualities() != null)
            sb.append("qualities: " + getQualities() + ",");
        if (getTimeOrdering() != null)
            sb.append("timeOrdering: " + getTimeOrdering() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode
                + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getQualities() == null) ? 0 : getQualities().hashCode());
        hashCode = prime * hashCode
                + ((getTimeOrdering() == null) ? 0 : getTimeOrdering().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetPropertyValueHistoryRequest == false)
            return false;
        GetAssetPropertyValueHistoryRequest other = (GetAssetPropertyValueHistoryRequest) obj;

        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null
                && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getPropertyAlias() == null ^ this.getPropertyAlias() == null)
            return false;
        if (other.getPropertyAlias() != null
                && other.getPropertyAlias().equals(this.getPropertyAlias()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getQualities() == null ^ this.getQualities() == null)
            return false;
        if (other.getQualities() != null
                && other.getQualities().equals(this.getQualities()) == false)
            return false;
        if (other.getTimeOrdering() == null ^ this.getTimeOrdering() == null)
            return false;
        if (other.getTimeOrdering() != null
                && other.getTimeOrdering().equals(this.getTimeOrdering()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
