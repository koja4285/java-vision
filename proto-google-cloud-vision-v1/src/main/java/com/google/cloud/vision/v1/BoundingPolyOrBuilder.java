// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/geometry.proto

package com.google.cloud.vision.v1;

public interface BoundingPolyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.BoundingPoly)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Vertex vertices = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1.Vertex> 
      getVerticesList();
  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Vertex vertices = 1;</code>
   */
  com.google.cloud.vision.v1.Vertex getVertices(int index);
  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Vertex vertices = 1;</code>
   */
  int getVerticesCount();
  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Vertex vertices = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.VertexOrBuilder> 
      getVerticesOrBuilderList();
  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Vertex vertices = 1;</code>
   */
  com.google.cloud.vision.v1.VertexOrBuilder getVerticesOrBuilder(
      int index);
}
