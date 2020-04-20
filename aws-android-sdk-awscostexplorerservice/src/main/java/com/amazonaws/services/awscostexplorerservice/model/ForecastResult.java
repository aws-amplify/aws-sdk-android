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

/**
 * <p>
 * The forecast created for your query.
 * </p>
 */
public class ForecastResult implements Serializable {
    /**
     * <p>
     * The period of time that the forecast covers.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * The mean value of the forecast.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String meanValue;

    /**
     * <p>
     * The lower limit for the prediction interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String predictionIntervalLowerBound;

    /**
     * <p>
     * The upper limit for the prediction interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String predictionIntervalUpperBound;

    /**
     * <p>
     * The period of time that the forecast covers.
     * </p>
     *
     * @return <p>
     *         The period of time that the forecast covers.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The period of time that the forecast covers.
     * </p>
     *
     * @param timePeriod <p>
     *            The period of time that the forecast covers.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time that the forecast covers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The period of time that the forecast covers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastResult withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * The mean value of the forecast.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The mean value of the forecast.
     *         </p>
     */
    public String getMeanValue() {
        return meanValue;
    }

    /**
     * <p>
     * The mean value of the forecast.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param meanValue <p>
     *            The mean value of the forecast.
     *            </p>
     */
    public void setMeanValue(String meanValue) {
        this.meanValue = meanValue;
    }

    /**
     * <p>
     * The mean value of the forecast.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param meanValue <p>
     *            The mean value of the forecast.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastResult withMeanValue(String meanValue) {
        this.meanValue = meanValue;
        return this;
    }

    /**
     * <p>
     * The lower limit for the prediction interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The lower limit for the prediction interval.
     *         </p>
     */
    public String getPredictionIntervalLowerBound() {
        return predictionIntervalLowerBound;
    }

    /**
     * <p>
     * The lower limit for the prediction interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param predictionIntervalLowerBound <p>
     *            The lower limit for the prediction interval.
     *            </p>
     */
    public void setPredictionIntervalLowerBound(String predictionIntervalLowerBound) {
        this.predictionIntervalLowerBound = predictionIntervalLowerBound;
    }

    /**
     * <p>
     * The lower limit for the prediction interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param predictionIntervalLowerBound <p>
     *            The lower limit for the prediction interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastResult withPredictionIntervalLowerBound(String predictionIntervalLowerBound) {
        this.predictionIntervalLowerBound = predictionIntervalLowerBound;
        return this;
    }

    /**
     * <p>
     * The upper limit for the prediction interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The upper limit for the prediction interval.
     *         </p>
     */
    public String getPredictionIntervalUpperBound() {
        return predictionIntervalUpperBound;
    }

    /**
     * <p>
     * The upper limit for the prediction interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param predictionIntervalUpperBound <p>
     *            The upper limit for the prediction interval.
     *            </p>
     */
    public void setPredictionIntervalUpperBound(String predictionIntervalUpperBound) {
        this.predictionIntervalUpperBound = predictionIntervalUpperBound;
    }

    /**
     * <p>
     * The upper limit for the prediction interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param predictionIntervalUpperBound <p>
     *            The upper limit for the prediction interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastResult withPredictionIntervalUpperBound(String predictionIntervalUpperBound) {
        this.predictionIntervalUpperBound = predictionIntervalUpperBound;
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
        if (getMeanValue() != null)
            sb.append("MeanValue: " + getMeanValue() + ",");
        if (getPredictionIntervalLowerBound() != null)
            sb.append("PredictionIntervalLowerBound: " + getPredictionIntervalLowerBound() + ",");
        if (getPredictionIntervalUpperBound() != null)
            sb.append("PredictionIntervalUpperBound: " + getPredictionIntervalUpperBound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getMeanValue() == null) ? 0 : getMeanValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getPredictionIntervalLowerBound() == null) ? 0
                        : getPredictionIntervalLowerBound().hashCode());
        hashCode = prime
                * hashCode
                + ((getPredictionIntervalUpperBound() == null) ? 0
                        : getPredictionIntervalUpperBound().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastResult == false)
            return false;
        ForecastResult other = (ForecastResult) obj;

        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getMeanValue() == null ^ this.getMeanValue() == null)
            return false;
        if (other.getMeanValue() != null
                && other.getMeanValue().equals(this.getMeanValue()) == false)
            return false;
        if (other.getPredictionIntervalLowerBound() == null
                ^ this.getPredictionIntervalLowerBound() == null)
            return false;
        if (other.getPredictionIntervalLowerBound() != null
                && other.getPredictionIntervalLowerBound().equals(
                        this.getPredictionIntervalLowerBound()) == false)
            return false;
        if (other.getPredictionIntervalUpperBound() == null
                ^ this.getPredictionIntervalUpperBound() == null)
            return false;
        if (other.getPredictionIntervalUpperBound() != null
                && other.getPredictionIntervalUpperBound().equals(
                        this.getPredictionIntervalUpperBound()) == false)
            return false;
        return true;
    }
}
