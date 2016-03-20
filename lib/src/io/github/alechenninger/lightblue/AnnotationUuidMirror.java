package io.github.alechenninger.lightblue;

public class AnnotationUuidMirror implements UuidMirror {
  private final Uuid uuid;

  public AnnotationUuidMirror(Uuid uuid) {
    this.uuid = uuid;
  }

  @Override
  public boolean isOverwrite() {
    return uuid.overwrite();
  }
}
