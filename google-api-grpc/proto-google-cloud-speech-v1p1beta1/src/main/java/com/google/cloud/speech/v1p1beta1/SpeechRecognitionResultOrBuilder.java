// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface SpeechRecognitionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.SpeechRecognitionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative> 
      getAlternativesList();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative getAlternatives(int index);
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  int getAlternativesCount();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index);

  /**
   * <pre>
   * For multi-channel audio, this is the channel number corresponding to the
   * recognized result for the audio from that channel.
   * For audio_channel_count = N, its output values can range from '1' to 'N'.
   * </pre>
   *
   * <code>int32 channel_tag = 2;</code>
   */
  int getChannelTag();

  /**
   * <pre>
   * Output only. The
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most
   * likelihood of being spoken in the audio.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Output only. The
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most
   * likelihood of being spoken in the audio.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
