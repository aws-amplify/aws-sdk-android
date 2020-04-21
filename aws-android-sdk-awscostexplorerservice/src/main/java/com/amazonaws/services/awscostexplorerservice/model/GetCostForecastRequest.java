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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a forecast for how much Amazon Web Services predicts that you will
 * spend over the forecast time period that you select, based on your past
 * costs.
 * </p>
 */
public class GetCostForecastRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The period of time that you want the forecast to cover.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more
     * information about blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * BLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_UNBLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * UNBLENDED_COST
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST,
     * NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY,
     * NORMALIZED_USAGE_AMOUNT
     */
    private String metric;

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of
     * <code>DAILY</code> forecasts or 12 months of <code>MONTHLY</code>
     * forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     */
    private String granularity;

    /**
     * <p>
     * The filters that you want to use to filter your forecast. Cost Explorer
     * API supports all of the Cost Explorer filters.
     * </p>
     */
    private Expression filter;

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can
     * request a prediction interval around the mean by specifying a confidence
     * level. The higher the confidence level, the more confident Cost Explorer
     * is about the actual value falling in the prediction interval. Higher
     * confidence levels result in wider prediction intervals.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51 - 99<br/>
     */
    private Integer predictionIntervalLevel;

    /**
     * <p>
     * The period of time that you want the forecast to cover.
     * </p>
     *
     * @return <p>
     *         The period of time that you want the forecast to cover.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The period of time that you want the forecast to cover.
     * </p>
     *
     * @param timePeriod <p>
     *            The period of time that you want the forecast to cover.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time that you want the forecast to cover.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The period of time that you want the forecast to cover.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostForecastRequest withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more
     * information about blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * BLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_UNBLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * UNBLENDED_COST
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST,
     * NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY,
     * NORMALIZED_USAGE_AMOUNT
     *
     * @return <p>
     *         Which metric Cost Explorer uses to create your forecast. For more
     *         information about blended and unblended rates, see <a href=
     *         "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *         >Why does the "blended" annotation appear on some line items in
     *         my bill?</a>.
     *         </p>
     *         <p>
     *         Valid values for a <code>GetCostForecast</code> call are the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AMORTIZED_COST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BLENDED_COST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NET_AMORTIZED_COST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NET_UNBLENDED_COST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNBLENDED_COST
     *         </p>
     *         </li>
     *         </ul>
     * @see Metric
     */
    public String getMetric() {
        return metric;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more
     * information about blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * BLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_UNBLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * UNBLENDED_COST
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST,
     * NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY,
     * NORMALIZED_USAGE_AMOUNT
     *
     * @param metric <p>
     *            Which metric Cost Explorer uses to create your forecast. For
     *            more information about blended and unblended rates, see <a
     *            href=
     *            "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *            >Why does the "blended" annotation appear on some line items
     *            in my bill?</a>.
     *            </p>
     *            <p>
     *            Valid values for a <code>GetCostForecast</code> call are the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AMORTIZED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            BLENDED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_AMORTIZED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_UNBLENDED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNBLENDED_COST
     *            </p>
     *            </li>
     *            </ul>
     * @see Metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more
     * information about blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * BLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_UNBLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * UNBLENDED_COST
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST,
     * NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY,
     * NORMALIZED_USAGE_AMOUNT
     *
     * @param metric <p>
     *            Which metric Cost Explorer uses to create your forecast. For
     *            more information about blended and unblended rates, see <a
     *            href=
     *            "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *            >Why does the "blended" annotation appear on some line items
     *            in my bill?</a>.
     *            </p>
     *            <p>
     *            Valid values for a <code>GetCostForecast</code> call are the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AMORTIZED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            BLENDED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_AMORTIZED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_UNBLENDED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNBLENDED_COST
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Metric
     */
    public GetCostForecastRequest withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more
     * information about blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * BLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_UNBLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * UNBLENDED_COST
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST,
     * NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY,
     * NORMALIZED_USAGE_AMOUNT
     *
     * @param metric <p>
     *            Which metric Cost Explorer uses to create your forecast. For
     *            more information about blended and unblended rates, see <a
     *            href=
     *            "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *            >Why does the "blended" annotation appear on some line items
     *            in my bill?</a>.
     *            </p>
     *            <p>
     *            Valid values for a <code>GetCostForecast</code> call are the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AMORTIZED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            BLENDED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_AMORTIZED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_UNBLENDED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNBLENDED_COST
     *            </p>
     *            </li>
     *            </ul>
     * @see Metric
     */
    public void setMetric(Metric metric) {
        this.metric = metric.toString();
    }

    /**
     * <p>
     * Which metric Cost Explorer uses to create your forecast. For more
     * information about blended and unblended rates, see <a href=
     * "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     * >Why does the "blended" annotation appear on some line items in my
     * bill?</a>.
     * </p>
     * <p>
     * Valid values for a <code>GetCostForecast</code> call are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * BLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_AMORTIZED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * NET_UNBLENDED_COST
     * </p>
     * </li>
     * <li>
     * <p>
     * UNBLENDED_COST
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLENDED_COST, UNBLENDED_COST, AMORTIZED_COST,
     * NET_UNBLENDED_COST, NET_AMORTIZED_COST, USAGE_QUANTITY,
     * NORMALIZED_USAGE_AMOUNT
     *
     * @param metric <p>
     *            Which metric Cost Explorer uses to create your forecast. For
     *            more information about blended and unblended rates, see <a
     *            href=
     *            "http://aws.amazon.com/premiumsupport/knowledge-center/blended-rates-intro/"
     *            >Why does the "blended" annotation appear on some line items
     *            in my bill?</a>.
     *            </p>
     *            <p>
     *            Valid values for a <code>GetCostForecast</code> call are the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AMORTIZED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            BLENDED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_AMORTIZED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NET_UNBLENDED_COST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNBLENDED_COST
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Metric
     */
    public GetCostForecastRequest withMetric(Metric metric) {
        this.metric = metric.toString();
        return this;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of
     * <code>DAILY</code> forecasts or 12 months of <code>MONTHLY</code>
     * forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @return <p>
     *         How granular you want the forecast to be. You can get 3 months of
     *         <code>DAILY</code> forecasts or 12 months of <code>MONTHLY</code>
     *         forecasts.
     *         </p>
     *         <p>
     *         The <code>GetCostForecast</code> operation supports only
     *         <code>DAILY</code> and <code>MONTHLY</code> granularities.
     *         </p>
     * @see Granularity
     */
    public String getGranularity() {
        return granularity;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of
     * <code>DAILY</code> forecasts or 12 months of <code>MONTHLY</code>
     * forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            How granular you want the forecast to be. You can get 3 months
     *            of <code>DAILY</code> forecasts or 12 months of
     *            <code>MONTHLY</code> forecasts.
     *            </p>
     *            <p>
     *            The <code>GetCostForecast</code> operation supports only
     *            <code>DAILY</code> and <code>MONTHLY</code> granularities.
     *            </p>
     * @see Granularity
     */
    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of
     * <code>DAILY</code> forecasts or 12 months of <code>MONTHLY</code>
     * forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            How granular you want the forecast to be. You can get 3 months
     *            of <code>DAILY</code> forecasts or 12 months of
     *            <code>MONTHLY</code> forecasts.
     *            </p>
     *            <p>
     *            The <code>GetCostForecast</code> operation supports only
     *            <code>DAILY</code> and <code>MONTHLY</code> granularities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Granularity
     */
    public GetCostForecastRequest withGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of
     * <code>DAILY</code> forecasts or 12 months of <code>MONTHLY</code>
     * forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            How granular you want the forecast to be. You can get 3 months
     *            of <code>DAILY</code> forecasts or 12 months of
     *            <code>MONTHLY</code> forecasts.
     *            </p>
     *            <p>
     *            The <code>GetCostForecast</code> operation supports only
     *            <code>DAILY</code> and <code>MONTHLY</code> granularities.
     *            </p>
     * @see Granularity
     */
    public void setGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
    }

    /**
     * <p>
     * How granular you want the forecast to be. You can get 3 months of
     * <code>DAILY</code> forecasts or 12 months of <code>MONTHLY</code>
     * forecasts.
     * </p>
     * <p>
     * The <code>GetCostForecast</code> operation supports only
     * <code>DAILY</code> and <code>MONTHLY</code> granularities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, MONTHLY, HOURLY
     *
     * @param granularity <p>
     *            How granular you want the forecast to be. You can get 3 months
     *            of <code>DAILY</code> forecasts or 12 months of
     *            <code>MONTHLY</code> forecasts.
     *            </p>
     *            <p>
     *            The <code>GetCostForecast</code> operation supports only
     *            <code>DAILY</code> and <code>MONTHLY</code> granularities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Granularity
     */
    public GetCostForecastRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. Cost Explorer
     * API supports all of the Cost Explorer filters.
     * </p>
     *
     * @return <p>
     *         The filters that you want to use to filter your forecast. Cost
     *         Explorer API supports all of the Cost Explorer filters.
     *         </p>
     */
    public Expression getFilter() {
        return filter;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. Cost Explorer
     * API supports all of the Cost Explorer filters.
     * </p>
     *
     * @param filter <p>
     *            The filters that you want to use to filter your forecast. Cost
     *            Explorer API supports all of the Cost Explorer filters.
     *            </p>
     */
    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filters that you want to use to filter your forecast. Cost Explorer
     * API supports all of the Cost Explorer filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The filters that you want to use to filter your forecast. Cost
     *            Explorer API supports all of the Cost Explorer filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostForecastRequest withFilter(Expression filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can
     * request a prediction interval around the mean by specifying a confidence
     * level. The higher the confidence level, the more confident Cost Explorer
     * is about the actual value falling in the prediction interval. Higher
     * confidence levels result in wider prediction intervals.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51 - 99<br/>
     *
     * @return <p>
     *         Cost Explorer always returns the mean forecast as a single point.
     *         You can request a prediction interval around the mean by
     *         specifying a confidence level. The higher the confidence level,
     *         the more confident Cost Explorer is about the actual value
     *         falling in the prediction interval. Higher confidence levels
     *         result in wider prediction intervals.
     *         </p>
     */
    public Integer getPredictionIntervalLevel() {
        return predictionIntervalLevel;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can
     * request a prediction interval around the mean by specifying a confidence
     * level. The higher the confidence level, the more confident Cost Explorer
     * is about the actual value falling in the prediction interval. Higher
     * confidence levels result in wider prediction intervals.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51 - 99<br/>
     *
     * @param predictionIntervalLevel <p>
     *            Cost Explorer always returns the mean forecast as a single
     *            point. You can request a prediction interval around the mean
     *            by specifying a confidence level. The higher the confidence
     *            level, the more confident Cost Explorer is about the actual
     *            value falling in the prediction interval. Higher confidence
     *            levels result in wider prediction intervals.
     *            </p>
     */
    public void setPredictionIntervalLevel(Integer predictionIntervalLevel) {
        this.predictionIntervalLevel = predictionIntervalLevel;
    }

    /**
     * <p>
     * Cost Explorer always returns the mean forecast as a single point. You can
     * request a prediction interval around the mean by specifying a confidence
     * level. The higher the confidence level, the more confident Cost Explorer
     * is about the actual value falling in the prediction interval. Higher
     * confidence levels result in wider prediction intervals.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>51 - 99<br/>
     *
     * @param predictionIntervalLevel <p>
     *            Cost Explorer always returns the mean forecast as a single
     *            point. You can request a prediction interval around the mean
     *            by specifying a confidence level. The higher the confidence
     *            level, the more confident Cost Explorer is about the actual
     *            value falling in the prediction interval. Higher confidence
     *            levels result in wider prediction intervals.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostForecastRequest withPredictionIntervalLevel(Integer predictionIntervalLevel) {
        this.predictionIntervalLevel = predictionIntervalLevel;
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
        if (getMetric() != null)
            sb.append("Metric: " + getMetric() + ",");
        if (getGranularity() != null)
            sb.append("Granularity: " + getGranularity() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getPredictionIntervalLevel() != null)
            sb.append("PredictionIntervalLevel: " + getPredictionIntervalLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode
                + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime
                * hashCode
                + ((getPredictionIntervalLevel() == null) ? 0 : getPredictionIntervalLevel()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostForecastRequest == false)
            return false;
        GetCostForecastRequest other = (GetCostForecastRequest) obj;

        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null
                && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getPredictionIntervalLevel() == null ^ this.getPredictionIntervalLevel() == null)
            return false;
        if (other.getPredictionIntervalLevel() != null
                && other.getPredictionIntervalLevel().equals(this.getPredictionIntervalLevel()) == false)
            return false;
        return true;
    }
}
