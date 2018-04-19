/**
 * Autogenerated by Thrift Compiler (0.9.2)-v1.0.1
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * THIS IS MODIFIED FOR ZAN GROUP, ANY PROBLEM PLS CONTACT Zan Group<zan@zanphp.io>
 * @generated
 */
package com.miaoju.device.entity;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)-v1.0.1", date = "2018-4-19")
public class BaseStruct implements org.apache.thrift.TBase<BaseStruct, BaseStruct._Fields>, java.io.Serializable, Cloneable, Comparable<BaseStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BaseStruct");

  private static final org.apache.thrift.protocol.TField PROP_BOOL_FIELD_DESC = new org.apache.thrift.protocol.TField("propBool", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField PROP_BYTE_FIELD_DESC = new org.apache.thrift.protocol.TField("propByte", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField PROP_I16_FIELD_DESC = new org.apache.thrift.protocol.TField("propI16", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField PROP_I32_FIELD_DESC = new org.apache.thrift.protocol.TField("propI32", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField PROP_I64_FIELD_DESC = new org.apache.thrift.protocol.TField("propI64", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField PROP_DOUBLE_FIELD_DESC = new org.apache.thrift.protocol.TField("propDouble", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField PROP_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("propString", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField ERROR_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("errorLevel", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BaseStructStandardSchemeFactory());
  }

  private Boolean propBool; // optional
  private Byte propByte; // optional
  private Short propI16; // optional
  private Integer propI32; // optional
  private Long propI64; // optional
  private Double propDouble; // optional
  private String propString; // optional
  /**
   * 
   * @see com.miaoju.device.entity.ErrorLevel
   */
  private com.miaoju.device.entity.ErrorLevel errorLevel; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROP_BOOL((short)1, "propBool"),
    PROP_BYTE((short)2, "propByte"),
    PROP_I16((short)3, "propI16"),
    PROP_I32((short)4, "propI32"),
    PROP_I64((short)5, "propI64"),
    PROP_DOUBLE((short)6, "propDouble"),
    PROP_STRING((short)7, "propString"),
    /**
     * 
     * @see com.miaoju.device.entity.ErrorLevel
     */
    ERROR_LEVEL((short)8, "errorLevel");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROP_BOOL
          return PROP_BOOL;
        case 2: // PROP_BYTE
          return PROP_BYTE;
        case 3: // PROP_I16
          return PROP_I16;
        case 4: // PROP_I32
          return PROP_I32;
        case 5: // PROP_I64
          return PROP_I64;
        case 6: // PROP_DOUBLE
          return PROP_DOUBLE;
        case 7: // PROP_STRING
          return PROP_STRING;
        case 8: // ERROR_LEVEL
          return ERROR_LEVEL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PROPBOOL_ISSET_ID = 0;
  private static final int __PROPBYTE_ISSET_ID = 1;
  private static final int __PROPI16_ISSET_ID = 2;
  private static final int __PROPI32_ISSET_ID = 3;
  private static final int __PROPI64_ISSET_ID = 4;
  private static final int __PROPDOUBLE_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PROP_BOOL,_Fields.PROP_BYTE,_Fields.PROP_I16,_Fields.PROP_I32,_Fields.PROP_I64,_Fields.PROP_DOUBLE,_Fields.PROP_STRING,_Fields.ERROR_LEVEL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROP_BOOL, new org.apache.thrift.meta_data.FieldMetaData("propBool", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PROP_BYTE, new org.apache.thrift.meta_data.FieldMetaData("propByte", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.PROP_I16, new org.apache.thrift.meta_data.FieldMetaData("propI16", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.PROP_I32, new org.apache.thrift.meta_data.FieldMetaData("propI32", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PROP_I64, new org.apache.thrift.meta_data.FieldMetaData("propI64", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PROP_DOUBLE, new org.apache.thrift.meta_data.FieldMetaData("propDouble", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.PROP_STRING, new org.apache.thrift.meta_data.FieldMetaData("propString", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("errorLevel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.miaoju.device.entity.ErrorLevel.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BaseStruct.class, metaDataMap);
  }

  public BaseStruct() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BaseStruct(BaseStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    this.propBool = other.propBool;
    this.propByte = other.propByte;
    this.propI16 = other.propI16;
    this.propI32 = other.propI32;
    this.propI64 = other.propI64;
    this.propDouble = other.propDouble;
    if (other.isSetPropString()) {
      this.propString = other.propString;
    }
    if (other.isSetErrorLevel()) {
      this.errorLevel = other.errorLevel;
    }
  }

  public BaseStruct deepCopy() {
    return new BaseStruct(this);
  }

  @Override
  public void clear() {
    setPropBoolIsSet(false);
    this.propBool = null;
    setPropByteIsSet(false);
    this.propByte = null;
    setPropI16IsSet(false);
    this.propI16 = null;
    setPropI32IsSet(false);
    this.propI32 = null;
    setPropI64IsSet(false);
    this.propI64 = null;
    setPropDoubleIsSet(false);
    this.propDouble = null;
    setPropStringIsSet(false);
    this.propString = null;
    setErrorLevelIsSet(false);
    this.errorLevel = null;
  }

  public Boolean isPropBool() {
    return this.propBool;
  }

  public BaseStruct setPropBool(Boolean propBool) {
    this.propBool = propBool;
    if (propBool != null) {
      setPropBoolIsSet(true);
    } else {
      unsetPropBool();
    }
    return this;
  }

  public void unsetPropBool() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROPBOOL_ISSET_ID);
  }

  /** Returns true if field propBool is set (has been assigned a value) and false otherwise */
  public boolean isSetPropBool() {
    return EncodingUtils.testBit(__isset_bitfield, __PROPBOOL_ISSET_ID);
  }

  public void setPropBoolIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROPBOOL_ISSET_ID, value);
  }

  public Byte getPropByte() {
    return this.propByte;
  }

  public BaseStruct setPropByte(Byte propByte) {
    this.propByte = propByte;
    if (propByte != null) {
      setPropByteIsSet(true);
    } else {
      unsetPropByte();
    }
    return this;
  }

  public void unsetPropByte() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROPBYTE_ISSET_ID);
  }

  /** Returns true if field propByte is set (has been assigned a value) and false otherwise */
  public boolean isSetPropByte() {
    return EncodingUtils.testBit(__isset_bitfield, __PROPBYTE_ISSET_ID);
  }

  public void setPropByteIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROPBYTE_ISSET_ID, value);
  }

  public Short getPropI16() {
    return this.propI16;
  }

  public BaseStruct setPropI16(Short propI16) {
    this.propI16 = propI16;
    if (propI16 != null) {
      setPropI16IsSet(true);
    } else {
      unsetPropI16();
    }
    return this;
  }

  public void unsetPropI16() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROPI16_ISSET_ID);
  }

  /** Returns true if field propI16 is set (has been assigned a value) and false otherwise */
  public boolean isSetPropI16() {
    return EncodingUtils.testBit(__isset_bitfield, __PROPI16_ISSET_ID);
  }

  public void setPropI16IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROPI16_ISSET_ID, value);
  }

  public Integer getPropI32() {
    return this.propI32;
  }

  public BaseStruct setPropI32(Integer propI32) {
    this.propI32 = propI32;
    if (propI32 != null) {
      setPropI32IsSet(true);
    } else {
      unsetPropI32();
    }
    return this;
  }

  public void unsetPropI32() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROPI32_ISSET_ID);
  }

  /** Returns true if field propI32 is set (has been assigned a value) and false otherwise */
  public boolean isSetPropI32() {
    return EncodingUtils.testBit(__isset_bitfield, __PROPI32_ISSET_ID);
  }

  public void setPropI32IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROPI32_ISSET_ID, value);
  }

  public Long getPropI64() {
    return this.propI64;
  }

  public BaseStruct setPropI64(Long propI64) {
    this.propI64 = propI64;
    if (propI64 != null) {
      setPropI64IsSet(true);
    } else {
      unsetPropI64();
    }
    return this;
  }

  public void unsetPropI64() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROPI64_ISSET_ID);
  }

  /** Returns true if field propI64 is set (has been assigned a value) and false otherwise */
  public boolean isSetPropI64() {
    return EncodingUtils.testBit(__isset_bitfield, __PROPI64_ISSET_ID);
  }

  public void setPropI64IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROPI64_ISSET_ID, value);
  }

  public Double getPropDouble() {
    return this.propDouble;
  }

  public BaseStruct setPropDouble(Double propDouble) {
    this.propDouble = propDouble;
    if (propDouble != null) {
      setPropDoubleIsSet(true);
    } else {
      unsetPropDouble();
    }
    return this;
  }

  public void unsetPropDouble() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROPDOUBLE_ISSET_ID);
  }

  /** Returns true if field propDouble is set (has been assigned a value) and false otherwise */
  public boolean isSetPropDouble() {
    return EncodingUtils.testBit(__isset_bitfield, __PROPDOUBLE_ISSET_ID);
  }

  public void setPropDoubleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROPDOUBLE_ISSET_ID, value);
  }

  public String getPropString() {
    return this.propString;
  }

  public BaseStruct setPropString(String propString) {
    this.propString = propString;
    if (propString != null) {
      setPropStringIsSet(true);
    } else {
      unsetPropString();
    }
    return this;
  }

  public void unsetPropString() {
    this.propString = null;
  }

  /** Returns true if field propString is set (has been assigned a value) and false otherwise */
  public boolean isSetPropString() {
    return this.propString != null;
  }

  public void setPropStringIsSet(boolean value) {
    if (!value) {
      this.propString = null;
    }
  }

  /**
   * 
   * @see com.miaoju.device.entity.ErrorLevel
   */
  public com.miaoju.device.entity.ErrorLevel getErrorLevel() {
    return this.errorLevel;
  }

  /**
   * 
   * @see com.miaoju.device.entity.ErrorLevel
   */
  public BaseStruct setErrorLevel(com.miaoju.device.entity.ErrorLevel errorLevel) {
    this.errorLevel = errorLevel;
    if (errorLevel != null) {
      setErrorLevelIsSet(true);
    } else {
      unsetErrorLevel();
    }
    return this;
  }

  public void unsetErrorLevel() {
    this.errorLevel = null;
  }

  /** Returns true if field errorLevel is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorLevel() {
    return this.errorLevel != null;
  }

  public void setErrorLevelIsSet(boolean value) {
    if (!value) {
      this.errorLevel = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROP_BOOL:
      if (value == null) {
        unsetPropBool();
      } else {
        setPropBool((Boolean)value);
      }
      break;

    case PROP_BYTE:
      if (value == null) {
        unsetPropByte();
      } else {
        setPropByte((Byte)value);
      }
      break;

    case PROP_I16:
      if (value == null) {
        unsetPropI16();
      } else {
        setPropI16((Short)value);
      }
      break;

    case PROP_I32:
      if (value == null) {
        unsetPropI32();
      } else {
        setPropI32((Integer)value);
      }
      break;

    case PROP_I64:
      if (value == null) {
        unsetPropI64();
      } else {
        setPropI64((Long)value);
      }
      break;

    case PROP_DOUBLE:
      if (value == null) {
        unsetPropDouble();
      } else {
        setPropDouble((Double)value);
      }
      break;

    case PROP_STRING:
      if (value == null) {
        unsetPropString();
      } else {
        setPropString((String)value);
      }
      break;

    case ERROR_LEVEL:
      if (value == null) {
        unsetErrorLevel();
      } else {
        setErrorLevel((com.miaoju.device.entity.ErrorLevel)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROP_BOOL:
      if (isPropBool() != null) {
        return Boolean.valueOf(isPropBool());
      }
      return null;
    case PROP_BYTE:
      if (getPropByte() != null) {
        return Byte.valueOf(getPropByte());
      }
      return null;
    case PROP_I16:
      if (getPropI16() != null) {
        return Short.valueOf(getPropI16());
      }
      return null;
    case PROP_I32:
      if (getPropI32() != null) {
        return Integer.valueOf(getPropI32());
      }
      return null;
    case PROP_I64:
      if (getPropI64() != null) {
        return Long.valueOf(getPropI64());
      }
      return null;
    case PROP_DOUBLE:
      if (getPropDouble() != null) {
        return Double.valueOf(getPropDouble());
      }
      return null;
    case PROP_STRING:
      if (getPropString() != null) {
        return getPropString();

      }
      return null;
    case ERROR_LEVEL:
      if (getErrorLevel() != null) {
        return getErrorLevel();

      }
      return null;
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROP_BOOL:
      return isSetPropBool();
    case PROP_BYTE:
      return isSetPropByte();
    case PROP_I16:
      return isSetPropI16();
    case PROP_I32:
      return isSetPropI32();
    case PROP_I64:
      return isSetPropI64();
    case PROP_DOUBLE:
      return isSetPropDouble();
    case PROP_STRING:
      return isSetPropString();
    case ERROR_LEVEL:
      return isSetErrorLevel();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BaseStruct)
      return this.equals((BaseStruct)that);
    return false;
  }

  public boolean equals(BaseStruct that) {
    if (that == null)
      return false;

    boolean this_present_propBool = true && this.isSetPropBool();
    boolean that_present_propBool = true && that.isSetPropBool();
    if (this_present_propBool || that_present_propBool) {
      if (!(this_present_propBool && that_present_propBool))
        return false;
      if (!this.propBool.equals(that.propBool))
        return false;
    }

    boolean this_present_propByte = true && this.isSetPropByte();
    boolean that_present_propByte = true && that.isSetPropByte();
    if (this_present_propByte || that_present_propByte) {
      if (!(this_present_propByte && that_present_propByte))
        return false;
      if (!this.propByte.equals(that.propByte))
        return false;
    }

    boolean this_present_propI16 = true && this.isSetPropI16();
    boolean that_present_propI16 = true && that.isSetPropI16();
    if (this_present_propI16 || that_present_propI16) {
      if (!(this_present_propI16 && that_present_propI16))
        return false;
      if (!this.propI16.equals(that.propI16))
        return false;
    }

    boolean this_present_propI32 = true && this.isSetPropI32();
    boolean that_present_propI32 = true && that.isSetPropI32();
    if (this_present_propI32 || that_present_propI32) {
      if (!(this_present_propI32 && that_present_propI32))
        return false;
      if (!this.propI32.equals(that.propI32))
        return false;
    }

    boolean this_present_propI64 = true && this.isSetPropI64();
    boolean that_present_propI64 = true && that.isSetPropI64();
    if (this_present_propI64 || that_present_propI64) {
      if (!(this_present_propI64 && that_present_propI64))
        return false;
      if (!this.propI64.equals(that.propI64))
        return false;
    }

    boolean this_present_propDouble = true && this.isSetPropDouble();
    boolean that_present_propDouble = true && that.isSetPropDouble();
    if (this_present_propDouble || that_present_propDouble) {
      if (!(this_present_propDouble && that_present_propDouble))
        return false;
      if (!this.propDouble.equals(that.propDouble))
        return false;
    }

    boolean this_present_propString = true && this.isSetPropString();
    boolean that_present_propString = true && that.isSetPropString();
    if (this_present_propString || that_present_propString) {
      if (!(this_present_propString && that_present_propString))
        return false;
      if (!this.propString.equals(that.propString))
        return false;
    }

    boolean this_present_errorLevel = true && this.isSetErrorLevel();
    boolean that_present_errorLevel = true && that.isSetErrorLevel();
    if (this_present_errorLevel || that_present_errorLevel) {
      if (!(this_present_errorLevel && that_present_errorLevel))
        return false;
      if (!this.errorLevel.equals(that.errorLevel))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_propBool = true && (isSetPropBool());
    list.add(present_propBool);
    if (present_propBool)
      list.add(propBool);

    boolean present_propByte = true && (isSetPropByte());
    list.add(present_propByte);
    if (present_propByte)
      list.add(propByte);

    boolean present_propI16 = true && (isSetPropI16());
    list.add(present_propI16);
    if (present_propI16)
      list.add(propI16);

    boolean present_propI32 = true && (isSetPropI32());
    list.add(present_propI32);
    if (present_propI32)
      list.add(propI32);

    boolean present_propI64 = true && (isSetPropI64());
    list.add(present_propI64);
    if (present_propI64)
      list.add(propI64);

    boolean present_propDouble = true && (isSetPropDouble());
    list.add(present_propDouble);
    if (present_propDouble)
      list.add(propDouble);

    boolean present_propString = true && (isSetPropString());
    list.add(present_propString);
    if (present_propString)
      list.add(propString);

    boolean present_errorLevel = true && (isSetErrorLevel());
    list.add(present_errorLevel);
    if (present_errorLevel)
      list.add(errorLevel.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(BaseStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPropBool()).compareTo(other.isSetPropBool());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropBool()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propBool, other.propBool);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropByte()).compareTo(other.isSetPropByte());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropByte()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propByte, other.propByte);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropI16()).compareTo(other.isSetPropI16());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropI16()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propI16, other.propI16);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropI32()).compareTo(other.isSetPropI32());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropI32()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propI32, other.propI32);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropI64()).compareTo(other.isSetPropI64());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropI64()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propI64, other.propI64);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropDouble()).compareTo(other.isSetPropDouble());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropDouble()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propDouble, other.propDouble);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropString()).compareTo(other.isSetPropString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propString, other.propString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorLevel()).compareTo(other.isSetErrorLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorLevel, other.errorLevel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BaseStruct(");
    boolean first = true;

    if (isSetPropBool()) {
      sb.append("propBool:");
      if (this.propBool == null) {
        sb.append("null");
      } else {
        sb.append(this.propBool);
      }
      first = false;
    }
    if (isSetPropByte()) {
      if (!first) sb.append(", ");
      sb.append("propByte:");
      if (this.propByte == null) {
        sb.append("null");
      } else {
        sb.append(this.propByte);
      }
      first = false;
    }
    if (isSetPropI16()) {
      if (!first) sb.append(", ");
      sb.append("propI16:");
      if (this.propI16 == null) {
        sb.append("null");
      } else {
        sb.append(this.propI16);
      }
      first = false;
    }
    if (isSetPropI32()) {
      if (!first) sb.append(", ");
      sb.append("propI32:");
      if (this.propI32 == null) {
        sb.append("null");
      } else {
        sb.append(this.propI32);
      }
      first = false;
    }
    if (isSetPropI64()) {
      if (!first) sb.append(", ");
      sb.append("propI64:");
      if (this.propI64 == null) {
        sb.append("null");
      } else {
        sb.append(this.propI64);
      }
      first = false;
    }
    if (isSetPropDouble()) {
      if (!first) sb.append(", ");
      sb.append("propDouble:");
      if (this.propDouble == null) {
        sb.append("null");
      } else {
        sb.append(this.propDouble);
      }
      first = false;
    }
    if (isSetPropString()) {
      if (!first) sb.append(", ");
      sb.append("propString:");
      if (this.propString == null) {
        sb.append("null");
      } else {
        sb.append(this.propString);
      }
      first = false;
    }
    if (isSetErrorLevel()) {
      if (!first) sb.append(", ");
      sb.append("errorLevel:");
      if (this.errorLevel == null) {
        sb.append("null");
      } else {
        sb.append(this.errorLevel);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  // check for args
  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private static class BaseStructStandardSchemeFactory implements SchemeFactory {
    public BaseStructStandardScheme getScheme() {
      return new BaseStructStandardScheme();
    }
  }

  private static class BaseStructStandardScheme extends StandardScheme<BaseStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BaseStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROP_BOOL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.propBool = iprot.readBool();
              struct.setPropBoolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROP_BYTE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.propByte = iprot.readByte();
              struct.setPropByteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROP_I16
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.propI16 = iprot.readI16();
              struct.setPropI16IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROP_I32
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.propI32 = iprot.readI32();
              struct.setPropI32IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PROP_I64
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.propI64 = iprot.readI64();
              struct.setPropI64IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROP_DOUBLE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.propDouble = iprot.readDouble();
              struct.setPropDoubleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PROP_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.propString = iprot.readString();
              struct.setPropStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // ERROR_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorLevel = com.miaoju.device.entity.ErrorLevel.findByValue(iprot.readI32());
              struct.setErrorLevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BaseStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPropBool()) {
        oprot.writeFieldBegin(PROP_BOOL_FIELD_DESC);
        oprot.writeBool(struct.propBool);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropByte()) {
        oprot.writeFieldBegin(PROP_BYTE_FIELD_DESC);
        oprot.writeByte(struct.propByte);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropI16()) {
        oprot.writeFieldBegin(PROP_I16_FIELD_DESC);
        oprot.writeI16(struct.propI16);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropI32()) {
        oprot.writeFieldBegin(PROP_I32_FIELD_DESC);
        oprot.writeI32(struct.propI32);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropI64()) {
        oprot.writeFieldBegin(PROP_I64_FIELD_DESC);
        oprot.writeI64(struct.propI64);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropDouble()) {
        oprot.writeFieldBegin(PROP_DOUBLE_FIELD_DESC);
        oprot.writeDouble(struct.propDouble);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropString()) {
        oprot.writeFieldBegin(PROP_STRING_FIELD_DESC);
        oprot.writeString(struct.propString);
        oprot.writeFieldEnd();
      }
      if (struct.isSetErrorLevel()) {
        oprot.writeFieldBegin(ERROR_LEVEL_FIELD_DESC);
        oprot.writeI32(struct.errorLevel.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

