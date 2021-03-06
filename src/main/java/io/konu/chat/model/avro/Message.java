/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.konu.chat.model.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7264836865130232526L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message\",\"namespace\":\"io.konu.chat.model.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"author\",\"type\":\"string\"},{\"name\":\"ttl\",\"type\":\"int\"},{\"name\":\"text\",\"type\":\"string\"},{\"name\":\"createdDate\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence author;
  @Deprecated public int ttl;
  @Deprecated public java.lang.CharSequence text;
  @Deprecated public org.joda.time.DateTime createdDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Message() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param author The new value for author
   * @param ttl The new value for ttl
   * @param text The new value for text
   * @param createdDate The new value for createdDate
   */
  public Message(java.lang.CharSequence id, java.lang.CharSequence author, java.lang.Integer ttl, java.lang.CharSequence text, org.joda.time.DateTime createdDate) {
    this.id = id;
    this.author = author;
    this.ttl = ttl;
    this.text = text;
    this.createdDate = createdDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return author;
    case 2: return ttl;
    case 3: return text;
    case 4: return createdDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  protected static final org.apache.avro.data.TimeConversions.DateConversion DATE_CONVERSION = new org.apache.avro.data.TimeConversions.DateConversion();
  protected static final org.apache.avro.data.TimeConversions.TimeConversion TIME_CONVERSION = new org.apache.avro.data.TimeConversions.TimeConversion();
  protected static final org.apache.avro.data.TimeConversions.TimestampConversion TIMESTAMP_CONVERSION = new org.apache.avro.data.TimeConversions.TimestampConversion();

  private final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      TIMESTAMP_CONVERSION,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: author = (java.lang.CharSequence)value$; break;
    case 2: ttl = (java.lang.Integer)value$; break;
    case 3: text = (java.lang.CharSequence)value$; break;
    case 4: createdDate = (org.joda.time.DateTime)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'author' field.
   * @return The value of the 'author' field.
   */
  public java.lang.CharSequence getAuthor() {
    return author;
  }

  /**
   * Sets the value of the 'author' field.
   * @param value the value to set.
   */
  public void setAuthor(java.lang.CharSequence value) {
    this.author = value;
  }

  /**
   * Gets the value of the 'ttl' field.
   * @return The value of the 'ttl' field.
   */
  public java.lang.Integer getTtl() {
    return ttl;
  }

  /**
   * Sets the value of the 'ttl' field.
   * @param value the value to set.
   */
  public void setTtl(java.lang.Integer value) {
    this.ttl = value;
  }

  /**
   * Gets the value of the 'text' field.
   * @return The value of the 'text' field.
   */
  public java.lang.CharSequence getText() {
    return text;
  }

  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.CharSequence value) {
    this.text = value;
  }

  /**
   * Gets the value of the 'createdDate' field.
   * @return The value of the 'createdDate' field.
   */
  public org.joda.time.DateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * Sets the value of the 'createdDate' field.
   * @param value the value to set.
   */
  public void setCreatedDate(org.joda.time.DateTime value) {
    this.createdDate = value;
  }

  /**
   * Creates a new Message RecordBuilder.
   * @return A new Message RecordBuilder
   */
  public static io.konu.chat.model.avro.Message.Builder newBuilder() {
    return new io.konu.chat.model.avro.Message.Builder();
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Message RecordBuilder
   */
  public static io.konu.chat.model.avro.Message.Builder newBuilder(io.konu.chat.model.avro.Message.Builder other) {
    return new io.konu.chat.model.avro.Message.Builder(other);
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Message instance.
   * @param other The existing instance to copy.
   * @return A new Message RecordBuilder
   */
  public static io.konu.chat.model.avro.Message.Builder newBuilder(io.konu.chat.model.avro.Message other) {
    return new io.konu.chat.model.avro.Message.Builder(other);
  }

  /**
   * RecordBuilder for Message instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message>
    implements org.apache.avro.data.RecordBuilder<Message> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence author;
    private int ttl;
    private java.lang.CharSequence text;
    private org.joda.time.DateTime createdDate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.konu.chat.model.avro.Message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.author)) {
        this.author = data().deepCopy(fields()[1].schema(), other.author);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ttl)) {
        this.ttl = data().deepCopy(fields()[2].schema(), other.ttl);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.text)) {
        this.text = data().deepCopy(fields()[3].schema(), other.text);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createdDate)) {
        this.createdDate = data().deepCopy(fields()[4].schema(), other.createdDate);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Message instance
     * @param other The existing instance to copy.
     */
    private Builder(io.konu.chat.model.avro.Message other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.author)) {
        this.author = data().deepCopy(fields()[1].schema(), other.author);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ttl)) {
        this.ttl = data().deepCopy(fields()[2].schema(), other.ttl);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.text)) {
        this.text = data().deepCopy(fields()[3].schema(), other.text);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createdDate)) {
        this.createdDate = data().deepCopy(fields()[4].schema(), other.createdDate);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'author' field.
      * @return The value.
      */
    public java.lang.CharSequence getAuthor() {
      return author;
    }

    /**
      * Sets the value of the 'author' field.
      * @param value The value of 'author'.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder setAuthor(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.author = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'author' field has been set.
      * @return True if the 'author' field has been set, false otherwise.
      */
    public boolean hasAuthor() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'author' field.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder clearAuthor() {
      author = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ttl' field.
      * @return The value.
      */
    public java.lang.Integer getTtl() {
      return ttl;
    }

    /**
      * Sets the value of the 'ttl' field.
      * @param value The value of 'ttl'.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder setTtl(int value) {
      validate(fields()[2], value);
      this.ttl = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ttl' field has been set.
      * @return True if the 'ttl' field has been set, false otherwise.
      */
    public boolean hasTtl() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ttl' field.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder clearTtl() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'text' field.
      * @return The value.
      */
    public java.lang.CharSequence getText() {
      return text;
    }

    /**
      * Sets the value of the 'text' field.
      * @param value The value of 'text'.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder setText(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.text = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'text' field has been set.
      * @return True if the 'text' field has been set, false otherwise.
      */
    public boolean hasText() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'text' field.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder clearText() {
      text = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdDate' field.
      * @return The value.
      */
    public org.joda.time.DateTime getCreatedDate() {
      return createdDate;
    }

    /**
      * Sets the value of the 'createdDate' field.
      * @param value The value of 'createdDate'.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder setCreatedDate(org.joda.time.DateTime value) {
      validate(fields()[4], value);
      this.createdDate = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'createdDate' field has been set.
      * @return True if the 'createdDate' field has been set, false otherwise.
      */
    public boolean hasCreatedDate() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'createdDate' field.
      * @return This builder.
      */
    public io.konu.chat.model.avro.Message.Builder clearCreatedDate() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Message build() {
      try {
        Message record = new Message();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.author = fieldSetFlags()[1] ? this.author : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ttl = fieldSetFlags()[2] ? this.ttl : (java.lang.Integer) defaultValue(fields()[2]);
        record.text = fieldSetFlags()[3] ? this.text : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.createdDate = fieldSetFlags()[4] ? this.createdDate : (org.joda.time.DateTime) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
