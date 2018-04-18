/**
 * Autogenerated by Thrift Compiler (0.9.2)-v1.0.1
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * THIS IS MODIFIED FOR ZAN GROUP, ANY PROBLEM PLS CONTACT Zan Group<zan@zanphp.io>
 * @generated
 */
package com.Miaoju.device.entity;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)-v1.0.1", date = "2018-4-18")
public class MixedStruct implements org.apache.thrift.TBase<MixedStruct, MixedStruct._Fields>, java.io.Serializable, Cloneable, Comparable<MixedStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MixedStruct");

  private static final org.apache.thrift.protocol.TField PROP_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("propString", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BASE_STRUCT_FIELD_DESC = new org.apache.thrift.protocol.TField("baseStruct", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField PROP_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("propList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PROP_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("propSet", org.apache.thrift.protocol.TType.SET, (short)4);
  private static final org.apache.thrift.protocol.TField PROP_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("propMap", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MixedStructStandardSchemeFactory());
  }

  private String propString; // optional
  private com.Miaoju.device.entity.BaseStruct baseStruct; // optional
  private List<com.Miaoju.device.entity.BaseStruct> propList; // optional
  private Set<com.Miaoju.device.entity.BaseStruct> propSet; // optional
  private Map<String,com.Miaoju.device.entity.BaseStruct> propMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROP_STRING((short)1, "propString"),
    BASE_STRUCT((short)2, "baseStruct"),
    PROP_LIST((short)3, "propList"),
    PROP_SET((short)4, "propSet"),
    PROP_MAP((short)5, "propMap");

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
        case 1: // PROP_STRING
          return PROP_STRING;
        case 2: // BASE_STRUCT
          return BASE_STRUCT;
        case 3: // PROP_LIST
          return PROP_LIST;
        case 4: // PROP_SET
          return PROP_SET;
        case 5: // PROP_MAP
          return PROP_MAP;
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
  private static final _Fields optionals[] = {_Fields.PROP_STRING,_Fields.BASE_STRUCT,_Fields.PROP_LIST,_Fields.PROP_SET,_Fields.PROP_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROP_STRING, new org.apache.thrift.meta_data.FieldMetaData("propString", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BASE_STRUCT, new org.apache.thrift.meta_data.FieldMetaData("baseStruct", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.Miaoju.device.entity.BaseStruct.class)));
    tmpMap.put(_Fields.PROP_LIST, new org.apache.thrift.meta_data.FieldMetaData("propList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.Miaoju.device.entity.BaseStruct.class))));
    tmpMap.put(_Fields.PROP_SET, new org.apache.thrift.meta_data.FieldMetaData("propSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.Miaoju.device.entity.BaseStruct.class))));
    tmpMap.put(_Fields.PROP_MAP, new org.apache.thrift.meta_data.FieldMetaData("propMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.Miaoju.device.entity.BaseStruct.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MixedStruct.class, metaDataMap);
  }

  public MixedStruct() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MixedStruct(MixedStruct other) {
    if (other.isSetPropString()) {
      this.propString = other.propString;
    }
    if (other.isSetBaseStruct()) {
      this.baseStruct = new com.Miaoju.device.entity.BaseStruct(other.baseStruct);
    }
    if (other.isSetPropList()) {
      List<com.Miaoju.device.entity.BaseStruct> __this__propList = new ArrayList<com.Miaoju.device.entity.BaseStruct>(other.propList.size());
      for (com.Miaoju.device.entity.BaseStruct other_element : other.propList) {
        __this__propList.add(new com.Miaoju.device.entity.BaseStruct(other_element));
      }
      this.propList = __this__propList;
    }
    if (other.isSetPropSet()) {
      Set<com.Miaoju.device.entity.BaseStruct> __this__propSet = new HashSet<com.Miaoju.device.entity.BaseStruct>(other.propSet.size());
      for (com.Miaoju.device.entity.BaseStruct other_element : other.propSet) {
        __this__propSet.add(new com.Miaoju.device.entity.BaseStruct(other_element));
      }
      this.propSet = __this__propSet;
    }
    if (other.isSetPropMap()) {
      Map<String,com.Miaoju.device.entity.BaseStruct> __this__propMap = new HashMap<String,com.Miaoju.device.entity.BaseStruct>(other.propMap.size());
      for (Map.Entry<String, com.Miaoju.device.entity.BaseStruct> other_element : other.propMap.entrySet()) {

        String other_element_key = other_element.getKey();
        com.Miaoju.device.entity.BaseStruct other_element_value = other_element.getValue();

        String __this__propMap_copy_key = other_element_key;

        com.Miaoju.device.entity.BaseStruct __this__propMap_copy_value = new com.Miaoju.device.entity.BaseStruct(other_element_value);

        __this__propMap.put(__this__propMap_copy_key, __this__propMap_copy_value);
      }
      this.propMap = __this__propMap;
    }
  }

  public MixedStruct deepCopy() {
    return new MixedStruct(this);
  }

  @Override
  public void clear() {
    setPropStringIsSet(false);
    this.propString = null;
    setBaseStructIsSet(false);
    this.baseStruct = null;
    setPropListIsSet(false);
    this.propList = null;
    setPropSetIsSet(false);
    this.propSet = null;
    setPropMapIsSet(false);
    this.propMap = null;
  }

  public String getPropString() {
    return this.propString;
  }

  public MixedStruct setPropString(String propString) {
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

  public com.Miaoju.device.entity.BaseStruct getBaseStruct() {
    return this.baseStruct;
  }

  public MixedStruct setBaseStruct(com.Miaoju.device.entity.BaseStruct baseStruct) {
    this.baseStruct = baseStruct;
    if (baseStruct != null) {
      setBaseStructIsSet(true);
    } else {
      unsetBaseStruct();
    }
    return this;
  }

  public void unsetBaseStruct() {
    this.baseStruct = null;
  }

  /** Returns true if field baseStruct is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseStruct() {
    return this.baseStruct != null;
  }

  public void setBaseStructIsSet(boolean value) {
    if (!value) {
      this.baseStruct = null;
    }
  }

  public int getPropListSize() {
    return (this.propList == null) ? 0 : this.propList.size();
  }

  public java.util.Iterator<com.Miaoju.device.entity.BaseStruct> getPropListIterator() {
    return (this.propList == null) ? null : this.propList.iterator();
  }

  public void addToPropList(com.Miaoju.device.entity.BaseStruct elem) {
    if (this.propList == null) {
      this.propList = new ArrayList<com.Miaoju.device.entity.BaseStruct>();
    }
    this.propList.add(elem);
  }

  public List<com.Miaoju.device.entity.BaseStruct> getPropList() {
    return this.propList;
  }

  public MixedStruct setPropList(List<com.Miaoju.device.entity.BaseStruct> propList) {
    this.propList = propList;
    if (propList != null) {
      setPropListIsSet(true);
    } else {
      unsetPropList();
    }
    return this;
  }

  public void unsetPropList() {
    this.propList = null;
  }

  /** Returns true if field propList is set (has been assigned a value) and false otherwise */
  public boolean isSetPropList() {
    return this.propList != null;
  }

  public void setPropListIsSet(boolean value) {
    if (!value) {
      this.propList = null;
    }
  }

  public int getPropSetSize() {
    return (this.propSet == null) ? 0 : this.propSet.size();
  }

  public java.util.Iterator<com.Miaoju.device.entity.BaseStruct> getPropSetIterator() {
    return (this.propSet == null) ? null : this.propSet.iterator();
  }

  public void addToPropSet(com.Miaoju.device.entity.BaseStruct elem) {
    if (this.propSet == null) {
      this.propSet = new HashSet<com.Miaoju.device.entity.BaseStruct>();
    }
    this.propSet.add(elem);
  }

  public Set<com.Miaoju.device.entity.BaseStruct> getPropSet() {
    return this.propSet;
  }

  public MixedStruct setPropSet(Set<com.Miaoju.device.entity.BaseStruct> propSet) {
    this.propSet = propSet;
    if (propSet != null) {
      setPropSetIsSet(true);
    } else {
      unsetPropSet();
    }
    return this;
  }

  public void unsetPropSet() {
    this.propSet = null;
  }

  /** Returns true if field propSet is set (has been assigned a value) and false otherwise */
  public boolean isSetPropSet() {
    return this.propSet != null;
  }

  public void setPropSetIsSet(boolean value) {
    if (!value) {
      this.propSet = null;
    }
  }

  public int getPropMapSize() {
    return (this.propMap == null) ? 0 : this.propMap.size();
  }

  public void putToPropMap(String key, com.Miaoju.device.entity.BaseStruct val) {
    if (this.propMap == null) {
      this.propMap = new HashMap<String,com.Miaoju.device.entity.BaseStruct>();
    }
    this.propMap.put(key, val);
  }

  public Map<String,com.Miaoju.device.entity.BaseStruct> getPropMap() {
    return this.propMap;
  }

  public MixedStruct setPropMap(Map<String,com.Miaoju.device.entity.BaseStruct> propMap) {
    this.propMap = propMap;
    if (propMap != null) {
      setPropMapIsSet(true);
    } else {
      unsetPropMap();
    }
    return this;
  }

  public void unsetPropMap() {
    this.propMap = null;
  }

  /** Returns true if field propMap is set (has been assigned a value) and false otherwise */
  public boolean isSetPropMap() {
    return this.propMap != null;
  }

  public void setPropMapIsSet(boolean value) {
    if (!value) {
      this.propMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROP_STRING:
      if (value == null) {
        unsetPropString();
      } else {
        setPropString((String)value);
      }
      break;

    case BASE_STRUCT:
      if (value == null) {
        unsetBaseStruct();
      } else {
        setBaseStruct((com.Miaoju.device.entity.BaseStruct)value);
      }
      break;

    case PROP_LIST:
      if (value == null) {
        unsetPropList();
      } else {
        setPropList((List<com.Miaoju.device.entity.BaseStruct>)value);
      }
      break;

    case PROP_SET:
      if (value == null) {
        unsetPropSet();
      } else {
        setPropSet((Set<com.Miaoju.device.entity.BaseStruct>)value);
      }
      break;

    case PROP_MAP:
      if (value == null) {
        unsetPropMap();
      } else {
        setPropMap((Map<String,com.Miaoju.device.entity.BaseStruct>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROP_STRING:
      if (getPropString() != null) {
        return getPropString();

      }
      return null;
    case BASE_STRUCT:
      if (getBaseStruct() != null) {
        return getBaseStruct();

      }
      return null;
    case PROP_LIST:
      if (getPropList() != null) {
        return getPropList();

      }
      return null;
    case PROP_SET:
      if (getPropSet() != null) {
        return getPropSet();

      }
      return null;
    case PROP_MAP:
      if (getPropMap() != null) {
        return getPropMap();

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
    case PROP_STRING:
      return isSetPropString();
    case BASE_STRUCT:
      return isSetBaseStruct();
    case PROP_LIST:
      return isSetPropList();
    case PROP_SET:
      return isSetPropSet();
    case PROP_MAP:
      return isSetPropMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MixedStruct)
      return this.equals((MixedStruct)that);
    return false;
  }

  public boolean equals(MixedStruct that) {
    if (that == null)
      return false;

    boolean this_present_propString = true && this.isSetPropString();
    boolean that_present_propString = true && that.isSetPropString();
    if (this_present_propString || that_present_propString) {
      if (!(this_present_propString && that_present_propString))
        return false;
      if (!this.propString.equals(that.propString))
        return false;
    }

    boolean this_present_baseStruct = true && this.isSetBaseStruct();
    boolean that_present_baseStruct = true && that.isSetBaseStruct();
    if (this_present_baseStruct || that_present_baseStruct) {
      if (!(this_present_baseStruct && that_present_baseStruct))
        return false;
      if (!this.baseStruct.equals(that.baseStruct))
        return false;
    }

    boolean this_present_propList = true && this.isSetPropList();
    boolean that_present_propList = true && that.isSetPropList();
    if (this_present_propList || that_present_propList) {
      if (!(this_present_propList && that_present_propList))
        return false;
      if (!this.propList.equals(that.propList))
        return false;
    }

    boolean this_present_propSet = true && this.isSetPropSet();
    boolean that_present_propSet = true && that.isSetPropSet();
    if (this_present_propSet || that_present_propSet) {
      if (!(this_present_propSet && that_present_propSet))
        return false;
      if (!this.propSet.equals(that.propSet))
        return false;
    }

    boolean this_present_propMap = true && this.isSetPropMap();
    boolean that_present_propMap = true && that.isSetPropMap();
    if (this_present_propMap || that_present_propMap) {
      if (!(this_present_propMap && that_present_propMap))
        return false;
      if (!this.propMap.equals(that.propMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_propString = true && (isSetPropString());
    list.add(present_propString);
    if (present_propString)
      list.add(propString);

    boolean present_baseStruct = true && (isSetBaseStruct());
    list.add(present_baseStruct);
    if (present_baseStruct)
      list.add(baseStruct);

    boolean present_propList = true && (isSetPropList());
    list.add(present_propList);
    if (present_propList)
      list.add(propList);

    boolean present_propSet = true && (isSetPropSet());
    list.add(present_propSet);
    if (present_propSet)
      list.add(propSet);

    boolean present_propMap = true && (isSetPropMap());
    list.add(present_propMap);
    if (present_propMap)
      list.add(propMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(MixedStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetBaseStruct()).compareTo(other.isSetBaseStruct());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseStruct()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.baseStruct, other.baseStruct);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropList()).compareTo(other.isSetPropList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propList, other.propList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropSet()).compareTo(other.isSetPropSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propSet, other.propSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropMap()).compareTo(other.isSetPropMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propMap, other.propMap);
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
    StringBuilder sb = new StringBuilder("MixedStruct(");
    boolean first = true;

    if (isSetPropString()) {
      sb.append("propString:");
      if (this.propString == null) {
        sb.append("null");
      } else {
        sb.append(this.propString);
      }
      first = false;
    }
    if (isSetBaseStruct()) {
      if (!first) sb.append(", ");
      sb.append("baseStruct:");
      if (this.baseStruct == null) {
        sb.append("null");
      } else {
        sb.append(this.baseStruct);
      }
      first = false;
    }
    if (isSetPropList()) {
      if (!first) sb.append(", ");
      sb.append("propList:");
      if (this.propList == null) {
        sb.append("null");
      } else {
        sb.append(this.propList);
      }
      first = false;
    }
    if (isSetPropSet()) {
      if (!first) sb.append(", ");
      sb.append("propSet:");
      if (this.propSet == null) {
        sb.append("null");
      } else {
        sb.append(this.propSet);
      }
      first = false;
    }
    if (isSetPropMap()) {
      if (!first) sb.append(", ");
      sb.append("propMap:");
      if (this.propMap == null) {
        sb.append("null");
      } else {
        sb.append(this.propMap);
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
    if (baseStruct != null) {
      baseStruct.validate();
    }
  }

  private static class MixedStructStandardSchemeFactory implements SchemeFactory {
    public MixedStructStandardScheme getScheme() {
      return new MixedStructStandardScheme();
    }
  }

  private static class MixedStructStandardScheme extends StandardScheme<MixedStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MixedStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROP_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.propString = iprot.readString();
              struct.setPropStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BASE_STRUCT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.baseStruct = new com.Miaoju.device.entity.BaseStruct();
              struct.baseStruct.read(iprot);
              struct.setBaseStructIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROP_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.propList = new ArrayList<com.Miaoju.device.entity.BaseStruct>(_list0.size);
                com.Miaoju.device.entity.BaseStruct _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new com.Miaoju.device.entity.BaseStruct();
                  _elem1.read(iprot);
                  struct.propList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setPropListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROP_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set3 = iprot.readSetBegin();
                struct.propSet = new HashSet<com.Miaoju.device.entity.BaseStruct>(2*_set3.size);
                com.Miaoju.device.entity.BaseStruct _elem4;
                for (int _i5 = 0; _i5 < _set3.size; ++_i5)
                {
                  _elem4 = new com.Miaoju.device.entity.BaseStruct();
                  _elem4.read(iprot);
                  struct.propSet.add(_elem4);
                }
                iprot.readSetEnd();
              }
              struct.setPropSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PROP_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map6 = iprot.readMapBegin();
                struct.propMap = new HashMap<String,com.Miaoju.device.entity.BaseStruct>(2*_map6.size);
                String _key7;
                com.Miaoju.device.entity.BaseStruct _val8;
                for (int _i9 = 0; _i9 < _map6.size; ++_i9)
                {
                  _key7 = iprot.readString();
                  _val8 = new com.Miaoju.device.entity.BaseStruct();
                  _val8.read(iprot);
                  struct.propMap.put(_key7, _val8);
                }
                iprot.readMapEnd();
              }
              struct.setPropMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MixedStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPropString()) {
        oprot.writeFieldBegin(PROP_STRING_FIELD_DESC);
        oprot.writeString(struct.propString);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBaseStruct()) {
        oprot.writeFieldBegin(BASE_STRUCT_FIELD_DESC);
        struct.baseStruct.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropList()) {
        oprot.writeFieldBegin(PROP_LIST_FIELD_DESC);
        {
          int _isize11 = 0;
          for (com.Miaoju.device.entity.BaseStruct _iter10 : struct.propList)
          {
            if (_iter10 != null ) 
            {
              _isize11++;
            }
          }
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _isize11));
          for (com.Miaoju.device.entity.BaseStruct _iter10 : struct.propList)
          {
            if (_iter10 != null ) {
              _iter10.write(oprot);
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropSet()) {
        oprot.writeFieldBegin(PROP_SET_FIELD_DESC);
        {
          int _isize13 = 0;
          for (com.Miaoju.device.entity.BaseStruct _iter12 : struct.propSet)
          {
            if (_iter12 != null ) 
            {
              _isize13++;
            }
          }
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, _isize13));
          for (com.Miaoju.device.entity.BaseStruct _iter12 : struct.propSet)
          {
            if (_iter12 != null ) {
          _iter12.write(oprot);
            }
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetPropMap()) {
        oprot.writeFieldBegin(PROP_MAP_FIELD_DESC);
        {
          int _isize15 = 0;
          for (Map.Entry<String, com.Miaoju.device.entity.BaseStruct> _iter14 : struct.propMap.entrySet())

          {
            if (_iter14 != null &&_iter14.getValue() != null ) 
            {
              _isize15++;
            }
          }
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, _isize15));
          for (Map.Entry<String, com.Miaoju.device.entity.BaseStruct> _iter14 : struct.propMap.entrySet())
          {
            if (_iter14 != null && _iter14.getValue() != null) {
          oprot.writeString(_iter14.getKey());
          _iter14.getValue().write(oprot);
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

