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
 * Creates a route calculator resource in your AWS account.
 * </p>
 * <p>
 * You can send requests to a route calculator resource to estimate travel time,
 * distance, and get directions. A route calculator sources traffic and road
 * network data from your chosen data provider.
 * </p>
 */
public class CreateRouteCalculatorRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods
     * (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique Route calculator resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleRouteCalculator</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String calculatorName;

    /**
     * <p>
     * Specifies the data provider of traffic and road network data.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For
     * example, entering <code>HERE</code> returns an error. Route calculators
     * that use Esri as a data source only calculate routes that are shorter
     * than 400 km.
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
     * "https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm"
     * >Esri details on street networks and traffic coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a>' coverage in your region of interest, see <a href=
     * "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html"
     * >HERE car routing coverage</a> and <a href=
     * "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html"
     * >HERE truck routing coverage</a>.
     * </p>
     * </li>
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
     * The optional description for the route calculator resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies the pricing plan for your route calculator resource.
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
     * Applies one or more tags to the route calculator resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example: { <code>"tag1" : "value1"</code>,
     * <code>"tag2" : "value2"</code>
     * </p>
     * </li>
     * </ul>
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
     * The name of the route calculator resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods
     * (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique Route calculator resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleRouteCalculator</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the route calculator resource.
     *         </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-),
     *         periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique Route calculator resource name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example,
     *         <code>ExampleRouteCalculator</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCalculatorName() {
        return calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods
     * (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique Route calculator resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleRouteCalculator</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param calculatorName <p>
     *            The name of the route calculator resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-),
     *            periods (.), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique Route calculator resource name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>ExampleRouteCalculator</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods
     * (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique Route calculator resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleRouteCalculator</code>.
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
     * @param calculatorName <p>
     *            The name of the route calculator resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-),
     *            periods (.), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique Route calculator resource name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>ExampleRouteCalculator</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteCalculatorRequest withCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
        return this;
    }

    /**
     * <p>
     * Specifies the data provider of traffic and road network data.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For
     * example, entering <code>HERE</code> returns an error. Route calculators
     * that use Esri as a data source only calculate routes that are shorter
     * than 400 km.
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
     * "https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm"
     * >Esri details on street networks and traffic coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a>' coverage in your region of interest, see <a href=
     * "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html"
     * >HERE car routing coverage</a> and <a href=
     * "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html"
     * >HERE truck routing coverage</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional information , see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Data providers</a> on the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the data provider of traffic and road network data.
     *         </p>
     *         <note>
     *         <p>
     *         This field is case-sensitive. Enter the valid values as shown.
     *         For example, entering <code>HERE</code> returns an error. Route
     *         calculators that use Esri as a data source only calculate routes
     *         that are shorter than 400 km.
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
     *         "https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm"
     *         >Esri details on street networks and traffic coverage</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Here</code> – For additional information about <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *         >HERE Technologies</a>' coverage in your region of interest, see
     *         <a href=
     *         "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html"
     *         >HERE car routing coverage</a> and <a href=
     *         "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html"
     *         >HERE truck routing coverage</a>.
     *         </p>
     *         </li>
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
     * Specifies the data provider of traffic and road network data.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For
     * example, entering <code>HERE</code> returns an error. Route calculators
     * that use Esri as a data source only calculate routes that are shorter
     * than 400 km.
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
     * "https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm"
     * >Esri details on street networks and traffic coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a>' coverage in your region of interest, see <a href=
     * "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html"
     * >HERE car routing coverage</a> and <a href=
     * "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html"
     * >HERE truck routing coverage</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional information , see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Data providers</a> on the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     *
     * @param dataSource <p>
     *            Specifies the data provider of traffic and road network data.
     *            </p>
     *            <note>
     *            <p>
     *            This field is case-sensitive. Enter the valid values as shown.
     *            For example, entering <code>HERE</code> returns an error.
     *            Route calculators that use Esri as a data source only
     *            calculate routes that are shorter than 400 km.
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
     *            "https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm"
     *            >Esri details on street networks and traffic coverage</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Here</code> – For additional information about <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies</a>' coverage in your region of interest,
     *            see <a href=
     *            "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html"
     *            >HERE car routing coverage</a> and <a href=
     *            "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html"
     *            >HERE truck routing coverage</a>.
     *            </p>
     *            </li>
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
     * Specifies the data provider of traffic and road network data.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For
     * example, entering <code>HERE</code> returns an error. Route calculators
     * that use Esri as a data source only calculate routes that are shorter
     * than 400 km.
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
     * "https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm"
     * >Esri details on street networks and traffic coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a>' coverage in your region of interest, see <a href=
     * "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html"
     * >HERE car routing coverage</a> and <a href=
     * "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html"
     * >HERE truck routing coverage</a>.
     * </p>
     * </li>
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
     *            Specifies the data provider of traffic and road network data.
     *            </p>
     *            <note>
     *            <p>
     *            This field is case-sensitive. Enter the valid values as shown.
     *            For example, entering <code>HERE</code> returns an error.
     *            Route calculators that use Esri as a data source only
     *            calculate routes that are shorter than 400 km.
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
     *            "https://doc.arcgis.com/en/arcgis-online/reference/network-coverage.htm"
     *            >Esri details on street networks and traffic coverage</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Here</code> – For additional information about <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies</a>' coverage in your region of interest,
     *            see <a href=
     *            "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/car-routing.html"
     *            >HERE car routing coverage</a> and <a href=
     *            "https://developer.here.com/documentation/routing-api/dev_guide/topics/coverage/truck-routing.html"
     *            >HERE truck routing coverage</a>.
     *            </p>
     *            </li>
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
    public CreateRouteCalculatorRequest withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The optional description for the route calculator resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The optional description for the route calculator resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The optional description for the route calculator resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the route calculator resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the route calculator resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the route calculator resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteCalculatorRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your route calculator resource.
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
     *         Specifies the pricing plan for your route calculator resource.
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
     * Specifies the pricing plan for your route calculator resource.
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
     *            Specifies the pricing plan for your route calculator resource.
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
     * Specifies the pricing plan for your route calculator resource.
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
     *            Specifies the pricing plan for your route calculator resource.
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
    public CreateRouteCalculatorRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your route calculator resource.
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
     *            Specifies the pricing plan for your route calculator resource.
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
     * Specifies the pricing plan for your route calculator resource.
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
     *            Specifies the pricing plan for your route calculator resource.
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
    public CreateRouteCalculatorRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the route calculator resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example: { <code>"tag1" : "value1"</code>,
     * <code>"tag2" : "value2"</code>
     * </p>
     * </li>
     * </ul>
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
     *         Applies one or more tags to the route calculator resource. A tag
     *         is a key-value pair helps manage, identify, search, and filter
     *         your resources by labelling them.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example: { <code>"tag1" : "value1"</code>,
     *         <code>"tag2" : "value2"</code>
     *         </p>
     *         </li>
     *         </ul>
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
     * Applies one or more tags to the route calculator resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example: { <code>"tag1" : "value1"</code>,
     * <code>"tag2" : "value2"</code>
     * </p>
     * </li>
     * </ul>
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
     *            Applies one or more tags to the route calculator resource. A
     *            tag is a key-value pair helps manage, identify, search, and
     *            filter your resources by labelling them.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example: { <code>"tag1" : "value1"</code>,
     *            <code>"tag2" : "value2"</code>
     *            </p>
     *            </li>
     *            </ul>
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
     * Applies one or more tags to the route calculator resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example: { <code>"tag1" : "value1"</code>,
     * <code>"tag2" : "value2"</code>
     * </p>
     * </li>
     * </ul>
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
     *            Applies one or more tags to the route calculator resource. A
     *            tag is a key-value pair helps manage, identify, search, and
     *            filter your resources by labelling them.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example: { <code>"tag1" : "value1"</code>,
     *            <code>"tag2" : "value2"</code>
     *            </p>
     *            </li>
     *            </ul>
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
    public CreateRouteCalculatorRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the route calculator resource. A tag is a
     * key-value pair helps manage, identify, search, and filter your resources
     * by labelling them.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example: { <code>"tag1" : "value1"</code>,
     * <code>"tag2" : "value2"</code>
     * </p>
     * </li>
     * </ul>
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
    public CreateRouteCalculatorRequest addTagsEntry(String key, String value) {
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
    public CreateRouteCalculatorRequest clearTagsEntries() {
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
        if (getCalculatorName() != null)
            sb.append("CalculatorName: " + getCalculatorName() + ",");
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
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

        hashCode = prime * hashCode
                + ((getCalculatorName() == null) ? 0 : getCalculatorName().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
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

        if (obj instanceof CreateRouteCalculatorRequest == false)
            return false;
        CreateRouteCalculatorRequest other = (CreateRouteCalculatorRequest) obj;

        if (other.getCalculatorName() == null ^ this.getCalculatorName() == null)
            return false;
        if (other.getCalculatorName() != null
                && other.getCalculatorName().equals(this.getCalculatorName()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
