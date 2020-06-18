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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the response to a <code>TestDNSAnswer</code>
 * request.
 * </p>
 */
public class TestDNSAnswerResult implements Serializable {
    /**
     * <p>
     * The Amazon Route 53 name server used to respond to the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String nameserver;

    /**
     * <p>
     * The name of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String recordName;

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     */
    private String recordType;

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this
     * resource record set.
     * </p>
     */
    private java.util.List<String> recordData;

    /**
     * <p>
     * A code that indicates whether the request is valid or not. The most
     * common response code is <code>NOERROR</code>, meaning that the request is
     * valid. If the response is not valid, Amazon Route 53 returns a response
     * code that describes the error. For a list of possible response codes, see
     * <a href=
     * "http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6"
     * >DNS RCODES</a> on the IANA website.
     * </p>
     */
    private String responseCode;

    /**
     * <p>
     * The protocol that Amazon Route 53 used to respond to the request, either
     * <code>UDP</code> or <code>TCP</code>.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The Amazon Route 53 name server used to respond to the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return <p>
     *         The Amazon Route 53 name server used to respond to the request.
     *         </p>
     */
    public String getNameserver() {
        return nameserver;
    }

    /**
     * <p>
     * The Amazon Route 53 name server used to respond to the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param nameserver <p>
     *            The Amazon Route 53 name server used to respond to the
     *            request.
     *            </p>
     */
    public void setNameserver(String nameserver) {
        this.nameserver = nameserver;
    }

    /**
     * <p>
     * The Amazon Route 53 name server used to respond to the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param nameserver <p>
     *            The Amazon Route 53 name server used to respond to the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestDNSAnswerResult withNameserver(String nameserver) {
        this.nameserver = nameserver;
        return this;
    }

    /**
     * <p>
     * The name of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name of the resource record set that you submitted a request
     *         for.
     *         </p>
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * <p>
     * The name of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param recordName <p>
     *            The name of the resource record set that you submitted a
     *            request for.
     *            </p>
     */
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    /**
     * <p>
     * The name of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param recordName <p>
     *            The name of the resource record set that you submitted a
     *            request for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestDNSAnswerResult withRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @return <p>
     *         The type of the resource record set that you submitted a request
     *         for.
     *         </p>
     * @see RRType
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param recordType <p>
     *            The type of the resource record set that you submitted a
     *            request for.
     *            </p>
     * @see RRType
     */
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param recordType <p>
     *            The type of the resource record set that you submitted a
     *            request for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TestDNSAnswerResult withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param recordType <p>
     *            The type of the resource record set that you submitted a
     *            request for.
     *            </p>
     * @see RRType
     */
    public void setRecordType(RRType recordType) {
        this.recordType = recordType.toString();
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param recordType <p>
     *            The type of the resource record set that you submitted a
     *            request for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TestDNSAnswerResult withRecordType(RRType recordType) {
        this.recordType = recordType.toString();
        return this;
    }

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this
     * resource record set.
     * </p>
     *
     * @return <p>
     *         A list that contains values that Amazon Route 53 returned for
     *         this resource record set.
     *         </p>
     */
    public java.util.List<String> getRecordData() {
        return recordData;
    }

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this
     * resource record set.
     * </p>
     *
     * @param recordData <p>
     *            A list that contains values that Amazon Route 53 returned for
     *            this resource record set.
     *            </p>
     */
    public void setRecordData(java.util.Collection<String> recordData) {
        if (recordData == null) {
            this.recordData = null;
            return;
        }

        this.recordData = new java.util.ArrayList<String>(recordData);
    }

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this
     * resource record set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordData <p>
     *            A list that contains values that Amazon Route 53 returned for
     *            this resource record set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestDNSAnswerResult withRecordData(String... recordData) {
        if (getRecordData() == null) {
            this.recordData = new java.util.ArrayList<String>(recordData.length);
        }
        for (String value : recordData) {
            this.recordData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this
     * resource record set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordData <p>
     *            A list that contains values that Amazon Route 53 returned for
     *            this resource record set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestDNSAnswerResult withRecordData(java.util.Collection<String> recordData) {
        setRecordData(recordData);
        return this;
    }

    /**
     * <p>
     * A code that indicates whether the request is valid or not. The most
     * common response code is <code>NOERROR</code>, meaning that the request is
     * valid. If the response is not valid, Amazon Route 53 returns a response
     * code that describes the error. For a list of possible response codes, see
     * <a href=
     * "http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6"
     * >DNS RCODES</a> on the IANA website.
     * </p>
     *
     * @return <p>
     *         A code that indicates whether the request is valid or not. The
     *         most common response code is <code>NOERROR</code>, meaning that
     *         the request is valid. If the response is not valid, Amazon Route
     *         53 returns a response code that describes the error. For a list
     *         of possible response codes, see <a href=
     *         "http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6"
     *         >DNS RCODES</a> on the IANA website.
     *         </p>
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * <p>
     * A code that indicates whether the request is valid or not. The most
     * common response code is <code>NOERROR</code>, meaning that the request is
     * valid. If the response is not valid, Amazon Route 53 returns a response
     * code that describes the error. For a list of possible response codes, see
     * <a href=
     * "http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6"
     * >DNS RCODES</a> on the IANA website.
     * </p>
     *
     * @param responseCode <p>
     *            A code that indicates whether the request is valid or not. The
     *            most common response code is <code>NOERROR</code>, meaning
     *            that the request is valid. If the response is not valid,
     *            Amazon Route 53 returns a response code that describes the
     *            error. For a list of possible response codes, see <a href=
     *            "http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6"
     *            >DNS RCODES</a> on the IANA website.
     *            </p>
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * A code that indicates whether the request is valid or not. The most
     * common response code is <code>NOERROR</code>, meaning that the request is
     * valid. If the response is not valid, Amazon Route 53 returns a response
     * code that describes the error. For a list of possible response codes, see
     * <a href=
     * "http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6"
     * >DNS RCODES</a> on the IANA website.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseCode <p>
     *            A code that indicates whether the request is valid or not. The
     *            most common response code is <code>NOERROR</code>, meaning
     *            that the request is valid. If the response is not valid,
     *            Amazon Route 53 returns a response code that describes the
     *            error. For a list of possible response codes, see <a href=
     *            "http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6"
     *            >DNS RCODES</a> on the IANA website.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestDNSAnswerResult withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * <p>
     * The protocol that Amazon Route 53 used to respond to the request, either
     * <code>UDP</code> or <code>TCP</code>.
     * </p>
     *
     * @return <p>
     *         The protocol that Amazon Route 53 used to respond to the request,
     *         either <code>UDP</code> or <code>TCP</code>.
     *         </p>
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol that Amazon Route 53 used to respond to the request, either
     * <code>UDP</code> or <code>TCP</code>.
     * </p>
     *
     * @param protocol <p>
     *            The protocol that Amazon Route 53 used to respond to the
     *            request, either <code>UDP</code> or <code>TCP</code>.
     *            </p>
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol that Amazon Route 53 used to respond to the request, either
     * <code>UDP</code> or <code>TCP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The protocol that Amazon Route 53 used to respond to the
     *            request, either <code>UDP</code> or <code>TCP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestDNSAnswerResult withProtocol(String protocol) {
        this.protocol = protocol;
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
        if (getNameserver() != null)
            sb.append("Nameserver: " + getNameserver() + ",");
        if (getRecordName() != null)
            sb.append("RecordName: " + getRecordName() + ",");
        if (getRecordType() != null)
            sb.append("RecordType: " + getRecordType() + ",");
        if (getRecordData() != null)
            sb.append("RecordData: " + getRecordData() + ",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: " + getResponseCode() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNameserver() == null) ? 0 : getNameserver().hashCode());
        hashCode = prime * hashCode + ((getRecordName() == null) ? 0 : getRecordName().hashCode());
        hashCode = prime * hashCode + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode + ((getRecordData() == null) ? 0 : getRecordData().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestDNSAnswerResult == false)
            return false;
        TestDNSAnswerResult other = (TestDNSAnswerResult) obj;

        if (other.getNameserver() == null ^ this.getNameserver() == null)
            return false;
        if (other.getNameserver() != null
                && other.getNameserver().equals(this.getNameserver()) == false)
            return false;
        if (other.getRecordName() == null ^ this.getRecordName() == null)
            return false;
        if (other.getRecordName() != null
                && other.getRecordName().equals(this.getRecordName()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null
                && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getRecordData() == null ^ this.getRecordData() == null)
            return false;
        if (other.getRecordData() != null
                && other.getRecordData().equals(this.getRecordData()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null
                && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }
}
