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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Activates the gateway you previously deployed on your host. In the activation
 * process, you specify information such as the AWS Region that you want to use
 * for storing snapshots or tapes, the time zone for scheduled snapshots the
 * gateway snapshot schedule window, an activation key, and a name for your
 * gateway. The activation process also associates your gateway with your
 * account; for more information, see <a>UpdateGatewayInformation</a>.
 * </p>
 * <note>
 * <p>
 * You must turn on the gateway VM before you can activate your gateway.
 * </p>
 * </note>
 */
public class ActivateGatewayRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending
     * an HTTP GET request with redirects enabled to the gateway IP address
     * (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other activation-related
     * parameters, however, these are merely defaults -- the arguments you pass
     * to the <code>ActivateGateway</code> API call determine the actual
     * configuration of your gateway.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest
     * /userguide/get-activation-key.html in the Storage Gateway User Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String activationKey;

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     */
    private String gatewayName;

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The
     * time zone is of the format "GMT-hr:mm" or "GMT+hr:mm". For example,
     * GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the
     * time is 2 hours ahead of GMT. The time zone is used, for example, for
     * scheduling snapshots and your gateway's maintenance schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     */
    private String gatewayTimezone;

    /**
     * <p>
     * A value that indicates the AWS Region where you want to store your data.
     * The gateway AWS Region specified must be the same AWS Region as the AWS
     * Region in your <code>Host</code> header in the request. For more
     * information about available AWS Regions and endpoints for AWS Storage
     * Gateway, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * Valid Values: See <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS
     * Storage Gateway Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private String gatewayRegion;

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified
     * is critical to all later functions of the gateway and cannot be changed
     * after activation. The default value is <code>CACHED</code>.
     * </p>
     * <p>
     * Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     */
    private String gatewayType;

    /**
     * <p>
     * The value that indicates the type of tape drive to use for tape gateway.
     * This field is optional.
     * </p>
     * <p>
     * Valid Values: "IBM-ULT3580-TD5"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     */
    private String tapeDriveType;

    /**
     * <p>
     * The value that indicates the type of medium changer to use for tape
     * gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     */
    private String mediumChangerType;

    /**
     * <p>
     * A list of up to 50 tags that you can assign to the gateway. Each tag is a
     * key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * can be represented in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending
     * an HTTP GET request with redirects enabled to the gateway IP address
     * (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other activation-related
     * parameters, however, these are merely defaults -- the arguments you pass
     * to the <code>ActivateGateway</code> API call determine the actual
     * configuration of your gateway.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest
     * /userguide/get-activation-key.html in the Storage Gateway User Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         Your gateway activation key. You can obtain the activation key by
     *         sending an HTTP GET request with redirects enabled to the gateway
     *         IP address (port 80). The redirect URL returned in the response
     *         provides you the activation key for your gateway in the query
     *         string parameter <code>activationKey</code>. It may also include
     *         other activation-related parameters, however, these are merely
     *         defaults -- the arguments you pass to the
     *         <code>ActivateGateway</code> API call determine the actual
     *         configuration of your gateway.
     *         </p>
     *         <p>
     *         For more information, see
     *         https://docs.aws.amazon.com/storagegateway
     *         /latest/userguide/get-activation-key.html in the Storage Gateway
     *         User Guide.
     *         </p>
     */
    public String getActivationKey() {
        return activationKey;
    }

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending
     * an HTTP GET request with redirects enabled to the gateway IP address
     * (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other activation-related
     * parameters, however, these are merely defaults -- the arguments you pass
     * to the <code>ActivateGateway</code> API call determine the actual
     * configuration of your gateway.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest
     * /userguide/get-activation-key.html in the Storage Gateway User Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param activationKey <p>
     *            Your gateway activation key. You can obtain the activation key
     *            by sending an HTTP GET request with redirects enabled to the
     *            gateway IP address (port 80). The redirect URL returned in the
     *            response provides you the activation key for your gateway in
     *            the query string parameter <code>activationKey</code>. It may
     *            also include other activation-related parameters, however,
     *            these are merely defaults -- the arguments you pass to the
     *            <code>ActivateGateway</code> API call determine the actual
     *            configuration of your gateway.
     *            </p>
     *            <p>
     *            For more information, see
     *            https://docs.aws.amazon.com/storagegateway
     *            /latest/userguide/get-activation-key.html in the Storage
     *            Gateway User Guide.
     *            </p>
     */
    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending
     * an HTTP GET request with redirects enabled to the gateway IP address
     * (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other activation-related
     * parameters, however, these are merely defaults -- the arguments you pass
     * to the <code>ActivateGateway</code> API call determine the actual
     * configuration of your gateway.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest
     * /userguide/get-activation-key.html in the Storage Gateway User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param activationKey <p>
     *            Your gateway activation key. You can obtain the activation key
     *            by sending an HTTP GET request with redirects enabled to the
     *            gateway IP address (port 80). The redirect URL returned in the
     *            response provides you the activation key for your gateway in
     *            the query string parameter <code>activationKey</code>. It may
     *            also include other activation-related parameters, however,
     *            these are merely defaults -- the arguments you pass to the
     *            <code>ActivateGateway</code> API call determine the actual
     *            configuration of your gateway.
     *            </p>
     *            <p>
     *            For more information, see
     *            https://docs.aws.amazon.com/storagegateway
     *            /latest/userguide/get-activation-key.html in the Storage
     *            Gateway User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withActivationKey(String activationKey) {
        this.activationKey = activationKey;
        return this;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @return <p>
     *         The name you configured for your gateway.
     *         </p>
     */
    public String getGatewayName() {
        return gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @param gatewayName <p>
     *            The name you configured for your gateway.
     *            </p>
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @param gatewayName <p>
     *            The name you configured for your gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The
     * time zone is of the format "GMT-hr:mm" or "GMT+hr:mm". For example,
     * GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the
     * time is 2 hours ahead of GMT. The time zone is used, for example, for
     * scheduling snapshots and your gateway's maintenance schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return <p>
     *         A value that indicates the time zone you want to set for the
     *         gateway. The time zone is of the format "GMT-hr:mm" or
     *         "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours
     *         behind GMT. GMT+2:00 indicates the time is 2 hours ahead of GMT.
     *         The time zone is used, for example, for scheduling snapshots and
     *         your gateway's maintenance schedule.
     *         </p>
     */
    public String getGatewayTimezone() {
        return gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The
     * time zone is of the format "GMT-hr:mm" or "GMT+hr:mm". For example,
     * GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the
     * time is 2 hours ahead of GMT. The time zone is used, for example, for
     * scheduling snapshots and your gateway's maintenance schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone <p>
     *            A value that indicates the time zone you want to set for the
     *            gateway. The time zone is of the format "GMT-hr:mm" or
     *            "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4
     *            hours behind GMT. GMT+2:00 indicates the time is 2 hours ahead
     *            of GMT. The time zone is used, for example, for scheduling
     *            snapshots and your gateway's maintenance schedule.
     *            </p>
     */
    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The
     * time zone is of the format "GMT-hr:mm" or "GMT+hr:mm". For example,
     * GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the
     * time is 2 hours ahead of GMT. The time zone is used, for example, for
     * scheduling snapshots and your gateway's maintenance schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone <p>
     *            A value that indicates the time zone you want to set for the
     *            gateway. The time zone is of the format "GMT-hr:mm" or
     *            "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4
     *            hours behind GMT. GMT+2:00 indicates the time is 2 hours ahead
     *            of GMT. The time zone is used, for example, for scheduling
     *            snapshots and your gateway's maintenance schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
        return this;
    }

    /**
     * <p>
     * A value that indicates the AWS Region where you want to store your data.
     * The gateway AWS Region specified must be the same AWS Region as the AWS
     * Region in your <code>Host</code> header in the request. For more
     * information about available AWS Regions and endpoints for AWS Storage
     * Gateway, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * Valid Values: See <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS
     * Storage Gateway Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return <p>
     *         A value that indicates the AWS Region where you want to store
     *         your data. The gateway AWS Region specified must be the same AWS
     *         Region as the AWS Region in your <code>Host</code> header in the
     *         request. For more information about available AWS Regions and
     *         endpoints for AWS Storage Gateway, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *         >Regions and Endpoints</a> in the <i>Amazon Web Services
     *         Glossary</i>.
     *         </p>
     *         <p>
     *         Valid Values: See <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *         >AWS Storage Gateway Regions and Endpoints</a> in the AWS General
     *         Reference.
     *         </p>
     */
    public String getGatewayRegion() {
        return gatewayRegion;
    }

    /**
     * <p>
     * A value that indicates the AWS Region where you want to store your data.
     * The gateway AWS Region specified must be the same AWS Region as the AWS
     * Region in your <code>Host</code> header in the request. For more
     * information about available AWS Regions and endpoints for AWS Storage
     * Gateway, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * Valid Values: See <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS
     * Storage Gateway Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param gatewayRegion <p>
     *            A value that indicates the AWS Region where you want to store
     *            your data. The gateway AWS Region specified must be the same
     *            AWS Region as the AWS Region in your <code>Host</code> header
     *            in the request. For more information about available AWS
     *            Regions and endpoints for AWS Storage Gateway, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *            >Regions and Endpoints</a> in the <i>Amazon Web Services
     *            Glossary</i>.
     *            </p>
     *            <p>
     *            Valid Values: See <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *            >AWS Storage Gateway Regions and Endpoints</a> in the AWS
     *            General Reference.
     *            </p>
     */
    public void setGatewayRegion(String gatewayRegion) {
        this.gatewayRegion = gatewayRegion;
    }

    /**
     * <p>
     * A value that indicates the AWS Region where you want to store your data.
     * The gateway AWS Region specified must be the same AWS Region as the AWS
     * Region in your <code>Host</code> header in the request. For more
     * information about available AWS Regions and endpoints for AWS Storage
     * Gateway, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * Valid Values: See <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS
     * Storage Gateway Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param gatewayRegion <p>
     *            A value that indicates the AWS Region where you want to store
     *            your data. The gateway AWS Region specified must be the same
     *            AWS Region as the AWS Region in your <code>Host</code> header
     *            in the request. For more information about available AWS
     *            Regions and endpoints for AWS Storage Gateway, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *            >Regions and Endpoints</a> in the <i>Amazon Web Services
     *            Glossary</i>.
     *            </p>
     *            <p>
     *            Valid Values: See <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *            >AWS Storage Gateway Regions and Endpoints</a> in the AWS
     *            General Reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withGatewayRegion(String gatewayRegion) {
        this.gatewayRegion = gatewayRegion;
        return this;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified
     * is critical to all later functions of the gateway and cannot be changed
     * after activation. The default value is <code>CACHED</code>.
     * </p>
     * <p>
     * Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @return <p>
     *         A value that defines the type of gateway to activate. The type
     *         specified is critical to all later functions of the gateway and
     *         cannot be changed after activation. The default value is
     *         <code>CACHED</code>.
     *         </p>
     *         <p>
     *         Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     *         </p>
     */
    public String getGatewayType() {
        return gatewayType;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified
     * is critical to all later functions of the gateway and cannot be changed
     * after activation. The default value is <code>CACHED</code>.
     * </p>
     * <p>
     * Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType <p>
     *            A value that defines the type of gateway to activate. The type
     *            specified is critical to all later functions of the gateway
     *            and cannot be changed after activation. The default value is
     *            <code>CACHED</code>.
     *            </p>
     *            <p>
     *            Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     *            </p>
     */
    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified
     * is critical to all later functions of the gateway and cannot be changed
     * after activation. The default value is <code>CACHED</code>.
     * </p>
     * <p>
     * Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType <p>
     *            A value that defines the type of gateway to activate. The type
     *            specified is critical to all later functions of the gateway
     *            and cannot be changed after activation. The default value is
     *            <code>CACHED</code>.
     *            </p>
     *            <p>
     *            Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for tape gateway.
     * This field is optional.
     * </p>
     * <p>
     * Valid Values: "IBM-ULT3580-TD5"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @return <p>
     *         The value that indicates the type of tape drive to use for tape
     *         gateway. This field is optional.
     *         </p>
     *         <p>
     *         Valid Values: "IBM-ULT3580-TD5"
     *         </p>
     */
    public String getTapeDriveType() {
        return tapeDriveType;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for tape gateway.
     * This field is optional.
     * </p>
     * <p>
     * Valid Values: "IBM-ULT3580-TD5"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param tapeDriveType <p>
     *            The value that indicates the type of tape drive to use for
     *            tape gateway. This field is optional.
     *            </p>
     *            <p>
     *            Valid Values: "IBM-ULT3580-TD5"
     *            </p>
     */
    public void setTapeDriveType(String tapeDriveType) {
        this.tapeDriveType = tapeDriveType;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for tape gateway.
     * This field is optional.
     * </p>
     * <p>
     * Valid Values: "IBM-ULT3580-TD5"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param tapeDriveType <p>
     *            The value that indicates the type of tape drive to use for
     *            tape gateway. This field is optional.
     *            </p>
     *            <p>
     *            Valid Values: "IBM-ULT3580-TD5"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withTapeDriveType(String tapeDriveType) {
        this.tapeDriveType = tapeDriveType;
        return this;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for tape
     * gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @return <p>
     *         The value that indicates the type of medium changer to use for
     *         tape gateway. This field is optional.
     *         </p>
     *         <p>
     *         Valid Values: "STK-L700", "AWS-Gateway-VTL"
     *         </p>
     */
    public String getMediumChangerType() {
        return mediumChangerType;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for tape
     * gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param mediumChangerType <p>
     *            The value that indicates the type of medium changer to use for
     *            tape gateway. This field is optional.
     *            </p>
     *            <p>
     *            Valid Values: "STK-L700", "AWS-Gateway-VTL"
     *            </p>
     */
    public void setMediumChangerType(String mediumChangerType) {
        this.mediumChangerType = mediumChangerType;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for tape
     * gateway. This field is optional.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param mediumChangerType <p>
     *            The value that indicates the type of medium changer to use for
     *            tape gateway. This field is optional.
     *            </p>
     *            <p>
     *            Valid Values: "STK-L700", "AWS-Gateway-VTL"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withMediumChangerType(String mediumChangerType) {
        this.mediumChangerType = mediumChangerType;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that you can assign to the gateway. Each tag is a
     * key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * can be represented in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of up to 50 tags that you can assign to the gateway. Each
     *         tag is a key-value pair.
     *         </p>
     *         <note>
     *         <p>
     *         Valid characters for key and value are letters, spaces, and
     *         numbers that can be represented in UTF-8 format, and the
     *         following special characters: + - = . _ : / @. The maximum length
     *         of a tag's key is 128 characters, and the maximum length for a
     *         tag's value is 256 characters.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags that you can assign to the gateway. Each tag is a
     * key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * can be represented in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            A list of up to 50 tags that you can assign to the gateway.
     *            Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers that can be represented in UTF-8 format, and the
     *            following special characters: + - = . _ : / @. The maximum
     *            length of a tag's key is 128 characters, and the maximum
     *            length for a tag's value is 256 characters.
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags that you can assign to the gateway. Each tag is a
     * key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * can be represented in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags that you can assign to the gateway.
     *            Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers that can be represented in UTF-8 format, and the
     *            following special characters: + - = . _ : / @. The maximum
     *            length of a tag's key is 128 characters, and the maximum
     *            length for a tag's value is 256 characters.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that you can assign to the gateway. Each tag is a
     * key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * can be represented in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags that you can assign to the gateway.
     *            Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers that can be represented in UTF-8 format, and the
     *            following special characters: + - = . _ : / @. The maximum
     *            length of a tag's key is 128 characters, and the maximum
     *            length for a tag's value is 256 characters.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivateGatewayRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getActivationKey() != null)
            sb.append("ActivationKey: " + getActivationKey() + ",");
        if (getGatewayName() != null)
            sb.append("GatewayName: " + getGatewayName() + ",");
        if (getGatewayTimezone() != null)
            sb.append("GatewayTimezone: " + getGatewayTimezone() + ",");
        if (getGatewayRegion() != null)
            sb.append("GatewayRegion: " + getGatewayRegion() + ",");
        if (getGatewayType() != null)
            sb.append("GatewayType: " + getGatewayType() + ",");
        if (getTapeDriveType() != null)
            sb.append("TapeDriveType: " + getTapeDriveType() + ",");
        if (getMediumChangerType() != null)
            sb.append("MediumChangerType: " + getMediumChangerType() + ",");
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
                + ((getActivationKey() == null) ? 0 : getActivationKey().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayRegion() == null) ? 0 : getGatewayRegion().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime * hashCode
                + ((getTapeDriveType() == null) ? 0 : getTapeDriveType().hashCode());
        hashCode = prime * hashCode
                + ((getMediumChangerType() == null) ? 0 : getMediumChangerType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivateGatewayRequest == false)
            return false;
        ActivateGatewayRequest other = (ActivateGatewayRequest) obj;

        if (other.getActivationKey() == null ^ this.getActivationKey() == null)
            return false;
        if (other.getActivationKey() != null
                && other.getActivationKey().equals(this.getActivationKey()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null
                && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayTimezone() == null ^ this.getGatewayTimezone() == null)
            return false;
        if (other.getGatewayTimezone() != null
                && other.getGatewayTimezone().equals(this.getGatewayTimezone()) == false)
            return false;
        if (other.getGatewayRegion() == null ^ this.getGatewayRegion() == null)
            return false;
        if (other.getGatewayRegion() != null
                && other.getGatewayRegion().equals(this.getGatewayRegion()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null
                && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getTapeDriveType() == null ^ this.getTapeDriveType() == null)
            return false;
        if (other.getTapeDriveType() != null
                && other.getTapeDriveType().equals(this.getTapeDriveType()) == false)
            return false;
        if (other.getMediumChangerType() == null ^ this.getMediumChangerType() == null)
            return false;
        if (other.getMediumChangerType() != null
                && other.getMediumChangerType().equals(this.getMediumChangerType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
