/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing custom vocabulary filter with a new list of words. The
 * new list you provide overwrites all previous entries; you cannot append new
 * terms onto an existing custom vocabulary filter.
 * </p>
 */
public class UpdateVocabularyFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom vocabulary filter you want to update. Custom
     * vocabulary filter names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     */
    private java.util.List<String> words;

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary filter terms. The URI must be located in the same Amazon Web
     * Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your
     * request, you cannot use <code>Words</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String vocabularyFilterFileUri;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files (in this case,
     * your custom vocabulary filter). If the role that you specify doesn’t have
     * the appropriate permissions to access the specified Amazon S3 location,
     * your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The name of the custom vocabulary filter you want to update. Custom
     * vocabulary filter names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom vocabulary filter you want to update.
     *         Custom vocabulary filter names are case sensitive.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to update. Custom
     * vocabulary filter names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the custom vocabulary filter you want to update.
     *            Custom vocabulary filter names are case sensitive.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to update. Custom
     * vocabulary filter names are case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the custom vocabulary filter you want to update.
     *            Custom vocabulary filter names are case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyFilterRequest withVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     *
     * @return <p>
     *         Use this parameter if you want to update your custom vocabulary
     *         filter by including all desired terms, as comma-separated values,
     *         within your request. The other option for updating your
     *         vocabulary filter is to save your entries in a text file and
     *         upload them to an Amazon S3 bucket, then specify the location of
     *         your file using the <code>VocabularyFilterFileUri</code>
     *         parameter.
     *         </p>
     *         <p>
     *         Note that if you include <code>Words</code> in your request, you
     *         cannot use <code>VocabularyFilterFileUri</code>; you must choose
     *         one or the other.
     *         </p>
     *         <p>
     *         Each language has a character set that contains all allowed
     *         characters for that specific language. If you use unsupported
     *         characters, your custom vocabulary filter request fails. Refer to
     *         <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *         >Character Sets for Custom Vocabularies</a> to get the character
     *         set for your language.
     *         </p>
     */
    public java.util.List<String> getWords() {
        return words;
    }

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     *
     * @param words <p>
     *            Use this parameter if you want to update your custom
     *            vocabulary filter by including all desired terms, as
     *            comma-separated values, within your request. The other option
     *            for updating your vocabulary filter is to save your entries in
     *            a text file and upload them to an Amazon S3 bucket, then
     *            specify the location of your file using the
     *            <code>VocabularyFilterFileUri</code> parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Words</code> in your request,
     *            you cannot use <code>VocabularyFilterFileUri</code>; you must
     *            choose one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your custom vocabulary filter request fails. Refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     */
    public void setWords(java.util.Collection<String> words) {
        if (words == null) {
            this.words = null;
            return;
        }

        this.words = new java.util.ArrayList<String>(words);
    }

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param words <p>
     *            Use this parameter if you want to update your custom
     *            vocabulary filter by including all desired terms, as
     *            comma-separated values, within your request. The other option
     *            for updating your vocabulary filter is to save your entries in
     *            a text file and upload them to an Amazon S3 bucket, then
     *            specify the location of your file using the
     *            <code>VocabularyFilterFileUri</code> parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Words</code> in your request,
     *            you cannot use <code>VocabularyFilterFileUri</code>; you must
     *            choose one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your custom vocabulary filter request fails. Refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyFilterRequest withWords(String... words) {
        if (getWords() == null) {
            this.words = new java.util.ArrayList<String>(words.length);
        }
        for (String value : words) {
            this.words.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param words <p>
     *            Use this parameter if you want to update your custom
     *            vocabulary filter by including all desired terms, as
     *            comma-separated values, within your request. The other option
     *            for updating your vocabulary filter is to save your entries in
     *            a text file and upload them to an Amazon S3 bucket, then
     *            specify the location of your file using the
     *            <code>VocabularyFilterFileUri</code> parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Words</code> in your request,
     *            you cannot use <code>VocabularyFilterFileUri</code>; you must
     *            choose one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your custom vocabulary filter request fails. Refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyFilterRequest withWords(java.util.Collection<String> words) {
        setWords(words);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary filter terms. The URI must be located in the same Amazon Web
     * Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your
     * request, you cannot use <code>Words</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the text file that contains your custom
     *         vocabulary filter terms. The URI must be located in the same
     *         Amazon Web Services Region as the resource you're calling.
     *         </p>
     *         <p>
     *         Here's an example URI path:
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *         </p>
     *         <p>
     *         Note that if you include <code>VocabularyFilterFileUri</code> in
     *         your request, you cannot use <code>Words</code>; you must choose
     *         one or the other.
     *         </p>
     */
    public String getVocabularyFilterFileUri() {
        return vocabularyFilterFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary filter terms. The URI must be located in the same Amazon Web
     * Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your
     * request, you cannot use <code>Words</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param vocabularyFilterFileUri <p>
     *            The Amazon S3 location of the text file that contains your
     *            custom vocabulary filter terms. The URI must be located in the
     *            same Amazon Web Services Region as the resource you're
     *            calling.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFilterFileUri</code>
     *            in your request, you cannot use <code>Words</code>; you must
     *            choose one or the other.
     *            </p>
     */
    public void setVocabularyFilterFileUri(String vocabularyFilterFileUri) {
        this.vocabularyFilterFileUri = vocabularyFilterFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary filter terms. The URI must be located in the same Amazon Web
     * Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your
     * request, you cannot use <code>Words</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param vocabularyFilterFileUri <p>
     *            The Amazon S3 location of the text file that contains your
     *            custom vocabulary filter terms. The URI must be located in the
     *            same Amazon Web Services Region as the resource you're
     *            calling.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFilterFileUri</code>
     *            in your request, you cannot use <code>Words</code>; you must
     *            choose one or the other.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyFilterRequest withVocabularyFilterFileUri(String vocabularyFilterFileUri) {
        this.vocabularyFilterFileUri = vocabularyFilterFileUri;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files (in this case,
     * your custom vocabulary filter). If the role that you specify doesn’t have
     * the appropriate permissions to access the specified Amazon S3 location,
     * your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role that has
     *         permissions to access the Amazon S3 bucket that contains your
     *         input files (in this case, your custom vocabulary filter). If the
     *         role that you specify doesn’t have the appropriate permissions to
     *         access the specified Amazon S3 location, your request fails.
     *         </p>
     *         <p>
     *         IAM role ARNs have the format
     *         <code>arn:partition:iam::account:role/role-name-with-path</code>.
     *         For example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *         >IAM ARNs</a>.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files (in this case,
     * your custom vocabulary filter). If the role that you specify doesn’t have
     * the appropriate permissions to access the specified Amazon S3 location,
     * your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that has
     *            permissions to access the Amazon S3 bucket that contains your
     *            input files (in this case, your custom vocabulary filter). If
     *            the role that you specify doesn’t have the appropriate
     *            permissions to access the specified Amazon S3 location, your
     *            request fails.
     *            </p>
     *            <p>
     *            IAM role ARNs have the format
     *            <code>arn:partition:iam::account:role/role-name-with-path</code>
     *            . For example:
     *            <code>arn:aws:iam::111122223333:role/Admin</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files (in this case,
     * your custom vocabulary filter). If the role that you specify doesn’t have
     * the appropriate permissions to access the specified Amazon S3 location,
     * your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that has
     *            permissions to access the Amazon S3 bucket that contains your
     *            input files (in this case, your custom vocabulary filter). If
     *            the role that you specify doesn’t have the appropriate
     *            permissions to access the specified Amazon S3 location, your
     *            request fails.
     *            </p>
     *            <p>
     *            IAM role ARNs have the format
     *            <code>arn:partition:iam::account:role/role-name-with-path</code>
     *            . For example:
     *            <code>arn:aws:iam::111122223333:role/Admin</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyFilterRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
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
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: " + getVocabularyFilterName() + ",");
        if (getWords() != null)
            sb.append("Words: " + getWords() + ",");
        if (getVocabularyFilterFileUri() != null)
            sb.append("VocabularyFilterFileUri: " + getVocabularyFilterFileUri() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getWords() == null) ? 0 : getWords().hashCode());
        hashCode = prime
                * hashCode
                + ((getVocabularyFilterFileUri() == null) ? 0 : getVocabularyFilterFileUri()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVocabularyFilterRequest == false)
            return false;
        UpdateVocabularyFilterRequest other = (UpdateVocabularyFilterRequest) obj;

        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null
                && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getWords() == null ^ this.getWords() == null)
            return false;
        if (other.getWords() != null && other.getWords().equals(this.getWords()) == false)
            return false;
        if (other.getVocabularyFilterFileUri() == null ^ this.getVocabularyFilterFileUri() == null)
            return false;
        if (other.getVocabularyFilterFileUri() != null
                && other.getVocabularyFilterFileUri().equals(this.getVocabularyFilterFileUri()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }
}
