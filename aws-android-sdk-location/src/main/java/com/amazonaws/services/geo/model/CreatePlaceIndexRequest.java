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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a place index resource in your AWS account, which supports functions
 * with geospatial data sourced from your chosen data provider.
 * </p>
 */
public class CreatePlaceIndexRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the data provider of geospatial data.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For
     * example, entering <code>HERE</code> returns an error.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a>'s coverage in your region of interest, see <a href=
     * "https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm"
     * >Esri details on geocoding coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a>' coverage in your region of interest, see <a href=
     * "https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html"
     * >HERE details on goecoding coverage</a>.
     * </p>
     * <important>
     * <p>
     * Place index resources using HERE Technologies as a data provider can't <a
     * href=
     * "https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     * >store results</a> for locations in Japan. For more information, see the
     * <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * For additional information , see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Data providers</a> on the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     */
    private String dataSource;

    /**
     * <p>
     * Specifies the data storage option requesting Places.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String indexName;

    /**
     * <p>
     * Specifies the pricing plan for your place index resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     */
    private String pricingPlan;

    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Specifies the data provider of geospatial data.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For
     * example, entering <code>HERE</code> returns an error.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a>'s coverage in your region of interest, see <a href=
     * "https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm"
     * >Esri details on geocoding coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a>' coverage in your region of interest, see <a href=
     * "https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html"
     * >HERE details on goecoding coverage</a>.
     * </p>
     * <important>
     * <p>
     * Place index resources using HERE Technologies as a data provider can't <a
     * href=
     * "https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     * >store results</a> for locations in Japan. For more information, see the
     * <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * For additional information , see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Data providers</a> on the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the data provider of geospatial data.
     *         </p>
     *         <note>
     *         <p>
     *         This field is case-sensitive. Enter the valid values as shown.
     *         For example, entering <code>HERE</code> returns an error.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Esri</code> – For additional information about <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *         >Esri</a>'s coverage in your region of interest, see <a href=
     *         "https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm"
     *         >Esri details on geocoding coverage</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Here</code> – For additional information about <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *         >HERE Technologies</a>' coverage in your region of interest, see
     *         <a href=
     *         "https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html"
     *         >HERE details on goecoding coverage</a>.
     *         </p>
     *         <important>
     *         <p>
     *         Place index resources using HERE Technologies as a data provider
     *         can't <a href=
     *         "https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     *         >store results</a> for locations in Japan. For more information,
     *         see the <a href="https://aws.amazon.com/service-terms/">AWS
     *         Service Terms</a> for Amazon Location Service.
     *         </p>
     *         </important></li>
     *         </ul>
     *         <p>
     *         For additional information , see <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *         >Data providers</a> on the <i>Amazon Location Service Developer
     *         Guide</i>.
     *         </p>
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * Specifies the data provider of geospatial data.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For
     * example, entering <code>HERE</code> returns an error.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a>'s coverage in your region of interest, see <a href=
     * "https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm"
     * >Esri details on geocoding coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a>' coverage in your region of interest, see <a href=
     * "https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html"
     * >HERE details on goecoding coverage</a>.
     * </p>
     * <important>
     * <p>
     * Place index resources using HERE Technologies as a data provider can't <a
     * href=
     * "https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     * >store results</a> for locations in Japan. For more information, see the
     * <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * For additional information , see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Data providers</a> on the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     *
     * @param dataSource <p>
     *            Specifies the data provider of geospatial data.
     *            </p>
     *            <note>
     *            <p>
     *            This field is case-sensitive. Enter the valid values as shown.
     *            For example, entering <code>HERE</code> returns an error.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Esri</code> – For additional information about <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *            >Esri</a>'s coverage in your region of interest, see <a href=
     *            "https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm"
     *            >Esri details on geocoding coverage</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Here</code> – For additional information about <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies</a>' coverage in your region of interest,
     *            see <a href=
     *            "https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html"
     *            >HERE details on goecoding coverage</a>.
     *            </p>
     *            <important>
     *            <p>
     *            Place index resources using HERE Technologies as a data
     *            provider can't <a href=
     *            "https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     *            >store results</a> for locations in Japan. For more
     *            information, see the <a
     *            href="https://aws.amazon.com/service-terms/">AWS Service
     *            Terms</a> for Amazon Location Service.
     *            </p>
     *            </important></li>
     *            </ul>
     *            <p>
     *            For additional information , see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Data providers</a> on the <i>Amazon Location Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Specifies the data provider of geospatial data.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For
     * example, entering <code>HERE</code> returns an error.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a>'s coverage in your region of interest, see <a href=
     * "https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm"
     * >Esri details on geocoding coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a>' coverage in your region of interest, see <a href=
     * "https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html"
     * >HERE details on goecoding coverage</a>.
     * </p>
     * <important>
     * <p>
     * Place index resources using HERE Technologies as a data provider can't <a
     * href=
     * "https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     * >store results</a> for locations in Japan. For more information, see the
     * <a href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * For additional information , see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Data providers</a> on the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            Specifies the data provider of geospatial data.
     *            </p>
     *            <note>
     *            <p>
     *            This field is case-sensitive. Enter the valid values as shown.
     *            For example, entering <code>HERE</code> returns an error.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Esri</code> – For additional information about <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *            >Esri</a>'s coverage in your region of interest, see <a href=
     *            "https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm"
     *            >Esri details on geocoding coverage</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Here</code> – For additional information about <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies</a>' coverage in your region of interest,
     *            see <a href=
     *            "https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html"
     *            >HERE details on goecoding coverage</a>.
     *            </p>
     *            <important>
     *            <p>
     *            Place index resources using HERE Technologies as a data
     *            provider can't <a href=
     *            "https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     *            >store results</a> for locations in Japan. For more
     *            information, see the <a
     *            href="https://aws.amazon.com/service-terms/">AWS Service
     *            Terms</a> for Amazon Location Service.
     *            </p>
     *            </important></li>
     *            </ul>
     *            <p>
     *            For additional information , see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Data providers</a> on the <i>Amazon Location Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlaceIndexRequest withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * Specifies the data storage option requesting Places.
     * </p>
     *
     * @return <p>
     *         Specifies the data storage option requesting Places.
     *         </p>
     */
    public DataSourceConfiguration getDataSourceConfiguration() {
        return dataSourceConfiguration;
    }

    /**
     * <p>
     * Specifies the data storage option requesting Places.
     * </p>
     *
     * @param dataSourceConfiguration <p>
     *            Specifies the data storage option requesting Places.
     *            </p>
     */
    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Specifies the data storage option requesting Places.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceConfiguration <p>
     *            Specifies the data storage option requesting Places.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlaceIndexRequest withDataSourceConfiguration(
            DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
        return this;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The optional description for the place index resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the place index resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the place index resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlaceIndexRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the place index resource.
     *         </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens
     *         (-), periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique place index resource name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens
     *            (-), periods (.), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique place index resource name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example, <code>ExamplePlaceIndex</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens
     *            (-), periods (.), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique place index resource name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example, <code>ExamplePlaceIndex</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlaceIndexRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your place index resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @return <p>
     *         Specifies the pricing plan for your place index resource.
     *         </p>
     *         <p>
     *         For additional details and restrictions on each pricing plan
     *         option, see <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location
     *         Service pricing</a>.
     *         </p>
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for your place index resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for your place index resource.
     *            </p>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for your place index resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for your place index resource.
     *            </p>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public CreatePlaceIndexRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your place index resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for your place index resource.
     *            </p>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
    }

    /**
     * <p>
     * Specifies the pricing plan for your place index resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for your place index resource.
     *            </p>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public CreatePlaceIndexRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Applies one or more tags to the place index resource. A tag is a
     *         key-value pair helps manage, identify, search, and filter your
     *         resources by labelling them.
     *         </p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     *         <p>
     *         Restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum 50 tags per resource
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each resource tag must be unique with a maximum of one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *         following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            Applies one or more tags to the place index resource. A tag is
     *            a key-value pair helps manage, identify, search, and filter
     *            your resources by labelling them.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     *            <p>
     *            Restrictions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum 50 tags per resource
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each resource tag must be unique with a maximum of one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length: 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length: 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Applies one or more tags to the place index resource. A tag is
     *            a key-value pair helps manage, identify, search, and filter
     *            your resources by labelling them.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     *            <p>
     *            Restrictions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum 50 tags per resource
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each resource tag must be unique with a maximum of one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length: 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length: 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlaceIndexRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlaceIndexRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreatePlaceIndexRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: " + getDataSourceConfiguration() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlaceIndexRequest == false)
            return false;
        CreatePlaceIndexRequest other = (CreatePlaceIndexRequest) obj;

        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDataSourceConfiguration() == null ^ this.getDataSourceConfiguration() == null)
            return false;
        if (other.getDataSourceConfiguration() != null
                && other.getDataSourceConfiguration().equals(this.getDataSourceConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null
                && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
