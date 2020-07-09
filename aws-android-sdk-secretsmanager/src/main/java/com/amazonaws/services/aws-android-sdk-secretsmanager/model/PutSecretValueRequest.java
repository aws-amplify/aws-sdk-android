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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Stores a new encrypted secret value in the specified secret. To do this, the operation creates a new version and attaches it to the secret. The version can contain a new <code>SecretString</code> value or a new <code>SecretBinary</code> value. You can also specify the staging labels that are initially attached to the new version.</p> <note> <p>The Secrets Manager console uses only the <code>SecretString</code> field. To add binary data to a secret with the <code>SecretBinary</code> field you must use the AWS CLI or one of the AWS SDKs.</p> </note> <ul> <li> <p>If this operation creates the first version for the secret then Secrets Manager automatically attaches the staging label <code>AWSCURRENT</code> to the new version.</p> </li> <li> <p>If another version of this secret already exists, then this operation does not automatically move any staging labels other than those that you explicitly specify in the <code>VersionStages</code> parameter.</p> </li> <li> <p>If this operation moves the staging label <code>AWSCURRENT</code> from another version to this version (because you included it in the <code>StagingLabels</code> parameter) then Secrets Manager also automatically moves the staging label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.</p> </li> <li> <p>This operation is idempotent. If a version with a <code>VersionId</code> with the same value as the <code>ClientRequestToken</code> parameter already exists and you specify the same secret data, the operation succeeds but does nothing. However, if the secret data is different, then the operation fails because you cannot modify an existing version; you can only create new ones.</p> </li> </ul> <note> <ul> <li> <p>If you call an operation to encrypt or decrypt the <code>SecretString</code> or <code>SecretBinary</code> for a secret in the same account as the calling user and that secret doesn't specify a AWS KMS encryption key, Secrets Manager uses the account's default AWS managed customer master key (CMK) with the alias <code>aws/secretsmanager</code>. If this key doesn't already exist in your account then Secrets Manager creates it for you automatically. All users and roles in the same AWS account automatically have access to use the default CMK. Note that if an Secrets Manager API call results in AWS creating the account's AWS-managed CMK, it can result in a one-time significant delay in returning the result.</p> </li> <li> <p>If the secret resides in a different AWS account from the credentials calling an API that requires encryption or decryption of the secret value then you must create and use a custom AWS KMS CMK because you can't access the default CMK for the account using credentials from a different AWS account. Store the ARN of the CMK in the secret when you create the secret or when you update it by including it in the <code>KMSKeyId</code>. If you call an API that must encrypt or decrypt <code>SecretString</code> or <code>SecretBinary</code> using credentials from a different account then the AWS KMS key policy must grant cross-account access to that other account's user or role for both the kms:GenerateDataKey and kms:Decrypt operations.</p> </li> </ul> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:PutSecretValue</p> </li> <li> <p>kms:GenerateDataKey - needed only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this permission to use the account's default AWS managed CMK for Secrets Manager.</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To retrieve the encrypted value you store in the version of a secret, use <a>GetSecretValue</a>.</p> </li> <li> <p>To create a secret, use <a>CreateSecret</a>.</p> </li> <li> <p>To get the details for a secret, use <a>DescribeSecret</a>.</p> </li> <li> <p>To list the versions attached to a secret, use <a>ListSecretVersionIds</a>.</p> </li> </ul>
 */
public class PutSecretValueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String secretId;

    /**
     * <p>(Optional) Specifies a unique identifier for the new version of the secret. </p> <note> <p>If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the request. </p> </note> <p>This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing. We recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within the specified secret. </p> <ul> <li> <p>If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new version of the secret is created. </p> </li> <li> <p>If a version with this value already exists and that version's <code>SecretString</code> or <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation is idempotent). </p> </li> <li> <p>If a version with this value already exists and the version of the <code>SecretString</code> and <code>SecretBinary</code> values are different from those in the request then the request fails because you cannot modify an existing secret version. You can only create new versions to store new secret values.</p> </li> </ul> <p>This value becomes the <code>VersionId</code> of the new version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String clientRequestToken;

    /**
     * <p>(Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be empty.</p> <p>This parameter is not accessible if the secret using the Secrets Manager console.</p> <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     */
    private java.nio.ByteBuffer secretBinary;

    /**
     * <p>(Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be empty.</p> <p>If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.</p> <p>For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.</p> <p> For example:</p> <p> <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code> </p> <p>If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     */
    private String secretString;

    /**
     * <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     */
    private java.util.List<String> versionStages;

    /**
     * <p>Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * <p>Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * <p>(Optional) Specifies a unique identifier for the new version of the secret. </p> <note> <p>If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the request. </p> </note> <p>This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing. We recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within the specified secret. </p> <ul> <li> <p>If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new version of the secret is created. </p> </li> <li> <p>If a version with this value already exists and that version's <code>SecretString</code> or <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation is idempotent). </p> </li> <li> <p>If a version with this value already exists and the version of the <code>SecretString</code> and <code>SecretBinary</code> values are different from those in the request then the request fails because you cannot modify an existing secret version. You can only create new versions to store new secret values.</p> </li> </ul> <p>This value becomes the <code>VersionId</code> of the new version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>(Optional) Specifies a unique identifier for the new version of the secret. </p> <note> <p>If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the request. </p> </note> <p>This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing. We recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within the specified secret. </p> <ul> <li> <p>If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new version of the secret is created. </p> </li> <li> <p>If a version with this value already exists and that version's <code>SecretString</code> or <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation is idempotent). </p> </li> <li> <p>If a version with this value already exists and the version of the <code>SecretString</code> and <code>SecretBinary</code> values are different from those in the request then the request fails because you cannot modify an existing secret version. You can only create new versions to store new secret values.</p> </li> </ul> <p>This value becomes the <code>VersionId</code> of the new version.</p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>(Optional) Specifies a unique identifier for the new version of the secret. </p> <note> <p>If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the request. </p> </note> <p>This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing. We recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within the specified secret. </p> <ul> <li> <p>If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new version of the secret is created. </p> </li> <li> <p>If a version with this value already exists and that version's <code>SecretString</code> or <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation is idempotent). </p> </li> <li> <p>If a version with this value already exists and the version of the <code>SecretString</code> and <code>SecretBinary</code> values are different from those in the request then the request fails because you cannot modify an existing secret version. You can only create new versions to store new secret values.</p> </li> </ul> <p>This value becomes the <code>VersionId</code> of the new version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param clientRequestToken <p>(Optional) Specifies a unique identifier for the new version of the secret. </p> <note> <p>If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the request. </p> </note> <p>This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing. We recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within the specified secret. </p> <ul> <li> <p>If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new version of the secret is created. </p> </li> <li> <p>If a version with this value already exists and that version's <code>SecretString</code> or <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation is idempotent). </p> </li> <li> <p>If a version with this value already exists and the version of the <code>SecretString</code> and <code>SecretBinary</code> values are different from those in the request then the request fails because you cannot modify an existing secret version. You can only create new versions to store new secret values.</p> </li> </ul> <p>This value becomes the <code>VersionId</code> of the new version.</p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>(Optional) Specifies a unique identifier for the new version of the secret. </p> <note> <p>If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the request. </p> </note> <p>This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing. We recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within the specified secret. </p> <ul> <li> <p>If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new version of the secret is created. </p> </li> <li> <p>If a version with this value already exists and that version's <code>SecretString</code> or <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation is idempotent). </p> </li> <li> <p>If a version with this value already exists and the version of the <code>SecretString</code> and <code>SecretBinary</code> values are different from those in the request then the request fails because you cannot modify an existing secret version. You can only create new versions to store new secret values.</p> </li> </ul> <p>This value becomes the <code>VersionId</code> of the new version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param clientRequestToken <p>(Optional) Specifies a unique identifier for the new version of the secret. </p> <note> <p>If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a <code>ClientRequestToken</code> yourself for new versions and include that value in the request. </p> </note> <p>This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing. We recommend that you generate a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value to ensure uniqueness within the specified secret. </p> <ul> <li> <p>If the <code>ClientRequestToken</code> value isn't already associated with a version of the secret then a new version of the secret is created. </p> </li> <li> <p>If a version with this value already exists and that version's <code>SecretString</code> or <code>SecretBinary</code> values are the same as those in the request then the request is ignored (the operation is idempotent). </p> </li> <li> <p>If a version with this value already exists and the version of the <code>SecretString</code> and <code>SecretBinary</code> values are different from those in the request then the request fails because you cannot modify an existing secret version. You can only create new versions to store new secret values.</p> </li> </ul> <p>This value becomes the <code>VersionId</code> of the new version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>(Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be empty.</p> <p>This parameter is not accessible if the secret using the Secrets Manager console.</p> <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @return <p>(Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be empty.</p> <p>This parameter is not accessible if the secret using the Secrets Manager console.</p> <p/>
     */
    public java.nio.ByteBuffer getSecretBinary() {
        return secretBinary;
    }

    /**
     * <p>(Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be empty.</p> <p>This parameter is not accessible if the secret using the Secrets Manager console.</p> <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @param secretBinary <p>(Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be empty.</p> <p>This parameter is not accessible if the secret using the Secrets Manager console.</p> <p/>
     */
    public void setSecretBinary(java.nio.ByteBuffer secretBinary) {
        this.secretBinary = secretBinary;
    }

    /**
     * <p>(Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be empty.</p> <p>This parameter is not accessible if the secret using the Secrets Manager console.</p> <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @param secretBinary <p>(Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either <code>SecretBinary</code> or <code>SecretString</code> must have a value, but not both. They cannot both be empty.</p> <p>This parameter is not accessible if the secret using the Secrets Manager console.</p> <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueRequest withSecretBinary(java.nio.ByteBuffer secretBinary) {
        this.secretBinary = secretBinary;
        return this;
    }

    /**
     * <p>(Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be empty.</p> <p>If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.</p> <p>For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.</p> <p> For example:</p> <p> <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code> </p> <p>If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @return <p>(Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be empty.</p> <p>If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.</p> <p>For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.</p> <p> For example:</p> <p> <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code> </p> <p>If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text.</p>
     */
    public String getSecretString() {
        return secretString;
    }

    /**
     * <p>(Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be empty.</p> <p>If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.</p> <p>For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.</p> <p> For example:</p> <p> <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code> </p> <p>If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @param secretString <p>(Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be empty.</p> <p>If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.</p> <p>For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.</p> <p> For example:</p> <p> <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code> </p> <p>If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text.</p>
     */
    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    /**
     * <p>(Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be empty.</p> <p>If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.</p> <p>For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.</p> <p> For example:</p> <p> <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code> </p> <p>If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @param secretString <p>(Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either <code>SecretString</code> or <code>SecretBinary</code> must have a value, but not both. They cannot both be empty.</p> <p>If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the <code>SecretString</code> parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse.</p> <p>For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.</p> <p> For example:</p> <p> <code>[{"username":"bob"},{"password":"abc123xyz456"}]</code> </p> <p>If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueRequest withSecretString(String secretString) {
        this.secretString = secretString;
        return this;
    }

    /**
     * <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     *
     * @return <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     */
    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     *
     * @param versionStages <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     */
    public void setVersionStages(java.util.Collection<String> versionStages) {
        if (versionStages == null) {
            this.versionStages = null;
            return;
        }

        this.versionStages = new java.util.ArrayList<String>(versionStages);
    }

    /**
     * <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionStages <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueRequest withVersionStages(String... versionStages) {
        if (getVersionStages() == null) {
            this.versionStages = new java.util.ArrayList<String>(versionStages.length);
        }
        for (String value : versionStages) {
            this.versionStages.add(value);
        }
        return this;
    }

    /**
     * <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionStages <p>(Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function.</p> <p>A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version.</p> <p>If you do not specify a value for <code>VersionStages</code> then Secrets Manager automatically moves the staging label <code>AWSCURRENT</code> to this new version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueRequest withVersionStages(java.util.Collection<String> versionStages) {
        setVersionStages(versionStages);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSecretId() != null) sb.append("SecretId: " + getSecretId() + ",");
        if (getClientRequestToken() != null) sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getSecretBinary() != null) sb.append("SecretBinary: " + getSecretBinary() + ",");
        if (getSecretString() != null) sb.append("SecretString: " + getSecretString() + ",");
        if (getVersionStages() != null) sb.append("VersionStages: " + getVersionStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getSecretBinary() == null) ? 0 : getSecretBinary().hashCode());
        hashCode = prime * hashCode + ((getSecretString() == null) ? 0 : getSecretString().hashCode());
        hashCode = prime * hashCode + ((getVersionStages() == null) ? 0 : getVersionStages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutSecretValueRequest == false) return false;
        PutSecretValueRequest other = (PutSecretValueRequest)obj;

        if (other.getSecretId() == null ^ this.getSecretId() == null) return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false) return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null) return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false) return false;
        if (other.getSecretBinary() == null ^ this.getSecretBinary() == null) return false;
        if (other.getSecretBinary() != null && other.getSecretBinary().equals(this.getSecretBinary()) == false) return false;
        if (other.getSecretString() == null ^ this.getSecretString() == null) return false;
        if (other.getSecretString() != null && other.getSecretString().equals(this.getSecretString()) == false) return false;
        if (other.getVersionStages() == null ^ this.getVersionStages() == null) return false;
        if (other.getVersionStages() != null && other.getVersionStages().equals(this.getVersionStages()) == false) return false;
        return true;
    }
}
