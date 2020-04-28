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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the last failure reason as reported by one
 * Amazon Route 53 health checker.
 * </p>
 */
public class HealthCheckObservation implements Serializable {
    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status
     * in <code>StatusReport</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     */
    private String region;

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that provided the
     * failure reason in <code>StatusReport</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 45<br/>
     * <b>Pattern:
     * </b>(^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}
     * ([0-9]|[1-9]
     * [0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))$|^(([0-9a-fA-F]{1,4}:){7
     * ,7}[0-9a-fA-
     * F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-
     * 9a-fA-F]{1,4
     * }|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F
     * ]{1,4}:){1,4
     * }(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F
     * ]{1,4}){1,4}
     * |([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{
     * 1,4}:((:[0-9
     * a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a
     * -fA-F]{0,4})
     * {0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2
     * [0-4]|1{0,1}
     * [0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-
     * 9])|([0-9a-fA
     * -F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){
     * 3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$)<br/>
     */
    private String iPAddress;

    /**
     * <p>
     * A complex type that contains the last failure reason as reported by one
     * Amazon Route 53 health checker and the time of the failed health check.
     * </p>
     */
    private StatusReport statusReport;

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status
     * in <code>StatusReport</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @return <p>
     *         The region of the Amazon Route 53 health checker that provided
     *         the status in <code>StatusReport</code>.
     *         </p>
     * @see HealthCheckRegion
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status
     * in <code>StatusReport</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @param region <p>
     *            The region of the Amazon Route 53 health checker that provided
     *            the status in <code>StatusReport</code>.
     *            </p>
     * @see HealthCheckRegion
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status
     * in <code>StatusReport</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @param region <p>
     *            The region of the Amazon Route 53 health checker that provided
     *            the status in <code>StatusReport</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthCheckRegion
     */
    public HealthCheckObservation withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status
     * in <code>StatusReport</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @param region <p>
     *            The region of the Amazon Route 53 health checker that provided
     *            the status in <code>StatusReport</code>.
     *            </p>
     * @see HealthCheckRegion
     */
    public void setRegion(HealthCheckRegion region) {
        this.region = region.toString();
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status
     * in <code>StatusReport</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @param region <p>
     *            The region of the Amazon Route 53 health checker that provided
     *            the status in <code>StatusReport</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthCheckRegion
     */
    public HealthCheckObservation withRegion(HealthCheckRegion region) {
        this.region = region.toString();
        return this;
    }

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that provided the
     * failure reason in <code>StatusReport</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 45<br/>
     * <b>Pattern:
     * </b>(^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}
     * ([0-9]|[1-9]
     * [0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))$|^(([0-9a-fA-F]{1,4}:){7
     * ,7}[0-9a-fA-
     * F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-
     * 9a-fA-F]{1,4
     * }|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F
     * ]{1,4}:){1,4
     * }(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F
     * ]{1,4}){1,4}
     * |([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{
     * 1,4}:((:[0-9
     * a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a
     * -fA-F]{0,4})
     * {0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2
     * [0-4]|1{0,1}
     * [0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-
     * 9])|([0-9a-fA
     * -F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){
     * 3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$)<br/>
     *
     * @return <p>
     *         The IP address of the Amazon Route 53 health checker that
     *         provided the failure reason in <code>StatusReport</code>.
     *         </p>
     */
    public String getIPAddress() {
        return iPAddress;
    }

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that provided the
     * failure reason in <code>StatusReport</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 45<br/>
     * <b>Pattern:
     * </b>(^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}
     * ([0-9]|[1-9]
     * [0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))$|^(([0-9a-fA-F]{1,4}:){7
     * ,7}[0-9a-fA-
     * F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-
     * 9a-fA-F]{1,4
     * }|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F
     * ]{1,4}:){1,4
     * }(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F
     * ]{1,4}){1,4}
     * |([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{
     * 1,4}:((:[0-9
     * a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a
     * -fA-F]{0,4})
     * {0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2
     * [0-4]|1{0,1}
     * [0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-
     * 9])|([0-9a-fA
     * -F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){
     * 3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$)<br/>
     *
     * @param iPAddress <p>
     *            The IP address of the Amazon Route 53 health checker that
     *            provided the failure reason in <code>StatusReport</code>.
     *            </p>
     */
    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that provided the
     * failure reason in <code>StatusReport</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 45<br/>
     * <b>Pattern:
     * </b>(^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}
     * ([0-9]|[1-9]
     * [0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))$|^(([0-9a-fA-F]{1,4}:){7
     * ,7}[0-9a-fA-
     * F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-
     * 9a-fA-F]{1,4
     * }|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F
     * ]{1,4}:){1,4
     * }(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F
     * ]{1,4}){1,4}
     * |([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{
     * 1,4}:((:[0-9
     * a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a
     * -fA-F]{0,4})
     * {0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2
     * [0-4]|1{0,1}
     * [0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-
     * 9])|([0-9a-fA
     * -F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){
     * 3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$)<br/>
     *
     * @param iPAddress <p>
     *            The IP address of the Amazon Route 53 health checker that
     *            provided the failure reason in <code>StatusReport</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheckObservation withIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

    /**
     * <p>
     * A complex type that contains the last failure reason as reported by one
     * Amazon Route 53 health checker and the time of the failed health check.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the last failure reason as reported
     *         by one Amazon Route 53 health checker and the time of the failed
     *         health check.
     *         </p>
     */
    public StatusReport getStatusReport() {
        return statusReport;
    }

    /**
     * <p>
     * A complex type that contains the last failure reason as reported by one
     * Amazon Route 53 health checker and the time of the failed health check.
     * </p>
     *
     * @param statusReport <p>
     *            A complex type that contains the last failure reason as
     *            reported by one Amazon Route 53 health checker and the time of
     *            the failed health check.
     *            </p>
     */
    public void setStatusReport(StatusReport statusReport) {
        this.statusReport = statusReport;
    }

    /**
     * <p>
     * A complex type that contains the last failure reason as reported by one
     * Amazon Route 53 health checker and the time of the failed health check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReport <p>
     *            A complex type that contains the last failure reason as
     *            reported by one Amazon Route 53 health checker and the time of
     *            the failed health check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheckObservation withStatusReport(StatusReport statusReport) {
        this.statusReport = statusReport;
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
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getIPAddress() != null)
            sb.append("IPAddress: " + getIPAddress() + ",");
        if (getStatusReport() != null)
            sb.append("StatusReport: " + getStatusReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReport() == null) ? 0 : getStatusReport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckObservation == false)
            return false;
        HealthCheckObservation other = (HealthCheckObservation) obj;

        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getIPAddress() == null ^ this.getIPAddress() == null)
            return false;
        if (other.getIPAddress() != null
                && other.getIPAddress().equals(this.getIPAddress()) == false)
            return false;
        if (other.getStatusReport() == null ^ this.getStatusReport() == null)
            return false;
        if (other.getStatusReport() != null
                && other.getStatusReport().equals(this.getStatusReport()) == false)
            return false;
        return true;
    }
}
