/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.eraira;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5380502375116838055L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.eraira\",\"fields\":[{\"name\":\"userName\",\"type\":\"string\"},{\"name\":\"favNumber\",\"type\":[\"int\",\"null\"]},{\"name\":\"aBigNumber\",\"type\":[\"bytes\",\"null\"],\"logicalType\":\"decimal\",\"precision\":4,\"scale\":2}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User from a ByteBuffer. */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence userName;
  @Deprecated public java.lang.Integer favNumber;
  @Deprecated public java.nio.ByteBuffer aBigNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param userName The new value for userName
   * @param favNumber The new value for favNumber
   * @param aBigNumber The new value for aBigNumber
   */
  public User(java.lang.CharSequence userName, java.lang.Integer favNumber, java.nio.ByteBuffer aBigNumber) {
    this.userName = userName;
    this.favNumber = favNumber;
    this.aBigNumber = aBigNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userName;
    case 1: return favNumber;
    case 2: return aBigNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userName = (java.lang.CharSequence)value$; break;
    case 1: favNumber = (java.lang.Integer)value$; break;
    case 2: aBigNumber = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userName' field.
   * @return The value of the 'userName' field.
   */
  public java.lang.CharSequence getUserName() {
    return userName;
  }

  /**
   * Sets the value of the 'userName' field.
   * @param value the value to set.
   */
  public void setUserName(java.lang.CharSequence value) {
    this.userName = value;
  }

  /**
   * Gets the value of the 'favNumber' field.
   * @return The value of the 'favNumber' field.
   */
  public java.lang.Integer getFavNumber() {
    return favNumber;
  }

  /**
   * Sets the value of the 'favNumber' field.
   * @param value the value to set.
   */
  public void setFavNumber(java.lang.Integer value) {
    this.favNumber = value;
  }

  /**
   * Gets the value of the 'aBigNumber' field.
   * @return The value of the 'aBigNumber' field.
   */
  public java.nio.ByteBuffer getABigNumber() {
    return aBigNumber;
  }

  /**
   * Sets the value of the 'aBigNumber' field.
   * @param value the value to set.
   */
  public void setABigNumber(java.nio.ByteBuffer value) {
    this.aBigNumber = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static com.eraira.User.Builder newBuilder() {
    return new com.eraira.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static com.eraira.User.Builder newBuilder(com.eraira.User.Builder other) {
    return new com.eraira.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static com.eraira.User.Builder newBuilder(com.eraira.User other) {
    return new com.eraira.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.CharSequence userName;
    private java.lang.Integer favNumber;
    private java.nio.ByteBuffer aBigNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.eraira.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userName)) {
        this.userName = data().deepCopy(fields()[0].schema(), other.userName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.favNumber)) {
        this.favNumber = data().deepCopy(fields()[1].schema(), other.favNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.aBigNumber)) {
        this.aBigNumber = data().deepCopy(fields()[2].schema(), other.aBigNumber);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(com.eraira.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userName)) {
        this.userName = data().deepCopy(fields()[0].schema(), other.userName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.favNumber)) {
        this.favNumber = data().deepCopy(fields()[1].schema(), other.favNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.aBigNumber)) {
        this.aBigNumber = data().deepCopy(fields()[2].schema(), other.aBigNumber);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'userName' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserName() {
      return userName;
    }

    /**
      * Sets the value of the 'userName' field.
      * @param value The value of 'userName'.
      * @return This builder.
      */
    public com.eraira.User.Builder setUserName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.userName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userName' field has been set.
      * @return True if the 'userName' field has been set, false otherwise.
      */
    public boolean hasUserName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userName' field.
      * @return This builder.
      */
    public com.eraira.User.Builder clearUserName() {
      userName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'favNumber' field.
      * @return The value.
      */
    public java.lang.Integer getFavNumber() {
      return favNumber;
    }

    /**
      * Sets the value of the 'favNumber' field.
      * @param value The value of 'favNumber'.
      * @return This builder.
      */
    public com.eraira.User.Builder setFavNumber(java.lang.Integer value) {
      validate(fields()[1], value);
      this.favNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'favNumber' field has been set.
      * @return True if the 'favNumber' field has been set, false otherwise.
      */
    public boolean hasFavNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'favNumber' field.
      * @return This builder.
      */
    public com.eraira.User.Builder clearFavNumber() {
      favNumber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'aBigNumber' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getABigNumber() {
      return aBigNumber;
    }

    /**
      * Sets the value of the 'aBigNumber' field.
      * @param value The value of 'aBigNumber'.
      * @return This builder.
      */
    public com.eraira.User.Builder setABigNumber(java.nio.ByteBuffer value) {
      validate(fields()[2], value);
      this.aBigNumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'aBigNumber' field has been set.
      * @return True if the 'aBigNumber' field has been set, false otherwise.
      */
    public boolean hasABigNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'aBigNumber' field.
      * @return This builder.
      */
    public com.eraira.User.Builder clearABigNumber() {
      aBigNumber = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.userName = fieldSetFlags()[0] ? this.userName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.favNumber = fieldSetFlags()[1] ? this.favNumber : (java.lang.Integer) defaultValue(fields()[1]);
        record.aBigNumber = fieldSetFlags()[2] ? this.aBigNumber : (java.nio.ByteBuffer) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
