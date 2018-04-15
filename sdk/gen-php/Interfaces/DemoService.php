<?php
/**
 * Autogenerated by Thrift Compiler (0.9.2)-v1.0.1
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * THIS IS MODIFIED FOR ZAN GROUP, ANY PROBLEM PLS CONTACT Zan Group<zan@zanphp.io>
 * @generated
 */

namespace Com\Yourcompany\Demo\Interfaces;

interface DemoService {
  /**
   * @throws \Com\Yourcompany\Demo\Exception\DemoServiceException
   */
  public function throwException();
  /**
   */
  public function returnVoid();
  /**
   * @return bool
   */
  public function returnBool();
  /**
   * @return int
   */
  public function returnI32();
  /**
   * @return double
   */
  public function returnDouble();
  /**
   * @return string
   */
  public function returnString();
  /**
   * @return int
   */
  public function returnEnum();
  /**
   * @return \Com\Yourcompany\Demo\Entity\BaseStruct
   */
  public function returnBaseStruct();
  /**
   * @return \Com\Yourcompany\Demo\Entity\MixedStruct
   */
  public function returnMixedStruct();
  /**
   * @return \Com\Yourcompany\Demo\Entity\BaseStruct[]
   */
  public function returnList();
  /**
   * @return \Com\Yourcompany\Demo\Entity\BaseStruct[]
   */
  public function returnSet();
  /**
   * @return array
   */
  public function returnMap();
  /**
   * @param string $paraString
   * @param int $errorLevel
   */
  public function paraBaseNoReturn($paraString, $errorLevel);
  /**
   * @param bool $paraBool
   * @param int $paraI32
   * @param double $paraDouble
   * @param string $paraString
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct $baseStruct
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct[] $returnList
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct[] $returnSet
   * @param array $returnMap
   * @param int $errorLevel
   */
  public function paraMixedNoReturn($paraBool, $paraI32, $paraDouble, $paraString, \Com\Yourcompany\Demo\Entity\BaseStruct $baseStruct, array $returnList, array $returnSet, array $returnMap, $errorLevel);
  /**
   * @param bool $paraBool
   * @param int $paraI32
   * @param double $paraDouble
   * @param string $paraString
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct $baseStruct
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct[] $returnList
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct[] $returnSet
   * @param array $returnMap
   * @param int $errorLevel
   * @return array
   */
  public function complexMethod($paraBool, $paraI32, $paraDouble, $paraString, \Com\Yourcompany\Demo\Entity\BaseStruct $baseStruct, array $returnList, array $returnSet, array $returnMap, $errorLevel);
}
