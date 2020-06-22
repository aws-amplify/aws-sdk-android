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

package com.amazonaws.services.rds;

import org.w3c.dom.*;

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.services.rds.model.transform.*;

/**
 * Client for accessing Amazon Relational Database Service. All service calls
 * made using this client are blocking, and will not return until the service
 * call completes.
 * <p>
 * <fullname>Amazon Relational Database Service</fullname>
 * <p>
 * </p>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes
 * it easier to set up, operate, and scale a relational database in the cloud.
 * It provides cost-efficient, resizeable capacity for an industry-standard
 * relational database and manages common database administration tasks, freeing
 * up developers to focus on what makes their applications and businesses
 * unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB,
 * PostgreSQL, Microsoft SQL Server, Oracle, or Amazon Aurora database server.
 * These capabilities mean that the code, applications, and tools you already
 * use today with your existing databases work with Amazon RDS without
 * modification. Amazon RDS automatically backs up your database and maintains
 * the database software that powers your DB instance. Amazon RDS is flexible:
 * you can scale your DB instance's compute resources and storage capacity to
 * meet your application's demand. As with all Amazon Web Services, there are no
 * up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a
 * programming or command line interface you can use to manage Amazon RDS.
 * Amazon RDS is asynchronous, which means that some interfaces might require
 * techniques such as polling or callback functions to determine when a command
 * has been applied. In this reference, the parameter descriptions indicate
 * whether a command is applied immediately, on the next instance reboot, or
 * during the maintenance window. The reference structure is as follows, and we
 * list following some related topics from the user guide.
 * </p>
 * <p>
 * <b>Amazon RDS API Reference</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For the alphabetical list of API actions, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html"
 * >API Actions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For the alphabetical list of data types, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html"
 * >Data Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a list of common query parameters, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html"
 * >Common Parameters</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of the error codes, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html"
 * >Common Errors</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon RDS User Guide</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a summary of the Amazon RDS interfaces, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces"
 * >Available RDS Interfaces</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about how to use the Query API, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html"
 * >Using the Query API</a>.
 * </p>
 * </li>
 * </ul>
 */
public class AmazonRelationalDatabaseServiceClient extends AmazonWebServiceClient implements
        AmazonRelationalDatabaseService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Relational Database
     * Service exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRelationalDatabaseService. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonRelationalDatabaseServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRelationalDatabaseService. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRelationalDatabaseService
     *            (ex: proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonRelationalDatabaseServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRelationalDatabaseService using the specified AWS account
     * credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRelationalDatabaseServiceClient client = new AmazonRelationalDatabaseServiceClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonRelationalDatabaseServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRelationalDatabaseService using the specified AWS account
     * credentials and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRelationalDatabaseServiceClient client = new AmazonRelationalDatabaseServiceClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRelationalDatabaseService
     *            (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRelationalDatabaseServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRelationalDatabaseService using the specified AWS account
     * credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRelationalDatabaseServiceClient client = new AmazonRelationalDatabaseServiceClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonRelationalDatabaseServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRelationalDatabaseService using the specified AWS account
     * credentials provider and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRelationalDatabaseServiceClient client = new AmazonRelationalDatabaseServiceClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRelationalDatabaseService
     *            (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRelationalDatabaseServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRelationalDatabaseService using the specified AWS account
     * credentials provider, client configuration options and request metric
     * collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRelationalDatabaseService
     *            (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonRelationalDatabaseServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRelationalDatabaseService using the specified AWS account
     * credentials provider, client configuration options and request metric
     * collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRelationalDatabaseServiceClient client = new AmazonRelationalDatabaseServiceClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRelationalDatabaseService
     *            (ex: proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonRelationalDatabaseServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BackupPolicyNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CustomAvailabilityZoneAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CustomAvailabilityZoneNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CustomAvailabilityZoneQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterBacktrackNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterEndpointAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterEndpointNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterEndpointQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterRoleAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterRoleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterRoleQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterSnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterSnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceAutomatedBackupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new DBInstanceAutomatedBackupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceRoleAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceRoleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceRoleQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBLogFileNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBProxyAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBProxyNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBProxyQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBProxyTargetAlreadyRegisteredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBProxyTargetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBProxyTargetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSecurityGroupNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupDoesNotCoverEnoughAZsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupNotAllowedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBUpgradeDependencyFailureExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DomainNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EventSubscriptionQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ExportTaskAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ExportTaskNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalClusterQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IamRoleMissingPermissionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IamRoleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InstallationMediaAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InstallationMediaNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InstanceQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientDBClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientDBInstanceCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientStorageClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBClusterEndpointStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBClusterSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidDBInstanceAutomatedBackupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBInstanceStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBProxyStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSubnetGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSubnetGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSubnetStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidEventSubscriptionStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidExportOnlyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidExportSourceStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidExportTaskStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidGlobalClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOptionGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRestoreExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3BucketExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSKeyNotAccessibleExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OptionGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OptionGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OptionGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PointInTimeRestoreNotEnabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ProvisionedIopsNotAvailableInAZExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedDBInstanceAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedDBInstanceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedDBInstanceQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedDBInstancesOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSInvalidTopicExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSNoAuthorizationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSTopicArnNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SharedSnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StorageQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StorageTypeNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetAlreadyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionAlreadyExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionCategoryNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("rds.us-east-1.amazonaws.com");
        this.endpointPrefix = "rds";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/rds/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/rds/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Associates an Identity and Access Management (IAM) role from an Amazon
     * Aurora DB cluster. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your
     * Behalf</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param addRoleToDBClusterRequest
     * @throws DBClusterNotFoundException
     * @throws DBClusterRoleAlreadyExistsException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterRoleQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void addRoleToDBCluster(AddRoleToDBClusterRequest addRoleToDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addRoleToDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddRoleToDBClusterRequest> request = null;
        Response<Void> response = null;
        try {
            request = new AddRoleToDBClusterRequestMarshaller().marshall(addRoleToDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an AWS Identity and Access Management (IAM) role with a DB
     * instance.
     * </p>
     * <note>
     * <p>
     * To add a role to a DB instance, the status of the DB instance must be
     * <code>available</code>.
     * </p>
     * </note>
     * 
     * @param addRoleToDBInstanceRequest
     * @throws DBInstanceNotFoundException
     * @throws DBInstanceRoleAlreadyExistsException
     * @throws InvalidDBInstanceStateException
     * @throws DBInstanceRoleQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void addRoleToDBInstance(AddRoleToDBInstanceRequest addRoleToDBInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addRoleToDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddRoleToDBInstanceRequest> request = null;
        Response<Void> response = null;
        try {
            request = new AddRoleToDBInstanceRequestMarshaller()
                    .marshall(addRoleToDBInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification
     * subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest <p/>
     * @return addSourceIdentifierToSubscriptionResult The response from the
     *         AddSourceIdentifierToSubscription service method, as returned by
     *         Amazon Relational Database Service.
     * @throws SubscriptionNotFoundException
     * @throws SourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public AddSourceIdentifierToSubscriptionResult addSourceIdentifierToSubscription(
            AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addSourceIdentifierToSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddSourceIdentifierToSubscriptionRequest> request = null;
        Response<AddSourceIdentifierToSubscriptionResult> response = null;
        try {
            request = new AddSourceIdentifierToSubscriptionRequestMarshaller()
                    .marshall(addSourceIdentifierToSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new AddSourceIdentifierToSubscriptionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be used
     * with cost allocation reporting to track cost associated with Amazon RDS
     * resources, or used in a Condition statement in an IAM policy for Amazon
     * RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"
     * >Tagging Amazon RDS Resources</a>.
     * </p>
     * 
     * @param addTagsToResourceRequest <p/>
     * @throws DBInstanceNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<Void> response = null;
        try {
            request = new AddTagsToResourceRequestMarshaller().marshall(addTagsToResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a DB
     * instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest <p/>
     * @return applyPendingMaintenanceActionResult The response from the
     *         ApplyPendingMaintenanceAction service method, as returned by
     *         Amazon Relational Database Service.
     * @throws ResourceNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ApplyPendingMaintenanceActionResult applyPendingMaintenanceAction(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(applyPendingMaintenanceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplyPendingMaintenanceActionRequest> request = null;
        Response<ApplyPendingMaintenanceActionResult> response = null;
        try {
            request = new ApplyPendingMaintenanceActionRequestMarshaller()
                    .marshall(applyPendingMaintenanceActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ApplyPendingMaintenanceActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of
     * authorization. First, EC2 or VPC security groups can be added to the
     * DBSecurityGroup if the application using the database is running on EC2
     * or VPC instances. Second, IP ranges are available if the application
     * accessing your database is running on the Internet. Required parameters
     * for this API are one of CIDR range, EC2SecurityGroupId for VPC, or
     * (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or
     * EC2SecurityGroupId for non-VPC).
     * </p>
     * <note>
     * <p>
     * You can't authorize ingress from an EC2 security group in one AWS Region
     * to an Amazon RDS DB instance in another. You can't authorize ingress from
     * a VPC security group in one VPC to an Amazon RDS DB instance in another.
     * </p>
     * </note>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     * >Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param authorizeDBSecurityGroupIngressRequest <p/>
     * @return authorizeDBSecurityGroupIngressResult The response from the
     *         AuthorizeDBSecurityGroupIngress service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     * @throws AuthorizationQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public AuthorizeDBSecurityGroupIngressResult authorizeDBSecurityGroupIngress(
            AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(authorizeDBSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeDBSecurityGroupIngressRequest> request = null;
        Response<AuthorizeDBSecurityGroupIngressResult> response = null;
        try {
            request = new AuthorizeDBSecurityGroupIngressRequestMarshaller()
                    .marshall(authorizeDBSecurityGroupIngressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AuthorizeDBSecurityGroupIngressResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Backtracks a DB cluster to a specific time, without creating a new DB
     * cluster.
     * </p>
     * <p>
     * For more information on backtracking, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html"
     * > Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param backtrackDBClusterRequest <p/>
     * @return backtrackDBClusterResult The response from the BacktrackDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public BacktrackDBClusterResult backtrackDBCluster(
            BacktrackDBClusterRequest backtrackDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(backtrackDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BacktrackDBClusterRequest> request = null;
        Response<BacktrackDBClusterResult> response = null;
        try {
            request = new BacktrackDBClusterRequestMarshaller().marshall(backtrackDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new BacktrackDBClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels an export task in progress that is exporting a snapshot to Amazon
     * S3. Any data that has already been written to the S3 bucket isn't
     * removed.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return cancelExportTaskResult The response from the CancelExportTask
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws ExportTaskNotFoundException
     * @throws InvalidExportTaskStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CancelExportTaskResult cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelExportTaskRequest> request = null;
        Response<CancelExportTaskResult> response = null;
        try {
            request = new CancelExportTaskRequestMarshaller().marshall(cancelExportTaskRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CancelExportTaskResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified DB cluster parameter group.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param copyDBClusterParameterGroupRequest
     * @return copyDBClusterParameterGroupResult The response from the
     *         CopyDBClusterParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CopyDBClusterParameterGroupResult copyDBClusterParameterGroup(
            CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyDBClusterParameterGroupRequest> request = null;
        Response<CopyDBClusterParameterGroupResult> response = null;
        try {
            request = new CopyDBClusterParameterGroupRequestMarshaller()
                    .marshall(copyDBClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CopyDBClusterParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies a snapshot of a DB cluster.
     * </p>
     * <p>
     * To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
     * <code>SourceDBClusterSnapshotIdentifier</code> must be the Amazon
     * Resource Name (ARN) of the shared DB cluster snapshot.
     * </p>
     * <p>
     * You can copy an encrypted DB cluster snapshot from another AWS Region. In
     * that case, the AWS Region where you call the
     * <code>CopyDBClusterSnapshot</code> action is the destination AWS Region
     * for the encrypted DB cluster snapshot to be copied to. To copy an
     * encrypted DB cluster snapshot from another AWS Region, you must provide
     * the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS Key Management System (AWS KMS) key
     * identifier for the key to use to encrypt the copy of the DB cluster
     * snapshot in the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreSignedUrl</code> - A URL that contains a Signature Version 4
     * signed request for the <code>CopyDBClusterSnapshot</code> action to be
     * called in the source AWS Region where the DB cluster snapshot is copied
     * from. The pre-signed URL must be a valid request for the
     * <code>CopyDBClusterSnapshot</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster snapshot to be
     * copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster snapshot in the destination AWS
     * Region. This is the same identifier for both the
     * <code>CopyDBClusterSnapshot</code> action that is called in the
     * destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB
     * cluster snapshot is to be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
     * identifier for the encrypted DB cluster snapshot to be copied. This
     * identifier must be in the Amazon Resource Name (ARN) format for the
     * source AWS Region. For example, if you are copying an encrypted DB
     * cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following
     * example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the
     * new copy of the DB cluster snapshot in the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
     * identifier for the encrypted DB cluster snapshot to be copied. This
     * identifier must be in the ARN format for the source AWS Region and is the
     * same value as the <code>SourceDBClusterSnapshotIdentifier</code> in the
     * pre-signed URL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To cancel the copy operation once it is in progress, delete the target DB
     * cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that DB cluster
     * snapshot is in "copying" status.
     * </p>
     * <p>
     * For more information on copying encrypted DB cluster snapshots from one
     * AWS Region to another, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html"
     * > Copying a Snapshot</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param copyDBClusterSnapshotRequest <p/>
     * @return copyDBClusterSnapshotResult The response from the
     *         CopyDBClusterSnapshot service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterSnapshotAlreadyExistsException
     * @throws DBClusterSnapshotNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws SnapshotQuotaExceededException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CopyDBClusterSnapshotResult copyDBClusterSnapshot(
            CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyDBClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyDBClusterSnapshotRequest> request = null;
        Response<CopyDBClusterSnapshotResult> response = null;
        try {
            request = new CopyDBClusterSnapshotRequestMarshaller()
                    .marshall(copyDBClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CopyDBClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified DB parameter group.
     * </p>
     * 
     * @param copyDBParameterGroupRequest <p/>
     * @return copyDBParameterGroupResult The response from the
     *         CopyDBParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws DBParameterGroupAlreadyExistsException
     * @throws DBParameterGroupQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CopyDBParameterGroupResult copyDBParameterGroup(
            CopyDBParameterGroupRequest copyDBParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyDBParameterGroupRequest> request = null;
        Response<CopyDBParameterGroupResult> response = null;
        try {
            request = new CopyDBParameterGroupRequestMarshaller()
                    .marshall(copyDBParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CopyDBParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified DB snapshot. The source DB snapshot must be in the
     * "available" state.
     * </p>
     * <p>
     * You can copy a snapshot from one AWS Region to another. In that case, the
     * AWS Region where you call the <code>CopyDBSnapshot</code> action is the
     * destination AWS Region for the DB snapshot copy.
     * </p>
     * <p>
     * For more information about copying snapshots, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopyDBSnapshot"
     * >Copying a DB Snapshot</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param copyDBSnapshotRequest <p/>
     * @return copyDBSnapshotResult The response from the CopyDBSnapshot service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBSnapshotAlreadyExistsException
     * @throws DBSnapshotNotFoundException
     * @throws InvalidDBSnapshotStateException
     * @throws SnapshotQuotaExceededException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CopyDBSnapshotResult copyDBSnapshot(CopyDBSnapshotRequest copyDBSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyDBSnapshotRequest> request = null;
        Response<CopyDBSnapshotResult> response = null;
        try {
            request = new CopyDBSnapshotRequestMarshaller().marshall(copyDBSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CopyDBSnapshotResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified option group.
     * </p>
     * 
     * @param copyOptionGroupRequest <p/>
     * @return copyOptionGroupResult The response from the CopyOptionGroup
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws OptionGroupAlreadyExistsException
     * @throws OptionGroupNotFoundException
     * @throws OptionGroupQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CopyOptionGroupResult copyOptionGroup(CopyOptionGroupRequest copyOptionGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyOptionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyOptionGroupRequest> request = null;
        Response<CopyOptionGroupResult> response = null;
        try {
            request = new CopyOptionGroupRequestMarshaller().marshall(copyOptionGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CopyOptionGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom Availability Zone (AZ).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere
     * cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * 
     * @param createCustomAvailabilityZoneRequest <p/>
     * @return createCustomAvailabilityZoneResult The response from the
     *         CreateCustomAvailabilityZone service method, as returned by
     *         Amazon Relational Database Service.
     * @throws CustomAvailabilityZoneAlreadyExistsException
     * @throws CustomAvailabilityZoneQuotaExceededException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateCustomAvailabilityZoneResult createCustomAvailabilityZone(
            CreateCustomAvailabilityZoneRequest createCustomAvailabilityZoneRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCustomAvailabilityZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomAvailabilityZoneRequest> request = null;
        Response<CreateCustomAvailabilityZoneResult> response = null;
        try {
            request = new CreateCustomAvailabilityZoneRequestMarshaller()
                    .marshall(createCustomAvailabilityZoneRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateCustomAvailabilityZoneResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Aurora DB cluster.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to
     * create the DB cluster as a read replica of another DB cluster or Amazon
     * RDS MySQL DB instance. For cross-region replication where the DB cluster
     * identified by <code>ReplicationSourceIdentifier</code> is encrypted, you
     * must also specify the <code>PreSignedUrl</code> parameter.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterRequest <p/>
     * @return createDBClusterResult The response from the CreateDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterAlreadyExistsException
     * @throws InsufficientStorageClusterCapacityException
     * @throws DBClusterQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidSubnetException
     * @throws InvalidDBInstanceStateException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DBClusterNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws DomainNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBClusterResult createDBCluster(CreateDBClusterRequest createDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBClusterRequest> request = null;
        Response<CreateDBClusterResult> response = null;
        try {
            request = new CreateDBClusterRequestMarshaller().marshall(createDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom endpoint and associates it with an Amazon Aurora DB
     * cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterEndpointRequest
     * @return createDBClusterEndpointResult The response from the
     *         CreateDBClusterEndpoint service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterEndpointQuotaExceededException
     * @throws DBClusterEndpointAlreadyExistsException
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBClusterEndpointResult createDBClusterEndpoint(
            CreateDBClusterEndpointRequest createDBClusterEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBClusterEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBClusterEndpointRequest> request = null;
        Response<CreateDBClusterEndpointResult> response = null;
        try {
            request = new CreateDBClusterEndpointRequestMarshaller()
                    .marshall(createDBClusterEndpointRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBClusterEndpointResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB cluster parameter group.
     * </p>
     * <p>
     * Parameters in a DB cluster parameter group apply to all of the instances
     * in a DB cluster.
     * </p>
     * <p>
     * A DB cluster parameter group is initially created with the default
     * parameters for the database engine used by instances in the DB cluster.
     * To provide custom values for any of the parameters, you must modify the
     * group after creating it using <code>ModifyDBClusterParameterGroup</code>.
     * Once you've created a DB cluster parameter group, you need to associate
     * it with your DB cluster using <code>ModifyDBCluster</code>. When you
     * associate a new DB cluster parameter group with a running DB cluster, you
     * need to reboot the DB instances in the DB cluster without failover for
     * the new DB cluster parameter group and associated settings to take
     * effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5
     * minutes before creating your first DB cluster that uses that DB cluster
     * parameter group as the default parameter group. This allows Amazon RDS to
     * fully complete the create action before the DB cluster parameter group is
     * used as the default for a new DB cluster. This is especially important
     * for parameters that are critical when creating the default database for a
     * DB cluster, such as the character set for the default database defined by
     * the <code>character_set_database</code> parameter. You can use the
     * <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
     * <code>DescribeDBClusterParameters</code> action to verify that your DB
     * cluster parameter group has been created or modified.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterParameterGroupRequest <p/>
     * @return createDBClusterParameterGroupResult The response from the
     *         CreateDBClusterParameterGroup service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBClusterParameterGroupResult createDBClusterParameterGroup(
            CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBClusterParameterGroupRequest> request = null;
        Response<CreateDBClusterParameterGroupResult> response = null;
        try {
            request = new CreateDBClusterParameterGroupRequestMarshaller()
                    .marshall(createDBClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBClusterParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a DB cluster. For more information on Amazon
     * Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterSnapshotRequest <p/>
     * @return createDBClusterSnapshotResult The response from the
     *         CreateDBClusterSnapshot service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterSnapshotAlreadyExistsException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterNotFoundException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBClusterSnapshotResult createDBClusterSnapshot(
            CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBClusterSnapshotRequest> request = null;
        Response<CreateDBClusterSnapshotResult> response = null;
        try {
            request = new CreateDBClusterSnapshotRequestMarshaller()
                    .marshall(createDBClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     * 
     * @param createDBInstanceRequest <p/>
     * @return createDBInstanceResult The response from the CreateDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBParameterGroupNotFoundException
     * @throws DBSecurityGroupNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidDBClusterStateException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws DBClusterNotFoundException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DomainNotFoundException
     * @throws BackupPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBInstanceResult createDBInstance(CreateDBInstanceRequest createDBInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBInstanceRequest> request = null;
        Response<CreateDBInstanceResult> response = null;
        try {
            request = new CreateDBInstanceRequestMarshaller().marshall(createDBInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBInstanceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB instance that acts as a read replica for an existing
     * source DB instance. You can create a read replica for a DB instance
     * running MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html"
     * >Working with Read Replicas</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Amazon Aurora doesn't support this action. Call the
     * <code>CreateDBInstance</code> action to create a DB instance for an
     * Aurora DB cluster.
     * </p>
     * <p>
     * All read replica DB instances are created with backups disabled. All
     * other DB instance attributes (including DB security groups and DB
     * parameter groups) are inherited from the source DB instance, except as
     * specified.
     * </p>
     * <important>
     * <p>
     * Your source DB instance must have backup retention enabled.
     * </p>
     * </important>
     * 
     * @param createDBInstanceReadReplicaRequest
     * @return createDBInstanceReadReplicaResult The response from the
     *         CreateDBInstanceReadReplica service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBParameterGroupNotFoundException
     * @throws DBSecurityGroupNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws DBSubnetGroupNotAllowedException
     * @throws InvalidDBSubnetGroupException
     * @throws StorageTypeNotSupportedException
     * @throws KMSKeyNotAccessibleException
     * @throws DomainNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBInstanceReadReplicaResult createDBInstanceReadReplica(
            CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBInstanceReadReplicaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBInstanceReadReplicaRequest> request = null;
        Response<CreateDBInstanceReadReplicaResult> response = null;
        try {
            request = new CreateDBInstanceReadReplicaRequestMarshaller()
                    .marshall(createDBInstanceReadReplicaRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBInstanceReadReplicaResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters for
     * the database engine used by the DB instance. To provide custom values for
     * any of the parameters, you must modify the group after creating it using
     * <i>ModifyDBParameterGroup</i>. Once you've created a DB parameter group,
     * you need to associate it with your DB instance using
     * <i>ModifyDBInstance</i>. When you associate a new DB parameter group with
     * a running DB instance, you need to reboot the DB instance without
     * failover for the new DB parameter group and associated settings to take
     * effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB parameter group, you should wait at least 5 minutes
     * before creating your first DB instance that uses that DB parameter group
     * as the default parameter group. This allows Amazon RDS to fully complete
     * the create action before the parameter group is used as the default for a
     * new DB instance. This is especially important for parameters that are
     * critical when creating the default database for a DB instance, such as
     * the character set for the default database defined by the
     * <code>character_set_database</code> parameter. You can use the
     * <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
     * <i>DescribeDBParameters</i> command to verify that your DB parameter
     * group has been created or modified.
     * </p>
     * </important>
     * 
     * @param createDBParameterGroupRequest <p/>
     * @return createDBParameterGroupResult The response from the
     *         CreateDBParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBParameterGroupResult createDBParameterGroup(
            CreateDBParameterGroupRequest createDBParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBParameterGroupRequest> request = null;
        Response<CreateDBParameterGroupResult> response = null;
        try {
            request = new CreateDBParameterGroupRequestMarshaller()
                    .marshall(createDBParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Creates a new DB proxy.
     * </p>
     * 
     * @param createDBProxyRequest
     * @return createDBProxyResult The response from the CreateDBProxy service
     *         method, as returned by Amazon Relational Database Service.
     * @throws InvalidSubnetException
     * @throws DBProxyAlreadyExistsException
     * @throws DBProxyQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBProxyResult createDBProxy(CreateDBProxyRequest createDBProxyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBProxyRequest> request = null;
        Response<CreateDBProxyResult> response = null;
        try {
            request = new CreateDBProxyRequestMarshaller().marshall(createDBProxyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBProxyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to a
     * DB instance.
     * </p>
     * <note>
     * <p>
     * A DB security group controls access to EC2-Classic DB instances that are
     * not in a VPC.
     * </p>
     * </note>
     * 
     * @param createDBSecurityGroupRequest <p/>
     * @return createDBSecurityGroupResult The response from the
     *         CreateDBSecurityGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSecurityGroupAlreadyExistsException
     * @throws DBSecurityGroupQuotaExceededException
     * @throws DBSecurityGroupNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBSecurityGroupResult createDBSecurityGroup(
            CreateDBSecurityGroupRequest createDBSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBSecurityGroupRequest> request = null;
        Response<CreateDBSecurityGroupResult> response = null;
        try {
            request = new CreateDBSecurityGroupRequestMarshaller()
                    .marshall(createDBSecurityGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBSecurityGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a DBSnapshot. The source DBInstance must be in "available" state.
     * </p>
     * 
     * @param createDBSnapshotRequest <p/>
     * @return createDBSnapshotResult The response from the CreateDBSnapshot
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBSnapshotAlreadyExistsException
     * @throws InvalidDBInstanceStateException
     * @throws DBInstanceNotFoundException
     * @throws SnapshotQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBSnapshotResult createDBSnapshot(CreateDBSnapshotRequest createDBSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBSnapshotRequest> request = null;
        Response<CreateDBSnapshotResult> response = null;
        try {
            request = new CreateDBSnapshotRequestMarshaller().marshall(createDBSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least one
     * subnet in at least two AZs in the AWS Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest <p/>
     * @return createDBSubnetGroupResult The response from the
     *         CreateDBSubnetGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSubnetGroupAlreadyExistsException
     * @throws DBSubnetGroupQuotaExceededException
     * @throws DBSubnetQuotaExceededException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateDBSubnetGroupResult createDBSubnetGroup(
            CreateDBSubnetGroupRequest createDBSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDBSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBSubnetGroupRequest> request = null;
        Response<CreateDBSubnetGroupResult> response = null;
        try {
            request = new CreateDBSubnetGroupRequestMarshaller()
                    .marshall(createDBSubnetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDBSubnetGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an RDS event notification subscription. This action requires a
     * topic Amazon Resource Name (ARN) created by either the RDS console, the
     * SNS console, or the SNS API. To obtain an ARN with SNS, you must create a
     * topic in Amazon SNS and subscribe to the topic. The ARN is displayed in
     * the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (SourceType) you want to be notified
     * of, provide a list of RDS sources (SourceIds) that triggers the events,
     * and provide a list of event categories (EventCategories) for events you
     * want to be notified of. For example, you can specify SourceType =
     * db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories
     * = Availability, Backup.
     * </p>
     * <p>
     * If you specify both the SourceType and SourceIds, such as SourceType =
     * db-instance and SourceIdentifier = myDBInstance1, you are notified of all
     * the db-instance events for the specified source. If you specify a
     * SourceType but do not specify a SourceIdentifier, you receive notice of
     * the events for that source type for all your RDS sources. If you don't
     * specify either the SourceType or the SourceIdentifier, you are notified
     * of events generated from all RDS sources belonging to your customer
     * account.
     * </p>
     * <note>
     * <p>
     * RDS event notification is only available for unencrypted SNS topics. If
     * you specify an encrypted SNS topic, event notifications aren't sent for
     * the topic.
     * </p>
     * </note>
     * 
     * @param createEventSubscriptionRequest <p/>
     * @return createEventSubscriptionResult The response from the
     *         CreateEventSubscription service method, as returned by Amazon
     *         Relational Database Service.
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionAlreadyExistException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionCategoryNotFoundException
     * @throws SourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateEventSubscriptionResult createEventSubscription(
            CreateEventSubscriptionRequest createEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSubscriptionRequest> request = null;
        Response<CreateEventSubscriptionResult> response = null;
        try {
            request = new CreateEventSubscriptionRequestMarshaller()
                    .marshall(createEventSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateEventSubscriptionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Aurora global database spread across multiple regions. The
     * global database contains a single primary cluster with read-write
     * capability, and a read-only secondary cluster that receives data from the
     * primary cluster through high-speed replication performed by the Aurora
     * storage subsystem.
     * </p>
     * <p>
     * You can create a global database that is initially empty, and then add a
     * primary cluster and a secondary cluster to it. Or you can specify an
     * existing Aurora cluster during the create operation, and this cluster
     * becomes the primary cluster of the global database.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createGlobalClusterRequest
     * @return createGlobalClusterResult The response from the
     *         CreateGlobalCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterAlreadyExistsException
     * @throws GlobalClusterQuotaExceededException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateGlobalClusterResult createGlobalCluster(
            CreateGlobalClusterRequest createGlobalClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGlobalClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlobalClusterRequest> request = null;
        Response<CreateGlobalClusterResult> response = null;
        try {
            request = new CreateGlobalClusterRequestMarshaller()
                    .marshall(createGlobalClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateGlobalClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     * 
     * @param createOptionGroupRequest <p/>
     * @return createOptionGroupResult The response from the CreateOptionGroup
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws OptionGroupAlreadyExistsException
     * @throws OptionGroupQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateOptionGroupResult createOptionGroup(
            CreateOptionGroupRequest createOptionGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createOptionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOptionGroupRequest> request = null;
        Response<CreateOptionGroupResult> response = null;
        try {
            request = new CreateOptionGroupRequestMarshaller().marshall(createOptionGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateOptionGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom Availability Zone (AZ).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere
     * cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * 
     * @param deleteCustomAvailabilityZoneRequest
     * @return deleteCustomAvailabilityZoneResult The response from the
     *         DeleteCustomAvailabilityZone service method, as returned by
     *         Amazon Relational Database Service.
     * @throws CustomAvailabilityZoneNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteCustomAvailabilityZoneResult deleteCustomAvailabilityZone(
            DeleteCustomAvailabilityZoneRequest deleteCustomAvailabilityZoneRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCustomAvailabilityZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomAvailabilityZoneRequest> request = null;
        Response<DeleteCustomAvailabilityZoneResult> response = null;
        try {
            request = new DeleteCustomAvailabilityZoneRequestMarshaller()
                    .marshall(deleteCustomAvailabilityZoneRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteCustomAvailabilityZoneResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB cluster.
     * When you delete a DB cluster, all automated backups for that DB cluster
     * are deleted and can't be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p/>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterRequest <p/>
     * @return deleteDBClusterResult The response from the DeleteDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterSnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteDBClusterResult deleteDBCluster(DeleteDBClusterRequest deleteDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBClusterRequest> request = null;
        Response<DeleteDBClusterResult> response = null;
        try {
            request = new DeleteDBClusterRequestMarshaller().marshall(deleteDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteDBClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom endpoint and removes it from an Amazon Aurora DB
     * cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterEndpointRequest
     * @return deleteDBClusterEndpointResult The response from the
     *         DeleteDBClusterEndpoint service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBClusterEndpointStateException
     * @throws DBClusterEndpointNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteDBClusterEndpointResult deleteDBClusterEndpoint(
            DeleteDBClusterEndpointRequest deleteDBClusterEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBClusterEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBClusterEndpointRequest> request = null;
        Response<DeleteDBClusterEndpointResult> response = null;
        try {
            request = new DeleteDBClusterEndpointRequestMarshaller()
                    .marshall(deleteDBClusterEndpointRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteDBClusterEndpointResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster parameter
     * group to be deleted can't be associated with any DB clusters.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterParameterGroupRequest <p/>
     * @throws InvalidDBParameterGroupStateException
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deleteDBClusterParameterGroup(
            DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBClusterParameterGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteDBClusterParameterGroupRequestMarshaller()
                    .marshall(deleteDBClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy
     * operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB cluster snapshot must be in the <code>available</code> state to be
     * deleted.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterSnapshotRequest <p/>
     * @return deleteDBClusterSnapshotResult The response from the
     *         DeleteDBClusterSnapshot service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBClusterSnapshotStateException
     * @throws DBClusterSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteDBClusterSnapshotResult deleteDBClusterSnapshot(
            DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBClusterSnapshotRequest> request = null;
        Response<DeleteDBClusterSnapshotResult> response = null;
        try {
            request = new DeleteDBClusterSnapshotRequestMarshaller()
                    .marshall(deleteDBClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteDBClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB instance.
     * When you delete a DB instance, all automated backups for that instance
     * are deleted and can't be recovered. Manual DB snapshots of the DB
     * instance to be deleted by <code>DeleteDBInstance</code> are not deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot the status of the Amazon RDS DB
     * instance is <code>deleting</code> until the DB snapshot is created. The
     * API action <code>DescribeDBInstance</code> is used to monitor the status
     * of this operation. The action can't be canceled or reverted once
     * submitted.
     * </p>
     * <p>
     * When a DB instance is in a failure state and has a status of
     * <code>failed</code>, <code>incompatible-restore</code>, or
     * <code>incompatible-network</code>, you can only delete it when you skip
     * creation of the final snapshot with the <code>SkipFinalSnapshot</code>
     * parameter.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you
     * can't delete the DB instance if both of the following conditions are
     * true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB cluster is a read replica of another Amazon Aurora DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The DB instance is the only instance in the DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a DB instance in this case, first call the
     * <code>PromoteReadReplicaDBCluster</code> API action to promote the DB
     * cluster so it's no longer a read replica. After the promotion completes,
     * then call the <code>DeleteDBInstance</code> API action to delete the
     * final instance in the DB cluster.
     * </p>
     * 
     * @param deleteDBInstanceRequest <p/>
     * @return deleteDBInstanceResult The response from the DeleteDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws DBSnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidDBClusterStateException
     * @throws DBInstanceAutomatedBackupQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteDBInstanceResult deleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBInstanceRequest> request = null;
        Response<DeleteDBInstanceResult> response = null;
        try {
            request = new DeleteDBInstanceRequestMarshaller().marshall(deleteDBInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteDBInstanceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes automated backups based on the source instance's
     * <code>DbiResourceId</code> value or the restorable instance's resource
     * ID.
     * </p>
     * 
     * @param deleteDBInstanceAutomatedBackupRequest <p>
     *            Parameter input for the
     *            <code>DeleteDBInstanceAutomatedBackup</code> operation.
     *            </p>
     * @return deleteDBInstanceAutomatedBackupResult The response from the
     *         DeleteDBInstanceAutomatedBackup service method, as returned by
     *         Amazon Relational Database Service.
     * @throws InvalidDBInstanceAutomatedBackupStateException
     * @throws DBInstanceAutomatedBackupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteDBInstanceAutomatedBackupResult deleteDBInstanceAutomatedBackup(
            DeleteDBInstanceAutomatedBackupRequest deleteDBInstanceAutomatedBackupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBInstanceAutomatedBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBInstanceAutomatedBackupRequest> request = null;
        Response<DeleteDBInstanceAutomatedBackupResult> response = null;
        try {
            request = new DeleteDBInstanceAutomatedBackupRequestMarshaller()
                    .marshall(deleteDBInstanceAutomatedBackupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteDBInstanceAutomatedBackupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified DB parameter group. The DB parameter group to be
     * deleted can't be associated with any DB instances.
     * </p>
     * 
     * @param deleteDBParameterGroupRequest <p/>
     * @throws InvalidDBParameterGroupStateException
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deleteDBParameterGroup(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBParameterGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteDBParameterGroupRequestMarshaller()
                    .marshall(deleteDBParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Deletes an existing proxy.
     * </p>
     * 
     * @param deleteDBProxyRequest
     * @return deleteDBProxyResult The response from the DeleteDBProxy service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteDBProxyResult deleteDBProxy(DeleteDBProxyRequest deleteDBProxyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBProxyRequest> request = null;
        Response<DeleteDBProxyResult> response = null;
        try {
            request = new DeleteDBProxyRequestMarshaller().marshall(deleteDBProxyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteDBProxyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <note>
     * <p>
     * The specified DB security group must not be associated with any DB
     * instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSecurityGroupRequest <p/>
     * @throws InvalidDBSecurityGroupStateException
     * @throws DBSecurityGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deleteDBSecurityGroup(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBSecurityGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteDBSecurityGroupRequestMarshaller()
                    .marshall(deleteDBSecurityGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DB snapshot. If the snapshot is being copied, the copy
     * operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB snapshot must be in the <code>available</code> state to be
     * deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBSnapshotRequest <p/>
     * @return deleteDBSnapshotResult The response from the DeleteDBSnapshot
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBSnapshotStateException
     * @throws DBSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteDBSnapshotResult deleteDBSnapshot(DeleteDBSnapshotRequest deleteDBSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBSnapshotRequest> request = null;
        Response<DeleteDBSnapshotResult> response = null;
        try {
            request = new DeleteDBSnapshotRequestMarshaller().marshall(deleteDBSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteDBSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DB subnet group.
     * </p>
     * <note>
     * <p>
     * The specified database subnet group must not be associated with any DB
     * instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSubnetGroupRequest <p/>
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidDBSubnetStateException
     * @throws DBSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deleteDBSubnetGroup(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDBSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBSubnetGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteDBSubnetGroupRequestMarshaller()
                    .marshall(deleteDBSubnetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest <p/>
     * @return deleteEventSubscriptionResult The response from the
     *         DeleteEventSubscription service method, as returned by Amazon
     *         Relational Database Service.
     * @throws SubscriptionNotFoundException
     * @throws InvalidEventSubscriptionStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteEventSubscriptionResult deleteEventSubscription(
            DeleteEventSubscriptionRequest deleteEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSubscriptionRequest> request = null;
        Response<DeleteEventSubscriptionResult> response = null;
        try {
            request = new DeleteEventSubscriptionRequestMarshaller()
                    .marshall(deleteEventSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteEventSubscriptionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a global database cluster. The primary and secondary clusters
     * must already be detached or destroyed first.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteGlobalClusterRequest
     * @return deleteGlobalClusterResult The response from the
     *         DeleteGlobalCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteGlobalClusterResult deleteGlobalCluster(
            DeleteGlobalClusterRequest deleteGlobalClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGlobalClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGlobalClusterRequest> request = null;
        Response<DeleteGlobalClusterResult> response = null;
        try {
            request = new DeleteGlobalClusterRequestMarshaller()
                    .marshall(deleteGlobalClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteGlobalClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the installation medium for a DB engine that requires an
     * on-premises customer provided license, such as Microsoft SQL Server.
     * </p>
     * 
     * @param deleteInstallationMediaRequest
     * @return deleteInstallationMediaResult The response from the
     *         DeleteInstallationMedia service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InstallationMediaNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteInstallationMediaResult deleteInstallationMedia(
            DeleteInstallationMediaRequest deleteInstallationMediaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInstallationMediaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstallationMediaRequest> request = null;
        Response<DeleteInstallationMediaResult> response = null;
        try {
            request = new DeleteInstallationMediaRequestMarshaller()
                    .marshall(deleteInstallationMediaRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteInstallationMediaResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     * 
     * @param deleteOptionGroupRequest <p/>
     * @throws OptionGroupNotFoundException
     * @throws InvalidOptionGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deleteOptionGroup(DeleteOptionGroupRequest deleteOptionGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteOptionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOptionGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteOptionGroupRequestMarshaller().marshall(deleteOptionGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Remove the association between one or more <code>DBProxyTarget</code>
     * data structures and a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param deregisterDBProxyTargetsRequest
     * @return deregisterDBProxyTargetsResult The response from the
     *         DeregisterDBProxyTargets service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyTargetNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws DBProxyNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeregisterDBProxyTargetsResult deregisterDBProxyTargets(
            DeregisterDBProxyTargetsRequest deregisterDBProxyTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterDBProxyTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterDBProxyTargetsRequest> request = null;
        Response<DeregisterDBProxyTargetsResult> response = null;
        try {
            request = new DeregisterDBProxyTargetsRequestMarshaller()
                    .marshall(deregisterDBProxyTargetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeregisterDBProxyTargetsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes
     * include Amazon RDS quotas for the account, such as the number of DB
     * instances allowed. The description for a quota includes the quota name,
     * current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command doesn't take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest <p/>
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;
        try {
            request = new DescribeAccountAttributesRequestMarshaller()
                    .marshall(describeAccountAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAccountAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the set of CA certificates provided by Amazon RDS for this AWS
     * account.
     * </p>
     * 
     * @param describeCertificatesRequest <p/>
     * @return describeCertificatesResult The response from the
     *         DescribeCertificates service method, as returned by Amazon
     *         Relational Database Service.
     * @throws CertificateNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeCertificatesResult describeCertificates(
            DescribeCertificatesRequest describeCertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificatesRequest> request = null;
        Response<DescribeCertificatesResult> response = null;
        try {
            request = new DescribeCertificatesRequestMarshaller()
                    .marshall(describeCertificatesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeCertificatesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about custom Availability Zones (AZs).
     * </p>
     * <p>
     * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere
     * cluster.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * 
     * @param describeCustomAvailabilityZonesRequest
     * @return describeCustomAvailabilityZonesResult The response from the
     *         DescribeCustomAvailabilityZones service method, as returned by
     *         Amazon Relational Database Service.
     * @throws CustomAvailabilityZoneNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeCustomAvailabilityZonesResult describeCustomAvailabilityZones(
            DescribeCustomAvailabilityZonesRequest describeCustomAvailabilityZonesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCustomAvailabilityZonesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomAvailabilityZonesRequest> request = null;
        Response<DescribeCustomAvailabilityZonesResult> response = null;
        try {
            request = new DescribeCustomAvailabilityZonesRequestMarshaller()
                    .marshall(describeCustomAvailabilityZonesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeCustomAvailabilityZonesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about backtracks for a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora MySQL DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterBacktracksRequest <p/>
     * @return describeDBClusterBacktracksResult The response from the
     *         DescribeDBClusterBacktracks service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws DBClusterBacktrackNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBClusterBacktracksResult describeDBClusterBacktracks(
            DescribeDBClusterBacktracksRequest describeDBClusterBacktracksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBClusterBacktracksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterBacktracksRequest> request = null;
        Response<DescribeDBClusterBacktracksResult> response = null;
        try {
            request = new DescribeDBClusterBacktracksRequestMarshaller()
                    .marshall(describeDBClusterBacktracksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBClusterBacktracksResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about endpoints for an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterEndpointsRequest
     * @return describeDBClusterEndpointsResult The response from the
     *         DescribeDBClusterEndpoints service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBClusterEndpointsResult describeDBClusterEndpoints(
            DescribeDBClusterEndpointsRequest describeDBClusterEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBClusterEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterEndpointsRequest> request = null;
        Response<DescribeDBClusterEndpointsResult> response = null;
        try {
            request = new DescribeDBClusterEndpointsRequestMarshaller()
                    .marshall(describeDBClusterEndpointsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBClusterEndpointsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list
     * will contain only the description of the specified DB cluster parameter
     * group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterParameterGroupsRequest <p/>
     * @return describeDBClusterParameterGroupsResult The response from the
     *         DescribeDBClusterParameterGroups service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(
            DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBClusterParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterParameterGroupsRequest> request = null;
        Response<DescribeDBClusterParameterGroupsResult> response = null;
        try {
            request = new DescribeDBClusterParameterGroupsRequestMarshaller()
                    .marshall(describeDBClusterParameterGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeDBClusterParameterGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster parameter
     * group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterParametersRequest <p/>
     * @return describeDBClusterParametersResult The response from the
     *         DescribeDBClusterParameters service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBClusterParametersResult describeDBClusterParameters(
            DescribeDBClusterParametersRequest describeDBClusterParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterParametersRequest> request = null;
        Response<DescribeDBClusterParametersResult> response = null;
        try {
            request = new DescribeDBClusterParametersRequestMarshaller()
                    .marshall(describeDBClusterParametersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBClusterParametersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of DB cluster snapshot attribute names and values for a
     * manual DB cluster snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts,
     * <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts
     * that are authorized to copy or restore the manual DB cluster snapshot. If
     * <code>all</code> is included in the list of values for the
     * <code>restore</code> attribute, then the manual DB cluster snapshot is
     * public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB
     * cluster snapshot, or to make the manual DB cluster snapshot public or
     * private, use the <code>ModifyDBClusterSnapshotAttribute</code> API
     * action.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterSnapshotAttributesRequest <p/>
     * @return describeDBClusterSnapshotAttributesResult The response from the
     *         DescribeDBClusterSnapshotAttributes service method, as returned
     *         by Amazon Relational Database Service.
     * @throws DBClusterSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(
            DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBClusterSnapshotAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterSnapshotAttributesRequest> request = null;
        Response<DescribeDBClusterSnapshotAttributesResult> response = null;
        try {
            request = new DescribeDBClusterSnapshotAttributesRequestMarshaller()
                    .marshall(describeDBClusterSnapshotAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeDBClusterSnapshotAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API action supports
     * pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterSnapshotsRequest <p/>
     * @return describeDBClusterSnapshotsResult The response from the
     *         DescribeDBClusterSnapshots service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(
            DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterSnapshotsRequest> request = null;
        Response<DescribeDBClusterSnapshotsResult> response = null;
        try {
            request = new DescribeDBClusterSnapshotsRequestMarshaller()
                    .marshall(describeDBClusterSnapshotsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBClusterSnapshotsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about provisioned Aurora DB clusters. This API
     * supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This operation can also return information for Amazon Neptune DB
     * instances and Amazon DocumentDB instances.
     * </p>
     * </note>
     * 
     * @param describeDBClustersRequest <p/>
     * @return describeDBClustersResult The response from the DescribeDBClusters
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBClustersResult describeDBClusters(
            DescribeDBClustersRequest describeDBClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClustersRequest> request = null;
        Response<DescribeDBClustersResult> response = null;
        try {
            request = new DescribeDBClustersRequestMarshaller().marshall(describeDBClustersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBClustersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     * @return describeDBEngineVersionsResult The response from the
     *         DescribeDBEngineVersions service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBEngineVersionsResult describeDBEngineVersions(
            DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBEngineVersionsRequest> request = null;
        Response<DescribeDBEngineVersionsResult> response = null;
        try {
            request = new DescribeDBEngineVersionsRequestMarshaller()
                    .marshall(describeDBEngineVersionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBEngineVersionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays backups for both current and deleted instances. For example, use
     * this operation to find details about automated backups for previously
     * deleted instances. Current instances with retention periods greater than
     * zero (0) are returned for both the
     * <code>DescribeDBInstanceAutomatedBackups</code> and
     * <code>DescribeDBInstances</code> operations.
     * </p>
     * <p>
     * All parameters are optional.
     * </p>
     * 
     * @param describeDBInstanceAutomatedBackupsRequest <p>
     *            Parameter input for DescribeDBInstanceAutomatedBackups.
     *            </p>
     * @return describeDBInstanceAutomatedBackupsResult The response from the
     *         DescribeDBInstanceAutomatedBackups service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBInstanceAutomatedBackupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBInstanceAutomatedBackupsResult describeDBInstanceAutomatedBackups(
            DescribeDBInstanceAutomatedBackupsRequest describeDBInstanceAutomatedBackupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBInstanceAutomatedBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBInstanceAutomatedBackupsRequest> request = null;
        Response<DescribeDBInstanceAutomatedBackupsResult> response = null;
        try {
            request = new DescribeDBInstanceAutomatedBackupsRequestMarshaller()
                    .marshall(describeDBInstanceAutomatedBackupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeDBInstanceAutomatedBackupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about provisioned RDS instances. This API supports
     * pagination.
     * </p>
     * <note>
     * <p>
     * This operation can also return information for Amazon Neptune DB
     * instances and Amazon DocumentDB instances.
     * </p>
     * </note>
     * 
     * @param describeDBInstancesRequest <p/>
     * @return describeDBInstancesResult The response from the
     *         DescribeDBInstances service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBInstancesResult describeDBInstances(
            DescribeDBInstancesRequest describeDBInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBInstancesRequest> request = null;
        Response<DescribeDBInstancesResult> response = null;
        try {
            request = new DescribeDBInstancesRequestMarshaller()
                    .marshall(describeDBInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBInstancesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     * 
     * @param describeDBLogFilesRequest <p/>
     * @return describeDBLogFilesResult The response from the DescribeDBLogFiles
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBLogFilesResult describeDBLogFiles(
            DescribeDBLogFilesRequest describeDBLogFilesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBLogFilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBLogFilesRequest> request = null;
        Response<DescribeDBLogFilesResult> response = null;
        try {
            request = new DescribeDBLogFilesRequestMarshaller().marshall(describeDBLogFilesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBLogFilesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a
     * <code>DBParameterGroupName</code> is specified, the list will contain
     * only the description of the specified DB parameter group.
     * </p>
     * 
     * @param describeDBParameterGroupsRequest <p/>
     * @return describeDBParameterGroupsResult The response from the
     *         DescribeDBParameterGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBParameterGroupsResult describeDBParameterGroups(
            DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBParameterGroupsRequest> request = null;
        Response<DescribeDBParameterGroupsResult> response = null;
        try {
            request = new DescribeDBParameterGroupsRequestMarshaller()
                    .marshall(describeDBParameterGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBParameterGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter group.
     * </p>
     * 
     * @param describeDBParametersRequest
     * @return describeDBParametersResult The response from the
     *         DescribeDBParameters service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBParametersResult describeDBParameters(
            DescribeDBParametersRequest describeDBParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBParametersRequest> request = null;
        Response<DescribeDBParametersResult> response = null;
        try {
            request = new DescribeDBParametersRequestMarshaller()
                    .marshall(describeDBParametersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBParametersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Returns information about DB proxies.
     * </p>
     * 
     * @param describeDBProxiesRequest
     * @return describeDBProxiesResult The response from the DescribeDBProxies
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBProxyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBProxiesResult describeDBProxies(
            DescribeDBProxiesRequest describeDBProxiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBProxiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBProxiesRequest> request = null;
        Response<DescribeDBProxiesResult> response = null;
        try {
            request = new DescribeDBProxiesRequestMarshaller().marshall(describeDBProxiesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBProxiesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Returns information about DB proxy target groups, represented by
     * <code>DBProxyTargetGroup</code> data structures.
     * </p>
     * 
     * @param describeDBProxyTargetGroupsRequest
     * @return describeDBProxyTargetGroupsResult The response from the
     *         DescribeDBProxyTargetGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBProxyTargetGroupsResult describeDBProxyTargetGroups(
            DescribeDBProxyTargetGroupsRequest describeDBProxyTargetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBProxyTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBProxyTargetGroupsRequest> request = null;
        Response<DescribeDBProxyTargetGroupsResult> response = null;
        try {
            request = new DescribeDBProxyTargetGroupsRequestMarshaller()
                    .marshall(describeDBProxyTargetGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBProxyTargetGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Returns information about <code>DBProxyTarget</code> objects. This API
     * supports pagination.
     * </p>
     * 
     * @param describeDBProxyTargetsRequest
     * @return describeDBProxyTargetsResult The response from the
     *         DescribeDBProxyTargets service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBProxyTargetsResult describeDBProxyTargets(
            DescribeDBProxyTargetsRequest describeDBProxyTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBProxyTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBProxyTargetsRequest> request = null;
        Response<DescribeDBProxyTargetsResult> response = null;
        try {
            request = new DescribeDBProxyTargetsRequestMarshaller()
                    .marshall(describeDBProxyTargetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBProxyTargetsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a
     * <code>DBSecurityGroupName</code> is specified, the list will contain only
     * the descriptions of the specified DB security group.
     * </p>
     * 
     * @param describeDBSecurityGroupsRequest <p/>
     * @return describeDBSecurityGroupsResult The response from the
     *         DescribeDBSecurityGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSecurityGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups(
            DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBSecurityGroupsRequest> request = null;
        Response<DescribeDBSecurityGroupsResult> response = null;
        try {
            request = new DescribeDBSecurityGroupsRequestMarshaller()
                    .marshall(describeDBSecurityGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBSecurityGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual DB
     * snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts,
     * <code>DescribeDBSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts
     * that are authorized to copy or restore the manual DB snapshot. If
     * <code>all</code> is included in the list of values for the
     * <code>restore</code> attribute, then the manual DB snapshot is public and
     * can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB
     * snapshot, or to make the manual DB snapshot public or private, use the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     * 
     * @param describeDBSnapshotAttributesRequest <p/>
     * @return describeDBSnapshotAttributesResult The response from the
     *         DescribeDBSnapshotAttributes service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBSnapshotAttributesResult describeDBSnapshotAttributes(
            DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBSnapshotAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBSnapshotAttributesRequest> request = null;
        Response<DescribeDBSnapshotAttributesResult> response = null;
        try {
            request = new DescribeDBSnapshotAttributesRequestMarshaller()
                    .marshall(describeDBSnapshotAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBSnapshotAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about DB snapshots. This API action supports
     * pagination.
     * </p>
     * 
     * @param describeDBSnapshotsRequest <p/>
     * @return describeDBSnapshotsResult The response from the
     *         DescribeDBSnapshots service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBSnapshotsResult describeDBSnapshots(
            DescribeDBSnapshotsRequest describeDBSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBSnapshotsRequest> request = null;
        Response<DescribeDBSnapshotsResult> response = null;
        try {
            request = new DescribeDBSnapshotsRequestMarshaller()
                    .marshall(describeDBSnapshotsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBSnapshotsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is
     * specified, the list will contain only the descriptions of the specified
     * DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     * >Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param describeDBSubnetGroupsRequest <p/>
     * @return describeDBSubnetGroupsResult The response from the
     *         DescribeDBSubnetGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeDBSubnetGroupsResult describeDBSubnetGroups(
            DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDBSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBSubnetGroupsRequest> request = null;
        Response<DescribeDBSubnetGroupsResult> response = null;
        try {
            request = new DescribeDBSubnetGroupsRequestMarshaller()
                    .marshall(describeDBSubnetGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDBSubnetGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * cluster database engine.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest <p/>
     * @return describeEngineDefaultClusterParametersResult The response from
     *         the DescribeEngineDefaultClusterParameters service method, as
     *         returned by Amazon Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEngineDefaultClusterParametersResult describeEngineDefaultClusterParameters(
            DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEngineDefaultClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineDefaultClusterParametersRequest> request = null;
        Response<DescribeEngineDefaultClusterParametersResult> response = null;
        try {
            request = new DescribeEngineDefaultClusterParametersRequestMarshaller()
                    .marshall(describeEngineDefaultClusterParametersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeEngineDefaultClusterParametersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * specified database engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest <p/>
     * @return describeEngineDefaultParametersResult The response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         Amazon Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEngineDefaultParametersResult describeEngineDefaultParameters(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEngineDefaultParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineDefaultParametersRequest> request = null;
        Response<DescribeEngineDefaultParametersResult> response = null;
        try {
            request = new DescribeEngineDefaultParametersRequestMarshaller()
                    .marshall(describeEngineDefaultParametersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEngineDefaultParametersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if
     * specified, for a specified source type. You can see a list of the event
     * categories and source types in the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * > Events</a> topic in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest <p/>
     * @return describeEventCategoriesResult The response from the
     *         DescribeEventCategories service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEventCategoriesResult describeEventCategories(
            DescribeEventCategoriesRequest describeEventCategoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventCategoriesRequest> request = null;
        Response<DescribeEventCategoriesResult> response = null;
        try {
            request = new DescribeEventCategoriesRequestMarshaller()
                    .marshall(describeEventCategoriesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEventCategoriesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The
     * description for a subscription includes SubscriptionName, SNSTopicARN,
     * CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that
     * subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest <p/>
     * @return describeEventSubscriptionsResult The response from the
     *         DescribeEventSubscriptions service method, as returned by Amazon
     *         Relational Database Service.
     * @throws SubscriptionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEventSubscriptionsResult describeEventSubscriptions(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventSubscriptionsRequest> request = null;
        Response<DescribeEventSubscriptionsResult> response = null;
        try {
            request = new DescribeEventSubscriptionsRequestMarshaller()
                    .marshall(describeEventSubscriptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEventSubscriptionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns events related to DB instances, DB security groups, DB snapshots,
     * and DB parameter groups for the past 14 days. Events specific to a
     * particular DB instance, DB security group, database snapshot, or DB
     * parameter group can be obtained by providing the name as a parameter. By
     * default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest <p/>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by Amazon Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;
        try {
            request = new DescribeEventsRequestMarshaller().marshall(describeEventsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEventsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a snapshot export to Amazon S3. This API
     * operation supports pagination.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return describeExportTasksResult The response from the
     *         DescribeExportTasks service method, as returned by Amazon
     *         Relational Database Service.
     * @throws ExportTaskNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeExportTasksResult describeExportTasks(
            DescribeExportTasksRequest describeExportTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeExportTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExportTasksRequest> request = null;
        Response<DescribeExportTasksResult> response = null;
        try {
            request = new DescribeExportTasksRequestMarshaller()
                    .marshall(describeExportTasksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeExportTasksResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about Aurora global database clusters. This API
     * supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeGlobalClustersRequest
     * @return describeGlobalClustersResult The response from the
     *         DescribeGlobalClusters service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeGlobalClustersResult describeGlobalClusters(
            DescribeGlobalClustersRequest describeGlobalClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeGlobalClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGlobalClustersRequest> request = null;
        Response<DescribeGlobalClustersResult> response = null;
        try {
            request = new DescribeGlobalClustersRequestMarshaller()
                    .marshall(describeGlobalClustersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeGlobalClustersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available installation media for a DB engine that requires
     * an on-premises customer provided license, such as Microsoft SQL Server.
     * </p>
     * 
     * @param describeInstallationMediaRequest
     * @return describeInstallationMediaResult The response from the
     *         DescribeInstallationMedia service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InstallationMediaNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeInstallationMediaResult describeInstallationMedia(
            DescribeInstallationMediaRequest describeInstallationMediaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInstallationMediaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstallationMediaRequest> request = null;
        Response<DescribeInstallationMediaResult> response = null;
        try {
            request = new DescribeInstallationMediaRequestMarshaller()
                    .marshall(describeInstallationMediaRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeInstallationMediaResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes all available options.
     * </p>
     * 
     * @param describeOptionGroupOptionsRequest <p/>
     * @return describeOptionGroupOptionsResult The response from the
     *         DescribeOptionGroupOptions service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeOptionGroupOptionsResult describeOptionGroupOptions(
            DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOptionGroupOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOptionGroupOptionsRequest> request = null;
        Response<DescribeOptionGroupOptionsResult> response = null;
        try {
            request = new DescribeOptionGroupOptionsRequestMarshaller()
                    .marshall(describeOptionGroupOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeOptionGroupOptionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available option groups.
     * </p>
     * 
     * @param describeOptionGroupsRequest <p/>
     * @return describeOptionGroupsResult The response from the
     *         DescribeOptionGroups service method, as returned by Amazon
     *         Relational Database Service.
     * @throws OptionGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeOptionGroupsResult describeOptionGroups(
            DescribeOptionGroupsRequest describeOptionGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOptionGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOptionGroupsRequest> request = null;
        Response<DescribeOptionGroupsResult> response = null;
        try {
            request = new DescribeOptionGroupsRequestMarshaller()
                    .marshall(describeOptionGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeOptionGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest <p/>
     * @return describeOrderableDBInstanceOptionsResult The response from the
     *         DescribeOrderableDBInstanceOptions service method, as returned by
     *         Amazon Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOrderableDBInstanceOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrderableDBInstanceOptionsRequest> request = null;
        Response<DescribeOrderableDBInstanceOptionsResult> response = null;
        try {
            request = new DescribeOrderableDBInstanceOptionsRequestMarshaller()
                    .marshall(describeOrderableDBInstanceOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeOrderableDBInstanceOptionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at
     * least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest <p/>
     * @return describePendingMaintenanceActionsResult The response from the
     *         DescribePendingMaintenanceActions service method, as returned by
     *         Amazon Relational Database Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePendingMaintenanceActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePendingMaintenanceActionsRequest> request = null;
        Response<DescribePendingMaintenanceActionsResult> response = null;
        try {
            request = new DescribePendingMaintenanceActionsRequestMarshaller()
                    .marshall(describePendingMaintenanceActionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribePendingMaintenanceActionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about reserved DB instances for this account, or
     * about a specified reserved DB instance.
     * </p>
     * 
     * @param describeReservedDBInstancesRequest <p/>
     * @return describeReservedDBInstancesResult The response from the
     *         DescribeReservedDBInstances service method, as returned by Amazon
     *         Relational Database Service.
     * @throws ReservedDBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeReservedDBInstancesResult describeReservedDBInstances(
            DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservedDBInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedDBInstancesRequest> request = null;
        Response<DescribeReservedDBInstancesResult> response = null;
        try {
            request = new DescribeReservedDBInstancesRequestMarshaller()
                    .marshall(describeReservedDBInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeReservedDBInstancesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     * 
     * @param describeReservedDBInstancesOfferingsRequest <p/>
     * @return describeReservedDBInstancesOfferingsResult The response from the
     *         DescribeReservedDBInstancesOfferings service method, as returned
     *         by Amazon Relational Database Service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings(
            DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservedDBInstancesOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedDBInstancesOfferingsRequest> request = null;
        Response<DescribeReservedDBInstancesOfferingsResult> response = null;
        try {
            request = new DescribeReservedDBInstancesOfferingsRequestMarshaller()
                    .marshall(describeReservedDBInstancesOfferingsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeReservedDBInstancesOfferingsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the source AWS Regions where the current AWS Region can
     * create a read replica or copy a DB snapshot from. This API action
     * supports pagination.
     * </p>
     * 
     * @param describeSourceRegionsRequest <p/>
     * @return describeSourceRegionsResult The response from the
     *         DescribeSourceRegions service method, as returned by Amazon
     *         Relational Database Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeSourceRegionsResult describeSourceRegions(
            DescribeSourceRegionsRequest describeSourceRegionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSourceRegionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSourceRegionsRequest> request = null;
        Response<DescribeSourceRegionsResult> response = null;
        try {
            request = new DescribeSourceRegionsRequestMarshaller()
                    .marshall(describeSourceRegionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeSourceRegionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can call <code>DescribeValidDBInstanceModifications</code> to learn
     * what modifications you can make to your DB instance. You can use this
     * information when you call <code>ModifyDBInstance</code>.
     * </p>
     * 
     * @param describeValidDBInstanceModificationsRequest <p/>
     * @return describeValidDBInstanceModificationsResult The response from the
     *         DescribeValidDBInstanceModifications service method, as returned
     *         by Amazon Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeValidDBInstanceModificationsResult describeValidDBInstanceModifications(
            DescribeValidDBInstanceModificationsRequest describeValidDBInstanceModificationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeValidDBInstanceModificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeValidDBInstanceModificationsRequest> request = null;
        Response<DescribeValidDBInstanceModificationsResult> response = null;
        try {
            request = new DescribeValidDBInstanceModificationsRequestMarshaller()
                    .marshall(describeValidDBInstanceModificationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeValidDBInstanceModificationsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Downloads all or a portion of the specified log file, up to 1 MB in size.
     * </p>
     * 
     * @param downloadDBLogFilePortionRequest <p/>
     * @return downloadDBLogFilePortionResult The response from the
     *         DownloadDBLogFilePortion service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws DBLogFileNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DownloadDBLogFilePortionResult downloadDBLogFilePortion(
            DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(downloadDBLogFilePortionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DownloadDBLogFilePortionRequest> request = null;
        Response<DownloadDBLogFilePortionResult> response = null;
        try {
            request = new DownloadDBLogFilePortionRequestMarshaller()
                    .marshall(downloadDBLogFilePortionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DownloadDBLogFilePortionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the Aurora Replicas
     * (read-only instances) in the DB cluster to be the primary instance (the
     * cluster writer).
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to an Aurora Replica, if one
     * exists, when the primary instance fails. You can force a failover when
     * you want to simulate a failure of a primary instance for testing. Because
     * each instance in a DB cluster has its own endpoint address, you will need
     * to clean up and re-establish any existing connections that use those
     * endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param failoverDBClusterRequest <p/>
     * @return failoverDBClusterResult The response from the FailoverDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public FailoverDBClusterResult failoverDBCluster(
            FailoverDBClusterRequest failoverDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(failoverDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FailoverDBClusterRequest> request = null;
        Response<FailoverDBClusterResult> response = null;
        try {
            request = new FailoverDBClusterRequestMarshaller().marshall(failoverDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new FailoverDBClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports the installation media for a DB engine that requires an
     * on-premises customer provided license, such as SQL Server.
     * </p>
     * 
     * @param importInstallationMediaRequest
     * @return importInstallationMediaResult The response from the
     *         ImportInstallationMedia service method, as returned by Amazon
     *         Relational Database Service.
     * @throws CustomAvailabilityZoneNotFoundException
     * @throws InstallationMediaAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ImportInstallationMediaResult importInstallationMedia(
            ImportInstallationMediaRequest importInstallationMediaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importInstallationMediaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportInstallationMediaRequest> request = null;
        Response<ImportInstallationMediaResult> response = null;
        try {
            request = new ImportInstallationMediaRequestMarshaller()
                    .marshall(importInstallationMediaRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ImportInstallationMediaResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest <p/>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        try {
            request = new ListTagsForResourceRequestMarshaller()
                    .marshall(listTagsForResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListTagsForResourceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Override the system-default Secure Sockets Layer/Transport Layer Security
     * (SSL/TLS) certificate for Amazon RDS for new DB instances temporarily, or
     * remove the override.
     * </p>
     * <p>
     * By using this operation, you can specify an RDS-approved SSL/TLS
     * certificate for new DB instances that is different from the default
     * certificate provided by RDS. You can also use this operation to remove
     * the override, so that new DB instances use the default certificate
     * provided by RDS.
     * </p>
     * <p>
     * You might need to override the default certificate in the following
     * situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You already migrated your applications to support the latest certificate
     * authority (CA) certificate, but the new CA certificate is not yet the RDS
     * default CA certificate for the specified AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has already moved to a new default CA certificate for the specified
     * AWS Region, but you are still in the process of supporting the new CA
     * certificate. In this case, you temporarily need additional time to finish
     * your application changes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB
     * engines, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html"
     * > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon RDS User
     * Guide</i>.
     * </p>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora
     * DB engines, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html"
     * > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * 
     * @param modifyCertificatesRequest
     * @return modifyCertificatesResult The response from the ModifyCertificates
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws CertificateNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyCertificatesResult modifyCertificates(
            ModifyCertificatesRequest modifyCertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCertificatesRequest> request = null;
        Response<ModifyCertificatesResult> response = null;
        try {
            request = new ModifyCertificatesRequestMarshaller().marshall(modifyCertificatesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyCertificatesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Set the capacity of an Aurora Serverless DB cluster to a specific value.
     * </p>
     * <p>
     * Aurora Serverless scales seamlessly based on the workload on the DB
     * cluster. In some cases, the capacity might not scale fast enough to meet
     * a sudden change in workload, such as a large number of new transactions.
     * Call <code>ModifyCurrentDBClusterCapacity</code> to set the capacity
     * explicitly.
     * </p>
     * <p>
     * After this call sets the DB cluster capacity, Aurora Serverless can
     * automatically scale the DB cluster based on the cooldown period for
     * scaling up and the cooldown period for scaling down.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default
     * <code>TimeoutAction</code>, connections that prevent Aurora Serverless
     * from finding a scaling point might be dropped. For more information about
     * scaling points, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyCurrentDBClusterCapacityRequest
     * @return modifyCurrentDBClusterCapacityResult The response from the
     *         ModifyCurrentDBClusterCapacity service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBClusterCapacityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyCurrentDBClusterCapacityResult modifyCurrentDBClusterCapacity(
            ModifyCurrentDBClusterCapacityRequest modifyCurrentDBClusterCapacityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyCurrentDBClusterCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCurrentDBClusterCapacityRequest> request = null;
        Response<ModifyCurrentDBClusterCapacityResult> response = null;
        try {
            request = new ModifyCurrentDBClusterCapacityRequestMarshaller()
                    .marshall(modifyCurrentDBClusterCapacityRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyCurrentDBClusterCapacityResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modify a setting for an Amazon Aurora DB cluster. You can change one or
     * more database configuration parameters by specifying these parameters and
     * the new values in the request. For more information on Amazon Aurora, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterRequest <p/>
     * @return modifyDBClusterResult The response from the ModifyDBCluster
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidSubnetException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws InvalidDBInstanceStateException
     * @throws DBClusterAlreadyExistsException
     * @throws DomainNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBClusterResult modifyDBCluster(ModifyDBClusterRequest modifyDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBClusterRequest> request = null;
        Response<ModifyDBClusterResult> response = null;
        try {
            request = new ModifyDBClusterRequestMarshaller().marshall(modifyDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterEndpointRequest
     * @return modifyDBClusterEndpointResult The response from the
     *         ModifyDBClusterEndpoint service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBClusterEndpointStateException
     * @throws DBClusterEndpointNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBClusterEndpointResult modifyDBClusterEndpoint(
            ModifyDBClusterEndpointRequest modifyDBClusterEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBClusterEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBClusterEndpointRequest> request = null;
        Response<ModifyDBClusterEndpointResult> response = null;
        try {
            request = new ModifyDBClusterEndpointRequestMarshaller()
                    .marshall(modifyDBClusterEndpointRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBClusterEndpointResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify more
     * than one parameter, submit a list of the following:
     * <code>ParameterName</code>, <code>ParameterValue</code>, and
     * <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a
     * single request.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static
     * parameters require a reboot without failover to the DB cluster associated
     * with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5
     * minutes before creating your first DB cluster that uses that DB cluster
     * parameter group as the default parameter group. This allows Amazon RDS to
     * fully complete the create action before the parameter group is used as
     * the default for a new DB cluster. This is especially important for
     * parameters that are critical when creating the default database for a DB
     * cluster, such as the character set for the default database defined by
     * the <code>character_set_database</code> parameter. You can use the
     * <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
     * <code>DescribeDBClusterParameters</code> action to verify that your DB
     * cluster parameter group has been created or modified.
     * </p>
     * <p>
     * If the modified DB cluster parameter group is used by an Aurora
     * Serverless cluster, Aurora applies the update immediately. The cluster
     * restart might interrupt your workload. In that case, your application
     * must reopen any connections and retry any transactions that were active
     * when the parameter changes took effect.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterParameterGroupRequest <p/>
     * @return modifyDBClusterParameterGroupResult The response from the
     *         ModifyDBClusterParameterGroup service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(
            ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBClusterParameterGroupRequest> request = null;
        Response<ModifyDBClusterParameterGroupResult> response = null;
        try {
            request = new ModifyDBClusterParameterGroupRequestMarshaller()
                    .marshall(modifyDBClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBClusterParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from,
     * a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual DB cluster snapshot with other AWS accounts, specify
     * <code>restore</code> as the <code>AttributeName</code> and use the
     * <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB cluster snapshot.
     * Use the value <code>all</code> to make the manual DB cluster snapshot
     * public, which means that it can be copied or restored by all AWS
     * accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB cluster snapshots
     * that contain private information that you don't want available to all AWS
     * accounts.
     * </p>
     * </note>
     * <p>
     * If a manual DB cluster snapshot is encrypted, it can be shared, but only
     * by specifying a list of authorized AWS account IDs for the
     * <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a
     * value for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB
     * cluster snapshot, or whether a manual DB cluster snapshot is public or
     * private, use the <a>DescribeDBClusterSnapshotAttributes</a> API action.
     * The accounts are returned as values for the <code>restore</code>
     * attribute.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest <p/>
     * @return modifyDBClusterSnapshotAttributeResult The response from the
     *         ModifyDBClusterSnapshotAttribute service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBClusterSnapshotNotFoundException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws SharedSnapshotQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBClusterSnapshotAttributeResult modifyDBClusterSnapshotAttribute(
            ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBClusterSnapshotAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBClusterSnapshotAttributeRequest> request = null;
        Response<ModifyDBClusterSnapshotAttributeResult> response = null;
        try {
            request = new ModifyDBClusterSnapshotAttributeRequestMarshaller()
                    .marshall(modifyDBClusterSnapshotAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ModifyDBClusterSnapshotAttributeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies settings for a DB instance. You can change one or more database
     * configuration parameters by specifying these parameters and the new
     * values in the request. To learn what modifications you can make to your
     * DB instance, call <code>DescribeValidDBInstanceModifications</code>
     * before you call <code>ModifyDBInstance</code>.
     * </p>
     * 
     * @param modifyDBInstanceRequest <p/>
     * @return modifyDBInstanceResult The response from the ModifyDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBSecurityGroupStateException
     * @throws DBInstanceAlreadyExistsException
     * @throws DBInstanceNotFoundException
     * @throws DBSecurityGroupNotFoundException
     * @throws DBParameterGroupNotFoundException
     * @throws InsufficientDBInstanceCapacityException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws DBUpgradeDependencyFailureException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws CertificateNotFoundException
     * @throws DomainNotFoundException
     * @throws BackupPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBInstanceResult modifyDBInstance(ModifyDBInstanceRequest modifyDBInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBInstanceRequest> request = null;
        Response<ModifyDBInstanceResult> response = null;
        try {
            request = new ModifyDBInstanceRequestMarshaller().marshall(modifyDBInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBInstanceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than one
     * parameter, submit a list of the following: <code>ParameterName</code>,
     * <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of
     * 20 parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static
     * parameters require a reboot without failover to the DB instance
     * associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you modify a DB parameter group, you should wait at least 5 minutes
     * before creating your first DB instance that uses that DB parameter group
     * as the default parameter group. This allows Amazon RDS to fully complete
     * the modify action before the parameter group is used as the default for a
     * new DB instance. This is especially important for parameters that are
     * critical when creating the default database for a DB instance, such as
     * the character set for the default database defined by the
     * <code>character_set_database</code> parameter. You can use the
     * <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
     * <i>DescribeDBParameters</i> command to verify that your DB parameter
     * group has been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBParameterGroupRequest <p/>
     * @return modifyDBParameterGroupResult The response from the
     *         ModifyDBParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBParameterGroupResult modifyDBParameterGroup(
            ModifyDBParameterGroupRequest modifyDBParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBParameterGroupRequest> request = null;
        Response<ModifyDBParameterGroupResult> response = null;
        try {
            request = new ModifyDBParameterGroupRequestMarshaller()
                    .marshall(modifyDBParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Changes the settings for an existing DB proxy.
     * </p>
     * 
     * @param modifyDBProxyRequest
     * @return modifyDBProxyResult The response from the ModifyDBProxy service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyAlreadyExistsException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest modifyDBProxyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBProxyRequest> request = null;
        Response<ModifyDBProxyResult> response = null;
        try {
            request = new ModifyDBProxyRequestMarshaller().marshall(modifyDBProxyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBProxyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Modifies the properties of a <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param modifyDBProxyTargetGroupRequest
     * @return modifyDBProxyTargetGroupResult The response from the
     *         ModifyDBProxyTargetGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBProxyTargetGroupResult modifyDBProxyTargetGroup(
            ModifyDBProxyTargetGroupRequest modifyDBProxyTargetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBProxyTargetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBProxyTargetGroupRequest> request = null;
        Response<ModifyDBProxyTargetGroupResult> response = null;
        try {
            request = new ModifyDBProxyTargetGroupRequestMarshaller()
                    .marshall(modifyDBProxyTargetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBProxyTargetGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a manual DB snapshot with a new engine version. The snapshot can
     * be encrypted or unencrypted, but not shared or public.
     * </p>
     * <p>
     * Amazon RDS supports upgrading DB snapshots for MySQL, Oracle, and
     * PostgreSQL.
     * </p>
     * 
     * @param modifyDBSnapshotRequest
     * @return modifyDBSnapshotResult The response from the ModifyDBSnapshot
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBSnapshotResult modifyDBSnapshot(ModifyDBSnapshotRequest modifyDBSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBSnapshotRequest> request = null;
        Response<ModifyDBSnapshotResult> response = null;
        try {
            request = new ModifyDBSnapshotRequestMarshaller().marshall(modifyDBSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from,
     * a manual DB snapshot.
     * </p>
     * <p>
     * To share a manual DB snapshot with other AWS accounts, specify
     * <code>restore</code> as the <code>AttributeName</code> and use the
     * <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB snapshot. Uses the
     * value <code>all</code> to make the manual DB snapshot public, which means
     * it can be copied or restored by all AWS accounts.
     * </p>
     * <note>
     * <p>
     * Don't add the <code>all</code> value for any manual DB snapshots that
     * contain private information that you don't want available to all AWS
     * accounts.
     * </p>
     * </note>
     * <p>
     * If the manual DB snapshot is encrypted, it can be shared, but only by
     * specifying a list of authorized AWS account IDs for the
     * <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a
     * value for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB
     * snapshot, or whether a manual DB snapshot public or private, use the
     * <a>DescribeDBSnapshotAttributes</a> API action. The accounts are returned
     * as values for the <code>restore</code> attribute.
     * </p>
     * 
     * @param modifyDBSnapshotAttributeRequest <p/>
     * @return modifyDBSnapshotAttributeResult The response from the
     *         ModifyDBSnapshotAttribute service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSnapshotNotFoundException
     * @throws InvalidDBSnapshotStateException
     * @throws SharedSnapshotQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBSnapshotAttributeResult modifyDBSnapshotAttribute(
            ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBSnapshotAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBSnapshotAttributeRequest> request = null;
        Response<ModifyDBSnapshotAttributeResult> response = null;
        try {
            request = new ModifyDBSnapshotAttributeRequestMarshaller()
                    .marshall(modifyDBSnapshotAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBSnapshotAttributeResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain at
     * least one subnet in at least two AZs in the AWS Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest <p/>
     * @return modifyDBSubnetGroupResult The response from the
     *         ModifyDBSubnetGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetQuotaExceededException
     * @throws SubnetAlreadyInUseException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyDBSubnetGroupResult modifyDBSubnetGroup(
            ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyDBSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBSubnetGroupRequest> request = null;
        Response<ModifyDBSubnetGroupResult> response = null;
        try {
            request = new ModifyDBSubnetGroupRequestMarshaller()
                    .marshall(modifyDBSubnetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyDBSubnetGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing RDS event notification subscription. You can't
     * modify the source identifiers using this call. To change source
     * identifiers for a subscription, use the
     * <code>AddSourceIdentifierToSubscription</code> and
     * <code>RemoveSourceIdentifierFromSubscription</code> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in the
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest <p/>
     * @return modifyEventSubscriptionResult The response from the
     *         ModifyEventSubscription service method, as returned by Amazon
     *         Relational Database Service.
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionNotFoundException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionCategoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyEventSubscriptionResult modifyEventSubscription(
            ModifyEventSubscriptionRequest modifyEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEventSubscriptionRequest> request = null;
        Response<ModifyEventSubscriptionResult> response = null;
        try {
            request = new ModifyEventSubscriptionRequestMarshaller()
                    .marshall(modifyEventSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyEventSubscriptionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modify a setting for an Amazon Aurora global cluster. You can change one
     * or more database configuration parameters by specifying these parameters
     * and the new values in the request. For more information on Amazon Aurora,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyGlobalClusterRequest
     * @return modifyGlobalClusterResult The response from the
     *         ModifyGlobalCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyGlobalClusterResult modifyGlobalCluster(
            ModifyGlobalClusterRequest modifyGlobalClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyGlobalClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyGlobalClusterRequest> request = null;
        Response<ModifyGlobalClusterResult> response = null;
        try {
            request = new ModifyGlobalClusterRequestMarshaller()
                    .marshall(modifyGlobalClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyGlobalClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     * 
     * @param modifyOptionGroupRequest <p/>
     * @return modifyOptionGroupResult The response from the ModifyOptionGroup
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidOptionGroupStateException
     * @throws OptionGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ModifyOptionGroupResult modifyOptionGroup(
            ModifyOptionGroupRequest modifyOptionGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyOptionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyOptionGroupRequest> request = null;
        Response<ModifyOptionGroupResult> response = null;
        try {
            request = new ModifyOptionGroupRequestMarshaller().marshall(modifyOptionGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyOptionGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Promotes a read replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Backup duration is a function of the amount of changes to the database
     * since the previous backup. If you plan to promote a read replica to a
     * standalone instance, we recommend that you enable backups and complete at
     * least one backup prior to promotion. In addition, a read replica cannot
     * be promoted to a standalone instance when it is in the
     * <code>backing-up</code> status. If you have enabled backups on your read
     * replica, configure the automated backup window so that daily backups do
     * not interfere with read replica promotion.
     * </p>
     * </li>
     * <li>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promoteReadReplicaRequest <p/>
     * @return promoteReadReplicaResult The response from the PromoteReadReplica
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBInstanceStateException
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PromoteReadReplicaResult promoteReadReplica(
            PromoteReadReplicaRequest promoteReadReplicaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(promoteReadReplicaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PromoteReadReplicaRequest> request = null;
        Response<PromoteReadReplicaResult> response = null;
        try {
            request = new PromoteReadReplicaRequestMarshaller().marshall(promoteReadReplicaRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new PromoteReadReplicaResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Promotes a read replica DB cluster to a standalone DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param promoteReadReplicaDBClusterRequest <p/>
     * @return promoteReadReplicaDBClusterResult The response from the
     *         PromoteReadReplicaDBCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PromoteReadReplicaDBClusterResult promoteReadReplicaDBCluster(
            PromoteReadReplicaDBClusterRequest promoteReadReplicaDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(promoteReadReplicaDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PromoteReadReplicaDBClusterRequest> request = null;
        Response<PromoteReadReplicaDBClusterResult> response = null;
        try {
            request = new PromoteReadReplicaDBClusterRequestMarshaller()
                    .marshall(promoteReadReplicaDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new PromoteReadReplicaDBClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     * 
     * @param purchaseReservedDBInstancesOfferingRequest <p/>
     * @return purchaseReservedDBInstancesOfferingResult The response from the
     *         PurchaseReservedDBInstancesOffering service method, as returned
     *         by Amazon Relational Database Service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     * @throws ReservedDBInstanceAlreadyExistsException
     * @throws ReservedDBInstanceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PurchaseReservedDBInstancesOfferingResult purchaseReservedDBInstancesOffering(
            PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(purchaseReservedDBInstancesOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedDBInstancesOfferingRequest> request = null;
        Response<PurchaseReservedDBInstancesOfferingResult> response = null;
        try {
            request = new PurchaseReservedDBInstancesOfferingRequestMarshaller()
                    .marshall(purchaseReservedDBInstancesOfferingRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new PurchaseReservedDBInstancesOfferingResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You might need to reboot your DB instance, usually for maintenance
     * reasons. For example, if you make certain modifications, or if you change
     * the DB parameter group associated with the DB instance, you must reboot
     * the instance for the changes to take effect.
     * </p>
     * <p>
     * Rebooting a DB instance restarts the database engine service. Rebooting a
     * DB instance results in a momentary outage, during which the DB instance
     * status is set to rebooting.
     * </p>
     * <p>
     * For more information about rebooting, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_RebootInstance.html"
     * >Rebooting a DB Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param rebootDBInstanceRequest <p/>
     * @return rebootDBInstanceResult The response from the RebootDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBInstanceStateException
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RebootDBInstanceResult rebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rebootDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootDBInstanceRequest> request = null;
        Response<RebootDBInstanceResult> response = null;
        try {
            request = new RebootDBInstanceRequestMarshaller().marshall(rebootDBInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RebootDBInstanceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This is prerelease documentation for the RDS Database Proxy feature in
     * preview release. It is subject to change.
     * </p>
     * </note>
     * <p>
     * Associate one or more <code>DBProxyTarget</code> data structures with a
     * <code>DBProxyTargetGroup</code>.
     * </p>
     * 
     * @param registerDBProxyTargetsRequest
     * @return registerDBProxyTargetsResult The response from the
     *         RegisterDBProxyTargets service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws DBProxyTargetAlreadyRegisteredException
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBProxyStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RegisterDBProxyTargetsResult registerDBProxyTargets(
            RegisterDBProxyTargetsRequest registerDBProxyTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerDBProxyTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDBProxyTargetsRequest> request = null;
        Response<RegisterDBProxyTargetsResult> response = null;
        try {
            request = new RegisterDBProxyTargetsRequestMarshaller()
                    .marshall(registerDBProxyTargetsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RegisterDBProxyTargetsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches an Aurora secondary cluster from an Aurora global database
     * cluster. The cluster becomes a standalone cluster with read-write
     * capability instead of being read-only and receiving data from a primary
     * cluster in a different region.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeFromGlobalClusterRequest
     * @return removeFromGlobalClusterResult The response from the
     *         RemoveFromGlobalCluster service method, as returned by Amazon
     *         Relational Database Service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws DBClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RemoveFromGlobalClusterResult removeFromGlobalCluster(
            RemoveFromGlobalClusterRequest removeFromGlobalClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeFromGlobalClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveFromGlobalClusterRequest> request = null;
        Response<RemoveFromGlobalClusterResult> response = null;
        try {
            request = new RemoveFromGlobalClusterRequestMarshaller()
                    .marshall(removeFromGlobalClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RemoveFromGlobalClusterResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an AWS Identity and Access Management (IAM) role from an
     * Amazon Aurora DB cluster. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your
     * Behalf </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeRoleFromDBClusterRequest
     * @throws DBClusterNotFoundException
     * @throws DBClusterRoleNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void removeRoleFromDBCluster(
            RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeRoleFromDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveRoleFromDBClusterRequest> request = null;
        Response<Void> response = null;
        try {
            request = new RemoveRoleFromDBClusterRequestMarshaller()
                    .marshall(removeRoleFromDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an AWS Identity and Access Management (IAM) role from a DB
     * instance.
     * </p>
     * 
     * @param removeRoleFromDBInstanceRequest
     * @throws DBInstanceNotFoundException
     * @throws DBInstanceRoleNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void removeRoleFromDBInstance(
            RemoveRoleFromDBInstanceRequest removeRoleFromDBInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeRoleFromDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveRoleFromDBInstanceRequest> request = null;
        Response<Void> response = null;
        try {
            request = new RemoveRoleFromDBInstanceRequestMarshaller()
                    .marshall(removeRoleFromDBInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification
     * subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest <p/>
     * @return removeSourceIdentifierFromSubscriptionResult The response from
     *         the RemoveSourceIdentifierFromSubscription service method, as
     *         returned by Amazon Relational Database Service.
     * @throws SubscriptionNotFoundException
     * @throws SourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RemoveSourceIdentifierFromSubscriptionResult removeSourceIdentifierFromSubscription(
            RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeSourceIdentifierFromSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveSourceIdentifierFromSubscriptionRequest> request = null;
        Response<RemoveSourceIdentifierFromSubscriptionResult> response = null;
        try {
            request = new RemoveSourceIdentifierFromSubscriptionRequestMarshaller()
                    .marshall(removeSourceIdentifierFromSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new RemoveSourceIdentifierFromSubscriptionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param removeTagsFromResourceRequest <p/>
     * @throws DBInstanceNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBProxyNotFoundException
     * @throws DBProxyTargetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<Void> response = null;
        try {
            request = new RemoveTagsFromResourceRequestMarshaller()
                    .marshall(removeTagsFromResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group to the default
     * value. To reset specific parameters submit a list of the following:
     * <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the
     * entire DB cluster parameter group, specify the
     * <code>DBClusterParameterGroupName</code> and
     * <code>ResetAllParameters</code> parameters.
     * </p>
     * <p>
     * When resetting the entire group, dynamic parameters are updated
     * immediately and static parameters are set to <code>pending-reboot</code>
     * to take effect on the next DB instance restart or
     * <code>RebootDBInstance</code> request. You must call
     * <code>RebootDBInstance</code> for every DB instance in your DB cluster
     * that you want the updated static parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param resetDBClusterParameterGroupRequest <p/>
     * @return resetDBClusterParameterGroupResult The response from the
     *         ResetDBClusterParameterGroup service method, as returned by
     *         Amazon Relational Database Service.
     * @throws InvalidDBParameterGroupStateException
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(
            ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetDBClusterParameterGroupRequest> request = null;
        Response<ResetDBClusterParameterGroupResult> response = null;
        try {
            request = new ResetDBClusterParameterGroupRequestMarshaller()
                    .marshall(resetDBClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ResetDBClusterParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system
     * default value. To reset specific parameters, provide a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code>. To
     * reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. When resetting the entire group, dynamic parameters are
     * updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance
     * restart or <code>RebootDBInstance</code> request.
     * </p>
     * 
     * @param resetDBParameterGroupRequest <p/>
     * @return resetDBParameterGroupResult The response from the
     *         ResetDBParameterGroup service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBParameterGroupStateException
     * @throws DBParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ResetDBParameterGroupResult resetDBParameterGroup(
            ResetDBParameterGroupRequest resetDBParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetDBParameterGroupRequest> request = null;
        Response<ResetDBParameterGroupResult> response = null;
        try {
            request = new ResetDBParameterGroupRequestMarshaller()
                    .marshall(resetDBParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ResetDBParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3
     * bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and
     * the data must be created using the Percona XtraBackup utility as
     * described in <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Migrating.html"
     * > Migrating Data to an Amazon Aurora MySQL DB Cluster</a> in the
     * <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that
     * DB cluster. You must invoke the <code>CreateDBInstance</code> action to
     * create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>
     * . You can create DB instances only after the
     * <code>RestoreDBClusterFromS3</code> action has completed and the DB
     * cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromS3Request
     * @return restoreDBClusterFromS3Result The response from the
     *         RestoreDBClusterFromS3 service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBClusterAlreadyExistsException
     * @throws DBClusterQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidSubnetException
     * @throws InvalidS3BucketException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DBClusterNotFoundException
     * @throws DomainNotFoundException
     * @throws InsufficientStorageClusterCapacityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RestoreDBClusterFromS3Result restoreDBClusterFromS3(
            RestoreDBClusterFromS3Request restoreDBClusterFromS3Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreDBClusterFromS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBClusterFromS3Request> request = null;
        Response<RestoreDBClusterFromS3Result> response = null;
        try {
            request = new RestoreDBClusterFromS3RequestMarshaller()
                    .marshall(restoreDBClusterFromS3Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RestoreDBClusterFromS3ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. This
     * action only applies to Aurora DB clusters.
     * </p>
     * <p>
     * The target DB cluster is created from the source snapshot with a default
     * configuration. If you don't specify a security group, the new DB cluster
     * is associated with the default security group.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that
     * DB cluster. You must invoke the <code>CreateDBInstance</code> action to
     * create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>
     * . You can create DB instances only after the
     * <code>RestoreDBClusterFromSnapshot</code> action has completed and the DB
     * cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromSnapshotRequest <p/>
     * @return restoreDBClusterFromSnapshotResult The response from the
     *         RestoreDBClusterFromSnapshot service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBClusterAlreadyExistsException
     * @throws DBClusterQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws DBClusterSnapshotNotFoundException
     * @throws InsufficientDBClusterCapacityException
     * @throws InsufficientStorageClusterCapacityException
     * @throws InvalidDBSnapshotStateException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidRestoreException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidSubnetException
     * @throws OptionGroupNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DomainNotFoundException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RestoreDBClusterFromSnapshotResult restoreDBClusterFromSnapshot(
            RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreDBClusterFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBClusterFromSnapshotRequest> request = null;
        Response<RestoreDBClusterFromSnapshotResult> response = null;
        try {
            request = new RestoreDBClusterFromSnapshotRequestMarshaller()
                    .marshall(restoreDBClusterFromSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RestoreDBClusterFromSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can restore to
     * any point in time before <code>LatestRestorableTime</code> for up to
     * <code>BackupRetentionPeriod</code> days. The target DB cluster is created
     * from the source DB cluster with the same configuration as the original DB
     * cluster, except that the new DB cluster is created with the default DB
     * security group.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that
     * DB cluster. You must invoke the <code>CreateDBInstance</code> action to
     * create DB instances for the restored DB cluster, specifying the
     * identifier of the restored DB cluster in <code>DBClusterIdentifier</code>
     * . You can create DB instances only after the
     * <code>RestoreDBClusterToPointInTime</code> action has completed and the
     * DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
     * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterToPointInTimeRequest <p/>
     * @return restoreDBClusterToPointInTimeResult The response from the
     *         RestoreDBClusterToPointInTime service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBClusterAlreadyExistsException
     * @throws DBClusterNotFoundException
     * @throws DBClusterQuotaExceededException
     * @throws DBClusterSnapshotNotFoundException
     * @throws DBSubnetGroupNotFoundException
     * @throws InsufficientDBClusterCapacityException
     * @throws InsufficientStorageClusterCapacityException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBSnapshotStateException
     * @throws InvalidRestoreException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws KMSKeyNotAccessibleException
     * @throws OptionGroupNotFoundException
     * @throws StorageQuotaExceededException
     * @throws DomainNotFoundException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RestoreDBClusterToPointInTimeResult restoreDBClusterToPointInTime(
            RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreDBClusterToPointInTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBClusterToPointInTimeRequest> request = null;
        Response<RestoreDBClusterToPointInTimeResult> response = null;
        try {
            request = new RestoreDBClusterToPointInTimeRequestMarshaller()
                    .marshall(restoreDBClusterToPointInTimeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RestoreDBClusterToPointInTimeResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is
     * created from the source database restore point with the most of original
     * configuration with the default security group and the default DB
     * parameter group. By default, the new DB instance is created as a
     * single-AZ deployment except when the instance is a SQL Server instance
     * that has an option group that is associated with mirroring; in this case,
     * the instance becomes a mirrored AZ deployment and not a single-AZ
     * deployment.
     * </p>
     * <p>
     * If your intent is to replace your original DB instance with the new,
     * restored DB instance, then rename your original DB instance before you
     * call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB
     * instances with the same name. Once you have renamed your original DB
     * instance with a different identifier, then you can pass the original name
     * of the DB instance as the DBInstanceIdentifier in the call to the
     * RestoreDBInstanceFromDBSnapshot action. The result is that you will
     * replace the original DB instance with the DB instance created from the
     * snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the
     * <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     * snapshot.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For
     * Aurora, use <code>RestoreDBClusterFromSnapshot</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceFromDBSnapshotRequest <p/>
     * @return restoreDBInstanceFromDBSnapshotResult The response from the
     *         RestoreDBInstanceFromDBSnapshot service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws DBSnapshotNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws InsufficientDBInstanceCapacityException
     * @throws InvalidDBSnapshotStateException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidRestoreException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DBSecurityGroupNotFoundException
     * @throws DomainNotFoundException
     * @throws DBParameterGroupNotFoundException
     * @throws BackupPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RestoreDBInstanceFromDBSnapshotResult restoreDBInstanceFromDBSnapshot(
            RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreDBInstanceFromDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBInstanceFromDBSnapshotRequest> request = null;
        Response<RestoreDBInstanceFromDBSnapshotResult> response = null;
        try {
            request = new RestoreDBInstanceFromDBSnapshotRequestMarshaller()
                    .marshall(restoreDBInstanceFromDBSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RestoreDBInstanceFromDBSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Amazon Relational Database Service (Amazon RDS) supports importing MySQL
     * databases by using backup files. You can create a backup of your
     * on-premises database, store it on Amazon Simple Storage Service (Amazon
     * S3), and then restore the backup file onto a new Amazon RDS DB instance
     * running MySQL. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html"
     * >Importing Data into an Amazon RDS MySQL DB Instance</a> in the <i>Amazon
     * RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBInstanceFromS3Request
     * @return restoreDBInstanceFromS3Result The response from the
     *         RestoreDBInstanceFromS3 service method, as returned by Amazon
     *         Relational Database Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBParameterGroupNotFoundException
     * @throws DBSecurityGroupNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidS3BucketException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws BackupPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RestoreDBInstanceFromS3Result restoreDBInstanceFromS3(
            RestoreDBInstanceFromS3Request restoreDBInstanceFromS3Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreDBInstanceFromS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBInstanceFromS3Request> request = null;
        Response<RestoreDBInstanceFromS3Result> response = null;
        try {
            request = new RestoreDBInstanceFromS3RequestMarshaller()
                    .marshall(restoreDBInstanceFromS3Request);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RestoreDBInstanceFromS3ResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a DB instance to an arbitrary point in time. You can restore to
     * any point in time before the time identified by the LatestRestorableTime
     * property. You can restore to a point up to the number of days specified
     * by the BackupRetentionPeriod property.
     * </p>
     * <p>
     * The target database is created with most of the original configuration,
     * but in a system-selected Availability Zone, with the default security
     * group, the default subnet group, and the default DB parameter group. By
     * default, the new DB instance is created as a single-AZ deployment except
     * when the instance is a SQL Server instance that has an option group that
     * is associated with mirroring; in this case, the instance becomes a
     * mirrored deployment and not a single-AZ deployment.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For
     * Aurora, use <code>RestoreDBClusterToPointInTime</code>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceToPointInTimeRequest <p/>
     * @return restoreDBInstanceToPointInTimeResult The response from the
     *         RestoreDBInstanceToPointInTime service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBInstanceAlreadyExistsException
     * @throws DBInstanceNotFoundException
     * @throws InstanceQuotaExceededException
     * @throws InsufficientDBInstanceCapacityException
     * @throws InvalidDBInstanceStateException
     * @throws PointInTimeRestoreNotEnabledException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidRestoreException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     * @throws ProvisionedIopsNotAvailableInAZException
     * @throws OptionGroupNotFoundException
     * @throws StorageTypeNotSupportedException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws DBSecurityGroupNotFoundException
     * @throws DomainNotFoundException
     * @throws BackupPolicyNotFoundException
     * @throws DBParameterGroupNotFoundException
     * @throws DBInstanceAutomatedBackupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RestoreDBInstanceToPointInTimeResult restoreDBInstanceToPointInTime(
            RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreDBInstanceToPointInTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBInstanceToPointInTimeRequest> request = null;
        Response<RestoreDBInstanceToPointInTimeResult> response = null;
        try {
            request = new RestoreDBInstanceToPointInTimeRequestMarshaller()
                    .marshall(restoreDBInstanceToPointInTimeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RestoreDBInstanceToPointInTimeResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP
     * ranges or EC2 or VPC Security Groups. Required parameters for this API
     * are one of CIDRIP, EC2SecurityGroupId for VPC, or
     * (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or
     * EC2SecurityGroupId).
     * </p>
     * 
     * @param revokeDBSecurityGroupIngressRequest <p/>
     * @return revokeDBSecurityGroupIngressResult The response from the
     *         RevokeDBSecurityGroupIngress service method, as returned by
     *         Amazon Relational Database Service.
     * @throws DBSecurityGroupNotFoundException
     * @throws AuthorizationNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public RevokeDBSecurityGroupIngressResult revokeDBSecurityGroupIngress(
            RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(revokeDBSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeDBSecurityGroupIngressRequest> request = null;
        Response<RevokeDBSecurityGroupIngressResult> response = null;
        try {
            request = new RevokeDBSecurityGroupIngressRequestMarshaller()
                    .marshall(revokeDBSecurityGroupIngressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RevokeDBSecurityGroupIngressResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a database activity stream to monitor activity on the database.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"
     * >Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param startActivityStreamRequest
     * @return startActivityStreamResult The response from the
     *         StartActivityStream service method, as returned by Amazon
     *         Relational Database Service.
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBClusterStateException
     * @throws ResourceNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartActivityStreamResult startActivityStream(
            StartActivityStreamRequest startActivityStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startActivityStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartActivityStreamRequest> request = null;
        Response<StartActivityStreamResult> response = null;
        try {
            request = new StartActivityStreamRequestMarshaller()
                    .marshall(startActivityStreamRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StartActivityStreamResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an Amazon Aurora DB cluster that was stopped using the AWS
     * console, the stop-db-cluster AWS CLI command, or the StopDBCluster
     * action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"
     * > Stopping and Starting an Aurora Cluster</a> in the <i>Amazon Aurora
     * User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param startDBClusterRequest
     * @return startDBClusterResult The response from the StartDBCluster service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartDBClusterResult startDBCluster(StartDBClusterRequest startDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDBClusterRequest> request = null;
        Response<StartDBClusterResult> response = null;
        try {
            request = new StartDBClusterRequestMarshaller().marshall(startDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StartDBClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an Amazon RDS DB instance that was stopped using the AWS console,
     * the stop-db-instance AWS CLI command, or the StopDBInstance action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"
     * > Starting an Amazon RDS DB instance That Was Previously Stopped</a> in
     * the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For
     * Aurora DB clusters, use <code>StartDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param startDBInstanceRequest
     * @return startDBInstanceResult The response from the StartDBInstance
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws InsufficientDBInstanceCapacityException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidDBClusterStateException
     * @throws InvalidSubnetException
     * @throws InvalidVPCNetworkStateException
     * @throws DBClusterNotFoundException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartDBInstanceResult startDBInstance(StartDBInstanceRequest startDBInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDBInstanceRequest> request = null;
        Response<StartDBInstanceResult> response = null;
        try {
            request = new StartDBInstanceRequestMarshaller().marshall(startDBInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StartDBInstanceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an export of a snapshot to Amazon S3. The provided IAM role must
     * have access to the S3 bucket.
     * </p>
     * 
     * @param startExportTaskRequest
     * @return startExportTaskResult The response from the StartExportTask
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws DBSnapshotNotFoundException
     * @throws DBClusterSnapshotNotFoundException
     * @throws ExportTaskAlreadyExistsException
     * @throws InvalidS3BucketException
     * @throws IamRoleNotFoundException
     * @throws IamRoleMissingPermissionsException
     * @throws InvalidExportOnlyException
     * @throws KMSKeyNotAccessibleException
     * @throws InvalidExportSourceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartExportTaskResult startExportTask(StartExportTaskRequest startExportTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartExportTaskRequest> request = null;
        Response<StartExportTaskResult> response = null;
        try {
            request = new StartExportTaskRequestMarshaller().marshall(startExportTaskRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StartExportTaskResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a database activity stream that was started using the AWS console,
     * the <code>start-activity-stream</code> AWS CLI command, or the
     * <code>StartActivityStream</code> action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html"
     * >Database Activity Streams</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param stopActivityStreamRequest
     * @return stopActivityStreamResult The response from the StopActivityStream
     *         service method, as returned by Amazon Relational Database
     *         Service.
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBClusterStateException
     * @throws ResourceNotFoundException
     * @throws DBClusterNotFoundException
     * @throws DBInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StopActivityStreamResult stopActivityStream(
            StopActivityStreamRequest stopActivityStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopActivityStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopActivityStreamRequest> request = null;
        Response<StopActivityStreamResult> response = null;
        try {
            request = new StopActivityStreamRequestMarshaller().marshall(stopActivityStreamRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StopActivityStreamResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora
     * retains the DB cluster's metadata, including its endpoints and DB
     * parameter groups. Aurora also retains the transaction logs so you can do
     * a point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"
     * > Stopping and Starting an Aurora Cluster</a> in the <i>Amazon Aurora
     * User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param stopDBClusterRequest
     * @return stopDBClusterResult The response from the StopDBCluster service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBInstanceStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StopDBClusterResult stopDBCluster(StopDBClusterRequest stopDBClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDBClusterRequest> request = null;
        Response<StopDBClusterResult> response = null;
        try {
            request = new StopDBClusterRequestMarshaller().marshall(stopDBClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StopDBClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS
     * retains the DB instance's metadata, including its endpoint, DB parameter
     * group, and option group membership. Amazon RDS also retains the
     * transaction logs so you can do a point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StopInstance.html"
     * > Stopping an Amazon RDS DB Instance Temporarily</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For
     * Aurora clusters, use <code>StopDBCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param stopDBInstanceRequest
     * @return stopDBInstanceResult The response from the StopDBInstance service
     *         method, as returned by Amazon Relational Database Service.
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws DBSnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidDBClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Relational Database Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StopDBInstanceResult stopDBInstance(StopDBInstanceRequest stopDBInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDBInstanceRequest> request = null;
        Response<StopDBInstanceResult> response = null;
        try {
            request = new StopDBInstanceRequestMarshaller().marshall(stopDBInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new StopDBInstanceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
