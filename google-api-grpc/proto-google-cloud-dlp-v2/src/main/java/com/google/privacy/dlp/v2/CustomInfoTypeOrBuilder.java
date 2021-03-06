// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

public interface CustomInfoTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CustomInfoType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All CustomInfoTypes must have a name
   * that does not conflict with built-in InfoTypes or other CustomInfoTypes.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  boolean hasInfoType();
  /**
   * <pre>
   * All CustomInfoTypes must have a name
   * that does not conflict with built-in InfoTypes or other CustomInfoTypes.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoType getInfoType();
  /**
   * <pre>
   * All CustomInfoTypes must have a name
   * that does not conflict with built-in InfoTypes or other CustomInfoTypes.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   * <pre>
   * Likelihood to return for this CustomInfoType. This base value can be
   * altered by a detection rule if the finding meets the criteria specified by
   * the rule. Defaults to `VERY_LIKELY` if not specified.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood likelihood = 6;</code>
   */
  int getLikelihoodValue();
  /**
   * <pre>
   * Likelihood to return for this CustomInfoType. This base value can be
   * altered by a detection rule if the finding meets the criteria specified by
   * the rule. Defaults to `VERY_LIKELY` if not specified.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood likelihood = 6;</code>
   */
  com.google.privacy.dlp.v2.Likelihood getLikelihood();

  /**
   * <pre>
   * A list of phrases to detect as a CustomInfoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 2;</code>
   */
  boolean hasDictionary();
  /**
   * <pre>
   * A list of phrases to detect as a CustomInfoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 2;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.Dictionary getDictionary();
  /**
   * <pre>
   * A list of phrases to detect as a CustomInfoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 2;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.DictionaryOrBuilder getDictionaryOrBuilder();

  /**
   * <pre>
   * Regular expression based CustomInfoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 3;</code>
   */
  boolean hasRegex();
  /**
   * <pre>
   * Regular expression based CustomInfoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 3;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.Regex getRegex();
  /**
   * <pre>
   * Regular expression based CustomInfoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 3;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder getRegexOrBuilder();

  /**
   * <pre>
   * Message for detecting output from deidentification transformations that
   * support reversing.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.SurrogateType surrogate_type = 4;</code>
   */
  boolean hasSurrogateType();
  /**
   * <pre>
   * Message for detecting output from deidentification transformations that
   * support reversing.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.SurrogateType surrogate_type = 4;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.SurrogateType getSurrogateType();
  /**
   * <pre>
   * Message for detecting output from deidentification transformations that
   * support reversing.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.SurrogateType surrogate_type = 4;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.SurrogateTypeOrBuilder getSurrogateTypeOrBuilder();

  /**
   * <pre>
   * Set of detection rules to apply to all findings of this CustomInfoType.
   * Rules are applied in order that they are specified. Not supported for the
   * `surrogate_type` CustomInfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType.DetectionRule detection_rules = 7;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.CustomInfoType.DetectionRule> 
      getDetectionRulesList();
  /**
   * <pre>
   * Set of detection rules to apply to all findings of this CustomInfoType.
   * Rules are applied in order that they are specified. Not supported for the
   * `surrogate_type` CustomInfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType.DetectionRule detection_rules = 7;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.DetectionRule getDetectionRules(int index);
  /**
   * <pre>
   * Set of detection rules to apply to all findings of this CustomInfoType.
   * Rules are applied in order that they are specified. Not supported for the
   * `surrogate_type` CustomInfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType.DetectionRule detection_rules = 7;</code>
   */
  int getDetectionRulesCount();
  /**
   * <pre>
   * Set of detection rules to apply to all findings of this CustomInfoType.
   * Rules are applied in order that they are specified. Not supported for the
   * `surrogate_type` CustomInfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType.DetectionRule detection_rules = 7;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.CustomInfoType.DetectionRuleOrBuilder> 
      getDetectionRulesOrBuilderList();
  /**
   * <pre>
   * Set of detection rules to apply to all findings of this CustomInfoType.
   * Rules are applied in order that they are specified. Not supported for the
   * `surrogate_type` CustomInfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType.DetectionRule detection_rules = 7;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.DetectionRuleOrBuilder getDetectionRulesOrBuilder(
      int index);

  public com.google.privacy.dlp.v2.CustomInfoType.TypeCase getTypeCase();
}
